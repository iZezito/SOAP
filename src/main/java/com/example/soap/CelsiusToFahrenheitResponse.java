package com.example.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheitResponse")
public class CelsiusToFahrenheitResponse {
    @XmlElement(name = "CelsiusToFahrenheitResult")
    private double celsiusToFahrenheitResult;

    public double getCelsiusToFahrenheitResult() {
        return celsiusToFahrenheitResult;
    }

    public void setCelsiusToFahrenheitResult(double celsiusToFahrenheitResult) {
        this.celsiusToFahrenheitResult = celsiusToFahrenheitResult;
    }
}


package com.example.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FahrenheitToCelsiusResponse")
public class FahrenheitToCelsiusResponse {
    @XmlElement(name = "FahrenheitToCelsiusResult")
    private double fahrenheitToCelsiusResult;

    public double getFahrenheitToCelsiusResult() {
        return fahrenheitToCelsiusResult;
    }

    public void setFahrenheitToCelsiusResult(double fahrenheitToCelsiusResult) {
        this.fahrenheitToCelsiusResult = fahrenheitToCelsiusResult;
    }
}

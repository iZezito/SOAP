package com.example.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FahrenheitToCelsius")
public class FahrenheitToCelsius {
    @XmlElement(name = "Fahrenheit")
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
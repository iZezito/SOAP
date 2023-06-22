package com.example.soap;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class TemperatureConverter extends WebServiceGatewaySupport {
    public double celsiusToFahrenheit(double celsius) {
        CelsiusToFahrenheit request = new CelsiusToFahrenheit();
        request.setCelsius(celsius);

        CelsiusToFahrenheitResponse response = (CelsiusToFahrenheitResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.w3schools.com/xml/tempconvert.asmx", request);

        return response.getCelsiusToFahrenheitResult();
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        FahrenheitToCelsius request = new FahrenheitToCelsius();
        request.setFahrenheit(fahrenheit);

        FahrenheitToCelsiusResponse response = (FahrenheitToCelsiusResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.w3schools.com/xml/tempconvert.asmx", request);

        return response.getFahrenheitToCelsiusResult();
    }
}


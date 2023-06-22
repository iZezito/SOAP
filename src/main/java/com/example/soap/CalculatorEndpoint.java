package com.example.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class CalculatorEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/calculator";

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorEndpoint(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "multiplicarRequest")
    @ResponsePayload
    public MultiplicarResponse multiplicar(@RequestPayload Multiplicar request) {
        MultiplicarResponse response = new MultiplicarResponse();
        response.setResult(calculatorService.multiplicar(request.getA(), request.getB()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "dividirRequest")
    @ResponsePayload
    public DividirResponse dividir(@RequestPayload Dividir request) {
        DividirResponse response = new DividirResponse();
        response.setResult(calculatorService.dividir(request.getA(), request.getB()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "somarRequest")
    @ResponsePayload
    public SomarResponse somar(@RequestPayload Somar request) {
        SomarResponse response = new SomarResponse();
        response.setResult(calculatorService.somar(request.getA(), request.getB()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "subtrairRequest")
    @ResponsePayload
    public SubtrairResponse subtrair(@RequestPayload Subtrair request) {
        SubtrairResponse response = new SubtrairResponse();
        response.setResult(calculatorService.subtrair(request.getA(), request.getB()));
        return response;
    }
}

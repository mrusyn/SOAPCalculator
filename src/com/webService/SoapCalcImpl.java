package com.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webService.com/", portName = "SoapCalcImplPort", serviceName = "SoapCalcImplService")
public class SoapCalcImpl implements ICalculator{

    
    @WebMethod(operationName = "add", action = "urn:Add")
    public int add(@WebParam(name = "arg0") int a,@WebParam(name = "arg1") int b) {
    
        return (a+b);
    }

    
    @WebMethod(operationName = "multiply", action = "urn:Multiply")
    public int multiply(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
        
        return (a*b);
    }

   
    @WebMethod(operationName = "divide", action = "urn:Divide")
    public int divide(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
        
        return (a/b);
    }

    
    @WebMethod(operationName = "subtract", action = "urn:Subtract")
    public int subtract(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
        
        return (a-b);
    }

}

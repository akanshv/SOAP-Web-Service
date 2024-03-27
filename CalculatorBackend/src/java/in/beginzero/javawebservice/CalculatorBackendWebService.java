/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package in.beginzero.javawebservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author akans
 */
@WebService(serviceName = "CalculatorBackendWebService")
public class CalculatorBackendWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "AddIntegers")
    public int add(@WebParam(name = "firstnumber") int num1, @WebParam(name = "secondnumber") int num2) {
        return num1+num2;
    }
    
    @WebMethod(operationName = "SubIntegers")
    public int sub(@WebParam(name = "firstnumber") int num1, @WebParam(name = "secondnumber") int num2) {
        return num1-num2;
    }

    @WebMethod(operationName = "MulIntegers")
    public int mul(@WebParam(name = "firstnumber") int num1, @WebParam(name = "secondnumber") int num2) {
        return num1*num2;
    }

    @WebMethod(operationName = "DivIntegers")
    public int div(@WebParam(name = "firstnumber") int num1, @WebParam(name = "secondnumber") int num2) {
        return num1/num2;
    }  
}

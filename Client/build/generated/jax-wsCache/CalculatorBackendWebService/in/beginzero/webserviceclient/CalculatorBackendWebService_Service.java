
package in.beginzero.webserviceclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculatorBackendWebService", targetNamespace = "http://javawebservice.beginzero.in/", wsdlLocation = "http://localhost:8080/CalculatorBackend/CalculatorBackendWebService?wsdl")
public class CalculatorBackendWebService_Service
    extends Service
{

    private final static URL CALCULATORBACKENDWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORBACKENDWEBSERVICE_EXCEPTION;
    private final static QName CALCULATORBACKENDWEBSERVICE_QNAME = new QName("http://javawebservice.beginzero.in/", "CalculatorBackendWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculatorBackend/CalculatorBackendWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORBACKENDWEBSERVICE_WSDL_LOCATION = url;
        CALCULATORBACKENDWEBSERVICE_EXCEPTION = e;
    }

    public CalculatorBackendWebService_Service() {
        super(__getWsdlLocation(), CALCULATORBACKENDWEBSERVICE_QNAME);
    }

    public CalculatorBackendWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORBACKENDWEBSERVICE_QNAME, features);
    }

    public CalculatorBackendWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORBACKENDWEBSERVICE_QNAME);
    }

    public CalculatorBackendWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORBACKENDWEBSERVICE_QNAME, features);
    }

    public CalculatorBackendWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorBackendWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorBackendWebService
     */
    @WebEndpoint(name = "CalculatorBackendWebServicePort")
    public CalculatorBackendWebService getCalculatorBackendWebServicePort() {
        return super.getPort(new QName("http://javawebservice.beginzero.in/", "CalculatorBackendWebServicePort"), CalculatorBackendWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorBackendWebService
     */
    @WebEndpoint(name = "CalculatorBackendWebServicePort")
    public CalculatorBackendWebService getCalculatorBackendWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://javawebservice.beginzero.in/", "CalculatorBackendWebServicePort"), CalculatorBackendWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORBACKENDWEBSERVICE_EXCEPTION!= null) {
            throw CALCULATORBACKENDWEBSERVICE_EXCEPTION;
        }
        return CALCULATORBACKENDWEBSERVICE_WSDL_LOCATION;
    }

}

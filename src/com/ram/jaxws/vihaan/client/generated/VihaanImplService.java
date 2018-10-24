
package com.ram.jaxws.vihaan.client.generated;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VihaanImplService", targetNamespace = "http://server.vihaan.jaxws.ram.com/", wsdlLocation = "http://localhost:9091/Vihaan?wsdl")
public class VihaanImplService
    extends Service
{

    private final static URL VIHAANIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException VIHAANIMPLSERVICE_EXCEPTION;
    private final static QName VIHAANIMPLSERVICE_QNAME = new QName("http://server.vihaan.jaxws.ram.com/", "VihaanImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9091/Vihaan?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIHAANIMPLSERVICE_WSDL_LOCATION = url;
        VIHAANIMPLSERVICE_EXCEPTION = e;
    }

    public VihaanImplService() {
        super(__getWsdlLocation(), VIHAANIMPLSERVICE_QNAME);
    }

    public VihaanImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIHAANIMPLSERVICE_QNAME, features);
    }

    public VihaanImplService(URL wsdlLocation) {
        super(wsdlLocation, VIHAANIMPLSERVICE_QNAME);
    }

    public VihaanImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIHAANIMPLSERVICE_QNAME, features);
    }

    public VihaanImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VihaanImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Vihaan
     */
    @WebEndpoint(name = "VihaanImplPort")
    public Vihaan getVihaanImplPort() {
        return super.getPort(new QName("http://server.vihaan.jaxws.ram.com/", "VihaanImplPort"), Vihaan.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Vihaan
     */
    @WebEndpoint(name = "VihaanImplPort")
    public Vihaan getVihaanImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.vihaan.jaxws.ram.com/", "VihaanImplPort"), Vihaan.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIHAANIMPLSERVICE_EXCEPTION!= null) {
            throw VIHAANIMPLSERVICE_EXCEPTION;
        }
        return VIHAANIMPLSERVICE_WSDL_LOCATION;
    }

}

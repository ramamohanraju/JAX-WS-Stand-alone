
package com.ram.jaxws.vihaan.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Vihaan", targetNamespace = "http://server.vihaan.jaxws.ram.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Vihaan {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOwnerName", targetNamespace = "http://server.vihaan.jaxws.ram.com/", className = "com.ram.jaxws.vihaan.client.generated.GetOwnerName")
    @ResponseWrapper(localName = "getOwnerNameResponse", targetNamespace = "http://server.vihaan.jaxws.ram.com/", className = "com.ram.jaxws.vihaan.client.generated.GetOwnerNameResponse")
    @Action(input = "http://server.vihaan.jaxws.ram.com/Vihaan/getOwnerNameRequest", output = "http://server.vihaan.jaxws.ram.com/Vihaan/getOwnerNameResponse")
    public String getOwnerName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

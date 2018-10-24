
package com.ram.jaxws.vihaan.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ram.jaxws.vihaan.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOwnerNameResponse_QNAME = new QName("http://server.vihaan.jaxws.ram.com/", "getOwnerNameResponse");
    private final static QName _GetOwnerName_QNAME = new QName("http://server.vihaan.jaxws.ram.com/", "getOwnerName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ram.jaxws.vihaan.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOwnerNameResponse }
     * 
     */
    public GetOwnerNameResponse createGetOwnerNameResponse() {
        return new GetOwnerNameResponse();
    }

    /**
     * Create an instance of {@link GetOwnerName }
     * 
     */
    public GetOwnerName createGetOwnerName() {
        return new GetOwnerName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOwnerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.vihaan.jaxws.ram.com/", name = "getOwnerNameResponse")
    public JAXBElement<GetOwnerNameResponse> createGetOwnerNameResponse(GetOwnerNameResponse value) {
        return new JAXBElement<GetOwnerNameResponse>(_GetOwnerNameResponse_QNAME, GetOwnerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOwnerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.vihaan.jaxws.ram.com/", name = "getOwnerName")
    public JAXBElement<GetOwnerName> createGetOwnerName(GetOwnerName value) {
        return new JAXBElement<GetOwnerName>(_GetOwnerName_QNAME, GetOwnerName.class, null, value);
    }

}


package com.upem.bankservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.upem.bankservices package. 
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

    private final static QName _GetAccountByIDNumber_QNAME = new QName("http://dao.bank.upem.com/", "getAccountByIDNumber");
    private final static QName _GetAccountByIDNumberResponse_QNAME = new QName("http://dao.bank.upem.com/", "getAccountByIDNumberResponse");
    private final static QName _Prelevement_QNAME = new QName("http://dao.bank.upem.com/", "prelevement");
    private final static QName _PrelevementResponse_QNAME = new QName("http://dao.bank.upem.com/", "prelevementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.upem.bankservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrelevementResponse }
     * 
     */
    public PrelevementResponse createPrelevementResponse() {
        return new PrelevementResponse();
    }

    /**
     * Create an instance of {@link GetAccountByIDNumber }
     * 
     */
    public GetAccountByIDNumber createGetAccountByIDNumber() {
        return new GetAccountByIDNumber();
    }

    /**
     * Create an instance of {@link GetAccountByIDNumberResponse }
     * 
     */
    public GetAccountByIDNumberResponse createGetAccountByIDNumberResponse() {
        return new GetAccountByIDNumberResponse();
    }

    /**
     * Create an instance of {@link Prelevement }
     * 
     */
    public Prelevement createPrelevement() {
        return new Prelevement();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountByIDNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.bank.upem.com/", name = "getAccountByIDNumber")
    public JAXBElement<GetAccountByIDNumber> createGetAccountByIDNumber(GetAccountByIDNumber value) {
        return new JAXBElement<GetAccountByIDNumber>(_GetAccountByIDNumber_QNAME, GetAccountByIDNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountByIDNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.bank.upem.com/", name = "getAccountByIDNumberResponse")
    public JAXBElement<GetAccountByIDNumberResponse> createGetAccountByIDNumberResponse(GetAccountByIDNumberResponse value) {
        return new JAXBElement<GetAccountByIDNumberResponse>(_GetAccountByIDNumberResponse_QNAME, GetAccountByIDNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prelevement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.bank.upem.com/", name = "prelevement")
    public JAXBElement<Prelevement> createPrelevement(Prelevement value) {
        return new JAXBElement<Prelevement>(_Prelevement_QNAME, Prelevement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrelevementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.bank.upem.com/", name = "prelevementResponse")
    public JAXBElement<PrelevementResponse> createPrelevementResponse(PrelevementResponse value) {
        return new JAXBElement<PrelevementResponse>(_PrelevementResponse_QNAME, PrelevementResponse.class, null, value);
    }

}

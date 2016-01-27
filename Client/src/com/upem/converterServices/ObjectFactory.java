
package com.upem.converterServices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.upem.converterServices package. 
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

    private final static QName _ConvertirDollarToPound_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirDollarToPound");
    private final static QName _ConvertirEURToDollarResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirEURToDollarResponse");
    private final static QName _ConvertirEURToPound_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirEURToPound");
    private final static QName _ConvertirEURToDollar_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirEURToDollar");
    private final static QName _ConvertirPoundToEUR_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirPoundToEUR");
    private final static QName _ConvertirDollarToEurResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirDollarToEurResponse");
    private final static QName _ConvertirPoundToDollarResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirPoundToDollarResponse");
    private final static QName _ConvertirPoundToEURResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirPoundToEURResponse");
    private final static QName _ConvertirPoundToDollar_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirPoundToDollar");
    private final static QName _ConvertirEURToPoundResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirEURToPoundResponse");
    private final static QName _ConvertirDollarToEur_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirDollarToEur");
    private final static QName _ConvertirDollarToPoundResponse_QNAME = new QName("http://dao.converter.upem.com/", "ConvertirDollarToPoundResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.upem.converterServices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertirDollarToEur }
     * 
     */
    public ConvertirDollarToEur createConvertirDollarToEur() {
        return new ConvertirDollarToEur();
    }

    /**
     * Create an instance of {@link ConvertirEURToPoundResponse }
     * 
     */
    public ConvertirEURToPoundResponse createConvertirEURToPoundResponse() {
        return new ConvertirEURToPoundResponse();
    }

    /**
     * Create an instance of {@link ConvertirDollarToPoundResponse }
     * 
     */
    public ConvertirDollarToPoundResponse createConvertirDollarToPoundResponse() {
        return new ConvertirDollarToPoundResponse();
    }

    /**
     * Create an instance of {@link ConvertirDollarToPound }
     * 
     */
    public ConvertirDollarToPound createConvertirDollarToPound() {
        return new ConvertirDollarToPound();
    }

    /**
     * Create an instance of {@link ConvertirEURToDollarResponse }
     * 
     */
    public ConvertirEURToDollarResponse createConvertirEURToDollarResponse() {
        return new ConvertirEURToDollarResponse();
    }

    /**
     * Create an instance of {@link ConvertirEURToPound }
     * 
     */
    public ConvertirEURToPound createConvertirEURToPound() {
        return new ConvertirEURToPound();
    }

    /**
     * Create an instance of {@link ConvertirDollarToEurResponse }
     * 
     */
    public ConvertirDollarToEurResponse createConvertirDollarToEurResponse() {
        return new ConvertirDollarToEurResponse();
    }

    /**
     * Create an instance of {@link ConvertirPoundToDollarResponse }
     * 
     */
    public ConvertirPoundToDollarResponse createConvertirPoundToDollarResponse() {
        return new ConvertirPoundToDollarResponse();
    }

    /**
     * Create an instance of {@link ConvertirPoundToEURResponse }
     * 
     */
    public ConvertirPoundToEURResponse createConvertirPoundToEURResponse() {
        return new ConvertirPoundToEURResponse();
    }

    /**
     * Create an instance of {@link ConvertirPoundToDollar }
     * 
     */
    public ConvertirPoundToDollar createConvertirPoundToDollar() {
        return new ConvertirPoundToDollar();
    }

    /**
     * Create an instance of {@link ConvertirEURToDollar }
     * 
     */
    public ConvertirEURToDollar createConvertirEURToDollar() {
        return new ConvertirEURToDollar();
    }

    /**
     * Create an instance of {@link ConvertirPoundToEUR }
     * 
     */
    public ConvertirPoundToEUR createConvertirPoundToEUR() {
        return new ConvertirPoundToEUR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDollarToPound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirDollarToPound")
    public JAXBElement<ConvertirDollarToPound> createConvertirDollarToPound(ConvertirDollarToPound value) {
        return new JAXBElement<ConvertirDollarToPound>(_ConvertirDollarToPound_QNAME, ConvertirDollarToPound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirEURToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirEURToDollarResponse")
    public JAXBElement<ConvertirEURToDollarResponse> createConvertirEURToDollarResponse(ConvertirEURToDollarResponse value) {
        return new JAXBElement<ConvertirEURToDollarResponse>(_ConvertirEURToDollarResponse_QNAME, ConvertirEURToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirEURToPound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirEURToPound")
    public JAXBElement<ConvertirEURToPound> createConvertirEURToPound(ConvertirEURToPound value) {
        return new JAXBElement<ConvertirEURToPound>(_ConvertirEURToPound_QNAME, ConvertirEURToPound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirEURToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirEURToDollar")
    public JAXBElement<ConvertirEURToDollar> createConvertirEURToDollar(ConvertirEURToDollar value) {
        return new JAXBElement<ConvertirEURToDollar>(_ConvertirEURToDollar_QNAME, ConvertirEURToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPoundToEUR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirPoundToEUR")
    public JAXBElement<ConvertirPoundToEUR> createConvertirPoundToEUR(ConvertirPoundToEUR value) {
        return new JAXBElement<ConvertirPoundToEUR>(_ConvertirPoundToEUR_QNAME, ConvertirPoundToEUR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDollarToEurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirDollarToEurResponse")
    public JAXBElement<ConvertirDollarToEurResponse> createConvertirDollarToEurResponse(ConvertirDollarToEurResponse value) {
        return new JAXBElement<ConvertirDollarToEurResponse>(_ConvertirDollarToEurResponse_QNAME, ConvertirDollarToEurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPoundToDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirPoundToDollarResponse")
    public JAXBElement<ConvertirPoundToDollarResponse> createConvertirPoundToDollarResponse(ConvertirPoundToDollarResponse value) {
        return new JAXBElement<ConvertirPoundToDollarResponse>(_ConvertirPoundToDollarResponse_QNAME, ConvertirPoundToDollarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPoundToEURResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirPoundToEURResponse")
    public JAXBElement<ConvertirPoundToEURResponse> createConvertirPoundToEURResponse(ConvertirPoundToEURResponse value) {
        return new JAXBElement<ConvertirPoundToEURResponse>(_ConvertirPoundToEURResponse_QNAME, ConvertirPoundToEURResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirPoundToDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirPoundToDollar")
    public JAXBElement<ConvertirPoundToDollar> createConvertirPoundToDollar(ConvertirPoundToDollar value) {
        return new JAXBElement<ConvertirPoundToDollar>(_ConvertirPoundToDollar_QNAME, ConvertirPoundToDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirEURToPoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirEURToPoundResponse")
    public JAXBElement<ConvertirEURToPoundResponse> createConvertirEURToPoundResponse(ConvertirEURToPoundResponse value) {
        return new JAXBElement<ConvertirEURToPoundResponse>(_ConvertirEURToPoundResponse_QNAME, ConvertirEURToPoundResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDollarToEur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirDollarToEur")
    public JAXBElement<ConvertirDollarToEur> createConvertirDollarToEur(ConvertirDollarToEur value) {
        return new JAXBElement<ConvertirDollarToEur>(_ConvertirDollarToEur_QNAME, ConvertirDollarToEur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertirDollarToPoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.converter.upem.com/", name = "ConvertirDollarToPoundResponse")
    public JAXBElement<ConvertirDollarToPoundResponse> createConvertirDollarToPoundResponse(ConvertirDollarToPoundResponse value) {
        return new JAXBElement<ConvertirDollarToPoundResponse>(_ConvertirDollarToPoundResponse_QNAME, ConvertirDollarToPoundResponse.class, null, value);
    }

}

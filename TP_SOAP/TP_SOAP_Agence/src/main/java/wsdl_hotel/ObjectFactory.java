
package wsdl_hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl_hotel package. 
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

    private final static QName _WrongLoginException_QNAME = new QName("http://services/", "WrongLoginException");
    private final static QName _ParseException_QNAME = new QName("http://services/", "ParseException");
    private final static QName _GetOffres_QNAME = new QName("http://services/", "getOffres");
    private final static QName _GetHotelResponse_QNAME = new QName("http://services/", "getHotelResponse");
    private final static QName _WrongDateException_QNAME = new QName("http://services/", "WrongDateException");
    private final static QName _GetOffresResponse_QNAME = new QName("http://services/", "getOffresResponse");
    private final static QName _GetHotel_QNAME = new QName("http://services/", "getHotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl_hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WrongDateException }
     * 
     */
    public WrongDateException createWrongDateException() {
        return new WrongDateException();
    }

    /**
     * Create an instance of {@link GetHotelResponse }
     * 
     */
    public GetHotelResponse createGetHotelResponse() {
        return new GetHotelResponse();
    }

    /**
     * Create an instance of {@link GetHotel }
     * 
     */
    public GetHotel createGetHotel() {
        return new GetHotel();
    }

    /**
     * Create an instance of {@link GetOffresResponse }
     * 
     */
    public GetOffresResponse createGetOffresResponse() {
        return new GetOffresResponse();
    }

    /**
     * Create an instance of {@link GetOffres }
     * 
     */
    public GetOffres createGetOffres() {
        return new GetOffres();
    }

    /**
     * Create an instance of {@link WrongLoginException }
     * 
     */
    public WrongLoginException createWrongLoginException() {
        return new WrongLoginException();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrongLoginException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "WrongLoginException")
    public JAXBElement<WrongLoginException> createWrongLoginException(WrongLoginException value) {
        return new JAXBElement<WrongLoginException>(_WrongLoginException_QNAME, WrongLoginException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOffres")
    public JAXBElement<GetOffres> createGetOffres(GetOffres value) {
        return new JAXBElement<GetOffres>(_GetOffres_QNAME, GetOffres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getHotelResponse")
    public JAXBElement<GetHotelResponse> createGetHotelResponse(GetHotelResponse value) {
        return new JAXBElement<GetHotelResponse>(_GetHotelResponse_QNAME, GetHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrongDateException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "WrongDateException")
    public JAXBElement<WrongDateException> createWrongDateException(WrongDateException value) {
        return new JAXBElement<WrongDateException>(_WrongDateException_QNAME, WrongDateException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOffresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getOffresResponse")
    public JAXBElement<GetOffresResponse> createGetOffresResponse(GetOffresResponse value) {
        return new JAXBElement<GetOffresResponse>(_GetOffresResponse_QNAME, GetOffresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getHotel")
    public JAXBElement<GetHotel> createGetHotel(GetHotel value) {
        return new JAXBElement<GetHotel>(_GetHotel_QNAME, GetHotel.class, null, value);
    }

}

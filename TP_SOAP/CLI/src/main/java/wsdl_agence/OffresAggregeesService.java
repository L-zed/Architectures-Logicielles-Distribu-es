
package wsdl_agence;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OffresAggregeesService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OffresAggregeesService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<wsdl_agence.Hotel>
     * @throws MalformedURLException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHotels", targetNamespace = "http://services/", className = "wsdl_agence.GetHotels")
    @ResponseWrapper(localName = "getHotelsResponse", targetNamespace = "http://services/", className = "wsdl_agence.GetHotelsResponse")
    @Action(input = "http://services/OffresAggregeesService/getHotelsRequest", output = "http://services/OffresAggregeesService/getHotelsResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://services/OffresAggregeesService/getHotels/Fault/MalformedURLException")
    })
    public List<Hotel> getHotels(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws MalformedURLException_Exception
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<wsdl_agence.Offre>
     * @throws WrongLoginExceptionException
     * @throws MalformedURLException_Exception
     * @throws ParseExceptionException
     * @throws WrongDateExceptionException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOffres", targetNamespace = "http://services/", className = "wsdl_agence.GetOffres")
    @ResponseWrapper(localName = "getOffresResponse", targetNamespace = "http://services/", className = "wsdl_agence.GetOffresResponse")
    @Action(input = "http://services/OffresAggregeesService/getOffresRequest", output = "http://services/OffresAggregeesService/getOffresResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://services/OffresAggregeesService/getOffres/Fault/MalformedURLException"),
        @FaultAction(className = WrongDateExceptionException.class, value = "http://services/OffresAggregeesService/getOffres/Fault/WrongDateException_Exception"),
        @FaultAction(className = ParseExceptionException.class, value = "http://services/OffresAggregeesService/getOffres/Fault/ParseException_Exception"),
        @FaultAction(className = WrongLoginExceptionException.class, value = "http://services/OffresAggregeesService/getOffres/Fault/WrongLoginException_Exception")
    })
    public List<Offre> getOffres(
        @WebParam(name = "arg0", targetNamespace = "")
        Hotel arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3)
        throws MalformedURLException_Exception, ParseExceptionException, WrongDateExceptionException, WrongLoginExceptionException
    ;

}

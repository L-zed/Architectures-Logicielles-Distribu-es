
package wsdl_hotel;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WrongDateException", targetNamespace = "http://services/")
public class WrongDateException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WrongDateException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WrongDateException_Exception(String message, WrongDateException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WrongDateException_Exception(String message, WrongDateException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: wsdl_hotel.WrongDateException
     */
    public WrongDateException getFaultInfo() {
        return faultInfo;
    }

}
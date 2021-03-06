
package wsdl_agence;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WrongLoginException", targetNamespace = "http://services/")
public class WrongLoginExceptionException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WrongLoginException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WrongLoginExceptionException(String message, WrongLoginException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WrongLoginExceptionException(String message, WrongLoginException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: wsdl_agence.WrongLoginException
     */
    public WrongLoginException getFaultInfo() {
        return faultInfo;
    }

}

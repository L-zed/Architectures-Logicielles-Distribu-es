
package wsdl_agence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour agence complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="agence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passowrd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agence", propOrder = {
    "id",
    "passowrd",
    "pricePercentage"
})
public class Agence {

    protected String id;
    protected String passowrd;
    protected Double pricePercentage;

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété passowrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassowrd() {
        return passowrd;
    }

    /**
     * Définit la valeur de la propriété passowrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassowrd(String value) {
        this.passowrd = value;
    }

    /**
     * Obtient la valeur de la propriété pricePercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPricePercentage() {
        return pricePercentage;
    }

    /**
     * Définit la valeur de la propriété pricePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPricePercentage(Double value) {
        this.pricePercentage = value;
    }

}

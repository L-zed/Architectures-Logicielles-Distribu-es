
package wsdl_agence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="adresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroRue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posisionGps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "codePostal",
    "numeroRue",
    "pays",
    "posisionGps",
    "rue",
    "ville"
})
public class Adresse {

    protected int codePostal;
    protected int numeroRue;
    protected String pays;
    protected String posisionGps;
    protected String rue;
    protected String ville;

    /**
     * Obtient la valeur de la propriété codePostal.
     * 
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * Définit la valeur de la propriété codePostal.
     * 
     */
    public void setCodePostal(int value) {
        this.codePostal = value;
    }

    /**
     * Obtient la valeur de la propriété numeroRue.
     * 
     */
    public int getNumeroRue() {
        return numeroRue;
    }

    /**
     * Définit la valeur de la propriété numeroRue.
     * 
     */
    public void setNumeroRue(int value) {
        this.numeroRue = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété posisionGps.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosisionGps() {
        return posisionGps;
    }

    /**
     * Définit la valeur de la propriété posisionGps.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosisionGps(String value) {
        this.posisionGps = value;
    }

    /**
     * Obtient la valeur de la propriété rue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRue() {
        return rue;
    }

    /**
     * Définit la valeur de la propriété rue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRue(String value) {
        this.rue = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}


package wsdl_hotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hotel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresse" type="{http://services/}adresse" minOccurs="0"/>
 *         &lt;element name="agencesPartenaires" type="{http://services/}agence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbEtoile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "adresse",
    "agencesPartenaires",
    "name",
    "nbEtoile"
})
public class Hotel {

    protected Adresse adresse;
    @XmlElement(nillable = true)
    protected List<Agence> agencesPartenaires;
    protected String name;
    protected int nbEtoile;

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link Adresse }
     *     
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresse }
     *     
     */
    public void setAdresse(Adresse value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the agencesPartenaires property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencesPartenaires property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencesPartenaires().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agence }
     * 
     * 
     */
    public List<Agence> getAgencesPartenaires() {
        if (agencesPartenaires == null) {
            agencesPartenaires = new ArrayList<Agence>();
        }
        return this.agencesPartenaires;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété nbEtoile.
     * 
     */
    public int getNbEtoile() {
        return nbEtoile;
    }

    /**
     * Définit la valeur de la propriété nbEtoile.
     * 
     */
    public void setNbEtoile(int value) {
        this.nbEtoile = value;
    }

}

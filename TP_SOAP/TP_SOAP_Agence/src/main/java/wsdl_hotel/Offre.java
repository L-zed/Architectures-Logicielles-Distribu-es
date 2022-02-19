
package wsdl_hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour offre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="offre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivee" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="debutDisponibilite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOffre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbPersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroChambre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="roomImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offre", propOrder = {
    "arrivee",
    "debutDisponibilite",
    "depart",
    "hotel",
    "idOffre",
    "nbPersonnes",
    "numeroChambre",
    "prix",
    "roomImage",
    "typeChambre"
})
public class Offre {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar debutDisponibilite;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depart;
    protected String hotel;
    protected String idOffre;
    protected int nbPersonnes;
    protected int numeroChambre;
    protected double prix;
    protected String roomImage;
    protected String typeChambre;

    /**
     * Obtient la valeur de la propriété arrivee.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivee() {
        return arrivee;
    }

    /**
     * Définit la valeur de la propriété arrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivee(XMLGregorianCalendar value) {
        this.arrivee = value;
    }

    /**
     * Obtient la valeur de la propriété debutDisponibilite.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebutDisponibilite() {
        return debutDisponibilite;
    }

    /**
     * Définit la valeur de la propriété debutDisponibilite.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebutDisponibilite(XMLGregorianCalendar value) {
        this.debutDisponibilite = value;
    }

    /**
     * Obtient la valeur de la propriété depart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepart() {
        return depart;
    }

    /**
     * Définit la valeur de la propriété depart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepart(XMLGregorianCalendar value) {
        this.depart = value;
    }

    /**
     * Obtient la valeur de la propriété hotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * Définit la valeur de la propriété hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotel(String value) {
        this.hotel = value;
    }

    /**
     * Obtient la valeur de la propriété idOffre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOffre() {
        return idOffre;
    }

    /**
     * Définit la valeur de la propriété idOffre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOffre(String value) {
        this.idOffre = value;
    }

    /**
     * Obtient la valeur de la propriété nbPersonnes.
     * 
     */
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    /**
     * Définit la valeur de la propriété nbPersonnes.
     * 
     */
    public void setNbPersonnes(int value) {
        this.nbPersonnes = value;
    }

    /**
     * Obtient la valeur de la propriété numeroChambre.
     * 
     */
    public int getNumeroChambre() {
        return numeroChambre;
    }

    /**
     * Définit la valeur de la propriété numeroChambre.
     * 
     */
    public void setNumeroChambre(int value) {
        this.numeroChambre = value;
    }

    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété roomImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomImage() {
        return roomImage;
    }

    /**
     * Définit la valeur de la propriété roomImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomImage(String value) {
        this.roomImage = value;
    }

    /**
     * Obtient la valeur de la propriété typeChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChambre() {
        return typeChambre;
    }

    /**
     * Définit la valeur de la propriété typeChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChambre(String value) {
        this.typeChambre = value;
    }

}

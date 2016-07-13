
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour cardRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cardRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cardSecurityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardHolderBirthDay" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardRequest", propOrder = {
    "number",
    "scheme",
    "expiryMonth",
    "expiryYear",
    "cardSecurityCode",
    "cardHolderBirthDay",
    "paymentToken"
})
public class CardRequest {

    protected String number;
    protected String scheme;
    protected Integer expiryMonth;
    protected Integer expiryYear;
    protected String cardSecurityCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cardHolderBirthDay;
    protected String paymentToken;

    /**
     * Obtient la valeur de la propriété number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtient la valeur de la propriété scheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Définit la valeur de la propriété scheme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
    }

    /**
     * Obtient la valeur de la propriété expiryMonth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Définit la valeur de la propriété expiryMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryMonth(Integer value) {
        this.expiryMonth = value;
    }

    /**
     * Obtient la valeur de la propriété expiryYear.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryYear() {
        return expiryYear;
    }

    /**
     * Définit la valeur de la propriété expiryYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryYear(Integer value) {
        this.expiryYear = value;
    }

    /**
     * Obtient la valeur de la propriété cardSecurityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * Définit la valeur de la propriété cardSecurityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * Obtient la valeur de la propriété cardHolderBirthDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardHolderBirthDay() {
        return cardHolderBirthDay;
    }

    /**
     * Définit la valeur de la propriété cardHolderBirthDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardHolderBirthDay(XMLGregorianCalendar value) {
        this.cardHolderBirthDay = value;
    }

    /**
     * Obtient la valeur de la propriété paymentToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Définit la valeur de la propriété paymentToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentToken(String value) {
        this.paymentToken = value;
    }

}

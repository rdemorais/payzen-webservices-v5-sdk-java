
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour subscriptionResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="subscriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="initialAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rrule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialAmountNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pastPaymentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalPaymentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriptionResponse", propOrder = {
    "subscriptionId",
    "effectDate",
    "cancelDate",
    "initialAmount",
    "rrule",
    "description",
    "initialAmountNumber",
    "pastPaymentNumber",
    "totalPaymentNumber",
    "amount",
    "currency"
})
public class SubscriptionResponse {

    protected String subscriptionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    protected Long initialAmount;
    protected String rrule;
    protected String description;
    protected Integer initialAmountNumber;
    protected Integer pastPaymentNumber;
    protected Integer totalPaymentNumber;
    protected Long amount;
    protected Integer currency;

    /**
     * Obtient la valeur de la propriété subscriptionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Définit la valeur de la propriété subscriptionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Obtient la valeur de la propriété effectDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectDate() {
        return effectDate;
    }

    /**
     * Définit la valeur de la propriété effectDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectDate(XMLGregorianCalendar value) {
        this.effectDate = value;
    }

    /**
     * Obtient la valeur de la propriété cancelDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Définit la valeur de la propriété cancelDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Obtient la valeur de la propriété initialAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitialAmount() {
        return initialAmount;
    }

    /**
     * Définit la valeur de la propriété initialAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitialAmount(Long value) {
        this.initialAmount = value;
    }

    /**
     * Obtient la valeur de la propriété rrule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrule() {
        return rrule;
    }

    /**
     * Définit la valeur de la propriété rrule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrule(String value) {
        this.rrule = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété initialAmountNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialAmountNumber() {
        return initialAmountNumber;
    }

    /**
     * Définit la valeur de la propriété initialAmountNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialAmountNumber(Integer value) {
        this.initialAmountNumber = value;
    }

    /**
     * Obtient la valeur de la propriété pastPaymentNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPastPaymentNumber() {
        return pastPaymentNumber;
    }

    /**
     * Définit la valeur de la propriété pastPaymentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPastPaymentNumber(Integer value) {
        this.pastPaymentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété totalPaymentNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPaymentNumber() {
        return totalPaymentNumber;
    }

    /**
     * Définit la valeur de la propriété totalPaymentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPaymentNumber(Integer value) {
        this.totalPaymentNumber = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrency(Integer value) {
        this.currency = value;
    }

}

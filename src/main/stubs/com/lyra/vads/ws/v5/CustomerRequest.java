
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDetails" type="{http://v5.ws.vads.lyra.com/}billingDetailsRequest" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{http://v5.ws.vads.lyra.com/}shippingDetailsRequest" minOccurs="0"/>
 *         &lt;element name="extraDetails" type="{http://v5.ws.vads.lyra.com/}extraDetailsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerRequest", propOrder = {
    "billingDetails",
    "shippingDetails",
    "extraDetails"
})
public class CustomerRequest {

    protected BillingDetailsRequest billingDetails;
    protected ShippingDetailsRequest shippingDetails;
    protected ExtraDetailsRequest extraDetails;

    /**
     * Obtient la valeur de la propriété billingDetails.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetailsRequest }
     *     
     */
    public BillingDetailsRequest getBillingDetails() {
        return billingDetails;
    }

    /**
     * Définit la valeur de la propriété billingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetailsRequest }
     *     
     */
    public void setBillingDetails(BillingDetailsRequest value) {
        this.billingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété shippingDetails.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsRequest }
     *     
     */
    public ShippingDetailsRequest getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Définit la valeur de la propriété shippingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsRequest }
     *     
     */
    public void setShippingDetails(ShippingDetailsRequest value) {
        this.shippingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété extraDetails.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDetailsRequest }
     *     
     */
    public ExtraDetailsRequest getExtraDetails() {
        return extraDetails;
    }

    /**
     * Définit la valeur de la propriété extraDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDetailsRequest }
     *     
     */
    public void setExtraDetails(ExtraDetailsRequest value) {
        this.extraDetails = value;
    }

}

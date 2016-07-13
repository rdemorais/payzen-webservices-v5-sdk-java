
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customerResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDetails" type="{http://v5.ws.vads.lyra.com/}billingDetailsResponse" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{http://v5.ws.vads.lyra.com/}shippingDetailsResponse" minOccurs="0"/>
 *         &lt;element name="extraDetails" type="{http://v5.ws.vads.lyra.com/}extraDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerResponse", propOrder = {
    "billingDetails",
    "shippingDetails",
    "extraDetails"
})
public class CustomerResponse {

    protected BillingDetailsResponse billingDetails;
    protected ShippingDetailsResponse shippingDetails;
    protected ExtraDetailsResponse extraDetails;

    /**
     * Obtient la valeur de la propriété billingDetails.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetailsResponse }
     *     
     */
    public BillingDetailsResponse getBillingDetails() {
        return billingDetails;
    }

    /**
     * Définit la valeur de la propriété billingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetailsResponse }
     *     
     */
    public void setBillingDetails(BillingDetailsResponse value) {
        this.billingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété shippingDetails.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsResponse }
     *     
     */
    public ShippingDetailsResponse getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Définit la valeur de la propriété shippingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsResponse }
     *     
     */
    public void setShippingDetails(ShippingDetailsResponse value) {
        this.shippingDetails = value;
    }

    /**
     * Obtient la valeur de la propriété extraDetails.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDetailsResponse }
     *     
     */
    public ExtraDetailsResponse getExtraDetails() {
        return extraDetails;
    }

    /**
     * Définit la valeur de la propriété extraDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDetailsResponse }
     *     
     */
    public void setExtraDetails(ExtraDetailsResponse value) {
        this.extraDetails = value;
    }

}

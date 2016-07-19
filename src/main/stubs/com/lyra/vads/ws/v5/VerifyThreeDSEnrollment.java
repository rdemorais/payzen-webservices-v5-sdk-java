
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifyThreeDSEnrollment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifyThreeDSEnrollment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="paymentRequest" type="{http://v5.ws.vads.lyra.com/}paymentRequest" minOccurs="0"/>
 *         &lt;element name="cardRequest" type="{http://v5.ws.vads.lyra.com/}cardRequest" minOccurs="0"/>
 *         &lt;element name="techRequest" type="{http://v5.ws.vads.lyra.com/}techRequest" minOccurs="0"/>
 *         &lt;element name="threeDSRequest" type="{http://v5.ws.vads.lyra.com/}threeDSRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyThreeDSEnrollment", propOrder = {
    "commonRequest",
    "paymentRequest",
    "cardRequest",
    "techRequest",
    "threeDSRequest"
})
public class VerifyThreeDSEnrollment {

    protected CommonRequest commonRequest;
    protected PaymentRequest paymentRequest;
    protected CardRequest cardRequest;
    protected TechRequest techRequest;
    protected ThreeDSRequest threeDSRequest;

    /**
     * Obtient la valeur de la propriété commonRequest.
     * 
     * @return
     *     possible object is
     *     {@link CommonRequest }
     *     
     */
    public CommonRequest getCommonRequest() {
        return commonRequest;
    }

    /**
     * Définit la valeur de la propriété commonRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRequest }
     *     
     */
    public void setCommonRequest(CommonRequest value) {
        this.commonRequest = value;
    }

    /**
     * Obtient la valeur de la propriété paymentRequest.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest }
     *     
     */
    public PaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    /**
     * Définit la valeur de la propriété paymentRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest }
     *     
     */
    public void setPaymentRequest(PaymentRequest value) {
        this.paymentRequest = value;
    }

    /**
     * Obtient la valeur de la propriété cardRequest.
     * 
     * @return
     *     possible object is
     *     {@link CardRequest }
     *     
     */
    public CardRequest getCardRequest() {
        return cardRequest;
    }

    /**
     * Définit la valeur de la propriété cardRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRequest }
     *     
     */
    public void setCardRequest(CardRequest value) {
        this.cardRequest = value;
    }

    /**
     * Obtient la valeur de la propriété techRequest.
     * 
     * @return
     *     possible object is
     *     {@link TechRequest }
     *     
     */
    public TechRequest getTechRequest() {
        return techRequest;
    }

    /**
     * Définit la valeur de la propriété techRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TechRequest }
     *     
     */
    public void setTechRequest(TechRequest value) {
        this.techRequest = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSRequest.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSRequest }
     *     
     */
    public ThreeDSRequest getThreeDSRequest() {
        return threeDSRequest;
    }

    /**
     * Définit la valeur de la propriété threeDSRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSRequest }
     *     
     */
    public void setThreeDSRequest(ThreeDSRequest value) {
        this.threeDSRequest = value;
    }

}

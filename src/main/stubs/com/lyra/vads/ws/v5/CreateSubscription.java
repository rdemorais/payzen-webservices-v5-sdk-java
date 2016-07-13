
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour createSubscription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="createSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="orderRequest" type="{http://v5.ws.vads.lyra.com/}orderRequest" minOccurs="0"/>
 *         &lt;element name="subscriptionRequest" type="{http://v5.ws.vads.lyra.com/}subscriptionRequest" minOccurs="0"/>
 *         &lt;element name="cardRequest" type="{http://v5.ws.vads.lyra.com/}cardRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubscription", propOrder = {
    "commonRequest",
    "orderRequest",
    "subscriptionRequest",
    "cardRequest"
})
public class CreateSubscription {

    protected CommonRequest commonRequest;
    protected OrderRequest orderRequest;
    protected SubscriptionRequest subscriptionRequest;
    protected CardRequest cardRequest;

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
     * Obtient la valeur de la propriété orderRequest.
     * 
     * @return
     *     possible object is
     *     {@link OrderRequest }
     *     
     */
    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    /**
     * Définit la valeur de la propriété orderRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRequest }
     *     
     */
    public void setOrderRequest(OrderRequest value) {
        this.orderRequest = value;
    }

    /**
     * Obtient la valeur de la propriété subscriptionRequest.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Définit la valeur de la propriété subscriptionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
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

}

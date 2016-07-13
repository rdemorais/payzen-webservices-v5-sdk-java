
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateToken complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonRequest" type="{http://v5.ws.vads.lyra.com/}commonRequest" minOccurs="0"/>
 *         &lt;element name="queryRequest" type="{http://v5.ws.vads.lyra.com/}queryRequest" minOccurs="0"/>
 *         &lt;element name="cardRequest" type="{http://v5.ws.vads.lyra.com/}cardRequest" minOccurs="0"/>
 *         &lt;element name="customerRequest" type="{http://v5.ws.vads.lyra.com/}customerRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateToken", propOrder = {
    "commonRequest",
    "queryRequest",
    "cardRequest",
    "customerRequest"
})
public class UpdateToken {

    protected CommonRequest commonRequest;
    protected QueryRequest queryRequest;
    protected CardRequest cardRequest;
    protected CustomerRequest customerRequest;

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
     * Obtient la valeur de la propriété queryRequest.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest }
     *     
     */
    public QueryRequest getQueryRequest() {
        return queryRequest;
    }

    /**
     * Définit la valeur de la propriété queryRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest }
     *     
     */
    public void setQueryRequest(QueryRequest value) {
        this.queryRequest = value;
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
     * Obtient la valeur de la propriété customerRequest.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequest }
     *     
     */
    public CustomerRequest getCustomerRequest() {
        return customerRequest;
    }

    /**
     * Définit la valeur de la propriété customerRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequest }
     *     
     */
    public void setCustomerRequest(CustomerRequest value) {
        this.customerRequest = value;
    }

}

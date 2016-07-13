
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getPaymentUuid complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getPaymentUuid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="legacyTransactionKeyRequest" type="{http://v5.ws.vads.lyra.com/}legacyTransactionKeyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentUuid", propOrder = {
    "legacyTransactionKeyRequest"
})
public class GetPaymentUuid {

    protected LegacyTransactionKeyRequest legacyTransactionKeyRequest;

    /**
     * Obtient la valeur de la propriété legacyTransactionKeyRequest.
     * 
     * @return
     *     possible object is
     *     {@link LegacyTransactionKeyRequest }
     *     
     */
    public LegacyTransactionKeyRequest getLegacyTransactionKeyRequest() {
        return legacyTransactionKeyRequest;
    }

    /**
     * Définit la valeur de la propriété legacyTransactionKeyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegacyTransactionKeyRequest }
     *     
     */
    public void setLegacyTransactionKeyRequest(LegacyTransactionKeyRequest value) {
        this.legacyTransactionKeyRequest = value;
    }

}

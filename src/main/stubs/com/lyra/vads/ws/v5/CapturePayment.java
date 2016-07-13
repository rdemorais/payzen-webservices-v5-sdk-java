
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour capturePayment complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="capturePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementRequest" type="{http://v5.ws.vads.lyra.com/}settlementRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capturePayment", propOrder = {
    "settlementRequest"
})
public class CapturePayment {

    protected SettlementRequest settlementRequest;

    /**
     * Obtient la valeur de la propriété settlementRequest.
     * 
     * @return
     *     possible object is
     *     {@link SettlementRequest }
     *     
     */
    public SettlementRequest getSettlementRequest() {
        return settlementRequest;
    }

    /**
     * Définit la valeur de la propriété settlementRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementRequest }
     *     
     */
    public void setSettlementRequest(SettlementRequest value) {
        this.settlementRequest = value;
    }

}

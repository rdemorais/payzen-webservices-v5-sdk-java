
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour wsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="wsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsResponse", propOrder = {
    "requestId"
})
@XmlSeeAlso({
    com.lyra.vads.ws.v5.CancelTokenResponse.CancelTokenResult.class,
    com.lyra.vads.ws.v5.UpdatePaymentResponse.UpdatePaymentResult.class,
    com.lyra.vads.ws.v5.FindPaymentsResponse.FindPaymentsResult.class,
    com.lyra.vads.ws.v5.RefundPaymentResponse.RefundPaymentResult.class,
    com.lyra.vads.ws.v5.CreatePaymentResponse.CreatePaymentResult.class,
    com.lyra.vads.ws.v5.CreateTokenFromTransactionResponse.CreateTokenFromTransactionResult.class,
    com.lyra.vads.ws.v5.UpdatePaymentDetailsResponse.UpdatePaymentDetailsResult.class,
    com.lyra.vads.ws.v5.CapturePaymentResponse.CapturePaymentResult.class,
    com.lyra.vads.ws.v5.CancelSubscriptionResponse.CancelSubscriptionResult.class,
    com.lyra.vads.ws.v5.GetTokenDetailsResponse.GetTokenDetailsResult.class,
    com.lyra.vads.ws.v5.GetPaymentUuidResponse.LegacyTransactionKeyResult.class,
    com.lyra.vads.ws.v5.UpdateTokenResponse.UpdateTokenResult.class,
    com.lyra.vads.ws.v5.VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult.class,
    com.lyra.vads.ws.v5.CreateTokenResponse.CreateTokenResult.class,
    com.lyra.vads.ws.v5.ValidatePaymentResponse.ValidatePaymentResult.class,
    com.lyra.vads.ws.v5.GetSubscriptionDetailsResponse.GetSubscriptionDetailsResult.class,
    com.lyra.vads.ws.v5.ReactivateTokenResponse.ReactivateTokenResult.class,
    com.lyra.vads.ws.v5.CreateSubscriptionResponse.CreateSubscriptionResult.class,
    com.lyra.vads.ws.v5.GetPaymentDetailsResponse.GetPaymentDetailsResult.class,
    com.lyra.vads.ws.v5.DuplicatePaymentResponse.DuplicatePaymentResult.class,
    com.lyra.vads.ws.v5.UpdateSubscriptionResponse.UpdateSubscriptionResult.class,
    com.lyra.vads.ws.v5.CancelPaymentResponse.CancelPaymentResult.class,
    com.lyra.vads.ws.v5.CheckThreeDSAuthenticationResponse.CheckThreeDSAuthenticationResult.class
})
public class WsResponse {

    protected String requestId;

    /**
     * Obtient la valeur de la propriété requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Définit la valeur de la propriété requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}

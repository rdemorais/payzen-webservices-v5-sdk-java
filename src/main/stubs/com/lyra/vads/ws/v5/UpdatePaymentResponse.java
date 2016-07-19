
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updatePaymentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updatePaymentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatePaymentResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="paymentResponse" type="{http://v5.ws.vads.lyra.com/}paymentResponse" minOccurs="0"/>
 *                   &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
 *                   &lt;element name="cardResponse" type="{http://v5.ws.vads.lyra.com/}cardResponse" minOccurs="0"/>
 *                   &lt;element name="authorizationResponse" type="{http://v5.ws.vads.lyra.com/}authorizationResponse" minOccurs="0"/>
 *                   &lt;element name="captureResponse" type="{http://v5.ws.vads.lyra.com/}captureResponse" minOccurs="0"/>
 *                   &lt;element name="customerResponse" type="{http://v5.ws.vads.lyra.com/}customerResponse" minOccurs="0"/>
 *                   &lt;element name="markResponse" type="{http://v5.ws.vads.lyra.com/}markResponse" minOccurs="0"/>
 *                   &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
 *                   &lt;element name="extraResponse" type="{http://v5.ws.vads.lyra.com/}extraResponse" minOccurs="0"/>
 *                   &lt;element name="subscriptionResponse" type="{http://v5.ws.vads.lyra.com/}subscriptionResponse" minOccurs="0"/>
 *                   &lt;element name="fraudManagementResponse" type="{http://v5.ws.vads.lyra.com/}fraudManagementResponse" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePaymentResponse", propOrder = {
    "updatePaymentResult"
})
public class UpdatePaymentResponse {

    protected UpdatePaymentResponse.UpdatePaymentResult updatePaymentResult;

    /**
     * Obtient la valeur de la propriété updatePaymentResult.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaymentResponse.UpdatePaymentResult }
     *     
     */
    public UpdatePaymentResponse.UpdatePaymentResult getUpdatePaymentResult() {
        return updatePaymentResult;
    }

    /**
     * Définit la valeur de la propriété updatePaymentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaymentResponse.UpdatePaymentResult }
     *     
     */
    public void setUpdatePaymentResult(UpdatePaymentResponse.UpdatePaymentResult value) {
        this.updatePaymentResult = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
     *       &lt;sequence>
     *         &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
     *         &lt;element name="paymentResponse" type="{http://v5.ws.vads.lyra.com/}paymentResponse" minOccurs="0"/>
     *         &lt;element name="orderResponse" type="{http://v5.ws.vads.lyra.com/}orderResponse" minOccurs="0"/>
     *         &lt;element name="cardResponse" type="{http://v5.ws.vads.lyra.com/}cardResponse" minOccurs="0"/>
     *         &lt;element name="authorizationResponse" type="{http://v5.ws.vads.lyra.com/}authorizationResponse" minOccurs="0"/>
     *         &lt;element name="captureResponse" type="{http://v5.ws.vads.lyra.com/}captureResponse" minOccurs="0"/>
     *         &lt;element name="customerResponse" type="{http://v5.ws.vads.lyra.com/}customerResponse" minOccurs="0"/>
     *         &lt;element name="markResponse" type="{http://v5.ws.vads.lyra.com/}markResponse" minOccurs="0"/>
     *         &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
     *         &lt;element name="extraResponse" type="{http://v5.ws.vads.lyra.com/}extraResponse" minOccurs="0"/>
     *         &lt;element name="subscriptionResponse" type="{http://v5.ws.vads.lyra.com/}subscriptionResponse" minOccurs="0"/>
     *         &lt;element name="fraudManagementResponse" type="{http://v5.ws.vads.lyra.com/}fraudManagementResponse" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonResponse",
        "paymentResponse",
        "orderResponse",
        "cardResponse",
        "authorizationResponse",
        "captureResponse",
        "customerResponse",
        "markResponse",
        "threeDSResponse",
        "extraResponse",
        "subscriptionResponse",
        "fraudManagementResponse"
    })
    public static class UpdatePaymentResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected PaymentResponse paymentResponse;
        protected OrderResponse orderResponse;
        protected CardResponse cardResponse;
        protected AuthorizationResponse authorizationResponse;
        protected CaptureResponse captureResponse;
        protected CustomerResponse customerResponse;
        protected MarkResponse markResponse;
        protected ThreeDSResponse threeDSResponse;
        protected ExtraResponse extraResponse;
        protected SubscriptionResponse subscriptionResponse;
        protected FraudManagementResponse fraudManagementResponse;

        /**
         * Obtient la valeur de la propriété commonResponse.
         * 
         * @return
         *     possible object is
         *     {@link CommonResponse }
         *     
         */
        public CommonResponse getCommonResponse() {
            return commonResponse;
        }

        /**
         * Définit la valeur de la propriété commonResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonResponse }
         *     
         */
        public void setCommonResponse(CommonResponse value) {
            this.commonResponse = value;
        }

        /**
         * Obtient la valeur de la propriété paymentResponse.
         * 
         * @return
         *     possible object is
         *     {@link PaymentResponse }
         *     
         */
        public PaymentResponse getPaymentResponse() {
            return paymentResponse;
        }

        /**
         * Définit la valeur de la propriété paymentResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentResponse }
         *     
         */
        public void setPaymentResponse(PaymentResponse value) {
            this.paymentResponse = value;
        }

        /**
         * Obtient la valeur de la propriété orderResponse.
         * 
         * @return
         *     possible object is
         *     {@link OrderResponse }
         *     
         */
        public OrderResponse getOrderResponse() {
            return orderResponse;
        }

        /**
         * Définit la valeur de la propriété orderResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderResponse }
         *     
         */
        public void setOrderResponse(OrderResponse value) {
            this.orderResponse = value;
        }

        /**
         * Obtient la valeur de la propriété cardResponse.
         * 
         * @return
         *     possible object is
         *     {@link CardResponse }
         *     
         */
        public CardResponse getCardResponse() {
            return cardResponse;
        }

        /**
         * Définit la valeur de la propriété cardResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link CardResponse }
         *     
         */
        public void setCardResponse(CardResponse value) {
            this.cardResponse = value;
        }

        /**
         * Obtient la valeur de la propriété authorizationResponse.
         * 
         * @return
         *     possible object is
         *     {@link AuthorizationResponse }
         *     
         */
        public AuthorizationResponse getAuthorizationResponse() {
            return authorizationResponse;
        }

        /**
         * Définit la valeur de la propriété authorizationResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link AuthorizationResponse }
         *     
         */
        public void setAuthorizationResponse(AuthorizationResponse value) {
            this.authorizationResponse = value;
        }

        /**
         * Obtient la valeur de la propriété captureResponse.
         * 
         * @return
         *     possible object is
         *     {@link CaptureResponse }
         *     
         */
        public CaptureResponse getCaptureResponse() {
            return captureResponse;
        }

        /**
         * Définit la valeur de la propriété captureResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link CaptureResponse }
         *     
         */
        public void setCaptureResponse(CaptureResponse value) {
            this.captureResponse = value;
        }

        /**
         * Obtient la valeur de la propriété customerResponse.
         * 
         * @return
         *     possible object is
         *     {@link CustomerResponse }
         *     
         */
        public CustomerResponse getCustomerResponse() {
            return customerResponse;
        }

        /**
         * Définit la valeur de la propriété customerResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerResponse }
         *     
         */
        public void setCustomerResponse(CustomerResponse value) {
            this.customerResponse = value;
        }

        /**
         * Obtient la valeur de la propriété markResponse.
         * 
         * @return
         *     possible object is
         *     {@link MarkResponse }
         *     
         */
        public MarkResponse getMarkResponse() {
            return markResponse;
        }

        /**
         * Définit la valeur de la propriété markResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link MarkResponse }
         *     
         */
        public void setMarkResponse(MarkResponse value) {
            this.markResponse = value;
        }

        /**
         * Obtient la valeur de la propriété threeDSResponse.
         * 
         * @return
         *     possible object is
         *     {@link ThreeDSResponse }
         *     
         */
        public ThreeDSResponse getThreeDSResponse() {
            return threeDSResponse;
        }

        /**
         * Définit la valeur de la propriété threeDSResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link ThreeDSResponse }
         *     
         */
        public void setThreeDSResponse(ThreeDSResponse value) {
            this.threeDSResponse = value;
        }

        /**
         * Obtient la valeur de la propriété extraResponse.
         * 
         * @return
         *     possible object is
         *     {@link ExtraResponse }
         *     
         */
        public ExtraResponse getExtraResponse() {
            return extraResponse;
        }

        /**
         * Définit la valeur de la propriété extraResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link ExtraResponse }
         *     
         */
        public void setExtraResponse(ExtraResponse value) {
            this.extraResponse = value;
        }

        /**
         * Obtient la valeur de la propriété subscriptionResponse.
         * 
         * @return
         *     possible object is
         *     {@link SubscriptionResponse }
         *     
         */
        public SubscriptionResponse getSubscriptionResponse() {
            return subscriptionResponse;
        }

        /**
         * Définit la valeur de la propriété subscriptionResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriptionResponse }
         *     
         */
        public void setSubscriptionResponse(SubscriptionResponse value) {
            this.subscriptionResponse = value;
        }

        /**
         * Obtient la valeur de la propriété fraudManagementResponse.
         * 
         * @return
         *     possible object is
         *     {@link FraudManagementResponse }
         *     
         */
        public FraudManagementResponse getFraudManagementResponse() {
            return fraudManagementResponse;
        }

        /**
         * Définit la valeur de la propriété fraudManagementResponse.
         * 
         * @param value
         *     allowed object is
         *     {@link FraudManagementResponse }
         *     
         */
        public void setFraudManagementResponse(FraudManagementResponse value) {
            this.fraudManagementResponse = value;
        }

    }

}

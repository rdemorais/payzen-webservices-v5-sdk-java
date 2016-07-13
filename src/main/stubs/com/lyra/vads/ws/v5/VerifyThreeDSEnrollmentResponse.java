
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifyThreeDSEnrollmentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifyThreeDSEnrollmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verifyThreeDSEnrollmentResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://v5.ws.vads.lyra.com/}wsResponse">
 *                 &lt;sequence>
 *                   &lt;element name="commonResponse" type="{http://v5.ws.vads.lyra.com/}commonResponse" minOccurs="0"/>
 *                   &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
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
@XmlType(name = "verifyThreeDSEnrollmentResponse", propOrder = {
    "verifyThreeDSEnrollmentResult"
})
public class VerifyThreeDSEnrollmentResponse {

    protected VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult verifyThreeDSEnrollmentResult;

    /**
     * Obtient la valeur de la propriété verifyThreeDSEnrollmentResult.
     * 
     * @return
     *     possible object is
     *     {@link VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult }
     *     
     */
    public VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult getVerifyThreeDSEnrollmentResult() {
        return verifyThreeDSEnrollmentResult;
    }

    /**
     * Définit la valeur de la propriété verifyThreeDSEnrollmentResult.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult }
     *     
     */
    public void setVerifyThreeDSEnrollmentResult(VerifyThreeDSEnrollmentResponse.VerifyThreeDSEnrollmentResult value) {
        this.verifyThreeDSEnrollmentResult = value;
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
     *         &lt;element name="threeDSResponse" type="{http://v5.ws.vads.lyra.com/}threeDSResponse" minOccurs="0"/>
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
        "threeDSResponse"
    })
    public static class VerifyThreeDSEnrollmentResult
        extends WsResponse
    {

        protected CommonResponse commonResponse;
        protected ThreeDSResponse threeDSResponse;

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

    }

}

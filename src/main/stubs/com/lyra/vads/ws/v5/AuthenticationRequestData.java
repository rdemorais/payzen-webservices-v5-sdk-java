
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour authenticationRequestData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="authenticationRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threeDSAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSAcsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSEncodedPareq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threeDSRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationRequestData", propOrder = {
    "threeDSAcctId",
    "threeDSAcsUrl",
    "threeDSBrand",
    "threeDSEncodedPareq",
    "threeDSEnrolled",
    "threeDSRequestId"
})
public class AuthenticationRequestData {

    protected String threeDSAcctId;
    protected String threeDSAcsUrl;
    protected String threeDSBrand;
    protected String threeDSEncodedPareq;
    protected String threeDSEnrolled;
    protected String threeDSRequestId;

    /**
     * Obtient la valeur de la propriété threeDSAcctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSAcctId() {
        return threeDSAcctId;
    }

    /**
     * Définit la valeur de la propriété threeDSAcctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSAcctId(String value) {
        this.threeDSAcctId = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSAcsUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSAcsUrl() {
        return threeDSAcsUrl;
    }

    /**
     * Définit la valeur de la propriété threeDSAcsUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSAcsUrl(String value) {
        this.threeDSAcsUrl = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSBrand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSBrand() {
        return threeDSBrand;
    }

    /**
     * Définit la valeur de la propriété threeDSBrand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSBrand(String value) {
        this.threeDSBrand = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSEncodedPareq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSEncodedPareq() {
        return threeDSEncodedPareq;
    }

    /**
     * Définit la valeur de la propriété threeDSEncodedPareq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSEncodedPareq(String value) {
        this.threeDSEncodedPareq = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSEnrolled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSEnrolled() {
        return threeDSEnrolled;
    }

    /**
     * Définit la valeur de la propriété threeDSEnrolled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSEnrolled(String value) {
        this.threeDSEnrolled = value;
    }

    /**
     * Obtient la valeur de la propriété threeDSRequestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDSRequestId() {
        return threeDSRequestId;
    }

    /**
     * Définit la valeur de la propriété threeDSRequestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDSRequestId(String value) {
        this.threeDSRequestId = value;
    }

}

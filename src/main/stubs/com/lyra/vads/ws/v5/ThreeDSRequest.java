
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour threeDSRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="threeDSRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://v5.ws.vads.lyra.com/}threeDSMode" minOccurs="0"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mpiExtension" type="{http://v5.ws.vads.lyra.com/}mpiExtensionRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threeDSRequest", propOrder = {
    "mode",
    "requestId",
    "pares",
    "brand",
    "enrolled",
    "status",
    "eci",
    "xid",
    "cavv",
    "algorithm",
    "mpiExtension"
})
public class ThreeDSRequest {

    protected ThreeDSMode mode;
    protected String requestId;
    protected String pares;
    protected String brand;
    protected String enrolled;
    protected String status;
    protected String eci;
    protected String xid;
    protected String cavv;
    protected String algorithm;
    protected MpiExtensionRequest mpiExtension;

    /**
     * Obtient la valeur de la propriété mode.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSMode }
     *     
     */
    public ThreeDSMode getMode() {
        return mode;
    }

    /**
     * Définit la valeur de la propriété mode.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSMode }
     *     
     */
    public void setMode(ThreeDSMode value) {
        this.mode = value;
    }

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

    /**
     * Obtient la valeur de la propriété pares.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPares() {
        return pares;
    }

    /**
     * Définit la valeur de la propriété pares.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPares(String value) {
        this.pares = value;
    }

    /**
     * Obtient la valeur de la propriété brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Définit la valeur de la propriété brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtient la valeur de la propriété enrolled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolled() {
        return enrolled;
    }

    /**
     * Définit la valeur de la propriété enrolled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolled(String value) {
        this.enrolled = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété eci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Définit la valeur de la propriété eci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Obtient la valeur de la propriété xid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Définit la valeur de la propriété xid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Obtient la valeur de la propriété cavv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Définit la valeur de la propriété cavv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Obtient la valeur de la propriété algorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Définit la valeur de la propriété algorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Obtient la valeur de la propriété mpiExtension.
     * 
     * @return
     *     possible object is
     *     {@link MpiExtensionRequest }
     *     
     */
    public MpiExtensionRequest getMpiExtension() {
        return mpiExtension;
    }

    /**
     * Définit la valeur de la propriété mpiExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link MpiExtensionRequest }
     *     
     */
    public void setMpiExtension(MpiExtensionRequest value) {
        this.mpiExtension = value;
    }

}

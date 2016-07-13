
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour commonResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="responseCodeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatusLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonResponse", propOrder = {
    "responseCode",
    "responseCodeDetail",
    "transactionStatusLabel",
    "shopId",
    "paymentSource",
    "submissionDate",
    "contractNumber",
    "paymentToken"
})
public class CommonResponse {

    protected Integer responseCode;
    protected String responseCodeDetail;
    protected String transactionStatusLabel;
    protected String shopId;
    protected String paymentSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
    protected String contractNumber;
    protected String paymentToken;

    /**
     * Obtient la valeur de la propriété responseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Définit la valeur de la propriété responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Obtient la valeur de la propriété responseCodeDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCodeDetail() {
        return responseCodeDetail;
    }

    /**
     * Définit la valeur de la propriété responseCodeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCodeDetail(String value) {
        this.responseCodeDetail = value;
    }

    /**
     * Obtient la valeur de la propriété transactionStatusLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusLabel() {
        return transactionStatusLabel;
    }

    /**
     * Définit la valeur de la propriété transactionStatusLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusLabel(String value) {
        this.transactionStatusLabel = value;
    }

    /**
     * Obtient la valeur de la propriété shopId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * Définit la valeur de la propriété shopId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopId(String value) {
        this.shopId = value;
    }

    /**
     * Obtient la valeur de la propriété paymentSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSource() {
        return paymentSource;
    }

    /**
     * Définit la valeur de la propriété paymentSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSource(String value) {
        this.paymentSource = value;
    }

    /**
     * Obtient la valeur de la propriété submissionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Définit la valeur de la propriété submissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

    /**
     * Obtient la valeur de la propriété contractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Définit la valeur de la propriété contractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Obtient la valeur de la propriété paymentToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentToken() {
        return paymentToken;
    }

    /**
     * Définit la valeur de la propriété paymentToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentToken(String value) {
        this.paymentToken = value;
    }

}

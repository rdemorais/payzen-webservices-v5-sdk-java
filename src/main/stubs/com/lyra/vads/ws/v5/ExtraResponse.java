
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour extraResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="extraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentOptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOptionOccNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extraResponse", propOrder = {
    "paymentOptionCode",
    "paymentOptionOccNumber"
})
public class ExtraResponse {

    protected String paymentOptionCode;
    protected Integer paymentOptionOccNumber;

    /**
     * Obtient la valeur de la propriété paymentOptionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOptionCode() {
        return paymentOptionCode;
    }

    /**
     * Définit la valeur de la propriété paymentOptionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOptionCode(String value) {
        this.paymentOptionCode = value;
    }

    /**
     * Obtient la valeur de la propriété paymentOptionOccNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentOptionOccNumber() {
        return paymentOptionOccNumber;
    }

    /**
     * Définit la valeur de la propriété paymentOptionOccNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentOptionOccNumber(Integer value) {
        this.paymentOptionOccNumber = value;
    }

}


package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour techRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="techRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="browserUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="browserAccept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "techRequest", propOrder = {
    "browserUserAgent",
    "browserAccept"
})
public class TechRequest {

    protected String browserUserAgent;
    protected String browserAccept;

    /**
     * Obtient la valeur de la propriété browserUserAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserUserAgent() {
        return browserUserAgent;
    }

    /**
     * Définit la valeur de la propriété browserUserAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserUserAgent(String value) {
        this.browserUserAgent = value;
    }

    /**
     * Obtient la valeur de la propriété browserAccept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserAccept() {
        return browserAccept;
    }

    /**
     * Définit la valeur de la propriété browserAccept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserAccept(String value) {
        this.browserAccept = value;
    }

}

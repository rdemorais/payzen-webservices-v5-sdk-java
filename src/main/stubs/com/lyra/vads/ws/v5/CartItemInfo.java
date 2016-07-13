
package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour cartItemInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="cartItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://v5.ws.vads.lyra.com/}productType" minOccurs="0"/>
 *         &lt;element name="productRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productVat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productExtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartItemInfo", propOrder = {
    "productLabel",
    "productType",
    "productRef",
    "productQty",
    "productAmount",
    "productVat",
    "productExtId"
})
public class CartItemInfo {

    protected String productLabel;
    protected ProductType productType;
    protected String productRef;
    protected Integer productQty;
    protected String productAmount;
    protected String productVat;
    protected String productExtId;

    /**
     * Obtient la valeur de la propriété productLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLabel() {
        return productLabel;
    }

    /**
     * Définit la valeur de la propriété productLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLabel(String value) {
        this.productLabel = value;
    }

    /**
     * Obtient la valeur de la propriété productType.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Définit la valeur de la propriété productType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Obtient la valeur de la propriété productRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductRef() {
        return productRef;
    }

    /**
     * Définit la valeur de la propriété productRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductRef(String value) {
        this.productRef = value;
    }

    /**
     * Obtient la valeur de la propriété productQty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductQty() {
        return productQty;
    }

    /**
     * Définit la valeur de la propriété productQty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductQty(Integer value) {
        this.productQty = value;
    }

    /**
     * Obtient la valeur de la propriété productAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAmount() {
        return productAmount;
    }

    /**
     * Définit la valeur de la propriété productAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAmount(String value) {
        this.productAmount = value;
    }

    /**
     * Obtient la valeur de la propriété productVat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVat() {
        return productVat;
    }

    /**
     * Définit la valeur de la propriété productVat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVat(String value) {
        this.productVat = value;
    }

    /**
     * Obtient la valeur de la propriété productExtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductExtId() {
        return productExtId;
    }

    /**
     * Définit la valeur de la propriété productExtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductExtId(String value) {
        this.productExtId = value;
    }

}

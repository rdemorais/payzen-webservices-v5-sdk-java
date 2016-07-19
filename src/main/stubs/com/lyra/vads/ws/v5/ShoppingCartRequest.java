
package com.lyra.vads.ws.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour shoppingCartRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="shoppingCartRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shippingAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cartItemInfo" type="{http://v5.ws.vads.lyra.com/}cartItemInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shoppingCartRequest", propOrder = {
    "insuranceAmount",
    "shippingAmount",
    "taxAmount",
    "cartItemInfo"
})
public class ShoppingCartRequest {

    protected long insuranceAmount;
    protected long shippingAmount;
    protected long taxAmount;
    @XmlElement(required = true)
    protected List<CartItemInfo> cartItemInfo;

    /**
     * Obtient la valeur de la propriété insuranceAmount.
     * 
     */
    public long getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Définit la valeur de la propriété insuranceAmount.
     * 
     */
    public void setInsuranceAmount(long value) {
        this.insuranceAmount = value;
    }

    /**
     * Obtient la valeur de la propriété shippingAmount.
     * 
     */
    public long getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Définit la valeur de la propriété shippingAmount.
     * 
     */
    public void setShippingAmount(long value) {
        this.shippingAmount = value;
    }

    /**
     * Obtient la valeur de la propriété taxAmount.
     * 
     */
    public long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Définit la valeur de la propriété taxAmount.
     * 
     */
    public void setTaxAmount(long value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the cartItemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartItemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartItemInfo }
     * 
     * 
     */
    public List<CartItemInfo> getCartItemInfo() {
        if (cartItemInfo == null) {
            cartItemInfo = new ArrayList<CartItemInfo>();
        }
        return this.cartItemInfo;
    }

}


package com.lyra.vads.ws.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deliverySpeed.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="deliverySpeed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="EXPRESS"/>
 *     &lt;enumeration value="PRIORITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deliverySpeed")
@XmlEnum
public enum DeliverySpeed {

    STANDARD,
    EXPRESS,
    PRIORITY;

    public String value() {
        return name();
    }

    public static DeliverySpeed fromValue(String v) {
        return valueOf(v);
    }

}


package org.w3._2001.xmlschema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for negativeInteger simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="negativeInteger">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonPositiveInteger">
 *     &lt;maxInclusive value="-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "negativeInteger", propOrder = {
    "value"
})
public class NegativeInteger
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    @XmlSchemaType(name = "negativeInteger")
    protected NonPositiveInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NonPositiveInteger }
     *     
     */
    public NonPositiveInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPositiveInteger }
     *     
     */
    public void setValue(NonPositiveInteger value) {
        this.value = value;
    }

}


package org.w3._2001.xmlschema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for unsignedLong simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="unsignedLong">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *     &lt;maxInclusive value="18446744073709551615"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unsignedLong", propOrder = {
    "value"
})
public class UnsignedLong
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    @XmlSchemaType(name = "unsignedLong")
    protected NonNegativeInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger }
     *     
     */
    public NonNegativeInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger }
     *     
     */
    public void setValue(NonNegativeInteger value) {
        this.value = value;
    }

}

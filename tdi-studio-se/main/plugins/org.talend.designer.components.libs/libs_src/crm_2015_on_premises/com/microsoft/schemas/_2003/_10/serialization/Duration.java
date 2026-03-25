
package com.microsoft.schemas._2003._10.serialization;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for duration simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="duration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}duration">
 *     &lt;pattern value="\-?P(\d*D)?(T(\d*H)?(\d*M)?(\d*(\.\d*)?S)?)?"/>
 *     &lt;minInclusive value="-P10675199DT2H48M5.4775808S"/>
 *     &lt;maxInclusive value="P10675199DT2H48M5.4775807S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duration", propOrder = {
    "value"
})
public class Duration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected javax.xml.datatype.Duration value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public javax.xml.datatype.Duration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setValue(javax.xml.datatype.Duration value) {
        this.value = value;
    }

}

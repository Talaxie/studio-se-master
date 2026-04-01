
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringanyType;


/**
 * <p>Java class for InputArgumentCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputArgumentCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arguments" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringanyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputArgumentCollection", propOrder = {
    "arguments"
})
public class InputArgumentCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Arguments", nillable = true)
    protected ArrayOfKeyValuePairOfstringanyType arguments;

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringanyType }
     *     
     */
    public ArrayOfKeyValuePairOfstringanyType getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringanyType }
     *     
     */
    public void setArguments(ArrayOfKeyValuePairOfstringanyType value) {
        this.arguments = value;
    }

}

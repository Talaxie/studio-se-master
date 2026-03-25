
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOptionSetValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOptionSetValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionSetValue" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OptionSetValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionSetValue", propOrder = {
    "optionSetValues"
})
public class ArrayOfOptionSetValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OptionSetValue", nillable = true)
    protected List<OptionSetValue> optionSetValues;

    /**
     * Gets the value of the optionSetValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionSetValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionSetValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionSetValue }
     * 
     * 
     */
    public List<OptionSetValue> getOptionSetValues() {
        if (optionSetValues == null) {
            optionSetValues = new ArrayList<OptionSetValue>();
        }
        return this.optionSetValues;
    }

}

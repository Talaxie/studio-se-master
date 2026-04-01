
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIntegerFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIntegerFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntegerFormat" type="{http://schemas.microsoft.com/xrm/2011/Metadata}IntegerFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIntegerFormat", propOrder = {
    "integerFormats"
})
public class ArrayOfIntegerFormat
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IntegerFormat")
    protected List<IntegerFormat> integerFormats;

    /**
     * Gets the value of the integerFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerFormat }
     * 
     * 
     */
    public List<IntegerFormat> getIntegerFormats() {
        if (integerFormats == null) {
            integerFormats = new ArrayList<IntegerFormat>();
        }
        return this.integerFormats;
    }

}

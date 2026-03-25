
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDateTimeFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDateTimeFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTimeFormat" type="{http://schemas.microsoft.com/xrm/2011/Metadata}DateTimeFormat" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDateTimeFormat", propOrder = {
    "dateTimeFormats"
})
public class ArrayOfDateTimeFormat
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DateTimeFormat")
    protected List<DateTimeFormat> dateTimeFormats;

    /**
     * Gets the value of the dateTimeFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTimeFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTimeFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeFormat }
     * 
     * 
     */
    public List<DateTimeFormat> getDateTimeFormats() {
        if (dateTimeFormats == null) {
            dateTimeFormats = new ArrayList<DateTimeFormat>();
        }
        return this.dateTimeFormats;
    }

}

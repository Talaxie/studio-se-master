
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfPrivilegeDepth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfPrivilegeDepth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfPrivilegeDepth" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfPrivilegeDepth" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfPrivilegeDepth", propOrder = {
    "arrayOfPrivilegeDepths"
})
public class ArrayOfArrayOfPrivilegeDepth
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrayOfPrivilegeDepth", nillable = true)
    protected List<ArrayOfPrivilegeDepth> arrayOfPrivilegeDepths;

    /**
     * Gets the value of the arrayOfPrivilegeDepths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfPrivilegeDepths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfPrivilegeDepths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPrivilegeDepth }
     * 
     * 
     */
    public List<ArrayOfPrivilegeDepth> getArrayOfPrivilegeDepths() {
        if (arrayOfPrivilegeDepths == null) {
            arrayOfPrivilegeDepths = new ArrayList<ArrayOfPrivilegeDepth>();
        }
        return this.arrayOfPrivilegeDepths;
    }

}

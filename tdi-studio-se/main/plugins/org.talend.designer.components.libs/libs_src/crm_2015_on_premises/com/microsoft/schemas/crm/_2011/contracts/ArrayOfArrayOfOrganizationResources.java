
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfOrganizationResources complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfOrganizationResources">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfOrganizationResources" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfOrganizationResources" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfOrganizationResources", propOrder = {
    "arrayOfOrganizationResources"
})
public class ArrayOfArrayOfOrganizationResources
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrayOfOrganizationResources", nillable = true)
    protected List<ArrayOfOrganizationResources> arrayOfOrganizationResources;

    /**
     * Gets the value of the arrayOfOrganizationResources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfOrganizationResources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfOrganizationResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOrganizationResources }
     * 
     * 
     */
    public List<ArrayOfOrganizationResources> getArrayOfOrganizationResources() {
        if (arrayOfOrganizationResources == null) {
            arrayOfOrganizationResources = new ArrayList<ArrayOfOrganizationResources>();
        }
        return this.arrayOfOrganizationResources;
    }

}

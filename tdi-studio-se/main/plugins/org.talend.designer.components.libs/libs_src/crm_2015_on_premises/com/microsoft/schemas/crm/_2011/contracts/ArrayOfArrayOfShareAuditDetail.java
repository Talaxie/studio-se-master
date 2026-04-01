
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfShareAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfShareAuditDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfShareAuditDetail" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfShareAuditDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfShareAuditDetail", propOrder = {
    "arrayOfShareAuditDetails"
})
public class ArrayOfArrayOfShareAuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrayOfShareAuditDetail", nillable = true)
    protected List<ArrayOfShareAuditDetail> arrayOfShareAuditDetails;

    /**
     * Gets the value of the arrayOfShareAuditDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfShareAuditDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfShareAuditDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfShareAuditDetail }
     * 
     * 
     */
    public List<ArrayOfShareAuditDetail> getArrayOfShareAuditDetails() {
        if (arrayOfShareAuditDetails == null) {
            arrayOfShareAuditDetails = new ArrayList<ArrayOfShareAuditDetail>();
        }
        return this.arrayOfShareAuditDetails;
    }

}

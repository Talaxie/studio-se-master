
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfUserAccessAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfUserAccessAuditDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfUserAccessAuditDetail" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfUserAccessAuditDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfUserAccessAuditDetail", propOrder = {
    "arrayOfUserAccessAuditDetails"
})
public class ArrayOfArrayOfUserAccessAuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrayOfUserAccessAuditDetail", nillable = true)
    protected List<ArrayOfUserAccessAuditDetail> arrayOfUserAccessAuditDetails;

    /**
     * Gets the value of the arrayOfUserAccessAuditDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfUserAccessAuditDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfUserAccessAuditDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfUserAccessAuditDetail }
     * 
     * 
     */
    public List<ArrayOfUserAccessAuditDetail> getArrayOfUserAccessAuditDetails() {
        if (arrayOfUserAccessAuditDetails == null) {
            arrayOfUserAccessAuditDetails = new ArrayList<ArrayOfUserAccessAuditDetail>();
        }
        return this.arrayOfUserAccessAuditDetails;
    }

}

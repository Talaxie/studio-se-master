
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRelationshipAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRelationshipAuditDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipAuditDetail" type="{http://schemas.microsoft.com/crm/2011/Contracts}RelationshipAuditDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelationshipAuditDetail", propOrder = {
    "relationshipAuditDetails"
})
public class ArrayOfRelationshipAuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelationshipAuditDetail", nillable = true)
    protected List<RelationshipAuditDetail> relationshipAuditDetails;

    /**
     * Gets the value of the relationshipAuditDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipAuditDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipAuditDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipAuditDetail }
     * 
     * 
     */
    public List<RelationshipAuditDetail> getRelationshipAuditDetails() {
        if (relationshipAuditDetails == null) {
            relationshipAuditDetails = new ArrayList<RelationshipAuditDetail>();
        }
        return this.relationshipAuditDetails;
    }

}

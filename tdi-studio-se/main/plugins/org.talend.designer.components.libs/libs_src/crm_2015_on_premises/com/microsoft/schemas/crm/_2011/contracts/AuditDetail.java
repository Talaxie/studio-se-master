
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.Entity;


/**
 * <p>Java class for AuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditRecord" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Entity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditDetail", propOrder = {
    "auditRecord"
})
@XmlSeeAlso({
    RolePrivilegeAuditDetail.class,
    UserAccessAuditDetail.class,
    ShareAuditDetail.class,
    AttributeAuditDetail.class,
    RelationshipAuditDetail.class
})
public class AuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AuditRecord", nillable = true)
    protected Entity auditRecord;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Entity }
     *     
     */
    public Entity getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Entity }
     *     
     */
    public void setAuditRecord(Entity value) {
        this.auditRecord = value;
    }

}

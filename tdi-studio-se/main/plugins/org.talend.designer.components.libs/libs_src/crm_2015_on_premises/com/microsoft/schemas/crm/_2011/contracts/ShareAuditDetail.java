
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.EntityReference;


/**
 * <p>Java class for ShareAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareAuditDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail">
 *       &lt;sequence>
 *         &lt;element name="NewPrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights" minOccurs="0"/>
 *         &lt;element name="OldPrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareAuditDetail", propOrder = {
    "newPrivileges",
    "oldPrivileges",
    "principal"
})
public class ShareAuditDetail
    extends AuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NewPrivileges")
    protected AccessRights newPrivileges;
    @XmlElement(name = "OldPrivileges")
    protected AccessRights oldPrivileges;
    @XmlElement(name = "Principal", nillable = true)
    protected EntityReference principal;

    /**
     * Gets the value of the newPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRights }
     *     
     */
    public AccessRights getNewPrivileges() {
        return newPrivileges;
    }

    /**
     * Sets the value of the newPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRights }
     *     
     */
    public void setNewPrivileges(AccessRights value) {
        this.newPrivileges = value;
    }

    /**
     * Gets the value of the oldPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRights }
     *     
     */
    public AccessRights getOldPrivileges() {
        return oldPrivileges;
    }

    /**
     * Sets the value of the oldPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRights }
     *     
     */
    public void setOldPrivileges(AccessRights value) {
        this.oldPrivileges = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link EntityReference }
     *     
     */
    public EntityReference getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityReference }
     *     
     */
    public void setPrincipal(EntityReference value) {
        this.principal = value;
    }

}

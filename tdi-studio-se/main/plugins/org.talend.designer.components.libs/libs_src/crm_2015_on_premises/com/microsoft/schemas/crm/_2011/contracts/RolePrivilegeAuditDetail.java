
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;


/**
 * <p>Java class for RolePrivilegeAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePrivilegeAuditDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail">
 *       &lt;sequence>
 *         &lt;element name="InvalidNewPrivileges" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="NewRolePrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfRolePrivilege" minOccurs="0"/>
 *         &lt;element name="OldRolePrivileges" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfRolePrivilege" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePrivilegeAuditDetail", propOrder = {
    "invalidNewPrivileges",
    "newRolePrivileges",
    "oldRolePrivileges"
})
public class RolePrivilegeAuditDetail
    extends AuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "InvalidNewPrivileges", nillable = true)
    protected ArrayOfguid invalidNewPrivileges;
    @XmlElement(name = "NewRolePrivileges", nillable = true)
    protected ArrayOfRolePrivilege newRolePrivileges;
    @XmlElement(name = "OldRolePrivileges", nillable = true)
    protected ArrayOfRolePrivilege oldRolePrivileges;

    /**
     * Gets the value of the invalidNewPrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getInvalidNewPrivileges() {
        return invalidNewPrivileges;
    }

    /**
     * Sets the value of the invalidNewPrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setInvalidNewPrivileges(ArrayOfguid value) {
        this.invalidNewPrivileges = value;
    }

    /**
     * Gets the value of the newRolePrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRolePrivilege }
     *     
     */
    public ArrayOfRolePrivilege getNewRolePrivileges() {
        return newRolePrivileges;
    }

    /**
     * Sets the value of the newRolePrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRolePrivilege }
     *     
     */
    public void setNewRolePrivileges(ArrayOfRolePrivilege value) {
        this.newRolePrivileges = value;
    }

    /**
     * Gets the value of the oldRolePrivileges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRolePrivilege }
     *     
     */
    public ArrayOfRolePrivilege getOldRolePrivileges() {
        return oldRolePrivileges;
    }

    /**
     * Sets the value of the oldRolePrivileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRolePrivilege }
     *     
     */
    public void setOldRolePrivileges(ArrayOfRolePrivilege value) {
        this.oldRolePrivileges = value;
    }

}

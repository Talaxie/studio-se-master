
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * <p>Java class for RolePrivilege complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RolePrivilege">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessUnitId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Depth" type="{http://schemas.microsoft.com/crm/2011/Contracts}PrivilegeDepth" minOccurs="0"/>
 *         &lt;element name="PrivilegeId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolePrivilege", propOrder = {
    "businessUnitId",
    "depth",
    "privilegeId"
})
public class RolePrivilege
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BusinessUnitId")
    protected Guid businessUnitId;
    @XmlElement(name = "Depth")
    protected PrivilegeDepth depth;
    @XmlElement(name = "PrivilegeId")
    protected Guid privilegeId;

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setBusinessUnitId(Guid value) {
        this.businessUnitId = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeDepth }
     *     
     */
    public PrivilegeDepth getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeDepth }
     *     
     */
    public void setDepth(PrivilegeDepth value) {
        this.depth = value;
    }

    /**
     * Gets the value of the privilegeId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getPrivilegeId() {
        return privilegeId;
    }

    /**
     * Sets the value of the privilegeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setPrivilegeId(Guid value) {
        this.privilegeId = value;
    }

}

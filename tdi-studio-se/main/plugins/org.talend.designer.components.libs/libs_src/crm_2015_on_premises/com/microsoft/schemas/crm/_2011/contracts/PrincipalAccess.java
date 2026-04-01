
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.EntityReference;


/**
 * <p>Java class for PrincipalAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalAccess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessMask" type="{http://schemas.microsoft.com/crm/2011/Contracts}AccessRights" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAccess", propOrder = {
    "accessMask",
    "principal"
})
public class PrincipalAccess
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AccessMask")
    protected AccessRights accessMask;
    @XmlElement(name = "Principal", nillable = true)
    protected EntityReference principal;

    /**
     * Gets the value of the accessMask property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRights }
     *     
     */
    public AccessRights getAccessMask() {
        return accessMask;
    }

    /**
     * Sets the value of the accessMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRights }
     *     
     */
    public void setAccessMask(AccessRights value) {
        this.accessMask = value;
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

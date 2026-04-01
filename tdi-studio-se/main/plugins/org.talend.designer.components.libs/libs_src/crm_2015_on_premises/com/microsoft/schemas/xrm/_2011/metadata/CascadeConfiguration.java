
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CascadeConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CascadeConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assign" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *         &lt;element name="Merge" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *         &lt;element name="Reparent" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *         &lt;element name="Share" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *         &lt;element name="Unshare" type="{http://schemas.microsoft.com/xrm/2011/Metadata}CascadeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CascadeConfiguration", propOrder = {
    "assign",
    "delete",
    "merge",
    "reparent",
    "share",
    "unshare"
})
public class CascadeConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Assign", nillable = true)
    protected CascadeType assign;
    @XmlElement(name = "Delete", nillable = true)
    protected CascadeType delete;
    @XmlElement(name = "Merge", nillable = true)
    protected CascadeType merge;
    @XmlElement(name = "Reparent", nillable = true)
    protected CascadeType reparent;
    @XmlElement(name = "Share", nillable = true)
    protected CascadeType share;
    @XmlElement(name = "Unshare", nillable = true)
    protected CascadeType unshare;

    /**
     * Gets the value of the assign property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getAssign() {
        return assign;
    }

    /**
     * Sets the value of the assign property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setAssign(CascadeType value) {
        this.assign = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setDelete(CascadeType value) {
        this.delete = value;
    }

    /**
     * Gets the value of the merge property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getMerge() {
        return merge;
    }

    /**
     * Sets the value of the merge property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setMerge(CascadeType value) {
        this.merge = value;
    }

    /**
     * Gets the value of the reparent property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getReparent() {
        return reparent;
    }

    /**
     * Sets the value of the reparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setReparent(CascadeType value) {
        this.reparent = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setShare(CascadeType value) {
        this.share = value;
    }

    /**
     * Gets the value of the unshare property.
     * 
     * @return
     *     possible object is
     *     {@link CascadeType }
     *     
     */
    public CascadeType getUnshare() {
        return unshare;
    }

    /**
     * Sets the value of the unshare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CascadeType }
     *     
     */
    public void setUnshare(CascadeType value) {
        this.unshare = value;
    }

}

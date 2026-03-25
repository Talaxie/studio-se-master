
package com.microsoft.schemas.xrm._2011.metadata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.Label;


/**
 * <p>Java class for AssociatedMenuConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedMenuConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Behavior" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuBehavior" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://schemas.microsoft.com/xrm/2011/Metadata}AssociatedMenuGroup" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Label" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedMenuConfiguration", propOrder = {
    "behavior",
    "group",
    "label",
    "order"
})
public class AssociatedMenuConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Behavior", nillable = true)
    protected AssociatedMenuBehavior behavior;
    @XmlElement(name = "Group", nillable = true)
    protected AssociatedMenuGroup group;
    @XmlElement(name = "Label", nillable = true)
    protected Label label;
    @XmlElement(name = "Order", nillable = true)
    protected Integer order;

    /**
     * Gets the value of the behavior property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedMenuBehavior }
     *     
     */
    public AssociatedMenuBehavior getBehavior() {
        return behavior;
    }

    /**
     * Sets the value of the behavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedMenuBehavior }
     *     
     */
    public void setBehavior(AssociatedMenuBehavior value) {
        this.behavior = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedMenuGroup }
     *     
     */
    public AssociatedMenuGroup getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedMenuGroup }
     *     
     */
    public void setGroup(AssociatedMenuGroup value) {
        this.group = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

}

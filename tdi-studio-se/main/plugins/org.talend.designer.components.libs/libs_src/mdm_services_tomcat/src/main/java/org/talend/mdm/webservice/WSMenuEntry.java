
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMenuEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMenuEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descriptions" type="{http://www.talend.com/mdm}WSMenuMenuEntriesDescriptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subMenus" type="{http://www.talend.com/mdm}WSMenuEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMenuEntry", propOrder = {
    "application",
    "context",
    "descriptions",
    "icon",
    "id",
    "subMenus"
})
public class WSMenuEntry {

    protected String application;
    protected String context;
    @XmlElement(nillable = true)
    protected List<WSMenuMenuEntriesDescriptions> descriptions;
    protected String icon;
    protected String id;
    @XmlElement(nillable = true)
    protected List<WSMenuEntry> subMenus;

    /**
     * Default no-arg constructor
     * 
     */
    public WSMenuEntry() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSMenuEntry(final String application, final String context, final List<WSMenuMenuEntriesDescriptions> descriptions, final String icon, final String id, final List<WSMenuEntry> subMenus) {
        this.application = application;
        this.context = context;
        this.descriptions = descriptions;
        this.icon = icon;
        this.id = id;
        this.subMenus = subMenus;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMenuMenuEntriesDescriptions }
     * 
     * 
     */
    public List<WSMenuMenuEntriesDescriptions> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<WSMenuMenuEntriesDescriptions>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the subMenus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subMenus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubMenus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSMenuEntry }
     * 
     * 
     */
    public List<WSMenuEntry> getSubMenus() {
        if (subMenus == null) {
            subMenus = new ArrayList<WSMenuEntry>();
        }
        return this.subMenus;
    }

}

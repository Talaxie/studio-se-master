
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBusinessConcept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBusinessConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsDescription" type="{http://www.talend.com/mdm}WSI18NString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wsLabel" type="{http://www.talend.com/mdm}WSI18NString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wsUniqueKey" type="{http://www.talend.com/mdm}WSKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBusinessConcept", propOrder = {
    "businessTemplate",
    "name",
    "wsDescription",
    "wsLabel",
    "wsUniqueKey"
})
public class WSBusinessConcept {

    protected String businessTemplate;
    protected String name;
    @XmlElement(nillable = true)
    protected List<WSI18NString> wsDescription;
    @XmlElement(nillable = true)
    protected List<WSI18NString> wsLabel;
    protected WSKey wsUniqueKey;

    /**
     * Default no-arg constructor
     * 
     */
    public WSBusinessConcept() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSBusinessConcept(final String businessTemplate, final String name, final List<WSI18NString> wsDescription, final List<WSI18NString> wsLabel, final WSKey wsUniqueKey) {
        this.businessTemplate = businessTemplate;
        this.name = name;
        this.wsDescription = wsDescription;
        this.wsLabel = wsLabel;
        this.wsUniqueKey = wsUniqueKey;
    }

    /**
     * Gets the value of the businessTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTemplate() {
        return businessTemplate;
    }

    /**
     * Sets the value of the businessTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTemplate(String value) {
        this.businessTemplate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the wsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSI18NString }
     * 
     * 
     */
    public List<WSI18NString> getWsDescription() {
        if (wsDescription == null) {
            wsDescription = new ArrayList<WSI18NString>();
        }
        return this.wsDescription;
    }

    /**
     * Gets the value of the wsLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSI18NString }
     * 
     * 
     */
    public List<WSI18NString> getWsLabel() {
        if (wsLabel == null) {
            wsLabel = new ArrayList<WSI18NString>();
        }
        return this.wsLabel;
    }

    /**
     * Gets the value of the wsUniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link WSKey }
     *     
     */
    public WSKey getWsUniqueKey() {
        return wsUniqueKey;
    }

    /**
     * Sets the value of the wsUniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSKey }
     *     
     */
    public void setWsUniqueKey(WSKey value) {
        this.wsUniqueKey = value;
    }

}

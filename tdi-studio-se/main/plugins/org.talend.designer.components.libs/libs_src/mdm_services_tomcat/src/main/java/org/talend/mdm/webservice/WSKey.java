
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldpath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="selectorpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSKey", propOrder = {
    "fieldpath",
    "selectorpath"
})
public class WSKey {

    @XmlElement(nillable = true)
    protected List<String> fieldpath;
    protected String selectorpath;

    /**
     * Default no-arg constructor
     * 
     */
    public WSKey() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSKey(final List<String> fieldpath, final String selectorpath) {
        this.fieldpath = fieldpath;
        this.selectorpath = selectorpath;
    }

    /**
     * Gets the value of the fieldpath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldpath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldpath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldpath() {
        if (fieldpath == null) {
            fieldpath = new ArrayList<String>();
        }
        return this.fieldpath;
    }

    /**
     * Gets the value of the selectorpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectorpath() {
        return selectorpath;
    }

    /**
     * Sets the value of the selectorpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectorpath(String value) {
        this.selectorpath = value;
    }

}

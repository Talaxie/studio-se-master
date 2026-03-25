
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCategoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categorySchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCategoryData", propOrder = {
    "categorySchema"
})
public class WSCategoryData {

    protected String categorySchema;

    /**
     * Default no-arg constructor
     * 
     */
    public WSCategoryData() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSCategoryData(final String categorySchema) {
        this.categorySchema = categorySchema;
    }

    /**
     * Gets the value of the categorySchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySchema() {
        return categorySchema;
    }

    /**
     * Sets the value of the categorySchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySchema(String value) {
        this.categorySchema = value;
    }

}

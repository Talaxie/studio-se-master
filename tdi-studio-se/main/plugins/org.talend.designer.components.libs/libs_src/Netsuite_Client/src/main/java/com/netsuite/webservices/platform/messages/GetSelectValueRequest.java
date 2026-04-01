
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.GetSelectValueFieldDescription;


/**
 * <p>Java class for getSelectValueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelectValueRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldDescription" type="{urn:core_2014_2.platform.webservices.netsuite.com}GetSelectValueFieldDescription"/&gt;
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueRequest", propOrder = {
    "fieldDescription",
    "pageIndex"
})
public class GetSelectValueRequest {

    @XmlElement(required = true)
    protected GetSelectValueFieldDescription fieldDescription;
    protected int pageIndex;

    /**
     * Gets the value of the fieldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public GetSelectValueFieldDescription getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Sets the value of the fieldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public void setFieldDescription(GetSelectValueFieldDescription value) {
        this.fieldDescription = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

}

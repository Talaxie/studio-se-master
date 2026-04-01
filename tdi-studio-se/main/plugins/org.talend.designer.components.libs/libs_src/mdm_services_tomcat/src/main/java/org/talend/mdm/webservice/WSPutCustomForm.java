
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutCustomForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutCustomForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsCustomForm" type="{http://www.talend.com/mdm}WSCustomForm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutCustomForm", propOrder = {
    "wsCustomForm"
})
public class WSPutCustomForm {

    protected WSCustomForm wsCustomForm;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutCustomForm() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutCustomForm(final WSCustomForm wsCustomForm) {
        this.wsCustomForm = wsCustomForm;
    }

    /**
     * Gets the value of the wsCustomForm property.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomForm }
     *     
     */
    public WSCustomForm getWsCustomForm() {
        return wsCustomForm;
    }

    /**
     * Sets the value of the wsCustomForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomForm }
     *     
     */
    public void setWsCustomForm(WSCustomForm value) {
        this.wsCustomForm = value;
    }

}

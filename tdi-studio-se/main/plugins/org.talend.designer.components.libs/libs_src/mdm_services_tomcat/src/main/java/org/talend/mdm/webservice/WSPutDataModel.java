
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutDataModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutDataModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsDataModel" type="{http://www.talend.com/mdm}WSDataModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutDataModel", propOrder = {
    "wsDataModel"
})
public class WSPutDataModel {

    protected WSDataModel wsDataModel;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutDataModel() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutDataModel(final WSDataModel wsDataModel) {
        this.wsDataModel = wsDataModel;
    }

    /**
     * Gets the value of the wsDataModel property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataModel }
     *     
     */
    public WSDataModel getWsDataModel() {
        return wsDataModel;
    }

    /**
     * Sets the value of the wsDataModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataModel }
     *     
     */
    public void setWsDataModel(WSDataModel value) {
        this.wsDataModel = value;
    }

}

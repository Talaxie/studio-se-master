
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutItemByOperatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutItemByOperatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatortype" type="{http://www.talend.com/mdm}WSOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/&gt;
 *         &lt;element name="wsDataModelPK" type="{http://www.talend.com/mdm}WSDataModelPK" minOccurs="0"/&gt;
 *         &lt;element name="xmlString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutItemByOperatorType", propOrder = {
    "operatortype",
    "wsDataClusterPK",
    "wsDataModelPK",
    "xmlString"
})
public class WSPutItemByOperatorType {

    @XmlSchemaType(name = "string")
    protected WSOperatorType operatortype;
    protected WSDataClusterPK wsDataClusterPK;
    protected WSDataModelPK wsDataModelPK;
    protected String xmlString;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutItemByOperatorType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutItemByOperatorType(final WSOperatorType operatortype, final WSDataClusterPK wsDataClusterPK, final WSDataModelPK wsDataModelPK, final String xmlString) {
        this.operatortype = operatortype;
        this.wsDataClusterPK = wsDataClusterPK;
        this.wsDataModelPK = wsDataModelPK;
        this.xmlString = xmlString;
    }

    /**
     * Gets the value of the operatortype property.
     * 
     * @return
     *     possible object is
     *     {@link WSOperatorType }
     *     
     */
    public WSOperatorType getOperatortype() {
        return operatortype;
    }

    /**
     * Sets the value of the operatortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOperatorType }
     *     
     */
    public void setOperatortype(WSOperatorType value) {
        this.operatortype = value;
    }

    /**
     * Gets the value of the wsDataClusterPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * Sets the value of the wsDataClusterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

    /**
     * Gets the value of the wsDataModelPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataModelPK }
     *     
     */
    public WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }

    /**
     * Sets the value of the wsDataModelPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataModelPK }
     *     
     */
    public void setWsDataModelPK(WSDataModelPK value) {
        this.wsDataModelPK = value;
    }

    /**
     * Gets the value of the xmlString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlString() {
        return xmlString;
    }

    /**
     * Sets the value of the xmlString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlString(String value) {
        this.xmlString = value;
    }

}

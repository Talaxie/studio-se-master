
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSProcessBytesUsingTransformerAsBackgroundJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSProcessBytesUsingTransformerAsBackgroundJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsBytes" type="{http://www.talend.com/mdm}WSByteArray" minOccurs="0"/&gt;
 *         &lt;element name="wsOutputDecisionTable" type="{http://www.talend.com/mdm}WSOutputDecisionTable" minOccurs="0"/&gt;
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}WSTransformerPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSProcessBytesUsingTransformerAsBackgroundJob", propOrder = {
    "contentType",
    "wsBytes",
    "wsOutputDecisionTable",
    "wsTransformerPK"
})
public class WSProcessBytesUsingTransformerAsBackgroundJob {

    protected String contentType;
    protected WSByteArray wsBytes;
    protected WSOutputDecisionTable wsOutputDecisionTable;
    protected WSTransformerPK wsTransformerPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSProcessBytesUsingTransformerAsBackgroundJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSProcessBytesUsingTransformerAsBackgroundJob(final String contentType, final WSByteArray wsBytes, final WSOutputDecisionTable wsOutputDecisionTable, final WSTransformerPK wsTransformerPK) {
        this.contentType = contentType;
        this.wsBytes = wsBytes;
        this.wsOutputDecisionTable = wsOutputDecisionTable;
        this.wsTransformerPK = wsTransformerPK;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the wsBytes property.
     * 
     * @return
     *     possible object is
     *     {@link WSByteArray }
     *     
     */
    public WSByteArray getWsBytes() {
        return wsBytes;
    }

    /**
     * Sets the value of the wsBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSByteArray }
     *     
     */
    public void setWsBytes(WSByteArray value) {
        this.wsBytes = value;
    }

    /**
     * Gets the value of the wsOutputDecisionTable property.
     * 
     * @return
     *     possible object is
     *     {@link WSOutputDecisionTable }
     *     
     */
    public WSOutputDecisionTable getWsOutputDecisionTable() {
        return wsOutputDecisionTable;
    }

    /**
     * Sets the value of the wsOutputDecisionTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSOutputDecisionTable }
     *     
     */
    public void setWsOutputDecisionTable(WSOutputDecisionTable value) {
        this.wsOutputDecisionTable = value;
    }

    /**
     * Gets the value of the wsTransformerPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerPK }
     *     
     */
    public WSTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }

    /**
     * Sets the value of the wsTransformerPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerPK }
     *     
     */
    public void setWsTransformerPK(WSTransformerPK value) {
        this.wsTransformerPK = value;
    }

}


package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteItemWithReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteItemWithReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invokeBeforeSaving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="operateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pushToUpdateReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsItemPK" type="{http://www.talend.com/mdm}WSItemPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteItemWithReport", propOrder = {
    "invokeBeforeSaving",
    "operateType",
    "override",
    "pushToUpdateReport",
    "source",
    "updatePath",
    "user",
    "wsItemPK"
})
public class WSDeleteItemWithReport {

    protected Boolean invokeBeforeSaving;
    protected String operateType;
    protected Boolean override;
    protected Boolean pushToUpdateReport;
    protected String source;
    protected String updatePath;
    protected String user;
    protected WSItemPK wsItemPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSDeleteItemWithReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSDeleteItemWithReport(final Boolean invokeBeforeSaving, final String operateType, final Boolean override, final Boolean pushToUpdateReport, final String source, final String updatePath, final String user, final WSItemPK wsItemPK) {
        this.invokeBeforeSaving = invokeBeforeSaving;
        this.operateType = operateType;
        this.override = override;
        this.pushToUpdateReport = pushToUpdateReport;
        this.source = source;
        this.updatePath = updatePath;
        this.user = user;
        this.wsItemPK = wsItemPK;
    }

    /**
     * Gets the value of the invokeBeforeSaving property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvokeBeforeSaving() {
        return invokeBeforeSaving;
    }

    /**
     * Sets the value of the invokeBeforeSaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvokeBeforeSaving(Boolean value) {
        this.invokeBeforeSaving = value;
    }

    /**
     * Gets the value of the operateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * Sets the value of the operateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperateType(String value) {
        this.operateType = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * Gets the value of the pushToUpdateReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPushToUpdateReport() {
        return pushToUpdateReport;
    }

    /**
     * Sets the value of the pushToUpdateReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPushToUpdateReport(Boolean value) {
        this.pushToUpdateReport = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the updatePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePath() {
        return updatePath;
    }

    /**
     * Sets the value of the updatePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePath(String value) {
        this.updatePath = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the wsItemPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSItemPK }
     *     
     */
    public WSItemPK getWsItemPK() {
        return wsItemPK;
    }

    /**
     * Sets the value of the wsItemPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSItemPK }
     *     
     */
    public void setWsItemPK(WSItemPK value) {
        this.wsItemPK = value;
    }

}

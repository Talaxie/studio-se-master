
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutItemWithCustomReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutItemWithCustomReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsPutItemWithReport" type="{http://www.talend.com/mdm}WSPutItemWithReport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutItemWithCustomReport", propOrder = {
    "user",
    "wsPutItemWithReport"
})
public class WSPutItemWithCustomReport {

    protected String user;
    protected WSPutItemWithReport wsPutItemWithReport;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutItemWithCustomReport() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutItemWithCustomReport(final String user, final WSPutItemWithReport wsPutItemWithReport) {
        this.user = user;
        this.wsPutItemWithReport = wsPutItemWithReport;
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
     * Gets the value of the wsPutItemWithReport property.
     * 
     * @return
     *     possible object is
     *     {@link WSPutItemWithReport }
     *     
     */
    public WSPutItemWithReport getWsPutItemWithReport() {
        return wsPutItemWithReport;
    }

    /**
     * Sets the value of the wsPutItemWithReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPutItemWithReport }
     *     
     */
    public void setWsPutItemWithReport(WSPutItemWithReport value) {
        this.wsPutItemWithReport = value;
    }

}

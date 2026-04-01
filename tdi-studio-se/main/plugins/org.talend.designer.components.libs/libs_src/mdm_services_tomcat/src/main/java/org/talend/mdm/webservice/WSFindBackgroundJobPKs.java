
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSFindBackgroundJobPKs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFindBackgroundJobPKs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.talend.com/mdm}BackgroundJobStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFindBackgroundJobPKs", propOrder = {
    "status"
})
public class WSFindBackgroundJobPKs {

    @XmlSchemaType(name = "string")
    protected BackgroundJobStatusType status;

    /**
     * Default no-arg constructor
     * 
     */
    public WSFindBackgroundJobPKs() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSFindBackgroundJobPKs(final BackgroundJobStatusType status) {
        this.status = status;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundJobStatusType }
     *     
     */
    public BackgroundJobStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundJobStatusType }
     *     
     */
    public void setStatus(BackgroundJobStatusType value) {
        this.status = value;
    }

}

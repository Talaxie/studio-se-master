
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBackgroundJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBackgroundJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pipeline" type="{http://www.talend.com/mdm}WSPipeline" minOccurs="0"/&gt;
 *         &lt;element name="serializedObject" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.talend.com/mdm}BackgroundJobStatusType" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBackgroundJob", propOrder = {
    "description",
    "id",
    "message",
    "percentage",
    "pipeline",
    "serializedObject",
    "status",
    "timestamp"
})
public class WSBackgroundJob {

    protected String description;
    protected String id;
    protected String message;
    protected Integer percentage;
    protected WSPipeline pipeline;
    protected byte[] serializedObject;
    @XmlSchemaType(name = "string")
    protected BackgroundJobStatusType status;
    protected String timestamp;

    /**
     * Default no-arg constructor
     * 
     */
    public WSBackgroundJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSBackgroundJob(final String description, final String id, final String message, final Integer percentage, final WSPipeline pipeline, final byte[] serializedObject, final BackgroundJobStatusType status, final String timestamp) {
        this.description = description;
        this.id = id;
        this.message = message;
        this.percentage = percentage;
        this.pipeline = pipeline;
        this.serializedObject = serializedObject;
        this.status = status;
        this.timestamp = timestamp;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentage(Integer value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link WSPipeline }
     *     
     */
    public WSPipeline getPipeline() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPipeline }
     *     
     */
    public void setPipeline(WSPipeline value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the serializedObject property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSerializedObject() {
        return serializedObject;
    }

    /**
     * Sets the value of the serializedObject property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSerializedObject(byte[] value) {
        this.serializedObject = value;
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

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}

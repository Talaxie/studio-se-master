
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutBackgroundJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutBackgroundJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsBackgroundJob" type="{http://www.talend.com/mdm}WSBackgroundJob" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutBackgroundJob", propOrder = {
    "wsBackgroundJob"
})
public class WSPutBackgroundJob {

    protected WSBackgroundJob wsBackgroundJob;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutBackgroundJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutBackgroundJob(final WSBackgroundJob wsBackgroundJob) {
        this.wsBackgroundJob = wsBackgroundJob;
    }

    /**
     * Gets the value of the wsBackgroundJob property.
     * 
     * @return
     *     possible object is
     *     {@link WSBackgroundJob }
     *     
     */
    public WSBackgroundJob getWsBackgroundJob() {
        return wsBackgroundJob;
    }

    /**
     * Sets the value of the wsBackgroundJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBackgroundJob }
     *     
     */
    public void setWsBackgroundJob(WSBackgroundJob value) {
        this.wsBackgroundJob = value;
    }

}

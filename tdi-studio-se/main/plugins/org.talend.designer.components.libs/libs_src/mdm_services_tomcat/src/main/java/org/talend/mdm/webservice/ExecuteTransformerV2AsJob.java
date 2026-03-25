
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeTransformerV2AsJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeTransformerV2AsJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.talend.com/mdm}WSExecuteTransformerV2AsJob" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeTransformerV2AsJob", propOrder = {
    "arg0"
})
public class ExecuteTransformerV2AsJob {

    protected WSExecuteTransformerV2AsJob arg0;

    /**
     * Default no-arg constructor
     * 
     */
    public ExecuteTransformerV2AsJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ExecuteTransformerV2AsJob(final WSExecuteTransformerV2AsJob arg0) {
        this.arg0 = arg0;
    }

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WSExecuteTransformerV2AsJob }
     *     
     */
    public WSExecuteTransformerV2AsJob getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExecuteTransformerV2AsJob }
     *     
     */
    public void setArg0(WSExecuteTransformerV2AsJob value) {
        this.arg0 = value;
    }

}

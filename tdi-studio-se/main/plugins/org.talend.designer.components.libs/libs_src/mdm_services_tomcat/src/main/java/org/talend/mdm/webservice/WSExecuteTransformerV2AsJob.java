
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExecuteTransformerV2AsJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExecuteTransformerV2AsJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsTransformerContext" type="{http://www.talend.com/mdm}WSTransformerContext" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExecuteTransformerV2AsJob", propOrder = {
    "wsTransformerContext"
})
public class WSExecuteTransformerV2AsJob {

    protected WSTransformerContext wsTransformerContext;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExecuteTransformerV2AsJob() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExecuteTransformerV2AsJob(final WSTransformerContext wsTransformerContext) {
        this.wsTransformerContext = wsTransformerContext;
    }

    /**
     * Gets the value of the wsTransformerContext property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContext }
     *     
     */
    public WSTransformerContext getWsTransformerContext() {
        return wsTransformerContext;
    }

    /**
     * Sets the value of the wsTransformerContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContext }
     *     
     */
    public void setWsTransformerContext(WSTransformerContext value) {
        this.wsTransformerContext = value;
    }

}

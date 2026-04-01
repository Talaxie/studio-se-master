
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pipeline" type="{http://www.talend.com/mdm}WSTransformerContextPipeline" minOccurs="0"/&gt;
 *         &lt;element name="projectedItemPKs" type="{http://www.talend.com/mdm}WSTransformerContextProjectedItemPKs" minOccurs="0"/&gt;
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}WSTransformerV2PK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContext", propOrder = {
    "pipeline",
    "projectedItemPKs",
    "wsTransformerPK"
})
public class WSTransformerContext {

    protected WSTransformerContextPipeline pipeline;
    protected WSTransformerContextProjectedItemPKs projectedItemPKs;
    protected WSTransformerV2PK wsTransformerPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerContext() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerContext(final WSTransformerContextPipeline pipeline, final WSTransformerContextProjectedItemPKs projectedItemPKs, final WSTransformerV2PK wsTransformerPK) {
        this.pipeline = pipeline;
        this.projectedItemPKs = projectedItemPKs;
        this.wsTransformerPK = wsTransformerPK;
    }

    /**
     * Gets the value of the pipeline property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContextPipeline }
     *     
     */
    public WSTransformerContextPipeline getPipeline() {
        return pipeline;
    }

    /**
     * Sets the value of the pipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContextPipeline }
     *     
     */
    public void setPipeline(WSTransformerContextPipeline value) {
        this.pipeline = value;
    }

    /**
     * Gets the value of the projectedItemPKs property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerContextProjectedItemPKs }
     *     
     */
    public WSTransformerContextProjectedItemPKs getProjectedItemPKs() {
        return projectedItemPKs;
    }

    /**
     * Sets the value of the projectedItemPKs property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerContextProjectedItemPKs }
     *     
     */
    public void setProjectedItemPKs(WSTransformerContextProjectedItemPKs value) {
        this.projectedItemPKs = value;
    }

    /**
     * Gets the value of the wsTransformerPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public WSTransformerV2PK getWsTransformerPK() {
        return wsTransformerPK;
    }

    /**
     * Sets the value of the wsTransformerPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTransformerV2PK }
     *     
     */
    public void setWsTransformerPK(WSTransformerV2PK value) {
        this.wsTransformerPK = value;
    }

}

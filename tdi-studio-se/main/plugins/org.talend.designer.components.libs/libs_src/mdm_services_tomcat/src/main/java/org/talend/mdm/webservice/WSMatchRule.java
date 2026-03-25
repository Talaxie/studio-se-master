
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMatchRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMatchRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="configurationXmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PK" type="{http://www.talend.com/mdm}WSMatchRulePK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMatchRule", propOrder = {
    "configurationXmlContent",
    "pk"
})
public class WSMatchRule {

    protected String configurationXmlContent;
    @XmlElement(name = "PK")
    protected WSMatchRulePK pk;

    /**
     * Default no-arg constructor
     * 
     */
    public WSMatchRule() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSMatchRule(final String configurationXmlContent, final WSMatchRulePK pk) {
        this.configurationXmlContent = configurationXmlContent;
        this.pk = pk;
    }

    /**
     * Gets the value of the configurationXmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationXmlContent() {
        return configurationXmlContent;
    }

    /**
     * Sets the value of the configurationXmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationXmlContent(String value) {
        this.configurationXmlContent = value;
    }

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link WSMatchRulePK }
     *     
     */
    public WSMatchRulePK getPK() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMatchRulePK }
     *     
     */
    public void setPK(WSMatchRulePK value) {
        this.pk = value;
    }

}

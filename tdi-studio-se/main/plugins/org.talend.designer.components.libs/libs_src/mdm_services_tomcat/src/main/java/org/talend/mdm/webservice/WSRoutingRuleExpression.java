
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoutingRuleExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoutingRuleExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsOperator" type="{http://www.talend.com/mdm}WSRoutingRuleOperator" minOccurs="0"/&gt;
 *         &lt;element name="xpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoutingRuleExpression", propOrder = {
    "name",
    "value",
    "wsOperator",
    "xpath"
})
public class WSRoutingRuleExpression {

    protected String name;
    protected String value;
    @XmlSchemaType(name = "string")
    protected WSRoutingRuleOperator wsOperator;
    protected String xpath;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoutingRuleExpression() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoutingRuleExpression(final String name, final String value, final WSRoutingRuleOperator wsOperator, final String xpath) {
        this.name = name;
        this.value = value;
        this.wsOperator = wsOperator;
        this.xpath = xpath;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the wsOperator property.
     * 
     * @return
     *     possible object is
     *     {@link WSRoutingRuleOperator }
     *     
     */
    public WSRoutingRuleOperator getWsOperator() {
        return wsOperator;
    }

    /**
     * Sets the value of the wsOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRoutingRuleOperator }
     *     
     */
    public void setWsOperator(WSRoutingRuleOperator value) {
        this.wsOperator = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpath(String value) {
        this.xpath = value;
    }

}

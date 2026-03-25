
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWhereCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWhereCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://www.talend.com/mdm}WSWhereOperator" minOccurs="0"/&gt;
 *         &lt;element name="rightValueOrPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="spellCheck" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="stringPredicate" type="{http://www.talend.com/mdm}WSStringPredicate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereCondition", propOrder = {
    "leftPath",
    "operator",
    "rightValueOrPath",
    "spellCheck",
    "stringPredicate"
})
public class WSWhereCondition {

    protected String leftPath;
    @XmlSchemaType(name = "string")
    protected WSWhereOperator operator;
    protected String rightValueOrPath;
    protected boolean spellCheck;
    @XmlSchemaType(name = "string")
    protected WSStringPredicate stringPredicate;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWhereCondition() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWhereCondition(final String leftPath, final WSWhereOperator operator, final String rightValueOrPath, final boolean spellCheck, final WSStringPredicate stringPredicate) {
        this.leftPath = leftPath;
        this.operator = operator;
        this.rightValueOrPath = rightValueOrPath;
        this.spellCheck = spellCheck;
        this.stringPredicate = stringPredicate;
    }

    /**
     * Gets the value of the leftPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftPath() {
        return leftPath;
    }

    /**
     * Sets the value of the leftPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftPath(String value) {
        this.leftPath = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link WSWhereOperator }
     *     
     */
    public WSWhereOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereOperator }
     *     
     */
    public void setOperator(WSWhereOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the rightValueOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightValueOrPath() {
        return rightValueOrPath;
    }

    /**
     * Sets the value of the rightValueOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightValueOrPath(String value) {
        this.rightValueOrPath = value;
    }

    /**
     * Gets the value of the spellCheck property.
     * 
     */
    public boolean isSpellCheck() {
        return spellCheck;
    }

    /**
     * Sets the value of the spellCheck property.
     * 
     */
    public void setSpellCheck(boolean value) {
        this.spellCheck = value;
    }

    /**
     * Gets the value of the stringPredicate property.
     * 
     * @return
     *     possible object is
     *     {@link WSStringPredicate }
     *     
     */
    public WSStringPredicate getStringPredicate() {
        return stringPredicate;
    }

    /**
     * Sets the value of the stringPredicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStringPredicate }
     *     
     */
    public void setStringPredicate(WSStringPredicate value) {
        this.stringPredicate = value;
    }

}

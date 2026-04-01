
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSWhereItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSWhereItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="whereAnd" type="{http://www.talend.com/mdm}WSWhereAnd" minOccurs="0"/&gt;
 *         &lt;element name="whereCondition" type="{http://www.talend.com/mdm}WSWhereCondition" minOccurs="0"/&gt;
 *         &lt;element name="whereOr" type="{http://www.talend.com/mdm}WSWhereOr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSWhereItem", propOrder = {
    "whereAnd",
    "whereCondition",
    "whereOr"
})
public class WSWhereItem {

    protected WSWhereAnd whereAnd;
    protected WSWhereCondition whereCondition;
    protected WSWhereOr whereOr;

    /**
     * Default no-arg constructor
     * 
     */
    public WSWhereItem() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSWhereItem(final WSWhereAnd whereAnd, final WSWhereCondition whereCondition, final WSWhereOr whereOr) {
        this.whereAnd = whereAnd;
        this.whereCondition = whereCondition;
        this.whereOr = whereOr;
    }

    /**
     * Gets the value of the whereAnd property.
     * 
     * @return
     *     possible object is
     *     {@link WSWhereAnd }
     *     
     */
    public WSWhereAnd getWhereAnd() {
        return whereAnd;
    }

    /**
     * Sets the value of the whereAnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereAnd }
     *     
     */
    public void setWhereAnd(WSWhereAnd value) {
        this.whereAnd = value;
    }

    /**
     * Gets the value of the whereCondition property.
     * 
     * @return
     *     possible object is
     *     {@link WSWhereCondition }
     *     
     */
    public WSWhereCondition getWhereCondition() {
        return whereCondition;
    }

    /**
     * Sets the value of the whereCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereCondition }
     *     
     */
    public void setWhereCondition(WSWhereCondition value) {
        this.whereCondition = value;
    }

    /**
     * Gets the value of the whereOr property.
     * 
     * @return
     *     possible object is
     *     {@link WSWhereOr }
     *     
     */
    public WSWhereOr getWhereOr() {
        return whereOr;
    }

    /**
     * Sets the value of the whereOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereOr }
     *     
     */
    public void setWhereOr(WSWhereOr value) {
        this.whereOr = value;
    }

}

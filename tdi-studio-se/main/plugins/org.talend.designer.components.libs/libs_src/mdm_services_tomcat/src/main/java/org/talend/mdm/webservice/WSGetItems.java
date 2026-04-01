
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalCountOnFirstResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="whereItem" type="{http://www.talend.com/mdm}WSWhereItem" minOccurs="0"/&gt;
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetItems", propOrder = {
    "conceptName",
    "maxItems",
    "skip",
    "spellTreshold",
    "totalCountOnFirstResult",
    "whereItem",
    "wsDataClusterPK"
})
public class WSGetItems {

    protected String conceptName;
    protected int maxItems;
    protected int skip;
    protected int spellTreshold;
    protected Boolean totalCountOnFirstResult;
    protected WSWhereItem whereItem;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSGetItems() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSGetItems(final String conceptName, final int maxItems, final int skip, final int spellTreshold, final Boolean totalCountOnFirstResult, final WSWhereItem whereItem, final WSDataClusterPK wsDataClusterPK) {
        this.conceptName = conceptName;
        this.maxItems = maxItems;
        this.skip = skip;
        this.spellTreshold = spellTreshold;
        this.totalCountOnFirstResult = totalCountOnFirstResult;
        this.whereItem = whereItem;
        this.wsDataClusterPK = wsDataClusterPK;
    }

    /**
     * Gets the value of the conceptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptName() {
        return conceptName;
    }

    /**
     * Sets the value of the conceptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptName(String value) {
        this.conceptName = value;
    }

    /**
     * Gets the value of the maxItems property.
     * 
     */
    public int getMaxItems() {
        return maxItems;
    }

    /**
     * Sets the value of the maxItems property.
     * 
     */
    public void setMaxItems(int value) {
        this.maxItems = value;
    }

    /**
     * Gets the value of the skip property.
     * 
     */
    public int getSkip() {
        return skip;
    }

    /**
     * Sets the value of the skip property.
     * 
     */
    public void setSkip(int value) {
        this.skip = value;
    }

    /**
     * Gets the value of the spellTreshold property.
     * 
     */
    public int getSpellTreshold() {
        return spellTreshold;
    }

    /**
     * Sets the value of the spellTreshold property.
     * 
     */
    public void setSpellTreshold(int value) {
        this.spellTreshold = value;
    }

    /**
     * Gets the value of the totalCountOnFirstResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTotalCountOnFirstResult() {
        return totalCountOnFirstResult;
    }

    /**
     * Sets the value of the totalCountOnFirstResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTotalCountOnFirstResult(Boolean value) {
        this.totalCountOnFirstResult = value;
    }

    /**
     * Gets the value of the whereItem property.
     * 
     * @return
     *     possible object is
     *     {@link WSWhereItem }
     *     
     */
    public WSWhereItem getWhereItem() {
        return whereItem;
    }

    /**
     * Sets the value of the whereItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSWhereItem }
     *     
     */
    public void setWhereItem(WSWhereItem value) {
        this.whereItem = value;
    }

    /**
     * Gets the value of the wsDataClusterPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * Sets the value of the wsDataClusterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

}

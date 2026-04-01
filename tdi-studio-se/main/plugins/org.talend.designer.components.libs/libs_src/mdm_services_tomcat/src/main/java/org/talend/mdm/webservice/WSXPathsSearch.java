
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSXPathsSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSXPathsSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pivotPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="spellTreshold" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="viewablePaths" type="{http://www.talend.com/mdm}WSStringArray" minOccurs="0"/&gt;
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
@XmlType(name = "WSXPathsSearch", propOrder = {
    "direction",
    "maxItems",
    "orderBy",
    "pivotPath",
    "returnCount",
    "skip",
    "spellTreshold",
    "viewablePaths",
    "whereItem",
    "wsDataClusterPK"
})
public class WSXPathsSearch {

    protected String direction;
    protected int maxItems;
    protected String orderBy;
    protected String pivotPath;
    protected Boolean returnCount;
    protected int skip;
    protected int spellTreshold;
    protected WSStringArray viewablePaths;
    protected WSWhereItem whereItem;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSXPathsSearch() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSXPathsSearch(final String direction, final int maxItems, final String orderBy, final String pivotPath, final Boolean returnCount, final int skip, final int spellTreshold, final WSStringArray viewablePaths, final WSWhereItem whereItem, final WSDataClusterPK wsDataClusterPK) {
        this.direction = direction;
        this.maxItems = maxItems;
        this.orderBy = orderBy;
        this.pivotPath = pivotPath;
        this.returnCount = returnCount;
        this.skip = skip;
        this.spellTreshold = spellTreshold;
        this.viewablePaths = viewablePaths;
        this.whereItem = whereItem;
        this.wsDataClusterPK = wsDataClusterPK;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the pivotPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPivotPath() {
        return pivotPath;
    }

    /**
     * Sets the value of the pivotPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPivotPath(String value) {
        this.pivotPath = value;
    }

    /**
     * Gets the value of the returnCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnCount() {
        return returnCount;
    }

    /**
     * Sets the value of the returnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnCount(Boolean value) {
        this.returnCount = value;
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
     * Gets the value of the viewablePaths property.
     * 
     * @return
     *     possible object is
     *     {@link WSStringArray }
     *     
     */
    public WSStringArray getViewablePaths() {
        return viewablePaths;
    }

    /**
     * Sets the value of the viewablePaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStringArray }
     *     
     */
    public void setViewablePaths(WSStringArray value) {
        this.viewablePaths = value;
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

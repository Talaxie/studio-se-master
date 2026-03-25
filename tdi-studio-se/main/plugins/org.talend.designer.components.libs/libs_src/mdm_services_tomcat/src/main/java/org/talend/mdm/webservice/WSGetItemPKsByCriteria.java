
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetItemPKsByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetItemPKsByCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contentKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="keys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keysKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxItems" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="skip" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "WSGetItemPKsByCriteria", propOrder = {
    "conceptName",
    "contentKeywords",
    "fromDate",
    "keys",
    "keysKeywords",
    "maxItems",
    "skip",
    "toDate",
    "wsDataClusterPK"
})
public class WSGetItemPKsByCriteria {

    protected String conceptName;
    protected String contentKeywords;
    protected Long fromDate;
    protected String keys;
    protected String keysKeywords;
    protected int maxItems;
    protected int skip;
    protected Long toDate;
    protected WSDataClusterPK wsDataClusterPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSGetItemPKsByCriteria() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSGetItemPKsByCriteria(final String conceptName, final String contentKeywords, final Long fromDate, final String keys, final String keysKeywords, final int maxItems, final int skip, final Long toDate, final WSDataClusterPK wsDataClusterPK) {
        this.conceptName = conceptName;
        this.contentKeywords = contentKeywords;
        this.fromDate = fromDate;
        this.keys = keys;
        this.keysKeywords = keysKeywords;
        this.maxItems = maxItems;
        this.skip = skip;
        this.toDate = toDate;
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
     * Gets the value of the contentKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentKeywords() {
        return contentKeywords;
    }

    /**
     * Sets the value of the contentKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentKeywords(String value) {
        this.contentKeywords = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFromDate(Long value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeys(String value) {
        this.keys = value;
    }

    /**
     * Gets the value of the keysKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeysKeywords() {
        return keysKeywords;
    }

    /**
     * Sets the value of the keysKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeysKeywords(String value) {
        this.keysKeywords = value;
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
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToDate(Long value) {
        this.toDate = value;
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

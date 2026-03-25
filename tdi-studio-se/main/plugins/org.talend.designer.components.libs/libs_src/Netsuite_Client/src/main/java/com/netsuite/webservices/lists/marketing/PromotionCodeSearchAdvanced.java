
package com.netsuite.webservices.lists.marketing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for PromotionCodeSearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionCodeSearchAdvanced"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{urn:marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeSearch" minOccurs="0"/&gt;
 *         &lt;element name="columns" type="{urn:marketing_2014_2.lists.webservices.netsuite.com}PromotionCodeSearchRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionCodeSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class PromotionCodeSearchAdvanced
    extends SearchRecord
{

    protected PromotionCodeSearch criteria;
    protected PromotionCodeSearchRow columns;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeSearch }
     *     
     */
    public PromotionCodeSearch getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeSearch }
     *     
     */
    public void setCriteria(PromotionCodeSearch value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionCodeSearchRow }
     *     
     */
    public PromotionCodeSearchRow getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionCodeSearchRow }
     *     
     */
    public void setColumns(PromotionCodeSearchRow value) {
        this.columns = value;
    }

    /**
     * Gets the value of the savedSearchScriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * Sets the value of the savedSearchScriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

    /**
     * Gets the value of the savedSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Sets the value of the savedSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

}

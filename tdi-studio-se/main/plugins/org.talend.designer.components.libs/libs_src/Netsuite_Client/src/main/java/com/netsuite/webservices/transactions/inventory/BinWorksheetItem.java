
package com.netsuite.webservices.transactions.inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.InventoryDetail;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for BinWorksheetItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinWorksheetItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="itemOnHand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemUnitsLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetail" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryDetail" minOccurs="0"/&gt;
 *         &lt;element name="itemBins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemBinNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemBinList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemPreferBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemBlank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinWorksheetItem", propOrder = {
    "item",
    "itemName",
    "description",
    "quantity",
    "itemOnHand",
    "itemUnitsLabel",
    "inventoryDetail",
    "itemBins",
    "itemBinNumbers",
    "itemBinList",
    "itemPreferBin",
    "itemBlank"
})
public class BinWorksheetItem {

    protected RecordRef item;
    protected String itemName;
    protected String description;
    protected Double quantity;
    protected String itemOnHand;
    protected String itemUnitsLabel;
    protected InventoryDetail inventoryDetail;
    protected String itemBins;
    protected String itemBinNumbers;
    protected String itemBinList;
    protected String itemPreferBin;
    protected String itemBlank;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setItem(RecordRef value) {
        this.item = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the itemOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOnHand() {
        return itemOnHand;
    }

    /**
     * Sets the value of the itemOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOnHand(String value) {
        this.itemOnHand = value;
    }

    /**
     * Gets the value of the itemUnitsLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnitsLabel() {
        return itemUnitsLabel;
    }

    /**
     * Sets the value of the itemUnitsLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnitsLabel(String value) {
        this.itemUnitsLabel = value;
    }

    /**
     * Gets the value of the inventoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetail }
     *     
     */
    public InventoryDetail getInventoryDetail() {
        return inventoryDetail;
    }

    /**
     * Sets the value of the inventoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetail }
     *     
     */
    public void setInventoryDetail(InventoryDetail value) {
        this.inventoryDetail = value;
    }

    /**
     * Gets the value of the itemBins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBins() {
        return itemBins;
    }

    /**
     * Sets the value of the itemBins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBins(String value) {
        this.itemBins = value;
    }

    /**
     * Gets the value of the itemBinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBinNumbers() {
        return itemBinNumbers;
    }

    /**
     * Sets the value of the itemBinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBinNumbers(String value) {
        this.itemBinNumbers = value;
    }

    /**
     * Gets the value of the itemBinList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBinList() {
        return itemBinList;
    }

    /**
     * Sets the value of the itemBinList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBinList(String value) {
        this.itemBinList = value;
    }

    /**
     * Gets the value of the itemPreferBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPreferBin() {
        return itemPreferBin;
    }

    /**
     * Sets the value of the itemPreferBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPreferBin(String value) {
        this.itemPreferBin = value;
    }

    /**
     * Gets the value of the itemBlank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemBlank() {
        return itemBlank;
    }

    /**
     * Sets the value of the itemBlank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemBlank(String value) {
        this.itemBlank = value;
    }

}

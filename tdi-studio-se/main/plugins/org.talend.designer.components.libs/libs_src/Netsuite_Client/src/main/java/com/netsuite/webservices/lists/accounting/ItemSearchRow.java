
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.BinSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.FileSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryDetailSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryNumberBinSearchRowBasic;
import com.netsuite.webservices.platform.common.InventoryNumberSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemBinNumberSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemRevisionSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common.PricingSearchRowBasic;
import com.netsuite.webservices.platform.common.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for ItemSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="binNumberJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}BinSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemBinNumberSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="effectiveRevisionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryDetailSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryNumberJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryNumberSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryNumberBinOnHandJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryNumberBinSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="memberItemJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteRevisionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemRevisionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="parentJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="pricingJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}PricingSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="shopperJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchRow", propOrder = {
    "basic",
    "binNumberJoin",
    "binOnHandJoin",
    "correlatedItemJoin",
    "effectiveRevisionJoin",
    "fileJoin",
    "inventoryDetailJoin",
    "inventoryLocationJoin",
    "inventoryNumberJoin",
    "inventoryNumberBinOnHandJoin",
    "memberItemJoin",
    "obsoleteRevisionJoin",
    "parentJoin",
    "preferredLocationJoin",
    "preferredVendorJoin",
    "pricingJoin",
    "shopperJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "customSearchJoin"
})
public class ItemSearchRow
    extends SearchRow
{

    protected ItemSearchRowBasic basic;
    protected BinSearchRowBasic binNumberJoin;
    protected ItemBinNumberSearchRowBasic binOnHandJoin;
    protected ItemSearchRowBasic correlatedItemJoin;
    protected ItemRevisionSearchRowBasic effectiveRevisionJoin;
    protected FileSearchRowBasic fileJoin;
    protected InventoryDetailSearchRowBasic inventoryDetailJoin;
    protected LocationSearchRowBasic inventoryLocationJoin;
    protected InventoryNumberSearchRowBasic inventoryNumberJoin;
    protected InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin;
    protected ItemSearchRowBasic memberItemJoin;
    protected ItemRevisionSearchRowBasic obsoleteRevisionJoin;
    protected ItemSearchRowBasic parentJoin;
    protected LocationSearchRowBasic preferredLocationJoin;
    protected VendorSearchRowBasic preferredVendorJoin;
    protected PricingSearchRowBasic pricingJoin;
    protected CustomerSearchRowBasic shopperJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected VendorSearchRowBasic vendorJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setBasic(ItemSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchRowBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the binOnHandJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemBinNumberSearchRowBasic }
     *     
     */
    public ItemBinNumberSearchRowBasic getBinOnHandJoin() {
        return binOnHandJoin;
    }

    /**
     * Sets the value of the binOnHandJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBinNumberSearchRowBasic }
     *     
     */
    public void setBinOnHandJoin(ItemBinNumberSearchRowBasic value) {
        this.binOnHandJoin = value;
    }

    /**
     * Gets the value of the correlatedItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getCorrelatedItemJoin() {
        return correlatedItemJoin;
    }

    /**
     * Sets the value of the correlatedItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setCorrelatedItemJoin(ItemSearchRowBasic value) {
        this.correlatedItemJoin = value;
    }

    /**
     * Gets the value of the effectiveRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getEffectiveRevisionJoin() {
        return effectiveRevisionJoin;
    }

    /**
     * Sets the value of the effectiveRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setEffectiveRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.effectiveRevisionJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchRowBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the inventoryLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * Sets the value of the inventoryLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchRowBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * Gets the value of the inventoryNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public InventoryNumberSearchRowBasic getInventoryNumberJoin() {
        return inventoryNumberJoin;
    }

    /**
     * Sets the value of the inventoryNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchRowBasic }
     *     
     */
    public void setInventoryNumberJoin(InventoryNumberSearchRowBasic value) {
        this.inventoryNumberJoin = value;
    }

    /**
     * Gets the value of the inventoryNumberBinOnHandJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberBinSearchRowBasic }
     *     
     */
    public InventoryNumberBinSearchRowBasic getInventoryNumberBinOnHandJoin() {
        return inventoryNumberBinOnHandJoin;
    }

    /**
     * Sets the value of the inventoryNumberBinOnHandJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberBinSearchRowBasic }
     *     
     */
    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchRowBasic value) {
        this.inventoryNumberBinOnHandJoin = value;
    }

    /**
     * Gets the value of the memberItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * Sets the value of the memberItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchRowBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * Gets the value of the obsoleteRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public ItemRevisionSearchRowBasic getObsoleteRevisionJoin() {
        return obsoleteRevisionJoin;
    }

    /**
     * Sets the value of the obsoleteRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchRowBasic }
     *     
     */
    public void setObsoleteRevisionJoin(ItemRevisionSearchRowBasic value) {
        this.obsoleteRevisionJoin = value;
    }

    /**
     * Gets the value of the parentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * Sets the value of the parentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setParentJoin(ItemSearchRowBasic value) {
        this.parentJoin = value;
    }

    /**
     * Gets the value of the preferredLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * Sets the value of the preferredLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchRowBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * Gets the value of the preferredVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * Sets the value of the preferredVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchRowBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * Gets the value of the pricingJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public PricingSearchRowBasic getPricingJoin() {
        return pricingJoin;
    }

    /**
     * Sets the value of the pricingJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSearchRowBasic }
     *     
     */
    public void setPricingJoin(PricingSearchRowBasic value) {
        this.pricingJoin = value;
    }

    /**
     * Gets the value of the shopperJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * Sets the value of the shopperJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchRowBasic value) {
        this.shopperJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}

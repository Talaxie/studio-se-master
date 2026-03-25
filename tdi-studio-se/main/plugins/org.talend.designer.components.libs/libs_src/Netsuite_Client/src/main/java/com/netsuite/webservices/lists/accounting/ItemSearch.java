
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.BinSearchBasic;
import com.netsuite.webservices.platform.common.CustomSearchJoin;
import com.netsuite.webservices.platform.common.CustomerSearchBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common.FileSearchBasic;
import com.netsuite.webservices.platform.common.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common.InventoryNumberBinSearchBasic;
import com.netsuite.webservices.platform.common.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common.ItemBinNumberSearchBasic;
import com.netsuite.webservices.platform.common.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common.ItemSearchBasic;
import com.netsuite.webservices.platform.common.LocationSearchBasic;
import com.netsuite.webservices.platform.common.NoteSearchBasic;
import com.netsuite.webservices.platform.common.PricingSearchBasic;
import com.netsuite.webservices.platform.common.TransactionSearchBasic;
import com.netsuite.webservices.platform.common.VendorSearchBasic;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for ItemSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="binNumberJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="binOnHandJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemBinNumberSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="correlatedItemJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="effectiveRevisionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="fileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryDetailJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryDetailSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryNumberJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryNumberSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="inventoryNumberBinOnHandJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}InventoryNumberBinSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="memberItemJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="obsoleteRevisionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemRevisionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="parentJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="pricingJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}PricingSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="shopperJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="transactionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userNotesJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="vendorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearch", propOrder = {
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
public class ItemSearch
    extends SearchRecord
{

    protected ItemSearchBasic basic;
    protected BinSearchBasic binNumberJoin;
    protected ItemBinNumberSearchBasic binOnHandJoin;
    protected ItemSearchBasic correlatedItemJoin;
    protected ItemRevisionSearchBasic effectiveRevisionJoin;
    protected FileSearchBasic fileJoin;
    protected InventoryDetailSearchBasic inventoryDetailJoin;
    protected LocationSearchBasic inventoryLocationJoin;
    protected InventoryNumberSearchBasic inventoryNumberJoin;
    protected InventoryNumberBinSearchBasic inventoryNumberBinOnHandJoin;
    protected ItemSearchBasic memberItemJoin;
    protected ItemRevisionSearchBasic obsoleteRevisionJoin;
    protected ItemSearchBasic parentJoin;
    protected LocationSearchBasic preferredLocationJoin;
    protected VendorSearchBasic preferredVendorJoin;
    protected PricingSearchBasic pricingJoin;
    protected CustomerSearchBasic shopperJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setBasic(ItemSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the binOnHandJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemBinNumberSearchBasic }
     *     
     */
    public ItemBinNumberSearchBasic getBinOnHandJoin() {
        return binOnHandJoin;
    }

    /**
     * Sets the value of the binOnHandJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBinNumberSearchBasic }
     *     
     */
    public void setBinOnHandJoin(ItemBinNumberSearchBasic value) {
        this.binOnHandJoin = value;
    }

    /**
     * Gets the value of the correlatedItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getCorrelatedItemJoin() {
        return correlatedItemJoin;
    }

    /**
     * Sets the value of the correlatedItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setCorrelatedItemJoin(ItemSearchBasic value) {
        this.correlatedItemJoin = value;
    }

    /**
     * Gets the value of the effectiveRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getEffectiveRevisionJoin() {
        return effectiveRevisionJoin;
    }

    /**
     * Sets the value of the effectiveRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setEffectiveRevisionJoin(ItemRevisionSearchBasic value) {
        this.effectiveRevisionJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the inventoryDetailJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return inventoryDetailJoin;
    }

    /**
     * Sets the value of the inventoryDetailJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryDetailSearchBasic }
     *     
     */
    public void setInventoryDetailJoin(InventoryDetailSearchBasic value) {
        this.inventoryDetailJoin = value;
    }

    /**
     * Gets the value of the inventoryLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * Sets the value of the inventoryLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * Gets the value of the inventoryNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public InventoryNumberSearchBasic getInventoryNumberJoin() {
        return inventoryNumberJoin;
    }

    /**
     * Sets the value of the inventoryNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberSearchBasic }
     *     
     */
    public void setInventoryNumberJoin(InventoryNumberSearchBasic value) {
        this.inventoryNumberJoin = value;
    }

    /**
     * Gets the value of the inventoryNumberBinOnHandJoin property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryNumberBinSearchBasic }
     *     
     */
    public InventoryNumberBinSearchBasic getInventoryNumberBinOnHandJoin() {
        return inventoryNumberBinOnHandJoin;
    }

    /**
     * Sets the value of the inventoryNumberBinOnHandJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryNumberBinSearchBasic }
     *     
     */
    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchBasic value) {
        this.inventoryNumberBinOnHandJoin = value;
    }

    /**
     * Gets the value of the memberItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * Sets the value of the memberItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * Gets the value of the obsoleteRevisionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public ItemRevisionSearchBasic getObsoleteRevisionJoin() {
        return obsoleteRevisionJoin;
    }

    /**
     * Sets the value of the obsoleteRevisionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemRevisionSearchBasic }
     *     
     */
    public void setObsoleteRevisionJoin(ItemRevisionSearchBasic value) {
        this.obsoleteRevisionJoin = value;
    }

    /**
     * Gets the value of the parentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * Sets the value of the parentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setParentJoin(ItemSearchBasic value) {
        this.parentJoin = value;
    }

    /**
     * Gets the value of the preferredLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * Sets the value of the preferredLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * Gets the value of the preferredVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * Sets the value of the preferredVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * Gets the value of the pricingJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSearchBasic }
     *     
     */
    public PricingSearchBasic getPricingJoin() {
        return pricingJoin;
    }

    /**
     * Sets the value of the pricingJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSearchBasic }
     *     
     */
    public void setPricingJoin(PricingSearchBasic value) {
        this.pricingJoin = value;
    }

    /**
     * Gets the value of the shopperJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * Sets the value of the shopperJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchBasic value) {
        this.shopperJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}

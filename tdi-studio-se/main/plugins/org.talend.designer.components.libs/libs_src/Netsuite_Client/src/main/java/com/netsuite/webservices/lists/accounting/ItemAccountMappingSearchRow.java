
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AccountSearchRowBasic;
import com.netsuite.webservices.platform.common.ClassificationSearchRowBasic;
import com.netsuite.webservices.platform.common.CustomSearchRowBasic;
import com.netsuite.webservices.platform.common.DepartmentSearchRowBasic;
import com.netsuite.webservices.platform.common.ItemAccountMappingSearchRowBasic;
import com.netsuite.webservices.platform.common.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common.SubsidiarySearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for ItemAccountMappingSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAccountMappingSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}ItemAccountMappingSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="classJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ClassificationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="departmentJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}DepartmentSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="destinationAccountJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="locationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="sourceAccountJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}SubsidiarySearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "ItemAccountMappingSearchRow", propOrder = {
    "basic",
    "classJoin",
    "departmentJoin",
    "destinationAccountJoin",
    "locationJoin",
    "sourceAccountJoin",
    "subsidiaryJoin",
    "customSearchJoin"
})
public class ItemAccountMappingSearchRow
    extends SearchRow
{

    protected ItemAccountMappingSearchRowBasic basic;
    protected ClassificationSearchRowBasic classJoin;
    protected DepartmentSearchRowBasic departmentJoin;
    protected AccountSearchRowBasic destinationAccountJoin;
    protected LocationSearchRowBasic locationJoin;
    protected AccountSearchRowBasic sourceAccountJoin;
    protected SubsidiarySearchRowBasic subsidiaryJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAccountMappingSearchRowBasic }
     *     
     */
    public ItemAccountMappingSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAccountMappingSearchRowBasic }
     *     
     */
    public void setBasic(ItemAccountMappingSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the classJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }

    /**
     * Sets the value of the classJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchRowBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchRowBasic value) {
        this.classJoin = value;
    }

    /**
     * Gets the value of the departmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * Sets the value of the departmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchRowBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchRowBasic value) {
        this.departmentJoin = value;
    }

    /**
     * Gets the value of the destinationAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getDestinationAccountJoin() {
        return destinationAccountJoin;
    }

    /**
     * Sets the value of the destinationAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setDestinationAccountJoin(AccountSearchRowBasic value) {
        this.destinationAccountJoin = value;
    }

    /**
     * Gets the value of the locationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * Sets the value of the locationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setLocationJoin(LocationSearchRowBasic value) {
        this.locationJoin = value;
    }

    /**
     * Gets the value of the sourceAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public AccountSearchRowBasic getSourceAccountJoin() {
        return sourceAccountJoin;
    }

    /**
     * Sets the value of the sourceAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchRowBasic }
     *     
     */
    public void setSourceAccountJoin(AccountSearchRowBasic value) {
        this.sourceAccountJoin = value;
    }

    /**
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchRowBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchRowBasic value) {
        this.subsidiaryJoin = value;
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

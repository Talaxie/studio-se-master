
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AccountSearchBasic;
import com.netsuite.webservices.platform.common.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common.CustomSearchJoin;
import com.netsuite.webservices.platform.common.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common.GlobalAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common.LocationSearchBasic;
import com.netsuite.webservices.platform.common.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for GlobalAccountMappingSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAccountMappingSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}GlobalAccountMappingSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="classJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ClassificationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="departmentJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}DepartmentSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="destinationAccountJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="locationJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="sourceAccountJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/&gt;
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
@XmlType(name = "GlobalAccountMappingSearch", propOrder = {
    "basic",
    "classJoin",
    "departmentJoin",
    "destinationAccountJoin",
    "locationJoin",
    "sourceAccountJoin",
    "subsidiaryJoin",
    "customSearchJoin"
})
public class GlobalAccountMappingSearch
    extends SearchRecord
{

    protected GlobalAccountMappingSearchBasic basic;
    protected ClassificationSearchBasic classJoin;
    protected DepartmentSearchBasic departmentJoin;
    protected AccountSearchBasic destinationAccountJoin;
    protected LocationSearchBasic locationJoin;
    protected AccountSearchBasic sourceAccountJoin;
    protected SubsidiarySearchBasic subsidiaryJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalAccountMappingSearchBasic }
     *     
     */
    public GlobalAccountMappingSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalAccountMappingSearchBasic }
     *     
     */
    public void setBasic(GlobalAccountMappingSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the classJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }

    /**
     * Sets the value of the classJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchBasic value) {
        this.classJoin = value;
    }

    /**
     * Gets the value of the departmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * Sets the value of the departmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchBasic value) {
        this.departmentJoin = value;
    }

    /**
     * Gets the value of the destinationAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getDestinationAccountJoin() {
        return destinationAccountJoin;
    }

    /**
     * Sets the value of the destinationAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setDestinationAccountJoin(AccountSearchBasic value) {
        this.destinationAccountJoin = value;
    }

    /**
     * Gets the value of the locationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * Sets the value of the locationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
    }

    /**
     * Gets the value of the sourceAccountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getSourceAccountJoin() {
        return sourceAccountJoin;
    }

    /**
     * Sets the value of the sourceAccountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setSourceAccountJoin(AccountSearchBasic value) {
        this.sourceAccountJoin = value;
    }

    /**
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchBasic value) {
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

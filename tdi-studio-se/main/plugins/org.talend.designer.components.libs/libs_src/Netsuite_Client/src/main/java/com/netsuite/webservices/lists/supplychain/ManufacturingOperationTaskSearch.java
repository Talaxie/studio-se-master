
package com.netsuite.webservices.lists.supplychain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.CustomSearchJoin;
import com.netsuite.webservices.platform.common.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common.TransactionSearchBasic;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for ManufacturingOperationTaskSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingOperationTaskSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="predecessorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}ManufacturingOperationTaskSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="workOrderJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingOperationTaskSearch", propOrder = {
    "basic",
    "predecessorJoin",
    "userJoin",
    "workOrderJoin",
    "customSearchJoin"
})
public class ManufacturingOperationTaskSearch
    extends SearchRecord
{

    protected ManufacturingOperationTaskSearchBasic basic;
    protected ManufacturingOperationTaskSearchBasic predecessorJoin;
    protected EmployeeSearchBasic userJoin;
    protected TransactionSearchBasic workOrderJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setBasic(ManufacturingOperationTaskSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the predecessorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public ManufacturingOperationTaskSearchBasic getPredecessorJoin() {
        return predecessorJoin;
    }

    /**
     * Sets the value of the predecessorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingOperationTaskSearchBasic }
     *     
     */
    public void setPredecessorJoin(ManufacturingOperationTaskSearchBasic value) {
        this.predecessorJoin = value;
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
     * Gets the value of the workOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getWorkOrderJoin() {
        return workOrderJoin;
    }

    /**
     * Sets the value of the workOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setWorkOrderJoin(TransactionSearchBasic value) {
        this.workOrderJoin = value;
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

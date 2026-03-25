
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AppDefinitionSearchBasic;
import com.netsuite.webservices.platform.common.AppPackageSearchBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common.FileSearchBasic;
import com.netsuite.webservices.platform.core.SearchRecord;


/**
 * <p>Java class for AppPackageSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppPackageSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppPackageSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="appDefinitionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppDefinitionSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="creatorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="packageFileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppPackageSearch", propOrder = {
    "basic",
    "appDefinitionJoin",
    "creatorJoin",
    "packageFileJoin",
    "userJoin"
})
public class AppPackageSearch
    extends SearchRecord
{

    protected AppPackageSearchBasic basic;
    protected AppDefinitionSearchBasic appDefinitionJoin;
    protected EmployeeSearchBasic creatorJoin;
    protected FileSearchBasic packageFileJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link AppPackageSearchBasic }
     *     
     */
    public AppPackageSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppPackageSearchBasic }
     *     
     */
    public void setBasic(AppPackageSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the appDefinitionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AppDefinitionSearchBasic }
     *     
     */
    public AppDefinitionSearchBasic getAppDefinitionJoin() {
        return appDefinitionJoin;
    }

    /**
     * Sets the value of the appDefinitionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDefinitionSearchBasic }
     *     
     */
    public void setAppDefinitionJoin(AppDefinitionSearchBasic value) {
        this.appDefinitionJoin = value;
    }

    /**
     * Gets the value of the creatorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getCreatorJoin() {
        return creatorJoin;
    }

    /**
     * Sets the value of the creatorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setCreatorJoin(EmployeeSearchBasic value) {
        this.creatorJoin = value;
    }

    /**
     * Gets the value of the packageFileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getPackageFileJoin() {
        return packageFileJoin;
    }

    /**
     * Sets the value of the packageFileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setPackageFileJoin(FileSearchBasic value) {
        this.packageFileJoin = value;
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

}

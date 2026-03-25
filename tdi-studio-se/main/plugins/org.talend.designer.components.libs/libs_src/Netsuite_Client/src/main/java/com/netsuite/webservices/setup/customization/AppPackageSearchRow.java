
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AppDefinitionSearchRowBasic;
import com.netsuite.webservices.platform.common.AppPackageSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.FileSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for AppPackageSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppPackageSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppPackageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="appDefinitionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppDefinitionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="creatorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="packageFileJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppPackageSearchRow", propOrder = {
    "basic",
    "appDefinitionJoin",
    "creatorJoin",
    "packageFileJoin",
    "userJoin"
})
public class AppPackageSearchRow
    extends SearchRow
{

    protected AppPackageSearchRowBasic basic;
    protected AppDefinitionSearchRowBasic appDefinitionJoin;
    protected EmployeeSearchRowBasic creatorJoin;
    protected FileSearchRowBasic packageFileJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link AppPackageSearchRowBasic }
     *     
     */
    public AppPackageSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppPackageSearchRowBasic }
     *     
     */
    public void setBasic(AppPackageSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the appDefinitionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AppDefinitionSearchRowBasic }
     *     
     */
    public AppDefinitionSearchRowBasic getAppDefinitionJoin() {
        return appDefinitionJoin;
    }

    /**
     * Sets the value of the appDefinitionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDefinitionSearchRowBasic }
     *     
     */
    public void setAppDefinitionJoin(AppDefinitionSearchRowBasic value) {
        this.appDefinitionJoin = value;
    }

    /**
     * Gets the value of the creatorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getCreatorJoin() {
        return creatorJoin;
    }

    /**
     * Sets the value of the creatorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setCreatorJoin(EmployeeSearchRowBasic value) {
        this.creatorJoin = value;
    }

    /**
     * Gets the value of the packageFileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getPackageFileJoin() {
        return packageFileJoin;
    }

    /**
     * Sets the value of the packageFileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setPackageFileJoin(FileSearchRowBasic value) {
        this.packageFileJoin = value;
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

}

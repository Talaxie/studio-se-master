
package com.netsuite.webservices.setup.customization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.AppDefinitionSearchRowBasic;
import com.netsuite.webservices.platform.common.AppPackageSearchRowBasic;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for AppDefinitionSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppDefinitionSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppDefinitionSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="appPackageJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}AppPackageSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="creatorJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "AppDefinitionSearchRow", propOrder = {
    "basic",
    "appPackageJoin",
    "creatorJoin",
    "userJoin"
})
public class AppDefinitionSearchRow
    extends SearchRow
{

    protected AppDefinitionSearchRowBasic basic;
    protected AppPackageSearchRowBasic appPackageJoin;
    protected EmployeeSearchRowBasic creatorJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link AppDefinitionSearchRowBasic }
     *     
     */
    public AppDefinitionSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppDefinitionSearchRowBasic }
     *     
     */
    public void setBasic(AppDefinitionSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the appPackageJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AppPackageSearchRowBasic }
     *     
     */
    public AppPackageSearchRowBasic getAppPackageJoin() {
        return appPackageJoin;
    }

    /**
     * Sets the value of the appPackageJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppPackageSearchRowBasic }
     *     
     */
    public void setAppPackageJoin(AppPackageSearchRowBasic value) {
        this.appPackageJoin = value;
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


package com.netsuite.webservices.lists.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common.SolutionSearchRowBasic;
import com.netsuite.webservices.platform.common.TopicSearchRowBasic;
import com.netsuite.webservices.platform.core.SearchRow;


/**
 * <p>Java class for TopicSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2014_2.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2014_2.platform.webservices.netsuite.com}TopicSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="solutionJoin" type="{urn:common_2014_2.platform.webservices.netsuite.com}SolutionSearchRowBasic" minOccurs="0"/&gt;
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
@XmlType(name = "TopicSearchRow", propOrder = {
    "basic",
    "solutionJoin",
    "userJoin"
})
public class TopicSearchRow
    extends SearchRow
{

    protected TopicSearchRowBasic basic;
    protected SolutionSearchRowBasic solutionJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public TopicSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSearchRowBasic }
     *     
     */
    public void setBasic(TopicSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the solutionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public SolutionSearchRowBasic getSolutionJoin() {
        return solutionJoin;
    }

    /**
     * Sets the value of the solutionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public void setSolutionJoin(SolutionSearchRowBasic value) {
        this.solutionJoin = value;
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

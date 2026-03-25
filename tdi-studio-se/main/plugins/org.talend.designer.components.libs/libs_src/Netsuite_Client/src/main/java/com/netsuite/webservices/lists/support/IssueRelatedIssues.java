
package com.netsuite.webservices.lists.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.lists.support.types.IssueRelationship;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for IssueRelatedIssues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueRelatedIssues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationship" type="{urn:types.support_2014_2.lists.webservices.netsuite.com}IssueRelationship" minOccurs="0"/&gt;
 *         &lt;element name="issueNumber" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="relationshipComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueRelatedIssues", propOrder = {
    "relationship",
    "issueNumber",
    "relationshipComment"
})
public class IssueRelatedIssues {

    @XmlSchemaType(name = "string")
    protected IssueRelationship relationship;
    protected RecordRef issueNumber;
    protected String relationshipComment;

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link IssueRelationship }
     *     
     */
    public IssueRelationship getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueRelationship }
     *     
     */
    public void setRelationship(IssueRelationship value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setIssueNumber(RecordRef value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the relationshipComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipComment() {
        return relationshipComment;
    }

    /**
     * Sets the value of the relationshipComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipComment(String value) {
        this.relationshipComment = value;
    }

}

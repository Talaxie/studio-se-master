
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditDetailCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditDetailCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditDetails" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAuditDetail" minOccurs="0"/>
 *         &lt;element name="MoreRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagingCookie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRecordCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditDetailCollection", propOrder = {
    "auditDetails",
    "moreRecords",
    "pagingCookie",
    "totalRecordCount"
})
public class AuditDetailCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AuditDetails", nillable = true)
    protected ArrayOfAuditDetail auditDetails;
    @XmlElement(name = "MoreRecords")
    protected Boolean moreRecords;
    @XmlElement(name = "PagingCookie", nillable = true)
    protected String pagingCookie;
    @XmlElement(name = "TotalRecordCount")
    protected Integer totalRecordCount;

    /**
     * Gets the value of the auditDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditDetail }
     *     
     */
    public ArrayOfAuditDetail getAuditDetails() {
        return auditDetails;
    }

    /**
     * Sets the value of the auditDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditDetail }
     *     
     */
    public void setAuditDetails(ArrayOfAuditDetail value) {
        this.auditDetails = value;
    }

    /**
     * Gets the value of the moreRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreRecords() {
        return moreRecords;
    }

    /**
     * Sets the value of the moreRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreRecords(Boolean value) {
        this.moreRecords = value;
    }

    /**
     * Gets the value of the pagingCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingCookie() {
        return pagingCookie;
    }

    /**
     * Sets the value of the pagingCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingCookie(String value) {
        this.pagingCookie = value;
    }

    /**
     * Gets the value of the totalRecordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    /**
     * Sets the value of the totalRecordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecordCount(Integer value) {
        this.totalRecordCount = value;
    }

}

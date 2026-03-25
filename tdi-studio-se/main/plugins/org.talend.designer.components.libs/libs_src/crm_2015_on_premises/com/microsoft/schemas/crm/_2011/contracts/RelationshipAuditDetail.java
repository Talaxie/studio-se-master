
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.ArrayOfEntityReference;


/**
 * <p>Java class for RelationshipAuditDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipAuditDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/crm/2011/Contracts}AuditDetail">
 *       &lt;sequence>
 *         &lt;element name="RelationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetRecords" type="{http://schemas.microsoft.com/xrm/2011/Contracts}ArrayOfEntityReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipAuditDetail", propOrder = {
    "relationshipName",
    "targetRecords"
})
public class RelationshipAuditDetail
    extends AuditDetail
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RelationshipName", nillable = true)
    protected String relationshipName;
    @XmlElement(name = "TargetRecords", nillable = true)
    protected ArrayOfEntityReference targetRecords;

    /**
     * Gets the value of the relationshipName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Sets the value of the relationshipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Gets the value of the targetRecords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityReference }
     *     
     */
    public ArrayOfEntityReference getTargetRecords() {
        return targetRecords;
    }

    /**
     * Sets the value of the targetRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityReference }
     *     
     */
    public void setTargetRecords(ArrayOfEntityReference value) {
        this.targetRecords = value;
    }

}

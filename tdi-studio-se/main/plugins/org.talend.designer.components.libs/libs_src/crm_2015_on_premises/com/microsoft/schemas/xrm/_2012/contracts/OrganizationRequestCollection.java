
package com.microsoft.schemas.xrm._2012.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.OrganizationRequest;


/**
 * <p>Java class for OrganizationRequestCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationRequestCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationRequest" type="{http://schemas.microsoft.com/xrm/2011/Contracts}OrganizationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationRequestCollection", propOrder = {
    "organizationRequests"
})
public class OrganizationRequestCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrganizationRequest", nillable = true)
    protected List<OrganizationRequest> organizationRequests;

    /**
     * Gets the value of the organizationRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRequest }
     * 
     * 
     */
    public List<OrganizationRequest> getOrganizationRequests() {
        if (organizationRequests == null) {
            organizationRequests = new ArrayList<OrganizationRequest>();
        }
        return this.organizationRequests;
    }

}

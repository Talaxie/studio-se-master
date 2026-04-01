
package com.netsuite.webservices.lists.support;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.RecordRef;


/**
 * <p>Java class for EmailEmployeesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailEmployeesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailEmployees" type="{urn:core_2014_2.platform.webservices.netsuite.com}RecordRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailEmployeesList", propOrder = {
    "emailEmployees"
})
public class EmailEmployeesList {

    @XmlElement(required = true)
    protected List<RecordRef> emailEmployees;

    /**
     * Gets the value of the emailEmployees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailEmployees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRef }
     * 
     * 
     */
    public List<RecordRef> getEmailEmployees() {
        if (emailEmployees == null) {
            emailEmployees = new ArrayList<RecordRef>();
        }
        return this.emailEmployees;
    }

}


package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfAppointmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfAppointmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfAppointmentRequest" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAppointmentRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfAppointmentRequest", propOrder = {
    "arrayOfAppointmentRequests"
})
public class ArrayOfArrayOfAppointmentRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ArrayOfAppointmentRequest", nillable = true)
    protected List<ArrayOfAppointmentRequest> arrayOfAppointmentRequests;

    /**
     * Gets the value of the arrayOfAppointmentRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfAppointmentRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfAppointmentRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAppointmentRequest }
     * 
     * 
     */
    public List<ArrayOfAppointmentRequest> getArrayOfAppointmentRequests() {
        if (arrayOfAppointmentRequests == null) {
            arrayOfAppointmentRequests = new ArrayList<ArrayOfAppointmentRequest>();
        }
        return this.arrayOfAppointmentRequests;
    }

}

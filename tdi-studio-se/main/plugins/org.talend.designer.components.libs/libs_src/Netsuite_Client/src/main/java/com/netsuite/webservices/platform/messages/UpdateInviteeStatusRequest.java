
package com.netsuite.webservices.platform.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.UpdateInviteeStatusReference;


/**
 * <p>Java class for UpdateInviteeStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateInviteeStatusReference" type="{urn:core_2014_2.platform.webservices.netsuite.com}UpdateInviteeStatusReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusRequest", propOrder = {
    "updateInviteeStatusReference"
})
public class UpdateInviteeStatusRequest {

    @XmlElement(required = true)
    protected UpdateInviteeStatusReference updateInviteeStatusReference;

    /**
     * Gets the value of the updateInviteeStatusReference property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public UpdateInviteeStatusReference getUpdateInviteeStatusReference() {
        return updateInviteeStatusReference;
    }

    /**
     * Sets the value of the updateInviteeStatusReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateInviteeStatusReference }
     *     
     */
    public void setUpdateInviteeStatusReference(UpdateInviteeStatusReference value) {
        this.updateInviteeStatusReference = value;
    }

}

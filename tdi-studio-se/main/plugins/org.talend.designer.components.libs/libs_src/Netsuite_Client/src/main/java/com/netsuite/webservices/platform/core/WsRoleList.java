
package com.netsuite.webservices.platform.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsRoleList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsRoleList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsRole" type="{urn:core_2014_2.platform.webservices.netsuite.com}WsRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsRoleList", propOrder = {
    "wsRole"
})
public class WsRoleList {

    protected List<WsRole> wsRole;

    /**
     * Gets the value of the wsRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsRole }
     * 
     * 
     */
    public List<WsRole> getWsRole() {
        if (wsRole == null) {
            wsRole = new ArrayList<WsRole>();
        }
        return this.wsRole;
    }

}


package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRoleSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRoleSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="instance" type="{http://www.talend.com/mdm}WSRoleSpecificationInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRoleSpecification", propOrder = {
    "admin",
    "instance",
    "objectType"
})
public class WSRoleSpecification {

    protected boolean admin;
    @XmlElement(nillable = true)
    protected List<WSRoleSpecificationInstance> instance;
    protected String objectType;

    /**
     * Default no-arg constructor
     * 
     */
    public WSRoleSpecification() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSRoleSpecification(final boolean admin, final List<WSRoleSpecificationInstance> instance, final String objectType) {
        this.admin = admin;
        this.instance = instance;
        this.objectType = objectType;
    }

    /**
     * Gets the value of the admin property.
     * 
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     */
    public void setAdmin(boolean value) {
        this.admin = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSRoleSpecificationInstance }
     * 
     * 
     */
    public List<WSRoleSpecificationInstance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<WSRoleSpecificationInstance>();
        }
        return this.instance;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

}


package org.datacontract.schemas._2004._07.microsoft_xrm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuickFindConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuickFindConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuickFindConfiguration" type="{http://schemas.datacontract.org/2004/07/Microsoft.Xrm.Sdk}QuickFindConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuickFindConfiguration", propOrder = {
    "quickFindConfigurations"
})
public class ArrayOfQuickFindConfiguration
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "QuickFindConfiguration", nillable = true)
    protected List<QuickFindConfiguration> quickFindConfigurations;

    /**
     * Gets the value of the quickFindConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickFindConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickFindConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickFindConfiguration }
     * 
     * 
     */
    public List<QuickFindConfiguration> getQuickFindConfigurations() {
        if (quickFindConfigurations == null) {
            quickFindConfigurations = new ArrayList<QuickFindConfiguration>();
        }
        return this.quickFindConfigurations;
    }

}


package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfRelationshipQueryBaseXPsK4FkN;


/**
 * <p>Java class for RelationshipQueryCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipQueryCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfRelationshipQueryBaseX_PsK4FkN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipQueryCollection", propOrder = {
    "keyValuePairOfRelationshipQueryBaseXPsK4FkNs"
})
public class RelationshipQueryCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN")
    protected List<KeyValuePairOfRelationshipQueryBaseXPsK4FkN> keyValuePairOfRelationshipQueryBaseXPsK4FkNs;

    /**
     * Gets the value of the keyValuePairOfRelationshipQueryBaseXPsK4FkNs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfRelationshipQueryBaseXPsK4FkNs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfRelationshipQueryBaseXPsK4FkNs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfRelationshipQueryBaseXPsK4FkN }
     * 
     * 
     */
    public List<KeyValuePairOfRelationshipQueryBaseXPsK4FkN> getKeyValuePairOfRelationshipQueryBaseXPsK4FkNs() {
        if (keyValuePairOfRelationshipQueryBaseXPsK4FkNs == null) {
            keyValuePairOfRelationshipQueryBaseXPsK4FkNs = new ArrayList<KeyValuePairOfRelationshipQueryBaseXPsK4FkN>();
        }
        return this.keyValuePairOfRelationshipQueryBaseXPsK4FkNs;
    }

}

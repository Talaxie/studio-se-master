
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfRelationshipEntityCollectionXPsK4FkN;


/**
 * <p>Java class for RelatedEntityCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedEntityCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedEntityCollection", propOrder = {
    "keyValuePairOfRelationshipEntityCollectionXPsK4FkNs"
})
public class RelatedEntityCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfRelationshipEntityCollectionX_PsK4FkN")
    protected List<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN> keyValuePairOfRelationshipEntityCollectionXPsK4FkNs;

    /**
     * Gets the value of the keyValuePairOfRelationshipEntityCollectionXPsK4FkNs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfRelationshipEntityCollectionXPsK4FkNs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfRelationshipEntityCollectionXPsK4FkN }
     * 
     * 
     */
    public List<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN> getKeyValuePairOfRelationshipEntityCollectionXPsK4FkNs() {
        if (keyValuePairOfRelationshipEntityCollectionXPsK4FkNs == null) {
            keyValuePairOfRelationshipEntityCollectionXPsK4FkNs = new ArrayList<KeyValuePairOfRelationshipEntityCollectionXPsK4FkN>();
        }
        return this.keyValuePairOfRelationshipEntityCollectionXPsK4FkNs;
    }

}

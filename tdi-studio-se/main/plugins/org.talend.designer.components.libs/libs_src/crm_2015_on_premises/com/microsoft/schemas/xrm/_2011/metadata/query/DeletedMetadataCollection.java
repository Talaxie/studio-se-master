
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF;


/**
 * <p>Java class for DeletedMetadataCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeletedMetadataCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeletedMetadataCollection", propOrder = {
    "keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves"
})
public class DeletedMetadataCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF")
    protected List<KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF> keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves;

    /**
     * Gets the value of the keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF }
     * 
     * 
     */
    public List<KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF> getKeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves() {
        if (keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves == null) {
            keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves = new ArrayList<KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF>();
        }
        return this.keyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtves;
    }

}

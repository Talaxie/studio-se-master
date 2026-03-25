
package org.datacontract.schemas._2004._07.system_collections;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas.xrm._2011.metadata.query.DeletedMetadataFilters;


/**
 * <p>Java class for KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}DeletedMetadataFilters"/>
 *         &lt;element name="value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUv_PKtF", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfDeletedMetadataFiltersArrayOfguidPlUvPKtF
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected DeletedMetadataFilters key;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfguid value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link DeletedMetadataFilters }
     *     
     */
    public DeletedMetadataFilters getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeletedMetadataFilters }
     *     
     */
    public void setKey(DeletedMetadataFilters value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    public ArrayOfguid getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    public void setValue(ArrayOfguid value) {
        this.value = value;
    }

}

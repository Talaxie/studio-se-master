
package com.microsoft.schemas.xrm._2014.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfEndpointTypestringyDL0RVHi;


/**
 * <p>Java class for EndpointCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndpointCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfEndpointTypestringyDL0RVHi" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfEndpointTypestringyDL0RVHi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointCollection", propOrder = {
    "keyValuePairOfEndpointTypestringyDL0RVHis"
})
public class EndpointCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfEndpointTypestringyDL0RVHi")
    protected List<KeyValuePairOfEndpointTypestringyDL0RVHi> keyValuePairOfEndpointTypestringyDL0RVHis;

    /**
     * Gets the value of the keyValuePairOfEndpointTypestringyDL0RVHis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfEndpointTypestringyDL0RVHis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfEndpointTypestringyDL0RVHis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfEndpointTypestringyDL0RVHi }
     * 
     * 
     */
    public List<KeyValuePairOfEndpointTypestringyDL0RVHi> getKeyValuePairOfEndpointTypestringyDL0RVHis() {
        if (keyValuePairOfEndpointTypestringyDL0RVHis == null) {
            keyValuePairOfEndpointTypestringyDL0RVHis = new ArrayList<KeyValuePairOfEndpointTypestringyDL0RVHi>();
        }
        return this.keyValuePairOfEndpointTypestringyDL0RVHis;
    }

}

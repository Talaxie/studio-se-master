
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfstringQueryBasegUGIFE1S;


/**
 * <p>Java class for QueryByEntityNameDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryByEntityNameDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfstringQueryBasegUGIFE1S" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringQueryBasegUGIFE1S" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryByEntityNameDictionary", propOrder = {
    "keyValuePairOfstringQueryBasegUGIFE1S"
})
public class QueryByEntityNameDictionary
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfstringQueryBasegUGIFE1S")
    protected List<KeyValuePairOfstringQueryBasegUGIFE1S> keyValuePairOfstringQueryBasegUGIFE1S;

    /**
     * Gets the value of the keyValuePairOfstringQueryBasegUGIFE1S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfstringQueryBasegUGIFE1S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfstringQueryBasegUGIFE1s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfstringQueryBasegUGIFE1S }
     * 
     * 
     */
    public List<KeyValuePairOfstringQueryBasegUGIFE1S> getKeyValuePairOfstringQueryBasegUGIFE1s() {
        if (keyValuePairOfstringQueryBasegUGIFE1S == null) {
            keyValuePairOfstringQueryBasegUGIFE1S = new ArrayList<KeyValuePairOfstringQueryBasegUGIFE1S>();
        }
        return this.keyValuePairOfstringQueryBasegUGIFE1S;
    }

}

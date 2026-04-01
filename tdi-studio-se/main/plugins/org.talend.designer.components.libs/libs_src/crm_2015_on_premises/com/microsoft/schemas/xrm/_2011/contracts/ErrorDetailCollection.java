
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_collections.KeyValuePairOfstringanyType;


/**
 * <p>Java class for ErrorDetailCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetailCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValuePairOfstringanyType" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}KeyValuePairOfstringanyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetailCollection", propOrder = {
    "keyValuePairOfstringanyTypes"
})
public class ErrorDetailCollection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyValuePairOfstringanyType")
    protected List<KeyValuePairOfstringanyType> keyValuePairOfstringanyTypes;

    /**
     * Gets the value of the keyValuePairOfstringanyTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValuePairOfstringanyTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValuePairOfstringanyTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairOfstringanyType }
     * 
     * 
     */
    public List<KeyValuePairOfstringanyType> getKeyValuePairOfstringanyTypes() {
        if (keyValuePairOfstringanyTypes == null) {
            keyValuePairOfstringanyTypes = new ArrayList<KeyValuePairOfstringanyType>();
        }
        return this.keyValuePairOfstringanyTypes;
    }

}

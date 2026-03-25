
package org.datacontract.schemas._2004._07.system_collections;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.xrm._2011.contracts.QueryBase;
import com.microsoft.schemas.xrm._2011.contracts.Relationship;


/**
 * <p>Java class for KeyValuePairOfRelationshipQueryBaseX_PsK4FkN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePairOfRelationshipQueryBaseX_PsK4FkN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://schemas.microsoft.com/xrm/2011/Contracts}Relationship"/>
 *         &lt;element name="value" type="{http://schemas.microsoft.com/xrm/2011/Contracts}QueryBase"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairOfRelationshipQueryBaseX_PsK4FkN", propOrder = {
    "key",
    "value"
})
public class KeyValuePairOfRelationshipQueryBaseXPsK4FkN
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true, nillable = true)
    protected Relationship key;
    @XmlElement(required = true, nillable = true)
    protected QueryBase value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Relationship }
     *     
     */
    public Relationship getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationship }
     *     
     */
    public void setKey(Relationship value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBase }
     *     
     */
    public QueryBase getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBase }
     *     
     */
    public void setValue(QueryBase value) {
        this.value = value;
    }

}

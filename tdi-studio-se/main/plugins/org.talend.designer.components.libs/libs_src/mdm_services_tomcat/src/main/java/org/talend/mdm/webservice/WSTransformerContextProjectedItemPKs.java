
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerContextProjectedItemPKs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerContextProjectedItemPKs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsItemPOJOPK" type="{http://www.talend.com/mdm}WSItemPK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerContextProjectedItemPKs", propOrder = {
    "wsItemPOJOPK"
})
public class WSTransformerContextProjectedItemPKs {

    @XmlElement(nillable = true)
    protected List<WSItemPK> wsItemPOJOPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerContextProjectedItemPKs() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerContextProjectedItemPKs(final List<WSItemPK> wsItemPOJOPK) {
        this.wsItemPOJOPK = wsItemPOJOPK;
    }

    /**
     * Gets the value of the wsItemPOJOPK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsItemPOJOPK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsItemPOJOPK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSItemPK }
     * 
     * 
     */
    public List<WSItemPK> getWsItemPOJOPK() {
        if (wsItemPOJOPK == null) {
            wsItemPOJOPK = new ArrayList<WSItemPK>();
        }
        return this.wsItemPOJOPK;
    }

}

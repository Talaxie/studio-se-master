
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerPKArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerPKArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsTransformerPK" type="{http://www.talend.com/mdm}WSTransformerPK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerPKArray", propOrder = {
    "wsTransformerPK"
})
public class WSTransformerPKArray {

    @XmlElement(nillable = true)
    protected List<WSTransformerPK> wsTransformerPK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerPKArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerPKArray(final List<WSTransformerPK> wsTransformerPK) {
        this.wsTransformerPK = wsTransformerPK;
    }

    /**
     * Gets the value of the wsTransformerPK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsTransformerPK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsTransformerPK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerPK }
     * 
     * 
     */
    public List<WSTransformerPK> getWsTransformerPK() {
        if (wsTransformerPK == null) {
            wsTransformerPK = new ArrayList<WSTransformerPK>();
        }
        return this.wsTransformerPK;
    }

}

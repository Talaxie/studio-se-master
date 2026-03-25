
package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTransformerV2PKArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTransformerV2PKArray"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsTransformerV2PK" type="{http://www.talend.com/mdm}WSTransformerV2PK" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTransformerV2PKArray", propOrder = {
    "wsTransformerV2PK"
})
public class WSTransformerV2PKArray {

    @XmlElement(nillable = true)
    protected List<WSTransformerV2PK> wsTransformerV2PK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSTransformerV2PKArray() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSTransformerV2PKArray(final List<WSTransformerV2PK> wsTransformerV2PK) {
        this.wsTransformerV2PK = wsTransformerV2PK;
    }

    /**
     * Gets the value of the wsTransformerV2PK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsTransformerV2PK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsTransformerV2PK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSTransformerV2PK }
     * 
     * 
     */
    public List<WSTransformerV2PK> getWsTransformerV2PK() {
        if (wsTransformerV2PK == null) {
            wsTransformerV2PK = new ArrayList<WSTransformerV2PK>();
        }
        return this.wsTransformerV2PK;
    }

}


package org.talend.mdm.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExecuteStoredProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExecuteStoredProcedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="wsDataClusterPK" type="{http://www.talend.com/mdm}WSDataClusterPK" minOccurs="0"/&gt;
 *         &lt;element name="wsStoredProcedurePK" type="{http://www.talend.com/mdm}WSStoredProcedurePK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExecuteStoredProcedure", propOrder = {
    "parameters",
    "wsDataClusterPK",
    "wsStoredProcedurePK"
})
public class WSExecuteStoredProcedure {

    @XmlElement(nillable = true)
    protected List<String> parameters;
    protected WSDataClusterPK wsDataClusterPK;
    protected WSStoredProcedurePK wsStoredProcedurePK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExecuteStoredProcedure() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExecuteStoredProcedure(final List<String> parameters, final WSDataClusterPK wsDataClusterPK, final WSStoredProcedurePK wsStoredProcedurePK) {
        this.parameters = parameters;
        this.wsDataClusterPK = wsDataClusterPK;
        this.wsStoredProcedurePK = wsStoredProcedurePK;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<String>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the wsDataClusterPK property.
     * 
     * @return
     *     possible object is
     *     {@link WSDataClusterPK }
     *     
     */
    public WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }

    /**
     * Sets the value of the wsDataClusterPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDataClusterPK }
     *     
     */
    public void setWsDataClusterPK(WSDataClusterPK value) {
        this.wsDataClusterPK = value;
    }

    /**
     * Gets the value of the wsStoredProcedurePK property.
     * 
     * @return
     *     possible object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public WSStoredProcedurePK getWsStoredProcedurePK() {
        return wsStoredProcedurePK;
    }

    /**
     * Sets the value of the wsStoredProcedurePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStoredProcedurePK }
     *     
     */
    public void setWsStoredProcedurePK(WSStoredProcedurePK value) {
        this.wsStoredProcedurePK = value;
    }

}

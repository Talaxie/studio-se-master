
package com.microsoft.schemas.xrm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for QuickFindResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuickFindResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://schemas.microsoft.com/xrm/2011/Contracts}EntityCollection" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QueryColumnSet" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuickFindResult", propOrder = {
    "data",
    "errorCode",
    "queryColumnSet"
})
public class QuickFindResult
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Data", nillable = true)
    protected EntityCollection data;
    @XmlElement(name = "ErrorCode")
    protected Integer errorCode;
    @XmlElement(name = "QueryColumnSet", nillable = true)
    protected ArrayOfstring queryColumnSet;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCollection }
     *     
     */
    public EntityCollection getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCollection }
     *     
     */
    public void setData(EntityCollection value) {
        this.data = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the queryColumnSet property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getQueryColumnSet() {
        return queryColumnSet;
    }

    /**
     * Sets the value of the queryColumnSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setQueryColumnSet(ArrayOfstring value) {
        this.queryColumnSet = value;
    }

}

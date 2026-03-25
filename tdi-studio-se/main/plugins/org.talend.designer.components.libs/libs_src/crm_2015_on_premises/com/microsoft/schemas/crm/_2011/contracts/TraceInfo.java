
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TraceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorInfoList" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfErrorInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraceInfo", propOrder = {
    "errorInfoList"
})
public class TraceInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ErrorInfoList", nillable = true)
    protected ArrayOfErrorInfo errorInfoList;

    /**
     * Gets the value of the errorInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorInfo }
     *     
     */
    public ArrayOfErrorInfo getErrorInfoList() {
        return errorInfoList;
    }

    /**
     * Sets the value of the errorInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorInfo }
     *     
     */
    public void setErrorInfoList(ArrayOfErrorInfo value) {
        this.errorInfoList = value;
    }

}

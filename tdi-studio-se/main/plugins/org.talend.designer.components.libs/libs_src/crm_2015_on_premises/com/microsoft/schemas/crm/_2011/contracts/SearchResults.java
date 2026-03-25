
package com.microsoft.schemas.crm._2011.contracts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Proposals" type="{http://schemas.microsoft.com/crm/2011/Contracts}ArrayOfAppointmentProposal" minOccurs="0"/>
 *         &lt;element name="TraceInfo" type="{http://schemas.microsoft.com/crm/2011/Contracts}TraceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = {
    "proposals",
    "traceInfo"
})
public class SearchResults
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Proposals", nillable = true)
    protected ArrayOfAppointmentProposal proposals;
    @XmlElement(name = "TraceInfo", nillable = true)
    protected TraceInfo traceInfo;

    /**
     * Gets the value of the proposals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppointmentProposal }
     *     
     */
    public ArrayOfAppointmentProposal getProposals() {
        return proposals;
    }

    /**
     * Sets the value of the proposals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppointmentProposal }
     *     
     */
    public void setProposals(ArrayOfAppointmentProposal value) {
        this.proposals = value;
    }

    /**
     * Gets the value of the traceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TraceInfo }
     *     
     */
    public TraceInfo getTraceInfo() {
        return traceInfo;
    }

    /**
     * Sets the value of the traceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceInfo }
     *     
     */
    public void setTraceInfo(TraceInfo value) {
        this.traceInfo = value;
    }

}

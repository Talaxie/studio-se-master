
package org.talend.datastewardship.server.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcRecordIdColumnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcRecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findTask", propOrder = {
    "srcRecordIdColumnName",
    "srcRecordId"
})
public class FindTask {

    protected String srcRecordIdColumnName;
    protected String srcRecordId;

    /**
     * Gets the value of the srcRecordIdColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcRecordIdColumnName() {
        return srcRecordIdColumnName;
    }

    /**
     * Sets the value of the srcRecordIdColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcRecordIdColumnName(String value) {
        this.srcRecordIdColumnName = value;
    }

    /**
     * Gets the value of the srcRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcRecordId() {
        return srcRecordId;
    }

    /**
     * Sets the value of the srcRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcRecordId(String value) {
        this.srcRecordId = value;
    }

}

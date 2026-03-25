
package com.microsoft.schemas.xrm._2011.metadata.query;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * <p>Java class for LabelQueryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelQueryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/xrm/2011/Metadata/Query}MetadataQueryBase">
 *       &lt;sequence>
 *         &lt;element name="FilterLanguages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="MissingLabelBehavior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelQueryExpression", propOrder = {
    "filterLanguages",
    "missingLabelBehavior"
})
public class LabelQueryExpression
    extends MetadataQueryBase
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FilterLanguages", nillable = true)
    protected ArrayOfint filterLanguages;
    @XmlElement(name = "MissingLabelBehavior", nillable = true)
    protected Integer missingLabelBehavior;

    /**
     * Gets the value of the filterLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getFilterLanguages() {
        return filterLanguages;
    }

    /**
     * Sets the value of the filterLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setFilterLanguages(ArrayOfint value) {
        this.filterLanguages = value;
    }

    /**
     * Gets the value of the missingLabelBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMissingLabelBehavior() {
        return missingLabelBehavior;
    }

    /**
     * Sets the value of the missingLabelBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMissingLabelBehavior(Integer value) {
        this.missingLabelBehavior = value;
    }

}

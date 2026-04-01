
package com.netsuite.webservices.lists.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core.SelectCustomFieldRef;


/**
 * <p>Java class for MatrixOptionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixOptionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matrixOption" type="{urn:core_2014_2.platform.webservices.netsuite.com}SelectCustomFieldRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixOptionList", propOrder = {
    "matrixOption"
})
public class MatrixOptionList {

    protected List<SelectCustomFieldRef> matrixOption;

    /**
     * Gets the value of the matrixOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectCustomFieldRef }
     * 
     * 
     */
    public List<SelectCustomFieldRef> getMatrixOption() {
        if (matrixOption == null) {
            matrixOption = new ArrayList<SelectCustomFieldRef>();
        }
        return this.matrixOption;
    }

}

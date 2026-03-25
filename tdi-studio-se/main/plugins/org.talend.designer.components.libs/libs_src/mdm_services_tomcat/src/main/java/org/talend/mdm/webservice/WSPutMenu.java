
package org.talend.mdm.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPutMenu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPutMenu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsMenu" type="{http://www.talend.com/mdm}WSMenu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPutMenu", propOrder = {
    "wsMenu"
})
public class WSPutMenu {

    protected WSMenu wsMenu;

    /**
     * Default no-arg constructor
     * 
     */
    public WSPutMenu() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSPutMenu(final WSMenu wsMenu) {
        this.wsMenu = wsMenu;
    }

    /**
     * Gets the value of the wsMenu property.
     * 
     * @return
     *     possible object is
     *     {@link WSMenu }
     *     
     */
    public WSMenu getWsMenu() {
        return wsMenu;
    }

    /**
     * Sets the value of the wsMenu property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMenu }
     *     
     */
    public void setWsMenu(WSMenu value) {
        this.wsMenu = value;
    }

}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Business Process Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.SVGBusinessProcessItem#getBusinessProcessItem <em>Business Process Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getSVGBusinessProcessItem()
 * @model
 * @generated
 */
public interface SVGBusinessProcessItem extends FileItem {
    /**
     * Returns the value of the '<em><b>Business Process Item</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.BusinessProcessItem#getSvgBusinessProcessItem <em>Svg Business Process Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Process Item</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Process Item</em>' reference.
     * @see #setBusinessProcessItem(BusinessProcessItem)
     * @see org.talend.core.model.properties.PropertiesPackage#getSVGBusinessProcessItem_BusinessProcessItem()
     * @see org.talend.core.model.properties.BusinessProcessItem#getSvgBusinessProcessItem
     * @model opposite="svgBusinessProcessItem"
     * @generated
     */
    BusinessProcessItem getBusinessProcessItem();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.SVGBusinessProcessItem#getBusinessProcessItem <em>Business Process Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Business Process Item</em>' reference.
     * @see #getBusinessProcessItem()
     * @generated
     */
    void setBusinessProcessItem(BusinessProcessItem value);

} // SVGBusinessProcessItem

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.talend.designer.business.model.business.BusinessProcess;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Business Process Item</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.BusinessProcessItem#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.talend.core.model.properties.BusinessProcessItem#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.talend.core.model.properties.BusinessProcessItem#getNotationHolder <em>Notation Holder</em>}</li>
 *   <li>{@link org.talend.core.model.properties.BusinessProcessItem#getSvgBusinessProcessItem <em>Svg Business Process Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getBusinessProcessItem()
 * @model
 * @generated
 */
public interface BusinessProcessItem extends Item {

    /**
     * Returns the value of the '<em><b>Notation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notation</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notation</em>' reference.
     * @see #setNotation(Diagram)
     * @see org.talend.core.model.properties.PropertiesPackage#getBusinessProcessItem_Notation()
     * @model transient="true"
     * @generated
     */
    Diagram getNotation();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.BusinessProcessItem#getNotation <em>Notation</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Notation</em>' reference.
     * @see #getNotation()
     * @generated
     */
    void setNotation(Diagram value);

    /**
     * Returns the value of the '<em><b>Semantic</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Semantic</em>' reference isn't clear, there really should be more of a description
     * here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Semantic</em>' reference.
     * @see #setSemantic(BusinessProcess)
     * @see org.talend.core.model.properties.PropertiesPackage#getBusinessProcessItem_Semantic()
     * @model
     * @generated
     */
    BusinessProcess getSemantic();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.BusinessProcessItem#getSemantic <em>Semantic</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Semantic</em>' reference.
     * @see #getSemantic()
     * @generated
     */
    void setSemantic(BusinessProcess value);

    /**
     * Returns the value of the '<em><b>Notation Holder</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notation Holder</em>' reference isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notation Holder</em>' reference.
     * @see #setNotationHolder(NotationHolder)
     * @see org.talend.core.model.properties.PropertiesPackage#getBusinessProcessItem_NotationHolder()
     * @model
     * @generated
     */
    NotationHolder getNotationHolder();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.BusinessProcessItem#getNotationHolder <em>Notation Holder</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Notation Holder</em>' reference.
     * @see #getNotationHolder()
     * @generated
     */
    void setNotationHolder(NotationHolder value);

    /**
     * Returns the value of the '<em><b>Svg Business Process Item</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.core.model.properties.SVGBusinessProcessItem#getBusinessProcessItem <em>Business Process Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Svg Business Process Item</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Svg Business Process Item</em>' reference.
     * @see #setSvgBusinessProcessItem(SVGBusinessProcessItem)
     * @see org.talend.core.model.properties.PropertiesPackage#getBusinessProcessItem_SvgBusinessProcessItem()
     * @see org.talend.core.model.properties.SVGBusinessProcessItem#getBusinessProcessItem
     * @model opposite="businessProcessItem" required="true"
     * @generated
     */
    SVGBusinessProcessItem getSvgBusinessProcessItem();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.BusinessProcessItem#getSvgBusinessProcessItem <em>Svg Business Process Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Svg Business Process Item</em>' reference.
     * @see #getSvgBusinessProcessItem()
     * @generated
     */
    void setSvgBusinessProcessItem(SVGBusinessProcessItem value);

    public void computeNotationHolder();

} // BusinessProcessItem

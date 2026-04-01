/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMPORTS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType#getIMPORT <em>IMPORT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType#getIMPORTS <em>IMPORTS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType#getREQUIREDIF <em>REQUIREDIF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTSType()
 * @model extendedMetaData="name='IMPORTS_._type' kind='elementOnly'"
 * @generated
 */
public interface IMPORTSType extends EObject {
    /**
     * Returns the value of the '<em><b>REQUIREDIF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>REQUIREDIF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>REQUIREDIF</em>' attribute.
     * @see #setREQUIREDIF(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTSType_REQUIREDIF()
     * @model extendedMetaData="kind='attribute' name='REQUIRED_IF' namespace='##targetNamespace'"
     * @generated
     */
    String getREQUIREDIF();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.IMPORTSType#getREQUIREDIF <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>REQUIREDIF</em>' attribute.
     * @see #getREQUIREDIF()
     * @generated
     */
    void setREQUIREDIF(String value);

    /**
     * Returns the value of the '<em><b>IMPORT</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.IMPORTType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IMPORT</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IMPORT</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTSType_IMPORT()
     * @model type="org.talend.designer.core.model.utils.emf.component.IMPORTType" containment="true"
     *        extendedMetaData="kind='element' name='IMPORT' namespace='##targetNamespace'"
     * @generated
     */
    EList getIMPORT();

    /**
     * Returns the value of the '<em><b>IMPORTS</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.IMPORTSType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IMPORTS</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>IMPORTS</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getIMPORTSType_IMPORTS()
     * @model type="org.talend.designer.core.model.utils.emf.component.IMPORTSType" containment="true"
     *        extendedMetaData="kind='element' name='IMPORTS' namespace='##targetNamespace'"
     * @generated
     */
    EList getIMPORTS();

} // IMPORTSType

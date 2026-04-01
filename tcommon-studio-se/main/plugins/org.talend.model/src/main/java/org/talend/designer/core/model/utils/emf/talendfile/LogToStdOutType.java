/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log To Std Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel <em>Level</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogToStdOutType()
 * @model extendedMetaData="name='LogToStdOut_._type' kind='empty'"
 * @generated
 */
public interface LogToStdOutType extends EObject {
    /**
     * Returns the value of the '<em><b>Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Level</em>' attribute.
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #setLevel(int)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogToStdOutType_Level()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='level' namespace='##targetNamespace'"
     * @generated
     */
    int getLevel();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Level</em>' attribute.
     * @see #isSetLevel()
     * @see #unsetLevel()
     * @see #getLevel()
     * @generated
     */
    void setLevel(int value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLevel()
     * @see #getLevel()
     * @see #setLevel(int)
     * @generated
     */
    void unsetLevel();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#getLevel <em>Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Level</em>' attribute is set.
     * @see #unsetLevel()
     * @see #getLevel()
     * @see #setLevel(int)
     * @generated
     */
    boolean isSetLevel();

    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #setSelected(boolean)
     * @see org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage#getLogToStdOutType_Selected()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='selected' namespace='##targetNamespace'"
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' attribute.
     * @see #isSetSelected()
     * @see #unsetSelected()
     * @see #isSelected()
     * @generated
     */
    void setSelected(boolean value);

    /**
     * Unsets the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSelected()
     * @see #isSelected()
     * @see #setSelected(boolean)
     * @generated
     */
    void unsetSelected();

    /**
     * Returns whether the value of the '{@link org.talend.designer.core.model.utils.emf.talendfile.LogToStdOutType#isSelected <em>Selected</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Selected</em>' attribute is set.
     * @see #unsetSelected()
     * @see #isSelected()
     * @see #setSelected(boolean)
     * @generated
     */
    boolean isSetSelected();

} // LogToStdOutType
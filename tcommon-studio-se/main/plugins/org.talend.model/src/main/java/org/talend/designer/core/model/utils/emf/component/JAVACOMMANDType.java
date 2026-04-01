/**
 */
package org.talend.designer.core.model.utils.emf.component;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAVACOMMAND Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getARG <em>ARG</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getCLASS <em>CLASS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getFUNCTION <em>FUNCTION</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getJAR <em>JAR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getJAVACOMMANDType()
 * @model extendedMetaData="name='JAVACOMMAND_._type' kind='elementOnly'"
 * @generated
 */
public interface JAVACOMMANDType extends EObject {
    /**
     * Returns the value of the '<em><b>ARG</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.core.model.utils.emf.component.ARGType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ARG</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ARG</em>' containment reference list.
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getJAVACOMMANDType_ARG()
     * @model type="org.talend.designer.core.model.utils.emf.component.ARGType" containment="true"
     *        extendedMetaData="kind='element' name='ARG' namespace='##targetNamespace'"
     * @generated
     */
    EList getARG();

    /**
     * Returns the value of the '<em><b>CLASS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CLASS</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CLASS</em>' attribute.
     * @see #setCLASS(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getJAVACOMMANDType_CLASS()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='CLASS' namespace='##targetNamespace'"
     * @generated
     */
    String getCLASS();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getCLASS <em>CLASS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CLASS</em>' attribute.
     * @see #getCLASS()
     * @generated
     */
    void setCLASS(String value);

    /**
     * Returns the value of the '<em><b>FUNCTION</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FUNCTION</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FUNCTION</em>' attribute.
     * @see #setFUNCTION(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getJAVACOMMANDType_FUNCTION()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='FUNCTION' namespace='##targetNamespace'"
     * @generated
     */
    String getFUNCTION();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getFUNCTION <em>FUNCTION</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>FUNCTION</em>' attribute.
     * @see #getFUNCTION()
     * @generated
     */
    void setFUNCTION(String value);

    /**
     * Returns the value of the '<em><b>JAR</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>JAR</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>JAR</em>' attribute.
     * @see #setJAR(String)
     * @see org.talend.designer.core.model.utils.emf.component.ComponentPackage#getJAVACOMMANDType_JAR()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='JAR' namespace='##targetNamespace'"
     * @generated
     */
    String getJAR();

    /**
     * Sets the value of the '{@link org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType#getJAR <em>JAR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>JAR</em>' attribute.
     * @see #getJAR()
     * @generated
     */
    void setJAR(String value);

} // JAVACOMMANDType

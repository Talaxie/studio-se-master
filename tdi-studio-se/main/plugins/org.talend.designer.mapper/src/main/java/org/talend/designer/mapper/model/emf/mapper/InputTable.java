/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.InputTable#getMatchingMode <em>Matching Mode</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.InputTable#getLookupMode <em>Lookup Mode</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.InputTable#getGlobalMapKeysValues <em>Global Map Keys Values</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.InputTable#isInnerJoin <em>Inner Join</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.InputTable#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable()
 * @model
 * @generated
 */
public interface InputTable extends AbstractInOutTable {
    /**
     * Returns the value of the '<em><b>Matching Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Mode</em>' attribute.
     * @see #setMatchingMode(String)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable_MatchingMode()
     * @model
     * @generated
     */
    String getMatchingMode();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.InputTable#getMatchingMode <em>Matching Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Mode</em>' attribute.
     * @see #getMatchingMode()
     * @generated
     */
    void setMatchingMode(String value);

    /**
     * Returns the value of the '<em><b>Lookup Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lookup Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lookup Mode</em>' attribute.
     * @see #setLookupMode(String)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable_LookupMode()
     * @model
     * @generated
     */
    String getLookupMode();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.InputTable#getLookupMode <em>Lookup Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lookup Mode</em>' attribute.
     * @see #getLookupMode()
     * @generated
     */
    void setLookupMode(String value);

    /**
     * Returns the value of the '<em><b>Global Map Keys Values</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.mapper.model.emf.mapper.MapperTableEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Map Keys Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Map Keys Values</em>' containment reference list.
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable_GlobalMapKeysValues()
     * @model containment="true"
     * @generated
     */
    EList<MapperTableEntry> getGlobalMapKeysValues();

    /**
     * Returns the value of the '<em><b>Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Join</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Join</em>' attribute.
     * @see #setInnerJoin(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable_InnerJoin()
     * @model
     * @generated
     */
    boolean isInnerJoin();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.InputTable#isInnerJoin <em>Inner Join</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Join</em>' attribute.
     * @see #isInnerJoin()
     * @generated
     */
    void setInnerJoin(boolean value);

    /**
     * Returns the value of the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistent</em>' attribute.
     * @see #setPersistent(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getInputTable_Persistent()
     * @model
     * @generated
     */
    boolean isPersistent();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.InputTable#isPersistent <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistent</em>' attribute.
     * @see #isPersistent()
     * @generated
     */
    void setPersistent(boolean value);

} // InputTable

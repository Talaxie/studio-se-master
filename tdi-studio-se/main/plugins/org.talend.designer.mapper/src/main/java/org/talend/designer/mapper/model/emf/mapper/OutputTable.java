/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isReject <em>Reject</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isRejectInnerJoin <em>Reject Inner Join</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isIsErrorRejectTable <em>Is Error Reject Table</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#getIsJoinTableOf <em>Is Join Table Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getOutputTable()
 * @model
 * @generated
 */
public interface OutputTable extends AbstractInOutTable {
    /**
     * Returns the value of the '<em><b>Reject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reject</em>' attribute.
     * @see #setReject(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getOutputTable_Reject()
     * @model
     * @generated
     */
    boolean isReject();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isReject <em>Reject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reject</em>' attribute.
     * @see #isReject()
     * @generated
     */
    void setReject(boolean value);

    /**
     * Returns the value of the '<em><b>Reject Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reject Inner Join</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reject Inner Join</em>' attribute.
     * @see #setRejectInnerJoin(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getOutputTable_RejectInnerJoin()
     * @model
     * @generated
     */
    boolean isRejectInnerJoin();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isRejectInnerJoin <em>Reject Inner Join</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reject Inner Join</em>' attribute.
     * @see #isRejectInnerJoin()
     * @generated
     */
    void setRejectInnerJoin(boolean value);

    /**
     * Returns the value of the '<em><b>Is Error Reject Table</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Error Reject Table</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Error Reject Table</em>' attribute.
     * @see #setIsErrorRejectTable(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getOutputTable_IsErrorRejectTable()
     * @model
     * @generated
     */
    boolean isIsErrorRejectTable();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#isIsErrorRejectTable <em>Is Error Reject Table</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Error Reject Table</em>' attribute.
     * @see #isIsErrorRejectTable()
     * @generated
     */
    void setIsErrorRejectTable(boolean value);

    /**
     * Returns the value of the '<em><b>Is Join Table Of</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Join Table Of</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Join Table Of</em>' attribute.
     * @see #setIsJoinTableOf(String)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getOutputTable_IsJoinTableOf()
     * @model
     * @generated
     */
    String getIsJoinTableOf();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.OutputTable#getIsJoinTableOf <em>Is Join Table Of</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Join Table Of</em>' attribute.
     * @see #getIsJoinTableOf()
     * @generated
     */
    void setIsJoinTableOf(String value);

} // OutputTable

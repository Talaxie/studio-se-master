/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Data Map Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#getSizeState <em>Size State</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#isMinimized <em>Minimized</em>}</li>
 *   <li>{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#getMapperTableEntries <em>Mapper Table Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getAbstractDataMapTable()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDataMapTable extends EObject {
    /**
     * Returns the value of the '<em><b>Size State</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.talend.designer.mapper.model.emf.mapper.SizeState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size State</em>' attribute.
     * @see org.talend.designer.mapper.model.emf.mapper.SizeState
     * @see #setSizeState(SizeState)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getAbstractDataMapTable_SizeState()
     * @model default=""
     * @generated
     */
    SizeState getSizeState();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#getSizeState <em>Size State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size State</em>' attribute.
     * @see org.talend.designer.mapper.model.emf.mapper.SizeState
     * @see #getSizeState()
     * @generated
     */
    void setSizeState(SizeState value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getAbstractDataMapTable_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimized</em>' attribute.
     * @see #setMinimized(boolean)
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getAbstractDataMapTable_Minimized()
     * @model
     * @generated
     */
    boolean isMinimized();

    /**
     * Sets the value of the '{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable#isMinimized <em>Minimized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimized</em>' attribute.
     * @see #isMinimized()
     * @generated
     */
    void setMinimized(boolean value);

    /**
     * Returns the value of the '<em><b>Mapper Table Entries</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.mapper.model.emf.mapper.MapperTableEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapper Table Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapper Table Entries</em>' containment reference list.
     * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage#getAbstractDataMapTable_MapperTableEntries()
     * @model containment="true"
     * @generated
     */
    EList<MapperTableEntry> getMapperTableEntries();

} // AbstractDataMapTable

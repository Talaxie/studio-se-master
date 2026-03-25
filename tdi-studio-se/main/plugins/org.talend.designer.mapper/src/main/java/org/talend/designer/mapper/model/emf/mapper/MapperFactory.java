/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage
 * @generated
 */
public interface MapperFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MapperFactory eINSTANCE = org.talend.designer.mapper.model.emf.mapper.impl.MapperFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data</em>'.
     * @generated
     */
    MapperData createMapperData();

    /**
     * Returns a new object of class '<em>Table Entry</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table Entry</em>'.
     * @generated
     */
    MapperTableEntry createMapperTableEntry();

    /**
     * Returns a new object of class '<em>Ui Properties</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ui Properties</em>'.
     * @generated
     */
    UiProperties createUiProperties();

    /**
     * Returns a new object of class '<em>Var Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Var Table</em>'.
     * @generated
     */
    VarTable createVarTable();

    /**
     * Returns a new object of class '<em>Output Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Table</em>'.
     * @generated
     */
    OutputTable createOutputTable();

    /**
     * Returns a new object of class '<em>Input Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Table</em>'.
     * @generated
     */
    InputTable createInputTable();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MapperPackage getMapperPackage();

} //MapperFactory

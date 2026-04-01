/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.schema.SchemaPackage
 * @generated
 */
public interface SchemaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SchemaFactory eINSTANCE = org.talend.dataquality.indicators.schema.impl.SchemaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Indicator</em>'.
     * @generated
     */
    SchemaIndicator createSchemaIndicator();

    /**
     * Returns a new object of class '<em>Table Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table Indicator</em>'.
     * @generated
     */
    TableIndicator createTableIndicator();

    /**
     * Returns a new object of class '<em>Connection Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Indicator</em>'.
     * @generated
     */
    ConnectionIndicator createConnectionIndicator();

    /**
     * Returns a new object of class '<em>Catalog Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Catalog Indicator</em>'.
     * @generated
     */
    CatalogIndicator createCatalogIndicator();

    /**
     * Returns a new object of class '<em>View Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>View Indicator</em>'.
     * @generated
     */
    ViewIndicator createViewIndicator();

    /**
     * Returns a new object of class '<em>Abstract Table Indicator</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstract Table Indicator</em>'.
     * @generated
     */
    AbstractTableIndicator createAbstractTableIndicator();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SchemaPackage getSchemaPackage();

} //SchemaFactory

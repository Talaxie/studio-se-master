/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.json;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.repository.model.json.JsonPackage
 * @generated
 */
public interface JsonFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    JsonFactory eINSTANCE = org.talend.repository.model.json.impl.JsonFactoryImpl.init();

    /**
     * Returns a new object of class '<em>JSON File Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JSON File Connection</em>'.
     * @generated
     */
    JSONFileConnection createJSONFileConnection();

    /**
     * Returns a new object of class '<em>JSON File Connection Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JSON File Connection Item</em>'.
     * @generated
     */
    JSONFileConnectionItem createJSONFileConnectionItem();

    /**
     * Returns a new object of class '<em>JSONX Path Loop Descriptor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JSONX Path Loop Descriptor</em>'.
     * @generated
     */
    JSONXPathLoopDescriptor createJSONXPathLoopDescriptor();

    /**
     * Returns a new object of class '<em>JSON File Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JSON File Node</em>'.
     * @generated
     */
    JSONFileNode createJSONFileNode();

    /**
     * Returns a new object of class '<em>Schema Target</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schema Target</em>'.
     * @generated
     */
    SchemaTarget createSchemaTarget();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    JsonPackage getJsonPackage();

} //JsonFactory

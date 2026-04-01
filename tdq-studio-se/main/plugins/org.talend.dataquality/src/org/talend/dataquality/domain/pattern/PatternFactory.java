/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.domain.pattern.PatternPackage
 * @generated
 */
public interface PatternFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternFactory eINSTANCE = org.talend.dataquality.domain.pattern.impl.PatternFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Pattern</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pattern</em>'.
     * @generated
     */
    Pattern createPattern();

    /**
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    PatternComponent createPatternComponent();

    /**
     * Returns a new object of class '<em>Regular Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Regular Expression</em>'.
     * @generated
     */
    RegularExpression createRegularExpression();

    /**
     * Returns a new object of class '<em>Attribute Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Reference</em>'.
     * @generated
     */
    AttributeReference createAttributeReference();

    /**
     * Returns a new object of class '<em>Component Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component Reference</em>'.
     * @generated
     */
    ComponentReference createComponentReference();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    PatternPackage getPatternPackage();

} //PatternFactory

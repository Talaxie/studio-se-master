/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DomainFactory eINSTANCE = org.talend.dataquality.domain.impl.DomainFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Domain</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Domain</em>'.
     * @generated
     */
    Domain createDomain();

    /**
     * Returns a new object of class '<em>Enumeration Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Rule</em>'.
     * @generated
     */
    EnumerationRule createEnumerationRule();

    /**
     * Returns a new object of class '<em>Range Restriction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Range Restriction</em>'.
     * @generated
     */
    RangeRestriction createRangeRestriction();

    /**
     * Returns a new object of class '<em>Literal Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Value</em>'.
     * @generated
     */
    LiteralValue createLiteralValue();

    /**
     * Returns a new object of class '<em>Length Restriction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Length Restriction</em>'.
     * @generated
     */
    LengthRestriction createLengthRestriction();

    /**
     * Returns a new object of class '<em>Numeric Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numeric Value</em>'.
     * @generated
     */
    NumericValue createNumericValue();

    /**
     * Returns a new object of class '<em>Text Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Value</em>'.
     * @generated
     */
    TextValue createTextValue();

    /**
     * Returns a new object of class '<em>Integer Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Value</em>'.
     * @generated
     */
    IntegerValue createIntegerValue();

    /**
     * Returns a new object of class '<em>Real Number Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Real Number Value</em>'.
     * @generated
     */
    RealNumberValue createRealNumberValue();

    /**
     * Returns a new object of class '<em>Date Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Value</em>'.
     * @generated
     */
    DateValue createDateValue();

    /**
     * Returns a new object of class '<em>Java UDI Indicator Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java UDI Indicator Parameter</em>'.
     * @generated
     */
    JavaUDIIndicatorParameter createJavaUDIIndicatorParameter();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DomainPackage getDomainPackage();

} //DomainFactory

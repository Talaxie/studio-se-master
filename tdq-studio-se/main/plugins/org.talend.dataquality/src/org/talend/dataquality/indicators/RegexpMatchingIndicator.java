/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Regexp Matching Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This indicator handles regular expressions. These expressions need the database support of regular expressions.
 * <!-- end-model-doc -->
 *
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getRegexpMatchingIndicator()
 * @model
 * @generated
 */
public interface RegexpMatchingIndicator extends PatternMatchingIndicator {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    String getRegex();
} // RegexpMatchingIndicator

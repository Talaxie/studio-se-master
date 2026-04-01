/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benford Law Frequency Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Class provide the function to compute a group of data by Benford's Law and output the leading digits with its distribution in this dataset. Then the user can use it to compare with the standard, to detect possible cases of Fraud. can handle type: positive number, string, can not handle: negetive number
 * <!-- end-model-doc -->
 *
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getBenfordLawFrequencyIndicator()
 * @model
 * @generated
 */
public interface BenfordLawFrequencyIndicator extends FrequencyIndicator {
} // BenfordLawFrequencyIndicator

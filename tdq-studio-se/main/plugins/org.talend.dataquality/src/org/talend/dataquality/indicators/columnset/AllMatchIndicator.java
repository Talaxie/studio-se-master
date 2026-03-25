/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.indicators.RegexpMatchingIndicator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>All Match Indicator</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.talend.dataquality.indicators.columnset.AllMatchIndicator#getCompositeRegexMatchingIndicators <em>
 * Composite Regex Matching Indicators</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getAllMatchIndicator()
 * @model
 * @generated
 */
public interface AllMatchIndicator extends ColumnSetMultiValueIndicator, RegexpMatchingIndicator {

    /**
     * Returns the value of the '<em><b>Composite Regex Matching Indicators</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.RegexpMatchingIndicator}.
     * <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Composite Regex Matching Indicators</em>' reference list isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composite Regex Matching Indicators</em>' containment reference list.
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getAllMatchIndicator_CompositeRegexMatchingIndicators()
     * @model containment="true"
     * @generated
     */
    EList<RegexpMatchingIndicator> getCompositeRegexMatchingIndicators();

} // AllMatchIndicator

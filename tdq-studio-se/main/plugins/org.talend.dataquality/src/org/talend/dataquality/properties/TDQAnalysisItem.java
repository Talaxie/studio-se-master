/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import org.talend.dataquality.analysis.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Analysis Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQAnalysisItem#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQAnalysisItem()
 * @model
 * @generated
 */
public interface TDQAnalysisItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Analysis</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analysis</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analysis</em>' reference.
     * @see #setAnalysis(Analysis)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQAnalysisItem_Analysis()
     * @model
     * @generated
     */
    Analysis getAnalysis();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQAnalysisItem#getAnalysis <em>Analysis</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analysis</em>' reference.
     * @see #getAnalysis()
     * @generated
     */
    void setAnalysis(Analysis value);

} // TDQAnalysisItem

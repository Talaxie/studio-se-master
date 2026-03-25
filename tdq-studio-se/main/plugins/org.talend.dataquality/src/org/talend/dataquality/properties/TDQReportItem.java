/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties;

import org.talend.core.model.properties.TDQItem;
import orgomg.cwmx.analysis.informationreporting.Report;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDQ Report Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.properties.TDQReportItem#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.properties.PropertiesPackage#getTDQReportItem()
 * @model
 * @generated
 */
public interface TDQReportItem extends TDQItem {
    /**
     * Returns the value of the '<em><b>Report</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report</em>' reference.
     * @see #setReport(Report)
     * @see org.talend.dataquality.properties.PropertiesPackage#getTDQReportItem_Report()
     * @model
     * @generated
     */
    Report getReport();

    /**
     * Sets the value of the '{@link org.talend.dataquality.properties.TDQReportItem#getReport <em>Report</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report</em>' reference.
     * @see #getReport()
     * @generated
     */
    void setReport(Report value);

} // TDQReportItem

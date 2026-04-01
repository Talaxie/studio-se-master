/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.foundation.datatypes;

import orgomg.cwm.objectmodel.core.ProcedureExpression;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Query Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QueryExpression instances contain query statements in language-dependent form.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwm.foundation.datatypes.QueryExpression#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwm.foundation.datatypes.DatatypesPackage#getQueryExpression()
 * @model
 * @generated
 */
public interface QueryExpression extends ProcedureExpression {

    /**
     * Returns the value of the '<em><b>Report Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getReportQuery <em>Report Query</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ReportGroup referencing QueryExpressions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Report Group</em>' reference.
     * @see #setReportGroup(ReportGroup)
     * @see orgomg.cwm.foundation.datatypes.DatatypesPackage#getQueryExpression_ReportGroup()
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroup#getReportQuery
     * @model opposite="reportQuery"
     * @generated
     */
    ReportGroup getReportGroup();

    /**
     * Sets the value of the '{@link orgomg.cwm.foundation.datatypes.QueryExpression#getReportGroup <em>Report Group</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Report Group</em>' reference.
     * @see #getReportGroup()
     * @generated
     */
    void setReportGroup(ReportGroup value);

} // QueryExpression

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.analysis.informationvisualization.RenderedObject;
import orgomg.cwm.foundation.datatypes.QueryExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Report Group</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ReportGroup defines a grouping of fields on a report.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getGroupType <em>Group Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getReportQuery <em>Report Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationreporting.InformationreportingPackage#getReportGroup()
 * @model
 * @generated
 */
public interface ReportGroup extends RenderedObject {

    /**
     * Returns the value of the '<em><b>Group Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.analysis.informationreporting.ReportGroupType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Specifies the type of a ReportGroup <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Group Type</em>' attribute.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroupType
     * @see #setGroupType(ReportGroupType)
     * @see orgomg.cwmx.analysis.informationreporting.InformationreportingPackage#getReportGroup_GroupType()
     * @model
     * @generated
     */
    ReportGroupType getGroupType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationreporting.ReportGroup#getGroupType <em>Group Type</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Group Type</em>' attribute.
     * @see orgomg.cwmx.analysis.informationreporting.ReportGroupType
     * @see #getGroupType()
     * @generated
     */
    void setGroupType(ReportGroupType value);

    /**
     * Returns the value of the '<em><b>Report Query</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.foundation.datatypes.QueryExpression}.
     * It is bidirectional and its opposite is '{@link orgomg.cwm.foundation.datatypes.QueryExpression#getReportGroup <em>Report Group</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * QueryExpressions referenced by the ReportGroup.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Report Query</em>' reference list.
     * @see orgomg.cwmx.analysis.informationreporting.InformationreportingPackage#getReportGroup_ReportQuery()
     * @see orgomg.cwm.foundation.datatypes.QueryExpression#getReportGroup
     * @model opposite="reportGroup"
     * @generated
     */
    EList<QueryExpression> getReportQuery();

} // ReportGroup

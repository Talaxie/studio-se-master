/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.informationvisualization.impl.RenderedObjectImpl;
import orgomg.cwm.foundation.datatypes.DatatypesPackage;
import orgomg.cwm.foundation.datatypes.QueryExpression;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;
import orgomg.cwmx.analysis.informationreporting.ReportGroupType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Report Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl#getGroupType <em>Group Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationreporting.impl.ReportGroupImpl#getReportQuery <em>Report Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportGroupImpl extends RenderedObjectImpl implements ReportGroup {

    /**
     * The default value of the '{@link #getGroupType() <em>Group Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGroupType()
     * @generated
     * @ordered
     */
    protected static final ReportGroupType GROUP_TYPE_EDEFAULT = ReportGroupType.HEADER;

    /**
     * The cached value of the '{@link #getGroupType() <em>Group Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGroupType()
     * @generated
     * @ordered
     */
    protected ReportGroupType groupType = GROUP_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getReportQuery() <em>Report Query</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReportQuery()
     * @generated
     * @ordered
     */
    protected EList<QueryExpression> reportQuery;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ReportGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationreportingPackage.Literals.REPORT_GROUP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportGroupType getGroupType() {
        return groupType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGroupType(ReportGroupType newGroupType) {
        ReportGroupType oldGroupType = groupType;
        groupType = newGroupType == null ? GROUP_TYPE_EDEFAULT : newGroupType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationreportingPackage.REPORT_GROUP__GROUP_TYPE,
                    oldGroupType, groupType));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<QueryExpression> getReportQuery() {
        if (reportQuery == null) {
            reportQuery = new EObjectWithInverseResolvingEList<QueryExpression>(QueryExpression.class, this,
                    InformationreportingPackage.REPORT_GROUP__REPORT_QUERY, DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP);
        }
        return reportQuery;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getReportQuery()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            return ((InternalEList<?>) getReportQuery()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__GROUP_TYPE:
            return getGroupType();
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            return getReportQuery();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__GROUP_TYPE:
            setGroupType((ReportGroupType) newValue);
            return;
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            getReportQuery().clear();
            getReportQuery().addAll((Collection<? extends QueryExpression>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__GROUP_TYPE:
            setGroupType(GROUP_TYPE_EDEFAULT);
            return;
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            getReportQuery().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case InformationreportingPackage.REPORT_GROUP__GROUP_TYPE:
            return groupType != GROUP_TYPE_EDEFAULT;
        case InformationreportingPackage.REPORT_GROUP__REPORT_QUERY:
            return reportQuery != null && !reportQuery.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (groupType: ");
        result.append(groupType);
        result.append(')');
        return result.toString();
    }

} // ReportGroupImpl

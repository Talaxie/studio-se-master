/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.foundation.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import orgomg.cwm.foundation.datatypes.DatatypesPackage;
import orgomg.cwm.foundation.datatypes.QueryExpression;
import orgomg.cwm.objectmodel.core.impl.ProcedureExpressionImpl;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Query Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.foundation.datatypes.impl.QueryExpressionImpl#getReportGroup <em>Report Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryExpressionImpl extends ProcedureExpressionImpl implements QueryExpression {

    /**
     * The cached value of the '{@link #getReportGroup() <em>Report Group</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getReportGroup()
     * @generated
     * @ordered
     */
    protected ReportGroup reportGroup;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected QueryExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DatatypesPackage.Literals.QUERY_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportGroup getReportGroup() {
        if (reportGroup != null && reportGroup.eIsProxy()) {
            InternalEObject oldReportGroup = (InternalEObject) reportGroup;
            reportGroup = (ReportGroup) eResolveProxy(oldReportGroup);
            if (reportGroup != oldReportGroup) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP,
                            oldReportGroup, reportGroup));
            }
        }
        return reportGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReportGroup basicGetReportGroup() {
        return reportGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportGroup(ReportGroup newReportGroup, NotificationChain msgs) {
        ReportGroup oldReportGroup = reportGroup;
        reportGroup = newReportGroup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP, oldReportGroup, newReportGroup);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setReportGroup(ReportGroup newReportGroup) {
        if (newReportGroup != reportGroup) {
            NotificationChain msgs = null;
            if (reportGroup != null)
                msgs = ((InternalEObject) reportGroup).eInverseRemove(this,
                        InformationreportingPackage.REPORT_GROUP__REPORT_QUERY, ReportGroup.class, msgs);
            if (newReportGroup != null)
                msgs = ((InternalEObject) newReportGroup).eInverseAdd(this,
                        InformationreportingPackage.REPORT_GROUP__REPORT_QUERY, ReportGroup.class, msgs);
            msgs = basicSetReportGroup(newReportGroup, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP,
                    newReportGroup, newReportGroup));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            if (reportGroup != null)
                msgs = ((InternalEObject) reportGroup).eInverseRemove(this,
                        InformationreportingPackage.REPORT_GROUP__REPORT_QUERY, ReportGroup.class, msgs);
            return basicSetReportGroup((ReportGroup) otherEnd, msgs);
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
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            return basicSetReportGroup(null, msgs);
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
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            if (resolve)
                return getReportGroup();
            return basicGetReportGroup();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            setReportGroup((ReportGroup) newValue);
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
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            setReportGroup((ReportGroup) null);
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
        case DatatypesPackage.QUERY_EXPRESSION__REPORT_GROUP:
            return reportGroup != null;
        }
        return super.eIsSet(featureID);
    }

} // QueryExpressionImpl

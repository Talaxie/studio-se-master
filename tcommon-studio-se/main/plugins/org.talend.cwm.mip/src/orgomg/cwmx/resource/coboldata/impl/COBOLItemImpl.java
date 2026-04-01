/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.resource.record.impl.FieldImpl;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.LinageInfo;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>COBOL Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getOccurringField <em>Occurring Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getStatusFD <em>Status FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getLinageInfo <em>Linage Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getDependingFD <em>Depending FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getPaddedFD <em>Padded FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.COBOLItemImpl#getRelativeFD <em>Relative FD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class COBOLItemImpl extends FieldImpl implements COBOLItem {

    /**
     * The cached value of the '{@link #getOccurringField() <em>Occurring Field</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOccurringField()
     * @generated
     * @ordered
     */
    protected EList<COBOLField> occurringField;

    /**
     * The cached value of the '{@link #getStatusFD() <em>Status FD</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStatusFD()
     * @generated
     * @ordered
     */
    protected EList<COBOLFD> statusFD;

    /**
     * The cached value of the '{@link #getLinageInfo() <em>Linage Info</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getLinageInfo()
     * @generated
     * @ordered
     */
    protected EList<LinageInfo> linageInfo;

    /**
     * The cached value of the '{@link #getDependingFD() <em>Depending FD</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDependingFD()
     * @generated
     * @ordered
     */
    protected EList<COBOLFD> dependingFD;

    /**
     * The cached value of the '{@link #getPaddedFD() <em>Padded FD</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPaddedFD()
     * @generated
     * @ordered
     */
    protected EList<COBOLFD> paddedFD;

    /**
     * The cached value of the '{@link #getRelativeFD() <em>Relative FD</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRelativeFD()
     * @generated
     * @ordered
     */
    protected EList<COBOLFD> relativeFD;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected COBOLItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.COBOL_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLField> getOccurringField() {
        if (occurringField == null) {
            occurringField = new EObjectWithInverseResolvingEList<COBOLField>(COBOLField.class, this,
                    CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD, CoboldataPackage.COBOL_FIELD__DEPENDING_ON_FIELD);
        }
        return occurringField;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLFD> getStatusFD() {
        if (statusFD == null) {
            statusFD = new EObjectWithInverseResolvingEList<COBOLFD>(COBOLFD.class, this, CoboldataPackage.COBOL_ITEM__STATUS_FD,
                    CoboldataPackage.COBOLFD__STATUS_ID);
        }
        return statusFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<LinageInfo> getLinageInfo() {
        if (linageInfo == null) {
            linageInfo = new EObjectWithInverseResolvingEList<LinageInfo>(LinageInfo.class, this,
                    CoboldataPackage.COBOL_ITEM__LINAGE_INFO, CoboldataPackage.LINAGE_INFO__COBOL_ITEM);
        }
        return linageInfo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLFD> getDependingFD() {
        if (dependingFD == null) {
            dependingFD = new EObjectWithInverseResolvingEList<COBOLFD>(COBOLFD.class, this,
                    CoboldataPackage.COBOL_ITEM__DEPENDING_FD, CoboldataPackage.COBOLFD__DEPENDS_ON);
        }
        return dependingFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLFD> getPaddedFD() {
        if (paddedFD == null) {
            paddedFD = new EObjectWithInverseResolvingEList<COBOLFD>(COBOLFD.class, this, CoboldataPackage.COBOL_ITEM__PADDED_FD,
                    CoboldataPackage.COBOLFD__PAD_FIELD);
        }
        return paddedFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLFD> getRelativeFD() {
        if (relativeFD == null) {
            relativeFD = new EObjectWithInverseResolvingEList<COBOLFD>(COBOLFD.class, this,
                    CoboldataPackage.COBOL_ITEM__RELATIVE_FD, CoboldataPackage.COBOLFD__RELATIVE_FIELD);
        }
        return relativeFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccurringField()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getStatusFD()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinageInfo()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDependingFD()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPaddedFD()).basicAdd(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRelativeFD()).basicAdd(otherEnd, msgs);
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
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            return ((InternalEList<?>) getOccurringField()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            return ((InternalEList<?>) getStatusFD()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            return ((InternalEList<?>) getLinageInfo()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            return ((InternalEList<?>) getDependingFD()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            return ((InternalEList<?>) getPaddedFD()).basicRemove(otherEnd, msgs);
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            return ((InternalEList<?>) getRelativeFD()).basicRemove(otherEnd, msgs);
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
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            return getOccurringField();
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            return getStatusFD();
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            return getLinageInfo();
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            return getDependingFD();
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            return getPaddedFD();
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            return getRelativeFD();
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
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            getOccurringField().clear();
            getOccurringField().addAll((Collection<? extends COBOLField>) newValue);
            return;
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            getStatusFD().clear();
            getStatusFD().addAll((Collection<? extends COBOLFD>) newValue);
            return;
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            getLinageInfo().clear();
            getLinageInfo().addAll((Collection<? extends LinageInfo>) newValue);
            return;
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            getDependingFD().clear();
            getDependingFD().addAll((Collection<? extends COBOLFD>) newValue);
            return;
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            getPaddedFD().clear();
            getPaddedFD().addAll((Collection<? extends COBOLFD>) newValue);
            return;
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            getRelativeFD().clear();
            getRelativeFD().addAll((Collection<? extends COBOLFD>) newValue);
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
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            getOccurringField().clear();
            return;
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            getStatusFD().clear();
            return;
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            getLinageInfo().clear();
            return;
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            getDependingFD().clear();
            return;
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            getPaddedFD().clear();
            return;
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            getRelativeFD().clear();
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
        case CoboldataPackage.COBOL_ITEM__OCCURRING_FIELD:
            return occurringField != null && !occurringField.isEmpty();
        case CoboldataPackage.COBOL_ITEM__STATUS_FD:
            return statusFD != null && !statusFD.isEmpty();
        case CoboldataPackage.COBOL_ITEM__LINAGE_INFO:
            return linageInfo != null && !linageInfo.isEmpty();
        case CoboldataPackage.COBOL_ITEM__DEPENDING_FD:
            return dependingFD != null && !dependingFD.isEmpty();
        case CoboldataPackage.COBOL_ITEM__PADDED_FD:
            return paddedFD != null && !paddedFD.isEmpty();
        case CoboldataPackage.COBOL_ITEM__RELATIVE_FD:
            return relativeFD != null && !relativeFD.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // COBOLItemImpl

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.FileSection;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>File Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.impl.FileSectionImpl#getCobolFD <em>Cobol FD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSectionImpl extends SectionImpl implements FileSection {

    /**
     * The cached value of the '{@link #getCobolFD() <em>Cobol FD</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCobolFD()
     * @generated
     * @ordered
     */
    protected EList<COBOLFD> cobolFD;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected FileSectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CoboldataPackage.Literals.FILE_SECTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<COBOLFD> getCobolFD() {
        if (cobolFD == null) {
            cobolFD = new EObjectContainmentWithInverseEList<COBOLFD>(COBOLFD.class, this,
                    CoboldataPackage.FILE_SECTION__COBOL_FD, CoboldataPackage.COBOLFD__FILE_SECTION);
        }
        return cobolFD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getCobolFD()).basicAdd(otherEnd, msgs);
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
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            return ((InternalEList<?>) getCobolFD()).basicRemove(otherEnd, msgs);
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
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            return getCobolFD();
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
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            getCobolFD().clear();
            getCobolFD().addAll((Collection<? extends COBOLFD>) newValue);
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
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            getCobolFD().clear();
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
        case CoboldataPackage.FILE_SECTION__COBOL_FD:
            return cobolFD != null && !cobolFD.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // FileSectionImpl

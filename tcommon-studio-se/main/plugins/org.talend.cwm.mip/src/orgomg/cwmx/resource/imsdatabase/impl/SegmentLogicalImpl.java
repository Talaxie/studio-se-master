/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SegmentLogical;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Segment Logical</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl#isKeyData1 <em>Key Data1</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl#isKeyData2 <em>Key Data2</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.impl.SegmentLogicalImpl#getPhysical <em>Physical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentLogicalImpl extends SegmentImpl implements SegmentLogical {

    /**
     * The default value of the '{@link #isKeyData1() <em>Key Data1</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKeyData1()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_DATA1_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKeyData1() <em>Key Data1</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKeyData1()
     * @generated
     * @ordered
     */
    protected boolean keyData1 = KEY_DATA1_EDEFAULT;

    /**
     * The default value of the '{@link #isKeyData2() <em>Key Data2</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKeyData2()
     * @generated
     * @ordered
     */
    protected static final boolean KEY_DATA2_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isKeyData2() <em>Key Data2</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isKeyData2()
     * @generated
     * @ordered
     */
    protected boolean keyData2 = KEY_DATA2_EDEFAULT;

    /**
     * The cached value of the '{@link #getPhysical() <em>Physical</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPhysical()
     * @generated
     * @ordered
     */
    protected EList<Segment> physical;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected SegmentLogicalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImsdatabasePackage.Literals.SEGMENT_LOGICAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isKeyData1() {
        return keyData1;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKeyData1(boolean newKeyData1) {
        boolean oldKeyData1 = keyData1;
        keyData1 = newKeyData1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA1, oldKeyData1,
                    keyData1));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isKeyData2() {
        return keyData2;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setKeyData2(boolean newKeyData2) {
        boolean oldKeyData2 = keyData2;
        keyData2 = newKeyData2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA2, oldKeyData2,
                    keyData2));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Segment> getPhysical() {
        if (physical == null) {
            physical = new EObjectWithInverseResolvingEList.ManyInverse<Segment>(Segment.class, this,
                    ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL, ImsdatabasePackage.SEGMENT__LOGICAL);
        }
        return physical;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getPhysical()).basicAdd(otherEnd, msgs);
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
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            return ((InternalEList<?>) getPhysical()).basicRemove(otherEnd, msgs);
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
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA1:
            return isKeyData1();
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA2:
            return isKeyData2();
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            return getPhysical();
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
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA1:
            setKeyData1((Boolean) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA2:
            setKeyData2((Boolean) newValue);
            return;
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            getPhysical().clear();
            getPhysical().addAll((Collection<? extends Segment>) newValue);
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
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA1:
            setKeyData1(KEY_DATA1_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA2:
            setKeyData2(KEY_DATA2_EDEFAULT);
            return;
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            getPhysical().clear();
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
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA1:
            return keyData1 != KEY_DATA1_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_LOGICAL__KEY_DATA2:
            return keyData2 != KEY_DATA2_EDEFAULT;
        case ImsdatabasePackage.SEGMENT_LOGICAL__PHYSICAL:
            return physical != null && !physical.isEmpty();
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
        result.append(" (keyData1: ");
        result.append(keyData1);
        result.append(", keyData2: ");
        result.append(keyData2);
        result.append(')');
        return result.toString();
    }

} // SegmentLogicalImpl

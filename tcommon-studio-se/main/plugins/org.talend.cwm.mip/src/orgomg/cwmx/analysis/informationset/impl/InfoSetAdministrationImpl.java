/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.analysis.informationset.InfoSetAdministration;
import orgomg.cwmx.analysis.informationset.InfoSetDate;
import orgomg.cwmx.analysis.informationset.InformationSet;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Info Set Administration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl#isAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl#getInformationSet <em>Information Set</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetAdministrationImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfoSetAdministrationImpl extends ModelElementImpl implements InfoSetAdministration {

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final String PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected String priority = PRIORITY_EDEFAULT;

    /**
     * The default value of the '{@link #isAcknowledgement() <em>Acknowledgement</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAcknowledgement()
     * @generated
     * @ordered
     */
    protected static final boolean ACKNOWLEDGEMENT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAcknowledgement() <em>Acknowledgement</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isAcknowledgement()
     * @generated
     * @ordered
     */
    protected boolean acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;

    /**
     * The cached value of the '{@link #getDate() <em>Date</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDate()
     * @generated
     * @ordered
     */
    protected EList<InfoSetDate> date;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InfoSetAdministrationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.INFO_SET_ADMINISTRATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setPriority(String newPriority) {
        String oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_ADMINISTRATION__PRIORITY,
                    oldPriority, priority));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isAcknowledgement() {
        return acknowledgement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setAcknowledgement(boolean newAcknowledgement) {
        boolean oldAcknowledgement = acknowledgement;
        acknowledgement = newAcknowledgement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT,
                    oldAcknowledgement, acknowledgement));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InformationSet getInformationSet() {
        if (eContainerFeatureID() != InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET)
            return null;
        return (InformationSet) eContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInformationSet(InformationSet newInformationSet, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newInformationSet,
                InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setInformationSet(InformationSet newInformationSet) {
        if (newInformationSet != eInternalContainer()
                || (eContainerFeatureID() != InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET && newInformationSet != null)) {
            if (EcoreUtil.isAncestor(this, newInformationSet))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newInformationSet != null)
                msgs = ((InternalEObject) newInformationSet).eInverseAdd(this,
                        InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN, InformationSet.class, msgs);
            msgs = basicSetInformationSet(newInformationSet, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET,
                    newInformationSet, newInformationSet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<InfoSetDate> getDate() {
        if (date == null) {
            date = new EObjectWithInverseResolvingEList.ManyInverse<InfoSetDate>(InfoSetDate.class, this,
                    InformationsetPackage.INFO_SET_ADMINISTRATION__DATE, InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN);
        }
        return date;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetInformationSet((InformationSet) otherEnd, msgs);
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDate()).basicAdd(otherEnd, msgs);
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
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            return basicSetInformationSet(null, msgs);
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            return ((InternalEList<?>) getDate()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            return eInternalContainer().eInverseRemove(this, InformationsetPackage.INFORMATION_SET__INFO_SET_ADMIN,
                    InformationSet.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case InformationsetPackage.INFO_SET_ADMINISTRATION__PRIORITY:
            return getPriority();
        case InformationsetPackage.INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT:
            return isAcknowledgement();
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            return getInformationSet();
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            return getDate();
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
        case InformationsetPackage.INFO_SET_ADMINISTRATION__PRIORITY:
            setPriority((String) newValue);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT:
            setAcknowledgement((Boolean) newValue);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            setInformationSet((InformationSet) newValue);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            getDate().clear();
            getDate().addAll((Collection<? extends InfoSetDate>) newValue);
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
        case InformationsetPackage.INFO_SET_ADMINISTRATION__PRIORITY:
            setPriority(PRIORITY_EDEFAULT);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT:
            setAcknowledgement(ACKNOWLEDGEMENT_EDEFAULT);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            setInformationSet((InformationSet) null);
            return;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            getDate().clear();
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
        case InformationsetPackage.INFO_SET_ADMINISTRATION__PRIORITY:
            return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
        case InformationsetPackage.INFO_SET_ADMINISTRATION__ACKNOWLEDGEMENT:
            return acknowledgement != ACKNOWLEDGEMENT_EDEFAULT;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__INFORMATION_SET:
            return getInformationSet() != null;
        case InformationsetPackage.INFO_SET_ADMINISTRATION__DATE:
            return date != null && !date.isEmpty();
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
        result.append(" (priority: ");
        result.append(priority);
        result.append(", acknowledgement: ");
        result.append(acknowledgement);
        result.append(')');
        return result.toString();
    }

} // InfoSetAdministrationImpl

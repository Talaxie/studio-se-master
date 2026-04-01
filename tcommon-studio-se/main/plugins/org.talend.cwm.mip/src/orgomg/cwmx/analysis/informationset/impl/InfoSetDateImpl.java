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
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.objectmodel.core.impl.ModelElementImpl;
import orgomg.cwmx.analysis.informationset.InfoSetAdministration;
import orgomg.cwmx.analysis.informationset.InfoSetDate;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Info Set Date</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.impl.InfoSetDateImpl#getInfoSetAdmin <em>Info Set Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfoSetDateImpl extends ModelElementImpl implements InfoSetDate {

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected static final String FORMAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFormat()
     * @generated
     * @ordered
     */
    protected String format = FORMAT_EDEFAULT;

    /**
     * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected static final String DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getDateTime()
     * @generated
     * @ordered
     */
    protected String dateTime = DATE_TIME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInfoSetAdmin() <em>Info Set Admin</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getInfoSetAdmin()
     * @generated
     * @ordered
     */
    protected EList<InfoSetAdministration> infoSetAdmin;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected InfoSetDateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return InformationsetPackage.Literals.INFO_SET_DATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_DATE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFormat() {
        return format;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFormat(String newFormat) {
        String oldFormat = format;
        format = newFormat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_DATE__FORMAT, oldFormat, format));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setDateTime(String newDateTime) {
        String oldDateTime = dateTime;
        dateTime = newDateTime;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, InformationsetPackage.INFO_SET_DATE__DATE_TIME, oldDateTime,
                    dateTime));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<InfoSetAdministration> getInfoSetAdmin() {
        if (infoSetAdmin == null) {
            infoSetAdmin = new EObjectWithInverseResolvingEList.ManyInverse<InfoSetAdministration>(InfoSetAdministration.class,
                    this, InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN,
                    InformationsetPackage.INFO_SET_ADMINISTRATION__DATE);
        }
        return infoSetAdmin;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getInfoSetAdmin()).basicAdd(otherEnd, msgs);
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
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            return ((InternalEList<?>) getInfoSetAdmin()).basicRemove(otherEnd, msgs);
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
        case InformationsetPackage.INFO_SET_DATE__TYPE:
            return getType();
        case InformationsetPackage.INFO_SET_DATE__FORMAT:
            return getFormat();
        case InformationsetPackage.INFO_SET_DATE__DATE_TIME:
            return getDateTime();
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            return getInfoSetAdmin();
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
        case InformationsetPackage.INFO_SET_DATE__TYPE:
            setType((String) newValue);
            return;
        case InformationsetPackage.INFO_SET_DATE__FORMAT:
            setFormat((String) newValue);
            return;
        case InformationsetPackage.INFO_SET_DATE__DATE_TIME:
            setDateTime((String) newValue);
            return;
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            getInfoSetAdmin().clear();
            getInfoSetAdmin().addAll((Collection<? extends InfoSetAdministration>) newValue);
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
        case InformationsetPackage.INFO_SET_DATE__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case InformationsetPackage.INFO_SET_DATE__FORMAT:
            setFormat(FORMAT_EDEFAULT);
            return;
        case InformationsetPackage.INFO_SET_DATE__DATE_TIME:
            setDateTime(DATE_TIME_EDEFAULT);
            return;
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            getInfoSetAdmin().clear();
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
        case InformationsetPackage.INFO_SET_DATE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case InformationsetPackage.INFO_SET_DATE__FORMAT:
            return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
        case InformationsetPackage.INFO_SET_DATE__DATE_TIME:
            return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
        case InformationsetPackage.INFO_SET_DATE__INFO_SET_ADMIN:
            return infoSetAdmin != null && !infoSetAdmin.isEmpty();
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
        result.append(" (type: ");
        result.append(type);
        result.append(", format: ");
        result.append(format);
        result.append(", dateTime: ");
        result.append(dateTime);
        result.append(')');
        return result.toString();
    }

} // InfoSetDateImpl

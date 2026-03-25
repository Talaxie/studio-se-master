/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.repository.services.model.services.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.repository.services.model.services.ServiceOperation;
import org.talend.repository.services.model.services.ServicesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service Operation</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl#getReferenceJobId <em>Reference
 * Job Id</em>}</li>
 * <li>{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl#getOperationName <em>Operation
 * Name</em>}</li>
 * <li>{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl#getDocumentation <em>Documentation
 * </em>}</li>
 * <li>{@link org.talend.repository.services.model.services.impl.ServiceOperationImpl#getOperationLabel <em>Operation
 * Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ServiceOperationImpl extends EObjectImpl implements ServiceOperation {

    /**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
    protected static final String LABEL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
    protected String label = LABEL_EDEFAULT;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
    protected String id = ID_EDEFAULT;

    /**
	 * The default value of the '{@link #getReferenceJobId() <em>Reference Job Id</em>}' attribute.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @see #getReferenceJobId()
	 * @generated
	 * @ordered
	 */
    protected static final String REFERENCE_JOB_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getReferenceJobId() <em>Reference Job Id</em>}' attribute.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @see #getReferenceJobId()
	 * @generated
	 * @ordered
	 */
    protected String referenceJobId = REFERENCE_JOB_ID_EDEFAULT;

    /**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected static final String DOCUMENTATION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
    protected String documentation = DOCUMENTATION_EDEFAULT;

    /**
	 * The default value of the '{@link #isInBinding() <em>In Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInBinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_BINDING_EDEFAULT = true;

				/**
	 * The cached value of the '{@link #isInBinding() <em>In Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInBinding()
	 * @generated
	 * @ordered
	 */
	protected boolean inBinding = IN_BINDING_EDEFAULT;

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected ServiceOperationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ServicesPackage.Literals.SERVICE_OPERATION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLabel() {
		return label;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__LABEL, oldLabel, label));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getReferenceJobId() {
		return referenceJobId;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setReferenceJobId(String newReferenceJobId) {
		String oldReferenceJobId = referenceJobId;
		referenceJobId = newReferenceJobId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__REFERENCE_JOB_ID, oldReferenceJobId, referenceJobId));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public String getDocumentation() {
		return documentation;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__DOCUMENTATION, oldDocumentation, documentation));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInBinding() {
		return inBinding;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBinding(boolean newInBinding) {
		boolean oldInBinding = inBinding;
		inBinding = newInBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_OPERATION__IN_BINDING, oldInBinding, inBinding));
	}

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackage.SERVICE_OPERATION__LABEL:
				return getLabel();
			case ServicesPackage.SERVICE_OPERATION__NAME:
				return getName();
			case ServicesPackage.SERVICE_OPERATION__ID:
				return getId();
			case ServicesPackage.SERVICE_OPERATION__REFERENCE_JOB_ID:
				return getReferenceJobId();
			case ServicesPackage.SERVICE_OPERATION__DOCUMENTATION:
				return getDocumentation();
			case ServicesPackage.SERVICE_OPERATION__IN_BINDING:
				return isInBinding();
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
			case ServicesPackage.SERVICE_OPERATION__LABEL:
				setLabel((String)newValue);
				return;
			case ServicesPackage.SERVICE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case ServicesPackage.SERVICE_OPERATION__ID:
				setId((String)newValue);
				return;
			case ServicesPackage.SERVICE_OPERATION__REFERENCE_JOB_ID:
				setReferenceJobId((String)newValue);
				return;
			case ServicesPackage.SERVICE_OPERATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case ServicesPackage.SERVICE_OPERATION__IN_BINDING:
				setInBinding((Boolean)newValue);
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
			case ServicesPackage.SERVICE_OPERATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ServicesPackage.SERVICE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicesPackage.SERVICE_OPERATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicesPackage.SERVICE_OPERATION__REFERENCE_JOB_ID:
				setReferenceJobId(REFERENCE_JOB_ID_EDEFAULT);
				return;
			case ServicesPackage.SERVICE_OPERATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case ServicesPackage.SERVICE_OPERATION__IN_BINDING:
				setInBinding(IN_BINDING_EDEFAULT);
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
			case ServicesPackage.SERVICE_OPERATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ServicesPackage.SERVICE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicesPackage.SERVICE_OPERATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicesPackage.SERVICE_OPERATION__REFERENCE_JOB_ID:
				return REFERENCE_JOB_ID_EDEFAULT == null ? referenceJobId != null : !REFERENCE_JOB_ID_EDEFAULT.equals(referenceJobId);
			case ServicesPackage.SERVICE_OPERATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case ServicesPackage.SERVICE_OPERATION__IN_BINDING:
				return inBinding != IN_BINDING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", referenceJobId: ");
		result.append(referenceJobId);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", inBinding: ");
		result.append(inBinding);
		result.append(')');
		return result.toString();
	}

    public boolean isReadOnly() {
        return false;
    }

} // ServiceOperationImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.services.model.services;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#getLabel <em>Label</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#getId <em>Id</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#getReferenceJobId <em>Reference Job Id</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.talend.repository.services.model.services.ServiceOperation#isInBinding <em>In Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation()
 * @model
 * @generated
 */
public interface ServiceOperation extends EObject {
    /**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_Label()
	 * @model
	 * @generated
	 */
    String getLabel();

    /**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
    void setLabel(String value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_Name()
	 * @model
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_Id()
	 * @model
	 * @generated
	 */
    String getId();

    /**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
    void setId(String value);

    /**
	 * Returns the value of the '<em><b>Reference Job Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Job Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Job Id</em>' attribute.
	 * @see #setReferenceJobId(String)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_ReferenceJobId()
	 * @model
	 * @generated
	 */
    String getReferenceJobId();

    /**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#getReferenceJobId <em>Reference Job Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Job Id</em>' attribute.
	 * @see #getReferenceJobId()
	 * @generated
	 */
    void setReferenceJobId(String value);

    /**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_Documentation()
	 * @model
	 * @generated
	 */
    String getDocumentation();

    /**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
    void setDocumentation(String value);

				/**
	 * Returns the value of the '<em><b>In Binding</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Binding</em>' attribute.
	 * @see #setInBinding(boolean)
	 * @see org.talend.repository.services.model.services.ServicesPackage#getServiceOperation_InBinding()
	 * @model default="true"
	 * @generated
	 */
	boolean isInBinding();

				/**
	 * Sets the value of the '{@link org.talend.repository.services.model.services.ServiceOperation#isInBinding <em>In Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Binding</em>' attribute.
	 * @see #isInBinding()
	 * @generated
	 */
	void setInBinding(boolean value);

} // ServiceOperation

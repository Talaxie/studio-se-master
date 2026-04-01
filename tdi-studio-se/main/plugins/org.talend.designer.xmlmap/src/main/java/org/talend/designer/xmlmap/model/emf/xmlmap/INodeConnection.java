/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INode Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getSource <em>Source</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getINodeConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface INodeConnection extends IConnection {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getINodeConnection_Name()
     * @model transient="true" changeable="false" volatile="true"
     * @generated
     */
    String getName();

    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(AbstractNode)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getINodeConnection_Source()
     * @model resolveProxies="false"
     * @generated
     */
    AbstractNode getSource();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(AbstractNode value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(AbstractNode)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getINodeConnection_Target()
     * @model resolveProxies="false"
     * @generated
     */
    AbstractNode getTarget();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(AbstractNode value);

} // INodeConnection

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Xml Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isReject <em>Reject</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isRejectInnerJoin <em>Reject Inner Join</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isErrorReject <em>Error Reject</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isAllInOne <em>All In One</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isEnableEmptyElement <em>Enable Empty Element</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#getInputLoopNodesTables <em>Input Loop Nodes Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree()
 * @model
 * @generated
 */
public interface OutputXmlTree extends AbstractInOutTree {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_Nodes()
     * @model containment="true"
     * @generated
     */
    EList<OutputTreeNode> getNodes();

    /**
     * Returns the value of the '<em><b>Reject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reject</em>' attribute.
     * @see #setReject(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_Reject()
     * @model
     * @generated
     */
    boolean isReject();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isReject <em>Reject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reject</em>' attribute.
     * @see #isReject()
     * @generated
     */
    void setReject(boolean value);

    /**
     * Returns the value of the '<em><b>Reject Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reject Inner Join</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reject Inner Join</em>' attribute.
     * @see #setRejectInnerJoin(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_RejectInnerJoin()
     * @model
     * @generated
     */
    boolean isRejectInnerJoin();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isRejectInnerJoin <em>Reject Inner Join</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reject Inner Join</em>' attribute.
     * @see #isRejectInnerJoin()
     * @generated
     */
    void setRejectInnerJoin(boolean value);

    /**
     * Returns the value of the '<em><b>Error Reject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error Reject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error Reject</em>' attribute.
     * @see #setErrorReject(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_ErrorReject()
     * @model
     * @generated
     */
    boolean isErrorReject();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isErrorReject <em>Error Reject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Error Reject</em>' attribute.
     * @see #isErrorReject()
     * @generated
     */
    void setErrorReject(boolean value);

    /**
     * Returns the value of the '<em><b>All In One</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>All In One</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>All In One</em>' attribute.
     * @see #setAllInOne(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_AllInOne()
     * @model
     * @generated
     */
    boolean isAllInOne();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isAllInOne <em>All In One</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>All In One</em>' attribute.
     * @see #isAllInOne()
     * @generated
     */
    void setAllInOne(boolean value);

    /**
     * Returns the value of the '<em><b>Enable Empty Element</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enable Empty Element</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enable Empty Element</em>' attribute.
     * @see #setEnableEmptyElement(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_EnableEmptyElement()
     * @model default="true"
     * @generated
     */
    boolean isEnableEmptyElement();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree#isEnableEmptyElement <em>Enable Empty Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enable Empty Element</em>' attribute.
     * @see #isEnableEmptyElement()
     * @generated
     */
    void setEnableEmptyElement(boolean value);

    /**
     * Returns the value of the '<em><b>Input Loop Nodes Tables</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Loop Nodes Tables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Loop Nodes Tables</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getOutputXmlTree_InputLoopNodesTables()
     * @model containment="true"
     * @generated
     */
    EList<InputLoopNodesTable> getInputLoopNodesTables();

} // OutputXmlTree

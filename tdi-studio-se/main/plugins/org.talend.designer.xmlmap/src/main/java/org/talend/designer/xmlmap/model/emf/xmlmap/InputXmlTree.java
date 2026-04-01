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
 * A representation of the model object '<em><b>Input Xml Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isLookup <em>Lookup</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getMatchingMode <em>Matching Mode</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getLookupMode <em>Lookup Mode</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isInnerJoin <em>Inner Join</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isActivateGlobalMap <em>Activate Global Map</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getGlobalMapKeysValues <em>Global Map Keys Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree()
 * @model
 * @generated
 */
public interface InputXmlTree extends AbstractInOutTree {
    /**
     * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nodes</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_Nodes()
     * @model containment="true"
     * @generated
     */
    EList<TreeNode> getNodes();

    /**
     * Returns the value of the '<em><b>Lookup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lookup</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lookup</em>' attribute.
     * @see #setLookup(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_Lookup()
     * @model
     * @generated
     */
    boolean isLookup();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isLookup <em>Lookup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lookup</em>' attribute.
     * @see #isLookup()
     * @generated
     */
    void setLookup(boolean value);

    /**
     * Returns the value of the '<em><b>Matching Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matching Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matching Mode</em>' attribute.
     * @see #setMatchingMode(String)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_MatchingMode()
     * @model
     * @generated
     */
    String getMatchingMode();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getMatchingMode <em>Matching Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matching Mode</em>' attribute.
     * @see #getMatchingMode()
     * @generated
     */
    void setMatchingMode(String value);

    /**
     * Returns the value of the '<em><b>Lookup Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lookup Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lookup Mode</em>' attribute.
     * @see #setLookupMode(String)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_LookupMode()
     * @model
     * @generated
     */
    String getLookupMode();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#getLookupMode <em>Lookup Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lookup Mode</em>' attribute.
     * @see #getLookupMode()
     * @generated
     */
    void setLookupMode(String value);

    /**
     * Returns the value of the '<em><b>Inner Join</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Join</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Join</em>' attribute.
     * @see #setInnerJoin(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_InnerJoin()
     * @model
     * @generated
     */
    boolean isInnerJoin();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isInnerJoin <em>Inner Join</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Join</em>' attribute.
     * @see #isInnerJoin()
     * @generated
     */
    void setInnerJoin(boolean value);

    /**
     * Returns the value of the '<em><b>Persistent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persistent</em>' attribute.
     * @see #setPersistent(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_Persistent()
     * @model
     * @generated
     */
    boolean isPersistent();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isPersistent <em>Persistent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Persistent</em>' attribute.
     * @see #isPersistent()
     * @generated
     */
    void setPersistent(boolean value);

    /**
     * Returns the value of the '<em><b>Activate Global Map</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activate Global Map</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activate Global Map</em>' attribute.
     * @see #setActivateGlobalMap(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_ActivateGlobalMap()
     * @model
     * @generated
     */
    boolean isActivateGlobalMap();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree#isActivateGlobalMap <em>Activate Global Map</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activate Global Map</em>' attribute.
     * @see #isActivateGlobalMap()
     * @generated
     */
    void setActivateGlobalMap(boolean value);

    /**
     * Returns the value of the '<em><b>Global Map Keys Values</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Map Keys Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Map Keys Values</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getInputXmlTree_GlobalMapKeysValues()
     * @model containment="true"
     * @generated
     */
    EList<GlobalMapNode> getGlobalMapKeysValues();

} // InputXmlTree

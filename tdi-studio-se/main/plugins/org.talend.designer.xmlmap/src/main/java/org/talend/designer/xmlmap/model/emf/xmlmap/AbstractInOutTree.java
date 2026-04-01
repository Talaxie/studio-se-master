/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;

import org.eclipse.emf.common.util.EList;

import org.talend.designer.gefabstractmap.model.abstractmap.MapperTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract In Out Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getExpressionFilter <em>Expression Filter</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateExpressionFilter <em>Activate Expression Filter</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateCondensedTool <em>Activate Condensed Tool</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMinimized <em>Minimized</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getName <em>Name</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getFilterIncomingConnections <em>Filter Incoming Connections</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMultiLoops <em>Multi Loops</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInOutTree extends MapperTable {
    /**
     * Returns the value of the '<em><b>Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression Filter</em>' attribute.
     * @see #setExpressionFilter(String)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_ExpressionFilter()
     * @model
     * @generated
     */
    String getExpressionFilter();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getExpressionFilter <em>Expression Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression Filter</em>' attribute.
     * @see #getExpressionFilter()
     * @generated
     */
    void setExpressionFilter(String value);

    /**
     * Returns the value of the '<em><b>Activate Expression Filter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activate Expression Filter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activate Expression Filter</em>' attribute.
     * @see #setActivateExpressionFilter(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_ActivateExpressionFilter()
     * @model
     * @generated
     */
    boolean isActivateExpressionFilter();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateExpressionFilter <em>Activate Expression Filter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activate Expression Filter</em>' attribute.
     * @see #isActivateExpressionFilter()
     * @generated
     */
    void setActivateExpressionFilter(boolean value);

    /**
     * Returns the value of the '<em><b>Activate Condensed Tool</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activate Condensed Tool</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activate Condensed Tool</em>' attribute.
     * @see #setActivateCondensedTool(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_ActivateCondensedTool()
     * @model
     * @generated
     */
    boolean isActivateCondensedTool();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isActivateCondensedTool <em>Activate Condensed Tool</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activate Condensed Tool</em>' attribute.
     * @see #isActivateCondensedTool()
     * @generated
     */
    void setActivateCondensedTool(boolean value);

    /**
     * Returns the value of the '<em><b>Minimized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimized</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimized</em>' attribute.
     * @see #setMinimized(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_Minimized()
     * @model
     * @generated
     */
    boolean isMinimized();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMinimized <em>Minimized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimized</em>' attribute.
     * @see #isMinimized()
     * @generated
     */
    void setMinimized(boolean value);

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
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Filter Incoming Connections</b></em>' reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter Incoming Connections</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filter Incoming Connections</em>' reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_FilterIncomingConnections()
     * @model
     * @generated
     */
    EList<FilterConnection> getFilterIncomingConnections();

    /**
     * Returns the value of the '<em><b>Multi Loops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multi Loops</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multi Loops</em>' attribute.
     * @see #setMultiLoops(boolean)
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getAbstractInOutTree_MultiLoops()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     * @generated
     */
    boolean isMultiLoops();

    /**
     * Sets the value of the '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree#isMultiLoops <em>Multi Loops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multi Loops</em>' attribute.
     * @see #isMultiLoops()
     * @generated
     */
    void setMultiLoops(boolean value);

} // AbstractInOutTree

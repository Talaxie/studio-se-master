/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap;

import org.eclipse.emf.common.util.EList;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Map Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getInputTrees <em>Input Trees</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getOutputTrees <em>Output Trees</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getVarTables <em>Var Tables</em>}</li>
 *   <li>{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getXmlMapData()
 * @model
 * @generated
 */
public interface XmlMapData extends AbstractExternalData {
    /**
     * Returns the value of the '<em><b>Input Trees</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input Trees</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Input Trees</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getXmlMapData_InputTrees()
     * @model containment="true"
     * @generated
     */
    EList<InputXmlTree> getInputTrees();

    /**
     * Returns the value of the '<em><b>Output Trees</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Trees</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Trees</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getXmlMapData_OutputTrees()
     * @model containment="true"
     * @generated
     */
    EList<OutputXmlTree> getOutputTrees();

    /**
     * Returns the value of the '<em><b>Var Tables</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Var Tables</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Var Tables</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getXmlMapData_VarTables()
     * @model containment="true"
     * @generated
     */
    EList<VarTable> getVarTables();

    /**
     * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.designer.xmlmap.model.emf.xmlmap.IConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connections</em>' containment reference list.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage#getXmlMapData_Connections()
     * @model containment="true"
     * @generated
     */
    EList<IConnection> getConnections();

} // XmlMapData

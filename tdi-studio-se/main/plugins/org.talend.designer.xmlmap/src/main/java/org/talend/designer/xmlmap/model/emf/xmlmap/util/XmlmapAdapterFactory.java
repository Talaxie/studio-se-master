/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.xmlmap.model.emf.xmlmap.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

import org.talend.designer.gefabstractmap.model.abstractmap.MapperTable;
import org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity;

import org.talend.designer.xmlmap.model.emf.xmlmap.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlmapPackage
 * @generated
 */
public class XmlmapAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static XmlmapPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmlmapAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = XmlmapPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XmlmapSwitch<Adapter> modelSwitch =
        new XmlmapSwitch<Adapter>() {
            @Override
            public Adapter caseXmlMapData(XmlMapData object) {
                return createXmlMapDataAdapter();
            }
            @Override
            public Adapter caseAbstractInOutTree(AbstractInOutTree object) {
                return createAbstractInOutTreeAdapter();
            }
            @Override
            public Adapter caseInputXmlTree(InputXmlTree object) {
                return createInputXmlTreeAdapter();
            }
            @Override
            public Adapter caseOutputXmlTree(OutputXmlTree object) {
                return createOutputXmlTreeAdapter();
            }
            @Override
            public Adapter caseVarTable(VarTable object) {
                return createVarTableAdapter();
            }
            @Override
            public Adapter caseAbstractNode(AbstractNode object) {
                return createAbstractNodeAdapter();
            }
            @Override
            public Adapter caseTreeNode(TreeNode object) {
                return createTreeNodeAdapter();
            }
            @Override
            public Adapter caseOutputTreeNode(OutputTreeNode object) {
                return createOutputTreeNodeAdapter();
            }
            @Override
            public Adapter caseVarNode(VarNode object) {
                return createVarNodeAdapter();
            }
            @Override
            public Adapter caseGlobalMapNode(GlobalMapNode object) {
                return createGlobalMapNodeAdapter();
            }
            @Override
            public Adapter caseIConnection(IConnection object) {
                return createIConnectionAdapter();
            }
            @Override
            public Adapter caseINodeConnection(INodeConnection object) {
                return createINodeConnectionAdapter();
            }
            @Override
            public Adapter caseConnection(Connection object) {
                return createConnectionAdapter();
            }
            @Override
            public Adapter caseLookupConnection(LookupConnection object) {
                return createLookupConnectionAdapter();
            }
            @Override
            public Adapter caseFilterConnection(FilterConnection object) {
                return createFilterConnectionAdapter();
            }
            @Override
            public Adapter caseInputLoopNodesTable(InputLoopNodesTable object) {
                return createInputLoopNodesTableAdapter();
            }
            @Override
            public Adapter caseAbstractExternalData(AbstractExternalData object) {
                return createAbstractExternalDataAdapter();
            }
            @Override
            public Adapter caseMapperTable(MapperTable object) {
                return createMapperTableAdapter();
            }
            @Override
            public Adapter caseMapperTableEntity(MapperTableEntity object) {
                return createMapperTableEntityAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData <em>Xml Map Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.XmlMapData
     * @generated
     */
    public Adapter createXmlMapDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree <em>Abstract In Out Tree</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractInOutTree
     * @generated
     */
    public Adapter createAbstractInOutTreeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree <em>Input Xml Tree</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputXmlTree
     * @generated
     */
    public Adapter createInputXmlTreeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree <em>Output Xml Tree</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputXmlTree
     * @generated
     */
    public Adapter createOutputXmlTreeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarTable <em>Var Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarTable
     * @generated
     */
    public Adapter createVarTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode <em>Abstract Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.AbstractNode
     * @generated
     */
    public Adapter createAbstractNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode <em>Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.TreeNode
     * @generated
     */
    public Adapter createTreeNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode <em>Output Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.OutputTreeNode
     * @generated
     */
    public Adapter createOutputTreeNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.VarNode <em>Var Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.VarNode
     * @generated
     */
    public Adapter createVarNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode <em>Global Map Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.GlobalMapNode
     * @generated
     */
    public Adapter createGlobalMapNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.IConnection <em>IConnection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.IConnection
     * @generated
     */
    public Adapter createIConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection <em>INode Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.INodeConnection
     * @generated
     */
    public Adapter createINodeConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.Connection <em>Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.Connection
     * @generated
     */
    public Adapter createConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection <em>Lookup Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.LookupConnection
     * @generated
     */
    public Adapter createLookupConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection <em>Filter Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.FilterConnection
     * @generated
     */
    public Adapter createFilterConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable <em>Input Loop Nodes Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.xmlmap.model.emf.xmlmap.InputLoopNodesTable
     * @generated
     */
    public Adapter createInputLoopNodesTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData <em>Abstract External Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData
     * @generated
     */
    public Adapter createAbstractExternalDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTable <em>Mapper Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTable
     * @generated
     */
    public Adapter createMapperTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity <em>Mapper Table Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity
     * @generated
     */
    public Adapter createMapperTableEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //XmlmapAdapterFactory

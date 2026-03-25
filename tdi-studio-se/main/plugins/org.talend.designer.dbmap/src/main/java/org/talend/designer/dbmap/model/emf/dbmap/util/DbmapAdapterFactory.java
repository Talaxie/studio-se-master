/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.dbmap.model.emf.dbmap.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

import org.talend.designer.dbmap.model.emf.dbmap.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.dbmap.model.emf.dbmap.DbmapPackage
 * @generated
 */
public class DbmapAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DbmapPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DbmapAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DbmapPackage.eINSTANCE;
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
    protected DbmapSwitch<Adapter> modelSwitch =
        new DbmapSwitch<Adapter>() {
            @Override
            public Adapter caseDBMapData(DBMapData object) {
                return createDBMapDataAdapter();
            }
            @Override
            public Adapter caseDBMapperTableEntry(DBMapperTableEntry object) {
                return createDBMapperTableEntryAdapter();
            }
            @Override
            public Adapter caseAbstractDBDataMapTable(AbstractDBDataMapTable object) {
                return createAbstractDBDataMapTableAdapter();
            }
            @Override
            public Adapter caseAbstaceDBInOutTable(AbstaceDBInOutTable object) {
                return createAbstaceDBInOutTableAdapter();
            }
            @Override
            public Adapter caseVarTable(VarTable object) {
                return createVarTableAdapter();
            }
            @Override
            public Adapter caseInputTable(InputTable object) {
                return createInputTableAdapter();
            }
            @Override
            public Adapter caseOutputTable(OutputTable object) {
                return createOutputTableAdapter();
            }
            @Override
            public Adapter caseFilterEntry(FilterEntry object) {
                return createFilterEntryAdapter();
            }
            @Override
            public Adapter caseAbstractExternalData(AbstractExternalData object) {
                return createAbstractExternalDataAdapter();
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
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.DBMapData <em>DB Map Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.DBMapData
     * @generated
     */
    public Adapter createDBMapDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.DBMapperTableEntry <em>DB Mapper Table Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.DBMapperTableEntry
     * @generated
     */
    public Adapter createDBMapperTableEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.AbstractDBDataMapTable <em>Abstract DB Data Map Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.AbstractDBDataMapTable
     * @generated
     */
    public Adapter createAbstractDBDataMapTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.AbstaceDBInOutTable <em>Abstace DB In Out Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.AbstaceDBInOutTable
     * @generated
     */
    public Adapter createAbstaceDBInOutTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.VarTable <em>Var Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.VarTable
     * @generated
     */
    public Adapter createVarTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.InputTable <em>Input Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.InputTable
     * @generated
     */
    public Adapter createInputTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.OutputTable <em>Output Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.OutputTable
     * @generated
     */
    public Adapter createOutputTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.dbmap.model.emf.dbmap.FilterEntry <em>Filter Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.dbmap.model.emf.dbmap.FilterEntry
     * @generated
     */
    public Adapter createFilterEntryAdapter() {
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

} //DbmapAdapterFactory

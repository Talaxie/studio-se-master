/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.mapper.model.emf.mapper.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.talend.designer.core.model.utils.emf.talendfile.AbstractExternalData;

import org.talend.designer.mapper.model.emf.mapper.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.mapper.model.emf.mapper.MapperPackage
 * @generated
 */
public class MapperAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static MapperPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapperAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MapperPackage.eINSTANCE;
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
    protected MapperSwitch<Adapter> modelSwitch =
        new MapperSwitch<Adapter>() {
            @Override
            public Adapter caseMapperData(MapperData object) {
                return createMapperDataAdapter();
            }
            @Override
            public Adapter caseMapperTableEntry(MapperTableEntry object) {
                return createMapperTableEntryAdapter();
            }
            @Override
            public Adapter caseAbstractDataMapTable(AbstractDataMapTable object) {
                return createAbstractDataMapTableAdapter();
            }
            @Override
            public Adapter caseAbstractInOutTable(AbstractInOutTable object) {
                return createAbstractInOutTableAdapter();
            }
            @Override
            public Adapter caseUiProperties(UiProperties object) {
                return createUiPropertiesAdapter();
            }
            @Override
            public Adapter caseVarTable(VarTable object) {
                return createVarTableAdapter();
            }
            @Override
            public Adapter caseOutputTable(OutputTable object) {
                return createOutputTableAdapter();
            }
            @Override
            public Adapter caseInputTable(InputTable object) {
                return createInputTableAdapter();
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
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.MapperData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.MapperData
     * @generated
     */
    public Adapter createMapperDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.MapperTableEntry <em>Table Entry</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.MapperTableEntry
     * @generated
     */
    public Adapter createMapperTableEntryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable <em>Abstract Data Map Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.AbstractDataMapTable
     * @generated
     */
    public Adapter createAbstractDataMapTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.AbstractInOutTable <em>Abstract In Out Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.AbstractInOutTable
     * @generated
     */
    public Adapter createAbstractInOutTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.UiProperties <em>Ui Properties</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.UiProperties
     * @generated
     */
    public Adapter createUiPropertiesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.VarTable <em>Var Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.VarTable
     * @generated
     */
    public Adapter createVarTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.OutputTable <em>Output Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.OutputTable
     * @generated
     */
    public Adapter createOutputTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.designer.mapper.model.emf.mapper.InputTable <em>Input Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.designer.mapper.model.emf.mapper.InputTable
     * @generated
     */
    public Adapter createInputTableAdapter() {
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

} //MapperAdapterFactory

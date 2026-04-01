/**
 */
package org.talend.model.recyclebin.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.model.recyclebin.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecycleBinFactoryImpl extends EFactoryImpl implements RecycleBinFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RecycleBinFactory init() {
        try {
            RecycleBinFactory theRecycleBinFactory = (RecycleBinFactory)EPackage.Registry.INSTANCE.getEFactory(RecycleBinPackage.eNS_URI);
            if (theRecycleBinFactory != null) {
                return theRecycleBinFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RecycleBinFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecycleBinFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case RecycleBinPackage.RECYCLE_BIN: return createRecycleBin();
            case RecycleBinPackage.TALEND_ITEM: return createTalendItem();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecycleBin createRecycleBin() {
        RecycleBinImpl recycleBin = new RecycleBinImpl();
        return recycleBin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendItem createTalendItem() {
        TalendItemImpl talendItem = new TalendItemImpl();
        return talendItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecycleBinPackage getRecycleBinPackage() {
        return (RecycleBinPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RecycleBinPackage getPackage() {
        return RecycleBinPackage.eINSTANCE;
    }

} //RecycleBinFactoryImpl

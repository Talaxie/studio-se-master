/**
 */
package org.talend.recyclebin.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.recyclebin.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecyclebinFactoryImpl extends EFactoryImpl implements RecyclebinFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RecyclebinFactory init() {
        try {
            RecyclebinFactory theRecyclebinFactory = (RecyclebinFactory)EPackage.Registry.INSTANCE.getEFactory(RecyclebinPackage.eNS_URI);
            if (theRecyclebinFactory != null) {
                return theRecyclebinFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RecyclebinFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecyclebinFactoryImpl() {
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
            case RecyclebinPackage.RECYCLE_BIN: return createRecycleBin();
            case RecyclebinPackage.TALEND_ITEM: return createTalendItem();
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
    public RecyclebinPackage getRecyclebinPackage() {
        return (RecyclebinPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RecyclebinPackage getPackage() {
        return RecyclebinPackage.eINSTANCE;
    }

} //RecyclebinFactoryImpl

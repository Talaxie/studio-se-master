/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.gefabstractmap.model.abstractmap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.talend.designer.gefabstractmap.model.abstractmap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractmapFactoryImpl extends EFactoryImpl implements AbstractmapFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AbstractmapFactory init() {
        try {
            AbstractmapFactory theAbstractmapFactory = (AbstractmapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.talend.org/TalendGEFAbstractMap"); 
            if (theAbstractmapFactory != null) {
                return theAbstractmapFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new AbstractmapFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractmapFactoryImpl() {
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
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractmapPackage getAbstractmapPackage() {
        return (AbstractmapPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static AbstractmapPackage getPackage() {
        return AbstractmapPackage.eINSTANCE;
    }

} //AbstractmapFactoryImpl

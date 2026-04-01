/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.codegen.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.designer.codegen.i18n.Messages;
import org.talend.designer.codegen.persistence.DocumentRoot;
import org.talend.designer.codegen.persistence.EmittersPoolFactory;
import org.talend.designer.codegen.persistence.EmittersPoolPackage;
import org.talend.designer.codegen.persistence.PoolType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmittersPoolFactoryImpl extends EFactoryImpl implements EmittersPoolFactory {

    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static EmittersPoolFactory init() {
        try {
            EmittersPoolFactory theEmittersPoolFactory = (EmittersPoolFactory) EPackage.Registry.INSTANCE
                    .getEFactory("platform:/resource/org.talend.designer.codegen/src/main/java/org/talend/designer/codegen/utils/emf/EmittersPool.xsd"); //$NON-NLS-1$
            if (theEmittersPoolFactory != null) {
                return theEmittersPoolFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EmittersPoolFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EmittersPoolFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case EmittersPoolPackage.DOCUMENT_ROOT:
            return createDocumentRoot();
        case EmittersPoolPackage.POOL_TYPE:
            return createPoolType();
        default:
            throw new IllegalArgumentException(Messages.getString(
                    "EmittersPoolFactoryImpl.Class.IllegalArg", eClass.getName())); //$NON-NLS-1$
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public PoolType createPoolType() {
        PoolTypeImpl poolType = new PoolTypeImpl();
        return poolType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EmittersPoolPackage getEmittersPoolPackage() {
        return (EmittersPoolPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    public static EmittersPoolPackage getPackage() {
        return EmittersPoolPackage.eINSTANCE;
    }

} // EmittersPoolFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.gefabstractmap.model.abstractmap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapPackage
 * @generated
 */
public interface AbstractmapFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AbstractmapFactory eINSTANCE = org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapFactoryImpl.init();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AbstractmapPackage getAbstractmapPackage();

} //AbstractmapFactory

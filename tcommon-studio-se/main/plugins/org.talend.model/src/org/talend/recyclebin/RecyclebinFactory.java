/**
 */
package org.talend.recyclebin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.recyclebin.RecyclebinPackage
 * @generated
 */
public interface RecyclebinFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RecyclebinFactory eINSTANCE = org.talend.recyclebin.impl.RecyclebinFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Recycle Bin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Recycle Bin</em>'.
     * @generated
     */
    RecycleBin createRecycleBin();

    /**
     * Returns a new object of class '<em>Talaxie Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Talaxie Item</em>'.
     * @generated
     */
    TalendItem createTalendItem();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RecyclebinPackage getRecyclebinPackage();

} //RecyclebinFactory

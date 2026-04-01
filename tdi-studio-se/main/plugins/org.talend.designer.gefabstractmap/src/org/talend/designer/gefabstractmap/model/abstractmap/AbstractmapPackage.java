/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.gefabstractmap.model.abstractmap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.gefabstractmap.model.abstractmap.AbstractmapFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractmapPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "abstractmap";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.talend.org/TalendGEFAbstractMap";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TalendGEFAbstractMap";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AbstractmapPackage eINSTANCE = org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTable <em>Mapper Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTable
     * @see org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapPackageImpl#getMapperTable()
     * @generated
     */
    int MAPPER_TABLE = 0;

    /**
     * The number of structural features of the '<em>Mapper Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER_TABLE_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity <em>Mapper Table Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity
     * @see org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapPackageImpl#getMapperTableEntity()
     * @generated
     */
    int MAPPER_TABLE_ENTITY = 1;

    /**
     * The number of structural features of the '<em>Mapper Table Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER_TABLE_ENTITY_FEATURE_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTable <em>Mapper Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapper Table</em>'.
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTable
     * @generated
     */
    EClass getMapperTable();

    /**
     * Returns the meta object for class '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity <em>Mapper Table Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapper Table Entity</em>'.
     * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity
     * @generated
     */
    EClass getMapperTableEntity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AbstractmapFactory getAbstractmapFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTable <em>Mapper Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTable
         * @see org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapPackageImpl#getMapperTable()
         * @generated
         */
        EClass MAPPER_TABLE = eINSTANCE.getMapperTable();

        /**
         * The meta object literal for the '{@link org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity <em>Mapper Table Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.gefabstractmap.model.abstractmap.MapperTableEntity
         * @see org.talend.designer.gefabstractmap.model.abstractmap.impl.AbstractmapPackageImpl#getMapperTableEntity()
         * @generated
         */
        EClass MAPPER_TABLE_ENTITY = eINSTANCE.getMapperTableEntity();

    }

} //AbstractmapPackage

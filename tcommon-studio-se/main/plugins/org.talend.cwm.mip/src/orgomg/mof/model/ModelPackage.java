/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.mof.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see orgomg.mof.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/mof/model.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.mof.model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = orgomg.mof.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.mof.model.impl.ModelElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.mof.model.impl.ModelElementImpl
     * @see orgomg.mof.model.impl.ModelPackageImpl#getModelElement()
     * @generated
     */
    int MODEL_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Modeled Graph Subset</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__MODELED_GRAPH_SUBSET = 0;

    /**
     * The feature id for the '<em><b>Modeled Projection</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__MODELED_PROJECTION = 1;

    /**
     * The feature id for the '<em><b>Modeled Semantic Context</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT = 2;

    /**
     * The number of structural features of the '<em>Element</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MODEL_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link orgomg.mof.model.impl.AssociationImpl
     * <em>Association</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.mof.model.impl.AssociationImpl
     * @see orgomg.mof.model.impl.ModelPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 1;

    /**
     * The feature id for the '<em><b>Modeled Projection</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__MODELED_PROJECTION = 0;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link orgomg.mof.model.ModelElement <em>Element</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see orgomg.mof.model.ModelElement
     * @generated
     */
    EClass getModelElement();

    /**
     * Returns the meta object for the reference list '{@link orgomg.mof.model.ModelElement#getModeledGraphSubset <em>Modeled Graph Subset</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference list '<em>Modeled Graph Subset</em>'.
     * @see orgomg.mof.model.ModelElement#getModeledGraphSubset()
     * @see #getModelElement()
     * @generated
     */
    EReference getModelElement_ModeledGraphSubset();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.mof.model.ModelElement#getModeledProjection
     * <em>Modeled Projection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Modeled Projection</em>'.
     * @see orgomg.mof.model.ModelElement#getModeledProjection()
     * @see #getModelElement()
     * @generated
     */
    EReference getModelElement_ModeledProjection();

    /**
     * Returns the meta object for the reference list '{@link orgomg.mof.model.ModelElement#getModeledSemanticContext <em>Modeled Semantic Context</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference list '<em>Modeled Semantic Context</em>'.
     * @see orgomg.mof.model.ModelElement#getModeledSemanticContext()
     * @see #getModelElement()
     * @generated
     */
    EReference getModelElement_ModeledSemanticContext();

    /**
     * Returns the meta object for class '{@link orgomg.mof.model.Association <em>Association</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see orgomg.mof.model.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.mof.model.Association#getModeledProjection
     * <em>Modeled Projection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Modeled Projection</em>'.
     * @see orgomg.mof.model.Association#getModeledProjection()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_ModeledProjection();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ModelFactory getModelFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
     * represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link orgomg.mof.model.impl.ModelElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.mof.model.impl.ModelElementImpl
         * @see orgomg.mof.model.impl.ModelPackageImpl#getModelElement()
         * @generated
         */
        EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

        /**
         * The meta object literal for the '<em><b>Modeled Graph Subset</b></em>
         * ' reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @generated
         */
        EReference MODEL_ELEMENT__MODELED_GRAPH_SUBSET = eINSTANCE.getModelElement_ModeledGraphSubset();

        /**
         * The meta object literal for the '<em><b>Modeled Projection</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_ELEMENT__MODELED_PROJECTION = eINSTANCE.getModelElement_ModeledProjection();

        /**
         * The meta object literal for the '<em><b>Modeled Semantic Context</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT = eINSTANCE.getModelElement_ModeledSemanticContext();

        /**
         * The meta object literal for the '{@link orgomg.mof.model.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.mof.model.impl.AssociationImpl
         * @see orgomg.mof.model.impl.ModelPackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '<em><b>Modeled Projection</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference ASSOCIATION__MODELED_PROJECTION = eINSTANCE.getAssociation_ModeledProjection();

    }

} // ModelPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.objectmodel.core.CorePackage;

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
 * @see org.talend.dataquality.domain.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "pattern";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.domain.pattern";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.domain.pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = org.talend.dataquality.domain.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.PatternImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__COMPONENTS = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.PatternComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.PatternComponentImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPatternComponent()
     * @generated
     */
    int PATTERN_COMPONENT = 1;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_COMPONENT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getRegularExpression()
     * @generated
     */
    int REGULAR_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGULAR_EXPRESSION__EXPRESSION = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGULAR_EXPRESSION__EXPRESSION_TYPE = PATTERN_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Regular Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGULAR_EXPRESSION_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getAttributeReference()
     * @generated
     */
    int ATTRIBUTE_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Referenced Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attribute Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_REFERENCE_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getComponentReference()
     * @generated
     */
    int COMPONENT_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Referenced Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_REFERENCE__REFERENCED_COMPONENT = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Component Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_REFERENCE_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 1;


    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.ExpressionType <em>Expression Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.ExpressionType
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getExpressionType()
     * @generated
     */
    int EXPRESSION_TYPE = 5;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern</em>'.
     * @see org.talend.dataquality.domain.pattern.Pattern
     * @generated
     */
    EClass getPattern();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.domain.pattern.Pattern#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see org.talend.dataquality.domain.pattern.Pattern#getComponents()
     * @see #getPattern()
     * @generated
     */
    EReference getPattern_Components();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.PatternComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see org.talend.dataquality.domain.pattern.PatternComponent
     * @generated
     */
    EClass getPatternComponent();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.RegularExpression <em>Regular Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Regular Expression</em>'.
     * @see org.talend.dataquality.domain.pattern.RegularExpression
     * @generated
     */
    EClass getRegularExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.talend.dataquality.domain.pattern.RegularExpression#getExpression()
     * @see #getRegularExpression()
     * @generated
     */
    EReference getRegularExpression_Expression();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression Type</em>'.
     * @see org.talend.dataquality.domain.pattern.RegularExpression#getExpressionType()
     * @see #getRegularExpression()
     * @generated
     */
    EAttribute getRegularExpression_ExpressionType();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.AttributeReference <em>Attribute Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Reference</em>'.
     * @see org.talend.dataquality.domain.pattern.AttributeReference
     * @generated
     */
    EClass getAttributeReference();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute <em>Referenced Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Attribute</em>'.
     * @see org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute()
     * @see #getAttributeReference()
     * @generated
     */
    EReference getAttributeReference_ReferencedAttribute();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.ComponentReference <em>Component Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Reference</em>'.
     * @see org.talend.dataquality.domain.pattern.ComponentReference
     * @generated
     */
    EClass getComponentReference();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent <em>Referenced Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Component</em>'.
     * @see org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent()
     * @see #getComponentReference()
     * @generated
     */
    EReference getComponentReference_ReferencedComponent();

    /**
     * Returns the meta object for enum '{@link org.talend.dataquality.domain.pattern.ExpressionType <em>Expression Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Expression Type</em>'.
     * @see org.talend.dataquality.domain.pattern.ExpressionType
     * @generated
     */
    EEnum getExpressionType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PatternFactory getPatternFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.PatternImpl <em>Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.PatternImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPattern()
         * @generated
         */
        EClass PATTERN = eINSTANCE.getPattern();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATTERN__COMPONENTS = eINSTANCE.getPattern_Components();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.PatternComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.PatternComponentImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPatternComponent()
         * @generated
         */
        EClass PATTERN_COMPONENT = eINSTANCE.getPatternComponent();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getRegularExpression()
         * @generated
         */
        EClass REGULAR_EXPRESSION = eINSTANCE.getRegularExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGULAR_EXPRESSION__EXPRESSION = eINSTANCE.getRegularExpression_Expression();

        /**
         * The meta object literal for the '<em><b>Expression Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REGULAR_EXPRESSION__EXPRESSION_TYPE = eINSTANCE.getRegularExpression_ExpressionType();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getAttributeReference()
         * @generated
         */
        EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

        /**
         * The meta object literal for the '<em><b>Referenced Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = eINSTANCE.getAttributeReference_ReferencedAttribute();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getComponentReference()
         * @generated
         */
        EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

        /**
         * The meta object literal for the '<em><b>Referenced Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_REFERENCE__REFERENCED_COMPONENT = eINSTANCE.getComponentReference_ReferencedComponent();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.ExpressionType <em>Expression Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.ExpressionType
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getExpressionType()
         * @generated
         */
        EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

    }

} //PatternPackage

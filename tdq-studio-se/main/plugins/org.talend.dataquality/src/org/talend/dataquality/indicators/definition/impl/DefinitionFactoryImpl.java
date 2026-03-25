/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.indicators.definition.*;
import org.talend.dataquality.indicators.definition.CharactersMapping;
import org.talend.dataquality.indicators.definition.DefinitionFactory;
import org.talend.dataquality.indicators.definition.DefinitionPackage;
import org.talend.dataquality.indicators.definition.IndicatorCategory;
import org.talend.dataquality.indicators.definition.IndicatorDefinition;
import org.talend.dataquality.indicators.definition.IndicatorDefinitionParameter;
import org.talend.dataquality.indicators.definition.IndicatorsDefinitions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionFactoryImpl extends EFactoryImpl implements DefinitionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DefinitionFactory init() {
        try {
            DefinitionFactory theDefinitionFactory = (DefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(DefinitionPackage.eNS_URI);
            if (theDefinitionFactory != null) {
                return theDefinitionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DefinitionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionFactoryImpl() {
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
            case DefinitionPackage.INDICATORS_DEFINITIONS: return createIndicatorsDefinitions();
            case DefinitionPackage.INDICATOR_DEFINITION: return createIndicatorDefinition();
            case DefinitionPackage.INDICATOR_CATEGORY: return createIndicatorCategory();
            case DefinitionPackage.CHARACTERS_MAPPING: return createCharactersMapping();
            case DefinitionPackage.INDICATOR_DEFINITION_PARAMETER: return createIndicatorDefinitionParameter();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorsDefinitions createIndicatorsDefinitions() {
        IndicatorsDefinitionsImpl indicatorsDefinitions = new IndicatorsDefinitionsImpl();
        return indicatorsDefinitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorDefinition createIndicatorDefinition() {
        IndicatorDefinitionImpl indicatorDefinition = new IndicatorDefinitionImpl();
        return indicatorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorCategory createIndicatorCategory() {
        IndicatorCategoryImpl indicatorCategory = new IndicatorCategoryImpl();
        return indicatorCategory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CharactersMapping createCharactersMapping() {
        CharactersMappingImpl charactersMapping = new CharactersMappingImpl();
        return charactersMapping;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public IndicatorDefinitionParameter createIndicatorDefinitionParameter() {
        IndicatorDefinitionParameterImpl indicatorDefinitionParameter = new IndicatorDefinitionParameterImpl();
        return indicatorDefinitionParameter;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefinitionPackage getDefinitionPackage() {
        return (DefinitionPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DefinitionPackage getPackage() {
        return DefinitionPackage.eINSTANCE;
    }

} //DefinitionFactoryImpl

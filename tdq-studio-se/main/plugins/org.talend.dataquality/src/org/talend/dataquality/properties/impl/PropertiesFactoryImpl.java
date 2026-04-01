/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.properties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.properties.PropertiesFactory;
import org.talend.dataquality.properties.PropertiesPackage;
import org.talend.dataquality.properties.TDQAnalysisItem;
import org.talend.dataquality.properties.TDQBusinessRuleItem;
import org.talend.dataquality.properties.TDQFileItem;
import org.talend.dataquality.properties.TDQIndicatorDefinitionItem;
import org.talend.dataquality.properties.TDQJrxmlItem;
import org.talend.dataquality.properties.TDQMatchRuleItem;
import org.talend.dataquality.properties.TDQPatternItem;
import org.talend.dataquality.properties.TDQReportItem;
import org.talend.dataquality.properties.TDQSourceFileItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertiesFactoryImpl extends EFactoryImpl implements PropertiesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PropertiesFactory init() {
        try {
            PropertiesFactory thePropertiesFactory = (PropertiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://dataquality.properties"); 
            if (thePropertiesFactory != null) {
                return thePropertiesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PropertiesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesFactoryImpl() {
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
            case PropertiesPackage.TDQ_ANALYSIS_ITEM: return createTDQAnalysisItem();
            case PropertiesPackage.TDQ_REPORT_ITEM: return createTDQReportItem();
            case PropertiesPackage.TDQ_INDICATOR_DEFINITION_ITEM: return createTDQIndicatorDefinitionItem();
            case PropertiesPackage.TDQ_BUSINESS_RULE_ITEM: return createTDQBusinessRuleItem();
            case PropertiesPackage.TDQ_PATTERN_ITEM: return createTDQPatternItem();
            case PropertiesPackage.TDQ_FILE_ITEM: return createTDQFileItem();
            case PropertiesPackage.TDQ_JRXML_ITEM: return createTDQJrxmlItem();
            case PropertiesPackage.TDQ_SOURCE_FILE_ITEM: return createTDQSourceFileItem();
            case PropertiesPackage.TDQ_MATCH_RULE_ITEM: return createTDQMatchRuleItem();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQAnalysisItem createTDQAnalysisItem() {
        TDQAnalysisItemImpl tdqAnalysisItem = new TDQAnalysisItemImpl();
        return tdqAnalysisItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQReportItem createTDQReportItem() {
        TDQReportItemImpl tdqReportItem = new TDQReportItemImpl();
        return tdqReportItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQIndicatorDefinitionItem createTDQIndicatorDefinitionItem() {
        TDQIndicatorDefinitionItemImpl tdqIndicatorDefinitionItem = new TDQIndicatorDefinitionItemImpl();
        return tdqIndicatorDefinitionItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQBusinessRuleItem createTDQBusinessRuleItem() {
        TDQBusinessRuleItemImpl tdqBusinessRuleItem = new TDQBusinessRuleItemImpl();
        return tdqBusinessRuleItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQPatternItem createTDQPatternItem() {
        TDQPatternItemImpl tdqPatternItem = new TDQPatternItemImpl();
        return tdqPatternItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQFileItem createTDQFileItem() {
        TDQFileItemImpl tdqFileItem = new TDQFileItemImpl();
        return tdqFileItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQJrxmlItem createTDQJrxmlItem() {
        TDQJrxmlItemImpl tdqJrxmlItem = new TDQJrxmlItemImpl();
        return tdqJrxmlItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQSourceFileItem createTDQSourceFileItem() {
        TDQSourceFileItemImpl tdqSourceFileItem = new TDQSourceFileItemImpl();
        return tdqSourceFileItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TDQMatchRuleItem createTDQMatchRuleItem() {
        TDQMatchRuleItemImpl tdqMatchRuleItem = new TDQMatchRuleItemImpl();
        return tdqMatchRuleItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesPackage getPropertiesPackage() {
        return (PropertiesPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PropertiesPackage getPackage() {
        return PropertiesPackage.eINSTANCE;
    }

} //PropertiesFactoryImpl

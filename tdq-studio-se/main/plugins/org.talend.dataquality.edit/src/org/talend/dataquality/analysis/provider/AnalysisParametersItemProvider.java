/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.cwm.relational.RelationalFactory;
import org.talend.cwm.softwaredeployment.SoftwaredeploymentFactory;
import org.talend.cwm.xml.XmlFactory;
import org.talend.dataquality.analysis.AnalysisFactory;
import org.talend.dataquality.analysis.AnalysisPackage;
import org.talend.dataquality.analysis.AnalysisParameters;
import org.talend.dataquality.domain.DomainFactory;
import org.talend.dataquality.domain.pattern.PatternFactory;
import org.talend.dataquality.expressions.ExpressionsFactory;
import org.talend.dataquality.indicators.IndicatorsFactory;
import org.talend.dataquality.indicators.columnset.ColumnsetFactory;
import org.talend.dataquality.indicators.definition.DefinitionFactory;
import org.talend.dataquality.indicators.schema.SchemaFactory;
import org.talend.dataquality.indicators.sql.IndicatorSqlFactory;
import org.talend.dataquality.reports.ReportsFactory;
import org.talend.dataquality.rules.RulesFactory;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwmx.analysis.informationreporting.provider.ReportGroupItemProvider;

/**
 * This is the item provider adapter for a {@link org.talend.dataquality.analysis.AnalysisParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisParametersItemProvider
    extends ReportGroupItemProvider
    implements	
        IEditingDomainItemProvider,	
        IStructuredItemContentProvider,	
        ITreeItemContentProvider,	
        IItemLabelProvider,	
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalysisParametersItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addDataFilterPropertyDescriptor(object);
            addIndicatorValidationDomainsPropertyDescriptor(object);
            addDataValidationDomainsPropertyDescriptor(object);
            addAnalysisTypePropertyDescriptor(object);
            addDeactivatedIndicatorsPropertyDescriptor(object);
            addExecutionLanguagePropertyDescriptor(object);
            addStoreDataPropertyDescriptor(object);
            addMaxNumberRowsPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Data Filter feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataFilterPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_dataFilter_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_dataFilter_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__DATA_FILTER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Indicator Validation Domains feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIndicatorValidationDomainsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_indicatorValidationDomains_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_indicatorValidationDomains_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__INDICATOR_VALIDATION_DOMAINS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Data Validation Domains feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataValidationDomainsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_dataValidationDomains_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_dataValidationDomains_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__DATA_VALIDATION_DOMAINS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Analysis Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAnalysisTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_analysisType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_analysisType_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__ANALYSIS_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Deactivated Indicators feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeactivatedIndicatorsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_deactivatedIndicators_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_deactivatedIndicators_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__DEACTIVATED_INDICATORS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Execution Language feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExecutionLanguagePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_executionLanguage_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_executionLanguage_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Store Data feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStoreDataPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_storeData_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_storeData_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__STORE_DATA,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Max Number Rows feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxNumberRowsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_AnalysisParameters_maxNumberRows_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_AnalysisParameters_maxNumberRows_feature", "_UI_AnalysisParameters_type"),
                 AnalysisPackage.Literals.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This returns AnalysisParameters.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalysisParameters"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((AnalysisParameters)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_AnalysisParameters_type") :
            getString("_UI_AnalysisParameters_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(AnalysisParameters.class)) {
            case AnalysisPackage.ANALYSIS_PARAMETERS__ANALYSIS_TYPE:
            case AnalysisPackage.ANALYSIS_PARAMETERS__EXECUTION_LANGUAGE:
            case AnalysisPackage.ANALYSIS_PARAMETERS__STORE_DATA:
            case AnalysisPackage.ANALYSIS_PARAMETERS__MAX_NUMBER_ROWS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 AnalysisFactory.eINSTANCE.createAnalysis()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 AnalysisFactory.eINSTANCE.createAnalysisContext()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 AnalysisFactory.eINSTANCE.createAnalysisParameters()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 AnalysisFactory.eINSTANCE.createAnalysisResult()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ReportsFactory.eINSTANCE.createTdReport()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ReportsFactory.eINSTANCE.createPresentationParameter()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createRowCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createSumIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMeanIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createCompositeIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createRangeIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createBoxIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createBlankCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMedianIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createValueIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMinValueIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMaxValueIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createModeIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createNullCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDistinctCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createUniqueCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDuplicateCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createIQRIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createTextIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMinLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMinLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMaxLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMaxLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createAverageLengthIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createAvgLengthWithBlankNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createLowerQuartileIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createUpperQuartileIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createCountsIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createSqlPatternMatchingIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createRegexpMatchingIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createPatternFreqIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createPatternLowFreqIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDefValueCountIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createSoundexFreqIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createSoundexLowFreqIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDatePatternFreqIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDateFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createWeekFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMonthFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createQuarterFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createYearFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createBinFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createDateLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createWeekLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createMonthLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createQuarterLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createYearLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorsFactory.eINSTANCE.createBinLowFrequencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createSchemaIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createAbstractTableIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createTableIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createCatalogIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createConnectionIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SchemaFactory.eINSTANCE.createViewIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DefinitionFactory.eINSTANCE.createIndicatorsDefinitions()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DefinitionFactory.eINSTANCE.createIndicatorDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DefinitionFactory.eINSTANCE.createIndicatorCategory()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DefinitionFactory.eINSTANCE.createCharactersMapping()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorSqlFactory.eINSTANCE.createUserDefIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorSqlFactory.eINSTANCE.createWhereRuleIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 IndicatorSqlFactory.eINSTANCE.createJavaUserDefIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createValueMatchingIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createRowMatchingIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createColumnSetMultiValueIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createAllMatchIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createCountAvgNullIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createMinMaxDateIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createWeakCorrelationIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createColumnDependencyIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ColumnsetFactory.eINSTANCE.createSimpleStatIndicator()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DomainFactory.eINSTANCE.createDomain()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 DomainFactory.eINSTANCE.createRangeRestriction()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 PatternFactory.eINSTANCE.createPattern()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RulesFactory.eINSTANCE.createDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RulesFactory.eINSTANCE.createSpecifiedDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RulesFactory.eINSTANCE.createInferredDQRule()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RulesFactory.eINSTANCE.createWhereRule()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createMetadata()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createMetadataColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createMetadataTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createDelimitedFileConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createPositionalFileConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createEbcdicConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createMDMConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createDatabaseConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPFunctionUnit()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPIDocUnit()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPFunctionParameterColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPFunctionParameterTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createInputSAPFunctionParameterTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createOutputSAPFunctionParameterTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createRegexpFileConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createXmlFileConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createQuery()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createLdifFileConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createFileExcelConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createGenericSchemaConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createLDAPSchemaConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createWSDLSchemaConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSalesforceSchemaConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createCDCType()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSubscriberTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createSAPTestInputParameterTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createConcept()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createHL7Connection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createHeaderFooterConnection()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 ConnectionFactory.eINSTANCE.createGenericPackage()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdTable()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdView()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdSqlDataType()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdTrigger()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 RelationalFactory.eINSTANCE.createTdProcedure()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SoftwaredeploymentFactory.eINSTANCE.createTdDataManager()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SoftwaredeploymentFactory.eINSTANCE.createTdSoftwareSystem()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
                 SoftwaredeploymentFactory.eINSTANCE.createTdMachine()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
 XmlFactory.eINSTANCE
                .createTdXmlElementType()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
 XmlFactory.eINSTANCE
                .createTdXmlContent()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.NAMESPACE__OWNED_ELEMENT,
 XmlFactory.eINSTANCE
                .createTdXmlSchema()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ReportsFactory.eINSTANCE.createPresentationParameter()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 ConnectionFactory.eINSTANCE.createMetadataColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RelationalFactory.eINSTANCE.createTdColumn()));

        newChildDescriptors.add
            (createChildParameter
                (CorePackage.Literals.CLASSIFIER__FEATURE,
                 RelationalFactory.eINSTANCE.createTdProcedure()));

        newChildDescriptors.add
            (createChildParameter
                (InformationvisualizationPackage.Literals.RENDERED_OBJECT__FORMULA,
                 ExpressionsFactory.eINSTANCE.createBooleanExpressionNode()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify =
            childFeature == CorePackage.Literals.NAMESPACE__OWNED_ELEMENT ||
            childFeature == CorePackage.Literals.CLASSIFIER__FEATURE;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return DataqualityEditPlugin.INSTANCE;
    }

}

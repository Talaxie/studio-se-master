/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.indicators.columnset.*;
import org.talend.dataquality.indicators.columnset.AllMatchIndicator;
import org.talend.dataquality.indicators.columnset.BlockKeyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnDependencyIndicator;
import org.talend.dataquality.indicators.columnset.ColumnSetMultiValueIndicator;
import org.talend.dataquality.indicators.columnset.ColumnsetFactory;
import org.talend.dataquality.indicators.columnset.ColumnsetPackage;
import org.talend.dataquality.indicators.columnset.CountAvgNullIndicator;
import org.talend.dataquality.indicators.columnset.MinMaxDateIndicator;
import org.talend.dataquality.indicators.columnset.RecordMatchingIndicator;
import org.talend.dataquality.indicators.columnset.RowMatchingIndicator;
import org.talend.dataquality.indicators.columnset.SimpleStatIndicator;
import org.talend.dataquality.indicators.columnset.ValueMatchingIndicator;
import org.talend.dataquality.indicators.columnset.WeakCorrelationIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnsetFactoryImpl extends EFactoryImpl implements ColumnsetFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ColumnsetFactory init() {
        try {
            ColumnsetFactory theColumnsetFactory = (ColumnsetFactory)EPackage.Registry.INSTANCE.getEFactory(ColumnsetPackage.eNS_URI);
            if (theColumnsetFactory != null) {
                return theColumnsetFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ColumnsetFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnsetFactoryImpl() {
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
            case ColumnsetPackage.VALUE_MATCHING_INDICATOR: return createValueMatchingIndicator();
            case ColumnsetPackage.ROW_MATCHING_INDICATOR: return createRowMatchingIndicator();
            case ColumnsetPackage.COLUMN_SET_MULTI_VALUE_INDICATOR: return createColumnSetMultiValueIndicator();
            case ColumnsetPackage.ALL_MATCH_INDICATOR: return createAllMatchIndicator();
            case ColumnsetPackage.COUNT_AVG_NULL_INDICATOR: return createCountAvgNullIndicator();
            case ColumnsetPackage.MIN_MAX_DATE_INDICATOR: return createMinMaxDateIndicator();
            case ColumnsetPackage.WEAK_CORRELATION_INDICATOR: return createWeakCorrelationIndicator();
            case ColumnsetPackage.COLUMN_DEPENDENCY_INDICATOR: return createColumnDependencyIndicator();
            case ColumnsetPackage.SIMPLE_STAT_INDICATOR: return createSimpleStatIndicator();
            case ColumnsetPackage.BLOCK_KEY_INDICATOR: return createBlockKeyIndicator();
            case ColumnsetPackage.RECORD_MATCHING_INDICATOR: return createRecordMatchingIndicator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ColumnsetPackage.LIST_OBJECT:
                return createListObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ColumnsetPackage.LIST_OBJECT:
                return convertListObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueMatchingIndicator createValueMatchingIndicator() {
        ValueMatchingIndicatorImpl valueMatchingIndicator = new ValueMatchingIndicatorImpl();
        return valueMatchingIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RowMatchingIndicator createRowMatchingIndicator() {
        RowMatchingIndicatorImpl rowMatchingIndicator = new RowMatchingIndicatorImpl();
        return rowMatchingIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnSetMultiValueIndicator createColumnSetMultiValueIndicator() {
        ColumnSetMultiValueIndicatorImpl columnSetMultiValueIndicator = new ColumnSetMultiValueIndicatorImpl();
        return columnSetMultiValueIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AllMatchIndicator createAllMatchIndicator() {
        AllMatchIndicatorImpl allMatchIndicator = new AllMatchIndicatorImpl();
        return allMatchIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CountAvgNullIndicator createCountAvgNullIndicator() {
        CountAvgNullIndicatorImpl countAvgNullIndicator = new CountAvgNullIndicatorImpl();
        return countAvgNullIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinMaxDateIndicator createMinMaxDateIndicator() {
        MinMaxDateIndicatorImpl minMaxDateIndicator = new MinMaxDateIndicatorImpl();
        return minMaxDateIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WeakCorrelationIndicator createWeakCorrelationIndicator() {
        WeakCorrelationIndicatorImpl weakCorrelationIndicator = new WeakCorrelationIndicatorImpl();
        return weakCorrelationIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnDependencyIndicator createColumnDependencyIndicator() {
        ColumnDependencyIndicatorImpl columnDependencyIndicator = new ColumnDependencyIndicatorImpl();
        return columnDependencyIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleStatIndicator createSimpleStatIndicator() {
        SimpleStatIndicatorImpl simpleStatIndicator = new SimpleStatIndicatorImpl();
        return simpleStatIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockKeyIndicator createBlockKeyIndicator() {
        BlockKeyIndicatorImpl blockKeyIndicator = new BlockKeyIndicatorImpl();
        return blockKeyIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordMatchingIndicator createRecordMatchingIndicator() {
        RecordMatchingIndicatorImpl recordMatchingIndicator = new RecordMatchingIndicatorImpl();
        return recordMatchingIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public List<Object> createListObjectFromString(EDataType eDataType, String initialValue) {
        return (List<Object>)super.createFromString(initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertListObjectToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColumnsetPackage getColumnsetPackage() {
        return (ColumnsetPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ColumnsetPackage getPackage() {
        return ColumnsetPackage.eINSTANCE;
    }

} //ColumnsetFactoryImpl

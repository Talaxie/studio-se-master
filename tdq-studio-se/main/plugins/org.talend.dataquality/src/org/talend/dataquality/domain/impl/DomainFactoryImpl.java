/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.domain.*;
import org.talend.dataquality.domain.DateValue;
import org.talend.dataquality.domain.Domain;
import org.talend.dataquality.domain.DomainFactory;
import org.talend.dataquality.domain.DomainPackage;
import org.talend.dataquality.domain.EnumerationRule;
import org.talend.dataquality.domain.IntegerValue;
import org.talend.dataquality.domain.JavaUDIIndicatorParameter;
import org.talend.dataquality.domain.LengthRestriction;
import org.talend.dataquality.domain.LiteralValue;
import org.talend.dataquality.domain.NumericValue;
import org.talend.dataquality.domain.RangeRestriction;
import org.talend.dataquality.domain.RealNumberValue;
import org.talend.dataquality.domain.TextValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DomainFactory init() {
        try {
            DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
            if (theDomainFactory != null) {
                return theDomainFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DomainFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DomainFactoryImpl() {
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
            case DomainPackage.DOMAIN: return createDomain();
            case DomainPackage.ENUMERATION_RULE: return createEnumerationRule();
            case DomainPackage.RANGE_RESTRICTION: return createRangeRestriction();
            case DomainPackage.LITERAL_VALUE: return createLiteralValue();
            case DomainPackage.LENGTH_RESTRICTION: return createLengthRestriction();
            case DomainPackage.NUMERIC_VALUE: return createNumericValue();
            case DomainPackage.TEXT_VALUE: return createTextValue();
            case DomainPackage.INTEGER_VALUE: return createIntegerValue();
            case DomainPackage.REAL_NUMBER_VALUE: return createRealNumberValue();
            case DomainPackage.DATE_VALUE: return createDateValue();
            case DomainPackage.JAVA_UDI_INDICATOR_PARAMETER: return createJavaUDIIndicatorParameter();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Domain createDomain() {
        DomainImpl domain = new DomainImpl();
        return domain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationRule createEnumerationRule() {
        EnumerationRuleImpl enumerationRule = new EnumerationRuleImpl();
        return enumerationRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeRestriction createRangeRestriction() {
        RangeRestrictionImpl rangeRestriction = new RangeRestrictionImpl();
        return rangeRestriction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralValue createLiteralValue() {
        LiteralValueImpl literalValue = new LiteralValueImpl();
        return literalValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LengthRestriction createLengthRestriction() {
        LengthRestrictionImpl lengthRestriction = new LengthRestrictionImpl();
        return lengthRestriction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericValue createNumericValue() {
        NumericValueImpl numericValue = new NumericValueImpl();
        return numericValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextValue createTextValue() {
        TextValueImpl textValue = new TextValueImpl();
        return textValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerValue createIntegerValue() {
        IntegerValueImpl integerValue = new IntegerValueImpl();
        return integerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RealNumberValue createRealNumberValue() {
        RealNumberValueImpl realNumberValue = new RealNumberValueImpl();
        return realNumberValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateValue createDateValue() {
        DateValueImpl dateValue = new DateValueImpl();
        return dateValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JavaUDIIndicatorParameter createJavaUDIIndicatorParameter() {
        JavaUDIIndicatorParameterImpl javaUDIIndicatorParameter = new JavaUDIIndicatorParameterImpl();
        return javaUDIIndicatorParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DomainPackage getDomainPackage() {
        return (DomainPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DomainPackage getPackage() {
        return DomainPackage.eINSTANCE;
    }

} //DomainFactoryImpl

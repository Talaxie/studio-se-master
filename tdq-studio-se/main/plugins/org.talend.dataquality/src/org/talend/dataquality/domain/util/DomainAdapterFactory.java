/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.domain.*;
import org.talend.dataquality.domain.DateValue;
import org.talend.dataquality.domain.Domain;
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
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DomainPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DomainAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DomainPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DomainSwitch<Adapter> modelSwitch =
        new DomainSwitch<Adapter>() {
            @Override
            public Adapter caseDomain(Domain object) {
                return createDomainAdapter();
            }
            @Override
            public Adapter caseEnumerationRule(EnumerationRule object) {
                return createEnumerationRuleAdapter();
            }
            @Override
            public Adapter caseRangeRestriction(RangeRestriction object) {
                return createRangeRestrictionAdapter();
            }
            @Override
            public Adapter caseLiteralValue(LiteralValue object) {
                return createLiteralValueAdapter();
            }
            @Override
            public Adapter caseLengthRestriction(LengthRestriction object) {
                return createLengthRestrictionAdapter();
            }
            @Override
            public Adapter caseNumericValue(NumericValue object) {
                return createNumericValueAdapter();
            }
            @Override
            public Adapter caseTextValue(TextValue object) {
                return createTextValueAdapter();
            }
            @Override
            public Adapter caseIntegerValue(IntegerValue object) {
                return createIntegerValueAdapter();
            }
            @Override
            public Adapter caseRealNumberValue(RealNumberValue object) {
                return createRealNumberValueAdapter();
            }
            @Override
            public Adapter caseDateValue(DateValue object) {
                return createDateValueAdapter();
            }
            @Override
            public Adapter caseJavaUDIIndicatorParameter(JavaUDIIndicatorParameter object) {
                return createJavaUDIIndicatorParameterAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseModelElement(ModelElement object) {
                return createModelElementAdapter();
            }
            @Override
            public Adapter caseNamespace(Namespace object) {
                return createNamespaceAdapter();
            }
            @Override
            public Adapter caseModel_ModelElement(orgomg.mof.model.ModelElement object) {
                return createModel_ModelElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.Domain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.Domain
     * @generated
     */
    public Adapter createDomainAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.EnumerationRule <em>Enumeration Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.EnumerationRule
     * @generated
     */
    public Adapter createEnumerationRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.RangeRestriction <em>Range Restriction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.RangeRestriction
     * @generated
     */
    public Adapter createRangeRestrictionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.LiteralValue <em>Literal Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.LiteralValue
     * @generated
     */
    public Adapter createLiteralValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.LengthRestriction <em>Length Restriction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.LengthRestriction
     * @generated
     */
    public Adapter createLengthRestrictionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.NumericValue <em>Numeric Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.NumericValue
     * @generated
     */
    public Adapter createNumericValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.TextValue <em>Text Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.TextValue
     * @generated
     */
    public Adapter createTextValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.IntegerValue <em>Integer Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.IntegerValue
     * @generated
     */
    public Adapter createIntegerValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.RealNumberValue <em>Real Number Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.RealNumberValue
     * @generated
     */
    public Adapter createRealNumberValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.DateValue <em>Date Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.DateValue
     * @generated
     */
    public Adapter createDateValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.talend.dataquality.domain.JavaUDIIndicatorParameter <em>Java UDI Indicator Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.talend.dataquality.domain.JavaUDIIndicatorParameter
     * @generated
     */
    public Adapter createJavaUDIIndicatorParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.Namespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Namespace
     * @generated
     */
    public Adapter createNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.mof.model.ModelElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.mof.model.ModelElement
     * @generated
     */
    public Adapter createModel_ModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DomainAdapterFactory

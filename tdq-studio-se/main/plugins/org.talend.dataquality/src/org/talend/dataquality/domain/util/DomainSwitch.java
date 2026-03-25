/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DomainPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DomainSwitch() {
        if (modelPackage == null) {
            modelPackage = DomainPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case DomainPackage.DOMAIN: {
                Domain domain = (Domain)theEObject;
                T result = caseDomain(domain);
                if (result == null) result = caseNamespace(domain);
                if (result == null) result = caseModelElement(domain);
                if (result == null) result = caseElement(domain);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.ENUMERATION_RULE: {
                EnumerationRule enumerationRule = (EnumerationRule)theEObject;
                T result = caseEnumerationRule(enumerationRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.RANGE_RESTRICTION: {
                RangeRestriction rangeRestriction = (RangeRestriction)theEObject;
                T result = caseRangeRestriction(rangeRestriction);
                if (result == null) result = caseModelElement(rangeRestriction);
                if (result == null) result = caseElement(rangeRestriction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.LITERAL_VALUE: {
                LiteralValue literalValue = (LiteralValue)theEObject;
                T result = caseLiteralValue(literalValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.LENGTH_RESTRICTION: {
                LengthRestriction lengthRestriction = (LengthRestriction)theEObject;
                T result = caseLengthRestriction(lengthRestriction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.NUMERIC_VALUE: {
                NumericValue numericValue = (NumericValue)theEObject;
                T result = caseNumericValue(numericValue);
                if (result == null) result = caseLiteralValue(numericValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.TEXT_VALUE: {
                TextValue textValue = (TextValue)theEObject;
                T result = caseTextValue(textValue);
                if (result == null) result = caseLiteralValue(textValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.INTEGER_VALUE: {
                IntegerValue integerValue = (IntegerValue)theEObject;
                T result = caseIntegerValue(integerValue);
                if (result == null) result = caseNumericValue(integerValue);
                if (result == null) result = caseLiteralValue(integerValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.REAL_NUMBER_VALUE: {
                RealNumberValue realNumberValue = (RealNumberValue)theEObject;
                T result = caseRealNumberValue(realNumberValue);
                if (result == null) result = caseNumericValue(realNumberValue);
                if (result == null) result = caseLiteralValue(realNumberValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.DATE_VALUE: {
                DateValue dateValue = (DateValue)theEObject;
                T result = caseDateValue(dateValue);
                if (result == null) result = caseNumericValue(dateValue);
                if (result == null) result = caseLiteralValue(dateValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case DomainPackage.JAVA_UDI_INDICATOR_PARAMETER: {
                JavaUDIIndicatorParameter javaUDIIndicatorParameter = (JavaUDIIndicatorParameter)theEObject;
                T result = caseJavaUDIIndicatorParameter(javaUDIIndicatorParameter);
                if (result == null) result = caseModel_ModelElement(javaUDIIndicatorParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDomain(Domain object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationRule(EnumerationRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Range Restriction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Range Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRangeRestriction(RangeRestriction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLiteralValue(LiteralValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Length Restriction</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Length Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLengthRestriction(LengthRestriction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericValue(NumericValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextValue(TextValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerValue(IntegerValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Real Number Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Real Number Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRealNumberValue(RealNumberValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateValue(DateValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Java UDI Indicator Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Java UDI Indicator Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJavaUDIIndicatorParameter(JavaUDIIndicatorParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespace(Namespace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel_ModelElement(orgomg.mof.model.ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //DomainSwitch

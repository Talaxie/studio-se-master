/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwmmip.*;
import orgomg.cwmmip.BindingParameter;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.Element;
import orgomg.cwmmip.GraphSubset;
import orgomg.cwmmip.InterchangePattern;
import orgomg.cwmmip.ModeledGraphSubset;
import orgomg.cwmmip.ModeledSemanticContext;
import orgomg.cwmmip.PatternConstraint;
import orgomg.cwmmip.Projection;
import orgomg.cwmmip.Restriction;
import orgomg.cwmmip.SemanticContext;
import orgomg.cwmmip.UnitOfInterchange;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmmip.CwmmipPackage
 * @generated
 */
public class CwmmipSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static CwmmipPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public CwmmipSwitch() {
        if (modelPackage == null) {
            modelPackage = CwmmipPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        } else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case CwmmipPackage.UNIT_OF_INTERCHANGE: {
            UnitOfInterchange unitOfInterchange = (UnitOfInterchange) theEObject;
            T result = caseUnitOfInterchange(unitOfInterchange);
            if (result == null)
                result = caseNamespace(unitOfInterchange);
            if (result == null)
                result = caseModelElement(unitOfInterchange);
            if (result == null)
                result = caseCore_Element(unitOfInterchange);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.INTERCHANGE_PATTERN: {
            InterchangePattern interchangePattern = (InterchangePattern) theEObject;
            T result = caseInterchangePattern(interchangePattern);
            if (result == null)
                result = caseCore_Element(interchangePattern);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT: {
            ModeledSemanticContext modeledSemanticContext = (ModeledSemanticContext) theEObject;
            T result = caseModeledSemanticContext(modeledSemanticContext);
            if (result == null)
                result = caseSemanticContext(modeledSemanticContext);
            if (result == null)
                result = caseProjection(modeledSemanticContext);
            if (result == null)
                result = caseCore_Element(modeledSemanticContext);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.PROJECTION: {
            Projection projection = (Projection) theEObject;
            T result = caseProjection(projection);
            if (result == null)
                result = caseCore_Element(projection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.SEMANTIC_CONTEXT: {
            SemanticContext semanticContext = (SemanticContext) theEObject;
            T result = caseSemanticContext(semanticContext);
            if (result == null)
                result = caseProjection(semanticContext);
            if (result == null)
                result = caseCore_Element(semanticContext);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.ELEMENT: {
            Element element = (Element) theEObject;
            T result = caseElement(element);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.GRAPH_SUBSET: {
            GraphSubset graphSubset = (GraphSubset) theEObject;
            T result = caseGraphSubset(graphSubset);
            if (result == null)
                result = caseProjection(graphSubset);
            if (result == null)
                result = caseCore_Element(graphSubset);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.PATTERN_CONSTRAINT: {
            PatternConstraint patternConstraint = (PatternConstraint) theEObject;
            T result = casePatternConstraint(patternConstraint);
            if (result == null)
                result = caseCore_Element(patternConstraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.MODELED_GRAPH_SUBSET: {
            ModeledGraphSubset modeledGraphSubset = (ModeledGraphSubset) theEObject;
            T result = caseModeledGraphSubset(modeledGraphSubset);
            if (result == null)
                result = caseGraphSubset(modeledGraphSubset);
            if (result == null)
                result = caseProjection(modeledGraphSubset);
            if (result == null)
                result = caseCore_Element(modeledGraphSubset);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.RESTRICTION: {
            Restriction restriction = (Restriction) theEObject;
            T result = caseRestriction(restriction);
            if (result == null)
                result = casePatternConstraint(restriction);
            if (result == null)
                result = caseCore_Element(restriction);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CwmmipPackage.BINDING_PARAMETER: {
            BindingParameter bindingParameter = (BindingParameter) theEObject;
            T result = caseBindingParameter(bindingParameter);
            if (result == null)
                result = casePatternConstraint(bindingParameter);
            if (result == null)
                result = caseCore_Element(bindingParameter);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Unit Of Interchange</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Unit Of Interchange</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnitOfInterchange(UnitOfInterchange object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Interchange Pattern</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interchange Pattern</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInterchangePattern(InterchangePattern object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modeled Semantic Context</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modeled Semantic Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModeledSemanticContext(ModeledSemanticContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Projection</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Projection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProjection(Projection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Semantic Context</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Semantic Context</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSemanticContext(SemanticContext object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Graph Subset</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Graph Subset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGraphSubset(GraphSubset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pattern Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePatternConstraint(PatternConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Modeled Graph Subset</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Modeled Graph Subset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModeledGraphSubset(ModeledGraphSubset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRestriction(Restriction object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binding Parameter</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binding Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBindingParameter(BindingParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCore_Element(orgomg.cwm.objectmodel.core.Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
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
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamespace(Namespace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch, but this is
     * the last case anyway. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} // CwmmipSwitch

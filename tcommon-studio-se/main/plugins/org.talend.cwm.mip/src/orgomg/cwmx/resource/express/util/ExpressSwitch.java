/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.foundation.softwaredeployment.Component;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.multidimensional.DimensionedObject;
import orgomg.cwm.resource.multidimensional.Schema;
import orgomg.cwmx.resource.express.*;
import orgomg.cwmx.resource.express.AggMap;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.AliasDimension;
import orgomg.cwmx.resource.express.Composite;
import orgomg.cwmx.resource.express.Conjoint;
import orgomg.cwmx.resource.express.Database;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Formula;
import orgomg.cwmx.resource.express.Model;
import orgomg.cwmx.resource.express.PreComputeClause;
import orgomg.cwmx.resource.express.Program;
import orgomg.cwmx.resource.express.Relation;
import orgomg.cwmx.resource.express.SimpleDimension;
import orgomg.cwmx.resource.express.ValueSet;
import orgomg.cwmx.resource.express.Variable;
import orgomg.cwmx.resource.express.Worksheet;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.express.ExpressPackage
 * @generated
 */
public class ExpressSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static ExpressPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ExpressSwitch() {
        if (modelPackage == null) {
            modelPackage = ExpressPackage.eINSTANCE;
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
        case ExpressPackage.DIMENSION: {
            Dimension dimension = (Dimension) theEObject;
            T result = caseDimension(dimension);
            if (result == null)
                result = caseMultidimensional_Dimension(dimension);
            if (result == null)
                result = caseClass(dimension);
            if (result == null)
                result = caseClassifier(dimension);
            if (result == null)
                result = caseNamespace(dimension);
            if (result == null)
                result = caseModelElement(dimension);
            if (result == null)
                result = caseElement(dimension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.DATABASE: {
            Database database = (Database) theEObject;
            T result = caseDatabase(database);
            if (result == null)
                result = caseSchema(database);
            if (result == null)
                result = casePackage(database);
            if (result == null)
                result = caseNamespace(database);
            if (result == null)
                result = caseModelElement(database);
            if (result == null)
                result = caseElement(database);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.CONJOINT: {
            Conjoint conjoint = (Conjoint) theEObject;
            T result = caseConjoint(conjoint);
            if (result == null)
                result = caseDimension(conjoint);
            if (result == null)
                result = caseMultidimensional_Dimension(conjoint);
            if (result == null)
                result = caseClass(conjoint);
            if (result == null)
                result = caseClassifier(conjoint);
            if (result == null)
                result = caseNamespace(conjoint);
            if (result == null)
                result = caseModelElement(conjoint);
            if (result == null)
                result = caseElement(conjoint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.PROGRAM: {
            Program program = (Program) theEObject;
            T result = caseProgram(program);
            if (result == null)
                result = caseComponent(program);
            if (result == null)
                result = caseClassifier(program);
            if (result == null)
                result = caseNamespace(program);
            if (result == null)
                result = caseModelElement(program);
            if (result == null)
                result = caseElement(program);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.MODEL: {
            Model model = (Model) theEObject;
            T result = caseModel(model);
            if (result == null)
                result = caseComponent(model);
            if (result == null)
                result = caseClassifier(model);
            if (result == null)
                result = caseNamespace(model);
            if (result == null)
                result = caseModelElement(model);
            if (result == null)
                result = caseElement(model);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.VARIABLE: {
            Variable variable = (Variable) theEObject;
            T result = caseVariable(variable);
            if (result == null)
                result = caseDimensionedObject(variable);
            if (result == null)
                result = caseAttribute(variable);
            if (result == null)
                result = caseStructuralFeature(variable);
            if (result == null)
                result = caseFeature(variable);
            if (result == null)
                result = caseModelElement(variable);
            if (result == null)
                result = caseElement(variable);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.FORMULA: {
            Formula formula = (Formula) theEObject;
            T result = caseFormula(formula);
            if (result == null)
                result = caseDimensionedObject(formula);
            if (result == null)
                result = caseAttribute(formula);
            if (result == null)
                result = caseStructuralFeature(formula);
            if (result == null)
                result = caseFeature(formula);
            if (result == null)
                result = caseModelElement(formula);
            if (result == null)
                result = caseElement(formula);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.VALUE_SET: {
            ValueSet valueSet = (ValueSet) theEObject;
            T result = caseValueSet(valueSet);
            if (result == null)
                result = caseDimensionedObject(valueSet);
            if (result == null)
                result = caseAttribute(valueSet);
            if (result == null)
                result = caseStructuralFeature(valueSet);
            if (result == null)
                result = caseFeature(valueSet);
            if (result == null)
                result = caseModelElement(valueSet);
            if (result == null)
                result = caseElement(valueSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.RELATION: {
            Relation relation = (Relation) theEObject;
            T result = caseRelation(relation);
            if (result == null)
                result = caseDimensionedObject(relation);
            if (result == null)
                result = caseAttribute(relation);
            if (result == null)
                result = caseStructuralFeature(relation);
            if (result == null)
                result = caseFeature(relation);
            if (result == null)
                result = caseModelElement(relation);
            if (result == null)
                result = caseElement(relation);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.WORKSHEET: {
            Worksheet worksheet = (Worksheet) theEObject;
            T result = caseWorksheet(worksheet);
            if (result == null)
                result = caseClass(worksheet);
            if (result == null)
                result = caseClassifier(worksheet);
            if (result == null)
                result = caseNamespace(worksheet);
            if (result == null)
                result = caseModelElement(worksheet);
            if (result == null)
                result = caseElement(worksheet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.COMPOSITE: {
            Composite composite = (Composite) theEObject;
            T result = caseComposite(composite);
            if (result == null)
                result = caseDimension(composite);
            if (result == null)
                result = caseMultidimensional_Dimension(composite);
            if (result == null)
                result = caseClass(composite);
            if (result == null)
                result = caseClassifier(composite);
            if (result == null)
                result = caseNamespace(composite);
            if (result == null)
                result = caseModelElement(composite);
            if (result == null)
                result = caseElement(composite);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.SIMPLE_DIMENSION: {
            SimpleDimension simpleDimension = (SimpleDimension) theEObject;
            T result = caseSimpleDimension(simpleDimension);
            if (result == null)
                result = caseDimension(simpleDimension);
            if (result == null)
                result = caseMultidimensional_Dimension(simpleDimension);
            if (result == null)
                result = caseClass(simpleDimension);
            if (result == null)
                result = caseClassifier(simpleDimension);
            if (result == null)
                result = caseNamespace(simpleDimension);
            if (result == null)
                result = caseModelElement(simpleDimension);
            if (result == null)
                result = caseElement(simpleDimension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.ALIAS_DIMENSION: {
            AliasDimension aliasDimension = (AliasDimension) theEObject;
            T result = caseAliasDimension(aliasDimension);
            if (result == null)
                result = caseDimension(aliasDimension);
            if (result == null)
                result = caseMultidimensional_Dimension(aliasDimension);
            if (result == null)
                result = caseClass(aliasDimension);
            if (result == null)
                result = caseClassifier(aliasDimension);
            if (result == null)
                result = caseNamespace(aliasDimension);
            if (result == null)
                result = caseModelElement(aliasDimension);
            if (result == null)
                result = caseElement(aliasDimension);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.AGG_MAP: {
            AggMap aggMap = (AggMap) theEObject;
            T result = caseAggMap(aggMap);
            if (result == null)
                result = caseClass(aggMap);
            if (result == null)
                result = caseClassifier(aggMap);
            if (result == null)
                result = caseNamespace(aggMap);
            if (result == null)
                result = caseModelElement(aggMap);
            if (result == null)
                result = caseElement(aggMap);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.AGG_MAP_COMPONENT: {
            AggMapComponent aggMapComponent = (AggMapComponent) theEObject;
            T result = caseAggMapComponent(aggMapComponent);
            if (result == null)
                result = caseModelElement(aggMapComponent);
            if (result == null)
                result = caseElement(aggMapComponent);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ExpressPackage.PRE_COMPUTE_CLAUSE: {
            PreComputeClause preComputeClause = (PreComputeClause) theEObject;
            T result = casePreComputeClause(preComputeClause);
            if (result == null)
                result = caseModelElement(preComputeClause);
            if (result == null)
                result = caseElement(preComputeClause);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimension(Dimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Database</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatabase(Database object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conjoint</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conjoint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConjoint(Conjoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Program</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProgram(Program object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModel(Model object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(Variable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFormula(Formula object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Set</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueSet(ValueSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelation(Relation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Worksheet</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Worksheet</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorksheet(Worksheet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComposite(Composite object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Dimension</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleDimension(SimpleDimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alias Dimension</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alias Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAliasDimension(AliasDimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agg Map</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agg Map</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggMap(AggMap object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Agg Map Component</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Agg Map Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggMapComponent(AggMapComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Pre Compute Clause</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Pre Compute Clause</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePreComputeClause(PreComputeClause object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifier(Classifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClass(orgomg.cwm.objectmodel.core.Class object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultidimensional_Dimension(orgomg.cwm.resource.multidimensional.Dimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Package</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePackage(orgomg.cwm.objectmodel.core.Package object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchema(Schema object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComponent(Component object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeature(Feature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructuralFeature(StructuralFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dimensioned Object</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dimensioned Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDimensionedObject(DimensionedObject object) {
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

} // ExpressSwitch

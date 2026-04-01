/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see orgomg.cwmx.resource.express.ExpressPackage
 * @generated
 */
public class ExpressAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static ExpressPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ExpressAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpressPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ExpressSwitch<Adapter> modelSwitch = new ExpressSwitch<Adapter>() {

        @Override
        public Adapter caseDimension(Dimension object) {
            return createDimensionAdapter();
        }

        @Override
        public Adapter caseDatabase(Database object) {
            return createDatabaseAdapter();
        }

        @Override
        public Adapter caseConjoint(Conjoint object) {
            return createConjointAdapter();
        }

        @Override
        public Adapter caseProgram(Program object) {
            return createProgramAdapter();
        }

        @Override
        public Adapter caseModel(Model object) {
            return createModelAdapter();
        }

        @Override
        public Adapter caseVariable(Variable object) {
            return createVariableAdapter();
        }

        @Override
        public Adapter caseFormula(Formula object) {
            return createFormulaAdapter();
        }

        @Override
        public Adapter caseValueSet(ValueSet object) {
            return createValueSetAdapter();
        }

        @Override
        public Adapter caseRelation(Relation object) {
            return createRelationAdapter();
        }

        @Override
        public Adapter caseWorksheet(Worksheet object) {
            return createWorksheetAdapter();
        }

        @Override
        public Adapter caseComposite(Composite object) {
            return createCompositeAdapter();
        }

        @Override
        public Adapter caseSimpleDimension(SimpleDimension object) {
            return createSimpleDimensionAdapter();
        }

        @Override
        public Adapter caseAliasDimension(AliasDimension object) {
            return createAliasDimensionAdapter();
        }

        @Override
        public Adapter caseAggMap(AggMap object) {
            return createAggMapAdapter();
        }

        @Override
        public Adapter caseAggMapComponent(AggMapComponent object) {
            return createAggMapComponentAdapter();
        }

        @Override
        public Adapter casePreComputeClause(PreComputeClause object) {
            return createPreComputeClauseAdapter();
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
        public Adapter caseClassifier(Classifier object) {
            return createClassifierAdapter();
        }

        @Override
        public Adapter caseClass(orgomg.cwm.objectmodel.core.Class object) {
            return createClassAdapter();
        }

        @Override
        public Adapter caseMultidimensional_Dimension(orgomg.cwm.resource.multidimensional.Dimension object) {
            return createMultidimensional_DimensionAdapter();
        }

        @Override
        public Adapter casePackage(orgomg.cwm.objectmodel.core.Package object) {
            return createPackageAdapter();
        }

        @Override
        public Adapter caseSchema(Schema object) {
            return createSchemaAdapter();
        }

        @Override
        public Adapter caseComponent(Component object) {
            return createComponentAdapter();
        }

        @Override
        public Adapter caseFeature(Feature object) {
            return createFeatureAdapter();
        }

        @Override
        public Adapter caseStructuralFeature(StructuralFeature object) {
            return createStructuralFeatureAdapter();
        }

        @Override
        public Adapter caseAttribute(Attribute object) {
            return createAttributeAdapter();
        }

        @Override
        public Adapter caseDimensionedObject(DimensionedObject object) {
            return createDimensionedObjectAdapter();
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
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Dimension <em>Dimension</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Dimension
     * @generated
     */
    public Adapter createDimensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Database <em>Database</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Database
     * @generated
     */
    public Adapter createDatabaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Conjoint <em>Conjoint</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Conjoint
     * @generated
     */
    public Adapter createConjointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Program <em>Program</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Program
     * @generated
     */
    public Adapter createProgramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Model <em>Model</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Variable <em>Variable</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Formula <em>Formula</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Formula
     * @generated
     */
    public Adapter createFormulaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.ValueSet <em>Value Set</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.ValueSet
     * @generated
     */
    public Adapter createValueSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Relation <em>Relation</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Relation
     * @generated
     */
    public Adapter createRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Worksheet <em>Worksheet</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Worksheet
     * @generated
     */
    public Adapter createWorksheetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.Composite <em>Composite</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.Composite
     * @generated
     */
    public Adapter createCompositeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.express.SimpleDimension <em>Simple Dimension</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.SimpleDimension
     * @generated
     */
    public Adapter createSimpleDimensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.express.AliasDimension <em>Alias Dimension</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.AliasDimension
     * @generated
     */
    public Adapter createAliasDimensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.express.AggMap <em>Agg Map</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.AggMap
     * @generated
     */
    public Adapter createAggMapAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.express.AggMapComponent <em>Agg Map Component</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.AggMapComponent
     * @generated
     */
    public Adapter createAggMapComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.express.PreComputeClause <em>Pre Compute Clause</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.express.PreComputeClause
     * @generated
     */
    public Adapter createPreComputeClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Element <em>Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.ModelElement <em>Model Element</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.ModelElement
     * @generated
     */
    public Adapter createModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Namespace <em>Namespace</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Namespace
     * @generated
     */
    public Adapter createNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Classifier <em>Classifier</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Class <em>Class</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.resource.multidimensional.Dimension <em>Dimension</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.resource.multidimensional.Dimension
     * @generated
     */
    public Adapter createMultidimensional_DimensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Package <em>Package</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.resource.multidimensional.Schema <em>Schema</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.resource.multidimensional.Schema
     * @generated
     */
    public Adapter createSchemaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.foundation.softwaredeployment.Component
     * <em>Component</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.foundation.softwaredeployment.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Feature <em>Feature</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.objectmodel.core.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.StructuralFeature
     * @generated
     */
    public Adapter createStructuralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.objectmodel.core.Attribute <em>Attribute</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.objectmodel.core.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.resource.multidimensional.DimensionedObject <em>Dimensioned Object</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.resource.multidimensional.DimensionedObject
     * @generated
     */
    public Adapter createDimensionedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This
     * default implementation returns null. <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // ExpressAdapterFactory

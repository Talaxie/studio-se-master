/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.analysis.olap.CubeRegion;
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.foundation.softwaredeployment.DeployedComponent;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.multidimensional.DimensionedObject;
import orgomg.cwm.resource.multidimensional.Schema;
import orgomg.cwmx.resource.essbase.*;
import orgomg.cwmx.resource.essbase.Alias;
import orgomg.cwmx.resource.essbase.Application;
import orgomg.cwmx.resource.essbase.Comment;
import orgomg.cwmx.resource.essbase.Consolidation;
import orgomg.cwmx.resource.essbase.CurrencyConversion;
import orgomg.cwmx.resource.essbase.DataStorage;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Formula;
import orgomg.cwmx.resource.essbase.Generation;
import orgomg.cwmx.resource.essbase.ImmediateParent;
import orgomg.cwmx.resource.essbase.Level;
import orgomg.cwmx.resource.essbase.LinkedPartition;
import orgomg.cwmx.resource.essbase.MemberName;
import orgomg.cwmx.resource.essbase.OLAPServer;
import orgomg.cwmx.resource.essbase.Outline;
import orgomg.cwmx.resource.essbase.Partition;
import orgomg.cwmx.resource.essbase.ReplicatedPartition;
import orgomg.cwmx.resource.essbase.TimeBalance;
import orgomg.cwmx.resource.essbase.TransparentPartition;
import orgomg.cwmx.resource.essbase.TwoPassCalculation;
import orgomg.cwmx.resource.essbase.UDA;
import orgomg.cwmx.resource.essbase.VarianceReporting;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see orgomg.cwmx.resource.essbase.EssbasePackage
 * @generated
 */
public class EssbaseAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static EssbasePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public EssbaseAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EssbasePackage.eINSTANCE;
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
    protected EssbaseSwitch<Adapter> modelSwitch = new EssbaseSwitch<Adapter>() {

        @Override
        public Adapter caseAlias(Alias object) {
            return createAliasAdapter();
        }

        @Override
        public Adapter caseApplication(Application object) {
            return createApplicationAdapter();
        }

        @Override
        public Adapter caseComment(Comment object) {
            return createCommentAdapter();
        }

        @Override
        public Adapter caseConsolidation(Consolidation object) {
            return createConsolidationAdapter();
        }

        @Override
        public Adapter caseCurrencyConversion(CurrencyConversion object) {
            return createCurrencyConversionAdapter();
        }

        @Override
        public Adapter caseDataStorage(DataStorage object) {
            return createDataStorageAdapter();
        }

        @Override
        public Adapter caseDatabase(Database object) {
            return createDatabaseAdapter();
        }

        @Override
        public Adapter caseDimension(Dimension object) {
            return createDimensionAdapter();
        }

        @Override
        public Adapter caseFormula(Formula object) {
            return createFormulaAdapter();
        }

        @Override
        public Adapter caseGeneration(Generation object) {
            return createGenerationAdapter();
        }

        @Override
        public Adapter caseImmediateParent(ImmediateParent object) {
            return createImmediateParentAdapter();
        }

        @Override
        public Adapter caseLevel(Level object) {
            return createLevelAdapter();
        }

        @Override
        public Adapter caseMemberName(MemberName object) {
            return createMemberNameAdapter();
        }

        @Override
        public Adapter caseOLAPServer(OLAPServer object) {
            return createOLAPServerAdapter();
        }

        @Override
        public Adapter caseOutline(Outline object) {
            return createOutlineAdapter();
        }

        @Override
        public Adapter casePartition(Partition object) {
            return createPartitionAdapter();
        }

        @Override
        public Adapter caseReplicatedPartition(ReplicatedPartition object) {
            return createReplicatedPartitionAdapter();
        }

        @Override
        public Adapter caseTimeBalance(TimeBalance object) {
            return createTimeBalanceAdapter();
        }

        @Override
        public Adapter caseTransparentPartition(TransparentPartition object) {
            return createTransparentPartitionAdapter();
        }

        @Override
        public Adapter caseTwoPassCalculation(TwoPassCalculation object) {
            return createTwoPassCalculationAdapter();
        }

        @Override
        public Adapter caseUDA(UDA object) {
            return createUDAAdapter();
        }

        @Override
        public Adapter caseVarianceReporting(VarianceReporting object) {
            return createVarianceReportingAdapter();
        }

        @Override
        public Adapter caseLinkedPartition(LinkedPartition object) {
            return createLinkedPartitionAdapter();
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
        public Adapter caseNamespace(Namespace object) {
            return createNamespaceAdapter();
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
        public Adapter caseDeployedComponent(DeployedComponent object) {
            return createDeployedComponentAdapter();
        }

        @Override
        public Adapter caseDataManager(DataManager object) {
            return createDataManagerAdapter();
        }

        @Override
        public Adapter caseCubeRegion(CubeRegion object) {
            return createCubeRegionAdapter();
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
     * {@link orgomg.cwmx.resource.essbase.Alias <em>Alias</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Alias
     * @generated
     */
    public Adapter createAliasAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.Application <em>Application</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Application
     * @generated
     */
    public Adapter createApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Comment <em>Comment</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.Consolidation <em>Consolidation</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Consolidation
     * @generated
     */
    public Adapter createConsolidationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.CurrencyConversion <em>Currency Conversion</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.CurrencyConversion
     * @generated
     */
    public Adapter createCurrencyConversionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.DataStorage <em>Data Storage</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.DataStorage
     * @generated
     */
    public Adapter createDataStorageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Database <em>Database</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Database
     * @generated
     */
    public Adapter createDatabaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Dimension <em>Dimension</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Dimension
     * @generated
     */
    public Adapter createDimensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Formula <em>Formula</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Formula
     * @generated
     */
    public Adapter createFormulaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.Generation <em>Generation</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Generation
     * @generated
     */
    public Adapter createGenerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.ImmediateParent <em>Immediate Parent</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.ImmediateParent
     * @generated
     */
    public Adapter createImmediateParentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Level <em>Level</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Level
     * @generated
     */
    public Adapter createLevelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.MemberName <em>Member Name</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.MemberName
     * @generated
     */
    public Adapter createMemberNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.OLAPServer <em>OLAP Server</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.OLAPServer
     * @generated
     */
    public Adapter createOLAPServerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Outline <em>Outline</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Outline
     * @generated
     */
    public Adapter createOutlineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.Partition <em>Partition</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.Partition
     * @generated
     */
    public Adapter createPartitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.ReplicatedPartition <em>Replicated Partition</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.ReplicatedPartition
     * @generated
     */
    public Adapter createReplicatedPartitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.TimeBalance <em>Time Balance</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.TimeBalance
     * @generated
     */
    public Adapter createTimeBalanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.TransparentPartition <em>Transparent Partition</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.TransparentPartition
     * @generated
     */
    public Adapter createTransparentPartitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.TwoPassCalculation <em>Two Pass Calculation</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.TwoPassCalculation
     * @generated
     */
    public Adapter createTwoPassCalculationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwmx.resource.essbase.UDA <em>UDA</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.UDA
     * @generated
     */
    public Adapter createUDAAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.VarianceReporting <em>Variance Reporting</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.VarianceReporting
     * @generated
     */
    public Adapter createVarianceReportingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwmx.resource.essbase.LinkedPartition <em>Linked Partition</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwmx.resource.essbase.LinkedPartition
     * @generated
     */
    public Adapter createLinkedPartitionAdapter() {
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
     * Creates a new adapter for an object of class '{@link orgomg.cwm.foundation.softwaredeployment.DeployedComponent <em>Deployed Component</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.foundation.softwaredeployment.DeployedComponent
     * @generated
     */
    public Adapter createDeployedComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link orgomg.cwm.foundation.softwaredeployment.DataManager <em>Data Manager</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see orgomg.cwm.foundation.softwaredeployment.DataManager
     * @generated
     */
    public Adapter createDataManagerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link orgomg.cwm.analysis.olap.CubeRegion <em>Cube Region</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * 
     * @return the new adapter.
     * @see orgomg.cwm.analysis.olap.CubeRegion
     * @generated
     */
    public Adapter createCubeRegionAdapter() {
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

} // EssbaseAdapterFactory

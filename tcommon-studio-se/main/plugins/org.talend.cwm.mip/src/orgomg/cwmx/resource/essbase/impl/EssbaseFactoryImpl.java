/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.essbase.*;
import orgomg.cwmx.resource.essbase.Alias;
import orgomg.cwmx.resource.essbase.Application;
import orgomg.cwmx.resource.essbase.Comment;
import orgomg.cwmx.resource.essbase.Consolidation;
import orgomg.cwmx.resource.essbase.CurrencyConversion;
import orgomg.cwmx.resource.essbase.DataStorage;
import orgomg.cwmx.resource.essbase.Database;
import orgomg.cwmx.resource.essbase.Dimension;
import orgomg.cwmx.resource.essbase.DimensionType;
import orgomg.cwmx.resource.essbase.EssbaseFactory;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.essbase.Formula;
import orgomg.cwmx.resource.essbase.Generation;
import orgomg.cwmx.resource.essbase.ImmediateParent;
import orgomg.cwmx.resource.essbase.Level;
import orgomg.cwmx.resource.essbase.LinkedPartition;
import orgomg.cwmx.resource.essbase.MemberName;
import orgomg.cwmx.resource.essbase.OLAPServer;
import orgomg.cwmx.resource.essbase.Outline;
import orgomg.cwmx.resource.essbase.ReplicatedPartition;
import orgomg.cwmx.resource.essbase.TimeBalance;
import orgomg.cwmx.resource.essbase.TransparentPartition;
import orgomg.cwmx.resource.essbase.TwoPassCalculation;
import orgomg.cwmx.resource.essbase.UDA;
import orgomg.cwmx.resource.essbase.VarianceReporting;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EssbaseFactoryImpl extends EFactoryImpl implements EssbaseFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static EssbaseFactory init() {
        try {
            EssbaseFactory theEssbaseFactory = (EssbaseFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/essbase.ecore");
            if (theEssbaseFactory != null) {
                return theEssbaseFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EssbaseFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public EssbaseFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case EssbasePackage.ALIAS:
            return createAlias();
        case EssbasePackage.APPLICATION:
            return createApplication();
        case EssbasePackage.COMMENT:
            return createComment();
        case EssbasePackage.CONSOLIDATION:
            return createConsolidation();
        case EssbasePackage.CURRENCY_CONVERSION:
            return createCurrencyConversion();
        case EssbasePackage.DATA_STORAGE:
            return createDataStorage();
        case EssbasePackage.DATABASE:
            return createDatabase();
        case EssbasePackage.DIMENSION:
            return createDimension();
        case EssbasePackage.FORMULA:
            return createFormula();
        case EssbasePackage.GENERATION:
            return createGeneration();
        case EssbasePackage.IMMEDIATE_PARENT:
            return createImmediateParent();
        case EssbasePackage.LEVEL:
            return createLevel();
        case EssbasePackage.MEMBER_NAME:
            return createMemberName();
        case EssbasePackage.OLAP_SERVER:
            return createOLAPServer();
        case EssbasePackage.OUTLINE:
            return createOutline();
        case EssbasePackage.REPLICATED_PARTITION:
            return createReplicatedPartition();
        case EssbasePackage.TIME_BALANCE:
            return createTimeBalance();
        case EssbasePackage.TRANSPARENT_PARTITION:
            return createTransparentPartition();
        case EssbasePackage.TWO_PASS_CALCULATION:
            return createTwoPassCalculation();
        case EssbasePackage.UDA:
            return createUDA();
        case EssbasePackage.VARIANCE_REPORTING:
            return createVarianceReporting();
        case EssbasePackage.LINKED_PARTITION:
            return createLinkedPartition();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case EssbasePackage.DIMENSION_TYPE:
            return createDimensionTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case EssbasePackage.DIMENSION_TYPE:
            return convertDimensionTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Alias createAlias() {
        AliasImpl alias = new AliasImpl();
        return alias;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Application createApplication() {
        ApplicationImpl application = new ApplicationImpl();
        return application;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Comment createComment() {
        CommentImpl comment = new CommentImpl();
        return comment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Consolidation createConsolidation() {
        ConsolidationImpl consolidation = new ConsolidationImpl();
        return consolidation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CurrencyConversion createCurrencyConversion() {
        CurrencyConversionImpl currencyConversion = new CurrencyConversionImpl();
        return currencyConversion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataStorage createDataStorage() {
        DataStorageImpl dataStorage = new DataStorageImpl();
        return dataStorage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Database createDatabase() {
        DatabaseImpl database = new DatabaseImpl();
        return database;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Dimension createDimension() {
        DimensionImpl dimension = new DimensionImpl();
        return dimension;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Formula createFormula() {
        FormulaImpl formula = new FormulaImpl();
        return formula;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Generation createGeneration() {
        GenerationImpl generation = new GenerationImpl();
        return generation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ImmediateParent createImmediateParent() {
        ImmediateParentImpl immediateParent = new ImmediateParentImpl();
        return immediateParent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Level createLevel() {
        LevelImpl level = new LevelImpl();
        return level;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MemberName createMemberName() {
        MemberNameImpl memberName = new MemberNameImpl();
        return memberName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public OLAPServer createOLAPServer() {
        OLAPServerImpl olapServer = new OLAPServerImpl();
        return olapServer;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Outline createOutline() {
        OutlineImpl outline = new OutlineImpl();
        return outline;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ReplicatedPartition createReplicatedPartition() {
        ReplicatedPartitionImpl replicatedPartition = new ReplicatedPartitionImpl();
        return replicatedPartition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TimeBalance createTimeBalance() {
        TimeBalanceImpl timeBalance = new TimeBalanceImpl();
        return timeBalance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TransparentPartition createTransparentPartition() {
        TransparentPartitionImpl transparentPartition = new TransparentPartitionImpl();
        return transparentPartition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public TwoPassCalculation createTwoPassCalculation() {
        TwoPassCalculationImpl twoPassCalculation = new TwoPassCalculationImpl();
        return twoPassCalculation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public UDA createUDA() {
        UDAImpl uda = new UDAImpl();
        return uda;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VarianceReporting createVarianceReporting() {
        VarianceReportingImpl varianceReporting = new VarianceReportingImpl();
        return varianceReporting;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public LinkedPartition createLinkedPartition() {
        LinkedPartitionImpl linkedPartition = new LinkedPartitionImpl();
        return linkedPartition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DimensionType createDimensionTypeFromString(EDataType eDataType, String initialValue) {
        DimensionType result = DimensionType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String convertDimensionTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EssbasePackage getEssbasePackage() {
        return (EssbasePackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EssbasePackage getPackage() {
        return EssbasePackage.eINSTANCE;
    }

} // EssbaseFactoryImpl

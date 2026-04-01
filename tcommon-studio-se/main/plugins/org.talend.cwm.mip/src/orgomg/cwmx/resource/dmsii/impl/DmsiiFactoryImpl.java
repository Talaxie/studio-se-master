/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import orgomg.cwmx.resource.dmsii.*;
import orgomg.cwmx.resource.dmsii.Access;
import orgomg.cwmx.resource.dmsii.AutomaticSubset;
import orgomg.cwmx.resource.dmsii.DASDLComment;
import orgomg.cwmx.resource.dmsii.DASDLProperty;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DataSet;
import orgomg.cwmx.resource.dmsii.Database;
import orgomg.cwmx.resource.dmsii.DmsiiFactory;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.FieldBit;
import orgomg.cwmx.resource.dmsii.KeyItem;
import orgomg.cwmx.resource.dmsii.PhysicalAccessOverride;
import orgomg.cwmx.resource.dmsii.PhysicalDataSet;
import orgomg.cwmx.resource.dmsii.PhysicalDataSetOverride;
import orgomg.cwmx.resource.dmsii.PhysicalDatabase;
import orgomg.cwmx.resource.dmsii.PhysicalSet;
import orgomg.cwmx.resource.dmsii.PhysicalSetOverride;
import orgomg.cwmx.resource.dmsii.Remap;
import orgomg.cwmx.resource.dmsii.RemapItem;
import orgomg.cwmx.resource.dmsii.Remark;
import orgomg.cwmx.resource.dmsii.Set;
import orgomg.cwmx.resource.dmsii.SetStructure;
import orgomg.cwmx.resource.dmsii.Subset;
import orgomg.cwmx.resource.dmsii.VariableFormatPart;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class DmsiiFactoryImpl extends EFactoryImpl implements DmsiiFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public static DmsiiFactory init() {
        try {
            DmsiiFactory theDmsiiFactory = (DmsiiFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///orgomg/cwmx/resource/dmsii.ecore");
            if (theDmsiiFactory != null) {
                return theDmsiiFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DmsiiFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public DmsiiFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case DmsiiPackage.DATABASE:
            return createDatabase();
        case DmsiiPackage.REMAP:
            return createRemap();
        case DmsiiPackage.DATA_SET:
            return createDataSet();
        case DmsiiPackage.DATA_ITEM:
            return createDataItem();
        case DmsiiPackage.VARIABLE_FORMAT_PART:
            return createVariableFormatPart();
        case DmsiiPackage.SET_STRUCTURE:
            return createSetStructure();
        case DmsiiPackage.SET:
            return createSet();
        case DmsiiPackage.ACCESS:
            return createAccess();
        case DmsiiPackage.SUBSET:
            return createSubset();
        case DmsiiPackage.AUTOMATIC_SUBSET:
            return createAutomaticSubset();
        case DmsiiPackage.KEY_ITEM:
            return createKeyItem();
        case DmsiiPackage.REMAP_ITEM:
            return createRemapItem();
        case DmsiiPackage.FIELD_BIT:
            return createFieldBit();
        case DmsiiPackage.REMARK:
            return createRemark();
        case DmsiiPackage.PHYSICAL_DATABASE:
            return createPhysicalDatabase();
        case DmsiiPackage.PHYSICAL_DATA_SET:
            return createPhysicalDataSet();
        case DmsiiPackage.DASDL_COMMENT:
            return createDASDLComment();
        case DmsiiPackage.PHYSICAL_SET:
            return createPhysicalSet();
        case DmsiiPackage.PHYSICAL_DATA_SET_OVERRIDE:
            return createPhysicalDataSetOverride();
        case DmsiiPackage.PHYSICAL_SET_OVERRIDE:
            return createPhysicalSetOverride();
        case DmsiiPackage.PHYSICAL_ACCESS_OVERRIDE:
            return createPhysicalAccessOverride();
        case DmsiiPackage.DASDL_PROPERTY:
            return createDASDLProperty();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
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
    public Remap createRemap() {
        RemapImpl remap = new RemapImpl();
        return remap;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataSet createDataSet() {
        DataSetImpl dataSet = new DataSetImpl();
        return dataSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataItem createDataItem() {
        DataItemImpl dataItem = new DataItemImpl();
        return dataItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public VariableFormatPart createVariableFormatPart() {
        VariableFormatPartImpl variableFormatPart = new VariableFormatPartImpl();
        return variableFormatPart;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public SetStructure createSetStructure() {
        SetStructureImpl setStructure = new SetStructureImpl();
        return setStructure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Set createSet() {
        SetImpl set = new SetImpl();
        return set;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Access createAccess() {
        AccessImpl access = new AccessImpl();
        return access;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Subset createSubset() {
        SubsetImpl subset = new SubsetImpl();
        return subset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AutomaticSubset createAutomaticSubset() {
        AutomaticSubsetImpl automaticSubset = new AutomaticSubsetImpl();
        return automaticSubset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public KeyItem createKeyItem() {
        KeyItemImpl keyItem = new KeyItemImpl();
        return keyItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public RemapItem createRemapItem() {
        RemapItemImpl remapItem = new RemapItemImpl();
        return remapItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public FieldBit createFieldBit() {
        FieldBitImpl fieldBit = new FieldBitImpl();
        return fieldBit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Remark createRemark() {
        RemarkImpl remark = new RemarkImpl();
        return remark;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDatabase createPhysicalDatabase() {
        PhysicalDatabaseImpl physicalDatabase = new PhysicalDatabaseImpl();
        return physicalDatabase;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDataSet createPhysicalDataSet() {
        PhysicalDataSetImpl physicalDataSet = new PhysicalDataSetImpl();
        return physicalDataSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DASDLComment createDASDLComment() {
        DASDLCommentImpl dasdlComment = new DASDLCommentImpl();
        return dasdlComment;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalSet createPhysicalSet() {
        PhysicalSetImpl physicalSet = new PhysicalSetImpl();
        return physicalSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalDataSetOverride createPhysicalDataSetOverride() {
        PhysicalDataSetOverrideImpl physicalDataSetOverride = new PhysicalDataSetOverrideImpl();
        return physicalDataSetOverride;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalSetOverride createPhysicalSetOverride() {
        PhysicalSetOverrideImpl physicalSetOverride = new PhysicalSetOverrideImpl();
        return physicalSetOverride;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public PhysicalAccessOverride createPhysicalAccessOverride() {
        PhysicalAccessOverrideImpl physicalAccessOverride = new PhysicalAccessOverrideImpl();
        return physicalAccessOverride;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DASDLProperty createDASDLProperty() {
        DASDLPropertyImpl dasdlProperty = new DASDLPropertyImpl();
        return dasdlProperty;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DmsiiPackage getDmsiiPackage() {
        return (DmsiiPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DmsiiPackage getPackage() {
        return DmsiiPackage.eINSTANCE;
    }

} // DmsiiFactoryImpl

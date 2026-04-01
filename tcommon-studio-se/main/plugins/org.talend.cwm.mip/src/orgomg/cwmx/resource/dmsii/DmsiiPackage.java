/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import orgomg.cwm.foundation.businessinformation.BusinessinformationPackage;
import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.resource.record.RecordPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc --> The CWM DMSII extension
 * package contains classes supporting the description of DMS II database
 * schemata and their deployment. DMS II is a database system available on
 * Unisys ClearPath NX servers. DMS II is a non-CODASYL, network model database
 * management system. The DMS II extension package is provided as example
 * demonstrating appropriate usage of CWM classes in modeling this and similar
 * DBMS environments.
 * 
 * Because DMSII database schemas are normally stored in record-based source
 * files written in a data definition language called DASDL, the CWM DMSII
 * extension package contains constructs allowing the declaration-order sequence
 * of the DASDL source file to be preserved in the model. The goal of this is to
 * allow a DASDL source to be stored into the DMSII model and subsequently
 * regenerated from the model by a suitably designed utility program. To achieve
 * this ordering, the DMSII model represents ownership using the CWM
 * ClassifierFeature association which is ordered, rather than the alternate
 * technique using the ElementOwnership association which is unordered. A
 * side-effect of this choice is that any DMSII class that can be ordered must
 * be subclass of the CWM ObjectModel?s Feature class; this is the reason for
 * the multiple inheritance required to define the SetStructure, DataSet,
 * Database and Remap classes.
 * 
 * For convenience, utilities may chose to store the text of the DASDL file from
 * which the database was created in a CWM Description instance attached to
 * particular instances of DMSII model classes. The names of DMSII model
 * elements are stored in the name attribute that every DMSII instance inherits
 * from CWM?s ModelElement class.
 * 
 * The DMS II package depends on the following packages:
 * 
 * org.omg::CWM::ObjectModel::Core org.omg::CWM::Foundation::BusinessInformation
 * org.omg::CWM::Foundation::Expressions org.omg::CWM::Foundation::KeyIndexes
 * org.omg::CWM::Foundation::Record
 * 
 * OCL Representation of DMSII Constraints
 * 
 * [C-1] An Access must span a DataSet. context Access inv:
 * self.spannedClass->size = 1 and self.spannedClass.oclIsKindOf(DataSet)
 * 
 * [C-2] The types of ModelElements that may own DASDLProperties is limited by
 * the following OCL. context DASDLProperty inv: self.owner.oclIsKindOf(DataSet)
 * or self.owner.oclIsKindOf(SetStructure) or self.owner.oclIsKindOf(Database)
 * or self.owner.oclIsKindOf(PhysicalDatabase) or
 * self.owner.oclIsKindOf(PhysicalDataset) or
 * self.owner.oclIsKindOf(PhysicalSet) or
 * self.owner.oclIsKindOf(PhysicalDatasetOverride) or
 * self.owner.oclIsKindOf(PhysicalSetOverride) or
 * self.owner.oclIsKindOf(PhysicalAccessOverride)
 * 
 * [C-3] An independent database may not be owned. context Database inv: not
 * self.isLogical implies self.classifier->isEmpty
 * 
 * [C-4] A logical database must be owned by an independent database. context
 * Database inv: self.isLogical implies (self.classifier->size = 1 and
 * self.classifier.oclIsTypeOf(Database) and not self.classifier.isLogical)
 * 
 * [C-5] A database can own SetStructure, DataSet, Remark, and Database, Remap,
 * PhysicalDataSetOverride, PhysicalSetOverride, and PhysicalAccessOverride
 * instances. context Database inv: self.feature->forAll(x |
 * x.oclIsTypeOf(SetStructure) or x.oclIsTypeOf(DataSet) or
 * x.oclIsTypeOf(Remark) or x.oclIsTypeOf(Database) or
 * x.oclIsTypeOf(PhysicalDataSetOverride) or x.oclIsTypeOf(Remap) or
 * x.oclIsTypeOf(PhysicalSetOverride) or x.oclIsTypeOf(PhysicalAccessOverride))
 * 
 * [C-6] A DataItem that owns FieldBit instances must have a data type of FIELD.
 * context DataItem inv: self.fieldBit.notEmpty implies self.type.name = "FIELD"
 * 
 * [C-7] A reference to a StructuralFeature must refer to a DataSet or a
 * SetStructure instance. context DataItem inv: self.structure.notEmpty implies
 * self.structure.type.oclIsKindOf(DataSet) or
 * self.structure.type.oclIsKindOf(SetStructure)
 * 
 * [C-8] A DataItem may not be its own occursDataItem. context DataItem inv:
 * self.occursDataItem <> self
 * 
 * [C-9]A DataItem may not be its own occuringDataItem. context DataItem inv:
 * self.occuringDataItem <> self
 * 
 * [C-10] A DataSet may have one of the following organizations. context
 * DataItem inv: self.organization = "COMPACT" or self.organization = "DIRECT"
 * or self.organization = "ORDERED" or self.organization = "RANDOM" or
 * self.organization = "RESTART" or self.organization = "STANDARD" or
 * self.organization = "UNORDERED"
 * 
 * [C-11] The reorganize attribute, if present, must be one of the allowed
 * values from the DASDL manual. context DataSet inv: self.reorganize <> ""
 * implies self.reorganize = "ITEMS SAME" or self.reorganize = "ITEMS CHANGED"
 * 
 * [C-12] The partitioningSet, if present, must span the DataSet. context
 * DataSet inv: self.partitioningSet->size = 1 implies
 * self.partitioningSet.namespace = self
 * 
 * [C-13] If the DataSet has VariableFormatParts, it must also have an attribute
 * of the type "RECORD TYPE". context DataSet inv:
 * self.ownedElement->exists(oclIsKindOf(VariableFormatPart)) implies
 * self.feature.oclAsType(StructuralFeature)->exists(type.name = "RECORD TYPE")
 * 
 * [C-14] The collation clause, if present, must be one of the allowed values
 * from the DASDL manual. context KeyItem inv: self.collation = "BINARY" or
 * self.collation = "EQUIVALENT" or self.collation = "LOGICAL"
 * 
 * [C-15] PhysicalAccessOverride instances must be owned by an Access instance.
 * context PhysicalAccessOverride inv: self.namespace.oclIsKindOf(Access)
 * 
 * [C-16] A PhysicalDatabase instance must be owned by a Database instance.
 * context PhysicalDatabase inv: self.namespace->size = 1 and
 * self.namespace.oclIsKindOf(Database)
 * 
 * [C-17] A PhysicalDataSet instance must be owned by a DataSet instance.
 * context PhysicalDataSet inv: self.namespace->size = 1 and
 * self.namespace.oclIsKindOf(DataSet)
 * 
 * [C-18] A PhysicalDataSetOverride instance must be owned by a DataSet
 * instance. context PhysicalDataSetOverride inv:
 * self.namespace.oclIsKindOf(DataSet)
 * 
 * [C-19] A PhysicalSet instance must be owned by a Set instance. context
 * PhysicalSet inv: self.namespace->size = 1 and self.namespace.oclIsKindOf(Set)
 * 
 * [C-20] PhysicalSetOverride instances must be owned by a Set instance. context
 * PhysicalSetOverride inv: self.namespace.oclIsKindOf(Set)
 * 
 * [C-21] The features of a Remap must be RemapItem instances. context Remap
 * inv: self.feature.oclIsKindOf(RemapItem)
 * 
 * [C-22] Remap instances may remap only DataSet and Set instances. context
 * Remap inv: self.structure.oclIsKindOf(DataSet) or
 * self.structure.oclIsKindOf(Set)
 * 
 * [C-23] The GIVING EXCEPTION clause is valid only if READONLY ALL was
 * specified. context Remap inv: self.isGivingException->notEmpty implies
 * self.isReadOnlyAll
 * 
 * [C-24] The GIVING EXCEPTION clause is valid only if READONLY was specified.
 * context RemapItem inv: self.isGivingException->notEmpty implies
 * self.isReadOnly
 * 
 * [C-25] The setType attribute must contain one of the allowed values for set
 * organization from DASDL. context Set inv: self.setType = "BITVECTOR" or
 * self.setType = "UNORDERED LIST" or self.setType = "INDEX RANDOM" or
 * self.setType = "INDEX SEQUENTIAL" or self.setType = "ORDERED LIST"
 * 
 * [C-26] The reorganize clause, if present, must be one of the allowed values
 * from the DASDL manual. context Set inv: self.reorganize <> "" implies
 * self.reorganize = "KEY CHANGED" or self.reorganize = "KEY SAME"
 * 
 * [C-27] The items in the Set?s key data must be owned by the DataSet that the
 * Set spans. context Set inv:
 * self.keyDataItem->forAll(self.keyDataItem.namespace = self.spannedClass)
 * 
 * [C-28] A Set may not partition itself. context Set inv: self.partitionedSet
 * <> self
 * 
 * [C-29] A Set may not be partitioned by itself. context Set inv:
 * self.partitioningSet <> self
 * 
 * [C-30] A SetStructure must span one and only one DataSet instance. context
 * SetStructure inv: self.spannedClass->size = 1 and
 * self.spannedClass.oclIsKindOf(DataSet)
 * 
 * [C-31] Value of the duplicates attribute must be one of the allowed values
 * from the DASDL manual. context SetStructure inv: self.duplicates =
 * "DUPLICATES" or self.duplicates = "DUPLICATES FIRST" or self.duplicates =
 * "DUPLICATES LAST" or self.duplicates = "NO DUPLICATES" or self.duplicates =
 * "NO DUPLICATES KEY CHANGE OK" <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.resource.dmsii.DmsiiFactory
 * @model kind="package"
 * @generated
 */
public interface DmsiiPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dmsii";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///orgomg/cwmx/resource/dmsii.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "orgomg.cwmx.resource.dmsii";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    DmsiiPackage eINSTANCE = orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl.init();

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.DatabaseImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDatabase()
     * @generated
     */
    int DATABASE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__NAME = CorePackage.STRUCTURAL_FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__VISIBILITY = CorePackage.STRUCTURAL_FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__CLIENT_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__SUPPLIER_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__CONSTRAINT = CorePackage.STRUCTURAL_FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__NAMESPACE = CorePackage.STRUCTURAL_FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__IMPORTER = CorePackage.STRUCTURAL_FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__STEREOTYPE = CorePackage.STRUCTURAL_FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__TAGGED_VALUE = CorePackage.STRUCTURAL_FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__DOCUMENT = CorePackage.STRUCTURAL_FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__DESCRIPTION = CorePackage.STRUCTURAL_FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__RESPONSIBLE_PARTY = CorePackage.STRUCTURAL_FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__ELEMENT_NODE = CorePackage.STRUCTURAL_FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__SET = CorePackage.STRUCTURAL_FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__RENDERED_OBJECT = CorePackage.STRUCTURAL_FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__VOCABULARY_ELEMENT = CorePackage.STRUCTURAL_FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__MEASUREMENT = CorePackage.STRUCTURAL_FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__CHANGE_REQUEST = CorePackage.STRUCTURAL_FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DASDL_PROPERTY = CorePackage.STRUCTURAL_FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__OWNER_SCOPE = CorePackage.STRUCTURAL_FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__OWNER = CorePackage.STRUCTURAL_FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__FEATURE_NODE = CorePackage.STRUCTURAL_FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__FEATURE_MAP = CorePackage.STRUCTURAL_FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__CF_MAP = CorePackage.STRUCTURAL_FEATURE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__CHANGEABILITY = CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__MULTIPLICITY = CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__ORDERING = CorePackage.STRUCTURAL_FEATURE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__TARGET_SCOPE = CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__TYPE = CorePackage.STRUCTURAL_FEATURE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__SLOT = CorePackage.STRUCTURAL_FEATURE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DISCRIMINATED_UNION = CorePackage.STRUCTURAL_FEATURE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__INDEXED_FEATURE = CorePackage.STRUCTURAL_FEATURE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__KEY_RELATIONSHIP = CorePackage.STRUCTURAL_FEATURE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__UNIQUE_KEY = CorePackage.STRUCTURAL_FEATURE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__DATA_ITEM = CorePackage.STRUCTURAL_FEATURE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__REMAP = CorePackage.STRUCTURAL_FEATURE__REMAP;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__OWNED_ELEMENT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__IMPORTED_ELEMENT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__DATA_MANAGER = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Logical</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__IS_LOGICAL = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Guard File</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__GUARD_FILE = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE__SOURCE = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Database</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATABASE_FEATURE_COUNT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl <em>Remap</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.RemapImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemap()
     * @generated
     */
    int REMAP = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__NAME = RecordPackage.RECORD_DEF__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__VISIBILITY = RecordPackage.RECORD_DEF__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__CLIENT_DEPENDENCY = RecordPackage.RECORD_DEF__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_DEF__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__CONSTRAINT = RecordPackage.RECORD_DEF__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__NAMESPACE = RecordPackage.RECORD_DEF__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__IMPORTER = RecordPackage.RECORD_DEF__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__STEREOTYPE = RecordPackage.RECORD_DEF__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__TAGGED_VALUE = RecordPackage.RECORD_DEF__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__DOCUMENT = RecordPackage.RECORD_DEF__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__DESCRIPTION = RecordPackage.RECORD_DEF__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__RESPONSIBLE_PARTY = RecordPackage.RECORD_DEF__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__ELEMENT_NODE = RecordPackage.RECORD_DEF__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__SET = RecordPackage.RECORD_DEF__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__RENDERED_OBJECT = RecordPackage.RECORD_DEF__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__VOCABULARY_ELEMENT = RecordPackage.RECORD_DEF__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__MEASUREMENT = RecordPackage.RECORD_DEF__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__CHANGE_REQUEST = RecordPackage.RECORD_DEF__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__DASDL_PROPERTY = RecordPackage.RECORD_DEF__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__OWNED_ELEMENT = RecordPackage.RECORD_DEF__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__IS_ABSTRACT = RecordPackage.RECORD_DEF__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__FEATURE = RecordPackage.RECORD_DEF__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__STRUCTURAL_FEATURE = RecordPackage.RECORD_DEF__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__PARAMETER = RecordPackage.RECORD_DEF__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__GENERALIZATION = RecordPackage.RECORD_DEF__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__SPECIALIZATION = RecordPackage.RECORD_DEF__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__INSTANCE = RecordPackage.RECORD_DEF__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__ALIAS = RecordPackage.RECORD_DEF__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__EXPRESSION_NODE = RecordPackage.RECORD_DEF__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__MAPPING_FROM = RecordPackage.RECORD_DEF__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__MAPPING_TO = RecordPackage.RECORD_DEF__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__CLASSIFIER_MAP = RecordPackage.RECORD_DEF__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__CF_MAP = RecordPackage.RECORD_DEF__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__DOMAIN = RecordPackage.RECORD_DEF__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__SIMPLE_DIMENSION = RecordPackage.RECORD_DEF__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__INDEX = RecordPackage.RECORD_DEF__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__FIELD_DELIMITER = RecordPackage.RECORD_DEF__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__IS_FIXED_WIDTH = RecordPackage.RECORD_DEF__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__TEXT_DELIMITER = RecordPackage.RECORD_DEF__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__FILE = RecordPackage.RECORD_DEF__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__SECTION = RecordPackage.RECORD_DEF__SECTION;

    /**
     * The feature id for the '<em><b>Is Required All</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__IS_REQUIRED_ALL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Read Only All</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__IS_READ_ONLY_ALL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Giving Exception</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__IS_GIVING_EXCEPTION = RecordPackage.RECORD_DEF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Select Condition</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP__SELECT_CONDITION = RecordPackage.RECORD_DEF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Structure</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP__STRUCTURE = RecordPackage.RECORD_DEF_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Remap</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_FEATURE_COUNT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.DataSetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDataSet()
     * @generated
     */
    int DATA_SET = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__NAME = RecordPackage.RECORD_DEF__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__VISIBILITY = RecordPackage.RECORD_DEF__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__CLIENT_DEPENDENCY = RecordPackage.RECORD_DEF__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_DEF__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__CONSTRAINT = RecordPackage.RECORD_DEF__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__NAMESPACE = RecordPackage.RECORD_DEF__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__IMPORTER = RecordPackage.RECORD_DEF__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__STEREOTYPE = RecordPackage.RECORD_DEF__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__TAGGED_VALUE = RecordPackage.RECORD_DEF__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__DOCUMENT = RecordPackage.RECORD_DEF__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__DESCRIPTION = RecordPackage.RECORD_DEF__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__RESPONSIBLE_PARTY = RecordPackage.RECORD_DEF__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ELEMENT_NODE = RecordPackage.RECORD_DEF__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__SET = RecordPackage.RECORD_DEF__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__RENDERED_OBJECT = RecordPackage.RECORD_DEF__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__VOCABULARY_ELEMENT = RecordPackage.RECORD_DEF__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__MEASUREMENT = RecordPackage.RECORD_DEF__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__CHANGE_REQUEST = RecordPackage.RECORD_DEF__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__DASDL_PROPERTY = RecordPackage.RECORD_DEF__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__OWNED_ELEMENT = RecordPackage.RECORD_DEF__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__IS_ABSTRACT = RecordPackage.RECORD_DEF__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__FEATURE = RecordPackage.RECORD_DEF__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__STRUCTURAL_FEATURE = RecordPackage.RECORD_DEF__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__PARAMETER = RecordPackage.RECORD_DEF__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__GENERALIZATION = RecordPackage.RECORD_DEF__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__SPECIALIZATION = RecordPackage.RECORD_DEF__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__INSTANCE = RecordPackage.RECORD_DEF__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__ALIAS = RecordPackage.RECORD_DEF__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__EXPRESSION_NODE = RecordPackage.RECORD_DEF__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__MAPPING_FROM = RecordPackage.RECORD_DEF__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__MAPPING_TO = RecordPackage.RECORD_DEF__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__CLASSIFIER_MAP = RecordPackage.RECORD_DEF__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__CF_MAP = RecordPackage.RECORD_DEF__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__DOMAIN = RecordPackage.RECORD_DEF__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__SIMPLE_DIMENSION = RecordPackage.RECORD_DEF__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__INDEX = RecordPackage.RECORD_DEF__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__FIELD_DELIMITER = RecordPackage.RECORD_DEF__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__IS_FIXED_WIDTH = RecordPackage.RECORD_DEF__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__TEXT_DELIMITER = RecordPackage.RECORD_DEF__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__FILE = RecordPackage.RECORD_DEF__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__SECTION = RecordPackage.RECORD_DEF__SECTION;

    /**
     * The feature id for the '<em><b>Is Global</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__IS_GLOBAL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Organization</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__ORGANIZATION = RecordPackage.RECORD_DEF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__REORGANIZE = RecordPackage.RECORD_DEF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Required All</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__IS_REQUIRED_ALL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Partitioning Set</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET__PARTITIONING_SET = RecordPackage.RECORD_DEF_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Data Set</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_SET_FEATURE_COUNT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl <em>Data Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.DataItemImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDataItem()
     * @generated
     */
    int DATA_ITEM = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__NAME = RecordPackage.FIELD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__VISIBILITY = RecordPackage.FIELD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__CLIENT_DEPENDENCY = RecordPackage.FIELD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__SUPPLIER_DEPENDENCY = RecordPackage.FIELD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__CONSTRAINT = RecordPackage.FIELD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__NAMESPACE = RecordPackage.FIELD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IMPORTER = RecordPackage.FIELD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__STEREOTYPE = RecordPackage.FIELD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__TAGGED_VALUE = RecordPackage.FIELD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__DOCUMENT = RecordPackage.FIELD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__DESCRIPTION = RecordPackage.FIELD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__RESPONSIBLE_PARTY = RecordPackage.FIELD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__ELEMENT_NODE = RecordPackage.FIELD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__SET = RecordPackage.FIELD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__RENDERED_OBJECT = RecordPackage.FIELD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__VOCABULARY_ELEMENT = RecordPackage.FIELD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__MEASUREMENT = RecordPackage.FIELD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__CHANGE_REQUEST = RecordPackage.FIELD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__DASDL_PROPERTY = RecordPackage.FIELD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__OWNER_SCOPE = RecordPackage.FIELD__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__OWNER = RecordPackage.FIELD__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__FEATURE_NODE = RecordPackage.FIELD__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__FEATURE_MAP = RecordPackage.FIELD__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__CF_MAP = RecordPackage.FIELD__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__CHANGEABILITY = RecordPackage.FIELD__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__MULTIPLICITY = RecordPackage.FIELD__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__ORDERING = RecordPackage.FIELD__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__TARGET_SCOPE = RecordPackage.FIELD__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__TYPE = RecordPackage.FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__SLOT = RecordPackage.FIELD__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__DISCRIMINATED_UNION = RecordPackage.FIELD__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__INDEXED_FEATURE = RecordPackage.FIELD__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__KEY_RELATIONSHIP = RecordPackage.FIELD__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__UNIQUE_KEY = RecordPackage.FIELD__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__DATA_ITEM = RecordPackage.FIELD__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__REMAP = RecordPackage.FIELD__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__INITIAL_VALUE = RecordPackage.FIELD__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__LENGTH = RecordPackage.FIELD__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__PRECISION = RecordPackage.FIELD__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__SCALE = RecordPackage.FIELD__SCALE;

    /**
     * The feature id for the '<em><b>Null Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__NULL_VALUE = RecordPackage.FIELD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Required</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_REQUIRED = RecordPackage.FIELD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__SIZE = RecordPackage.FIELD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Scale Factor</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__SCALE_FACTOR = RecordPackage.FIELD_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Signed</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_SIGNED = RecordPackage.FIELD_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Occurs</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__OCCURS = RecordPackage.FIELD_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Is Virtual</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_VIRTUAL = RecordPackage.FIELD_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Virtual Expression</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__VIRTUAL_EXPRESSION = RecordPackage.FIELD_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Is Kanji</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_KANJI = RecordPackage.FIELD_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Ccs Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__CCS_VERSION = RecordPackage.FIELD_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Is Gemcos Literal</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_GEMCOS_LITERAL = RecordPackage.FIELD_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Is Gemcos Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_GEMCOS_DATA = RecordPackage.FIELD_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Is Gemcos SSN</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_GEMCOS_SSN = RecordPackage.FIELD_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Is Gemcos DBSN</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_GEMCOS_DBSN = RecordPackage.FIELD_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Is Coms Program</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_COMS_PROGRAM = RecordPackage.FIELD_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Is Coms ID</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_COMS_ID = RecordPackage.FIELD_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Is Coms Locator</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_COMS_LOCATOR = RecordPackage.FIELD_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Is Coms Outp Q</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__IS_COMS_OUTP_Q = RecordPackage.FIELD_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Occuring Data Item</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__OCCURING_DATA_ITEM = RecordPackage.FIELD_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Occurs Data Item</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__OCCURS_DATA_ITEM = RecordPackage.FIELD_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Key Data Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__KEY_DATA_SET = RecordPackage.FIELD_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Field Bit</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_ITEM__FIELD_BIT = RecordPackage.FIELD_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Structure</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM__STRUCTURE = RecordPackage.FIELD_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>Data Item</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DATA_ITEM_FEATURE_COUNT = RecordPackage.FIELD_FEATURE_COUNT + 23;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl <em>Variable Format Part</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getVariableFormatPart()
     * @generated
     */
    int VARIABLE_FORMAT_PART = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__NAME = RecordPackage.RECORD_DEF__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__VISIBILITY = RecordPackage.RECORD_DEF__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__CLIENT_DEPENDENCY = RecordPackage.RECORD_DEF__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SUPPLIER_DEPENDENCY = RecordPackage.RECORD_DEF__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__CONSTRAINT = RecordPackage.RECORD_DEF__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__NAMESPACE = RecordPackage.RECORD_DEF__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__IMPORTER = RecordPackage.RECORD_DEF__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__STEREOTYPE = RecordPackage.RECORD_DEF__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__TAGGED_VALUE = RecordPackage.RECORD_DEF__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__DOCUMENT = RecordPackage.RECORD_DEF__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__DESCRIPTION = RecordPackage.RECORD_DEF__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__RESPONSIBLE_PARTY = RecordPackage.RECORD_DEF__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__ELEMENT_NODE = RecordPackage.RECORD_DEF__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SET = RecordPackage.RECORD_DEF__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__RENDERED_OBJECT = RecordPackage.RECORD_DEF__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__VOCABULARY_ELEMENT = RecordPackage.RECORD_DEF__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__MEASUREMENT = RecordPackage.RECORD_DEF__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__CHANGE_REQUEST = RecordPackage.RECORD_DEF__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__DASDL_PROPERTY = RecordPackage.RECORD_DEF__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__OWNED_ELEMENT = RecordPackage.RECORD_DEF__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__IS_ABSTRACT = RecordPackage.RECORD_DEF__IS_ABSTRACT;

    /**
     * The feature id for the '<em><b>Feature</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__FEATURE = RecordPackage.RECORD_DEF__FEATURE;

    /**
     * The feature id for the '<em><b>Structural Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__STRUCTURAL_FEATURE = RecordPackage.RECORD_DEF__STRUCTURAL_FEATURE;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__PARAMETER = RecordPackage.RECORD_DEF__PARAMETER;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__GENERALIZATION = RecordPackage.RECORD_DEF__GENERALIZATION;

    /**
     * The feature id for the '<em><b>Specialization</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SPECIALIZATION = RecordPackage.RECORD_DEF__SPECIALIZATION;

    /**
     * The feature id for the '<em><b>Instance</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__INSTANCE = RecordPackage.RECORD_DEF__INSTANCE;

    /**
     * The feature id for the '<em><b>Alias</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__ALIAS = RecordPackage.RECORD_DEF__ALIAS;

    /**
     * The feature id for the '<em><b>Expression Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__EXPRESSION_NODE = RecordPackage.RECORD_DEF__EXPRESSION_NODE;

    /**
     * The feature id for the '<em><b>Mapping From</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__MAPPING_FROM = RecordPackage.RECORD_DEF__MAPPING_FROM;

    /**
     * The feature id for the '<em><b>Mapping To</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__MAPPING_TO = RecordPackage.RECORD_DEF__MAPPING_TO;

    /**
     * The feature id for the '<em><b>Classifier Map</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__CLASSIFIER_MAP = RecordPackage.RECORD_DEF__CLASSIFIER_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__CF_MAP = RecordPackage.RECORD_DEF__CF_MAP;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__DOMAIN = RecordPackage.RECORD_DEF__DOMAIN;

    /**
     * The feature id for the '<em><b>Simple Dimension</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SIMPLE_DIMENSION = RecordPackage.RECORD_DEF__SIMPLE_DIMENSION;

    /**
     * The feature id for the '<em><b>Index</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__INDEX = RecordPackage.RECORD_DEF__INDEX;

    /**
     * The feature id for the '<em><b>Field Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__FIELD_DELIMITER = RecordPackage.RECORD_DEF__FIELD_DELIMITER;

    /**
     * The feature id for the '<em><b>Is Fixed Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__IS_FIXED_WIDTH = RecordPackage.RECORD_DEF__IS_FIXED_WIDTH;

    /**
     * The feature id for the '<em><b>Text Delimiter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__TEXT_DELIMITER = RecordPackage.RECORD_DEF__TEXT_DELIMITER;

    /**
     * The feature id for the '<em><b>File</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__FILE = RecordPackage.RECORD_DEF__FILE;

    /**
     * The feature id for the '<em><b>Section</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SECTION = RecordPackage.RECORD_DEF__SECTION;

    /**
     * The feature id for the '<em><b>Vf Label</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__VF_LABEL = RecordPackage.RECORD_DEF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Select Condition</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART__SELECT_CONDITION = RecordPackage.RECORD_DEF_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Variable Format Part</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FORMAT_PART_FEATURE_COUNT = RecordPackage.RECORD_DEF_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.dmsii.impl.SetStructureImpl
     * <em>Set Structure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.dmsii.impl.SetStructureImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSetStructure()
     * @generated
     */
    int SET_STRUCTURE = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__NAME = CorePackage.STRUCTURAL_FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__VISIBILITY = CorePackage.STRUCTURAL_FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__CLIENT_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__SUPPLIER_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__CONSTRAINT = CorePackage.STRUCTURAL_FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__NAMESPACE = CorePackage.STRUCTURAL_FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__IMPORTER = CorePackage.STRUCTURAL_FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__STEREOTYPE = CorePackage.STRUCTURAL_FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__TAGGED_VALUE = CorePackage.STRUCTURAL_FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DOCUMENT = CorePackage.STRUCTURAL_FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DESCRIPTION = CorePackage.STRUCTURAL_FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__RESPONSIBLE_PARTY = CorePackage.STRUCTURAL_FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__ELEMENT_NODE = CorePackage.STRUCTURAL_FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__SET = CorePackage.STRUCTURAL_FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__RENDERED_OBJECT = CorePackage.STRUCTURAL_FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__VOCABULARY_ELEMENT = CorePackage.STRUCTURAL_FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__MEASUREMENT = CorePackage.STRUCTURAL_FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__CHANGE_REQUEST = CorePackage.STRUCTURAL_FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DASDL_PROPERTY = CorePackage.STRUCTURAL_FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__OWNER_SCOPE = CorePackage.STRUCTURAL_FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__OWNER = CorePackage.STRUCTURAL_FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__FEATURE_NODE = CorePackage.STRUCTURAL_FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__FEATURE_MAP = CorePackage.STRUCTURAL_FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__CF_MAP = CorePackage.STRUCTURAL_FEATURE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__CHANGEABILITY = CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__MULTIPLICITY = CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__ORDERING = CorePackage.STRUCTURAL_FEATURE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__TARGET_SCOPE = CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__TYPE = CorePackage.STRUCTURAL_FEATURE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__SLOT = CorePackage.STRUCTURAL_FEATURE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DISCRIMINATED_UNION = CorePackage.STRUCTURAL_FEATURE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__INDEXED_FEATURE = CorePackage.STRUCTURAL_FEATURE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__KEY_RELATIONSHIP = CorePackage.STRUCTURAL_FEATURE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__UNIQUE_KEY = CorePackage.STRUCTURAL_FEATURE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DATA_ITEM = CorePackage.STRUCTURAL_FEATURE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__REMAP = CorePackage.STRUCTURAL_FEATURE__REMAP;

    /**
     * The feature id for the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_STRUCTURE__DUPLICATES = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set Structure</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_STRUCTURE_FEATURE_COUNT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.dmsii.impl.SetImpl <em>Set</em>}' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see orgomg.cwmx.resource.dmsii.impl.SetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSet()
     * @generated
     */
    int SET = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__NAME = SET_STRUCTURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__VISIBILITY = SET_STRUCTURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__CLIENT_DEPENDENCY = SET_STRUCTURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__SUPPLIER_DEPENDENCY = SET_STRUCTURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__CONSTRAINT = SET_STRUCTURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__NAMESPACE = SET_STRUCTURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__IMPORTER = SET_STRUCTURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__STEREOTYPE = SET_STRUCTURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__TAGGED_VALUE = SET_STRUCTURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__DOCUMENT = SET_STRUCTURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__DESCRIPTION = SET_STRUCTURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__RESPONSIBLE_PARTY = SET_STRUCTURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__ELEMENT_NODE = SET_STRUCTURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__SET = SET_STRUCTURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__RENDERED_OBJECT = SET_STRUCTURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__VOCABULARY_ELEMENT = SET_STRUCTURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__MEASUREMENT = SET_STRUCTURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__CHANGE_REQUEST = SET_STRUCTURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__DASDL_PROPERTY = SET_STRUCTURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__OWNER_SCOPE = SET_STRUCTURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__OWNER = SET_STRUCTURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__FEATURE_NODE = SET_STRUCTURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__FEATURE_MAP = SET_STRUCTURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__CF_MAP = SET_STRUCTURE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__CHANGEABILITY = SET_STRUCTURE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__MULTIPLICITY = SET_STRUCTURE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__ORDERING = SET_STRUCTURE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__TARGET_SCOPE = SET_STRUCTURE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__TYPE = SET_STRUCTURE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__SLOT = SET_STRUCTURE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__DISCRIMINATED_UNION = SET_STRUCTURE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__INDEXED_FEATURE = SET_STRUCTURE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__KEY_RELATIONSHIP = SET_STRUCTURE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__UNIQUE_KEY = SET_STRUCTURE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__DATA_ITEM = SET_STRUCTURE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__REMAP = SET_STRUCTURE__REMAP;

    /**
     * The feature id for the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__DUPLICATES = SET_STRUCTURE__DUPLICATES;

    /**
     * The feature id for the '<em><b>Set Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__SET_TYPE = SET_STRUCTURE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__REORGANIZE = SET_STRUCTURE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Key Data Item</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__KEY_DATA_ITEM = SET_STRUCTURE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Partitioned Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__PARTITIONED_SET = SET_STRUCTURE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Partitioning Set</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET__PARTITIONING_SET = SET_STRUCTURE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Partitioned Data Set</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__PARTITIONED_DATA_SET = SET_STRUCTURE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Set</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SET_FEATURE_COUNT = SET_STRUCTURE_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.AccessImpl <em>Access</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.AccessImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getAccess()
     * @generated
     */
    int ACCESS = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__NAME = SET_STRUCTURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__VISIBILITY = SET_STRUCTURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__CLIENT_DEPENDENCY = SET_STRUCTURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__SUPPLIER_DEPENDENCY = SET_STRUCTURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__CONSTRAINT = SET_STRUCTURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__NAMESPACE = SET_STRUCTURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__IMPORTER = SET_STRUCTURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__STEREOTYPE = SET_STRUCTURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__TAGGED_VALUE = SET_STRUCTURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__DOCUMENT = SET_STRUCTURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__DESCRIPTION = SET_STRUCTURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__RESPONSIBLE_PARTY = SET_STRUCTURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__ELEMENT_NODE = SET_STRUCTURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__SET = SET_STRUCTURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__RENDERED_OBJECT = SET_STRUCTURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__VOCABULARY_ELEMENT = SET_STRUCTURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__MEASUREMENT = SET_STRUCTURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__CHANGE_REQUEST = SET_STRUCTURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__DASDL_PROPERTY = SET_STRUCTURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__OWNER_SCOPE = SET_STRUCTURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__OWNER = SET_STRUCTURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__FEATURE_NODE = SET_STRUCTURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__FEATURE_MAP = SET_STRUCTURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__CF_MAP = SET_STRUCTURE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__CHANGEABILITY = SET_STRUCTURE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__MULTIPLICITY = SET_STRUCTURE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__ORDERING = SET_STRUCTURE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__TARGET_SCOPE = SET_STRUCTURE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__TYPE = SET_STRUCTURE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__SLOT = SET_STRUCTURE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__DISCRIMINATED_UNION = SET_STRUCTURE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__INDEXED_FEATURE = SET_STRUCTURE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS__KEY_RELATIONSHIP = SET_STRUCTURE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__UNIQUE_KEY = SET_STRUCTURE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__DATA_ITEM = SET_STRUCTURE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__REMAP = SET_STRUCTURE__REMAP;

    /**
     * The feature id for the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS__DUPLICATES = SET_STRUCTURE__DUPLICATES;

    /**
     * The number of structural features of the '<em>Access</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ACCESS_FEATURE_COUNT = SET_STRUCTURE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.SubsetImpl <em>Subset</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.SubsetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSubset()
     * @generated
     */
    int SUBSET = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__NAME = SET__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__VISIBILITY = SET__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__CLIENT_DEPENDENCY = SET__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__SUPPLIER_DEPENDENCY = SET__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__CONSTRAINT = SET__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__NAMESPACE = SET__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__IMPORTER = SET__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__STEREOTYPE = SET__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__TAGGED_VALUE = SET__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__DOCUMENT = SET__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__DESCRIPTION = SET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__RESPONSIBLE_PARTY = SET__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__ELEMENT_NODE = SET__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__SET = SET__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__RENDERED_OBJECT = SET__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__VOCABULARY_ELEMENT = SET__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__MEASUREMENT = SET__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__CHANGE_REQUEST = SET__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__DASDL_PROPERTY = SET__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__OWNER_SCOPE = SET__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__OWNER = SET__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__FEATURE_NODE = SET__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__FEATURE_MAP = SET__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__CF_MAP = SET__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__CHANGEABILITY = SET__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__MULTIPLICITY = SET__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__ORDERING = SET__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__TARGET_SCOPE = SET__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__TYPE = SET__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__SLOT = SET__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__DISCRIMINATED_UNION = SET__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__INDEXED_FEATURE = SET__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__KEY_RELATIONSHIP = SET__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__UNIQUE_KEY = SET__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__DATA_ITEM = SET__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__REMAP = SET__REMAP;

    /**
     * The feature id for the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__DUPLICATES = SET__DUPLICATES;

    /**
     * The feature id for the '<em><b>Set Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__SET_TYPE = SET__SET_TYPE;

    /**
     * The feature id for the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__REORGANIZE = SET__REORGANIZE;

    /**
     * The feature id for the '<em><b>Key Data Item</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__KEY_DATA_ITEM = SET__KEY_DATA_ITEM;

    /**
     * The feature id for the '<em><b>Partitioned Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__PARTITIONED_SET = SET__PARTITIONED_SET;

    /**
     * The feature id for the '<em><b>Partitioning Set</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET__PARTITIONING_SET = SET__PARTITIONING_SET;

    /**
     * The feature id for the '<em><b>Partitioned Data Set</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSET__PARTITIONED_DATA_SET = SET__PARTITIONED_DATA_SET;

    /**
     * The number of structural features of the '<em>Subset</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SUBSET_FEATURE_COUNT = SET_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.AutomaticSubsetImpl <em>Automatic Subset</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.AutomaticSubsetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getAutomaticSubset()
     * @generated
     */
    int AUTOMATIC_SUBSET = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__NAME = SUBSET__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__VISIBILITY = SUBSET__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CLIENT_DEPENDENCY = SUBSET__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__SUPPLIER_DEPENDENCY = SUBSET__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CONSTRAINT = SUBSET__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__NAMESPACE = SUBSET__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__IMPORTER = SUBSET__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__STEREOTYPE = SUBSET__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__TAGGED_VALUE = SUBSET__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DOCUMENT = SUBSET__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DESCRIPTION = SUBSET__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__RESPONSIBLE_PARTY = SUBSET__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__ELEMENT_NODE = SUBSET__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__SET = SUBSET__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__RENDERED_OBJECT = SUBSET__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__VOCABULARY_ELEMENT = SUBSET__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__MEASUREMENT = SUBSET__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CHANGE_REQUEST = SUBSET__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DASDL_PROPERTY = SUBSET__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__OWNER_SCOPE = SUBSET__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__OWNER = SUBSET__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__FEATURE_NODE = SUBSET__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__FEATURE_MAP = SUBSET__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CF_MAP = SUBSET__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CHANGEABILITY = SUBSET__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__MULTIPLICITY = SUBSET__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__ORDERING = SUBSET__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__TARGET_SCOPE = SUBSET__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__TYPE = SUBSET__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__SLOT = SUBSET__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DISCRIMINATED_UNION = SUBSET__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__INDEXED_FEATURE = SUBSET__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__KEY_RELATIONSHIP = SUBSET__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__UNIQUE_KEY = SUBSET__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DATA_ITEM = SUBSET__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__REMAP = SUBSET__REMAP;

    /**
     * The feature id for the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__DUPLICATES = SUBSET__DUPLICATES;

    /**
     * The feature id for the '<em><b>Set Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__SET_TYPE = SUBSET__SET_TYPE;

    /**
     * The feature id for the '<em><b>Reorganize</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__REORGANIZE = SUBSET__REORGANIZE;

    /**
     * The feature id for the '<em><b>Key Data Item</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__KEY_DATA_ITEM = SUBSET__KEY_DATA_ITEM;

    /**
     * The feature id for the '<em><b>Partitioned Set</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__PARTITIONED_SET = SUBSET__PARTITIONED_SET;

    /**
     * The feature id for the '<em><b>Partitioning Set</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__PARTITIONING_SET = SUBSET__PARTITIONING_SET;

    /**
     * The feature id for the '<em><b>Partitioned Data Set</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__PARTITIONED_DATA_SET = SUBSET__PARTITIONED_DATA_SET;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET__CONDITION = SUBSET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Automatic Subset</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTOMATIC_SUBSET_FEATURE_COUNT = SUBSET_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.KeyItemImpl <em>Key Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.KeyItemImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getKeyItem()
     * @generated
     */
    int KEY_ITEM = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__NAME = KeysindexesPackage.INDEXED_FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__VISIBILITY = KeysindexesPackage.INDEXED_FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__CLIENT_DEPENDENCY = KeysindexesPackage.INDEXED_FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__SUPPLIER_DEPENDENCY = KeysindexesPackage.INDEXED_FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__CONSTRAINT = KeysindexesPackage.INDEXED_FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__NAMESPACE = KeysindexesPackage.INDEXED_FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__IMPORTER = KeysindexesPackage.INDEXED_FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__STEREOTYPE = KeysindexesPackage.INDEXED_FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__TAGGED_VALUE = KeysindexesPackage.INDEXED_FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__DOCUMENT = KeysindexesPackage.INDEXED_FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__DESCRIPTION = KeysindexesPackage.INDEXED_FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__RESPONSIBLE_PARTY = KeysindexesPackage.INDEXED_FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__ELEMENT_NODE = KeysindexesPackage.INDEXED_FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__SET = KeysindexesPackage.INDEXED_FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__RENDERED_OBJECT = KeysindexesPackage.INDEXED_FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__VOCABULARY_ELEMENT = KeysindexesPackage.INDEXED_FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__MEASUREMENT = KeysindexesPackage.INDEXED_FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__CHANGE_REQUEST = KeysindexesPackage.INDEXED_FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_ITEM__DASDL_PROPERTY = KeysindexesPackage.INDEXED_FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Is Ascending</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__IS_ASCENDING = KeysindexesPackage.INDEXED_FEATURE__IS_ASCENDING;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__FEATURE = KeysindexesPackage.INDEXED_FEATURE__FEATURE;

    /**
     * The feature id for the '<em><b>Index</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__INDEX = KeysindexesPackage.INDEXED_FEATURE__INDEX;

    /**
     * The feature id for the '<em><b>Collation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM__COLLATION = KeysindexesPackage.INDEXED_FEATURE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Key Item</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int KEY_ITEM_FEATURE_COUNT = KeysindexesPackage.INDEXED_FEATURE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl <em>Remap Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.RemapItemImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemapItem()
     * @generated
     */
    int REMAP_ITEM = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__NAME = RecordPackage.FIELD__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__VISIBILITY = RecordPackage.FIELD__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__CLIENT_DEPENDENCY = RecordPackage.FIELD__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__SUPPLIER_DEPENDENCY = RecordPackage.FIELD__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__CONSTRAINT = RecordPackage.FIELD__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__NAMESPACE = RecordPackage.FIELD__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IMPORTER = RecordPackage.FIELD__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__STEREOTYPE = RecordPackage.FIELD__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__TAGGED_VALUE = RecordPackage.FIELD__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__DOCUMENT = RecordPackage.FIELD__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__DESCRIPTION = RecordPackage.FIELD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__RESPONSIBLE_PARTY = RecordPackage.FIELD__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__ELEMENT_NODE = RecordPackage.FIELD__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__SET = RecordPackage.FIELD__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__RENDERED_OBJECT = RecordPackage.FIELD__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__VOCABULARY_ELEMENT = RecordPackage.FIELD__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__MEASUREMENT = RecordPackage.FIELD__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__CHANGE_REQUEST = RecordPackage.FIELD__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__DASDL_PROPERTY = RecordPackage.FIELD__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__OWNER_SCOPE = RecordPackage.FIELD__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__OWNER = RecordPackage.FIELD__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__FEATURE_NODE = RecordPackage.FIELD__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__FEATURE_MAP = RecordPackage.FIELD__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__CF_MAP = RecordPackage.FIELD__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__CHANGEABILITY = RecordPackage.FIELD__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__MULTIPLICITY = RecordPackage.FIELD__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__ORDERING = RecordPackage.FIELD__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__TARGET_SCOPE = RecordPackage.FIELD__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__TYPE = RecordPackage.FIELD__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__SLOT = RecordPackage.FIELD__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__DISCRIMINATED_UNION = RecordPackage.FIELD__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__INDEXED_FEATURE = RecordPackage.FIELD__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__KEY_RELATIONSHIP = RecordPackage.FIELD__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__UNIQUE_KEY = RecordPackage.FIELD__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__DATA_ITEM = RecordPackage.FIELD__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__REMAP = RecordPackage.FIELD__REMAP;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__INITIAL_VALUE = RecordPackage.FIELD__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__LENGTH = RecordPackage.FIELD__LENGTH;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__PRECISION = RecordPackage.FIELD__PRECISION;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__SCALE = RecordPackage.FIELD__SCALE;

    /**
     * The feature id for the '<em><b>Occurs</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__OCCURS = RecordPackage.FIELD_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Required</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IS_REQUIRED = RecordPackage.FIELD_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Hidden</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IS_HIDDEN = RecordPackage.FIELD_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IS_READ_ONLY = RecordPackage.FIELD_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Giving Exception</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IS_GIVING_EXCEPTION = RecordPackage.FIELD_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Virtual</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMAP_ITEM__IS_VIRTUAL = RecordPackage.FIELD_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Virtual Expression</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM__VIRTUAL_EXPRESSION = RecordPackage.FIELD_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Remap Item</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMAP_ITEM_FEATURE_COUNT = RecordPackage.FIELD_FEATURE_COUNT + 7;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.FieldBitImpl <em>Field Bit</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.FieldBitImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getFieldBit()
     * @generated
     */
    int FIELD_BIT = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_BIT__DATA_ITEM = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Field Bit</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIELD_BIT_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.RemarkImpl <em>Remark</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.RemarkImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemark()
     * @generated
     */
    int REMARK = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__NAME = CorePackage.STRUCTURAL_FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__VISIBILITY = CorePackage.STRUCTURAL_FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__CLIENT_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__SUPPLIER_DEPENDENCY = CorePackage.STRUCTURAL_FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__CONSTRAINT = CorePackage.STRUCTURAL_FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__NAMESPACE = CorePackage.STRUCTURAL_FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__IMPORTER = CorePackage.STRUCTURAL_FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__STEREOTYPE = CorePackage.STRUCTURAL_FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__TAGGED_VALUE = CorePackage.STRUCTURAL_FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__DOCUMENT = CorePackage.STRUCTURAL_FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__DESCRIPTION = CorePackage.STRUCTURAL_FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__RESPONSIBLE_PARTY = CorePackage.STRUCTURAL_FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__ELEMENT_NODE = CorePackage.STRUCTURAL_FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__SET = CorePackage.STRUCTURAL_FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__RENDERED_OBJECT = CorePackage.STRUCTURAL_FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__VOCABULARY_ELEMENT = CorePackage.STRUCTURAL_FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__MEASUREMENT = CorePackage.STRUCTURAL_FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__CHANGE_REQUEST = CorePackage.STRUCTURAL_FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__DASDL_PROPERTY = CorePackage.STRUCTURAL_FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__OWNER_SCOPE = CorePackage.STRUCTURAL_FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__OWNER = CorePackage.STRUCTURAL_FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__FEATURE_NODE = CorePackage.STRUCTURAL_FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__FEATURE_MAP = CorePackage.STRUCTURAL_FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__CF_MAP = CorePackage.STRUCTURAL_FEATURE__CF_MAP;

    /**
     * The feature id for the '<em><b>Changeability</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__CHANGEABILITY = CorePackage.STRUCTURAL_FEATURE__CHANGEABILITY;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__MULTIPLICITY = CorePackage.STRUCTURAL_FEATURE__MULTIPLICITY;

    /**
     * The feature id for the '<em><b>Ordering</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__ORDERING = CorePackage.STRUCTURAL_FEATURE__ORDERING;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__TARGET_SCOPE = CorePackage.STRUCTURAL_FEATURE__TARGET_SCOPE;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__TYPE = CorePackage.STRUCTURAL_FEATURE__TYPE;

    /**
     * The feature id for the '<em><b>Slot</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__SLOT = CorePackage.STRUCTURAL_FEATURE__SLOT;

    /**
     * The feature id for the '<em><b>Discriminated Union</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__DISCRIMINATED_UNION = CorePackage.STRUCTURAL_FEATURE__DISCRIMINATED_UNION;

    /**
     * The feature id for the '<em><b>Indexed Feature</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__INDEXED_FEATURE = CorePackage.STRUCTURAL_FEATURE__INDEXED_FEATURE;

    /**
     * The feature id for the '<em><b>Key Relationship</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REMARK__KEY_RELATIONSHIP = CorePackage.STRUCTURAL_FEATURE__KEY_RELATIONSHIP;

    /**
     * The feature id for the '<em><b>Unique Key</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__UNIQUE_KEY = CorePackage.STRUCTURAL_FEATURE__UNIQUE_KEY;

    /**
     * The feature id for the '<em><b>Data Item</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__DATA_ITEM = CorePackage.STRUCTURAL_FEATURE__DATA_ITEM;

    /**
     * The feature id for the '<em><b>Remap</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__REMAP = CorePackage.STRUCTURAL_FEATURE__REMAP;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK__TEXT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Remark</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int REMARK_FEATURE_COUNT = CorePackage.STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDatabaseImpl <em>Physical Database</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDatabaseImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDatabase()
     * @generated
     */
    int PHYSICAL_DATABASE = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__NAME = CorePackage.PACKAGE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__VISIBILITY = CorePackage.PACKAGE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__CLIENT_DEPENDENCY = CorePackage.PACKAGE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__SUPPLIER_DEPENDENCY = CorePackage.PACKAGE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__CONSTRAINT = CorePackage.PACKAGE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__NAMESPACE = CorePackage.PACKAGE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__IMPORTER = CorePackage.PACKAGE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__STEREOTYPE = CorePackage.PACKAGE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__TAGGED_VALUE = CorePackage.PACKAGE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__DOCUMENT = CorePackage.PACKAGE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__DESCRIPTION = CorePackage.PACKAGE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__RESPONSIBLE_PARTY = CorePackage.PACKAGE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__ELEMENT_NODE = CorePackage.PACKAGE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__SET = CorePackage.PACKAGE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__RENDERED_OBJECT = CorePackage.PACKAGE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__VOCABULARY_ELEMENT = CorePackage.PACKAGE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__MEASUREMENT = CorePackage.PACKAGE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__CHANGE_REQUEST = CorePackage.PACKAGE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__DASDL_PROPERTY = CorePackage.PACKAGE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__OWNED_ELEMENT = CorePackage.PACKAGE__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Imported Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__IMPORTED_ELEMENT = CorePackage.PACKAGE__IMPORTED_ELEMENT;

    /**
     * The feature id for the '<em><b>Data Manager</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE__DATA_MANAGER = CorePackage.PACKAGE__DATA_MANAGER;

    /**
     * The number of structural features of the '<em>Physical Database</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATABASE_FEATURE_COUNT = CorePackage.PACKAGE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetImpl <em>Physical Data Set</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDataSet()
     * @generated
     */
    int PHYSICAL_DATA_SET = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The number of structural features of the '<em>Physical Data Set</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.dmsii.impl.DASDLCommentImpl
     * <em>DASDL Comment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.dmsii.impl.DASDLCommentImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDASDLComment()
     * @generated
     */
    int DASDL_COMMENT = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__NAME = BusinessinformationPackage.DESCRIPTION__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__VISIBILITY = BusinessinformationPackage.DESCRIPTION__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__CLIENT_DEPENDENCY = BusinessinformationPackage.DESCRIPTION__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__SUPPLIER_DEPENDENCY = BusinessinformationPackage.DESCRIPTION__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__CONSTRAINT = BusinessinformationPackage.DESCRIPTION__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__NAMESPACE = BusinessinformationPackage.DESCRIPTION__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__IMPORTER = BusinessinformationPackage.DESCRIPTION__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__STEREOTYPE = BusinessinformationPackage.DESCRIPTION__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__TAGGED_VALUE = BusinessinformationPackage.DESCRIPTION__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__DOCUMENT = BusinessinformationPackage.DESCRIPTION__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__DESCRIPTION = BusinessinformationPackage.DESCRIPTION__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__RESPONSIBLE_PARTY = BusinessinformationPackage.DESCRIPTION__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__ELEMENT_NODE = BusinessinformationPackage.DESCRIPTION__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__SET = BusinessinformationPackage.DESCRIPTION__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__RENDERED_OBJECT = BusinessinformationPackage.DESCRIPTION__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__VOCABULARY_ELEMENT = BusinessinformationPackage.DESCRIPTION__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__MEASUREMENT = BusinessinformationPackage.DESCRIPTION__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__CHANGE_REQUEST = BusinessinformationPackage.DESCRIPTION__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__DASDL_PROPERTY = BusinessinformationPackage.DESCRIPTION__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__OWNED_ELEMENT = BusinessinformationPackage.DESCRIPTION__OWNED_ELEMENT;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__BODY = BusinessinformationPackage.DESCRIPTION__BODY;

    /**
     * The feature id for the '<em><b>Language</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__LANGUAGE = BusinessinformationPackage.DESCRIPTION__LANGUAGE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__TYPE = BusinessinformationPackage.DESCRIPTION__TYPE;

    /**
     * The feature id for the '<em><b>Model Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT__MODEL_ELEMENT = BusinessinformationPackage.DESCRIPTION__MODEL_ELEMENT;

    /**
     * The number of structural features of the '<em>DASDL Comment</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_COMMENT_FEATURE_COUNT = BusinessinformationPackage.DESCRIPTION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link orgomg.cwmx.resource.dmsii.impl.PhysicalSetImpl
     * <em>Physical Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalSetImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalSet()
     * @generated
     */
    int PHYSICAL_SET = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The number of structural features of the '<em>Physical Set</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetOverrideImpl <em>Physical Data Set Override</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetOverrideImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDataSetOverride()
     * @generated
     */
    int PHYSICAL_DATA_SET_OVERRIDE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__NAME = CorePackage.FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__VISIBILITY = CorePackage.FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__CLIENT_DEPENDENCY = CorePackage.FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__SUPPLIER_DEPENDENCY = CorePackage.FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__CONSTRAINT = CorePackage.FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__NAMESPACE = CorePackage.FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__IMPORTER = CorePackage.FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__STEREOTYPE = CorePackage.FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__TAGGED_VALUE = CorePackage.FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__DOCUMENT = CorePackage.FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__DESCRIPTION = CorePackage.FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__RESPONSIBLE_PARTY = CorePackage.FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__ELEMENT_NODE = CorePackage.FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__SET = CorePackage.FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__RENDERED_OBJECT = CorePackage.FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__VOCABULARY_ELEMENT = CorePackage.FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__MEASUREMENT = CorePackage.FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__CHANGE_REQUEST = CorePackage.FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__DASDL_PROPERTY = CorePackage.FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__OWNER_SCOPE = CorePackage.FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__OWNER = CorePackage.FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__FEATURE_NODE = CorePackage.FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__FEATURE_MAP = CorePackage.FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE__CF_MAP = CorePackage.FEATURE__CF_MAP;

    /**
     * The number of structural features of the '<em>Physical Data Set Override</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_DATA_SET_OVERRIDE_FEATURE_COUNT = CorePackage.FEATURE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalSetOverrideImpl <em>Physical Set Override</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalSetOverrideImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalSetOverride()
     * @generated
     */
    int PHYSICAL_SET_OVERRIDE = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__NAME = CorePackage.FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__VISIBILITY = CorePackage.FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__CLIENT_DEPENDENCY = CorePackage.FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__SUPPLIER_DEPENDENCY = CorePackage.FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__CONSTRAINT = CorePackage.FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__NAMESPACE = CorePackage.FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__IMPORTER = CorePackage.FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__STEREOTYPE = CorePackage.FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__TAGGED_VALUE = CorePackage.FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__DOCUMENT = CorePackage.FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__DESCRIPTION = CorePackage.FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__RESPONSIBLE_PARTY = CorePackage.FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__ELEMENT_NODE = CorePackage.FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__SET = CorePackage.FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__RENDERED_OBJECT = CorePackage.FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__VOCABULARY_ELEMENT = CorePackage.FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__MEASUREMENT = CorePackage.FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__CHANGE_REQUEST = CorePackage.FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__DASDL_PROPERTY = CorePackage.FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__OWNER_SCOPE = CorePackage.FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__OWNER = CorePackage.FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__FEATURE_NODE = CorePackage.FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__FEATURE_MAP = CorePackage.FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE__CF_MAP = CorePackage.FEATURE__CF_MAP;

    /**
     * The number of structural features of the '<em>Physical Set Override</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_SET_OVERRIDE_FEATURE_COUNT = CorePackage.FEATURE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalAccessOverrideImpl <em>Physical Access Override</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.PhysicalAccessOverrideImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalAccessOverride()
     * @generated
     */
    int PHYSICAL_ACCESS_OVERRIDE = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__NAME = CorePackage.FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__VISIBILITY = CorePackage.FEATURE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__CLIENT_DEPENDENCY = CorePackage.FEATURE__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__SUPPLIER_DEPENDENCY = CorePackage.FEATURE__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__CONSTRAINT = CorePackage.FEATURE__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__NAMESPACE = CorePackage.FEATURE__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__IMPORTER = CorePackage.FEATURE__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__STEREOTYPE = CorePackage.FEATURE__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__TAGGED_VALUE = CorePackage.FEATURE__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__DOCUMENT = CorePackage.FEATURE__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__DESCRIPTION = CorePackage.FEATURE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__RESPONSIBLE_PARTY = CorePackage.FEATURE__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__ELEMENT_NODE = CorePackage.FEATURE__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__SET = CorePackage.FEATURE__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__RENDERED_OBJECT = CorePackage.FEATURE__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__VOCABULARY_ELEMENT = CorePackage.FEATURE__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__MEASUREMENT = CorePackage.FEATURE__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__CHANGE_REQUEST = CorePackage.FEATURE__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__DASDL_PROPERTY = CorePackage.FEATURE__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Owner Scope</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__OWNER_SCOPE = CorePackage.FEATURE__OWNER_SCOPE;

    /**
     * The feature id for the '<em><b>Owner</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__OWNER = CorePackage.FEATURE__OWNER;

    /**
     * The feature id for the '<em><b>Feature Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__FEATURE_NODE = CorePackage.FEATURE__FEATURE_NODE;

    /**
     * The feature id for the '<em><b>Feature Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__FEATURE_MAP = CorePackage.FEATURE__FEATURE_MAP;

    /**
     * The feature id for the '<em><b>Cf Map</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE__CF_MAP = CorePackage.FEATURE__CF_MAP;

    /**
     * The number of structural features of the '<em>Physical Access Override</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYSICAL_ACCESS_OVERRIDE_FEATURE_COUNT = CorePackage.FEATURE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link orgomg.cwmx.resource.dmsii.impl.DASDLPropertyImpl <em>DASDL Property</em>}' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see orgomg.cwmx.resource.dmsii.impl.DASDLPropertyImpl
     * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDASDLProperty()
     * @generated
     */
    int DASDL_PROPERTY = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__NAME = CorePackage.MODEL_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__VISIBILITY = CorePackage.MODEL_ELEMENT__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__CLIENT_DEPENDENCY = CorePackage.MODEL_ELEMENT__CLIENT_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Supplier Dependency</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__SUPPLIER_DEPENDENCY = CorePackage.MODEL_ELEMENT__SUPPLIER_DEPENDENCY;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__CONSTRAINT = CorePackage.MODEL_ELEMENT__CONSTRAINT;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__NAMESPACE = CorePackage.MODEL_ELEMENT__NAMESPACE;

    /**
     * The feature id for the '<em><b>Importer</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__IMPORTER = CorePackage.MODEL_ELEMENT__IMPORTER;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__STEREOTYPE = CorePackage.MODEL_ELEMENT__STEREOTYPE;

    /**
     * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__TAGGED_VALUE = CorePackage.MODEL_ELEMENT__TAGGED_VALUE;

    /**
     * The feature id for the '<em><b>Document</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__DOCUMENT = CorePackage.MODEL_ELEMENT__DOCUMENT;

    /**
     * The feature id for the '<em><b>Description</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__DESCRIPTION = CorePackage.MODEL_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Responsible Party</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__RESPONSIBLE_PARTY = CorePackage.MODEL_ELEMENT__RESPONSIBLE_PARTY;

    /**
     * The feature id for the '<em><b>Element Node</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__ELEMENT_NODE = CorePackage.MODEL_ELEMENT__ELEMENT_NODE;

    /**
     * The feature id for the '<em><b>Set</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__SET = CorePackage.MODEL_ELEMENT__SET;

    /**
     * The feature id for the '<em><b>Rendered Object</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__RENDERED_OBJECT = CorePackage.MODEL_ELEMENT__RENDERED_OBJECT;

    /**
     * The feature id for the '<em><b>Vocabulary Element</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__VOCABULARY_ELEMENT = CorePackage.MODEL_ELEMENT__VOCABULARY_ELEMENT;

    /**
     * The feature id for the '<em><b>Measurement</b></em>' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__MEASUREMENT = CorePackage.MODEL_ELEMENT__MEASUREMENT;

    /**
     * The feature id for the '<em><b>Change Request</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__CHANGE_REQUEST = CorePackage.MODEL_ELEMENT__CHANGE_REQUEST;

    /**
     * The feature id for the '<em><b>Dasdl Property</b></em>' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__DASDL_PROPERTY = CorePackage.MODEL_ELEMENT__DASDL_PROPERTY;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__TEXT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owner</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY__OWNER = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>DASDL Property</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DASDL_PROPERTY_FEATURE_COUNT = CorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.Database <em>Database</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Database</em>'.
     * @see orgomg.cwmx.resource.dmsii.Database
     * @generated
     */
    EClass getDatabase();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Database#isIsLogical <em>Is Logical</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Logical</em>'.
     * @see orgomg.cwmx.resource.dmsii.Database#isIsLogical()
     * @see #getDatabase()
     * @generated
     */
    EAttribute getDatabase_IsLogical();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Database#getGuardFile <em>Guard File</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Guard File</em>'.
     * @see orgomg.cwmx.resource.dmsii.Database#getGuardFile()
     * @see #getDatabase()
     * @generated
     */
    EAttribute getDatabase_GuardFile();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Database#getSource <em>Source</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see orgomg.cwmx.resource.dmsii.Database#getSource()
     * @see #getDatabase()
     * @generated
     */
    EAttribute getDatabase_Source();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.Remap <em>Remap</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Remap</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap
     * @generated
     */
    EClass getRemap();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Remap#isIsRequiredAll <em>Is Required All</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required All</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap#isIsRequiredAll()
     * @see #getRemap()
     * @generated
     */
    EAttribute getRemap_IsRequiredAll();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.Remap#isIsReadOnlyAll
     * <em>Is Read Only All</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Read Only All</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap#isIsReadOnlyAll()
     * @see #getRemap()
     * @generated
     */
    EAttribute getRemap_IsReadOnlyAll();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.Remap#isIsGivingException
     * <em>Is Giving Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Giving Exception</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap#isIsGivingException()
     * @see #getRemap()
     * @generated
     */
    EAttribute getRemap_IsGivingException();

    /**
     * Returns the meta object for the containment reference '
     * {@link orgomg.cwmx.resource.dmsii.Remap#getSelectCondition
     * <em>Select Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the containment reference '
     *         <em>Select Condition</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap#getSelectCondition()
     * @see #getRemap()
     * @generated
     */
    EReference getRemap_SelectCondition();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.dmsii.Remap#getStructure <em>Structure</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Structure</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remap#getStructure()
     * @see #getRemap()
     * @generated
     */
    EReference getRemap_Structure();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.DataSet <em>Data Set</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Data Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet
     * @generated
     */
    EClass getDataSet();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataSet#isIsGlobal <em>Is Global</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Global</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet#isIsGlobal()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_IsGlobal();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataSet#getOrganization <em>Organization</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Organization</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet#getOrganization()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_Organization();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataSet#getReorganize <em>Reorganize</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reorganize</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet#getReorganize()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_Reorganize();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataSet#isIsRequiredAll <em>Is Required All</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required All</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet#isIsRequiredAll()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_IsRequiredAll();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet
     * <em>Partitioning Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Partitioning Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataSet#getPartitioningSet()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_PartitioningSet();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.DataItem <em>Data Item</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Data Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem
     * @generated
     */
    EClass getDataItem();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.dmsii.DataItem#getNullValue <em>Null Value</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Null Value</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getNullValue()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_NullValue();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsRequired <em>Is Required</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsRequired()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsRequired();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getSize <em>Size</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getSize()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_Size();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#getScaleFactor <em>Scale Factor</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scale Factor</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getScaleFactor()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_ScaleFactor();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsSigned <em>Is Signed</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Signed</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsSigned()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsSigned();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#getOccurs <em>Occurs</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurs</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getOccurs()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_Occurs();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsVirtual <em>Is Virtual</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Virtual</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsVirtual()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsVirtual();

    /**
     * Returns the meta object for the containment reference '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getVirtualExpression
     * <em>Virtual Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the containment reference '
     *         <em>Virtual Expression</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getVirtualExpression()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_VirtualExpression();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsKanji <em>Is Kanji</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Kanji</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsKanji()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsKanji();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#getCcsVersion <em>Ccs Version</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ccs Version</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getCcsVersion()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_CcsVersion();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosLiteral
     * <em>Is Gemcos Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Gemcos Literal</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosLiteral()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsGemcosLiteral();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosData <em>Is Gemcos Data</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Gemcos Data</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosData()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsGemcosData();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosSSN <em>Is Gemcos SSN</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Gemcos SSN</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosSSN()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsGemcosSSN();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosDBSN <em>Is Gemcos DBSN</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Gemcos DBSN</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosDBSN()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsGemcosDBSN();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsProgram <em>Is Coms Program</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Coms Program</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsComsProgram()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsComsProgram();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsID <em>Is Coms ID</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Coms ID</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsComsID()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsComsID();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsLocator <em>Is Coms Locator</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Coms Locator</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsComsLocator()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsComsLocator();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsOutpQ <em>Is Coms Outp Q</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Coms Outp Q</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#isIsComsOutpQ()
     * @see #getDataItem()
     * @generated
     */
    EAttribute getDataItem_IsComsOutpQ();

    /**
     * Returns the meta object for the reference list '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getOccuringDataItem
     * <em>Occuring Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference list '
     *         <em>Occuring Data Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getOccuringDataItem()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_OccuringDataItem();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem
     * <em>Occurs Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Occurs Data Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_OccursDataItem();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.dmsii.DataItem#getKeyDataSet <em>Key Data Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Key Data Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getKeyDataSet()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_KeyDataSet();

    /**
     * Returns the meta object for the containment reference list '{@link orgomg.cwmx.resource.dmsii.DataItem#getFieldBit <em>Field Bit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Field Bit</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getFieldBit()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_FieldBit();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.dmsii.DataItem#getStructure <em>Structure</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Structure</em>'.
     * @see orgomg.cwmx.resource.dmsii.DataItem#getStructure()
     * @see #getDataItem()
     * @generated
     */
    EReference getDataItem_Structure();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.VariableFormatPart <em>Variable Format Part</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Variable Format Part</em>'.
     * @see orgomg.cwmx.resource.dmsii.VariableFormatPart
     * @generated
     */
    EClass getVariableFormatPart();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getVfLabel <em>Vf Label</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vf Label</em>'.
     * @see orgomg.cwmx.resource.dmsii.VariableFormatPart#getVfLabel()
     * @see #getVariableFormatPart()
     * @generated
     */
    EAttribute getVariableFormatPart_VfLabel();

    /**
     * Returns the meta object for the containment reference '
     * {@link orgomg.cwmx.resource.dmsii.VariableFormatPart#getSelectCondition
     * <em>Select Condition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the containment reference '
     *         <em>Select Condition</em>'.
     * @see orgomg.cwmx.resource.dmsii.VariableFormatPart#getSelectCondition()
     * @see #getVariableFormatPart()
     * @generated
     */
    EReference getVariableFormatPart_SelectCondition();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.SetStructure <em>Set Structure</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Structure</em>'.
     * @see orgomg.cwmx.resource.dmsii.SetStructure
     * @generated
     */
    EClass getSetStructure();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.SetStructure#getDuplicates <em>Duplicates</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Duplicates</em>'.
     * @see orgomg.cwmx.resource.dmsii.SetStructure#getDuplicates()
     * @see #getSetStructure()
     * @generated
     */
    EAttribute getSetStructure_Duplicates();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.Set <em>Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set
     * @generated
     */
    EClass getSet();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Set#getSetType <em>Set Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Set Type</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getSetType()
     * @see #getSet()
     * @generated
     */
    EAttribute getSet_SetType();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.Set#getReorganize <em>Reorganize</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reorganize</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getReorganize()
     * @see #getSet()
     * @generated
     */
    EAttribute getSet_Reorganize();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.dmsii.Set#getKeyDataItem <em>Key Data Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Key Data Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getKeyDataItem()
     * @see #getSet()
     * @generated
     */
    EReference getSet_KeyDataItem();

    /**
     * Returns the meta object for the reference list '{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedSet <em>Partitioned Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Partitioned Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitionedSet()
     * @see #getSet()
     * @generated
     */
    EReference getSet_PartitionedSet();

    /**
     * Returns the meta object for the reference '
     * {@link orgomg.cwmx.resource.dmsii.Set#getPartitioningSet
     * <em>Partitioning Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the reference '<em>Partitioning Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitioningSet()
     * @see #getSet()
     * @generated
     */
    EReference getSet_PartitioningSet();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet <em>Partitioned Data Set</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for the reference '<em>Partitioned Data Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.Set#getPartitionedDataSet()
     * @see #getSet()
     * @generated
     */
    EReference getSet_PartitionedDataSet();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.Access <em>Access</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Access</em>'.
     * @see orgomg.cwmx.resource.dmsii.Access
     * @generated
     */
    EClass getAccess();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.Subset <em>Subset</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Subset</em>'.
     * @see orgomg.cwmx.resource.dmsii.Subset
     * @generated
     */
    EClass getSubset();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.AutomaticSubset
     * <em>Automatic Subset</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Automatic Subset</em>'.
     * @see orgomg.cwmx.resource.dmsii.AutomaticSubset
     * @generated
     */
    EClass getAutomaticSubset();

    /**
     * Returns the meta object for the containment reference '{@link orgomg.cwmx.resource.dmsii.AutomaticSubset#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see orgomg.cwmx.resource.dmsii.AutomaticSubset#getCondition()
     * @see #getAutomaticSubset()
     * @generated
     */
    EReference getAutomaticSubset_Condition();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.KeyItem <em>Key Item</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Key Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.KeyItem
     * @generated
     */
    EClass getKeyItem();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.KeyItem#getCollation <em>Collation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation</em>'.
     * @see orgomg.cwmx.resource.dmsii.KeyItem#getCollation()
     * @see #getKeyItem()
     * @generated
     */
    EAttribute getKeyItem_Collation();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.RemapItem <em>Remap Item</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Remap Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem
     * @generated
     */
    EClass getRemapItem();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.RemapItem#getOccurs <em>Occurs</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Occurs</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#getOccurs()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_Occurs();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsRequired <em>Is Required</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Required</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#isIsRequired()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_IsRequired();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsHidden <em>Is Hidden</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Hidden</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#isIsHidden()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_IsHidden();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsReadOnly <em>Is Read Only</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Read Only</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#isIsReadOnly()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_IsReadOnly();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.RemapItem#isIsGivingException
     * <em>Is Giving Exception</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the attribute '<em>Is Giving Exception</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#isIsGivingException()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_IsGivingException();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.RemapItem#isIsVirtual <em>Is Virtual</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Virtual</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#isIsVirtual()
     * @see #getRemapItem()
     * @generated
     */
    EAttribute getRemapItem_IsVirtual();

    /**
     * Returns the meta object for the containment reference '
     * {@link orgomg.cwmx.resource.dmsii.RemapItem#getVirtualExpression
     * <em>Virtual Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for the containment reference '
     *         <em>Virtual Expression</em>'.
     * @see orgomg.cwmx.resource.dmsii.RemapItem#getVirtualExpression()
     * @see #getRemapItem()
     * @generated
     */
    EReference getRemapItem_VirtualExpression();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.FieldBit <em>Field Bit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Field Bit</em>'.
     * @see orgomg.cwmx.resource.dmsii.FieldBit
     * @generated
     */
    EClass getFieldBit();

    /**
     * Returns the meta object for the container reference '{@link orgomg.cwmx.resource.dmsii.FieldBit#getDataItem <em>Data Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Data Item</em>'.
     * @see orgomg.cwmx.resource.dmsii.FieldBit#getDataItem()
     * @see #getFieldBit()
     * @generated
     */
    EReference getFieldBit_DataItem();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.Remark <em>Remark</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Remark</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remark
     * @generated
     */
    EClass getRemark();

    /**
     * Returns the meta object for the attribute '
     * {@link orgomg.cwmx.resource.dmsii.Remark#getText <em>Text</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see orgomg.cwmx.resource.dmsii.Remark#getText()
     * @see #getRemark()
     * @generated
     */
    EAttribute getRemark_Text();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.PhysicalDatabase
     * <em>Physical Database</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Physical Database</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalDatabase
     * @generated
     */
    EClass getPhysicalDatabase();

    /**
     * Returns the meta object for class '
     * {@link orgomg.cwmx.resource.dmsii.PhysicalDataSet
     * <em>Physical Data Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for class '<em>Physical Data Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalDataSet
     * @generated
     */
    EClass getPhysicalDataSet();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.DASDLComment <em>DASDL Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>DASDL Comment</em>'.
     * @see orgomg.cwmx.resource.dmsii.DASDLComment
     * @generated
     */
    EClass getDASDLComment();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.PhysicalSet <em>Physical Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Physical Set</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalSet
     * @generated
     */
    EClass getPhysicalSet();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.PhysicalDataSetOverride <em>Physical Data Set Override</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Physical Data Set Override</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalDataSetOverride
     * @generated
     */
    EClass getPhysicalDataSetOverride();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.PhysicalSetOverride <em>Physical Set Override</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Physical Set Override</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalSetOverride
     * @generated
     */
    EClass getPhysicalSetOverride();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.PhysicalAccessOverride <em>Physical Access Override</em>}'.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the meta object for class '<em>Physical Access Override</em>'.
     * @see orgomg.cwmx.resource.dmsii.PhysicalAccessOverride
     * @generated
     */
    EClass getPhysicalAccessOverride();

    /**
     * Returns the meta object for class '{@link orgomg.cwmx.resource.dmsii.DASDLProperty <em>DASDL Property</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>DASDL Property</em>'.
     * @see orgomg.cwmx.resource.dmsii.DASDLProperty
     * @generated
     */
    EClass getDASDLProperty();

    /**
     * Returns the meta object for the attribute '{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getText <em>Text</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see orgomg.cwmx.resource.dmsii.DASDLProperty#getText()
     * @see #getDASDLProperty()
     * @generated
     */
    EAttribute getDASDLProperty_Text();

    /**
     * Returns the meta object for the reference '{@link orgomg.cwmx.resource.dmsii.DASDLProperty#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owner</em>'.
     * @see orgomg.cwmx.resource.dmsii.DASDLProperty#getOwner()
     * @see #getDASDLProperty()
     * @generated
     */
    EReference getDASDLProperty_Owner();

    /**
     * Returns the factory that creates the instances of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DmsiiFactory getDmsiiFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that
     * represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.dmsii.impl.DatabaseImpl
         * <em>Database</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.dmsii.impl.DatabaseImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDatabase()
         * @generated
         */
        EClass DATABASE = eINSTANCE.getDatabase();

        /**
         * The meta object literal for the '<em><b>Is Logical</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE__IS_LOGICAL = eINSTANCE.getDatabase_IsLogical();

        /**
         * The meta object literal for the '<em><b>Guard File</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE__GUARD_FILE = eINSTANCE.getDatabase_GuardFile();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATABASE__SOURCE = eINSTANCE.getDatabase_Source();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.RemapImpl <em>Remap</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.RemapImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemap()
         * @generated
         */
        EClass REMAP = eINSTANCE.getRemap();

        /**
         * The meta object literal for the '<em><b>Is Required All</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP__IS_REQUIRED_ALL = eINSTANCE.getRemap_IsRequiredAll();

        /**
         * The meta object literal for the '<em><b>Is Read Only All</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP__IS_READ_ONLY_ALL = eINSTANCE.getRemap_IsReadOnlyAll();

        /**
         * The meta object literal for the '<em><b>Is Giving Exception</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP__IS_GIVING_EXCEPTION = eINSTANCE.getRemap_IsGivingException();

        /**
         * The meta object literal for the '<em><b>Select Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference REMAP__SELECT_CONDITION = eINSTANCE.getRemap_SelectCondition();

        /**
         * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference REMAP__STRUCTURE = eINSTANCE.getRemap_Structure();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.DataSetImpl <em>Data Set</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.DataSetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDataSet()
         * @generated
         */
        EClass DATA_SET = eINSTANCE.getDataSet();

        /**
         * The meta object literal for the '<em><b>Is Global</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__IS_GLOBAL = eINSTANCE.getDataSet_IsGlobal();

        /**
         * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__ORGANIZATION = eINSTANCE.getDataSet_Organization();

        /**
         * The meta object literal for the '<em><b>Reorganize</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__REORGANIZE = eINSTANCE.getDataSet_Reorganize();

        /**
         * The meta object literal for the '<em><b>Is Required All</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_SET__IS_REQUIRED_ALL = eINSTANCE.getDataSet_IsRequiredAll();

        /**
         * The meta object literal for the '<em><b>Partitioning Set</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_SET__PARTITIONING_SET = eINSTANCE.getDataSet_PartitioningSet();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl
         * <em>Data Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.dmsii.impl.DataItemImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDataItem()
         * @generated
         */
        EClass DATA_ITEM = eINSTANCE.getDataItem();

        /**
         * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__NULL_VALUE = eINSTANCE.getDataItem_NullValue();

        /**
         * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_REQUIRED = eINSTANCE.getDataItem_IsRequired();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__SIZE = eINSTANCE.getDataItem_Size();

        /**
         * The meta object literal for the '<em><b>Scale Factor</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__SCALE_FACTOR = eINSTANCE.getDataItem_ScaleFactor();

        /**
         * The meta object literal for the '<em><b>Is Signed</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_SIGNED = eINSTANCE.getDataItem_IsSigned();

        /**
         * The meta object literal for the '<em><b>Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__OCCURS = eINSTANCE.getDataItem_Occurs();

        /**
         * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_VIRTUAL = eINSTANCE.getDataItem_IsVirtual();

        /**
         * The meta object literal for the '<em><b>Virtual Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__VIRTUAL_EXPRESSION = eINSTANCE.getDataItem_VirtualExpression();

        /**
         * The meta object literal for the '<em><b>Is Kanji</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_KANJI = eINSTANCE.getDataItem_IsKanji();

        /**
         * The meta object literal for the '<em><b>Ccs Version</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__CCS_VERSION = eINSTANCE.getDataItem_CcsVersion();

        /**
         * The meta object literal for the '<em><b>Is Gemcos Literal</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_GEMCOS_LITERAL = eINSTANCE.getDataItem_IsGemcosLiteral();

        /**
         * The meta object literal for the '<em><b>Is Gemcos Data</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_GEMCOS_DATA = eINSTANCE.getDataItem_IsGemcosData();

        /**
         * The meta object literal for the '<em><b>Is Gemcos SSN</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_GEMCOS_SSN = eINSTANCE.getDataItem_IsGemcosSSN();

        /**
         * The meta object literal for the '<em><b>Is Gemcos DBSN</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_GEMCOS_DBSN = eINSTANCE.getDataItem_IsGemcosDBSN();

        /**
         * The meta object literal for the '<em><b>Is Coms Program</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_COMS_PROGRAM = eINSTANCE.getDataItem_IsComsProgram();

        /**
         * The meta object literal for the '<em><b>Is Coms ID</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_COMS_ID = eINSTANCE.getDataItem_IsComsID();

        /**
         * The meta object literal for the '<em><b>Is Coms Locator</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_COMS_LOCATOR = eINSTANCE.getDataItem_IsComsLocator();

        /**
         * The meta object literal for the '<em><b>Is Coms Outp Q</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_ITEM__IS_COMS_OUTP_Q = eINSTANCE.getDataItem_IsComsOutpQ();

        /**
         * The meta object literal for the '<em><b>Occuring Data Item</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__OCCURING_DATA_ITEM = eINSTANCE.getDataItem_OccuringDataItem();

        /**
         * The meta object literal for the '<em><b>Occurs Data Item</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__OCCURS_DATA_ITEM = eINSTANCE.getDataItem_OccursDataItem();

        /**
         * The meta object literal for the '<em><b>Key Data Set</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__KEY_DATA_SET = eINSTANCE.getDataItem_KeyDataSet();

        /**
         * The meta object literal for the '<em><b>Field Bit</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__FIELD_BIT = eINSTANCE.getDataItem_FieldBit();

        /**
         * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_ITEM__STRUCTURE = eINSTANCE.getDataItem_Structure();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl <em>Variable Format Part</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.VariableFormatPartImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getVariableFormatPart()
         * @generated
         */
        EClass VARIABLE_FORMAT_PART = eINSTANCE.getVariableFormatPart();

        /**
         * The meta object literal for the '<em><b>Vf Label</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute VARIABLE_FORMAT_PART__VF_LABEL = eINSTANCE.getVariableFormatPart_VfLabel();

        /**
         * The meta object literal for the '<em><b>Select Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference VARIABLE_FORMAT_PART__SELECT_CONDITION = eINSTANCE.getVariableFormatPart_SelectCondition();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.SetStructureImpl <em>Set Structure</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.SetStructureImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSetStructure()
         * @generated
         */
        EClass SET_STRUCTURE = eINSTANCE.getSetStructure();

        /**
         * The meta object literal for the '<em><b>Duplicates</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET_STRUCTURE__DUPLICATES = eINSTANCE.getSetStructure_Duplicates();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.SetImpl <em>Set</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.SetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSet()
         * @generated
         */
        EClass SET = eINSTANCE.getSet();

        /**
         * The meta object literal for the '<em><b>Set Type</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET__SET_TYPE = eINSTANCE.getSet_SetType();

        /**
         * The meta object literal for the '<em><b>Reorganize</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute SET__REORGANIZE = eINSTANCE.getSet_Reorganize();

        /**
         * The meta object literal for the '<em><b>Key Data Item</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SET__KEY_DATA_ITEM = eINSTANCE.getSet_KeyDataItem();

        /**
         * The meta object literal for the '<em><b>Partitioned Set</b></em>' reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SET__PARTITIONED_SET = eINSTANCE.getSet_PartitionedSet();

        /**
         * The meta object literal for the '<em><b>Partitioning Set</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SET__PARTITIONING_SET = eINSTANCE.getSet_PartitioningSet();

        /**
         * The meta object literal for the '<em><b>Partitioned Data Set</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference SET__PARTITIONED_DATA_SET = eINSTANCE.getSet_PartitionedDataSet();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.AccessImpl <em>Access</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.AccessImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getAccess()
         * @generated
         */
        EClass ACCESS = eINSTANCE.getAccess();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.SubsetImpl <em>Subset</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.SubsetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getSubset()
         * @generated
         */
        EClass SUBSET = eINSTANCE.getSubset();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.AutomaticSubsetImpl <em>Automatic Subset</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.AutomaticSubsetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getAutomaticSubset()
         * @generated
         */
        EClass AUTOMATIC_SUBSET = eINSTANCE.getAutomaticSubset();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference AUTOMATIC_SUBSET__CONDITION = eINSTANCE.getAutomaticSubset_Condition();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.KeyItemImpl <em>Key Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.KeyItemImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getKeyItem()
         * @generated
         */
        EClass KEY_ITEM = eINSTANCE.getKeyItem();

        /**
         * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute KEY_ITEM__COLLATION = eINSTANCE.getKeyItem_Collation();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.RemapItemImpl <em>Remap Item</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.RemapItemImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemapItem()
         * @generated
         */
        EClass REMAP_ITEM = eINSTANCE.getRemapItem();

        /**
         * The meta object literal for the '<em><b>Occurs</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__OCCURS = eINSTANCE.getRemapItem_Occurs();

        /**
         * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__IS_REQUIRED = eINSTANCE.getRemapItem_IsRequired();

        /**
         * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__IS_HIDDEN = eINSTANCE.getRemapItem_IsHidden();

        /**
         * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__IS_READ_ONLY = eINSTANCE.getRemapItem_IsReadOnly();

        /**
         * The meta object literal for the '<em><b>Is Giving Exception</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__IS_GIVING_EXCEPTION = eINSTANCE.getRemapItem_IsGivingException();

        /**
         * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMAP_ITEM__IS_VIRTUAL = eINSTANCE.getRemapItem_IsVirtual();

        /**
         * The meta object literal for the '<em><b>Virtual Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference REMAP_ITEM__VIRTUAL_EXPRESSION = eINSTANCE.getRemapItem_VirtualExpression();

        /**
         * The meta object literal for the '
         * {@link orgomg.cwmx.resource.dmsii.impl.FieldBitImpl
         * <em>Field Bit</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see orgomg.cwmx.resource.dmsii.impl.FieldBitImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getFieldBit()
         * @generated
         */
        EClass FIELD_BIT = eINSTANCE.getFieldBit();

        /**
         * The meta object literal for the '<em><b>Data Item</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD_BIT__DATA_ITEM = eINSTANCE.getFieldBit_DataItem();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.RemarkImpl <em>Remark</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.RemarkImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getRemark()
         * @generated
         */
        EClass REMARK = eINSTANCE.getRemark();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute REMARK__TEXT = eINSTANCE.getRemark_Text();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDatabaseImpl <em>Physical Database</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDatabaseImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDatabase()
         * @generated
         */
        EClass PHYSICAL_DATABASE = eINSTANCE.getPhysicalDatabase();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetImpl <em>Physical Data Set</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDataSet()
         * @generated
         */
        EClass PHYSICAL_DATA_SET = eINSTANCE.getPhysicalDataSet();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.DASDLCommentImpl <em>DASDL Comment</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.DASDLCommentImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDASDLComment()
         * @generated
         */
        EClass DASDL_COMMENT = eINSTANCE.getDASDLComment();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalSetImpl <em>Physical Set</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalSetImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalSet()
         * @generated
         */
        EClass PHYSICAL_SET = eINSTANCE.getPhysicalSet();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetOverrideImpl <em>Physical Data Set Override</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalDataSetOverrideImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalDataSetOverride()
         * @generated
         */
        EClass PHYSICAL_DATA_SET_OVERRIDE = eINSTANCE.getPhysicalDataSetOverride();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalSetOverrideImpl <em>Physical Set Override</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalSetOverrideImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalSetOverride()
         * @generated
         */
        EClass PHYSICAL_SET_OVERRIDE = eINSTANCE.getPhysicalSetOverride();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.PhysicalAccessOverrideImpl <em>Physical Access Override</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.PhysicalAccessOverrideImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getPhysicalAccessOverride()
         * @generated
         */
        EClass PHYSICAL_ACCESS_OVERRIDE = eINSTANCE.getPhysicalAccessOverride();

        /**
         * The meta object literal for the '{@link orgomg.cwmx.resource.dmsii.impl.DASDLPropertyImpl <em>DASDL Property</em>}' class.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @see orgomg.cwmx.resource.dmsii.impl.DASDLPropertyImpl
         * @see orgomg.cwmx.resource.dmsii.impl.DmsiiPackageImpl#getDASDLProperty()
         * @generated
         */
        EClass DASDL_PROPERTY = eINSTANCE.getDASDLProperty();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EAttribute DASDL_PROPERTY__TEXT = eINSTANCE.getDASDLProperty_Text();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference DASDL_PROPERTY__OWNER = eINSTANCE.getDASDLProperty_Owner();

    }

} // DmsiiPackage

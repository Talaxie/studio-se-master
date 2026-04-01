/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.foundation.businessinformation.Description;
import orgomg.cwm.foundation.keysindexes.IndexedFeature;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.Field;
import orgomg.cwm.resource.record.RecordDef;
import orgomg.cwmx.resource.dmsii.*;
import orgomg.cwmx.resource.dmsii.Access;
import orgomg.cwmx.resource.dmsii.AutomaticSubset;
import orgomg.cwmx.resource.dmsii.DASDLComment;
import orgomg.cwmx.resource.dmsii.DASDLProperty;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DataSet;
import orgomg.cwmx.resource.dmsii.Database;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage
 * @generated
 */
public class DmsiiSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static DmsiiPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public DmsiiSwitch() {
        if (modelPackage == null) {
            modelPackage = DmsiiPackage.eINSTANCE;
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
        case DmsiiPackage.DATABASE: {
            Database database = (Database) theEObject;
            T result = caseDatabase(database);
            if (result == null)
                result = caseStructuralFeature(database);
            if (result == null)
                result = casePackage(database);
            if (result == null)
                result = caseFeature(database);
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
        case DmsiiPackage.REMAP: {
            Remap remap = (Remap) theEObject;
            T result = caseRemap(remap);
            if (result == null)
                result = caseRecordDef(remap);
            if (result == null)
                result = caseClass(remap);
            if (result == null)
                result = caseClassifier(remap);
            if (result == null)
                result = caseNamespace(remap);
            if (result == null)
                result = caseModelElement(remap);
            if (result == null)
                result = caseElement(remap);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.DATA_SET: {
            DataSet dataSet = (DataSet) theEObject;
            T result = caseDataSet(dataSet);
            if (result == null)
                result = caseRecordDef(dataSet);
            if (result == null)
                result = caseClass(dataSet);
            if (result == null)
                result = caseClassifier(dataSet);
            if (result == null)
                result = caseNamespace(dataSet);
            if (result == null)
                result = caseModelElement(dataSet);
            if (result == null)
                result = caseElement(dataSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.DATA_ITEM: {
            DataItem dataItem = (DataItem) theEObject;
            T result = caseDataItem(dataItem);
            if (result == null)
                result = caseField(dataItem);
            if (result == null)
                result = caseAttribute(dataItem);
            if (result == null)
                result = caseStructuralFeature(dataItem);
            if (result == null)
                result = caseFeature(dataItem);
            if (result == null)
                result = caseModelElement(dataItem);
            if (result == null)
                result = caseElement(dataItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.VARIABLE_FORMAT_PART: {
            VariableFormatPart variableFormatPart = (VariableFormatPart) theEObject;
            T result = caseVariableFormatPart(variableFormatPart);
            if (result == null)
                result = caseRecordDef(variableFormatPart);
            if (result == null)
                result = caseClass(variableFormatPart);
            if (result == null)
                result = caseClassifier(variableFormatPart);
            if (result == null)
                result = caseNamespace(variableFormatPart);
            if (result == null)
                result = caseModelElement(variableFormatPart);
            if (result == null)
                result = caseElement(variableFormatPart);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.SET_STRUCTURE: {
            SetStructure setStructure = (SetStructure) theEObject;
            T result = caseSetStructure(setStructure);
            if (result == null)
                result = caseStructuralFeature(setStructure);
            if (result == null)
                result = caseFeature(setStructure);
            if (result == null)
                result = caseModelElement(setStructure);
            if (result == null)
                result = caseElement(setStructure);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.SET: {
            Set set = (Set) theEObject;
            T result = caseSet(set);
            if (result == null)
                result = caseSetStructure(set);
            if (result == null)
                result = caseStructuralFeature(set);
            if (result == null)
                result = caseFeature(set);
            if (result == null)
                result = caseModelElement(set);
            if (result == null)
                result = caseElement(set);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.ACCESS: {
            Access access = (Access) theEObject;
            T result = caseAccess(access);
            if (result == null)
                result = caseSetStructure(access);
            if (result == null)
                result = caseStructuralFeature(access);
            if (result == null)
                result = caseFeature(access);
            if (result == null)
                result = caseModelElement(access);
            if (result == null)
                result = caseElement(access);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.SUBSET: {
            Subset subset = (Subset) theEObject;
            T result = caseSubset(subset);
            if (result == null)
                result = caseSet(subset);
            if (result == null)
                result = caseSetStructure(subset);
            if (result == null)
                result = caseStructuralFeature(subset);
            if (result == null)
                result = caseFeature(subset);
            if (result == null)
                result = caseModelElement(subset);
            if (result == null)
                result = caseElement(subset);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.AUTOMATIC_SUBSET: {
            AutomaticSubset automaticSubset = (AutomaticSubset) theEObject;
            T result = caseAutomaticSubset(automaticSubset);
            if (result == null)
                result = caseSubset(automaticSubset);
            if (result == null)
                result = caseSet(automaticSubset);
            if (result == null)
                result = caseSetStructure(automaticSubset);
            if (result == null)
                result = caseStructuralFeature(automaticSubset);
            if (result == null)
                result = caseFeature(automaticSubset);
            if (result == null)
                result = caseModelElement(automaticSubset);
            if (result == null)
                result = caseElement(automaticSubset);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.KEY_ITEM: {
            KeyItem keyItem = (KeyItem) theEObject;
            T result = caseKeyItem(keyItem);
            if (result == null)
                result = caseIndexedFeature(keyItem);
            if (result == null)
                result = caseModelElement(keyItem);
            if (result == null)
                result = caseElement(keyItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.REMAP_ITEM: {
            RemapItem remapItem = (RemapItem) theEObject;
            T result = caseRemapItem(remapItem);
            if (result == null)
                result = caseField(remapItem);
            if (result == null)
                result = caseAttribute(remapItem);
            if (result == null)
                result = caseStructuralFeature(remapItem);
            if (result == null)
                result = caseFeature(remapItem);
            if (result == null)
                result = caseModelElement(remapItem);
            if (result == null)
                result = caseElement(remapItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.FIELD_BIT: {
            FieldBit fieldBit = (FieldBit) theEObject;
            T result = caseFieldBit(fieldBit);
            if (result == null)
                result = caseModelElement(fieldBit);
            if (result == null)
                result = caseElement(fieldBit);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.REMARK: {
            Remark remark = (Remark) theEObject;
            T result = caseRemark(remark);
            if (result == null)
                result = caseStructuralFeature(remark);
            if (result == null)
                result = caseFeature(remark);
            if (result == null)
                result = caseModelElement(remark);
            if (result == null)
                result = caseElement(remark);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_DATABASE: {
            PhysicalDatabase physicalDatabase = (PhysicalDatabase) theEObject;
            T result = casePhysicalDatabase(physicalDatabase);
            if (result == null)
                result = casePackage(physicalDatabase);
            if (result == null)
                result = caseNamespace(physicalDatabase);
            if (result == null)
                result = caseModelElement(physicalDatabase);
            if (result == null)
                result = caseElement(physicalDatabase);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_DATA_SET: {
            PhysicalDataSet physicalDataSet = (PhysicalDataSet) theEObject;
            T result = casePhysicalDataSet(physicalDataSet);
            if (result == null)
                result = caseModelElement(physicalDataSet);
            if (result == null)
                result = caseElement(physicalDataSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.DASDL_COMMENT: {
            DASDLComment dasdlComment = (DASDLComment) theEObject;
            T result = caseDASDLComment(dasdlComment);
            if (result == null)
                result = caseDescription(dasdlComment);
            if (result == null)
                result = caseNamespace(dasdlComment);
            if (result == null)
                result = caseModelElement(dasdlComment);
            if (result == null)
                result = caseElement(dasdlComment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_SET: {
            PhysicalSet physicalSet = (PhysicalSet) theEObject;
            T result = casePhysicalSet(physicalSet);
            if (result == null)
                result = caseModelElement(physicalSet);
            if (result == null)
                result = caseElement(physicalSet);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_DATA_SET_OVERRIDE: {
            PhysicalDataSetOverride physicalDataSetOverride = (PhysicalDataSetOverride) theEObject;
            T result = casePhysicalDataSetOverride(physicalDataSetOverride);
            if (result == null)
                result = caseFeature(physicalDataSetOverride);
            if (result == null)
                result = caseModelElement(physicalDataSetOverride);
            if (result == null)
                result = caseElement(physicalDataSetOverride);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_SET_OVERRIDE: {
            PhysicalSetOverride physicalSetOverride = (PhysicalSetOverride) theEObject;
            T result = casePhysicalSetOverride(physicalSetOverride);
            if (result == null)
                result = caseFeature(physicalSetOverride);
            if (result == null)
                result = caseModelElement(physicalSetOverride);
            if (result == null)
                result = caseElement(physicalSetOverride);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.PHYSICAL_ACCESS_OVERRIDE: {
            PhysicalAccessOverride physicalAccessOverride = (PhysicalAccessOverride) theEObject;
            T result = casePhysicalAccessOverride(physicalAccessOverride);
            if (result == null)
                result = caseFeature(physicalAccessOverride);
            if (result == null)
                result = caseModelElement(physicalAccessOverride);
            if (result == null)
                result = caseElement(physicalAccessOverride);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmsiiPackage.DASDL_PROPERTY: {
            DASDLProperty dasdlProperty = (DASDLProperty) theEObject;
            T result = caseDASDLProperty(dasdlProperty);
            if (result == null)
                result = caseModelElement(dasdlProperty);
            if (result == null)
                result = caseElement(dasdlProperty);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
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
     * Returns the result of interpreting the object as an instance of '<em>Remap</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remap</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemap(Remap object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSet(DataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Item</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataItem(DataItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable Format Part</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Format Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableFormatPart(VariableFormatPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Structure</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Structure</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetStructure(SetStructure object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Set</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSet(Set object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccess(Access object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subset</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubset(Subset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Automatic Subset</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Automatic Subset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAutomaticSubset(AutomaticSubset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Key Item</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKeyItem(KeyItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remap Item</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remap Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemapItem(RemapItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field Bit</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field Bit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFieldBit(FieldBit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Remark</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Remark</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRemark(Remark object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Database</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Database</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalDatabase(PhysicalDatabase object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Data Set</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalDataSet(PhysicalDataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DASDL Comment</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DASDL Comment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDASDLComment(DASDLComment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Set</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalSet(PhysicalSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Data Set Override</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Data Set Override</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalDataSetOverride(PhysicalDataSetOverride object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Set Override</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Set Override</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalSetOverride(PhysicalSetOverride object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Physical Access Override</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Physical Access Override</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysicalAccessOverride(PhysicalAccessOverride object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DASDL Property</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DASDL Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDASDLProperty(DASDLProperty object) {
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
     * Returns the result of interpreting the object as an instance of '
     * <em>Def</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Def</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordDef(RecordDef object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseField(Field object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indexed Feature</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indexed Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndexedFeature(IndexedFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Description</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDescription(Description object) {
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

} // DmsiiSwitch

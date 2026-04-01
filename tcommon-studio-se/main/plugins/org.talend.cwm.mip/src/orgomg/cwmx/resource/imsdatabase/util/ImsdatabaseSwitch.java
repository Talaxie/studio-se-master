/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.FixedOffsetField;
import orgomg.cwm.resource.record.RecordDef;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwmx.resource.imsdatabase.*;
import orgomg.cwmx.resource.imsdatabase.ACBLIB;
import orgomg.cwmx.resource.imsdatabase.AccessMethod;
import orgomg.cwmx.resource.imsdatabase.DBD;
import orgomg.cwmx.resource.imsdatabase.DBDLib;
import orgomg.cwmx.resource.imsdatabase.DEDB;
import orgomg.cwmx.resource.imsdatabase.Dataset;
import orgomg.cwmx.resource.imsdatabase.Exit;
import orgomg.cwmx.resource.imsdatabase.Field;
import orgomg.cwmx.resource.imsdatabase.HDAM;
import orgomg.cwmx.resource.imsdatabase.HIDAM;
import orgomg.cwmx.resource.imsdatabase.INDEX;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.cwmx.resource.imsdatabase.LCHILD;
import orgomg.cwmx.resource.imsdatabase.MSDB;
import orgomg.cwmx.resource.imsdatabase.PCB;
import orgomg.cwmx.resource.imsdatabase.PSB;
import orgomg.cwmx.resource.imsdatabase.PSBLib;
import orgomg.cwmx.resource.imsdatabase.SecondaryIndex;
import orgomg.cwmx.resource.imsdatabase.Segment;
import orgomg.cwmx.resource.imsdatabase.SegmentComplex;
import orgomg.cwmx.resource.imsdatabase.SegmentLogical;
import orgomg.cwmx.resource.imsdatabase.SenField;
import orgomg.cwmx.resource.imsdatabase.SenSegment;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage
 * @generated
 */
public class ImsdatabaseSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static ImsdatabasePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public ImsdatabaseSwitch() {
        if (modelPackage == null) {
            modelPackage = ImsdatabasePackage.eINSTANCE;
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
        case ImsdatabasePackage.DBD: {
            DBD dbd = (DBD) theEObject;
            T result = caseDBD(dbd);
            if (result == null)
                result = caseRecordFile(dbd);
            if (result == null)
                result = casePackage(dbd);
            if (result == null)
                result = caseNamespace(dbd);
            if (result == null)
                result = caseModelElement(dbd);
            if (result == null)
                result = caseElement(dbd);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.PSB: {
            PSB psb = (PSB) theEObject;
            T result = casePSB(psb);
            if (result == null)
                result = caseRecordFile(psb);
            if (result == null)
                result = casePackage(psb);
            if (result == null)
                result = caseNamespace(psb);
            if (result == null)
                result = caseModelElement(psb);
            if (result == null)
                result = caseElement(psb);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.PCB: {
            PCB pcb = (PCB) theEObject;
            T result = casePCB(pcb);
            if (result == null)
                result = caseRecordFile(pcb);
            if (result == null)
                result = casePackage(pcb);
            if (result == null)
                result = caseNamespace(pcb);
            if (result == null)
                result = caseModelElement(pcb);
            if (result == null)
                result = caseElement(pcb);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SEGMENT: {
            Segment segment = (Segment) theEObject;
            T result = caseSegment(segment);
            if (result == null)
                result = caseRecordDef(segment);
            if (result == null)
                result = caseClass(segment);
            if (result == null)
                result = caseClassifier(segment);
            if (result == null)
                result = caseNamespace(segment);
            if (result == null)
                result = caseModelElement(segment);
            if (result == null)
                result = caseElement(segment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SEGMENT_COMPLEX: {
            SegmentComplex segmentComplex = (SegmentComplex) theEObject;
            T result = caseSegmentComplex(segmentComplex);
            if (result == null)
                result = caseSegment(segmentComplex);
            if (result == null)
                result = caseRecordDef(segmentComplex);
            if (result == null)
                result = caseClass(segmentComplex);
            if (result == null)
                result = caseClassifier(segmentComplex);
            if (result == null)
                result = caseNamespace(segmentComplex);
            if (result == null)
                result = caseModelElement(segmentComplex);
            if (result == null)
                result = caseElement(segmentComplex);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SEGMENT_LOGICAL: {
            SegmentLogical segmentLogical = (SegmentLogical) theEObject;
            T result = caseSegmentLogical(segmentLogical);
            if (result == null)
                result = caseSegment(segmentLogical);
            if (result == null)
                result = caseRecordDef(segmentLogical);
            if (result == null)
                result = caseClass(segmentLogical);
            if (result == null)
                result = caseClassifier(segmentLogical);
            if (result == null)
                result = caseNamespace(segmentLogical);
            if (result == null)
                result = caseModelElement(segmentLogical);
            if (result == null)
                result = caseElement(segmentLogical);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.FIELD: {
            Field field = (Field) theEObject;
            T result = caseField(field);
            if (result == null)
                result = caseFixedOffsetField(field);
            if (result == null)
                result = caseRecord_Field(field);
            if (result == null)
                result = caseAttribute(field);
            if (result == null)
                result = caseStructuralFeature(field);
            if (result == null)
                result = caseFeature(field);
            if (result == null)
                result = caseModelElement(field);
            if (result == null)
                result = caseElement(field);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.DATASET: {
            Dataset dataset = (Dataset) theEObject;
            T result = caseDataset(dataset);
            if (result == null)
                result = caseModelElement(dataset);
            if (result == null)
                result = caseElement(dataset);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SEN_SEGMENT: {
            SenSegment senSegment = (SenSegment) theEObject;
            T result = caseSenSegment(senSegment);
            if (result == null)
                result = caseRecordDef(senSegment);
            if (result == null)
                result = caseClass(senSegment);
            if (result == null)
                result = caseClassifier(senSegment);
            if (result == null)
                result = caseNamespace(senSegment);
            if (result == null)
                result = caseModelElement(senSegment);
            if (result == null)
                result = caseElement(senSegment);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SEN_FIELD: {
            SenField senField = (SenField) theEObject;
            T result = caseSenField(senField);
            if (result == null)
                result = caseFixedOffsetField(senField);
            if (result == null)
                result = caseRecord_Field(senField);
            if (result == null)
                result = caseAttribute(senField);
            if (result == null)
                result = caseStructuralFeature(senField);
            if (result == null)
                result = caseFeature(senField);
            if (result == null)
                result = caseModelElement(senField);
            if (result == null)
                result = caseElement(senField);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.ACBLIB: {
            ACBLIB acblib = (ACBLIB) theEObject;
            T result = caseACBLIB(acblib);
            if (result == null)
                result = casePackage(acblib);
            if (result == null)
                result = caseNamespace(acblib);
            if (result == null)
                result = caseModelElement(acblib);
            if (result == null)
                result = caseElement(acblib);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.ACCESS_METHOD: {
            AccessMethod accessMethod = (AccessMethod) theEObject;
            T result = caseAccessMethod(accessMethod);
            if (result == null)
                result = caseModelElement(accessMethod);
            if (result == null)
                result = caseElement(accessMethod);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.INDEX: {
            INDEX index = (INDEX) theEObject;
            T result = caseINDEX(index);
            if (result == null)
                result = caseAccessMethod(index);
            if (result == null)
                result = caseModelElement(index);
            if (result == null)
                result = caseElement(index);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.HIDAM: {
            HIDAM hidam = (HIDAM) theEObject;
            T result = caseHIDAM(hidam);
            if (result == null)
                result = caseAccessMethod(hidam);
            if (result == null)
                result = caseModelElement(hidam);
            if (result == null)
                result = caseElement(hidam);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.DEDB: {
            DEDB dedb = (DEDB) theEObject;
            T result = caseDEDB(dedb);
            if (result == null)
                result = caseAccessMethod(dedb);
            if (result == null)
                result = caseModelElement(dedb);
            if (result == null)
                result = caseElement(dedb);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.HDAM: {
            HDAM hdam = (HDAM) theEObject;
            T result = caseHDAM(hdam);
            if (result == null)
                result = caseAccessMethod(hdam);
            if (result == null)
                result = caseModelElement(hdam);
            if (result == null)
                result = caseElement(hdam);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.MSDB: {
            MSDB msdb = (MSDB) theEObject;
            T result = caseMSDB(msdb);
            if (result == null)
                result = caseAccessMethod(msdb);
            if (result == null)
                result = caseModelElement(msdb);
            if (result == null)
                result = caseElement(msdb);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.SECONDARY_INDEX: {
            SecondaryIndex secondaryIndex = (SecondaryIndex) theEObject;
            T result = caseSecondaryIndex(secondaryIndex);
            if (result == null)
                result = caseModelElement(secondaryIndex);
            if (result == null)
                result = caseElement(secondaryIndex);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.EXIT: {
            Exit exit = (Exit) theEObject;
            T result = caseExit(exit);
            if (result == null)
                result = caseModelElement(exit);
            if (result == null)
                result = caseElement(exit);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.LCHILD: {
            LCHILD lchild = (LCHILD) theEObject;
            T result = caseLCHILD(lchild);
            if (result == null)
                result = caseModelElement(lchild);
            if (result == null)
                result = caseElement(lchild);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.PSB_LIB: {
            PSBLib psbLib = (PSBLib) theEObject;
            T result = casePSBLib(psbLib);
            if (result == null)
                result = casePackage(psbLib);
            if (result == null)
                result = caseNamespace(psbLib);
            if (result == null)
                result = caseModelElement(psbLib);
            if (result == null)
                result = caseElement(psbLib);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case ImsdatabasePackage.DBD_LIB: {
            DBDLib dbdLib = (DBDLib) theEObject;
            T result = caseDBDLib(dbdLib);
            if (result == null)
                result = casePackage(dbdLib);
            if (result == null)
                result = caseNamespace(dbdLib);
            if (result == null)
                result = caseModelElement(dbdLib);
            if (result == null)
                result = caseElement(dbdLib);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DBD</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DBD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDBD(DBD object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>PSB</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>PSB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePSB(PSB object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>PCB</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>PCB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCB(PCB object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSegment(Segment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Segment Complex</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Segment Complex</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSegmentComplex(SegmentComplex object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Segment Logical</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Segment Logical</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSegmentLogical(SegmentLogical object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataset(Dataset object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sen Segment</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sen Segment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSenSegment(SenSegment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sen Field</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sen Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSenField(SenField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ACBLIB</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ACBLIB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseACBLIB(ACBLIB object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Method</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccessMethod(AccessMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>INDEX</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>INDEX</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseINDEX(INDEX object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>HIDAM</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>HIDAM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHIDAM(HIDAM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DEDB</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DEDB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDEDB(DEDB object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>HDAM</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>HDAM</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHDAM(HDAM object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>MSDB</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>MSDB</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMSDB(MSDB object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Secondary Index</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Secondary Index</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSecondaryIndex(SecondaryIndex object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Exit</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Exit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExit(Exit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LCHILD</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LCHILD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLCHILD(LCHILD object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PSB Lib</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PSB Lib</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePSBLib(PSBLib object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DBD Lib</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DBD Lib</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDBDLib(DBDLib object) {
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
     * Returns the result of interpreting the object as an instance of '
     * <em>File</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordFile(RecordFile object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecord_Field(orgomg.cwm.resource.record.Field object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Fixed Offset Field</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Fixed Offset Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedOffsetField(FixedOffsetField object) {
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

} // ImsdatabaseSwitch

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.foundation.keysindexes.Index;
import orgomg.cwm.objectmodel.core.Attribute;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.objectmodel.core.DataType;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.Feature;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwm.objectmodel.core.Namespace;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.Field;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwmx.resource.coboldata.*;
import orgomg.cwmx.resource.coboldata.COBOLFD;
import orgomg.cwmx.resource.coboldata.COBOLFDIndex;
import orgomg.cwmx.resource.coboldata.COBOLField;
import orgomg.cwmx.resource.coboldata.COBOLItem;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.coboldata.FileSection;
import orgomg.cwmx.resource.coboldata.LinageInfo;
import orgomg.cwmx.resource.coboldata.LinkageSection;
import orgomg.cwmx.resource.coboldata.OccursKey;
import orgomg.cwmx.resource.coboldata.Renames;
import orgomg.cwmx.resource.coboldata.ReportWriterSection;
import orgomg.cwmx.resource.coboldata.Section;
import orgomg.cwmx.resource.coboldata.Usage;
import orgomg.cwmx.resource.coboldata.WorkingStorageSection;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage
 * @generated
 */
public class CoboldataSwitch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static CoboldataPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public CoboldataSwitch() {
        if (modelPackage == null) {
            modelPackage = CoboldataPackage.eINSTANCE;
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
        case CoboldataPackage.COBOLFD: {
            COBOLFD cobolfd = (COBOLFD) theEObject;
            T result = caseCOBOLFD(cobolfd);
            if (result == null)
                result = caseClass(cobolfd);
            if (result == null)
                result = caseRecordFile(cobolfd);
            if (result == null)
                result = caseClassifier(cobolfd);
            if (result == null)
                result = casePackage(cobolfd);
            if (result == null)
                result = caseNamespace(cobolfd);
            if (result == null)
                result = caseModelElement(cobolfd);
            if (result == null)
                result = caseElement(cobolfd);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.COBOL_ITEM: {
            COBOLItem cobolItem = (COBOLItem) theEObject;
            T result = caseCOBOLItem(cobolItem);
            if (result == null)
                result = caseField(cobolItem);
            if (result == null)
                result = caseAttribute(cobolItem);
            if (result == null)
                result = caseStructuralFeature(cobolItem);
            if (result == null)
                result = caseFeature(cobolItem);
            if (result == null)
                result = caseModelElement(cobolItem);
            if (result == null)
                result = caseElement(cobolItem);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.COBOL_FIELD: {
            COBOLField cobolField = (COBOLField) theEObject;
            T result = caseCOBOLField(cobolField);
            if (result == null)
                result = caseCOBOLItem(cobolField);
            if (result == null)
                result = caseField(cobolField);
            if (result == null)
                result = caseAttribute(cobolField);
            if (result == null)
                result = caseStructuralFeature(cobolField);
            if (result == null)
                result = caseFeature(cobolField);
            if (result == null)
                result = caseModelElement(cobolField);
            if (result == null)
                result = caseElement(cobolField);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.RENAMES: {
            Renames renames = (Renames) theEObject;
            T result = caseRenames(renames);
            if (result == null)
                result = caseCOBOLItem(renames);
            if (result == null)
                result = caseField(renames);
            if (result == null)
                result = caseAttribute(renames);
            if (result == null)
                result = caseStructuralFeature(renames);
            if (result == null)
                result = caseFeature(renames);
            if (result == null)
                result = caseModelElement(renames);
            if (result == null)
                result = caseElement(renames);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.SECTION: {
            Section section = (Section) theEObject;
            T result = caseSection(section);
            if (result == null)
                result = caseClassifier(section);
            if (result == null)
                result = caseNamespace(section);
            if (result == null)
                result = caseModelElement(section);
            if (result == null)
                result = caseElement(section);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.WORKING_STORAGE_SECTION: {
            WorkingStorageSection workingStorageSection = (WorkingStorageSection) theEObject;
            T result = caseWorkingStorageSection(workingStorageSection);
            if (result == null)
                result = caseSection(workingStorageSection);
            if (result == null)
                result = caseClassifier(workingStorageSection);
            if (result == null)
                result = caseNamespace(workingStorageSection);
            if (result == null)
                result = caseModelElement(workingStorageSection);
            if (result == null)
                result = caseElement(workingStorageSection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.FILE_SECTION: {
            FileSection fileSection = (FileSection) theEObject;
            T result = caseFileSection(fileSection);
            if (result == null)
                result = caseSection(fileSection);
            if (result == null)
                result = caseClassifier(fileSection);
            if (result == null)
                result = caseNamespace(fileSection);
            if (result == null)
                result = caseModelElement(fileSection);
            if (result == null)
                result = caseElement(fileSection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.REPORT_WRITER_SECTION: {
            ReportWriterSection reportWriterSection = (ReportWriterSection) theEObject;
            T result = caseReportWriterSection(reportWriterSection);
            if (result == null)
                result = caseSection(reportWriterSection);
            if (result == null)
                result = caseClassifier(reportWriterSection);
            if (result == null)
                result = caseNamespace(reportWriterSection);
            if (result == null)
                result = caseModelElement(reportWriterSection);
            if (result == null)
                result = caseElement(reportWriterSection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.LINKAGE_SECTION: {
            LinkageSection linkageSection = (LinkageSection) theEObject;
            T result = caseLinkageSection(linkageSection);
            if (result == null)
                result = caseSection(linkageSection);
            if (result == null)
                result = caseClassifier(linkageSection);
            if (result == null)
                result = caseNamespace(linkageSection);
            if (result == null)
                result = caseModelElement(linkageSection);
            if (result == null)
                result = caseElement(linkageSection);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.OCCURS_KEY: {
            OccursKey occursKey = (OccursKey) theEObject;
            T result = caseOccursKey(occursKey);
            if (result == null)
                result = caseModelElement(occursKey);
            if (result == null)
                result = caseElement(occursKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.LINAGE_INFO: {
            LinageInfo linageInfo = (LinageInfo) theEObject;
            T result = caseLinageInfo(linageInfo);
            if (result == null)
                result = caseModelElement(linageInfo);
            if (result == null)
                result = caseElement(linageInfo);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.COBOLFD_INDEX: {
            COBOLFDIndex cobolfdIndex = (COBOLFDIndex) theEObject;
            T result = caseCOBOLFDIndex(cobolfdIndex);
            if (result == null)
                result = caseIndex(cobolfdIndex);
            if (result == null)
                result = caseModelElement(cobolfdIndex);
            if (result == null)
                result = caseElement(cobolfdIndex);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case CoboldataPackage.USAGE: {
            Usage usage = (Usage) theEObject;
            T result = caseUsage(usage);
            if (result == null)
                result = caseDataType(usage);
            if (result == null)
                result = caseClassifier(usage);
            if (result == null)
                result = caseNamespace(usage);
            if (result == null)
                result = caseModelElement(usage);
            if (result == null)
                result = caseElement(usage);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COBOLFD</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COBOLFD</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCOBOLFD(COBOLFD object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COBOL Item</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COBOL Item</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCOBOLItem(COBOLItem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COBOL Field</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COBOL Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCOBOLField(COBOLField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Renames</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Renames</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRenames(Renames object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSection(Section object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Working Storage Section</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Working Storage Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkingStorageSection(WorkingStorageSection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Section</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileSection(FileSection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Writer Section</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Writer Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportWriterSection(ReportWriterSection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linkage Section</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linkage Section</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkageSection(LinkageSection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Occurs Key</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Occurs Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOccursKey(OccursKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linage Info</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linage Info</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinageInfo(LinageInfo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>COBOLFD Index</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>COBOLFD Index</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCOBOLFDIndex(COBOLFDIndex object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUsage(Usage object) {
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
    public T caseField(Field object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Index</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndex(Index object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
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

} // CoboldataSwitch

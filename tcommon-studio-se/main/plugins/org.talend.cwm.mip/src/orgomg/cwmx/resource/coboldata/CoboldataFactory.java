/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage
 * @generated
 */
public interface CoboldataFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    CoboldataFactory eINSTANCE = orgomg.cwmx.resource.coboldata.impl.CoboldataFactoryImpl.init();

    /**
     * Returns a new object of class '<em>COBOLFD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>COBOLFD</em>'.
     * @generated
     */
    COBOLFD createCOBOLFD();

    /**
     * Returns a new object of class '<em>COBOL Field</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>COBOL Field</em>'.
     * @generated
     */
    COBOLField createCOBOLField();

    /**
     * Returns a new object of class '<em>Renames</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Renames</em>'.
     * @generated
     */
    Renames createRenames();

    /**
     * Returns a new object of class '<em>Section</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Section</em>'.
     * @generated
     */
    Section createSection();

    /**
     * Returns a new object of class '<em>Working Storage Section</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Working Storage Section</em>'.
     * @generated
     */
    WorkingStorageSection createWorkingStorageSection();

    /**
     * Returns a new object of class '<em>File Section</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>File Section</em>'.
     * @generated
     */
    FileSection createFileSection();

    /**
     * Returns a new object of class '<em>Report Writer Section</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Report Writer Section</em>'.
     * @generated
     */
    ReportWriterSection createReportWriterSection();

    /**
     * Returns a new object of class '<em>Linkage Section</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Linkage Section</em>'.
     * @generated
     */
    LinkageSection createLinkageSection();

    /**
     * Returns a new object of class '<em>Occurs Key</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Occurs Key</em>'.
     * @generated
     */
    OccursKey createOccursKey();

    /**
     * Returns a new object of class '<em>Linage Info</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Linage Info</em>'.
     * @generated
     */
    LinageInfo createLinageInfo();

    /**
     * Returns a new object of class '<em>COBOLFD Index</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>COBOLFD Index</em>'.
     * @generated
     */
    COBOLFDIndex createCOBOLFDIndex();

    /**
     * Returns a new object of class '<em>Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage</em>'.
     * @generated
     */
    Usage createUsage();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CoboldataPackage getCoboldataPackage();

} // CoboldataFactory

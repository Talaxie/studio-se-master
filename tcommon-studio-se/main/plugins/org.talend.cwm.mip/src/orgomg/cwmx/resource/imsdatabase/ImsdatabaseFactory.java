/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage
 * @generated
 */
public interface ImsdatabaseFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    ImsdatabaseFactory eINSTANCE = orgomg.cwmx.resource.imsdatabase.impl.ImsdatabaseFactoryImpl.init();

    /**
     * Returns a new object of class '<em>DBD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DBD</em>'.
     * @generated
     */
    DBD createDBD();

    /**
     * Returns a new object of class '<em>PSB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PSB</em>'.
     * @generated
     */
    PSB createPSB();

    /**
     * Returns a new object of class '<em>PCB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PCB</em>'.
     * @generated
     */
    PCB createPCB();

    /**
     * Returns a new object of class '<em>Segment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Segment</em>'.
     * @generated
     */
    Segment createSegment();

    /**
     * Returns a new object of class '<em>Segment Complex</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Segment Complex</em>'.
     * @generated
     */
    SegmentComplex createSegmentComplex();

    /**
     * Returns a new object of class '<em>Segment Logical</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Segment Logical</em>'.
     * @generated
     */
    SegmentLogical createSegmentLogical();

    /**
     * Returns a new object of class '<em>Field</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Field</em>'.
     * @generated
     */
    Field createField();

    /**
     * Returns a new object of class '<em>Dataset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dataset</em>'.
     * @generated
     */
    Dataset createDataset();

    /**
     * Returns a new object of class '<em>Sen Segment</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Sen Segment</em>'.
     * @generated
     */
    SenSegment createSenSegment();

    /**
     * Returns a new object of class '<em>Sen Field</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Sen Field</em>'.
     * @generated
     */
    SenField createSenField();

    /**
     * Returns a new object of class '<em>ACBLIB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ACBLIB</em>'.
     * @generated
     */
    ACBLIB createACBLIB();

    /**
     * Returns a new object of class '<em>Access Method</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Access Method</em>'.
     * @generated
     */
    AccessMethod createAccessMethod();

    /**
     * Returns a new object of class '<em>INDEX</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>INDEX</em>'.
     * @generated
     */
    INDEX createINDEX();

    /**
     * Returns a new object of class '<em>HIDAM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HIDAM</em>'.
     * @generated
     */
    HIDAM createHIDAM();

    /**
     * Returns a new object of class '<em>DEDB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DEDB</em>'.
     * @generated
     */
    DEDB createDEDB();

    /**
     * Returns a new object of class '<em>HDAM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HDAM</em>'.
     * @generated
     */
    HDAM createHDAM();

    /**
     * Returns a new object of class '<em>MSDB</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>MSDB</em>'.
     * @generated
     */
    MSDB createMSDB();

    /**
     * Returns a new object of class '<em>Secondary Index</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Secondary Index</em>'.
     * @generated
     */
    SecondaryIndex createSecondaryIndex();

    /**
     * Returns a new object of class '<em>Exit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exit</em>'.
     * @generated
     */
    Exit createExit();

    /**
     * Returns a new object of class '<em>LCHILD</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LCHILD</em>'.
     * @generated
     */
    LCHILD createLCHILD();

    /**
     * Returns a new object of class '<em>PSB Lib</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PSB Lib</em>'.
     * @generated
     */
    PSBLib createPSBLib();

    /**
     * Returns a new object of class '<em>DBD Lib</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DBD Lib</em>'.
     * @generated
     */
    DBDLib createDBDLib();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ImsdatabasePackage getImsdatabasePackage();

} // ImsdatabaseFactory

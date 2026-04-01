/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage
 * @generated
 */
public interface DmsiiFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    DmsiiFactory eINSTANCE = orgomg.cwmx.resource.dmsii.impl.DmsiiFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Database</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Database</em>'.
     * @generated
     */
    Database createDatabase();

    /**
     * Returns a new object of class '<em>Remap</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remap</em>'.
     * @generated
     */
    Remap createRemap();

    /**
     * Returns a new object of class '<em>Data Set</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set</em>'.
     * @generated
     */
    DataSet createDataSet();

    /**
     * Returns a new object of class '<em>Data Item</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Data Item</em>'.
     * @generated
     */
    DataItem createDataItem();

    /**
     * Returns a new object of class '<em>Variable Format Part</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Variable Format Part</em>'.
     * @generated
     */
    VariableFormatPart createVariableFormatPart();

    /**
     * Returns a new object of class '<em>Set Structure</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Set Structure</em>'.
     * @generated
     */
    SetStructure createSetStructure();

    /**
     * Returns a new object of class '<em>Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set</em>'.
     * @generated
     */
    Set createSet();

    /**
     * Returns a new object of class '<em>Access</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Access</em>'.
     * @generated
     */
    Access createAccess();

    /**
     * Returns a new object of class '<em>Subset</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subset</em>'.
     * @generated
     */
    Subset createSubset();

    /**
     * Returns a new object of class '<em>Automatic Subset</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Automatic Subset</em>'.
     * @generated
     */
    AutomaticSubset createAutomaticSubset();

    /**
     * Returns a new object of class '<em>Key Item</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Key Item</em>'.
     * @generated
     */
    KeyItem createKeyItem();

    /**
     * Returns a new object of class '<em>Remap Item</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Remap Item</em>'.
     * @generated
     */
    RemapItem createRemapItem();

    /**
     * Returns a new object of class '<em>Field Bit</em>'.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @return a new object of class '<em>Field Bit</em>'.
     * @generated
     */
    FieldBit createFieldBit();

    /**
     * Returns a new object of class '<em>Remark</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remark</em>'.
     * @generated
     */
    Remark createRemark();

    /**
     * Returns a new object of class '<em>Physical Database</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Database</em>'.
     * @generated
     */
    PhysicalDatabase createPhysicalDatabase();

    /**
     * Returns a new object of class '<em>Physical Data Set</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Data Set</em>'.
     * @generated
     */
    PhysicalDataSet createPhysicalDataSet();

    /**
     * Returns a new object of class '<em>DASDL Comment</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>DASDL Comment</em>'.
     * @generated
     */
    DASDLComment createDASDLComment();

    /**
     * Returns a new object of class '<em>Physical Set</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Set</em>'.
     * @generated
     */
    PhysicalSet createPhysicalSet();

    /**
     * Returns a new object of class '<em>Physical Data Set Override</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Data Set Override</em>'.
     * @generated
     */
    PhysicalDataSetOverride createPhysicalDataSetOverride();

    /**
     * Returns a new object of class '<em>Physical Set Override</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Set Override</em>'.
     * @generated
     */
    PhysicalSetOverride createPhysicalSetOverride();

    /**
     * Returns a new object of class '<em>Physical Access Override</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Physical Access Override</em>'.
     * @generated
     */
    PhysicalAccessOverride createPhysicalAccessOverride();

    /**
     * Returns a new object of class '<em>DASDL Property</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>DASDL Property</em>'.
     * @generated
     */
    DASDLProperty createDASDLProperty();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DmsiiPackage getDmsiiPackage();

} // DmsiiFactory

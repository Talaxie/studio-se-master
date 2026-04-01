/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.objectmodel.core.StructuralFeature;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Set Structure</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SetStructure instances represent access paths in DMS II. SetStructures are connected to the DataSet instances that they span via the ElementOwnership association inherited from the Index class in the CWM Foundation?s KeysIndexes package.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.SetStructure#getDuplicates <em>Duplicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSetStructure()
 * @model
 * @generated
 */
public interface SetStructure extends StructuralFeature {

    /**
     * Returns the value of the '<em><b>Duplicates</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates the duplicates clause associated with the SetStructure
     * instance.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Duplicates</em>' attribute.
     * @see #setDuplicates(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getSetStructure_Duplicates()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDuplicates();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.SetStructure#getDuplicates <em>Duplicates</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Duplicates</em>' attribute.
     * @see #getDuplicates()
     * @generated
     */
    void setDuplicates(String value);

} // SetStructure

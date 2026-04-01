/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import orgomg.cwm.objectmodel.core.DataType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Usage</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of UML?s DataType class representing valid COBOL usage types. The type attribute that a COBOLField inherits from StructuralFeature should point to one of the instances of Usage defined here.
 * 
 * Defined M1 instances of the Usage class have the names: COMP, DISPLAY, and INDEX. Common extension data types (such as BINARY, PACKEDDECIMAL, COMP-1, COMP-2, COMP-3, etc.) can be easily added by creating addition M1 instances of Usage without the need to change the metamodel change.
 * <!-- end-model-doc -->
 *
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends DataType {
} // Usage

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.essbase;

import orgomg.cwm.resource.multidimensional.DimensionedObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Two Pass Calculation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a tag specifying that a derived (calculated) Accounts member needs to be re-computed following the global calculation of an Essbase Database.
 * 
 * This is done to provide a derived Accounts member that?s dependent on other account members with a final, correct value, following the sequential calculation of both the Accounts and Time Dimensions (e.g., Profit % Sales).
 * <!-- end-model-doc -->
 *
 *
 * @see orgomg.cwmx.resource.essbase.EssbasePackage#getTwoPassCalculation()
 * @model
 * @generated
 */
public interface TwoPassCalculation extends DimensionedObject {
} // TwoPassCalculation

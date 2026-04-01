/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import orgomg.cwm.foundation.keysindexes.Index;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>COBOLFD Index</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A COBOLFDIndex instance represents a RECORD KEY or ALTERNATE RECORD KEY for an INDEXED file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLFDIndex#isIsAlternate <em>Is Alternate</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFDIndex()
 * @model
 * @generated
 */
public interface COBOLFDIndex extends Index {

    /**
     * Returns the value of the '<em><b>Is Alternate</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, this is an alternate index. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Alternate</em>' attribute.
     * @see #setIsAlternate(boolean)
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLFDIndex_IsAlternate()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsAlternate();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.coboldata.COBOLFDIndex#isIsAlternate <em>Is Alternate</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Alternate</em>' attribute.
     * @see #isIsAlternate()
     * @generated
     */
    void setIsAlternate(boolean value);

} // COBOLFDIndex

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import java.util.TreeMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Key Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.BlockKeyIndicator#getBlockSize2frequency <em>Block Size2frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getBlockKeyIndicator()
 * @model
 * @generated
 */
public interface BlockKeyIndicator extends ColumnSetMultiValueIndicator {
    /**
     * Returns the value of the '<em><b>Block Size2frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * contains the frequency of blocks of identical keys.  The key of the map is the size of the block. The value is the number of blocks with that size.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Block Size2frequency</em>' attribute.
     * @see #setBlockSize2frequency(TreeMap)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getBlockKeyIndicator_BlockSize2frequency()
     * @model dataType="org.talend.dataquality.indicators.JavaTreeMap"
     * @generated
     */
    TreeMap<Object, Long> getBlockSize2frequency();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.BlockKeyIndicator#getBlockSize2frequency <em>Block Size2frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Block Size2frequency</em>' attribute.
     * @see #getBlockSize2frequency()
     * @generated
     */
    void setBlockSize2frequency(TreeMap<Object, Long> value);

} // BlockKeyIndicator

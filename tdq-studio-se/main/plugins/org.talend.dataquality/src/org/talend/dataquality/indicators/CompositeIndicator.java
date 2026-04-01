/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composite Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 *
 * @see org.talend.dataquality.indicators.IndicatorsPackage#getCompositeIndicator()
 * @model
 * @generated
 */
public interface CompositeIndicator extends Indicator {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns the direct children of this composite indicator.
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Indicator> getChildIndicators();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns the indicators that are leaf of the tree.
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Indicator> getLeafIndicators();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Returns all the child indicators (leaf indicators or intermediate composite indicators) as a flat list.
     * <!-- end-model-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<Indicator> getAllChildIndicators();

} // CompositeIndicator

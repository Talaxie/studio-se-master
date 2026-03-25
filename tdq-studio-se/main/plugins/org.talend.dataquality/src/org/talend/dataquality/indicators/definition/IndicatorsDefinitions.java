/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.definition;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicators Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getIndicatorDefinitions <em>Indicator Definitions</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.definition.IndicatorsDefinitions#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorsDefinitions()
 * @model
 * @generated
 */
public interface IndicatorsDefinitions extends ModelElement {
    /**
     * Returns the value of the '<em><b>Indicator Definitions</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorDefinition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator Definitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indicator Definitions</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorsDefinitions_IndicatorDefinitions()
     * @model containment="true"
     * @generated
     */
    EList<IndicatorDefinition> getIndicatorDefinitions();

    /**
     * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.indicators.definition.IndicatorCategory}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Categories</em>' containment reference list.
     * @see org.talend.dataquality.indicators.definition.DefinitionPackage#getIndicatorsDefinitions_Categories()
     * @model containment="true"
     * @generated
     */
    EList<IndicatorCategory> getCategories();

} // IndicatorsDefinitions

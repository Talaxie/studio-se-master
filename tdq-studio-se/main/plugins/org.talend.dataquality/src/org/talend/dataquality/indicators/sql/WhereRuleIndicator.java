/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.sql;

import java.util.List;


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Where Rule Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicator defined by a where clause.
 * <!-- end-model-doc -->
 *
 *
 * @see org.talend.dataquality.indicators.sql.IndicatorSqlPackage#getWhereRuleIndicator()
 * @model
 * @generated
 */
public interface WhereRuleIndicator extends UserDefIndicator {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" objectsDataType="org.talend.dataquality.indicators.ObjectArray"
     * @generated
     */
    boolean setCount(List<Object[]> objects);
} // WhereRuleIndicator

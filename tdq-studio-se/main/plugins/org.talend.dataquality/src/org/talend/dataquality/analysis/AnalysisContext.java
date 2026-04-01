/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.analysis;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.foundation.softwaredeployment.DataManager;
import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwmx.analysis.informationreporting.ReportGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisContext#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.talend.dataquality.analysis.AnalysisContext#getAnalysedElements <em>Analysed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisContext()
 * @model
 * @generated
 */
public interface AnalysisContext extends ReportGroup {
    /**
     * Returns the value of the '<em><b>Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection</em>' reference.
     * @see #setConnection(DataManager)
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisContext_Connection()
     * @model
     * @generated
     */
    DataManager getConnection();

    /**
     * Sets the value of the '{@link org.talend.dataquality.analysis.AnalysisContext#getConnection <em>Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection</em>' reference.
     * @see #getConnection()
     * @generated
     */
    void setConnection(DataManager value);

    /**
     * Returns the value of the '<em><b>Analysed Elements</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwm.objectmodel.core.ModelElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * the analysed object (could be a Catalog, a Schema, a Table, a ColumnSet, a Column, ...)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Analysed Elements</em>' reference list.
     * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisContext_AnalysedElements()
     * @model
     * @generated
     */
    EList<ModelElement> getAnalysedElements();

} // AnalysisContext

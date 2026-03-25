/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.common.util.EList;
import org.talend.dataquality.domain.pattern.Pattern;
import orgomg.cwm.objectmodel.core.DataType;
import orgomg.cwm.objectmodel.core.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.Domain#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.Domain#getLengthRestriction <em>Length Restriction</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.Domain#getRanges <em>Ranges</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.Domain#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.Domain#getJavaUDIIndicatorParameter <em>Java UDI Indicator Parameter</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.Domain#getBuiltInPatterns <em>Built In Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends Namespace {
    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(DataType)
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_DataType()
     * @model
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.Domain#getDataType <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Length Restriction</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.LengthRestriction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length Restriction</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length Restriction</em>' containment reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_LengthRestriction()
     * @model containment="true"
     * @generated
     */
    EList<LengthRestriction> getLengthRestriction();

    /**
     * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.RangeRestriction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ranges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ranges</em>' containment reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_Ranges()
     * @model containment="true"
     * @generated
     */
    EList<RangeRestriction> getRanges();

    /**
     * Returns the value of the '<em><b>Patterns</b></em>' reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.pattern.Pattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Patterns</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Patterns</em>' reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_Patterns()
     * @model
     * @generated
     */
    EList<Pattern> getPatterns();

    /**
     * Returns the value of the '<em><b>Java UDI Indicator Parameter</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.JavaUDIIndicatorParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Java UDI Indicator Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Java UDI Indicator Parameter</em>' containment reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_JavaUDIIndicatorParameter()
     * @model containment="true"
     * @generated
     */
    EList<JavaUDIIndicatorParameter> getJavaUDIIndicatorParameter();

    /**
     * Returns the value of the '<em><b>Built In Patterns</b></em>' containment reference list.
     * The list contents are of type {@link org.talend.dataquality.domain.pattern.Pattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Built In Patterns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Built In Patterns</em>' containment reference list.
     * @see org.talend.dataquality.domain.DomainPackage#getDomain_BuiltInPatterns()
     * @model containment="true"
     * @generated
     */
    EList<Pattern> getBuiltInPatterns();

} // Domain

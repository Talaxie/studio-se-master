/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules;

import org.eclipse.emf.ecore.EObject;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getColA <em>Col A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getColB <em>Col B</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getTableAliasA <em>Table Alias A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getTableAliasB <em>Table Alias B</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getColumnAliasA <em>Column Alias A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.JoinElement#getColumnAliasB <em>Column Alias B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.rules.RulesPackage#getJoinElement()
 * @model
 * @generated
 */
public interface JoinElement extends EObject {
    /**
     * Returns the value of the '<em><b>Col A</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Col A</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Col A</em>' reference.
     * @see #setColA(ModelElement)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_ColA()
     * @model required="true"
     * @generated
     */
    ModelElement getColA();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getColA <em>Col A</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Col A</em>' reference.
     * @see #getColA()
     * @generated
     */
    void setColA(ModelElement value);

    /**
     * Returns the value of the '<em><b>Col B</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Col B</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Col B</em>' reference.
     * @see #setColB(ModelElement)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_ColB()
     * @model required="true"
     * @generated
     */
    ModelElement getColB();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getColB <em>Col B</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Col B</em>' reference.
     * @see #getColB()
     * @generated
     */
    void setColB(ModelElement value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see #setOperator(String)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_Operator()
     * @model
     * @generated
     */
    String getOperator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see #getOperator()
     * @generated
     */
    void setOperator(String value);

    /**
     * Returns the value of the '<em><b>Table Alias A</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Alias A</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Alias A</em>' attribute.
     * @see #setTableAliasA(String)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_TableAliasA()
     * @model
     * @generated
     */
    String getTableAliasA();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getTableAliasA <em>Table Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table Alias A</em>' attribute.
     * @see #getTableAliasA()
     * @generated
     */
    void setTableAliasA(String value);

    /**
     * Returns the value of the '<em><b>Table Alias B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Table Alias B</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table Alias B</em>' attribute.
     * @see #setTableAliasB(String)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_TableAliasB()
     * @model
     * @generated
     */
    String getTableAliasB();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getTableAliasB <em>Table Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table Alias B</em>' attribute.
     * @see #getTableAliasB()
     * @generated
     */
    void setTableAliasB(String value);

    /**
     * Returns the value of the '<em><b>Column Alias A</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Column Alias A</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column Alias A</em>' attribute.
     * @see #setColumnAliasA(String)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_ColumnAliasA()
     * @model
     * @generated
     */
    String getColumnAliasA();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getColumnAliasA <em>Column Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column Alias A</em>' attribute.
     * @see #getColumnAliasA()
     * @generated
     */
    void setColumnAliasA(String value);

    /**
     * Returns the value of the '<em><b>Column Alias B</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Column Alias B</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Column Alias B</em>' attribute.
     * @see #setColumnAliasB(String)
     * @see org.talend.dataquality.rules.RulesPackage#getJoinElement_ColumnAliasB()
     * @model
     * @generated
     */
    String getColumnAliasB();

    /**
     * Sets the value of the '{@link org.talend.dataquality.rules.JoinElement#getColumnAliasB <em>Column Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Column Alias B</em>' attribute.
     * @see #getColumnAliasB()
     * @generated
     */
    void setColumnAliasB(String value);

} // JoinElement

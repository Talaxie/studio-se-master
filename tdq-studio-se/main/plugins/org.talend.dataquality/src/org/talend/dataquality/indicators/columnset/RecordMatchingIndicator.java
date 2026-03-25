/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.dataquality.indicators.columnset;

import java.util.TreeMap;

import org.talend.dataquality.rules.MatchRuleDefinition;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Record Matching Indicator</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class will also store the counts of unique records, duplicate records.
 * Duplicate count = matched record count + suspect record count. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getGroupSize2groupFrequency <em>Group Size2group Frequency</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getMatchedRecordCount <em>Matched Record Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getSuspectRecordCount <em>Suspect Record Count</em>}</li>
 *   <li>{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getBuiltInMatchRuleDefinition <em>Built In Match Rule Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getRecordMatchingIndicator()
 * @model
 * @generated
 */
public interface RecordMatchingIndicator extends ColumnSetMultiValueIndicator {

    /**
     * Returns the value of the '<em><b>Group Size2group Frequency</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> contains the frequency of groups of similar records. The key is the
     * size of the groups. The value is the number of groups with that size. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Group Size2group Frequency</em>' attribute.
     * @see #setGroupSize2groupFrequency(TreeMap)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getRecordMatchingIndicator_GroupSize2groupFrequency()
     * @model dataType="org.talend.dataquality.indicators.JavaTreeMap"
     * @generated
     */
    TreeMap<Object, Long> getGroupSize2groupFrequency();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getGroupSize2groupFrequency <em>Group Size2group Frequency</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Group Size2group Frequency</em>' attribute.
     * @see #getGroupSize2groupFrequency()
     * @generated
     */
    void setGroupSize2groupFrequency(TreeMap<Object, Long> value);

    /**
     * Returns the value of the '<em><b>Matched Record Count</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> number of records that have matched (duplicate) with a quality value
     * higher than the confidence threshold. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Matched Record Count</em>' attribute.
     * @see #setMatchedRecordCount(long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getRecordMatchingIndicator_MatchedRecordCount()
     * @model
     * @generated
     */
    long getMatchedRecordCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getMatchedRecordCount <em>Matched Record Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Matched Record Count</em>' attribute.
     * @see #getMatchedRecordCount()
     * @generated
     */
    void setMatchedRecordCount(long value);

    /**
     * Returns the value of the '<em><b>Suspect Record Count</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> number of records that have matched (duplicate) with a quality value
     * higher than the confidence threshold. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Suspect Record Count</em>' attribute.
     * @see #setSuspectRecordCount(long)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getRecordMatchingIndicator_SuspectRecordCount()
     * @model
     * @generated
     */
    long getSuspectRecordCount();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getSuspectRecordCount <em>Suspect Record Count</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Suspect Record Count</em>' attribute.
     * @see #getSuspectRecordCount()
     * @generated
     */
    void setSuspectRecordCount(long value);

    /**
     * Returns the value of the '<em><b>Built In Match Rule Definition</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Built In Match Rule Definition</em>' containment reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->development
     * 
     * @return the value of the '<em>Built In Match Rule Definition</em>' containment reference.
     * @see #setBuiltInMatchRuleDefinition(MatchRuleDefinition)
     * @see org.talend.dataquality.indicators.columnset.ColumnsetPackage#getRecordMatchingIndicator_BuiltInMatchRuleDefinition()
     * @model containment="true"
     * @generated
     */
    MatchRuleDefinition getBuiltInMatchRuleDefinition();

    /**
     * Sets the value of the '{@link org.talend.dataquality.indicators.columnset.RecordMatchingIndicator#getBuiltInMatchRuleDefinition <em>Built In Match Rule Definition</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Built In Match Rule Definition</em>' containment reference.
     * @see #getBuiltInMatchRuleDefinition()
     * @generated
     */
    void setBuiltInMatchRuleDefinition(MatchRuleDefinition value);

    /**
     * 
     * @param matchRowSchema
     */
    public void setMatchRowSchema(String[] matchRowSchema);

    /**
     * get the schema
     * 
     * @return
     */
    String[] getMatchRowSchema();
} // RecordMatchingIndicator

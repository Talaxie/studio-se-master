package org.talend.dataquality.analysis;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.analysis.AnalysisPackage#getAnalysisType()
 * @model
 * @generated
 */
public enum AnalysisType implements Enumerator {
    /**
     * The '<em><b>COLUMN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLUMN_VALUE
     * @generated
     * @ordered
     */
    COLUMN(0, "COLUMN", "Column Analysis"),

    /**
     * The '<em><b>COLUMNS COMPARISON</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLUMNS_COMPARISON_VALUE
     * @generated
     * @ordered
     */
    COLUMNS_COMPARISON(1, "COLUMNS_COMPARISON", "Columns Comparison Analysis"),

    /**
     * The '<em><b>TABLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TABLE_VALUE
     * @generated
     * @ordered
     */
    TABLE(2, "TABLE", "Table Analysis"),

    /**
     * The '<em><b>TABLE COMPARISON</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TABLE_COMPARISON_VALUE
     * @generated
     * @ordered
     */
    TABLE_COMPARISON(3, "TABLE_COMPARISON", "Table Comparison"),

    /**
     * The '<em><b>TABLE FUNCTIONAL DEPENDENCY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TABLE_FUNCTIONAL_DEPENDENCY_VALUE
     * @generated
     * @ordered
     */
    TABLE_FUNCTIONAL_DEPENDENCY(9, "TABLE_FUNCTIONAL_DEPENDENCY", "Functional Dependency"), /**
     * The '<em><b>CONNECTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CONNECTION_VALUE
     * @generated
     * @ordered
     */
    CONNECTION(4, "CONNECTION", "Connection Analysis"),

    /**
     * The '<em><b>SCHEMA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SCHEMA_VALUE
     * @generated
     * @ordered
     */
    SCHEMA(5, "SCHEMA", "Schema Analysis"),

    /**
     * The '<em><b>MULTIPLE COLUMN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MULTIPLE_COLUMN_VALUE
     * @generated
     * @ordered
     */
    MULTIPLE_COLUMN(6, "MULTIPLE_COLUMN", "Multiple Column Analysis"), /**
     * The '<em><b>CATALOG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CATALOG_VALUE
     * @generated
     * @ordered
     */
    CATALOG(7, "CATALOG", "Catalog Analysis"), /**
     * The '<em><b>COLUMN CORRELATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLUMN_CORRELATION_VALUE
     * @generated
     * @ordered
     */
    COLUMN_CORRELATION(8, "COLUMN_CORRELATION", "Column Correlation Analysis"), /**
     * The '<em><b>COLUMN SET</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLUMN_SET_VALUE
     * @generated
     * @ordered
     */
    COLUMN_SET(10, "COLUMN_SET", "Column Set Analysis"), /**
     * The '<em><b>BUSINESS RULE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUSINESS_RULE_VALUE
     * @generated
     * @ordered
     */
    BUSINESS_RULE(11, "BUSINESS_RULE", "Business Rule Analysis"), /**
     * The '<em><b>MATCH ANALYSIS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MATCH_ANALYSIS_VALUE
     * @generated
     * @ordered
     */
    MATCH_ANALYSIS(12, "MATCH_ANALYSIS", "Match Analysis");

    /**
     * The '<em><b>COLUMN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COLUMN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLUMN
     * @model literal="Column Analysis"
     * @generated
     * @ordered
     */
    public static final int COLUMN_VALUE = 0;

    /**
     * The '<em><b>COLUMNS COMPARISON</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COLUMNS COMPARISON</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLUMNS_COMPARISON
     * @model literal="Columns Comparison Analysis"
     * @generated
     * @ordered
     */
    public static final int COLUMNS_COMPARISON_VALUE = 1;

    /**
     * The '<em><b>TABLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TABLE
     * @model literal="Table Analysis"
     * @generated
     * @ordered
     */
    public static final int TABLE_VALUE = 2;

    /**
     * The '<em><b>TABLE COMPARISON</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TABLE COMPARISON</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TABLE_COMPARISON
     * @model literal="Table Comparison"
     * @generated
     * @ordered
     */
    public static final int TABLE_COMPARISON_VALUE = 3;

    /**
     * The '<em><b>TABLE FUNCTIONAL DEPENDENCY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>TABLE FUNCTIONAL DEPENDENCY</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TABLE_FUNCTIONAL_DEPENDENCY
     * @model literal="Functional Dependency"
     * @generated
     * @ordered
     */
    public static final int TABLE_FUNCTIONAL_DEPENDENCY_VALUE = 9;

    /**
     * The '<em><b>CONNECTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CONNECTION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CONNECTION
     * @model literal="Connection Analysis"
     * @generated
     * @ordered
     */
    public static final int CONNECTION_VALUE = 4;

    /**
     * The '<em><b>SCHEMA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SCHEMA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SCHEMA
     * @model literal="Schema Analysis"
     * @generated
     * @ordered
     */
    public static final int SCHEMA_VALUE = 5;

    /**
     * The '<em><b>MULTIPLE COLUMN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MULTIPLE COLUMN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MULTIPLE_COLUMN
     * @model literal="Multiple Column Analysis"
     * @generated
     * @ordered
     */
    public static final int MULTIPLE_COLUMN_VALUE = 6;

    /**
     * The '<em><b>CATALOG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CATALOG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CATALOG
     * @model literal="Catalog Analysis"
     * @generated
     * @ordered
     */
    public static final int CATALOG_VALUE = 7;

    /**
     * The '<em><b>COLUMN CORRELATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COLUMN CORRELATION</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLUMN_CORRELATION
     * @model literal="Column Correlation Analysis"
     * @generated
     * @ordered
     */
    public static final int COLUMN_CORRELATION_VALUE = 8;

    /**
     * The '<em><b>COLUMN SET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COLUMN SET</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COLUMN_SET
     * @model literal="Column Set Analysis"
     * @generated
     * @ordered
     */
    public static final int COLUMN_SET_VALUE = 10;

    /**
     * The '<em><b>BUSINESS RULE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>BUSINESS RULE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUSINESS_RULE
     * @model literal="Business Rule Analysis"
     * @generated
     * @ordered
     */
    public static final int BUSINESS_RULE_VALUE = 11;

    /**
     * The '<em><b>MATCH ANALYSIS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MATCH ANALYSIS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MATCH_ANALYSIS
     * @model literal="Match Analysis"
     * @generated
     * @ordered
     */
    public static final int MATCH_ANALYSIS_VALUE = 12;

    /**
     * An array of all the '<em><b>Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AnalysisType[] VALUES_ARRAY =
        new AnalysisType[] {
            COLUMN,
            COLUMNS_COMPARISON,
            TABLE,
            TABLE_COMPARISON,
            TABLE_FUNCTIONAL_DEPENDENCY,
            CONNECTION,
            SCHEMA,
            MULTIPLE_COLUMN,
            CATALOG,
            COLUMN_CORRELATION,
            COLUMN_SET,
            BUSINESS_RULE,
            MATCH_ANALYSIS,
        };

    /**
     * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AnalysisType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AnalysisType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AnalysisType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AnalysisType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AnalysisType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AnalysisType get(int value) {
        switch (value) {
            case COLUMN_VALUE: return COLUMN;
            case COLUMNS_COMPARISON_VALUE: return COLUMNS_COMPARISON;
            case TABLE_VALUE: return TABLE;
            case TABLE_COMPARISON_VALUE: return TABLE_COMPARISON;
            case TABLE_FUNCTIONAL_DEPENDENCY_VALUE: return TABLE_FUNCTIONAL_DEPENDENCY;
            case CONNECTION_VALUE: return CONNECTION;
            case SCHEMA_VALUE: return SCHEMA;
            case MULTIPLE_COLUMN_VALUE: return MULTIPLE_COLUMN;
            case CATALOG_VALUE: return CATALOG;
            case COLUMN_CORRELATION_VALUE: return COLUMN_CORRELATION;
            case COLUMN_SET_VALUE: return COLUMN_SET;
            case BUSINESS_RULE_VALUE: return BUSINESS_RULE;
            case MATCH_ANALYSIS_VALUE: return MATCH_ANALYSIS;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private AnalysisType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //AnalysisType
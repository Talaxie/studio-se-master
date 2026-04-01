/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationreporting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Report Group Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc --> <!-- begin-model-doc --> Defines ReportGroup
 * types. <!-- end-model-doc -->
 * 
 * @see orgomg.cwmx.analysis.informationreporting.InformationreportingPackage#getReportGroupType()
 * @model
 * @generated
 */
public enum ReportGroupType implements Enumerator {
    /**
     * The '<em><b>Header</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #HEADER_VALUE
     * @generated
     * @ordered
     */
    HEADER(0, "header", "header"),

    /**
     * The '<em><b>Footer</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #FOOTER_VALUE
     * @generated
     * @ordered
     */
    FOOTER(1, "footer", "footer"),

    /**
     * The '<em><b>Detail</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #DETAIL_VALUE
     * @generated
     * @ordered
     */
    DETAIL(2, "detail", "detail"),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER(3, "other", "other");

    /**
     * The '<em><b>Header</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Header group type. <!--
     * end-model-doc -->
     * 
     * @see #HEADER
     * @model name="header"
     * @generated
     * @ordered
     */
    public static final int HEADER_VALUE = 0;

    /**
     * The '<em><b>Footer</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Footer group type. <!--
     * end-model-doc -->
     * 
     * @see #FOOTER
     * @model name="footer"
     * @generated
     * @ordered
     */
    public static final int FOOTER_VALUE = 1;

    /**
     * The '<em><b>Detail</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Detail group type. <!--
     * end-model-doc -->
     * 
     * @see #DETAIL
     * @model name="detail"
     * @generated
     * @ordered
     */
    public static final int DETAIL_VALUE = 2;

    /**
     * The '<em><b>Other</b></em>' literal value. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> Other group type. <!--
     * end-model-doc -->
     * 
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 3;

    /**
     * An array of all the '<em><b>Report Group Type</b></em>' enumerators. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final ReportGroupType[] VALUES_ARRAY = new ReportGroupType[] { HEADER, FOOTER, DETAIL, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Report Group Type</b></em>' enumerators.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final List<ReportGroupType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Report Group Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ReportGroupType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ReportGroupType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Report Group Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ReportGroupType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ReportGroupType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Report Group Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static ReportGroupType get(int value) {
        switch (value) {
        case HEADER_VALUE:
            return HEADER;
        case FOOTER_VALUE:
            return FOOTER;
        case DETAIL_VALUE:
            return DETAIL;
        case OTHER_VALUE:
            return OTHER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    private ReportGroupType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} // ReportGroupType

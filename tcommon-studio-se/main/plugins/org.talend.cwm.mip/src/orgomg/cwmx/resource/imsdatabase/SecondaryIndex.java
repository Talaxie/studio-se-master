/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Secondary Index</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type holds the attributes on the relationships between a SegmentComplex instance and the INDEX instances that act as secondary indexes for the DBD (maps to combination of LCHILD and XDFLD statements).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getConstant <em>Constant</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getExitRoutine <em>Exit Routine</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex <em>Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSearchFields <em>Search Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getDdataFields <em>Ddata Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSubseqFields <em>Subseq Fields</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource <em>Index Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex()
 * @model
 * @generated
 */
public interface SecondaryIndex extends ModelElement {

    /**
     * Returns the value of the '<em><b>Constant</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a character string that defines a one-byte self-defining
     * term with which every index pointer segment in a particular secondary
     * index is identified. It is used to identify index pointer segments for a
     * specific secondary index when multiple secondary indexes reside in the
     * same database. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Constant</em>' attribute.
     * @see #setConstant(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_Constant()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getConstant();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getConstant
     * <em>Constant</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Constant</em>' attribute.
     * @see #getConstant()
     * @generated
     */
    void setConstant(String value);

    /**
     * Returns the value of the '<em><b>Exit Routine</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is the name of the executable module that suppresses creation
     * of index pointer segments. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Exit Routine</em>' attribute.
     * @see #setExitRoutine(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_ExitRoutine()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getExitRoutine();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getExitRoutine <em>Exit Routine</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Exit Routine</em>' attribute.
     * @see #getExitRoutine()
     * @generated
     */
    void setExitRoutine(String value);

    /**
     * Returns the value of the '<em><b>Null Value</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a character string that is a one-byte self-defining term.
     * The creation of index pointer segments is suppressed when the specified
     * value is contained in the search field of an index pointer segment. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Null Value</em>' attribute.
     * @see #setNullValue(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_NullValue()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getNullValue();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getNullValue <em>Null Value</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Null Value</em>' attribute.
     * @see #getNullValue()
     * @generated
     */
    void setNullValue(String value);

    /**
     * Returns the value of the '<em><b>Index</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget
     * <em>Secondary Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> The index used in the secondary index
     * relationship. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Index</em>' reference.
     * @see #setIndex(INDEX)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_Index()
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget
     * @model opposite="secondaryTarget" required="true"
     * @generated
     */
    INDEX getIndex();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex <em>Index</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' reference.
     * @see #getIndex()
     * @generated
     */
    void setIndex(INDEX value);

    /**
     * Returns the value of the '<em><b>Segment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSecondaryIndex <em>Secondary Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The segment that is being indexed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Segment</em>' container reference.
     * @see #setSegment(SegmentComplex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_Segment()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSecondaryIndex
     * @model opposite="secondaryIndex" required="true"
     * @generated
     */
    SegmentComplex getSegment();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment <em>Segment</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Segment</em>' container reference.
     * @see #getSegment()
     * @generated
     */
    void setSegment(SegmentComplex value);

    /**
     * Returns the value of the '<em><b>Search Fields</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.Field}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Field#getSearchIndex <em>Search Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The fields used for search fields by the secondary index.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Search Fields</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_SearchFields()
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSearchIndex
     * @model opposite="searchIndex" upper="5"
     * @generated
     */
    EList<Field> getSearchFields();

    /**
     * Returns the value of the '<em><b>Ddata Fields</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.Field}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Field#getDdataIndex <em>Ddata Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fields used for duplicate data in the index relationship.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ddata Fields</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_DdataFields()
     * @see orgomg.cwmx.resource.imsdatabase.Field#getDdataIndex
     * @model opposite="ddataIndex" upper="5"
     * @generated
     */
    EList<Field> getDdataFields();

    /**
     * Returns the value of the '<em><b>Subseq Fields</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.Field}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Field#getSubseqIndex <em>Subseq Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The fields used as subsequence fields by the secondary index.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Subseq Fields</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_SubseqFields()
     * @see orgomg.cwmx.resource.imsdatabase.Field#getSubseqIndex
     * @model opposite="subseqIndex" upper="5"
     * @generated
     */
    EList<Field> getSubseqFields();

    /**
     * Returns the value of the '<em><b>Index Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSourcedIndex <em>Sourced Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The segment that contains the Search, Subsequence and Duplicate data fields for the index relationship.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Index Source</em>' reference.
     * @see #setIndexSource(SegmentComplex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSecondaryIndex_IndexSource()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSourcedIndex
     * @model opposite="sourcedIndex"
     * @generated
     */
    SegmentComplex getIndexSource();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource <em>Index Source</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Index Source</em>' reference.
     * @see #getIndexSource()
     * @generated
     */
    void setIndexSource(SegmentComplex value);

} // SecondaryIndex

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType;
import orgomg.cwmx.resource.imsdatabase.imstypes.PointerType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Segment Complex</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This subclass of Segment supports the full-function features that are limited to HDAM, HIDAM and HISAM databases: specifically logical children and secondary indexes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDeleteFlag <em>Delete Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getInsertFlag <em>Insert Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getReplaceFlag <em>Replace Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSegmPointer <em>Segm Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDsGroup <em>Ds Group</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSecondaryIndex <em>Secondary Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLchild <em>Lchild</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSourcedIndex <em>Sourced Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent <em>Lparent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD <em>Paired LCHILD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset <em>Dataset</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex()
 * @model
 * @generated
 */
public interface SegmentComplex extends Segment {

    /**
     * Returns the value of the '<em><b>Delete Flag</b></em>' attribute. The
     * default value is <code>"76"</code>. The literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the value used for the delete rule. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Delete Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #setDeleteFlag(FlagsType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_DeleteFlag()
     * @model default="76"
     * @generated
     */
    FlagsType getDeleteFlag();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDeleteFlag <em>Delete Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Delete Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #getDeleteFlag()
     * @generated
     */
    void setDeleteFlag(FlagsType value);

    /**
     * Returns the value of the '<em><b>Insert Flag</b></em>' attribute. The
     * default value is <code>"76"</code>. The literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the value used for the insert rule. bidirectional is not
     * used for the insert flag. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Insert Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #setInsertFlag(FlagsType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_InsertFlag()
     * @model default="76"
     * @generated
     */
    FlagsType getInsertFlag();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getInsertFlag <em>Insert Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Insert Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #getInsertFlag()
     * @generated
     */
    void setInsertFlag(FlagsType value);

    /**
     * Returns the value of the '<em><b>Replace Flag</b></em>' attribute. The
     * default value is <code>"76"</code>. The literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the value used for the replace rule. bidirectional is not
     * used for the replace flag. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Replace Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #setReplaceFlag(FlagsType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_ReplaceFlag()
     * @model default="76"
     * @generated
     */
    FlagsType getReplaceFlag();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getReplaceFlag <em>Replace Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Replace Flag</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.FlagsType
     * @see #getReplaceFlag()
     * @generated
     */
    void setReplaceFlag(FlagsType value);

    /**
     * Returns the value of the '<em><b>Segm Pointer</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.PointerType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the string used for pointer keyword value. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Segm Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PointerType
     * @see #setSegmPointer(PointerType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_SegmPointer()
     * @model
     * @generated
     */
    PointerType getSegmPointer();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getSegmPointer <em>Segm Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Segm Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.PointerType
     * @see #getSegmPointer()
     * @generated
     */
    void setSegmPointer(PointerType value);

    /**
     * Returns the value of the '<em><b>Ds Group</b></em>' attribute. The
     * default value is <code>"A"</code>. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> This is used to arrange the
     * segments in a partitioned database in a manner comparable to arranging
     * them within datasets in earlier versions of IMS <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Ds Group</em>' attribute.
     * @see #setDsGroup(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_DsGroup()
     * @model default="A" dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDsGroup();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDsGroup
     * <em>Ds Group</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Ds Group</em>' attribute.
     * @see #getDsGroup()
     * @generated
     */
    void setDsGroup(String value);

    /**
     * Returns the value of the '<em><b>Secondary Index</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment
     * <em>Segment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The secondary index relationships that would be
     * represented as LCHILD/XDFLD statement sets. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Secondary Index</em>' containment reference
     *         list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_SecondaryIndex()
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getSegment
     * @model opposite="segment" containment="true" upper="32"
     * @generated
     */
    EList<SecondaryIndex> getSecondaryIndex();

    /**
     * Returns the value of the '<em><b>Lchild</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.LCHILD}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent
     * <em>Lparent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The relationship to the logical children
     * relationships. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lchild</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_Lchild()
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent
     * @model opposite="lparent" containment="true"
     * @generated
     */
    EList<LCHILD> getLchild();

    /**
     * Returns the value of the '<em><b>Sourced Index</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource <em>Index Source</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The index that uses fields in this segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sourced Index</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_SourcedIndex()
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndexSource
     * @model opposite="indexSource"
     * @generated
     */
    EList<SecondaryIndex> getSourcedIndex();

    /**
     * Returns the value of the '<em><b>Lparent</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild <em>Lchild</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The relationship to the logical parent relationship instance. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Lparent</em>' reference.
     * @see #setLparent(LCHILD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_Lparent()
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild
     * @model opposite="lchild"
     * @generated
     */
    LCHILD getLparent();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent
     * <em>Lparent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Lparent</em>' reference.
     * @see #getLparent()
     * @generated
     */
    void setLparent(LCHILD value);

    /**
     * Returns the value of the '<em><b>Paired LCHILD</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment <em>Paired Segment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The pair relationship to a logical child of the physical parent segment
     * <!-- end-model-doc -->
     * @return the value of the '<em>Paired LCHILD</em>' reference.
     * @see #setPairedLCHILD(LCHILD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_PairedLCHILD()
     * @see orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment
     * @model opposite="pairedSegment"
     * @generated
     */
    LCHILD getPairedLCHILD();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD <em>Paired LCHILD</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Paired LCHILD</em>' reference.
     * @see #getPairedLCHILD()
     * @generated
     */
    void setPairedLCHILD(LCHILD value);

    /**
     * Returns the value of the '<em><b>Dataset</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset#getSegment
     * <em>Segment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Reference to a physical dataset in which this
     * segments physical data is stored. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dataset</em>' reference.
     * @see #setDataset(Dataset)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getSegmentComplex_Dataset()
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getSegment
     * @model opposite="segment"
     * @generated
     */
    Dataset getDataset();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getDataset
     * <em>Dataset</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Dataset</em>' reference.
     * @see #getDataset()
     * @generated
     */
    void setDataset(Dataset value);

} // SegmentComplex

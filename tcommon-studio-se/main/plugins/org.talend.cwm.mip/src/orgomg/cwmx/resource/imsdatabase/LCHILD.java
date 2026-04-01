/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import orgomg.cwm.objectmodel.core.ModelElement;
import orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType;
import orgomg.cwmx.resource.imsdatabase.imstypes.ParentType;
import orgomg.cwmx.resource.imsdatabase.imstypes.RulesType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>LCHILD</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This type holds the attributes that apply to the relationship used to connect a SegmentComplex instance to the SegmentComplex instances for which it is the logical parent (maps to LCHILD statement and to the PARENT keyword on the SEGM statement).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#isCounter <em>Counter</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLcPointer <em>Lc Pointer</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#isLparentFlag <em>Lparent Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLtwin <em>Ltwin</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getRules <em>Rules</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getVirtualParent <em>Virtual Parent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent <em>Lparent</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild <em>Lchild</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment <em>Paired Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD()
 * @model
 * @generated
 */
public interface LCHILD extends ModelElement {

    /**
     * Returns the value of the '<em><b>Counter</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a flag for whether COUNTER keyword is to be used in the
     * POINTER= parameter on the child segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Counter</em>' attribute.
     * @see #setCounter(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_Counter()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCounter();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.LCHILD#isCounter
     * <em>Counter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Counter</em>' attribute.
     * @see #isCounter()
     * @generated
     */
    void setCounter(boolean value);

    /**
     * Returns the value of the '<em><b>Lc Pointer</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a value used in the POINTER keyword on the LCHILD macro
     * to specify amount of pointer fields to be reserved in the logical parent
     * segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lc Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType
     * @see #setLcPointer(ChildPointerType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_LcPointer()
     * @model
     * @generated
     */
    ChildPointerType getLcPointer();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLcPointer <em>Lc Pointer</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lc Pointer</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ChildPointerType
     * @see #getLcPointer()
     * @generated
     */
    void setLcPointer(ChildPointerType value);

    /**
     * Returns the value of the '<em><b>Lparent Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a flag for whether LPARNT keyword is to be used in the
     * POINTER= parameter on the child segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lparent Flag</em>' attribute.
     * @see #setLparentFlag(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_LparentFlag()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isLparentFlag();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#isLparentFlag <em>Lparent Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lparent Flag</em>' attribute.
     * @see #isLparentFlag()
     * @generated
     */
    void setLparentFlag(boolean value);

    /**
     * Returns the value of the '<em><b>Ltwin</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a value to be used in the POINTER= parameter on the child
     * segment in order to specify logical twin pointers.
     * 
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Ltwin</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType
     * @see #setLtwin(LPointerType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_Ltwin()
     * @model
     * @generated
     */
    LPointerType getLtwin();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLtwin <em>Ltwin</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Ltwin</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.LPointerType
     * @see #getLtwin()
     * @generated
     */
    void setLtwin(LPointerType value);

    /**
     * Returns the value of the '<em><b>Rules</b></em>' attribute. The literals
     * are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.RulesType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a value used in the RULES keyword on the LCHILD macro to
     * control the logical twin sequence. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Rules</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RulesType
     * @see #setRules(RulesType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_Rules()
     * @model
     * @generated
     */
    RulesType getRules();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getRules <em>Rules</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Rules</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.RulesType
     * @see #getRules()
     * @generated
     */
    void setRules(RulesType value);

    /**
     * Returns the value of the '<em><b>Virtual Parent</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.ParentType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a value used in the PARENT parameter on the logical child
     * segment to specify whether the concatenated key of the logical parent
     * segment is stored with each logical child segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Virtual Parent</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ParentType
     * @see #setVirtualParent(ParentType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_VirtualParent()
     * @model
     * @generated
     */
    ParentType getVirtualParent();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getVirtualParent <em>Virtual Parent</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Virtual Parent</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.ParentType
     * @see #getVirtualParent()
     * @generated
     */
    void setVirtualParent(ParentType value);

    /**
     * Returns the value of the '<em><b>Lparent</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLchild
     * <em>Lchild</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The segment that represents the parent in a logical
     * parent relationship. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lparent</em>' container reference.
     * @see #setLparent(SegmentComplex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_Lparent()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLchild
     * @model opposite="lchild" required="true"
     * @generated
     */
    SegmentComplex getLparent();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLparent <em>Lparent</em>}' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Lparent</em>' container reference.
     * @see #getLparent()
     * @generated
     */
    void setLparent(SegmentComplex value);

    /**
     * Returns the value of the '<em><b>Lchild</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent
     * <em>Lparent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The child segment in the logical parent relationship.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Lchild</em>' reference.
     * @see #setLchild(SegmentComplex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_Lchild()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getLparent
     * @model opposite="lparent" required="true"
     * @generated
     */
    SegmentComplex getLchild();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getLchild <em>Lchild</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Lchild</em>' reference.
     * @see #getLchild()
     * @generated
     */
    void setLchild(SegmentComplex value);

    /**
     * Returns the value of the '<em><b>Paired Segment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD <em>Paired LCHILD</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The pair relationship to a physical child of the logical parent segment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Paired Segment</em>' reference.
     * @see #setPairedSegment(SegmentComplex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getLCHILD_PairedSegment()
     * @see orgomg.cwmx.resource.imsdatabase.SegmentComplex#getPairedLCHILD
     * @model opposite="pairedLCHILD"
     * @generated
     */
    SegmentComplex getPairedSegment();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.LCHILD#getPairedSegment <em>Paired Segment</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Paired Segment</em>' reference.
     * @see #getPairedSegment()
     * @generated
     */
    void setPairedSegment(SegmentComplex value);

} // LCHILD

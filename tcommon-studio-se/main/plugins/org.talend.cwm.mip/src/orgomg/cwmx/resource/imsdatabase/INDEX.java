/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>INDEX</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of the DBDindex object class represents a DBD user object that can be used to index a HIDAM database or a segment in a HDAM, HIDAM or HISAM database. The indexing relationship maps to the LCHILD statement in the macro language description of an index DBD. An INDEX DBD can also be treated as a normal single-segment DBD.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#isDosCompatibility <em>Dos Compatibility</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#isProtect <em>Protect</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget <em>Primary Target</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget <em>Secondary Target</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharingIndex <em>Sharing Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex <em>Shared Index</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSequencedPCB <em>Sequenced PCB</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX()
 * @model
 * @generated
 */
public interface INDEX extends AccessMethod {

    /**
     * Returns the value of the '<em><b>Dos Compatibility</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This attribute indicates whether the index DBD was created with DLI/DOS
     * with a segment code as part of the prefix. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dos Compatibility</em>' attribute.
     * @see #setDosCompatibility(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_DosCompatibility()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isDosCompatibility();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.INDEX#isDosCompatibility <em>Dos Compatibility</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Dos Compatibility</em>' attribute.
     * @see #isDosCompatibility()
     * @generated
     */
    void setDosCompatibility(boolean value);

    /**
     * Returns the value of the '<em><b>Protect</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is a flag for data integrity in index pointer segments. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Protect</em>' attribute.
     * @see #setProtect(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_Protect()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isProtect();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.INDEX#isProtect <em>Protect</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Protect</em>' attribute.
     * @see #isProtect()
     * @generated
     */
    void setProtect(boolean value);

    /**
     * Returns the value of the '<em><b>Primary Target</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex <em>Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The HIDAM DBD for which this Index is the primary index. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Primary Target</em>' reference.
     * @see #setPrimaryTarget(HIDAM)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_PrimaryTarget()
     * @see orgomg.cwmx.resource.imsdatabase.HIDAM#getIndex
     * @model opposite="index"
     * @generated
     */
    HIDAM getPrimaryTarget();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getPrimaryTarget <em>Primary Target</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Primary Target</em>' reference.
     * @see #getPrimaryTarget()
     * @generated
     */
    void setPrimaryTarget(HIDAM value);

    /**
     * Returns the value of the '<em><b>Secondary Target</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex
     * <em>Index</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The secondary index relationship to a complex
     * segment. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Secondary Target</em>' reference.
     * @see #setSecondaryTarget(SecondaryIndex)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_SecondaryTarget()
     * @see orgomg.cwmx.resource.imsdatabase.SecondaryIndex#getIndex
     * @model opposite="index"
     * @generated
     */
    SecondaryIndex getSecondaryTarget();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSecondaryTarget <em>Secondary Target</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Secondary Target</em>' reference.
     * @see #getSecondaryTarget()
     * @generated
     */
    void setSecondaryTarget(SecondaryIndex value);

    /**
     * Returns the value of the '<em><b>Sharing Index</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.imsdatabase.INDEX}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex <em>Shared Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The second and later Index DBDs that share a dataset.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sharing Index</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_SharingIndex()
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex
     * @model opposite="sharedIndex" upper="16"
     * @generated
     */
    EList<INDEX> getSharingIndex();

    /**
     * Returns the value of the '<em><b>Shared Index</b></em>' reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharingIndex <em>Sharing Index</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The first DBD that defines the Dataset shared by the rest of the index DBDs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Shared Index</em>' reference.
     * @see #setSharedIndex(INDEX)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_SharedIndex()
     * @see orgomg.cwmx.resource.imsdatabase.INDEX#getSharingIndex
     * @model opposite="sharingIndex"
     * @generated
     */
    INDEX getSharedIndex();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.INDEX#getSharedIndex <em>Shared Index</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Shared Index</em>' reference.
     * @see #getSharedIndex()
     * @generated
     */
    void setSharedIndex(INDEX value);

    /**
     * Returns the value of the '<em><b>Sequenced PCB</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.PCB}. It is bidirectional and its
     * opposite is '{@link orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq
     * <em>Proc Seq</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The PCB(s) that use this secondary index for
     * processing sequence. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Sequenced PCB</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getINDEX_SequencedPCB()
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getProcSeq
     * @model opposite="procSeq"
     * @generated
     */
    EList<PCB> getSequencedPCB();

} // INDEX

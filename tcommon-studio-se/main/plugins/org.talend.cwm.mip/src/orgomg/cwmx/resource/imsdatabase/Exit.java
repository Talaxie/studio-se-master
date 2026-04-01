/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Exit</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a Data Capture exit routine, which is specified to enable DB2 applications and end users to access updated IMS data. Data Capture exits can apply to an entire DBD or to a specific segment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isKey <em>Key</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isData <em>Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isPath <em>Path</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isLog <em>Log</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascade <em>Cascade</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeKey <em>Cascade Key</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeData <em>Cascade Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadePath <em>Cascade Path</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#getDbd <em>Dbd</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.Exit#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit()
 * @model
 * @generated
 */
public interface Exit extends ModelElement {

    /**
     * Returns the value of the '<em><b>Key</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Specifies whether the exit routine is passed the physical concatenated
     * key. This key identifies the physical segment updated by the application.
     * A value of TRUE makes to KEY, a value of FALSE maps to NOKEY. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Key</em>' attribute.
     * @see #setKey(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Key()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isKey();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isKey <em>Key</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Key</em>' attribute.
     * @see #isKey()
     * @generated
     */
    void setKey(boolean value);

    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether the physical segment data is passed to the
     * exit routine for updating. When DATA is specified and a Segment
     * Edit/Compression exit routine is also used, the data passed is expanded
     * data. A value of TRUE maps to DATA, a value of FALSE maps to NODATA. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Data()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isData();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isData <em>Data</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #isData()
     * @generated
     */
    void setData(boolean value);

    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether the data from each segment in the physical
     * root?s hierarchical path must be passed to the exit routine for an
     * updated segment. A value of TRUE maps to PATH; a value of FALSE maps to
     * NOPATH. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Path()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isPath();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #isPath()
     * @generated
     */
    void setPath(boolean value);

    /**
     * Returns the value of the '<em><b>Log</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether the data capture control blocks and data
     * should be written to the IMS system log. A value of TRUE maps to LOG; a
     * value of FALSE maps to NOLOG. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Log</em>' attribute.
     * @see #setLog(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Log()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isLog();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isLog <em>Log</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Log</em>' attribute.
     * @see #isLog()
     * @generated
     */
    void setLog(boolean value);

    /**
     * Returns the value of the '<em><b>Cascade</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether the exit routine is called when DL/I deletes
     * this segment because the application deleted a parent segment. Using
     * CASCADE ensures that data is captured for the defined segment. A value of
     * TRUE maps to CASCADE; a value of FALSE maps to NOCASCADE. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Cascade</em>' attribute.
     * @see #setCascade(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Cascade()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCascade();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascade <em>Cascade</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Cascade</em>' attribute.
     * @see #isCascade()
     * @generated
     */
    void setCascade(boolean value);

    /**
     * Returns the value of the '<em><b>Cascade Key</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether to pass the physical concatenated key to the
     * exit. This key identifies the segment being deleted by a cascade delete.
     * A value of TRUE maps to PATH; a value of FALSE maps to NOPATH. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Cascade Key</em>' attribute.
     * @see #setCascadeKey(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_CascadeKey()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCascadeKey();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeKey <em>Cascade Key</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cascade Key</em>' attribute.
     * @see #isCascadeKey()
     * @generated
     */
    void setCascadeKey(boolean value);

    /**
     * Returns the value of the '<em><b>Cascade Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * attribute specifies whether to pass segment data to the exit routine for
     * a cascade delete. DATA also identifies the segment being deleted when the
     * physical concatenated key is unable to do so. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Cascade Data</em>' attribute.
     * @see #setCascadeData(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_CascadeData()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCascadeData();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadeData <em>Cascade Data</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cascade Data</em>' attribute.
     * @see #isCascadeData()
     * @generated
     */
    void setCascadeData(boolean value);

    /**
     * Returns the value of the '<em><b>Cascade Path</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies whether to allow an application to separately access
     * several segments for a cascade delete. A value of TRUE maps to PATH; a
     * value of FALSE maps to NOPATH. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Cascade Path</em>' attribute.
     * @see #setCascadePath(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_CascadePath()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isCascadePath();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#isCascadePath <em>Cascade Path</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Cascade Path</em>' attribute.
     * @see #isCascadePath()
     * @generated
     */
    void setCascadePath(boolean value);

    /**
     * Returns the value of the '<em><b>Dbd</b></em>' container reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBD#getExit <em>Exit</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> DBD
     * that uses and owns this data capture exit. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dbd</em>' container reference.
     * @see #setDbd(DBD)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Dbd()
     * @see orgomg.cwmx.resource.imsdatabase.DBD#getExit
     * @model opposite="exit"
     * @generated
     */
    DBD getDbd();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#getDbd <em>Dbd</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Dbd</em>' container reference.
     * @see #getDbd()
     * @generated
     */
    void setDbd(DBD value);

    /**
     * Returns the value of the '<em><b>Segment</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.Segment#getExit <em>Exit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Segment that uses this data capture exit. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Segment</em>' container reference.
     * @see #setSegment(Segment)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getExit_Segment()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getExit
     * @model opposite="exit"
     * @generated
     */
    Segment getSegment();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.Exit#getSegment <em>Segment</em>}' container reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Segment</em>' container reference.
     * @see #getSegment()
     * @generated
     */
    void setSegment(Segment value);

} // Exit

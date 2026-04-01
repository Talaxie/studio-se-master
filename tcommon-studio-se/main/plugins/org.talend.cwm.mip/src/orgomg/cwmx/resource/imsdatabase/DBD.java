/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.RecordFile;
import orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DBD</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this object class represents an IMS Data Base Description, which is the Root entity for a DBD object.
 * 
 * DBDs describe the organization of data and the pathways by which an application program can retrieve or store Records. A Record within a DBD is called a Segment. Segments are connected by parent-child relationships to create the information hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getDliAccess <em>Dli Access</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#isIsVSAM <em>Is VSAM</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#isPasswordFlag <em>Password Flag</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getVersionString <em>Version String</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod <em>Access Method</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getAcblib <em>Acblib</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getDataset <em>Dataset</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getSegment <em>Segment</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getPcb <em>Pcb</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getExit <em>Exit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.DBD#getLibrary <em>Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD()
 * @model
 * @generated
 */
public interface DBD extends RecordFile {

    /**
     * Returns the value of the '<em><b>Dli Access</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds the access method of the DBD. PSINDEX, PHDAM, and PHIDAM
     * are new valid values added for IMS V6. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Dli Access</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType
     * @see #setDliAccess(AccessMethodType)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_DliAccess()
     * @model
     * @generated
     */
    AccessMethodType getDliAccess();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DBD#getDliAccess <em>Dli Access</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Dli Access</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.AccessMethodType
     * @see #getDliAccess()
     * @generated
     */
    void setDliAccess(AccessMethodType value);

    /**
     * Returns the value of the '<em><b>Is VSAM</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute indicates whether the operating system access method for the
     * DBD is VSAM. It affects the string in the ACCESS keyword in the generated
     * DBD when dliAccess=GSAM, HDAM,or HIDAM. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is VSAM</em>' attribute.
     * @see #setIsVSAM(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_IsVSAM()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsVSAM();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DBD#isIsVSAM <em>Is VSAM</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is VSAM</em>' attribute.
     * @see #isIsVSAM()
     * @generated
     */
    void setIsVSAM(boolean value);

    /**
     * Returns the value of the '<em><b>Password Flag</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute is a flag to indicate whether PASSWD=YES should be specified on
     * the DBD macro. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Password Flag</em>' attribute.
     * @see #setPasswordFlag(boolean)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_PasswordFlag()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isPasswordFlag();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DBD#isPasswordFlag <em>Password Flag</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Password Flag</em>' attribute.
     * @see #isPasswordFlag()
     * @generated
     */
    void setPasswordFlag(boolean value);

    /**
     * Returns the value of the '<em><b>Version String</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This is
     * a 255-character string that is generated with the VERSION keyword to
     * serve as a descriptive label on the DBD. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Version String</em>' attribute.
     * @see #setVersionString(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_VersionString()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getVersionString();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DBD#getVersionString <em>Version String</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Version String</em>' attribute.
     * @see #getVersionString()
     * @generated
     */
    void setVersionString(String value);

    /**
     * Returns the value of the '<em><b>Access Method</b></em>' containment
     * reference. It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd <em>Dbd</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Connection to additional attributes and relationships that apply to a
     * specific access method. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Access Method</em>' containment reference.
     * @see #setAccessMethod(AccessMethod)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_AccessMethod()
     * @see orgomg.cwmx.resource.imsdatabase.AccessMethod#getDbd
     * @model opposite="dbd" containment="true"
     * @generated
     */
    AccessMethod getAccessMethod();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.DBD#getAccessMethod <em>Access Method</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Method</em>' containment reference.
     * @see #getAccessMethod()
     * @generated
     */
    void setAccessMethod(AccessMethod value);

    /**
     * Returns the value of the '<em><b>Acblib</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.imsdatabase.ACBLIB}
     * . It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.ACBLIB#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The ACBLIB(s) in which the DBD is used. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Acblib</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Acblib()
     * @see orgomg.cwmx.resource.imsdatabase.ACBLIB#getDbd
     * @model opposite="dbd"
     * @generated
     */
    EList<ACBLIB> getAcblib();

    /**
     * Returns the value of the '<em><b>Dataset</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.Dataset}. It is bidirectional and
     * its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Dataset#getDbd
     * <em>Dbd</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The set of Dataset instances used by this DBD. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Dataset</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Dataset()
     * @see orgomg.cwmx.resource.imsdatabase.Dataset#getDbd
     * @model opposite="dbd" containment="true"
     * @generated
     */
    EList<Dataset> getDataset();

    /**
     * Returns the value of the '<em><b>Segment</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.Segment}. It is bidirectional and
     * its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Segment#getDbd
     * <em>Dbd</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Segments that are part of this DBD. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Segment</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Segment()
     * @see orgomg.cwmx.resource.imsdatabase.Segment#getDbd
     * @model opposite="dbd" containment="true"
     * @generated
     */
    EList<Segment> getSegment();

    /**
     * Returns the value of the '<em><b>Pcb</b></em>' reference list. The list
     * contents are of type {@link orgomg.cwmx.resource.imsdatabase.PCB}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.PCB#getDbd <em>Dbd</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * PCBs that are based on this DBD. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Pcb</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Pcb()
     * @see orgomg.cwmx.resource.imsdatabase.PCB#getDbd
     * @model opposite="dbd"
     * @generated
     */
    EList<PCB> getPcb();

    /**
     * Returns the value of the '<em><b>Exit</b></em>' containment reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.imsdatabase.Exit}. It is bidirectional and
     * its opposite is '{@link orgomg.cwmx.resource.imsdatabase.Exit#getDbd
     * <em>Dbd</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Data capture exit used by this DBD. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Exit</em>' containment reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Exit()
     * @see orgomg.cwmx.resource.imsdatabase.Exit#getDbd
     * @model opposite="dbd" containment="true"
     * @generated
     */
    EList<Exit> getExit();

    /**
     * Returns the value of the '<em><b>Library</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.imsdatabase.DBDLib}
     * . It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.imsdatabase.DBDLib#getDbd <em>Dbd</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * DBDLIB(s) in which DBD is stored. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Library</em>' reference list.
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getDBD_Library()
     * @see orgomg.cwmx.resource.imsdatabase.DBDLib#getDbd
     * @model opposite="dbd"
     * @generated
     */
    EList<DBDLib> getLibrary();

} // DBD

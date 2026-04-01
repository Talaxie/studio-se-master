/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.resource.record.Field;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>COBOL Item</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The COBOLItem class is an abstract metaclass that represents the commonalities shared by both the COBOLField and Renames metaclasses.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getOccurringField <em>Occurring Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getStatusFD <em>Status FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getLinageInfo <em>Linage Info</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getDependingFD <em>Depending FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getPaddedFD <em>Padded FD</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.coboldata.COBOLItem#getRelativeFD <em>Relative FD</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem()
 * @model abstract="true"
 * @generated
 */
public interface COBOLItem extends Field {

    /**
     * Returns the value of the '<em><b>Occurring Field</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.COBOLField}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField
     * <em>Depending On Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the field that occurs (i.e., the
     * array). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurring Field</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_OccurringField()
     * @see orgomg.cwmx.resource.coboldata.COBOLField#getDependingOnField
     * @model opposite="dependingOnField"
     * @generated
     */
    EList<COBOLField> getOccurringField();

    /**
     * Returns the value of the '<em><b>Status FD</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.coboldata.COBOLFD}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID
     * <em>Status ID</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the COBOLFD instance for which this
     * COBOLItem instance contains status ID information. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Status FD</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_StatusFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getStatusID
     * @model opposite="statusID"
     * @generated
     */
    EList<COBOLFD> getStatusFD();

    /**
     * Returns the value of the '<em><b>Linage Info</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.LinageInfo}. It is bidirectional
     * and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem
     * <em>Cobol Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the linageInfo instances that reference a
     * COBOLItem instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Linage Info</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_LinageInfo()
     * @see orgomg.cwmx.resource.coboldata.LinageInfo#getCobolItem
     * @model opposite="cobolItem"
     * @generated
     */
    EList<LinageInfo> getLinageInfo();

    /**
     * Returns the value of the '<em><b>Depending FD</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD}. It is bidirectional and
     * its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn
     * <em>Depends On</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the COBOLFD instances for which the
     * COBOLItem instance contains the current record size. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Depending FD</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_DependingFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getDependsOn
     * @model opposite="dependsOn"
     * @generated
     */
    EList<COBOLFD> getDependingFD();

    /**
     * Returns the value of the '<em><b>Padded FD</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwmx.resource.coboldata.COBOLFD}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.coboldata.COBOLFD#getPadField
     * <em>Pad Field</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the COBOLFD instance that is padded by
     * this field. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Padded FD</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_PaddedFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getPadField
     * @model opposite="padField"
     * @generated
     */
    EList<COBOLFD> getPaddedFD();

    /**
     * Returns the value of the '<em><b>Relative FD</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.coboldata.COBOLFD}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField <em>Relative Field</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the COBOLFD instances for which this COBOLField instance acts as a relative record offset.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Relative FD</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getCOBOLItem_RelativeFD()
     * @see orgomg.cwmx.resource.coboldata.COBOLFD#getRelativeField
     * @model opposite="relativeField"
     * @generated
     */
    EList<COBOLFD> getRelativeFD();

} // COBOLItem

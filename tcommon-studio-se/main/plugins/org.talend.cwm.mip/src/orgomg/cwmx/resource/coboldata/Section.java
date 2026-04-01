/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.coboldata;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.Classifier;
import orgomg.cwm.resource.record.RecordDef;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Section</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of Section describe the various sections of a COBOL Data Division.  Section instances are use primarily as collection containers for the RecordDefs that a Section may contain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.coboldata.Section#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends Classifier {

    /**
     * Returns the value of the '<em><b>Record</b></em>' reference list. The
     * list contents are of type {@link orgomg.cwm.resource.record.RecordDef}.
     * It is bidirectional and its opposite is '
     * {@link orgomg.cwm.resource.record.RecordDef#getSection <em>Section</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the RecordDef instances that are defined in the Section
     * instance. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Record</em>' reference list.
     * @see orgomg.cwmx.resource.coboldata.CoboldataPackage#getSection_Record()
     * @see orgomg.cwm.resource.record.RecordDef#getSection
     * @model opposite="section"
     * @generated
     */
    EList<RecordDef> getRecord();

} // Section

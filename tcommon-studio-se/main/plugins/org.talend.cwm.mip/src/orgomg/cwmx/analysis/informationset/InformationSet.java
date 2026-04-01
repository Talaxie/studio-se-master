/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.analysis.olap.Schema;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Information Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InformationSet contains all elements comprising an InformationSet database model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InformationSet#getVersion <em>Version</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InformationSet#getRule <em>Rule</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InformationSet#getInfoSetAdmin <em>Info Set Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInformationSet()
 * @model
 * @generated
 */
public interface InformationSet extends Schema {

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * version of an Information Set. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInformationSet_Version()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.analysis.informationset.InformationSet#getVersion
     * <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Rule</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.analysis.informationset.Rule}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationset.Rule#getInformationSet <em>Information Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Rule for an InformationSet.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rule</em>' reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInformationSet_Rule()
     * @see orgomg.cwmx.analysis.informationset.Rule#getInformationSet
     * @model opposite="informationSet"
     * @generated
     */
    EList<Rule> getRule();

    /**
     * Returns the value of the '<em><b>Info Set Admin</b></em>' containment reference list.
     * The list contents are of type {@link orgomg.cwmx.analysis.informationset.InfoSetAdministration}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet <em>Information Set</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Administrative details for an InformationSet.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Info Set Admin</em>' containment reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInformationSet_InfoSetAdmin()
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet
     * @model opposite="informationSet" containment="true"
     * @generated
     */
    EList<InfoSetAdministration> getInfoSetAdmin();

} // InformationSet

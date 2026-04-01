/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.analysis.informationset;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Info Set Administration</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents administrative details of an Information Set.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getPriority <em>Priority</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#isAcknowledgement <em>Acknowledgement</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet <em>Information Set</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetAdministration()
 * @model
 * @generated
 */
public interface InfoSetAdministration extends ModelElement {

    /**
     * Returns the value of the '<em><b>Priority</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * priority of an Information Set. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #setPriority(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetAdministration_Priority()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPriority();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getPriority
     * <em>Priority</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Priority</em>' attribute.
     * @see #getPriority()
     * @generated
     */
    void setPriority(String value);

    /**
     * Returns the value of the '<em><b>Acknowledgement</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * true, an acknowledgement is requested. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Acknowledgement</em>' attribute.
     * @see #setAcknowledgement(boolean)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetAdministration_Acknowledgement()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isAcknowledgement();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#isAcknowledgement <em>Acknowledgement</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Acknowledgement</em>' attribute.
     * @see #isAcknowledgement()
     * @generated
     */
    void setAcknowledgement(boolean value);

    /**
     * Returns the value of the '<em><b>Information Set</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationset.InformationSet#getInfoSetAdmin <em>Info Set Admin</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * InformationSet for adminstrative details.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Information Set</em>' container reference.
     * @see #setInformationSet(InformationSet)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetAdministration_InformationSet()
     * @see orgomg.cwmx.analysis.informationset.InformationSet#getInfoSetAdmin
     * @model opposite="infoSetAdmin" required="true"
     * @generated
     */
    InformationSet getInformationSet();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getInformationSet <em>Information Set</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Information Set</em>' container reference.
     * @see #getInformationSet()
     * @generated
     */
    void setInformationSet(InformationSet value);

    /**
     * Returns the value of the '<em><b>Date</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.analysis.informationset.InfoSetDate}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getInfoSetAdmin <em>Info Set Admin</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Date for administration details.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Date</em>' reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetAdministration_Date()
     * @see orgomg.cwmx.analysis.informationset.InfoSetDate#getInfoSetAdmin
     * @model opposite="infoSetAdmin"
     * @generated
     */
    EList<InfoSetDate> getDate();

} // InfoSetAdministration

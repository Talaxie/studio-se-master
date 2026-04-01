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
 * <em><b>Info Set Date</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents dates relevant to an InformationSet such as date of dissemination
 * or receipt. It can have different formats.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getType <em>Type</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getFormat <em>Format</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getInfoSetAdmin <em>Info Set Admin</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetDate()
 * @model
 * @generated
 */
public interface InfoSetDate extends ModelElement {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Type of
     * date, e.g. date of creation, validity period. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetDate_Type()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link orgomg.cwmx.analysis.informationset.InfoSetDate#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Format</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Format
     * of date, time or period. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Format</em>' attribute.
     * @see #setFormat(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetDate_Format()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getFormat();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.analysis.informationset.InfoSetDate#getFormat
     * <em>Format</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Format</em>' attribute.
     * @see #getFormat()
     * @generated
     */
    void setFormat(String value);

    /**
     * Returns the value of the '<em><b>Date Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A date,
     * time or period. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Date Time</em>' attribute.
     * @see #setDateTime(String)
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetDate_DateTime()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getDateTime();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.analysis.informationset.InfoSetDate#getDateTime
     * <em>Date Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Date Time</em>' attribute.
     * @see #getDateTime()
     * @generated
     */
    void setDateTime(String value);

    /**
     * Returns the value of the '<em><b>Info Set Admin</b></em>' reference list.
     * The list contents are of type
     * {@link orgomg.cwmx.analysis.informationset.InfoSetAdministration}. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwmx.analysis.informationset.InfoSetAdministration#getDate
     * <em>Date</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Adminstration details owning the date. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Info Set Admin</em>' reference list.
     * @see orgomg.cwmx.analysis.informationset.InformationsetPackage#getInfoSetDate_InfoSetAdmin()
     * @see orgomg.cwmx.analysis.informationset.InfoSetAdministration#getDate
     * @model opposite="date" required="true"
     * @generated
     */
    EList<InfoSetAdministration> getInfoSetAdmin();

} // InfoSetDate

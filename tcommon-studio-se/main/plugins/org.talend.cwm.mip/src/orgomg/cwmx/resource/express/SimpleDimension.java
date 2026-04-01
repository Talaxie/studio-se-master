/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.Classifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Simple Dimension</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This represents an Express simple dimension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getWidth <em>Width</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#isIsTime <em>Is Time</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getBeginningPhase <em>Beginning Phase</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getEndingPhase <em>Ending Phase</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getSearchAlgorithm <em>Search Algorithm</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getPageSpace <em>Page Space</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getAliasDimension <em>Alias Dimension</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.SimpleDimension#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension()
 * @model
 * @generated
 */
public interface SimpleDimension extends Dimension {

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * specified, this defines a fixed width, in bytes, for the storage area for
     * each value of the SimpleDimension. Fixed widths can be specified for TEXT
     * dimensions only. Valid width values are 1 through 256. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Width</em>' attribute.
     * @see #setWidth(long)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_Width()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getWidth();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.SimpleDimension#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Width</em>' attribute.
     * @see #getWidth()
     * @generated
     */
    void setWidth(long value);

    /**
     * Returns the value of the '<em><b>Is Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If set,
     * indicates that the SimpleDimension is a time dimension. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Time</em>' attribute.
     * @see #setIsTime(boolean)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_IsTime()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsTime();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.express.SimpleDimension#isIsTime
     * <em>Is Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Is Time</em>' attribute.
     * @see #isIsTime()
     * @generated
     */
    void setIsTime(boolean value);

    /**
     * Returns the value of the '<em><b>Multiple</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * may be used for SimpleDimensions whose data type is WEEK or MONTH, to
     * define time periods that span a multiple number of weeks or months. With
     * the WEEK data type, multiple can be an integer from 2 to 52. With the
     * MONTH data type, multiple can be 2, 3, 4, or 6. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Multiple</em>' attribute.
     * @see #setMultiple(long)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_Multiple()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getMultiple();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.express.SimpleDimension#getMultiple
     * <em>Multiple</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Multiple</em>' attribute.
     * @see #getMultiple()
     * @generated
     */
    void setMultiple(long value);

    /**
     * Returns the value of the '<em><b>Beginning Phase</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * This may be used for any time data type except DAY, to specify the
     * beginning phase of the Dimension. For single weeks, beginningPhase can be
     * a day of the week or a date. For multiple weeks, beginningPhase must be a
     * date. For months, quarters, or years, beginningPhase must be a month,
     * expressed as a month name or as a date. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Beginning Phase</em>' attribute.
     * @see #setBeginningPhase(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_BeginningPhase()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getBeginningPhase();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.SimpleDimension#getBeginningPhase <em>Beginning Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Beginning Phase</em>' attribute.
     * @see #getBeginningPhase()
     * @generated
     */
    void setBeginningPhase(String value);

    /**
     * Returns the value of the '<em><b>Ending Phase</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * may be used for any time data type except DAY, to specify the ending
     * phase of the Dimension. For single weeks, endingPhase can be a day of the
     * week or a date. For multiple weeks, endingPhase must be a date. For
     * months, quarters, or years, endingPhase must be a month, expressed as a
     * month name or as a date. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Ending Phase</em>' attribute.
     * @see #setEndingPhase(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_EndingPhase()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getEndingPhase();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.SimpleDimension#getEndingPhase <em>Ending Phase</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Ending Phase</em>' attribute.
     * @see #getEndingPhase()
     * @generated
     */
    void setEndingPhase(String value);

    /**
     * Returns the value of the '<em><b>Search Algorithm</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates the type of algorithm Express should use for loading and
     * accessing the values of the SimpleDimension. The valid values are HASH,
     * BTREE. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Search Algorithm</em>' attribute.
     * @see #setSearchAlgorithm(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_SearchAlgorithm()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getSearchAlgorithm();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.SimpleDimension#getSearchAlgorithm <em>Search Algorithm</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Search Algorithm</em>' attribute.
     * @see #getSearchAlgorithm()
     * @generated
     */
    void setSearchAlgorithm(String value);

    /**
     * Returns the value of the '<em><b>Page Space</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * specified, this defines the type of page space to be allocated to values
     * of the SimpleDimension:
     * 
     * OWNSPACE specifies that the data will be stored in private page space.
     * SHAREDSPACE specifies that the data will be stored in the database?s
     * global page space. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Page Space</em>' attribute.
     * @see #setPageSpace(String)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_PageSpace()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getPageSpace();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.express.SimpleDimension#getPageSpace <em>Page Space</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Page Space</em>' attribute.
     * @see #getPageSpace()
     * @generated
     */
    void setPageSpace(String value);

    /**
     * Returns the value of the '<em><b>Alias Dimension</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.express.AliasDimension}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.express.AliasDimension#getBaseDimension <em>Base Dimension</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies an AliasDimension that is based on the SimpleDimension.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Alias Dimension</em>' reference list.
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_AliasDimension()
     * @see orgomg.cwmx.resource.express.AliasDimension#getBaseDimension
     * @model opposite="baseDimension"
     * @generated
     */
    EList<AliasDimension> getAliasDimension();

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.objectmodel.core.Classifier#getSimpleDimension
     * <em>Simple Dimension</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the data type for the
     * SimpleDimension. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(Classifier)
     * @see orgomg.cwmx.resource.express.ExpressPackage#getSimpleDimension_DataType()
     * @see orgomg.cwm.objectmodel.core.Classifier#getSimpleDimension
     * @model opposite="simpleDimension" required="true"
     * @generated
     */
    Classifier getDataType();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.express.SimpleDimension#getDataType
     * <em>Data Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(Classifier value);

} // SimpleDimension

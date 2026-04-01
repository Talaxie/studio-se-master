/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.imsdatabase;

import orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>MSDB</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DBD with access=MSDB (Mass Storage Data Base) has msdbField and msdbType information instead of physical datasaet information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbField <em>Msdb Field</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbType <em>Msdb Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getMSDB()
 * @model
 * @generated
 */
public interface MSDB extends AccessMethod {

    /**
     * Returns the value of the '<em><b>Msdb Field</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute holds a search field name for a Mass Storage Data Base.
     * 
     * Update Constraints
     * 
     * A string is required in msdbField when msdbType=FIXED, TERM,or DYNAMIC
     * for the DBD user object to be valid. The string in msdbField must not be
     * the same as the name on any FIELD statement in this DBD. msdbField must
     * be null when msdbType=NO. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Msdb Field</em>' attribute.
     * @see #setMsdbField(String)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getMSDB_MsdbField()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getMsdbField();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbField <em>Msdb Field</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Msdb Field</em>' attribute.
     * @see #getMsdbField()
     * @generated
     */
    void setMsdbField(String value);

    /**
     * Returns the value of the '<em><b>Msdb Type</b></em>' attribute. The
     * literals are from the enumeration
     * {@link orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * attribute specifies the type of Mass Storage Data Base. It may be NO
     * (nonterminal-related without terminal-related keys which has key and
     * sequence field as part of the segment), FIXED (terminal-related fixed),
     * TERM (nonterminal-related with terminal-related keys), DYNAMIC
     * (terminal-related dynamic) or null <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Msdb Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype
     * @see #setMsdbType(MSDBtype)
     * @see orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage#getMSDB_MsdbType()
     * @model
     * @generated
     */
    MSDBtype getMsdbType();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.imsdatabase.MSDB#getMsdbType
     * <em>Msdb Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Msdb Type</em>' attribute.
     * @see orgomg.cwmx.resource.imsdatabase.imstypes.MSDBtype
     * @see #getMsdbType()
     * @generated
     */
    void setMsdbType(MSDBtype value);

} // MSDB

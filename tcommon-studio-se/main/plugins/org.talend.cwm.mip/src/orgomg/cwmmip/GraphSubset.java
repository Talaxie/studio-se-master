/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph Subset</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GraphSubset is a concrete subclass of Projection that allows a projection to be specified by an expression which, when evaluated, describes some physical sub-graph of the CWM UML model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.GraphSubset#getElement <em>Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.GraphSubset#isDeepCopy <em>Deep Copy</em>}</li>
 *   <li>{@link orgomg.cwmmip.GraphSubset#getCopyDepth <em>Copy Depth</em>}</li>
 *   <li>{@link orgomg.cwmmip.GraphSubset#isAggregationsOnly <em>Aggregations Only</em>}</li>
 *   <li>{@link orgomg.cwmmip.GraphSubset#isIncludeAssociations <em>Include Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset()
 * @model
 * @generated
 */
public interface GraphSubset extends Projection {

    /**
     * Returns the value of the '<em><b>Element</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Element
     * is the logical name of a CWM metamodel element (usually a package or
     * class) comprising the physical projection. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Element</em>' attribute.
     * @see #setElement(String)
     * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset_Element()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getElement();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.GraphSubset#getElement
     * <em>Element</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Element</em>' attribute.
     * @see #getElement()
     * @generated
     */
    void setElement(String value);

    /**
     * Returns the value of the '<em><b>Deep Copy</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * DeepCopy is a Boolean attribute which, when true, implies that all
     * connected elements and their attributes, within the boundaries of the
     * specified package, are to be included in the pattern projection. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Deep Copy</em>' attribute.
     * @see #setDeepCopy(boolean)
     * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset_DeepCopy()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isDeepCopy();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.GraphSubset#isDeepCopy
     * <em>Deep Copy</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Deep Copy</em>' attribute.
     * @see #isDeepCopy()
     * @generated
     */
    void setDeepCopy(boolean value);

    /**
     * Returns the value of the '<em><b>Copy Depth</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * CopyDepth is an integer value that specifies the number of graph edges to
     * traverse when establishing the physical graph projection, in cases when
     * deepCopy is false. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Copy Depth</em>' attribute.
     * @see #setCopyDepth(long)
     * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset_CopyDepth()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getCopyDepth();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.GraphSubset#getCopyDepth <em>Copy Depth</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Copy Depth</em>' attribute.
     * @see #getCopyDepth()
     * @generated
     */
    void setCopyDepth(long value);

    /**
     * Returns the value of the '<em><b>Aggregations Only</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * AggregationsOnly is a Boolean attribute which, when true, specifies that
     * only composite elements and their components are to be included in the
     * physical graph projection. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Aggregations Only</em>' attribute.
     * @see #setAggregationsOnly(boolean)
     * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset_AggregationsOnly()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isAggregationsOnly();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.GraphSubset#isAggregationsOnly <em>Aggregations Only</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Aggregations Only</em>' attribute.
     * @see #isAggregationsOnly()
     * @generated
     */
    void setAggregationsOnly(boolean value);

    /**
     * Returns the value of the '<em><b>Include Associations</b></em>'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> IncludeAssociations is a Boolean attribute which,
     * when true, specifies that associations are to be included in the physical
     * graph projection. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Include Associations</em>' attribute.
     * @see #setIncludeAssociations(boolean)
     * @see orgomg.cwmmip.CwmmipPackage#getGraphSubset_IncludeAssociations()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIncludeAssociations();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.GraphSubset#isIncludeAssociations <em>Include Associations</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Include Associations</em>' attribute.
     * @see #isIncludeAssociations()
     * @generated
     */
    void setIncludeAssociations(boolean value);

} // GraphSubset

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.objectmodel.core.Element;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Interchange Pattern</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InterchangePattern formally describes a CWM Metadata Interchange pattern. Such a pattern may describe the content of one or more instances of UnitOfInterchange referenced by InterchangePattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getName <em>Name</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getVersion <em>Version</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getUri <em>Uri</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getClassification <em>Classification</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getCategory <em>Category</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getProjection <em>Projection</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getUnitOfInterchange <em>Unit Of Interchange</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getComponentPattern <em>Component Pattern</em>}</li>
 *   <li>{@link orgomg.cwmmip.InterchangePattern#getCompositePattern <em>Composite Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern()
 * @model
 * @generated
 */
public interface InterchangePattern extends Element {

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * name of the interchange pattern. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Name()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
     * version of the interchange pattern. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Version()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Uri</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A URI
     * identifying a human-readable pattern specfication document that describes
     * the interchange pattern. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Uri</em>' attribute.
     * @see #setUri(String)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Uri()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getUri();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getUri <em>Uri</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Uri</em>' attribute.
     * @see #getUri()
     * @generated
     */
    void setUri(String value);

    /**
     * Returns the value of the '<em><b>Classification</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the structural classification of the pattern: Micro Pattern,
     * Domain Pattern, Macro Pattern. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Classification</em>' attribute.
     * @see #setClassification(String)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Classification()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getClassification();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getClassification <em>Classification</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Classification</em>' attribute.
     * @see #getClassification()
     * @generated
     */
    void setClassification(String value);

    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the usage category of the pattern: Mapping, Typing, Extension,
     * Interpretation, Generation, Structural. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Category</em>' attribute.
     * @see #setCategory(String)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Category()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCategory();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' attribute.
     * @see #getCategory()
     * @generated
     */
    void setCategory(String value);

    /**
     * Returns the value of the '<em><b>Projection</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> An object-valued array of type Projection that
     * describes the metamodel graph subset defining the semantic context of the
     * pattern. If this attribute contains more than one value, then the
     * complete projection of the pattern is the graph union of multiple
     * projection object values. This attribute has a multiplicity of 1..*. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Projection</em>' containment reference.
     * @see #setProjection(Projection)
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_Projection()
     * @model containment="true"
     * @generated
     */
    Projection getProjection();

    /**
     * Sets the value of the '{@link orgomg.cwmmip.InterchangePattern#getProjection <em>Projection</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Projection</em>' containment reference.
     * @see #getProjection()
     * @generated
     */
    void setProjection(Projection value);

    /**
     * Returns the value of the '<em><b>Unit Of Interchange</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.UnitOfInterchange}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.UnitOfInterchange#getInterchangePattern <em>Interchange Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Of Interchange</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit Of Interchange</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_UnitOfInterchange()
     * @see orgomg.cwmmip.UnitOfInterchange#getInterchangePattern
     * @model opposite="interchangePattern"
     * @generated
     */
    EList<UnitOfInterchange> getUnitOfInterchange();

    /**
     * Returns the value of the '<em><b>Component Pattern</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.InterchangePattern}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.InterchangePattern#getCompositePattern <em>Composite Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Component Pattern</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component Pattern</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_ComponentPattern()
     * @see orgomg.cwmmip.InterchangePattern#getCompositePattern
     * @model opposite="compositePattern"
     * @generated
     */
    EList<InterchangePattern> getComponentPattern();

    /**
     * Returns the value of the '<em><b>Composite Pattern</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmmip.InterchangePattern}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmmip.InterchangePattern#getComponentPattern <em>Component Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composite Pattern</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composite Pattern</em>' reference list.
     * @see orgomg.cwmmip.CwmmipPackage#getInterchangePattern_CompositePattern()
     * @see orgomg.cwmmip.InterchangePattern#getComponentPattern
     * @model opposite="componentPattern"
     * @generated
     */
    EList<InterchangePattern> getCompositePattern();

} // InterchangePattern

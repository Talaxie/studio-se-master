/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import org.eclipse.emf.common.util.EList;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.Field;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Item</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of DataItem represent the individual data fields within a DataSet. The Group class in the CWM Foundation?s DataTypes package is also available for constructing collections of fields in a DataSet.
 * 
 * The interpretation of the contents of some attributes of a DataItem instance are dependent upon the DataItem?s type. For example, the size attribute represents the maximum number of characters in ALPHA and KANJI items, the number of digits of
 * precision in a NUMERIC or REAL items, and the number of bits in a FIELD item. Refer to the definition of individual attributes for specifics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getSize <em>Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsSigned <em>Is Signed</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getVirtualExpression <em>Virtual Expression</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsKanji <em>Is Kanji</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getCcsVersion <em>Ccs Version</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosLiteral <em>Is Gemcos Literal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosData <em>Is Gemcos Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosSSN <em>Is Gemcos SSN</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosDBSN <em>Is Gemcos DBSN</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsProgram <em>Is Coms Program</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsID <em>Is Coms ID</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsLocator <em>Is Coms Locator</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsOutpQ <em>Is Coms Outp Q</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getOccuringDataItem <em>Occuring Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem <em>Occurs Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getKeyDataSet <em>Key Data Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getFieldBit <em>Field Bit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.DataItem#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem()
 * @model
 * @generated
 */
public interface DataItem extends Field {

    /**
     * Returns the value of the '<em><b>Null Value</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies a value of a data item that is treated as
     * representing a null value. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Null Value</em>' containment reference.
     * @see #setNullValue(ExpressionNode)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_NullValue()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getNullValue();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getNullValue <em>Null Value</em>}' containment reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Null Value</em>' containment reference.
     * @see #getNullValue()
     * @generated
     */
    void setNullValue(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Is Required</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the data item must have a value when the corresponding Dataset
     * record is stored. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Required</em>' attribute.
     * @see #setIsRequired(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsRequired()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsRequired();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsRequired <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Required</em>' attribute.
     * @see #isIsRequired()
     * @generated
     */
    void setIsRequired(boolean value);

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the declared size of a data type. The precise meaning of the
     * attribute depends on the type of the DMS II data type being declared.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(long)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_Size()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getSize();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(long value);

    /**
     * Returns the value of the '<em><b>Scale Factor</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the <scale factor> value for DMS II data types. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Scale Factor</em>' attribute.
     * @see #setScaleFactor(long)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_ScaleFactor()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getScaleFactor();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getScaleFactor <em>Scale Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Scale Factor</em>' attribute.
     * @see #getScaleFactor()
     * @generated
     */
    void setScaleFactor(long value);

    /**
     * Returns the value of the '<em><b>Is Signed</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Contains the state of the signed indication ("S") for REAL and NUMERIC
     * data types. Not relevant for other data types. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Signed</em>' attribute.
     * @see #setIsSigned(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsSigned()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsSigned();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsSigned <em>Is Signed</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Signed</em>' attribute.
     * @see #isIsSigned()
     * @generated
     */
    void setIsSigned(boolean value);

    /**
     * Returns the value of the '<em><b>Occurs</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Indicates the number of times the data item occurs in the DataSet record.
     * The occurs attribute is optional, existing only for data items that have
     * an OCCURS clause in their definition. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs</em>' attribute.
     * @see #setOccurs(long)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_Occurs()
     * @model dataType="orgomg.cwm.objectmodel.core.Integer"
     * @generated
     */
    long getOccurs();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getOccurs <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Occurs</em>' attribute.
     * @see #getOccurs()
     * @generated
     */
    void setOccurs(long value);

    /**
     * Returns the value of the '<em><b>Is Virtual</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance is calculated when accessed using the
     * expression stored in the virtualExpression attribute. <!-- end-model-doc
     * -->
     * 
     * @return the value of the '<em>Is Virtual</em>' attribute.
     * @see #setIsVirtual(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsVirtual()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsVirtual();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Virtual</em>' attribute.
     * @see #isIsVirtual()
     * @generated
     */
    void setIsVirtual(boolean value);

    /**
     * Returns the value of the '<em><b>Virtual Expression</b></em>' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> The expression used to calculate the value of a
     * virtual DataItem. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Virtual Expression</em>' containment
     *         reference.
     * @see #setVirtualExpression(ExpressionNode)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_VirtualExpression()
     * @model containment="true"
     * @generated
     */
    ExpressionNode getVirtualExpression();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getVirtualExpression <em>Virtual Expression</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual Expression</em>' containment reference.
     * @see #getVirtualExpression()
     * @generated
     */
    void setVirtualExpression(ExpressionNode value);

    /**
     * Returns the value of the '<em><b>Is Kanji</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> True if
     * the USAGE=KANJI clause was used. Otherwise USAGE=EBCDIC is assumed.
     * Relevant only for ALPHA data items. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Kanji</em>' attribute.
     * @see #setIsKanji(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsKanji()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsKanji();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsKanji <em>Is Kanji</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Kanji</em>' attribute.
     * @see #isIsKanji()
     * @generated
     */
    void setIsKanji(boolean value);

    /**
     * Returns the value of the '<em><b>Ccs Version</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * Identifies the CCSVersion specification of a data item. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Ccs Version</em>' attribute.
     * @see #setCcsVersion(String)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_CcsVersion()
     * @model dataType="orgomg.cwm.objectmodel.core.String"
     * @generated
     */
    String getCcsVersion();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getCcsVersion <em>Ccs Version</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Ccs Version</em>' attribute.
     * @see #getCcsVersion()
     * @generated
     */
    void setCcsVersion(String value);

    /**
     * Returns the value of the '<em><b>Is Gemcos Literal</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the GEMCOS LITERAL clause.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Gemcos Literal</em>' attribute.
     * @see #setIsGemcosLiteral(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsGemcosLiteral()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGemcosLiteral();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosLiteral <em>Is Gemcos Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Gemcos Literal</em>' attribute.
     * @see #isIsGemcosLiteral()
     * @generated
     */
    void setIsGemcosLiteral(boolean value);

    /**
     * Returns the value of the '<em><b>Is Gemcos Data</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the GEMCOS DATA clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Gemcos Data</em>' attribute.
     * @see #setIsGemcosData(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsGemcosData()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGemcosData();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosData <em>Is Gemcos Data</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Gemcos Data</em>' attribute.
     * @see #isIsGemcosData()
     * @generated
     */
    void setIsGemcosData(boolean value);

    /**
     * Returns the value of the '<em><b>Is Gemcos SSN</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the GEMCOS SSN clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Gemcos SSN</em>' attribute.
     * @see #setIsGemcosSSN(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsGemcosSSN()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGemcosSSN();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosSSN <em>Is Gemcos SSN</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Gemcos SSN</em>' attribute.
     * @see #isIsGemcosSSN()
     * @generated
     */
    void setIsGemcosSSN(boolean value);

    /**
     * Returns the value of the '<em><b>Is Gemcos DBSN</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the GEMCOS DBSN clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Gemcos DBSN</em>' attribute.
     * @see #setIsGemcosDBSN(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsGemcosDBSN()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsGemcosDBSN();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsGemcosDBSN <em>Is Gemcos DBSN</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Gemcos DBSN</em>' attribute.
     * @see #isIsGemcosDBSN()
     * @generated
     */
    void setIsGemcosDBSN(boolean value);

    /**
     * Returns the value of the '<em><b>Is Coms Program</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the COMS PROGRAM clause.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Coms Program</em>' attribute.
     * @see #setIsComsProgram(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsComsProgram()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsComsProgram();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsProgram <em>Is Coms Program</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Coms Program</em>' attribute.
     * @see #isIsComsProgram()
     * @generated
     */
    void setIsComsProgram(boolean value);

    /**
     * Returns the value of the '<em><b>Is Coms ID</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the COMS ID clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Coms ID</em>' attribute.
     * @see #setIsComsID(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsComsID()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsComsID();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsID <em>Is Coms ID</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Coms ID</em>' attribute.
     * @see #isIsComsID()
     * @generated
     */
    void setIsComsID(boolean value);

    /**
     * Returns the value of the '<em><b>Is Coms Locator</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the COMS LOCATOR clause.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Is Coms Locator</em>' attribute.
     * @see #setIsComsLocator(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsComsLocator()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsComsLocator();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsLocator <em>Is Coms Locator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Coms Locator</em>' attribute.
     * @see #isIsComsLocator()
     * @generated
     */
    void setIsComsLocator(boolean value);

    /**
     * Returns the value of the '<em><b>Is Coms Outp Q</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
     * True, the DataItem instance was defined with the COMS OUTPQ clause. <!--
     * end-model-doc -->
     * 
     * @return the value of the '<em>Is Coms Outp Q</em>' attribute.
     * @see #setIsComsOutpQ(boolean)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_IsComsOutpQ()
     * @model dataType="orgomg.cwm.objectmodel.core.Boolean"
     * @generated
     */
    boolean isIsComsOutpQ();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#isIsComsOutpQ <em>Is Coms Outp Q</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Is Coms Outp Q</em>' attribute.
     * @see #isIsComsOutpQ()
     * @generated
     */
    void setIsComsOutpQ(boolean value);

    /**
     * Returns the value of the '<em><b>Occuring Data Item</b></em>' reference
     * list. The list contents are of type
     * {@link orgomg.cwmx.resource.dmsii.DataItem}. It is bidirectional and its
     * opposite is '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem
     * <em>Occurs Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the occurring DataItem (i.e., the
     * array). <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occuring Data Item</em>' reference list.
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_OccuringDataItem()
     * @see orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem
     * @model opposite="occursDataItem"
     * @generated
     */
    EList<DataItem> getOccuringDataItem();

    /**
     * Returns the value of the '<em><b>Occurs Data Item</b></em>' reference. It
     * is bidirectional and its opposite is '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getOccuringDataItem
     * <em>Occuring Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * --> <!-- begin-model-doc --> Identifies the DataItem that contains the
     * number of elements in the array. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Occurs Data Item</em>' reference.
     * @see #setOccursDataItem(DataItem)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_OccursDataItem()
     * @see orgomg.cwmx.resource.dmsii.DataItem#getOccuringDataItem
     * @model opposite="occuringDataItem"
     * @generated
     */
    DataItem getOccursDataItem();

    /**
     * Sets the value of the '{@link orgomg.cwmx.resource.dmsii.DataItem#getOccursDataItem <em>Occurs Data Item</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param value the new value of the '<em>Occurs Data Item</em>' reference.
     * @see #getOccursDataItem()
     * @generated
     */
    void setOccursDataItem(DataItem value);

    /**
     * Returns the value of the '<em><b>Key Data Set</b></em>' reference list.
     * The list contents are of type {@link orgomg.cwmx.resource.dmsii.Set}.
     * It is bidirectional and its opposite is '{@link orgomg.cwmx.resource.dmsii.Set#getKeyDataItem <em>Key Data Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the Set instances in which this DataItem instance participates in the Set's key data.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Key Data Set</em>' reference list.
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_KeyDataSet()
     * @see orgomg.cwmx.resource.dmsii.Set#getKeyDataItem
     * @model opposite="keyDataItem"
     * @generated
     */
    EList<Set> getKeyDataSet();

    /**
     * Returns the value of the '<em><b>Field Bit</b></em>' containment
     * reference list. The list contents are of type
     * {@link orgomg.cwmx.resource.dmsii.FieldBit}. It is bidirectional and its
     * opposite is '{@link orgomg.cwmx.resource.dmsii.FieldBit#getDataItem
     * <em>Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the FieldBits for a dataItem whose type is
     * BIT. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Field Bit</em>' containment reference list.
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_FieldBit()
     * @see orgomg.cwmx.resource.dmsii.FieldBit#getDataItem
     * @model opposite="dataItem" containment="true" upper="48"
     * @generated
     */
    EList<FieldBit> getFieldBit();

    /**
     * Returns the value of the '<em><b>Structure</b></em>' reference. It is
     * bidirectional and its opposite is '
     * {@link orgomg.cwm.objectmodel.core.StructuralFeature#getDataItem
     * <em>Data Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> Identifies the feature referenced by the data item.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Structure</em>' reference.
     * @see #setStructure(StructuralFeature)
     * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDataItem_Structure()
     * @see orgomg.cwm.objectmodel.core.StructuralFeature#getDataItem
     * @model opposite="dataItem"
     * @generated
     */
    StructuralFeature getStructure();

    /**
     * Sets the value of the '
     * {@link orgomg.cwmx.resource.dmsii.DataItem#getStructure
     * <em>Structure</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value
     *            the new value of the '<em>Structure</em>' reference.
     * @see #getStructure()
     * @generated
     */
    void setStructure(StructuralFeature value);

} // DataItem

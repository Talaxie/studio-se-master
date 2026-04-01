/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.foundation.expressions.ExpressionNode;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.core.StructuralFeature;
import orgomg.cwm.resource.record.impl.FieldImpl;
import orgomg.cwmx.resource.dmsii.DataItem;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.dmsii.FieldBit;
import orgomg.cwmx.resource.dmsii.Set;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getSize <em>Size</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsSigned <em>Is Signed</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getOccurs <em>Occurs</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getVirtualExpression <em>Virtual Expression</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsKanji <em>Is Kanji</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getCcsVersion <em>Ccs Version</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsGemcosLiteral <em>Is Gemcos Literal</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsGemcosData <em>Is Gemcos Data</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsGemcosSSN <em>Is Gemcos SSN</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsGemcosDBSN <em>Is Gemcos DBSN</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsComsProgram <em>Is Coms Program</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsComsID <em>Is Coms ID</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsComsLocator <em>Is Coms Locator</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#isIsComsOutpQ <em>Is Coms Outp Q</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getOccuringDataItem <em>Occuring Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getOccursDataItem <em>Occurs Data Item</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getKeyDataSet <em>Key Data Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getFieldBit <em>Field Bit</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.dmsii.impl.DataItemImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataItemImpl extends FieldImpl implements DataItem {

    /**
     * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getNullValue()
     * @generated
     * @ordered
     */
    protected ExpressionNode nullValue;

    /**
     * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected static final boolean IS_REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsRequired()
     * @generated
     * @ordered
     */
    protected boolean isRequired = IS_REQUIRED_EDEFAULT;

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final long SIZE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected long size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getScaleFactor()
     * @generated
     * @ordered
     */
    protected static final long SCALE_FACTOR_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getScaleFactor() <em>Scale Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getScaleFactor()
     * @generated
     * @ordered
     */
    protected long scaleFactor = SCALE_FACTOR_EDEFAULT;

    /**
     * The default value of the '{@link #isIsSigned() <em>Is Signed</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsSigned()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SIGNED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSigned() <em>Is Signed</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsSigned()
     * @generated
     * @ordered
     */
    protected boolean isSigned = IS_SIGNED_EDEFAULT;

    /**
     * The default value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccurs()
     * @generated
     * @ordered
     */
    protected static final long OCCURS_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getOccurs() <em>Occurs</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOccurs()
     * @generated
     * @ordered
     */
    protected long occurs = OCCURS_EDEFAULT;

    /**
     * The default value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVirtual()
     * @generated
     * @ordered
     */
    protected static final boolean IS_VIRTUAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsVirtual()
     * @generated
     * @ordered
     */
    protected boolean isVirtual = IS_VIRTUAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getVirtualExpression() <em>Virtual Expression</em>}' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getVirtualExpression()
     * @generated
     * @ordered
     */
    protected ExpressionNode virtualExpression;

    /**
     * The default value of the '{@link #isIsKanji() <em>Is Kanji</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsKanji()
     * @generated
     * @ordered
     */
    protected static final boolean IS_KANJI_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsKanji() <em>Is Kanji</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsKanji()
     * @generated
     * @ordered
     */
    protected boolean isKanji = IS_KANJI_EDEFAULT;

    /**
     * The default value of the '{@link #getCcsVersion() <em>Ccs Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCcsVersion()
     * @generated
     * @ordered
     */
    protected static final String CCS_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCcsVersion() <em>Ccs Version</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCcsVersion()
     * @generated
     * @ordered
     */
    protected String ccsVersion = CCS_VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGemcosLiteral() <em>Is Gemcos Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosLiteral()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GEMCOS_LITERAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGemcosLiteral() <em>Is Gemcos Literal</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosLiteral()
     * @generated
     * @ordered
     */
    protected boolean isGemcosLiteral = IS_GEMCOS_LITERAL_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGemcosData() <em>Is Gemcos Data</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosData()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GEMCOS_DATA_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGemcosData() <em>Is Gemcos Data</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosData()
     * @generated
     * @ordered
     */
    protected boolean isGemcosData = IS_GEMCOS_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGemcosSSN() <em>Is Gemcos SSN</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGemcosSSN()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GEMCOS_SSN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGemcosSSN() <em>Is Gemcos SSN</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsGemcosSSN()
     * @generated
     * @ordered
     */
    protected boolean isGemcosSSN = IS_GEMCOS_SSN_EDEFAULT;

    /**
     * The default value of the '{@link #isIsGemcosDBSN() <em>Is Gemcos DBSN</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosDBSN()
     * @generated
     * @ordered
     */
    protected static final boolean IS_GEMCOS_DBSN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsGemcosDBSN() <em>Is Gemcos DBSN</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsGemcosDBSN()
     * @generated
     * @ordered
     */
    protected boolean isGemcosDBSN = IS_GEMCOS_DBSN_EDEFAULT;

    /**
     * The default value of the '{@link #isIsComsProgram() <em>Is Coms Program</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsComsProgram()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMS_PROGRAM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsComsProgram() <em>Is Coms Program</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsComsProgram()
     * @generated
     * @ordered
     */
    protected boolean isComsProgram = IS_COMS_PROGRAM_EDEFAULT;

    /**
     * The default value of the '{@link #isIsComsID() <em>Is Coms ID</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsComsID()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMS_ID_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsComsID() <em>Is Coms ID</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsComsID()
     * @generated
     * @ordered
     */
    protected boolean isComsID = IS_COMS_ID_EDEFAULT;

    /**
     * The default value of the '{@link #isIsComsLocator() <em>Is Coms Locator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsComsLocator()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMS_LOCATOR_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsComsLocator() <em>Is Coms Locator</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsComsLocator()
     * @generated
     * @ordered
     */
    protected boolean isComsLocator = IS_COMS_LOCATOR_EDEFAULT;

    /**
     * The default value of the '{@link #isIsComsOutpQ() <em>Is Coms Outp Q</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isIsComsOutpQ()
     * @generated
     * @ordered
     */
    protected static final boolean IS_COMS_OUTP_Q_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsComsOutpQ() <em>Is Coms Outp Q</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #isIsComsOutpQ()
     * @generated
     * @ordered
     */
    protected boolean isComsOutpQ = IS_COMS_OUTP_Q_EDEFAULT;

    /**
     * The cached value of the '{@link #getOccuringDataItem() <em>Occuring Data Item</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOccuringDataItem()
     * @generated
     * @ordered
     */
    protected EList<DataItem> occuringDataItem;

    /**
     * The cached value of the '{@link #getOccursDataItem() <em>Occurs Data Item</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getOccursDataItem()
     * @generated
     * @ordered
     */
    protected DataItem occursDataItem;

    /**
     * The cached value of the '{@link #getKeyDataSet() <em>Key Data Set</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getKeyDataSet()
     * @generated
     * @ordered
     */
    protected EList<Set> keyDataSet;

    /**
     * The cached value of the '{@link #getFieldBit() <em>Field Bit</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getFieldBit()
     * @generated
     * @ordered
     */
    protected EList<FieldBit> fieldBit;

    /**
     * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getStructure()
     * @generated
     * @ordered
     */
    protected StructuralFeature structure;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DataItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmsiiPackage.Literals.DATA_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getNullValue() {
        return nullValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNullValue(ExpressionNode newNullValue, NotificationChain msgs) {
        ExpressionNode oldNullValue = nullValue;
        nullValue = newNullValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__NULL_VALUE,
                    oldNullValue, newNullValue);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNullValue(ExpressionNode newNullValue) {
        if (newNullValue != nullValue) {
            NotificationChain msgs = null;
            if (nullValue != null)
                msgs = ((InternalEObject) nullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.DATA_ITEM__NULL_VALUE, null, msgs);
            if (newNullValue != null)
                msgs = ((InternalEObject) newNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.DATA_ITEM__NULL_VALUE, null, msgs);
            msgs = basicSetNullValue(newNullValue, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__NULL_VALUE, newNullValue, newNullValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRequired() {
        return isRequired;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsRequired(boolean newIsRequired) {
        boolean oldIsRequired = isRequired;
        isRequired = newIsRequired;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_REQUIRED, oldIsRequired, isRequired));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSize(long newSize) {
        long oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getScaleFactor() {
        return scaleFactor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setScaleFactor(long newScaleFactor) {
        long oldScaleFactor = scaleFactor;
        scaleFactor = newScaleFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__SCALE_FACTOR, oldScaleFactor,
                    scaleFactor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsSigned() {
        return isSigned;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsSigned(boolean newIsSigned) {
        boolean oldIsSigned = isSigned;
        isSigned = newIsSigned;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_SIGNED, oldIsSigned, isSigned));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public long getOccurs() {
        return occurs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccurs(long newOccurs) {
        long oldOccurs = occurs;
        occurs = newOccurs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__OCCURS, oldOccurs, occurs));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsVirtual(boolean newIsVirtual) {
        boolean oldIsVirtual = isVirtual;
        isVirtual = newIsVirtual;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_VIRTUAL, oldIsVirtual, isVirtual));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ExpressionNode getVirtualExpression() {
        return virtualExpression;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVirtualExpression(ExpressionNode newVirtualExpression, NotificationChain msgs) {
        ExpressionNode oldVirtualExpression = virtualExpression;
        virtualExpression = newVirtualExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION, oldVirtualExpression, newVirtualExpression);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setVirtualExpression(ExpressionNode newVirtualExpression) {
        if (newVirtualExpression != virtualExpression) {
            NotificationChain msgs = null;
            if (virtualExpression != null)
                msgs = ((InternalEObject) virtualExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION, null, msgs);
            if (newVirtualExpression != null)
                msgs = ((InternalEObject) newVirtualExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION, null, msgs);
            msgs = basicSetVirtualExpression(newVirtualExpression, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION,
                    newVirtualExpression, newVirtualExpression));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsKanji() {
        return isKanji;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsKanji(boolean newIsKanji) {
        boolean oldIsKanji = isKanji;
        isKanji = newIsKanji;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_KANJI, oldIsKanji, isKanji));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getCcsVersion() {
        return ccsVersion;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setCcsVersion(String newCcsVersion) {
        String oldCcsVersion = ccsVersion;
        ccsVersion = newCcsVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__CCS_VERSION, oldCcsVersion, ccsVersion));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGemcosLiteral() {
        return isGemcosLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGemcosLiteral(boolean newIsGemcosLiteral) {
        boolean oldIsGemcosLiteral = isGemcosLiteral;
        isGemcosLiteral = newIsGemcosLiteral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL, oldIsGemcosLiteral,
                    isGemcosLiteral));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGemcosData() {
        return isGemcosData;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGemcosData(boolean newIsGemcosData) {
        boolean oldIsGemcosData = isGemcosData;
        isGemcosData = newIsGemcosData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA, oldIsGemcosData,
                    isGemcosData));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGemcosSSN() {
        return isGemcosSSN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGemcosSSN(boolean newIsGemcosSSN) {
        boolean oldIsGemcosSSN = isGemcosSSN;
        isGemcosSSN = newIsGemcosSSN;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN, oldIsGemcosSSN,
                    isGemcosSSN));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsGemcosDBSN() {
        return isGemcosDBSN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsGemcosDBSN(boolean newIsGemcosDBSN) {
        boolean oldIsGemcosDBSN = isGemcosDBSN;
        isGemcosDBSN = newIsGemcosDBSN;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN, oldIsGemcosDBSN,
                    isGemcosDBSN));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComsProgram() {
        return isComsProgram;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsComsProgram(boolean newIsComsProgram) {
        boolean oldIsComsProgram = isComsProgram;
        isComsProgram = newIsComsProgram;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM, oldIsComsProgram,
                    isComsProgram));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComsID() {
        return isComsID;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsComsID(boolean newIsComsID) {
        boolean oldIsComsID = isComsID;
        isComsID = newIsComsID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_COMS_ID, oldIsComsID, isComsID));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComsLocator() {
        return isComsLocator;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsComsLocator(boolean newIsComsLocator) {
        boolean oldIsComsLocator = isComsLocator;
        isComsLocator = newIsComsLocator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR, oldIsComsLocator,
                    isComsLocator));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsComsOutpQ() {
        return isComsOutpQ;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setIsComsOutpQ(boolean newIsComsOutpQ) {
        boolean oldIsComsOutpQ = isComsOutpQ;
        isComsOutpQ = newIsComsOutpQ;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q, oldIsComsOutpQ,
                    isComsOutpQ));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<DataItem> getOccuringDataItem() {
        if (occuringDataItem == null) {
            occuringDataItem = new EObjectWithInverseResolvingEList<DataItem>(DataItem.class, this,
                    DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM, DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM);
        }
        return occuringDataItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataItem getOccursDataItem() {
        if (occursDataItem != null && occursDataItem.eIsProxy()) {
            InternalEObject oldOccursDataItem = (InternalEObject) occursDataItem;
            occursDataItem = (DataItem) eResolveProxy(oldOccursDataItem);
            if (occursDataItem != oldOccursDataItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM,
                            oldOccursDataItem, occursDataItem));
            }
        }
        return occursDataItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public DataItem basicGetOccursDataItem() {
        return occursDataItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOccursDataItem(DataItem newOccursDataItem, NotificationChain msgs) {
        DataItem oldOccursDataItem = occursDataItem;
        occursDataItem = newOccursDataItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM, oldOccursDataItem, newOccursDataItem);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOccursDataItem(DataItem newOccursDataItem) {
        if (newOccursDataItem != occursDataItem) {
            NotificationChain msgs = null;
            if (occursDataItem != null)
                msgs = ((InternalEObject) occursDataItem).eInverseRemove(this, DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM,
                        DataItem.class, msgs);
            if (newOccursDataItem != null)
                msgs = ((InternalEObject) newOccursDataItem).eInverseAdd(this, DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM,
                        DataItem.class, msgs);
            msgs = basicSetOccursDataItem(newOccursDataItem, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM, newOccursDataItem,
                    newOccursDataItem));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Set> getKeyDataSet() {
        if (keyDataSet == null) {
            keyDataSet = new EObjectWithInverseResolvingEList.ManyInverse<Set>(Set.class, this,
                    DmsiiPackage.DATA_ITEM__KEY_DATA_SET, DmsiiPackage.SET__KEY_DATA_ITEM);
        }
        return keyDataSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<FieldBit> getFieldBit() {
        if (fieldBit == null) {
            fieldBit = new EObjectContainmentWithInverseEList<FieldBit>(FieldBit.class, this, DmsiiPackage.DATA_ITEM__FIELD_BIT,
                    DmsiiPackage.FIELD_BIT__DATA_ITEM);
        }
        return fieldBit;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature getStructure() {
        if (structure != null && structure.eIsProxy()) {
            InternalEObject oldStructure = (InternalEObject) structure;
            structure = (StructuralFeature) eResolveProxy(oldStructure);
            if (structure != oldStructure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmsiiPackage.DATA_ITEM__STRUCTURE, oldStructure,
                            structure));
            }
        }
        return structure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature basicGetStructure() {
        return structure;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStructure(StructuralFeature newStructure, NotificationChain msgs) {
        StructuralFeature oldStructure = structure;
        structure = newStructure;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__STRUCTURE,
                    oldStructure, newStructure);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStructure(StructuralFeature newStructure) {
        if (newStructure != structure) {
            NotificationChain msgs = null;
            if (structure != null)
                msgs = ((InternalEObject) structure).eInverseRemove(this, CorePackage.STRUCTURAL_FEATURE__DATA_ITEM,
                        StructuralFeature.class, msgs);
            if (newStructure != null)
                msgs = ((InternalEObject) newStructure).eInverseAdd(this, CorePackage.STRUCTURAL_FEATURE__DATA_ITEM,
                        StructuralFeature.class, msgs);
            msgs = basicSetStructure(newStructure, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmsiiPackage.DATA_ITEM__STRUCTURE, newStructure, newStructure));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOccuringDataItem()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            if (occursDataItem != null)
                msgs = ((InternalEObject) occursDataItem).eInverseRemove(this, DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM,
                        DataItem.class, msgs);
            return basicSetOccursDataItem((DataItem) otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getKeyDataSet()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getFieldBit()).basicAdd(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            if (structure != null)
                msgs = ((InternalEObject) structure).eInverseRemove(this, CorePackage.STRUCTURAL_FEATURE__DATA_ITEM,
                        StructuralFeature.class, msgs);
            return basicSetStructure((StructuralFeature) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            return basicSetNullValue(null, msgs);
        case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            return basicSetVirtualExpression(null, msgs);
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            return ((InternalEList<?>) getOccuringDataItem()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            return basicSetOccursDataItem(null, msgs);
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            return ((InternalEList<?>) getKeyDataSet()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            return ((InternalEList<?>) getFieldBit()).basicRemove(otherEnd, msgs);
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            return basicSetStructure(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            return getNullValue();
        case DmsiiPackage.DATA_ITEM__IS_REQUIRED:
            return isIsRequired();
        case DmsiiPackage.DATA_ITEM__SIZE:
            return getSize();
        case DmsiiPackage.DATA_ITEM__SCALE_FACTOR:
            return getScaleFactor();
        case DmsiiPackage.DATA_ITEM__IS_SIGNED:
            return isIsSigned();
        case DmsiiPackage.DATA_ITEM__OCCURS:
            return getOccurs();
        case DmsiiPackage.DATA_ITEM__IS_VIRTUAL:
            return isIsVirtual();
        case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            return getVirtualExpression();
        case DmsiiPackage.DATA_ITEM__IS_KANJI:
            return isIsKanji();
        case DmsiiPackage.DATA_ITEM__CCS_VERSION:
            return getCcsVersion();
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL:
            return isIsGemcosLiteral();
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA:
            return isIsGemcosData();
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN:
            return isIsGemcosSSN();
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN:
            return isIsGemcosDBSN();
        case DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM:
            return isIsComsProgram();
        case DmsiiPackage.DATA_ITEM__IS_COMS_ID:
            return isIsComsID();
        case DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR:
            return isIsComsLocator();
        case DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q:
            return isIsComsOutpQ();
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            return getOccuringDataItem();
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            if (resolve)
                return getOccursDataItem();
            return basicGetOccursDataItem();
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            return getKeyDataSet();
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            return getFieldBit();
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            if (resolve)
                return getStructure();
            return basicGetStructure();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            setNullValue((ExpressionNode) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_REQUIRED:
            setIsRequired((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__SIZE:
            setSize((Long) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__SCALE_FACTOR:
            setScaleFactor((Long) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_SIGNED:
            setIsSigned((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__OCCURS:
            setOccurs((Long) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_VIRTUAL:
            setIsVirtual((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            setVirtualExpression((ExpressionNode) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_KANJI:
            setIsKanji((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__CCS_VERSION:
            setCcsVersion((String) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL:
            setIsGemcosLiteral((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA:
            setIsGemcosData((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN:
            setIsGemcosSSN((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN:
            setIsGemcosDBSN((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM:
            setIsComsProgram((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_ID:
            setIsComsID((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR:
            setIsComsLocator((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q:
            setIsComsOutpQ((Boolean) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            getOccuringDataItem().clear();
            getOccuringDataItem().addAll((Collection<? extends DataItem>) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            setOccursDataItem((DataItem) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            getKeyDataSet().clear();
            getKeyDataSet().addAll((Collection<? extends Set>) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            getFieldBit().clear();
            getFieldBit().addAll((Collection<? extends FieldBit>) newValue);
            return;
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            setStructure((StructuralFeature) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            setNullValue((ExpressionNode) null);
            return;
        case DmsiiPackage.DATA_ITEM__IS_REQUIRED:
            setIsRequired(IS_REQUIRED_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__SIZE:
            setSize(SIZE_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__SCALE_FACTOR:
            setScaleFactor(SCALE_FACTOR_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_SIGNED:
            setIsSigned(IS_SIGNED_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__OCCURS:
            setOccurs(OCCURS_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_VIRTUAL:
            setIsVirtual(IS_VIRTUAL_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            setVirtualExpression((ExpressionNode) null);
            return;
        case DmsiiPackage.DATA_ITEM__IS_KANJI:
            setIsKanji(IS_KANJI_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__CCS_VERSION:
            setCcsVersion(CCS_VERSION_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL:
            setIsGemcosLiteral(IS_GEMCOS_LITERAL_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA:
            setIsGemcosData(IS_GEMCOS_DATA_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN:
            setIsGemcosSSN(IS_GEMCOS_SSN_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN:
            setIsGemcosDBSN(IS_GEMCOS_DBSN_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM:
            setIsComsProgram(IS_COMS_PROGRAM_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_ID:
            setIsComsID(IS_COMS_ID_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR:
            setIsComsLocator(IS_COMS_LOCATOR_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q:
            setIsComsOutpQ(IS_COMS_OUTP_Q_EDEFAULT);
            return;
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            getOccuringDataItem().clear();
            return;
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            setOccursDataItem((DataItem) null);
            return;
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            getKeyDataSet().clear();
            return;
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            getFieldBit().clear();
            return;
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            setStructure((StructuralFeature) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DmsiiPackage.DATA_ITEM__NULL_VALUE:
            return nullValue != null;
        case DmsiiPackage.DATA_ITEM__IS_REQUIRED:
            return isRequired != IS_REQUIRED_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__SIZE:
            return size != SIZE_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__SCALE_FACTOR:
            return scaleFactor != SCALE_FACTOR_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_SIGNED:
            return isSigned != IS_SIGNED_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__OCCURS:
            return occurs != OCCURS_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_VIRTUAL:
            return isVirtual != IS_VIRTUAL_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__VIRTUAL_EXPRESSION:
            return virtualExpression != null;
        case DmsiiPackage.DATA_ITEM__IS_KANJI:
            return isKanji != IS_KANJI_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__CCS_VERSION:
            return CCS_VERSION_EDEFAULT == null ? ccsVersion != null : !CCS_VERSION_EDEFAULT.equals(ccsVersion);
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_LITERAL:
            return isGemcosLiteral != IS_GEMCOS_LITERAL_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DATA:
            return isGemcosData != IS_GEMCOS_DATA_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_SSN:
            return isGemcosSSN != IS_GEMCOS_SSN_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_GEMCOS_DBSN:
            return isGemcosDBSN != IS_GEMCOS_DBSN_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_COMS_PROGRAM:
            return isComsProgram != IS_COMS_PROGRAM_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_COMS_ID:
            return isComsID != IS_COMS_ID_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_COMS_LOCATOR:
            return isComsLocator != IS_COMS_LOCATOR_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__IS_COMS_OUTP_Q:
            return isComsOutpQ != IS_COMS_OUTP_Q_EDEFAULT;
        case DmsiiPackage.DATA_ITEM__OCCURING_DATA_ITEM:
            return occuringDataItem != null && !occuringDataItem.isEmpty();
        case DmsiiPackage.DATA_ITEM__OCCURS_DATA_ITEM:
            return occursDataItem != null;
        case DmsiiPackage.DATA_ITEM__KEY_DATA_SET:
            return keyDataSet != null && !keyDataSet.isEmpty();
        case DmsiiPackage.DATA_ITEM__FIELD_BIT:
            return fieldBit != null && !fieldBit.isEmpty();
        case DmsiiPackage.DATA_ITEM__STRUCTURE:
            return structure != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (isRequired: ");
        result.append(isRequired);
        result.append(", size: ");
        result.append(size);
        result.append(", scaleFactor: ");
        result.append(scaleFactor);
        result.append(", isSigned: ");
        result.append(isSigned);
        result.append(", occurs: ");
        result.append(occurs);
        result.append(", isVirtual: ");
        result.append(isVirtual);
        result.append(", isKanji: ");
        result.append(isKanji);
        result.append(", ccsVersion: ");
        result.append(ccsVersion);
        result.append(", isGemcosLiteral: ");
        result.append(isGemcosLiteral);
        result.append(", isGemcosData: ");
        result.append(isGemcosData);
        result.append(", isGemcosSSN: ");
        result.append(isGemcosSSN);
        result.append(", isGemcosDBSN: ");
        result.append(isGemcosDBSN);
        result.append(", isComsProgram: ");
        result.append(isComsProgram);
        result.append(", isComsID: ");
        result.append(isComsID);
        result.append(", isComsLocator: ");
        result.append(isComsLocator);
        result.append(", isComsOutpQ: ");
        result.append(isComsOutpQ);
        result.append(')');
        return result.toString();
    }

} // DataItemImpl

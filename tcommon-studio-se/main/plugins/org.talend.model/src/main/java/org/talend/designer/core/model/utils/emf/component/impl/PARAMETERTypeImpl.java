/**
 */
package org.talend.designer.core.model.utils.emf.component.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.component.DEFAULTType;
import org.talend.designer.core.model.utils.emf.component.ITEMSType;
import org.talend.designer.core.model.utils.emf.component.JAVACOMMANDType;
import org.talend.designer.core.model.utils.emf.component.PARAMETERType;
import org.talend.designer.core.model.utils.emf.component.TABLEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PARAMETER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getDEFAULT <em>DEFAULT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getITEMS <em>ITEMS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getTABLE <em>TABLE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getJAVACOMMAND <em>JAVACOMMAND</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getBACKGROUND <em>BACKGROUND</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getCOLOR <em>COLOR</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getCONTEXT <em>CONTEXT</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isCONTEXTMODE <em>CONTEXTMODE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isDYNAMICSETTINGS <em>DYNAMICSETTINGS</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getFIELD <em>FIELD</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getFILTER <em>FILTER</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getGROUP <em>GROUP</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isLOG4J_ENABLED <em>LOG4J ENABLED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getMAXLENGTH <em>MAXLENGTH</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getNBLINES <em>NBLINES</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isNOCONTEXTASSIST <em>NOCONTEXTASSIST</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getNOTREADONLYIF <em>NOTREADONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getNOTSHOWIF <em>NOTSHOWIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getNUMROW <em>NUMROW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isRAW <em>RAW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isREADONLY <em>READONLY</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getREADONLYIF <em>READONLYIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getREPOSITORYVALUE <em>REPOSITORYVALUE</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isREQUIRED <em>REQUIRED</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getREQUIREDIF <em>REQUIREDIF</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#isSHOW <em>SHOW</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.component.impl.PARAMETERTypeImpl#getSHOWIF <em>SHOWIF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PARAMETERTypeImpl extends EObjectImpl implements PARAMETERType {
    /**
     * The cached value of the '{@link #getDEFAULT() <em>DEFAULT</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDEFAULT()
     * @generated
     * @ordered
     */
    protected EList dEFAULT;

    /**
     * The cached value of the '{@link #getITEMS() <em>ITEMS</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getITEMS()
     * @generated
     * @ordered
     */
    protected ITEMSType iTEMS;

    /**
     * The cached value of the '{@link #getTABLE() <em>TABLE</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTABLE()
     * @generated
     * @ordered
     */
    protected EList tABLE;

    /**
     * The cached value of the '{@link #getJAVACOMMAND() <em>JAVACOMMAND</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJAVACOMMAND()
     * @generated
     * @ordered
     */
    protected JAVACOMMANDType jAVACOMMAND;

    /**
     * The default value of the '{@link #getBACKGROUND() <em>BACKGROUND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBACKGROUND()
     * @generated
     * @ordered
     */
    protected static final String BACKGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBACKGROUND() <em>BACKGROUND</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBACKGROUND()
     * @generated
     * @ordered
     */
    protected String bACKGROUND = BACKGROUND_EDEFAULT;

    /**
     * The default value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOLOR()
     * @generated
     * @ordered
     */
    protected static final String COLOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCOLOR()
     * @generated
     * @ordered
     */
    protected String cOLOR = COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getCONTEXT() <em>CONTEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONTEXT()
     * @generated
     * @ordered
     */
    protected static final String CONTEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCONTEXT() <em>CONTEXT</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCONTEXT()
     * @generated
     * @ordered
     */
    protected String cONTEXT = CONTEXT_EDEFAULT;

    /**
     * The default value of the '{@link #isCONTEXTMODE() <em>CONTEXTMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCONTEXTMODE()
     * @generated
     * @ordered
     */
    protected static final boolean CONTEXTMODE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isCONTEXTMODE() <em>CONTEXTMODE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isCONTEXTMODE()
     * @generated
     * @ordered
     */
    protected boolean cONTEXTMODE = CONTEXTMODE_EDEFAULT;

    /**
     * This is true if the CONTEXTMODE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cONTEXTMODEESet;

    /**
     * The default value of the '{@link #isDYNAMICSETTINGS() <em>DYNAMICSETTINGS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDYNAMICSETTINGS()
     * @generated
     * @ordered
     */
    protected static final boolean DYNAMICSETTINGS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isDYNAMICSETTINGS() <em>DYNAMICSETTINGS</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDYNAMICSETTINGS()
     * @generated
     * @ordered
     */
    protected boolean dYNAMICSETTINGS = DYNAMICSETTINGS_EDEFAULT;

    /**
     * This is true if the DYNAMICSETTINGS attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dYNAMICSETTINGSESet;

    /**
     * The default value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected static final String FIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFIELD() <em>FIELD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFIELD()
     * @generated
     * @ordered
     */
    protected String fIELD = FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #getFILTER() <em>FILTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILTER()
     * @generated
     * @ordered
     */
    protected static final String FILTER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFILTER() <em>FILTER</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFILTER()
     * @generated
     * @ordered
     */
    protected String fILTER = FILTER_EDEFAULT;

    /**
     * The default value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected static final String GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGROUP() <em>GROUP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGROUP()
     * @generated
     * @ordered
     */
    protected String gROUP = GROUP_EDEFAULT;

    /**
     * The default value of the '{@link #isLOG4J_ENABLED() <em>LOG4J ENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLOG4J_ENABLED()
     * @generated
     * @ordered
     */
    protected static final boolean LOG4J_ENABLED_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isLOG4J_ENABLED() <em>LOG4J ENABLED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isLOG4J_ENABLED()
     * @generated
     * @ordered
     */
    protected boolean lOG4J_ENABLED = LOG4J_ENABLED_EDEFAULT;

    /**
     * This is true if the LOG4J ENABLED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lOG4J_ENABLEDESet;

    /**
     * The default value of the '{@link #getMAXLENGTH() <em>MAXLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAXLENGTH()
     * @generated
     * @ordered
     */
    protected static final int MAXLENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMAXLENGTH() <em>MAXLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMAXLENGTH()
     * @generated
     * @ordered
     */
    protected int mAXLENGTH = MAXLENGTH_EDEFAULT;

    /**
     * This is true if the MAXLENGTH attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mAXLENGTHESet;

    /**
     * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNAME()
     * @generated
     * @ordered
     */
    protected String nAME = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getNBLINES() <em>NBLINES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNBLINES()
     * @generated
     * @ordered
     */
    protected static final int NBLINES_EDEFAULT = 3;

    /**
     * The cached value of the '{@link #getNBLINES() <em>NBLINES</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNBLINES()
     * @generated
     * @ordered
     */
    protected int nBLINES = NBLINES_EDEFAULT;

    /**
     * This is true if the NBLINES attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nBLINESESet;

    /**
     * The default value of the '{@link #isNOCONTEXTASSIST() <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNOCONTEXTASSIST()
     * @generated
     * @ordered
     */
    protected static final boolean NOCONTEXTASSIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNOCONTEXTASSIST() <em>NOCONTEXTASSIST</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNOCONTEXTASSIST()
     * @generated
     * @ordered
     */
    protected boolean nOCONTEXTASSIST = NOCONTEXTASSIST_EDEFAULT;

    /**
     * This is true if the NOCONTEXTASSIST attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nOCONTEXTASSISTESet;

    /**
     * The default value of the '{@link #getNOTREADONLYIF() <em>NOTREADONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTREADONLYIF()
     * @generated
     * @ordered
     */
    protected static final String NOTREADONLYIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNOTREADONLYIF() <em>NOTREADONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTREADONLYIF()
     * @generated
     * @ordered
     */
    protected String nOTREADONLYIF = NOTREADONLYIF_EDEFAULT;

    /**
     * The default value of the '{@link #getNOTSHOWIF() <em>NOTSHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTSHOWIF()
     * @generated
     * @ordered
     */
    protected static final String NOTSHOWIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNOTSHOWIF() <em>NOTSHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNOTSHOWIF()
     * @generated
     * @ordered
     */
    protected String nOTSHOWIF = NOTSHOWIF_EDEFAULT;

    /**
     * The default value of the '{@link #getNUMROW() <em>NUMROW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNUMROW()
     * @generated
     * @ordered
     */
    protected static final int NUMROW_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNUMROW() <em>NUMROW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNUMROW()
     * @generated
     * @ordered
     */
    protected int nUMROW = NUMROW_EDEFAULT;

    /**
     * This is true if the NUMROW attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nUMROWESet;

    /**
     * The default value of the '{@link #isRAW() <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRAW()
     * @generated
     * @ordered
     */
    protected static final boolean RAW_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRAW() <em>RAW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRAW()
     * @generated
     * @ordered
     */
    protected boolean rAW = RAW_EDEFAULT;

    /**
     * This is true if the RAW attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rAWESet;

    /**
     * The default value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected static final boolean READONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isREADONLY() <em>READONLY</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREADONLY()
     * @generated
     * @ordered
     */
    protected boolean rEADONLY = READONLY_EDEFAULT;

    /**
     * This is true if the READONLY attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEADONLYESet;

    /**
     * The default value of the '{@link #getREADONLYIF() <em>READONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYIF()
     * @generated
     * @ordered
     */
    protected static final String READONLYIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREADONLYIF() <em>READONLYIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREADONLYIF()
     * @generated
     * @ordered
     */
    protected String rEADONLYIF = READONLYIF_EDEFAULT;

    /**
     * The default value of the '{@link #getREPOSITORYVALUE() <em>REPOSITORYVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYVALUE()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORYVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREPOSITORYVALUE() <em>REPOSITORYVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREPOSITORYVALUE()
     * @generated
     * @ordered
     */
    protected String rEPOSITORYVALUE = REPOSITORYVALUE_EDEFAULT;

    /**
     * The default value of the '{@link #isREQUIRED() <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREQUIRED()
     * @generated
     * @ordered
     */
    protected static final boolean REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isREQUIRED() <em>REQUIRED</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isREQUIRED()
     * @generated
     * @ordered
     */
    protected boolean rEQUIRED = REQUIRED_EDEFAULT;

    /**
     * This is true if the REQUIRED attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rEQUIREDESet;

    /**
     * The default value of the '{@link #getREQUIREDIF() <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREQUIREDIF()
     * @generated
     * @ordered
     */
    protected static final String REQUIREDIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getREQUIREDIF() <em>REQUIREDIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getREQUIREDIF()
     * @generated
     * @ordered
     */
    protected String rEQUIREDIF = REQUIREDIF_EDEFAULT;

    /**
     * The default value of the '{@link #isSHOW() <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSHOW()
     * @generated
     * @ordered
     */
    protected static final boolean SHOW_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isSHOW() <em>SHOW</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSHOW()
     * @generated
     * @ordered
     */
    protected boolean sHOW = SHOW_EDEFAULT;

    /**
     * This is true if the SHOW attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sHOWESet;

    /**
     * The default value of the '{@link #getSHOWIF() <em>SHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHOWIF()
     * @generated
     * @ordered
     */
    protected static final String SHOWIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSHOWIF() <em>SHOWIF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSHOWIF()
     * @generated
     * @ordered
     */
    protected String sHOWIF = SHOWIF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PARAMETERTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return ComponentPackage.Literals.PARAMETER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getDEFAULT() {
        if (dEFAULT == null) {
            dEFAULT = new EObjectContainmentEList(DEFAULTType.class, this, ComponentPackage.PARAMETER_TYPE__DEFAULT);
        }
        return dEFAULT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ITEMSType getITEMS() {
        return iTEMS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetITEMS(ITEMSType newITEMS, NotificationChain msgs) {
        ITEMSType oldITEMS = iTEMS;
        iTEMS = newITEMS;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__ITEMS, oldITEMS, newITEMS);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setITEMS(ITEMSType newITEMS) {
        if (newITEMS != iTEMS) {
            NotificationChain msgs = null;
            if (iTEMS != null)
                msgs = ((InternalEObject)iTEMS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PARAMETER_TYPE__ITEMS, null, msgs);
            if (newITEMS != null)
                msgs = ((InternalEObject)newITEMS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PARAMETER_TYPE__ITEMS, null, msgs);
            msgs = basicSetITEMS(newITEMS, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__ITEMS, newITEMS, newITEMS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getTABLE() {
        if (tABLE == null) {
            tABLE = new EObjectContainmentEList(TABLEType.class, this, ComponentPackage.PARAMETER_TYPE__TABLE);
        }
        return tABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JAVACOMMANDType getJAVACOMMAND() {
        return jAVACOMMAND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetJAVACOMMAND(JAVACOMMANDType newJAVACOMMAND, NotificationChain msgs) {
        JAVACOMMANDType oldJAVACOMMAND = jAVACOMMAND;
        jAVACOMMAND = newJAVACOMMAND;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__JAVACOMMAND, oldJAVACOMMAND, newJAVACOMMAND);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJAVACOMMAND(JAVACOMMANDType newJAVACOMMAND) {
        if (newJAVACOMMAND != jAVACOMMAND) {
            NotificationChain msgs = null;
            if (jAVACOMMAND != null)
                msgs = ((InternalEObject)jAVACOMMAND).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PARAMETER_TYPE__JAVACOMMAND, null, msgs);
            if (newJAVACOMMAND != null)
                msgs = ((InternalEObject)newJAVACOMMAND).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComponentPackage.PARAMETER_TYPE__JAVACOMMAND, null, msgs);
            msgs = basicSetJAVACOMMAND(newJAVACOMMAND, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__JAVACOMMAND, newJAVACOMMAND, newJAVACOMMAND));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBACKGROUND() {
        return bACKGROUND;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBACKGROUND(String newBACKGROUND) {
        String oldBACKGROUND = bACKGROUND;
        bACKGROUND = newBACKGROUND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__BACKGROUND, oldBACKGROUND, bACKGROUND));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCOLOR() {
        return cOLOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCOLOR(String newCOLOR) {
        String oldCOLOR = cOLOR;
        cOLOR = newCOLOR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__COLOR, oldCOLOR, cOLOR));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCONTEXT() {
        return cONTEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONTEXT(String newCONTEXT) {
        String oldCONTEXT = cONTEXT;
        cONTEXT = newCONTEXT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__CONTEXT, oldCONTEXT, cONTEXT));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isCONTEXTMODE() {
        return cONTEXTMODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCONTEXTMODE(boolean newCONTEXTMODE) {
        boolean oldCONTEXTMODE = cONTEXTMODE;
        cONTEXTMODE = newCONTEXTMODE;
        boolean oldCONTEXTMODEESet = cONTEXTMODEESet;
        cONTEXTMODEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__CONTEXTMODE, oldCONTEXTMODE, cONTEXTMODE, !oldCONTEXTMODEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCONTEXTMODE() {
        boolean oldCONTEXTMODE = cONTEXTMODE;
        boolean oldCONTEXTMODEESet = cONTEXTMODEESet;
        cONTEXTMODE = CONTEXTMODE_EDEFAULT;
        cONTEXTMODEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__CONTEXTMODE, oldCONTEXTMODE, CONTEXTMODE_EDEFAULT, oldCONTEXTMODEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCONTEXTMODE() {
        return cONTEXTMODEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDYNAMICSETTINGS() {
        return dYNAMICSETTINGS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDYNAMICSETTINGS(boolean newDYNAMICSETTINGS) {
        boolean oldDYNAMICSETTINGS = dYNAMICSETTINGS;
        dYNAMICSETTINGS = newDYNAMICSETTINGS;
        boolean oldDYNAMICSETTINGSESet = dYNAMICSETTINGSESet;
        dYNAMICSETTINGSESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS, oldDYNAMICSETTINGS, dYNAMICSETTINGS, !oldDYNAMICSETTINGSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDYNAMICSETTINGS() {
        boolean oldDYNAMICSETTINGS = dYNAMICSETTINGS;
        boolean oldDYNAMICSETTINGSESet = dYNAMICSETTINGSESet;
        dYNAMICSETTINGS = DYNAMICSETTINGS_EDEFAULT;
        dYNAMICSETTINGSESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS, oldDYNAMICSETTINGS, DYNAMICSETTINGS_EDEFAULT, oldDYNAMICSETTINGSESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDYNAMICSETTINGS() {
        return dYNAMICSETTINGSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFIELD() {
        return fIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFIELD(String newFIELD) {
        String oldFIELD = fIELD;
        fIELD = newFIELD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__FIELD, oldFIELD, fIELD));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFILTER() {
        return fILTER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFILTER(String newFILTER) {
        String oldFILTER = fILTER;
        fILTER = newFILTER;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__FILTER, oldFILTER, fILTER));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGROUP() {
        return gROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGROUP(String newGROUP) {
        String oldGROUP = gROUP;
        gROUP = newGROUP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__GROUP, oldGROUP, gROUP));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMAXLENGTH() {
        return mAXLENGTH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMAXLENGTH(int newMAXLENGTH) {
        int oldMAXLENGTH = mAXLENGTH;
        mAXLENGTH = newMAXLENGTH;
        boolean oldMAXLENGTHESet = mAXLENGTHESet;
        mAXLENGTHESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__MAXLENGTH, oldMAXLENGTH, mAXLENGTH, !oldMAXLENGTHESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMAXLENGTH() {
        int oldMAXLENGTH = mAXLENGTH;
        boolean oldMAXLENGTHESet = mAXLENGTHESet;
        mAXLENGTH = MAXLENGTH_EDEFAULT;
        mAXLENGTHESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__MAXLENGTH, oldMAXLENGTH, MAXLENGTH_EDEFAULT, oldMAXLENGTHESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMAXLENGTH() {
        return mAXLENGTHESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNAME() {
        return nAME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNAME(String newNAME) {
        String oldNAME = nAME;
        nAME = newNAME;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NAME, oldNAME, nAME));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNBLINES() {
        return nBLINES;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNBLINES(int newNBLINES) {
        int oldNBLINES = nBLINES;
        nBLINES = newNBLINES;
        boolean oldNBLINESESet = nBLINESESet;
        nBLINESESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NBLINES, oldNBLINES, nBLINES, !oldNBLINESESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNBLINES() {
        int oldNBLINES = nBLINES;
        boolean oldNBLINESESet = nBLINESESet;
        nBLINES = NBLINES_EDEFAULT;
        nBLINESESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__NBLINES, oldNBLINES, NBLINES_EDEFAULT, oldNBLINESESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNBLINES() {
        return nBLINESESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isNOCONTEXTASSIST() {
        return nOCONTEXTASSIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOCONTEXTASSIST(boolean newNOCONTEXTASSIST) {
        boolean oldNOCONTEXTASSIST = nOCONTEXTASSIST;
        nOCONTEXTASSIST = newNOCONTEXTASSIST;
        boolean oldNOCONTEXTASSISTESet = nOCONTEXTASSISTESet;
        nOCONTEXTASSISTESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST, oldNOCONTEXTASSIST, nOCONTEXTASSIST, !oldNOCONTEXTASSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNOCONTEXTASSIST() {
        boolean oldNOCONTEXTASSIST = nOCONTEXTASSIST;
        boolean oldNOCONTEXTASSISTESet = nOCONTEXTASSISTESet;
        nOCONTEXTASSIST = NOCONTEXTASSIST_EDEFAULT;
        nOCONTEXTASSISTESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST, oldNOCONTEXTASSIST, NOCONTEXTASSIST_EDEFAULT, oldNOCONTEXTASSISTESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNOCONTEXTASSIST() {
        return nOCONTEXTASSISTESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNOTREADONLYIF() {
        return nOTREADONLYIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOTREADONLYIF(String newNOTREADONLYIF) {
        String oldNOTREADONLYIF = nOTREADONLYIF;
        nOTREADONLYIF = newNOTREADONLYIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NOTREADONLYIF, oldNOTREADONLYIF, nOTREADONLYIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNOTSHOWIF() {
        return nOTSHOWIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNOTSHOWIF(String newNOTSHOWIF) {
        String oldNOTSHOWIF = nOTSHOWIF;
        nOTSHOWIF = newNOTSHOWIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NOTSHOWIF, oldNOTSHOWIF, nOTSHOWIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNUMROW() {
        return nUMROW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNUMROW(int newNUMROW) {
        int oldNUMROW = nUMROW;
        nUMROW = newNUMROW;
        boolean oldNUMROWESet = nUMROWESet;
        nUMROWESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__NUMROW, oldNUMROW, nUMROW, !oldNUMROWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNUMROW() {
        int oldNUMROW = nUMROW;
        boolean oldNUMROWESet = nUMROWESet;
        nUMROW = NUMROW_EDEFAULT;
        nUMROWESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__NUMROW, oldNUMROW, NUMROW_EDEFAULT, oldNUMROWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNUMROW() {
        return nUMROWESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isREADONLY() {
        return rEADONLY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLY(boolean newREADONLY) {
        boolean oldREADONLY = rEADONLY;
        rEADONLY = newREADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__READONLY, oldREADONLY, rEADONLY, !oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREADONLY() {
        boolean oldREADONLY = rEADONLY;
        boolean oldREADONLYESet = rEADONLYESet;
        rEADONLY = READONLY_EDEFAULT;
        rEADONLYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__READONLY, oldREADONLY, READONLY_EDEFAULT, oldREADONLYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREADONLY() {
        return rEADONLYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREADONLYIF() {
        return rEADONLYIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREADONLYIF(String newREADONLYIF) {
        String oldREADONLYIF = rEADONLYIF;
        rEADONLYIF = newREADONLYIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__READONLYIF, oldREADONLYIF, rEADONLYIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREPOSITORYVALUE() {
        return rEPOSITORYVALUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREPOSITORYVALUE(String newREPOSITORYVALUE) {
        String oldREPOSITORYVALUE = rEPOSITORYVALUE;
        rEPOSITORYVALUE = newREPOSITORYVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__REPOSITORYVALUE, oldREPOSITORYVALUE, rEPOSITORYVALUE));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isREQUIRED() {
        return rEQUIRED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREQUIRED(boolean newREQUIRED) {
        boolean oldREQUIRED = rEQUIRED;
        rEQUIRED = newREQUIRED;
        boolean oldREQUIREDESet = rEQUIREDESet;
        rEQUIREDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__REQUIRED, oldREQUIRED, rEQUIRED, !oldREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetREQUIRED() {
        boolean oldREQUIRED = rEQUIRED;
        boolean oldREQUIREDESet = rEQUIREDESet;
        rEQUIRED = REQUIRED_EDEFAULT;
        rEQUIREDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__REQUIRED, oldREQUIRED, REQUIRED_EDEFAULT, oldREQUIREDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetREQUIRED() {
        return rEQUIREDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getREQUIREDIF() {
        return rEQUIREDIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setREQUIREDIF(String newREQUIREDIF) {
        String oldREQUIREDIF = rEQUIREDIF;
        rEQUIREDIF = newREQUIREDIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__REQUIREDIF, oldREQUIREDIF, rEQUIREDIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSHOW() {
        return sHOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHOW(boolean newSHOW) {
        boolean oldSHOW = sHOW;
        sHOW = newSHOW;
        boolean oldSHOWESet = sHOWESet;
        sHOWESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__SHOW, oldSHOW, sHOW, !oldSHOWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSHOW() {
        boolean oldSHOW = sHOW;
        boolean oldSHOWESet = sHOWESet;
        sHOW = SHOW_EDEFAULT;
        sHOWESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__SHOW, oldSHOW, SHOW_EDEFAULT, oldSHOWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSHOW() {
        return sHOWESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSHOWIF() {
        return sHOWIF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSHOWIF(String newSHOWIF) {
        String oldSHOWIF = sHOWIF;
        sHOWIF = newSHOWIF;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__SHOWIF, oldSHOWIF, sHOWIF));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRAW() {
        return rAW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRAW(boolean newRAW) {
        boolean oldRAW = rAW;
        rAW = newRAW;
        boolean oldRAWESet = rAWESet;
        rAWESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__RAW, oldRAW, rAW, !oldRAWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRAW() {
        boolean oldRAW = rAW;
        boolean oldRAWESet = rAWESet;
        rAW = RAW_EDEFAULT;
        rAWESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__RAW, oldRAW, RAW_EDEFAULT, oldRAWESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRAW() {
        return rAWESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isLOG4J_ENABLED() {
        return lOG4J_ENABLED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLOG4J_ENABLED(boolean newLOG4J_ENABLED) {
        boolean oldLOG4J_ENABLED = lOG4J_ENABLED;
        lOG4J_ENABLED = newLOG4J_ENABLED;
        boolean oldLOG4J_ENABLEDESet = lOG4J_ENABLEDESet;
        lOG4J_ENABLEDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED, oldLOG4J_ENABLED, lOG4J_ENABLED, !oldLOG4J_ENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLOG4J_ENABLED() {
        boolean oldLOG4J_ENABLED = lOG4J_ENABLED;
        boolean oldLOG4J_ENABLEDESet = lOG4J_ENABLEDESet;
        lOG4J_ENABLED = LOG4J_ENABLED_EDEFAULT;
        lOG4J_ENABLEDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED, oldLOG4J_ENABLED, LOG4J_ENABLED_EDEFAULT, oldLOG4J_ENABLEDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLOG4J_ENABLED() {
        return lOG4J_ENABLEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ComponentPackage.PARAMETER_TYPE__DEFAULT:
                return ((InternalEList)getDEFAULT()).basicRemove(otherEnd, msgs);
            case ComponentPackage.PARAMETER_TYPE__ITEMS:
                return basicSetITEMS(null, msgs);
            case ComponentPackage.PARAMETER_TYPE__TABLE:
                return ((InternalEList)getTABLE()).basicRemove(otherEnd, msgs);
            case ComponentPackage.PARAMETER_TYPE__JAVACOMMAND:
                return basicSetJAVACOMMAND(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ComponentPackage.PARAMETER_TYPE__DEFAULT:
                return getDEFAULT();
            case ComponentPackage.PARAMETER_TYPE__ITEMS:
                return getITEMS();
            case ComponentPackage.PARAMETER_TYPE__TABLE:
                return getTABLE();
            case ComponentPackage.PARAMETER_TYPE__JAVACOMMAND:
                return getJAVACOMMAND();
            case ComponentPackage.PARAMETER_TYPE__BACKGROUND:
                return getBACKGROUND();
            case ComponentPackage.PARAMETER_TYPE__COLOR:
                return getCOLOR();
            case ComponentPackage.PARAMETER_TYPE__CONTEXT:
                return getCONTEXT();
            case ComponentPackage.PARAMETER_TYPE__CONTEXTMODE:
                return isCONTEXTMODE() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS:
                return isDYNAMICSETTINGS() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__FIELD:
                return getFIELD();
            case ComponentPackage.PARAMETER_TYPE__FILTER:
                return getFILTER();
            case ComponentPackage.PARAMETER_TYPE__GROUP:
                return getGROUP();
            case ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED:
                return isLOG4J_ENABLED() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__MAXLENGTH:
                return new Integer(getMAXLENGTH());
            case ComponentPackage.PARAMETER_TYPE__NAME:
                return getNAME();
            case ComponentPackage.PARAMETER_TYPE__NBLINES:
                return new Integer(getNBLINES());
            case ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST:
                return isNOCONTEXTASSIST() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__NOTREADONLYIF:
                return getNOTREADONLYIF();
            case ComponentPackage.PARAMETER_TYPE__NOTSHOWIF:
                return getNOTSHOWIF();
            case ComponentPackage.PARAMETER_TYPE__NUMROW:
                return new Integer(getNUMROW());
            case ComponentPackage.PARAMETER_TYPE__RAW:
                return isRAW() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__READONLY:
                return isREADONLY() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__READONLYIF:
                return getREADONLYIF();
            case ComponentPackage.PARAMETER_TYPE__REPOSITORYVALUE:
                return getREPOSITORYVALUE();
            case ComponentPackage.PARAMETER_TYPE__REQUIRED:
                return isREQUIRED() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__REQUIREDIF:
                return getREQUIREDIF();
            case ComponentPackage.PARAMETER_TYPE__SHOW:
                return isSHOW() ? Boolean.TRUE : Boolean.FALSE;
            case ComponentPackage.PARAMETER_TYPE__SHOWIF:
                return getSHOWIF();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ComponentPackage.PARAMETER_TYPE__DEFAULT:
                getDEFAULT().clear();
                getDEFAULT().addAll((Collection)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__ITEMS:
                setITEMS((ITEMSType)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__TABLE:
                getTABLE().clear();
                getTABLE().addAll((Collection)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__JAVACOMMAND:
                setJAVACOMMAND((JAVACOMMANDType)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__BACKGROUND:
                setBACKGROUND((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__COLOR:
                setCOLOR((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__CONTEXT:
                setCONTEXT((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__CONTEXTMODE:
                setCONTEXTMODE(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS:
                setDYNAMICSETTINGS(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__FIELD:
                setFIELD((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__FILTER:
                setFILTER((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__GROUP:
                setGROUP((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED:
                setLOG4J_ENABLED(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__MAXLENGTH:
                setMAXLENGTH(((Integer)newValue).intValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__NAME:
                setNAME((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__NBLINES:
                setNBLINES(((Integer)newValue).intValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST:
                setNOCONTEXTASSIST(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__NOTREADONLYIF:
                setNOTREADONLYIF((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__NOTSHOWIF:
                setNOTSHOWIF((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__NUMROW:
                setNUMROW(((Integer)newValue).intValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__RAW:
                setRAW(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__READONLY:
                setREADONLY(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__READONLYIF:
                setREADONLYIF((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__REPOSITORYVALUE:
                setREPOSITORYVALUE((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__REQUIRED:
                setREQUIRED(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__REQUIREDIF:
                setREQUIREDIF((String)newValue);
                return;
            case ComponentPackage.PARAMETER_TYPE__SHOW:
                setSHOW(((Boolean)newValue).booleanValue());
                return;
            case ComponentPackage.PARAMETER_TYPE__SHOWIF:
                setSHOWIF((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case ComponentPackage.PARAMETER_TYPE__DEFAULT:
                getDEFAULT().clear();
                return;
            case ComponentPackage.PARAMETER_TYPE__ITEMS:
                setITEMS((ITEMSType)null);
                return;
            case ComponentPackage.PARAMETER_TYPE__TABLE:
                getTABLE().clear();
                return;
            case ComponentPackage.PARAMETER_TYPE__JAVACOMMAND:
                setJAVACOMMAND((JAVACOMMANDType)null);
                return;
            case ComponentPackage.PARAMETER_TYPE__BACKGROUND:
                setBACKGROUND(BACKGROUND_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__COLOR:
                setCOLOR(COLOR_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__CONTEXT:
                setCONTEXT(CONTEXT_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__CONTEXTMODE:
                unsetCONTEXTMODE();
                return;
            case ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS:
                unsetDYNAMICSETTINGS();
                return;
            case ComponentPackage.PARAMETER_TYPE__FIELD:
                setFIELD(FIELD_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__FILTER:
                setFILTER(FILTER_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__GROUP:
                setGROUP(GROUP_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED:
                unsetLOG4J_ENABLED();
                return;
            case ComponentPackage.PARAMETER_TYPE__MAXLENGTH:
                unsetMAXLENGTH();
                return;
            case ComponentPackage.PARAMETER_TYPE__NAME:
                setNAME(NAME_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__NBLINES:
                unsetNBLINES();
                return;
            case ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST:
                unsetNOCONTEXTASSIST();
                return;
            case ComponentPackage.PARAMETER_TYPE__NOTREADONLYIF:
                setNOTREADONLYIF(NOTREADONLYIF_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__NOTSHOWIF:
                setNOTSHOWIF(NOTSHOWIF_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__NUMROW:
                unsetNUMROW();
                return;
            case ComponentPackage.PARAMETER_TYPE__RAW:
                unsetRAW();
                return;
            case ComponentPackage.PARAMETER_TYPE__READONLY:
                unsetREADONLY();
                return;
            case ComponentPackage.PARAMETER_TYPE__READONLYIF:
                setREADONLYIF(READONLYIF_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__REPOSITORYVALUE:
                setREPOSITORYVALUE(REPOSITORYVALUE_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__REQUIRED:
                unsetREQUIRED();
                return;
            case ComponentPackage.PARAMETER_TYPE__REQUIREDIF:
                setREQUIREDIF(REQUIREDIF_EDEFAULT);
                return;
            case ComponentPackage.PARAMETER_TYPE__SHOW:
                unsetSHOW();
                return;
            case ComponentPackage.PARAMETER_TYPE__SHOWIF:
                setSHOWIF(SHOWIF_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ComponentPackage.PARAMETER_TYPE__DEFAULT:
                return dEFAULT != null && !dEFAULT.isEmpty();
            case ComponentPackage.PARAMETER_TYPE__ITEMS:
                return iTEMS != null;
            case ComponentPackage.PARAMETER_TYPE__TABLE:
                return tABLE != null && !tABLE.isEmpty();
            case ComponentPackage.PARAMETER_TYPE__JAVACOMMAND:
                return jAVACOMMAND != null;
            case ComponentPackage.PARAMETER_TYPE__BACKGROUND:
                return BACKGROUND_EDEFAULT == null ? bACKGROUND != null : !BACKGROUND_EDEFAULT.equals(bACKGROUND);
            case ComponentPackage.PARAMETER_TYPE__COLOR:
                return COLOR_EDEFAULT == null ? cOLOR != null : !COLOR_EDEFAULT.equals(cOLOR);
            case ComponentPackage.PARAMETER_TYPE__CONTEXT:
                return CONTEXT_EDEFAULT == null ? cONTEXT != null : !CONTEXT_EDEFAULT.equals(cONTEXT);
            case ComponentPackage.PARAMETER_TYPE__CONTEXTMODE:
                return isSetCONTEXTMODE();
            case ComponentPackage.PARAMETER_TYPE__DYNAMICSETTINGS:
                return isSetDYNAMICSETTINGS();
            case ComponentPackage.PARAMETER_TYPE__FIELD:
                return FIELD_EDEFAULT == null ? fIELD != null : !FIELD_EDEFAULT.equals(fIELD);
            case ComponentPackage.PARAMETER_TYPE__FILTER:
                return FILTER_EDEFAULT == null ? fILTER != null : !FILTER_EDEFAULT.equals(fILTER);
            case ComponentPackage.PARAMETER_TYPE__GROUP:
                return GROUP_EDEFAULT == null ? gROUP != null : !GROUP_EDEFAULT.equals(gROUP);
            case ComponentPackage.PARAMETER_TYPE__LOG4J_ENABLED:
                return isSetLOG4J_ENABLED();
            case ComponentPackage.PARAMETER_TYPE__MAXLENGTH:
                return isSetMAXLENGTH();
            case ComponentPackage.PARAMETER_TYPE__NAME:
                return NAME_EDEFAULT == null ? nAME != null : !NAME_EDEFAULT.equals(nAME);
            case ComponentPackage.PARAMETER_TYPE__NBLINES:
                return isSetNBLINES();
            case ComponentPackage.PARAMETER_TYPE__NOCONTEXTASSIST:
                return isSetNOCONTEXTASSIST();
            case ComponentPackage.PARAMETER_TYPE__NOTREADONLYIF:
                return NOTREADONLYIF_EDEFAULT == null ? nOTREADONLYIF != null : !NOTREADONLYIF_EDEFAULT.equals(nOTREADONLYIF);
            case ComponentPackage.PARAMETER_TYPE__NOTSHOWIF:
                return NOTSHOWIF_EDEFAULT == null ? nOTSHOWIF != null : !NOTSHOWIF_EDEFAULT.equals(nOTSHOWIF);
            case ComponentPackage.PARAMETER_TYPE__NUMROW:
                return isSetNUMROW();
            case ComponentPackage.PARAMETER_TYPE__RAW:
                return isSetRAW();
            case ComponentPackage.PARAMETER_TYPE__READONLY:
                return isSetREADONLY();
            case ComponentPackage.PARAMETER_TYPE__READONLYIF:
                return READONLYIF_EDEFAULT == null ? rEADONLYIF != null : !READONLYIF_EDEFAULT.equals(rEADONLYIF);
            case ComponentPackage.PARAMETER_TYPE__REPOSITORYVALUE:
                return REPOSITORYVALUE_EDEFAULT == null ? rEPOSITORYVALUE != null : !REPOSITORYVALUE_EDEFAULT.equals(rEPOSITORYVALUE);
            case ComponentPackage.PARAMETER_TYPE__REQUIRED:
                return isSetREQUIRED();
            case ComponentPackage.PARAMETER_TYPE__REQUIREDIF:
                return REQUIREDIF_EDEFAULT == null ? rEQUIREDIF != null : !REQUIREDIF_EDEFAULT.equals(rEQUIREDIF);
            case ComponentPackage.PARAMETER_TYPE__SHOW:
                return isSetSHOW();
            case ComponentPackage.PARAMETER_TYPE__SHOWIF:
                return SHOWIF_EDEFAULT == null ? sHOWIF != null : !SHOWIF_EDEFAULT.equals(sHOWIF);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (bACKGROUND: ");
        result.append(bACKGROUND);
        result.append(", cOLOR: ");
        result.append(cOLOR);
        result.append(", cONTEXT: ");
        result.append(cONTEXT);
        result.append(", cONTEXTMODE: ");
        if (cONTEXTMODEESet) result.append(cONTEXTMODE); else result.append("<unset>");
        result.append(", dYNAMICSETTINGS: ");
        if (dYNAMICSETTINGSESet) result.append(dYNAMICSETTINGS); else result.append("<unset>");
        result.append(", fIELD: ");
        result.append(fIELD);
        result.append(", fILTER: ");
        result.append(fILTER);
        result.append(", gROUP: ");
        result.append(gROUP);
        result.append(", lOG4J_ENABLED: ");
        if (lOG4J_ENABLEDESet) result.append(lOG4J_ENABLED); else result.append("<unset>");
        result.append(", mAXLENGTH: ");
        if (mAXLENGTHESet) result.append(mAXLENGTH); else result.append("<unset>");
        result.append(", nAME: ");
        result.append(nAME);
        result.append(", nBLINES: ");
        if (nBLINESESet) result.append(nBLINES); else result.append("<unset>");
        result.append(", nOCONTEXTASSIST: ");
        if (nOCONTEXTASSISTESet) result.append(nOCONTEXTASSIST); else result.append("<unset>");
        result.append(", nOTREADONLYIF: ");
        result.append(nOTREADONLYIF);
        result.append(", nOTSHOWIF: ");
        result.append(nOTSHOWIF);
        result.append(", nUMROW: ");
        if (nUMROWESet) result.append(nUMROW); else result.append("<unset>");
        result.append(", rAW: ");
        if (rAWESet) result.append(rAW); else result.append("<unset>");
        result.append(", rEADONLY: ");
        if (rEADONLYESet) result.append(rEADONLY); else result.append("<unset>");
        result.append(", rEADONLYIF: ");
        result.append(rEADONLYIF);
        result.append(", rEPOSITORYVALUE: ");
        result.append(rEPOSITORYVALUE);
        result.append(", rEQUIRED: ");
        if (rEQUIREDESet) result.append(rEQUIRED); else result.append("<unset>");
        result.append(", rEQUIREDIF: ");
        result.append(rEQUIREDIF);
        result.append(", sHOW: ");
        if (sHOWESet) result.append(sHOW); else result.append("<unset>");
        result.append(", sHOWIF: ");
        result.append(sHOWIF);
        result.append(')');
        return result.toString();
    }

} //PARAMETERTypeImpl

/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.repository.model.json.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.talend.core.model.metadata.builder.connection.impl.ConnectionImpl;
import org.talend.repository.model.json.JSONFileConnection;
import org.talend.repository.model.json.JSONFileNode;
import org.talend.repository.model.json.JSONXPathLoopDescriptor;
import org.talend.repository.model.json.JsonPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>JSON File Connection</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getJSONFilePath <em>JSON File Path</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#isGuess <em>Guess</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getMaskXPattern <em>Mask XPattern</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#isInputModel <em>Input Model</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getFileContent <em>File Content</em>}</li>
 *   <li>{@link org.talend.repository.model.json.impl.JSONFileConnectionImpl#getReadbyMode <em>Readby Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JSONFileConnectionImpl extends ConnectionImpl implements JSONFileConnection {

    /**
     * The default value of the '{@link #getJSONFilePath() <em>JSON File Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJSONFilePath()
     * @generated
     * @ordered
     */
    protected static final String JSON_FILE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJSONFilePath() <em>JSON File Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJSONFilePath()
     * @generated
     * @ordered
     */
    protected String jsonFilePath = JSON_FILE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #isGuess() <em>Guess</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isGuess()
     * @generated
     * @ordered
     */
    protected static final boolean GUESS_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isGuess() <em>Guess</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #isGuess()
     * @generated
     * @ordered
     */
    protected boolean guess = GUESS_EDEFAULT;

    /**
     * The default value of the '{@link #getMaskXPattern() <em>Mask XPattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaskXPattern()
     * @generated
     * @ordered
     */
    protected static final String MASK_XPATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaskXPattern() <em>Mask XPattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaskXPattern()
     * @generated
     * @ordered
     */
    protected String maskXPattern = MASK_XPATTERN_EDEFAULT;

    /**
     * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getSchema()
     * @generated
     * @ordered
     */
    protected EList<JSONXPathLoopDescriptor> schema;

    /**
     * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
    protected static final String ENCODING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getEncoding()
     * @generated
     * @ordered
     */
    protected String encoding = ENCODING_EDEFAULT;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected EList<JSONFileNode> group;

    /**
     * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoot()
     * @generated
     * @ordered
     */
    protected EList<JSONFileNode> root;

    /**
     * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoop()
     * @generated
     * @ordered
     */
    protected EList<JSONFileNode> loop;

    /**
     * The default value of the '{@link #isInputModel() <em>Input Model</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isInputModel()
     * @generated
     * @ordered
     */
    protected static final boolean INPUT_MODEL_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isInputModel() <em>Input Model</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #isInputModel()
     * @generated
     * @ordered
     */
    protected boolean inputModel = INPUT_MODEL_EDEFAULT;

    /**
     * The default value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getOutputFilePath()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_FILE_PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getOutputFilePath()
     * @generated
     * @ordered
     */
    protected String outputFilePath = OUTPUT_FILE_PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getFileContent() <em>File Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFileContent()
     * @generated
     * @ordered
     */
    protected static final byte[] FILE_CONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFileContent() <em>File Content</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getFileContent()
     * @generated
     * @ordered
     */
    protected byte[] fileContent = FILE_CONTENT_EDEFAULT;

    /**
     * The default value of the '{@link #getReadbyMode() <em>Readby Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadbyMode()
     * @generated
     * @ordered
     */
    protected static final String READBY_MODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadbyMode() <em>Readby Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadbyMode()
     * @generated
     * @ordered
     */
    protected String readbyMode = READBY_MODE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected JSONFileConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JsonPackage.Literals.JSON_FILE_CONNECTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getJSONFilePath() {
        return jsonFilePath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setJSONFilePath(String newJSONFilePath) {
        String oldJSONFilePath = jsonFilePath;
        jsonFilePath = newJSONFilePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__JSON_FILE_PATH, oldJSONFilePath, jsonFilePath));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isGuess() {
        return guess;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setGuess(boolean newGuess) {
        boolean oldGuess = guess;
        guess = newGuess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__GUESS, oldGuess, guess));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getMaskXPattern() {
        return maskXPattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setMaskXPattern(String newMaskXPattern) {
        String oldMaskXPattern = maskXPattern;
        maskXPattern = newMaskXPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__MASK_XPATTERN, oldMaskXPattern, maskXPattern));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<JSONXPathLoopDescriptor> getSchema() {
        if (schema == null) {
            schema = new EObjectContainmentWithInverseEList<JSONXPathLoopDescriptor>(JSONXPathLoopDescriptor.class, this, JsonPackage.JSON_FILE_CONNECTION__SCHEMA, JsonPackage.JSONX_PATH_LOOP_DESCRIPTOR__CONNECTION);
        }
        return schema;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setEncoding(String newEncoding) {
        String oldEncoding = encoding;
        encoding = newEncoding;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__ENCODING, oldEncoding, encoding));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<JSONFileNode> getGroup() {
        if (group == null) {
            group = new EObjectContainmentEList<JSONFileNode>(JSONFileNode.class, this, JsonPackage.JSON_FILE_CONNECTION__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<JSONFileNode> getRoot() {
        if (root == null) {
            root = new EObjectContainmentEList<JSONFileNode>(JSONFileNode.class, this, JsonPackage.JSON_FILE_CONNECTION__ROOT);
        }
        return root;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<JSONFileNode> getLoop() {
        if (loop == null) {
            loop = new EObjectContainmentEList<JSONFileNode>(JSONFileNode.class, this, JsonPackage.JSON_FILE_CONNECTION__LOOP);
        }
        return loop;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean isInputModel() {
        return inputModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setInputModel(boolean newInputModel) {
        boolean oldInputModel = inputModel;
        inputModel = newInputModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__INPUT_MODEL, oldInputModel, inputModel));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getOutputFilePath() {
        return outputFilePath;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setOutputFilePath(String newOutputFilePath) {
        String oldOutputFilePath = outputFilePath;
        outputFilePath = newOutputFilePath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__OUTPUT_FILE_PATH, oldOutputFilePath, outputFilePath));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public byte[] getFileContent() {
        return fileContent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFileContent(byte[] newFileContent) {
        byte[] oldFileContent = fileContent;
        fileContent = newFileContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__FILE_CONTENT, oldFileContent, fileContent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReadbyMode() {
        return readbyMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadbyMode(String newReadbyMode) {
        String oldReadbyMode = readbyMode;
        readbyMode = newReadbyMode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, JsonPackage.JSON_FILE_CONNECTION__READBY_MODE, oldReadbyMode, readbyMode));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchema()).basicAdd(otherEnd, msgs);
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
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                return ((InternalEList<?>)getSchema()).basicRemove(otherEnd, msgs);
            case JsonPackage.JSON_FILE_CONNECTION__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case JsonPackage.JSON_FILE_CONNECTION__ROOT:
                return ((InternalEList<?>)getRoot()).basicRemove(otherEnd, msgs);
            case JsonPackage.JSON_FILE_CONNECTION__LOOP:
                return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
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
            case JsonPackage.JSON_FILE_CONNECTION__JSON_FILE_PATH:
                return getJSONFilePath();
            case JsonPackage.JSON_FILE_CONNECTION__GUESS:
                return isGuess();
            case JsonPackage.JSON_FILE_CONNECTION__MASK_XPATTERN:
                return getMaskXPattern();
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                return getSchema();
            case JsonPackage.JSON_FILE_CONNECTION__ENCODING:
                return getEncoding();
            case JsonPackage.JSON_FILE_CONNECTION__GROUP:
                return getGroup();
            case JsonPackage.JSON_FILE_CONNECTION__ROOT:
                return getRoot();
            case JsonPackage.JSON_FILE_CONNECTION__LOOP:
                return getLoop();
            case JsonPackage.JSON_FILE_CONNECTION__INPUT_MODEL:
                return isInputModel();
            case JsonPackage.JSON_FILE_CONNECTION__OUTPUT_FILE_PATH:
                return getOutputFilePath();
            case JsonPackage.JSON_FILE_CONNECTION__FILE_CONTENT:
                return getFileContent();
            case JsonPackage.JSON_FILE_CONNECTION__READBY_MODE:
                return getReadbyMode();
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
            case JsonPackage.JSON_FILE_CONNECTION__JSON_FILE_PATH:
                setJSONFilePath((String)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__GUESS:
                setGuess((Boolean)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__MASK_XPATTERN:
                setMaskXPattern((String)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                getSchema().clear();
                getSchema().addAll((Collection<? extends JSONXPathLoopDescriptor>)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__ENCODING:
                setEncoding((String)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__GROUP:
                getGroup().clear();
                getGroup().addAll((Collection<? extends JSONFileNode>)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__ROOT:
                getRoot().clear();
                getRoot().addAll((Collection<? extends JSONFileNode>)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__LOOP:
                getLoop().clear();
                getLoop().addAll((Collection<? extends JSONFileNode>)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__INPUT_MODEL:
                setInputModel((Boolean)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__OUTPUT_FILE_PATH:
                setOutputFilePath((String)newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__FILE_CONTENT:
                setFileContent((byte[])newValue);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__READBY_MODE:
                setReadbyMode((String)newValue);
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
            case JsonPackage.JSON_FILE_CONNECTION__JSON_FILE_PATH:
                setJSONFilePath(JSON_FILE_PATH_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__GUESS:
                setGuess(GUESS_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__MASK_XPATTERN:
                setMaskXPattern(MASK_XPATTERN_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                getSchema().clear();
                return;
            case JsonPackage.JSON_FILE_CONNECTION__ENCODING:
                setEncoding(ENCODING_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__GROUP:
                getGroup().clear();
                return;
            case JsonPackage.JSON_FILE_CONNECTION__ROOT:
                getRoot().clear();
                return;
            case JsonPackage.JSON_FILE_CONNECTION__LOOP:
                getLoop().clear();
                return;
            case JsonPackage.JSON_FILE_CONNECTION__INPUT_MODEL:
                setInputModel(INPUT_MODEL_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__OUTPUT_FILE_PATH:
                setOutputFilePath(OUTPUT_FILE_PATH_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__FILE_CONTENT:
                setFileContent(FILE_CONTENT_EDEFAULT);
                return;
            case JsonPackage.JSON_FILE_CONNECTION__READBY_MODE:
                setReadbyMode(READBY_MODE_EDEFAULT);
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
            case JsonPackage.JSON_FILE_CONNECTION__JSON_FILE_PATH:
                return JSON_FILE_PATH_EDEFAULT == null ? jsonFilePath != null : !JSON_FILE_PATH_EDEFAULT.equals(jsonFilePath);
            case JsonPackage.JSON_FILE_CONNECTION__GUESS:
                return guess != GUESS_EDEFAULT;
            case JsonPackage.JSON_FILE_CONNECTION__MASK_XPATTERN:
                return MASK_XPATTERN_EDEFAULT == null ? maskXPattern != null : !MASK_XPATTERN_EDEFAULT.equals(maskXPattern);
            case JsonPackage.JSON_FILE_CONNECTION__SCHEMA:
                return schema != null && !schema.isEmpty();
            case JsonPackage.JSON_FILE_CONNECTION__ENCODING:
                return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
            case JsonPackage.JSON_FILE_CONNECTION__GROUP:
                return group != null && !group.isEmpty();
            case JsonPackage.JSON_FILE_CONNECTION__ROOT:
                return root != null && !root.isEmpty();
            case JsonPackage.JSON_FILE_CONNECTION__LOOP:
                return loop != null && !loop.isEmpty();
            case JsonPackage.JSON_FILE_CONNECTION__INPUT_MODEL:
                return inputModel != INPUT_MODEL_EDEFAULT;
            case JsonPackage.JSON_FILE_CONNECTION__OUTPUT_FILE_PATH:
                return OUTPUT_FILE_PATH_EDEFAULT == null ? outputFilePath != null : !OUTPUT_FILE_PATH_EDEFAULT.equals(outputFilePath);
            case JsonPackage.JSON_FILE_CONNECTION__FILE_CONTENT:
                return FILE_CONTENT_EDEFAULT == null ? fileContent != null : !FILE_CONTENT_EDEFAULT.equals(fileContent);
            case JsonPackage.JSON_FILE_CONNECTION__READBY_MODE:
                return READBY_MODE_EDEFAULT == null ? readbyMode != null : !READBY_MODE_EDEFAULT.equals(readbyMode);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (JSONFilePath: ");
        result.append(jsonFilePath);
        result.append(", Guess: ");
        result.append(guess);
        result.append(", MaskXPattern: ");
        result.append(maskXPattern);
        result.append(", Encoding: ");
        result.append(encoding);
        result.append(", inputModel: ");
        result.append(inputModel);
        result.append(", outputFilePath: ");
        result.append(outputFilePath);
        result.append(", fileContent: ");
        result.append(fileContent);
        result.append(", readbyMode: ");
        result.append(readbyMode);
        result.append(')');
        return result.toString();
    }

} // JSONFileConnectionImpl

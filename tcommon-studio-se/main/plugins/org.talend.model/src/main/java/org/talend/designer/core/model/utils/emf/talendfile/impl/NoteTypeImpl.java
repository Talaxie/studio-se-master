/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.designer.core.model.utils.emf.talendfile.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.NoteType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getSizeHeight <em>Size Height</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getSizeWidth <em>Size Width</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.talend.designer.core.model.utils.emf.talendfile.impl.NoteTypeImpl#getElementParameter <em>Element Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteTypeImpl extends EObjectImpl implements NoteType {
    /**
     * The default value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOpaque()
     * @generated
     * @ordered
     */
    protected static final boolean OPAQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isOpaque()
     * @generated
     * @ordered
     */
    protected boolean opaque = OPAQUE_EDEFAULT;

    /**
     * This is true if the Opaque attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean opaqueESet;

    /**
     * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosX()
     * @generated
     * @ordered
     */
    protected static final int POS_X_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosX()
     * @generated
     * @ordered
     */
    protected int posX = POS_X_EDEFAULT;

    /**
     * This is true if the Pos X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean posXESet;

    /**
     * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosY()
     * @generated
     * @ordered
     */
    protected static final int POS_Y_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosY()
     * @generated
     * @ordered
     */
    protected int posY = POS_Y_EDEFAULT;

    /**
     * This is true if the Pos Y attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean posYESet;

    /**
     * The default value of the '{@link #getSizeHeight() <em>Size Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeHeight()
     * @generated
     * @ordered
     */
    protected static final int SIZE_HEIGHT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSizeHeight() <em>Size Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeHeight()
     * @generated
     * @ordered
     */
    protected int sizeHeight = SIZE_HEIGHT_EDEFAULT;

    /**
     * This is true if the Size Height attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeHeightESet;

    /**
     * The default value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeWidth()
     * @generated
     * @ordered
     */
    protected static final int SIZE_WIDTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSizeWidth() <em>Size Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeWidth()
     * @generated
     * @ordered
     */
    protected int sizeWidth = SIZE_WIDTH_EDEFAULT;

    /**
     * This is true if the Size Width attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeWidthESet;

    /**
     * The default value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected static final String TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText()
     * @generated
     * @ordered
     */
    protected String text = TEXT_EDEFAULT;

    /**
     * The cached value of the '{@link #getElementParameter() <em>Element Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementParameter()
     * @generated
     * @ordered
     */
    protected EList elementParameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NoteTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EClass eStaticClass() {
        return TalendFilePackage.Literals.NOTE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isOpaque() {
        return opaque;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpaque(boolean newOpaque) {
        boolean oldOpaque = opaque;
        opaque = newOpaque;
        boolean oldOpaqueESet = opaqueESet;
        opaqueESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__OPAQUE, oldOpaque, opaque, !oldOpaqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOpaque() {
        boolean oldOpaque = opaque;
        boolean oldOpaqueESet = opaqueESet;
        opaque = OPAQUE_EDEFAULT;
        opaqueESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NOTE_TYPE__OPAQUE, oldOpaque, OPAQUE_EDEFAULT, oldOpaqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOpaque() {
        return opaqueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPosX() {
        return posX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosX(int newPosX) {
        int oldPosX = posX;
        posX = newPosX;
        boolean oldPosXESet = posXESet;
        posXESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__POS_X, oldPosX, posX, !oldPosXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPosX() {
        int oldPosX = posX;
        boolean oldPosXESet = posXESet;
        posX = POS_X_EDEFAULT;
        posXESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NOTE_TYPE__POS_X, oldPosX, POS_X_EDEFAULT, oldPosXESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPosX() {
        return posXESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPosY() {
        return posY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosY(int newPosY) {
        int oldPosY = posY;
        posY = newPosY;
        boolean oldPosYESet = posYESet;
        posYESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__POS_Y, oldPosY, posY, !oldPosYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPosY() {
        int oldPosY = posY;
        boolean oldPosYESet = posYESet;
        posY = POS_Y_EDEFAULT;
        posYESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NOTE_TYPE__POS_Y, oldPosY, POS_Y_EDEFAULT, oldPosYESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPosY() {
        return posYESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSizeHeight() {
        return sizeHeight;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeHeight(int newSizeHeight) {
        int oldSizeHeight = sizeHeight;
        sizeHeight = newSizeHeight;
        boolean oldSizeHeightESet = sizeHeightESet;
        sizeHeightESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT, oldSizeHeight, sizeHeight, !oldSizeHeightESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSizeHeight() {
        int oldSizeHeight = sizeHeight;
        boolean oldSizeHeightESet = sizeHeightESet;
        sizeHeight = SIZE_HEIGHT_EDEFAULT;
        sizeHeightESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT, oldSizeHeight, SIZE_HEIGHT_EDEFAULT, oldSizeHeightESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSizeHeight() {
        return sizeHeightESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSizeWidth() {
        return sizeWidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSizeWidth(int newSizeWidth) {
        int oldSizeWidth = sizeWidth;
        sizeWidth = newSizeWidth;
        boolean oldSizeWidthESet = sizeWidthESet;
        sizeWidthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__SIZE_WIDTH, oldSizeWidth, sizeWidth, !oldSizeWidthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSizeWidth() {
        int oldSizeWidth = sizeWidth;
        boolean oldSizeWidthESet = sizeWidthESet;
        sizeWidth = SIZE_WIDTH_EDEFAULT;
        sizeWidthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, TalendFilePackage.NOTE_TYPE__SIZE_WIDTH, oldSizeWidth, SIZE_WIDTH_EDEFAULT, oldSizeWidthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSizeWidth() {
        return sizeWidthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getText() {
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setText(String newText) {
        String oldText = text;
        text = newText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TalendFilePackage.NOTE_TYPE__TEXT, oldText, text));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList getElementParameter() {
        if (elementParameter == null) {
            elementParameter = new EObjectContainmentEList(ElementParameterType.class, this, TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER);
        }
        return elementParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER:
                return ((InternalEList)getElementParameter()).basicRemove(otherEnd, msgs);
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
            case TalendFilePackage.NOTE_TYPE__OPAQUE:
                return isOpaque() ? Boolean.TRUE : Boolean.FALSE;
            case TalendFilePackage.NOTE_TYPE__POS_X:
                return new Integer(getPosX());
            case TalendFilePackage.NOTE_TYPE__POS_Y:
                return new Integer(getPosY());
            case TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT:
                return new Integer(getSizeHeight());
            case TalendFilePackage.NOTE_TYPE__SIZE_WIDTH:
                return new Integer(getSizeWidth());
            case TalendFilePackage.NOTE_TYPE__TEXT:
                return getText();
            case TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER:
                return getElementParameter();
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
            case TalendFilePackage.NOTE_TYPE__OPAQUE:
                setOpaque(((Boolean)newValue).booleanValue());
                return;
            case TalendFilePackage.NOTE_TYPE__POS_X:
                setPosX(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NOTE_TYPE__POS_Y:
                setPosY(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT:
                setSizeHeight(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NOTE_TYPE__SIZE_WIDTH:
                setSizeWidth(((Integer)newValue).intValue());
                return;
            case TalendFilePackage.NOTE_TYPE__TEXT:
                setText((String)newValue);
                return;
            case TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
                getElementParameter().addAll((Collection)newValue);
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
            case TalendFilePackage.NOTE_TYPE__OPAQUE:
                unsetOpaque();
                return;
            case TalendFilePackage.NOTE_TYPE__POS_X:
                unsetPosX();
                return;
            case TalendFilePackage.NOTE_TYPE__POS_Y:
                unsetPosY();
                return;
            case TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT:
                unsetSizeHeight();
                return;
            case TalendFilePackage.NOTE_TYPE__SIZE_WIDTH:
                unsetSizeWidth();
                return;
            case TalendFilePackage.NOTE_TYPE__TEXT:
                setText(TEXT_EDEFAULT);
                return;
            case TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER:
                getElementParameter().clear();
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
            case TalendFilePackage.NOTE_TYPE__OPAQUE:
                return isSetOpaque();
            case TalendFilePackage.NOTE_TYPE__POS_X:
                return isSetPosX();
            case TalendFilePackage.NOTE_TYPE__POS_Y:
                return isSetPosY();
            case TalendFilePackage.NOTE_TYPE__SIZE_HEIGHT:
                return isSetSizeHeight();
            case TalendFilePackage.NOTE_TYPE__SIZE_WIDTH:
                return isSetSizeWidth();
            case TalendFilePackage.NOTE_TYPE__TEXT:
                return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
            case TalendFilePackage.NOTE_TYPE__ELEMENT_PARAMETER:
                return elementParameter != null && !elementParameter.isEmpty();
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
        result.append(" (opaque: ");
        if (opaqueESet) result.append(opaque); else result.append("<unset>");
        result.append(", posX: ");
        if (posXESet) result.append(posX); else result.append("<unset>");
        result.append(", posY: ");
        if (posYESet) result.append(posY); else result.append("<unset>");
        result.append(", sizeHeight: ");
        if (sizeHeightESet) result.append(sizeHeight); else result.append("<unset>");
        result.append(", sizeWidth: ");
        if (sizeWidthESet) result.append(sizeWidth); else result.append("<unset>");
        result.append(", text: ");
        result.append(text);
        result.append(')');
        return result.toString();
    }

} //NoteTypeImpl
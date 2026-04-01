/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.core.model.properties.ByteArray;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Byte Array</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.core.model.properties.impl.ByteArrayImpl#getInnerContent <em>Inner Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ByteArrayImpl extends EObjectImpl implements ByteArray {

    /**
     * The default value of the '{@link #getInnerContent() <em>Inner Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInnerContent()
     * @generated
     * @ordered
     */
    protected static final byte[] INNER_CONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInnerContent() <em>Inner Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInnerContent()
     * @generated
     * @ordered
     */
    protected byte[] innerContent = INNER_CONTENT_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ByteArrayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.BYTE_ARRAY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public byte[] getInnerContent() {
        return innerContent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setInnerContent(byte[] newInnerContent) {
        byte[] oldInnerContent = innerContent;
        innerContent = newInnerContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BYTE_ARRAY__INNER_CONTENT, oldInnerContent, innerContent));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case PropertiesPackage.BYTE_ARRAY__INNER_CONTENT:
                return getInnerContent();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.BYTE_ARRAY__INNER_CONTENT:
                setInnerContent((byte[])newValue);
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
            case PropertiesPackage.BYTE_ARRAY__INNER_CONTENT:
                setInnerContent(INNER_CONTENT_EDEFAULT);
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
            case PropertiesPackage.BYTE_ARRAY__INNER_CONTENT:
                return INNER_CONTENT_EDEFAULT == null ? innerContent != null : !INNER_CONTENT_EDEFAULT.equals(innerContent);
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
        result.append(" (innerContent: ");
        result.append(innerContent);
        result.append(')');
        return result.toString();
    }

    public void setInnerContentFromFile(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }

        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file));
        try {
            byte[] tempContent = new byte[stream.available()];
            stream.read(tempContent);
            setInnerContent(tempContent);
        } catch (IOException e) {
            throw e;
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
    }

    public void setInnerContentFromFile(IFile file) throws IOException, CoreException {
        if (!file.exists()) {
            setInnerContent(new byte[0]);
            return;
        }

        BufferedInputStream stream = new BufferedInputStream(file.getContents());
        try {
            byte[] tempContent = new byte[stream.available()];
            stream.read(tempContent);
            setInnerContent(tempContent);
        } catch (IOException e) {
            throw e;
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
    }

    public void setInnerContentToFile(File file) throws IOException {
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            stream.write(getInnerContent());
        } catch (IOException e) {
            throw e;
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
    }

} // ByteArrayImpl

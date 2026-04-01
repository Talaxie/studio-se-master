/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Byte Array</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.ByteArray#getInnerContent <em>Inner Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.core.model.properties.PropertiesPackage#getByteArray()
 * @model
 * @generated
 */
public interface ByteArray extends EObject {

    /**
     * Returns the value of the '<em><b>Inner Content</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inner Content</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inner Content</em>' attribute.
     * @see #setInnerContent(byte[])
     * @see org.talend.core.model.properties.PropertiesPackage#getByteArray_InnerContent()
     * @model
     * @generated
     */
    byte[] getInnerContent();

    /**
     * Sets the value of the '{@link org.talend.core.model.properties.ByteArray#getInnerContent <em>Inner Content</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Inner Content</em>' attribute.
     * @see #getInnerContent()
     * @generated
     */
    void setInnerContent(byte[] value);

    void setInnerContentFromFile(IFile file) throws IOException, CoreException;
    void setInnerContentFromFile(File file) throws IOException;

    void setInnerContentToFile(File file) throws IOException;

} // ByteArray

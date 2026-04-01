/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.dmsii;

import orgomg.cwm.foundation.businessinformation.Description;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>DASDL Comment</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the text of the single DASDL <comment> that nearly every object in a DASDL source may have. These comments differ from Remarks in that there is only one instance per DASDL object, their position in the source is constrained, and they
 * are stored in the database description files. Remarks are not tied to particular database objects, can occur anywhere in a DASDL source, and exist only in the DASDL source itself. 
 * 
 * For all DASDLComments, the language attribute contains the string "DASDL".
 * <!-- end-model-doc -->
 *
 *
 * @see orgomg.cwmx.resource.dmsii.DmsiiPackage#getDASDLComment()
 * @model
 * @generated
 */
public interface DASDLComment extends Description {
} // DASDLComment

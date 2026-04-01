/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.impl;

import org.eclipse.emf.ecore.EClass;
import orgomg.cwm.objectmodel.relationships.impl.AssociationImpl;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.foundation.er.Relationship;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Relationship</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends AssociationImpl implements Relationship {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErPackage.Literals.RELATIONSHIP;
    }

} // RelationshipImpl

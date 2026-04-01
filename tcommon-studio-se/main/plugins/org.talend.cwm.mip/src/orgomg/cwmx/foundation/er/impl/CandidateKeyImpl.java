/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.foundation.er.impl;

import org.eclipse.emf.ecore.EClass;
import orgomg.cwm.foundation.keysindexes.impl.UniqueKeyImpl;
import orgomg.cwmx.foundation.er.CandidateKey;
import orgomg.cwmx.foundation.er.ErPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Candidate Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CandidateKeyImpl extends UniqueKeyImpl implements CandidateKey {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CandidateKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ErPackage.Literals.CANDIDATE_KEY;
    }

} // CandidateKeyImpl

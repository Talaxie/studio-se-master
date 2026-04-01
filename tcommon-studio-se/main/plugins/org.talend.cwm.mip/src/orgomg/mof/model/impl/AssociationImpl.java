/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.mof.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.ModeledSemanticContext;
import orgomg.mof.model.Association;
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Association</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.mof.model.impl.AssociationImpl#getModeledProjection <em>Modeled Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends EObjectImpl implements Association {

    /**
     * The cached value of the '{@link #getModeledProjection() <em>Modeled Projection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModeledProjection()
     * @generated
     * @ordered
     */
    protected EList<ModeledSemanticContext> modeledProjection;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected AssociationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.ASSOCIATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModeledSemanticContext> getModeledProjection() {
        if (modeledProjection == null) {
            modeledProjection = new EObjectWithInverseResolvingEList.ManyInverse<ModeledSemanticContext>(
                    ModeledSemanticContext.class, this, ModelPackage.ASSOCIATION__MODELED_PROJECTION,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION);
        }
        return modeledProjection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getModeledProjection()).basicAdd(otherEnd, msgs);
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
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            return ((InternalEList<?>) getModeledProjection()).basicRemove(otherEnd, msgs);
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
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            return getModeledProjection();
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
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            getModeledProjection().clear();
            getModeledProjection().addAll((Collection<? extends ModeledSemanticContext>) newValue);
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
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            getModeledProjection().clear();
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
        case ModelPackage.ASSOCIATION__MODELED_PROJECTION:
            return modeledProjection != null && !modeledProjection.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // AssociationImpl

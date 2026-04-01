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
import orgomg.cwmmip.ModeledGraphSubset;
import orgomg.cwmmip.ModeledSemanticContext;
import orgomg.mof.model.ModelElement;
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.mof.model.impl.ModelElementImpl#getModeledGraphSubset <em>Modeled Graph Subset</em>}</li>
 *   <li>{@link orgomg.mof.model.impl.ModelElementImpl#getModeledProjection <em>Modeled Projection</em>}</li>
 *   <li>{@link orgomg.mof.model.impl.ModelElementImpl#getModeledSemanticContext <em>Modeled Semantic Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {

    /**
     * The cached value of the '{@link #getModeledGraphSubset() <em>Modeled Graph Subset</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModeledGraphSubset()
     * @generated
     * @ordered
     */
    protected EList<ModeledGraphSubset> modeledGraphSubset;

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
     * The cached value of the '{@link #getModeledSemanticContext() <em>Modeled Semantic Context</em>}' reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getModeledSemanticContext()
     * @generated
     * @ordered
     */
    protected EList<ModeledSemanticContext> modeledSemanticContext;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ModelElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.MODEL_ELEMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModeledGraphSubset> getModeledGraphSubset() {
        if (modeledGraphSubset == null) {
            modeledGraphSubset = new EObjectWithInverseResolvingEList<ModeledGraphSubset>(ModeledGraphSubset.class, this,
                    ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET, CwmmipPackage.MODELED_GRAPH_SUBSET__MOF_ELEMENT);
        }
        return modeledGraphSubset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModeledSemanticContext> getModeledProjection() {
        if (modeledProjection == null) {
            modeledProjection = new EObjectWithInverseResolvingEList.ManyInverse<ModeledSemanticContext>(
                    ModeledSemanticContext.class, this, ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT);
        }
        return modeledProjection;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModeledSemanticContext> getModeledSemanticContext() {
        if (modeledSemanticContext == null) {
            modeledSemanticContext = new EObjectWithInverseResolvingEList.ManyInverse<ModeledSemanticContext>(
                    ModeledSemanticContext.class, this, ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT);
        }
        return modeledSemanticContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getModeledGraphSubset()).basicAdd(otherEnd, msgs);
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getModeledProjection()).basicAdd(otherEnd, msgs);
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getModeledSemanticContext()).basicAdd(otherEnd, msgs);
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
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            return ((InternalEList<?>) getModeledGraphSubset()).basicRemove(otherEnd, msgs);
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            return ((InternalEList<?>) getModeledProjection()).basicRemove(otherEnd, msgs);
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            return ((InternalEList<?>) getModeledSemanticContext()).basicRemove(otherEnd, msgs);
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
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            return getModeledGraphSubset();
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            return getModeledProjection();
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            return getModeledSemanticContext();
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
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            getModeledGraphSubset().clear();
            getModeledGraphSubset().addAll((Collection<? extends ModeledGraphSubset>) newValue);
            return;
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            getModeledProjection().clear();
            getModeledProjection().addAll((Collection<? extends ModeledSemanticContext>) newValue);
            return;
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            getModeledSemanticContext().clear();
            getModeledSemanticContext().addAll((Collection<? extends ModeledSemanticContext>) newValue);
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
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            getModeledGraphSubset().clear();
            return;
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            getModeledProjection().clear();
            return;
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            getModeledSemanticContext().clear();
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
        case ModelPackage.MODEL_ELEMENT__MODELED_GRAPH_SUBSET:
            return modeledGraphSubset != null && !modeledGraphSubset.isEmpty();
        case ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION:
            return modeledProjection != null && !modeledProjection.isEmpty();
        case ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT:
            return modeledSemanticContext != null && !modeledSemanticContext.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ModelElementImpl

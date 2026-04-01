/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmmip.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmmip.ModeledSemanticContext;
import orgomg.mof.model.Association;
import orgomg.mof.model.ModelElement;
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Modeled Semantic Context</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmmip.impl.ModeledSemanticContextImpl#getMofAssociation <em>Mof Association</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.ModeledSemanticContextImpl#getMofElement <em>Mof Element</em>}</li>
 *   <li>{@link orgomg.cwmmip.impl.ModeledSemanticContextImpl#getMofAnchorElement <em>Mof Anchor Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeledSemanticContextImpl extends SemanticContextImpl implements ModeledSemanticContext {

    /**
     * The cached value of the '{@link #getMofAssociation() <em>Mof Association</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getMofAssociation()
     * @generated
     * @ordered
     */
    protected EList<Association> mofAssociation;

    /**
     * The cached value of the '{@link #getMofElement() <em>Mof Element</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getMofElement()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> mofElement;

    /**
     * The cached value of the '{@link #getMofAnchorElement() <em>Mof Anchor Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMofAnchorElement()
     * @generated
     * @ordered
     */
    protected EList<ModelElement> mofAnchorElement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ModeledSemanticContextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CwmmipPackage.Literals.MODELED_SEMANTIC_CONTEXT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Association> getMofAssociation() {
        if (mofAssociation == null) {
            mofAssociation = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION, ModelPackage.ASSOCIATION__MODELED_PROJECTION);
        }
        return mofAssociation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getMofElement() {
        if (mofElement == null) {
            mofElement = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT, ModelPackage.MODEL_ELEMENT__MODELED_PROJECTION);
        }
        return mofElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelElement> getMofAnchorElement() {
        if (mofAnchorElement == null) {
            mofAnchorElement = new EObjectWithInverseResolvingEList.ManyInverse<ModelElement>(ModelElement.class, this,
                    CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT,
                    ModelPackage.MODEL_ELEMENT__MODELED_SEMANTIC_CONTEXT);
        }
        return mofAnchorElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMofAssociation()).basicAdd(otherEnd, msgs);
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMofElement()).basicAdd(otherEnd, msgs);
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getMofAnchorElement()).basicAdd(otherEnd, msgs);
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
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            return ((InternalEList<?>) getMofAssociation()).basicRemove(otherEnd, msgs);
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            return ((InternalEList<?>) getMofElement()).basicRemove(otherEnd, msgs);
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            return ((InternalEList<?>) getMofAnchorElement()).basicRemove(otherEnd, msgs);
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
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            return getMofAssociation();
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            return getMofElement();
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            return getMofAnchorElement();
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
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            getMofAssociation().clear();
            getMofAssociation().addAll((Collection<? extends Association>) newValue);
            return;
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            getMofElement().clear();
            getMofElement().addAll((Collection<? extends ModelElement>) newValue);
            return;
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            getMofAnchorElement().clear();
            getMofAnchorElement().addAll((Collection<? extends ModelElement>) newValue);
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
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            getMofAssociation().clear();
            return;
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            getMofElement().clear();
            return;
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            getMofAnchorElement().clear();
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
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ASSOCIATION:
            return mofAssociation != null && !mofAssociation.isEmpty();
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ELEMENT:
            return mofElement != null && !mofElement.isEmpty();
        case CwmmipPackage.MODELED_SEMANTIC_CONTEXT__MOF_ANCHOR_ELEMENT:
            return mofAnchorElement != null && !mofAnchorElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ModeledSemanticContextImpl

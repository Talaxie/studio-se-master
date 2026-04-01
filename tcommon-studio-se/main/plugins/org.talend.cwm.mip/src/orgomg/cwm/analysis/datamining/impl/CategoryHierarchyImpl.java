/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.objectmodel.core.impl.ClassImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Category Hierarchy</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoryHierarchyImpl#getCategoricalAttribute <em>Categorical Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryHierarchyImpl extends ClassImpl implements CategoryHierarchy {

    /**
     * The cached value of the '{@link #getCategoricalAttribute() <em>Categorical Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCategoricalAttribute()
     * @generated
     * @ordered
     */
    protected EList<CategoricalAttribute> categoricalAttribute;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CategoryHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.CATEGORY_HIERARCHY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<CategoricalAttribute> getCategoricalAttribute() {
        if (categoricalAttribute == null) {
            categoricalAttribute = new EObjectWithInverseResolvingEList<CategoricalAttribute>(CategoricalAttribute.class, this,
                    DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE,
                    DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY);
        }
        return categoricalAttribute;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategoricalAttribute()).basicAdd(otherEnd, msgs);
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
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            return ((InternalEList<?>) getCategoricalAttribute()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            return getCategoricalAttribute();
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
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            getCategoricalAttribute().clear();
            getCategoricalAttribute().addAll((Collection<? extends CategoricalAttribute>) newValue);
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
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            getCategoricalAttribute().clear();
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
        case DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE:
            return categoricalAttribute != null && !categoricalAttribute.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CategoryHierarchyImpl

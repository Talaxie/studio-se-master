/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwm.analysis.datamining.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwm.analysis.datamining.CategoricalAttribute;
import orgomg.cwm.analysis.datamining.Category;
import orgomg.cwm.analysis.datamining.CategoryHierarchy;
import orgomg.cwm.analysis.datamining.DataminingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Categorical Attribute</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoricalAttributeImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link orgomg.cwm.analysis.datamining.impl.CategoricalAttributeImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoricalAttributeImpl extends MiningAttributeImpl implements CategoricalAttribute {

    /**
     * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTaxonomy()
     * @generated
     * @ordered
     */
    protected CategoryHierarchy taxonomy;

    /**
     * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCategory()
     * @generated
     * @ordered
     */
    protected EList<Category> category;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CategoricalAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataminingPackage.Literals.CATEGORICAL_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoryHierarchy getTaxonomy() {
        if (taxonomy != null && taxonomy.eIsProxy()) {
            InternalEObject oldTaxonomy = (InternalEObject) taxonomy;
            taxonomy = (CategoryHierarchy) eResolveProxy(oldTaxonomy);
            if (taxonomy != oldTaxonomy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY,
                            oldTaxonomy, taxonomy));
            }
        }
        return taxonomy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public CategoryHierarchy basicGetTaxonomy() {
        return taxonomy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTaxonomy(CategoryHierarchy newTaxonomy, NotificationChain msgs) {
        CategoryHierarchy oldTaxonomy = taxonomy;
        taxonomy = newTaxonomy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY, oldTaxonomy, newTaxonomy);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setTaxonomy(CategoryHierarchy newTaxonomy) {
        if (newTaxonomy != taxonomy) {
            NotificationChain msgs = null;
            if (taxonomy != null)
                msgs = ((InternalEObject) taxonomy).eInverseRemove(this,
                        DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE, CategoryHierarchy.class, msgs);
            if (newTaxonomy != null)
                msgs = ((InternalEObject) newTaxonomy).eInverseAdd(this,
                        DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE, CategoryHierarchy.class, msgs);
            msgs = basicSetTaxonomy(newTaxonomy, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY, newTaxonomy,
                    newTaxonomy));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Category> getCategory() {
        if (category == null) {
            category = new EObjectContainmentWithInverseEList<Category>(Category.class, this,
                    DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY, DataminingPackage.CATEGORY__CATEGORICAL_ATTRIBUTE);
        }
        return category;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            if (taxonomy != null)
                msgs = ((InternalEObject) taxonomy).eInverseRemove(this,
                        DataminingPackage.CATEGORY_HIERARCHY__CATEGORICAL_ATTRIBUTE, CategoryHierarchy.class, msgs);
            return basicSetTaxonomy((CategoryHierarchy) otherEnd, msgs);
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getCategory()).basicAdd(otherEnd, msgs);
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
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            return basicSetTaxonomy(null, msgs);
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            return ((InternalEList<?>) getCategory()).basicRemove(otherEnd, msgs);
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
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            if (resolve)
                return getTaxonomy();
            return basicGetTaxonomy();
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            return getCategory();
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
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            setTaxonomy((CategoryHierarchy) newValue);
            return;
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            getCategory().clear();
            getCategory().addAll((Collection<? extends Category>) newValue);
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
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            setTaxonomy((CategoryHierarchy) null);
            return;
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            getCategory().clear();
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
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__TAXONOMY:
            return taxonomy != null;
        case DataminingPackage.CATEGORICAL_ATTRIBUTE__CATEGORY:
            return category != null && !category.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // CategoricalAttributeImpl

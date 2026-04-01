/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package orgomg.cwmx.resource.express.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import orgomg.cwmx.resource.express.AggMapComponent;
import orgomg.cwmx.resource.express.Dimension;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.express.Relation;
import orgomg.cwmx.resource.express.ValueSet;
import orgomg.cwmx.resource.express.Worksheet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dimension</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orgomg.cwmx.resource.express.impl.DimensionImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.DimensionImpl#getColumnDimensionInWorksheet <em>Column Dimension In Worksheet</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.DimensionImpl#getRowDimensionInWorksheet <em>Row Dimension In Worksheet</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.DimensionImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link orgomg.cwmx.resource.express.impl.DimensionImpl#getAggMapComponent <em>Agg Map Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DimensionImpl extends orgomg.cwm.resource.multidimensional.impl.DimensionImpl implements Dimension {

    /**
     * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRelation()
     * @generated
     * @ordered
     */
    protected EList<Relation> relation;

    /**
     * The cached value of the '{@link #getColumnDimensionInWorksheet()
     * <em>Column Dimension In Worksheet</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getColumnDimensionInWorksheet()
     * @generated
     * @ordered
     */
    protected EList<Worksheet> columnDimensionInWorksheet;

    /**
     * The cached value of the '{@link #getRowDimensionInWorksheet() <em>Row Dimension In Worksheet</em>}' reference list.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getRowDimensionInWorksheet()
     * @generated
     * @ordered
     */
    protected EList<Worksheet> rowDimensionInWorksheet;

    /**
     * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getValueSet()
     * @generated
     * @ordered
     */
    protected EList<ValueSet> valueSet;

    /**
     * The cached value of the '{@link #getAggMapComponent() <em>Agg Map Component</em>}' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getAggMapComponent()
     * @generated
     * @ordered
     */
    protected EList<AggMapComponent> aggMapComponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected DimensionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressPackage.Literals.DIMENSION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Relation> getRelation() {
        if (relation == null) {
            relation = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, ExpressPackage.DIMENSION__RELATION,
                    ExpressPackage.RELATION__REFERENCE_DIMENSION);
        }
        return relation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Worksheet> getColumnDimensionInWorksheet() {
        if (columnDimensionInWorksheet == null) {
            columnDimensionInWorksheet = new EObjectWithInverseResolvingEList<Worksheet>(Worksheet.class, this,
                    ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET, ExpressPackage.WORKSHEET__COLUMN_DIMENSION);
        }
        return columnDimensionInWorksheet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<Worksheet> getRowDimensionInWorksheet() {
        if (rowDimensionInWorksheet == null) {
            rowDimensionInWorksheet = new EObjectWithInverseResolvingEList<Worksheet>(Worksheet.class, this,
                    ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET, ExpressPackage.WORKSHEET__ROW_DIMENSION);
        }
        return rowDimensionInWorksheet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<ValueSet> getValueSet() {
        if (valueSet == null) {
            valueSet = new EObjectWithInverseResolvingEList<ValueSet>(ValueSet.class, this, ExpressPackage.DIMENSION__VALUE_SET,
                    ExpressPackage.VALUE_SET__REFERENCE_DIMENSION);
        }
        return valueSet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public EList<AggMapComponent> getAggMapComponent() {
        if (aggMapComponent == null) {
            aggMapComponent = new EObjectWithInverseResolvingEList<AggMapComponent>(AggMapComponent.class, this,
                    ExpressPackage.DIMENSION__AGG_MAP_COMPONENT, ExpressPackage.AGG_MAP_COMPONENT__DIMENSION);
        }
        return aggMapComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case ExpressPackage.DIMENSION__RELATION:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRelation()).basicAdd(otherEnd, msgs);
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getColumnDimensionInWorksheet()).basicAdd(otherEnd, msgs);
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRowDimensionInWorksheet()).basicAdd(otherEnd, msgs);
        case ExpressPackage.DIMENSION__VALUE_SET:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getValueSet()).basicAdd(otherEnd, msgs);
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAggMapComponent()).basicAdd(otherEnd, msgs);
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
        case ExpressPackage.DIMENSION__RELATION:
            return ((InternalEList<?>) getRelation()).basicRemove(otherEnd, msgs);
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            return ((InternalEList<?>) getColumnDimensionInWorksheet()).basicRemove(otherEnd, msgs);
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            return ((InternalEList<?>) getRowDimensionInWorksheet()).basicRemove(otherEnd, msgs);
        case ExpressPackage.DIMENSION__VALUE_SET:
            return ((InternalEList<?>) getValueSet()).basicRemove(otherEnd, msgs);
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            return ((InternalEList<?>) getAggMapComponent()).basicRemove(otherEnd, msgs);
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
        case ExpressPackage.DIMENSION__RELATION:
            return getRelation();
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            return getColumnDimensionInWorksheet();
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            return getRowDimensionInWorksheet();
        case ExpressPackage.DIMENSION__VALUE_SET:
            return getValueSet();
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            return getAggMapComponent();
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
        case ExpressPackage.DIMENSION__RELATION:
            getRelation().clear();
            getRelation().addAll((Collection<? extends Relation>) newValue);
            return;
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            getColumnDimensionInWorksheet().clear();
            getColumnDimensionInWorksheet().addAll((Collection<? extends Worksheet>) newValue);
            return;
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            getRowDimensionInWorksheet().clear();
            getRowDimensionInWorksheet().addAll((Collection<? extends Worksheet>) newValue);
            return;
        case ExpressPackage.DIMENSION__VALUE_SET:
            getValueSet().clear();
            getValueSet().addAll((Collection<? extends ValueSet>) newValue);
            return;
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            getAggMapComponent().clear();
            getAggMapComponent().addAll((Collection<? extends AggMapComponent>) newValue);
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
        case ExpressPackage.DIMENSION__RELATION:
            getRelation().clear();
            return;
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            getColumnDimensionInWorksheet().clear();
            return;
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            getRowDimensionInWorksheet().clear();
            return;
        case ExpressPackage.DIMENSION__VALUE_SET:
            getValueSet().clear();
            return;
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            getAggMapComponent().clear();
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
        case ExpressPackage.DIMENSION__RELATION:
            return relation != null && !relation.isEmpty();
        case ExpressPackage.DIMENSION__COLUMN_DIMENSION_IN_WORKSHEET:
            return columnDimensionInWorksheet != null && !columnDimensionInWorksheet.isEmpty();
        case ExpressPackage.DIMENSION__ROW_DIMENSION_IN_WORKSHEET:
            return rowDimensionInWorksheet != null && !rowDimensionInWorksheet.isEmpty();
        case ExpressPackage.DIMENSION__VALUE_SET:
            return valueSet != null && !valueSet.isEmpty();
        case ExpressPackage.DIMENSION__AGG_MAP_COMPONENT:
            return aggMapComponent != null && !aggMapComponent.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DimensionImpl

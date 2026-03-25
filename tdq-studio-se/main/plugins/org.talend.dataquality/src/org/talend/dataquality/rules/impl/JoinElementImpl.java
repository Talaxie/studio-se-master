/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.rules.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.talend.dataquality.rules.JoinElement;
import org.talend.dataquality.rules.RulesPackage;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getColA <em>Col A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getColB <em>Col B</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getTableAliasA <em>Table Alias A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getTableAliasB <em>Table Alias B</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getColumnAliasA <em>Column Alias A</em>}</li>
 *   <li>{@link org.talend.dataquality.rules.impl.JoinElementImpl#getColumnAliasB <em>Column Alias B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinElementImpl extends EObjectImpl implements JoinElement {
    /**
     * The cached value of the '{@link #getColA() <em>Col A</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColA()
     * @generated
     * @ordered
     */
    protected ModelElement colA;

    /**
     * The cached value of the '{@link #getColB() <em>Col B</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColB()
     * @generated
     * @ordered
     */
    protected ModelElement colB;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final String OPERATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected String operator = OPERATOR_EDEFAULT;

    /**
     * The default value of the '{@link #getTableAliasA() <em>Table Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableAliasA()
     * @generated
     * @ordered
     */
    protected static final String TABLE_ALIAS_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTableAliasA() <em>Table Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableAliasA()
     * @generated
     * @ordered
     */
    protected String tableAliasA = TABLE_ALIAS_A_EDEFAULT;

    /**
     * The default value of the '{@link #getTableAliasB() <em>Table Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableAliasB()
     * @generated
     * @ordered
     */
    protected static final String TABLE_ALIAS_B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTableAliasB() <em>Table Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTableAliasB()
     * @generated
     * @ordered
     */
    protected String tableAliasB = TABLE_ALIAS_B_EDEFAULT;

    /**
     * The default value of the '{@link #getColumnAliasA() <em>Column Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnAliasA()
     * @generated
     * @ordered
     */
    protected static final String COLUMN_ALIAS_A_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColumnAliasA() <em>Column Alias A</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnAliasA()
     * @generated
     * @ordered
     */
    protected String columnAliasA = COLUMN_ALIAS_A_EDEFAULT;

    /**
     * The default value of the '{@link #getColumnAliasB() <em>Column Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnAliasB()
     * @generated
     * @ordered
     */
    protected static final String COLUMN_ALIAS_B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColumnAliasB() <em>Column Alias B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumnAliasB()
     * @generated
     * @ordered
     */
    protected String columnAliasB = COLUMN_ALIAS_B_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected JoinElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RulesPackage.Literals.JOIN_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement getColA() {
        if (colA != null && colA.eIsProxy()) {
            InternalEObject oldColA = (InternalEObject)colA;
            colA = (ModelElement)eResolveProxy(oldColA);
            if (colA != oldColA) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.JOIN_ELEMENT__COL_A, oldColA, colA));
            }
        }
        return colA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement basicGetColA() {
        return colA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColA(ModelElement newColA) {
        ModelElement oldColA = colA;
        colA = newColA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__COL_A, oldColA, colA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement getColB() {
        if (colB != null && colB.eIsProxy()) {
            InternalEObject oldColB = (InternalEObject)colB;
            colB = (ModelElement)eResolveProxy(oldColB);
            if (colB != oldColB) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.JOIN_ELEMENT__COL_B, oldColB, colB));
            }
        }
        return colB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelElement basicGetColB() {
        return colB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColB(ModelElement newColB) {
        ModelElement oldColB = colB;
        colB = newColB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__COL_B, oldColB, colB));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(String newOperator) {
        String oldOperator = operator;
        operator = newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__OPERATOR, oldOperator, operator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTableAliasA() {
        return tableAliasA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTableAliasA(String newTableAliasA) {
        String oldTableAliasA = tableAliasA;
        tableAliasA = newTableAliasA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_A, oldTableAliasA, tableAliasA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTableAliasB() {
        return tableAliasB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTableAliasB(String newTableAliasB) {
        String oldTableAliasB = tableAliasB;
        tableAliasB = newTableAliasB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_B, oldTableAliasB, tableAliasB));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getColumnAliasA() {
        return columnAliasA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColumnAliasA(String newColumnAliasA) {
        String oldColumnAliasA = columnAliasA;
        columnAliasA = newColumnAliasA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_A, oldColumnAliasA, columnAliasA));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getColumnAliasB() {
        return columnAliasB;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColumnAliasB(String newColumnAliasB) {
        String oldColumnAliasB = columnAliasB;
        columnAliasB = newColumnAliasB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_B, oldColumnAliasB, columnAliasB));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case RulesPackage.JOIN_ELEMENT__COL_A:
                if (resolve) return getColA();
                return basicGetColA();
            case RulesPackage.JOIN_ELEMENT__COL_B:
                if (resolve) return getColB();
                return basicGetColB();
            case RulesPackage.JOIN_ELEMENT__OPERATOR:
                return getOperator();
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_A:
                return getTableAliasA();
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_B:
                return getTableAliasB();
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_A:
                return getColumnAliasA();
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_B:
                return getColumnAliasB();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case RulesPackage.JOIN_ELEMENT__COL_A:
                setColA((ModelElement)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__COL_B:
                setColB((ModelElement)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__OPERATOR:
                setOperator((String)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_A:
                setTableAliasA((String)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_B:
                setTableAliasB((String)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_A:
                setColumnAliasA((String)newValue);
                return;
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_B:
                setColumnAliasB((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case RulesPackage.JOIN_ELEMENT__COL_A:
                setColA((ModelElement)null);
                return;
            case RulesPackage.JOIN_ELEMENT__COL_B:
                setColB((ModelElement)null);
                return;
            case RulesPackage.JOIN_ELEMENT__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
                return;
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_A:
                setTableAliasA(TABLE_ALIAS_A_EDEFAULT);
                return;
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_B:
                setTableAliasB(TABLE_ALIAS_B_EDEFAULT);
                return;
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_A:
                setColumnAliasA(COLUMN_ALIAS_A_EDEFAULT);
                return;
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_B:
                setColumnAliasB(COLUMN_ALIAS_B_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case RulesPackage.JOIN_ELEMENT__COL_A:
                return colA != null;
            case RulesPackage.JOIN_ELEMENT__COL_B:
                return colB != null;
            case RulesPackage.JOIN_ELEMENT__OPERATOR:
                return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_A:
                return TABLE_ALIAS_A_EDEFAULT == null ? tableAliasA != null : !TABLE_ALIAS_A_EDEFAULT.equals(tableAliasA);
            case RulesPackage.JOIN_ELEMENT__TABLE_ALIAS_B:
                return TABLE_ALIAS_B_EDEFAULT == null ? tableAliasB != null : !TABLE_ALIAS_B_EDEFAULT.equals(tableAliasB);
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_A:
                return COLUMN_ALIAS_A_EDEFAULT == null ? columnAliasA != null : !COLUMN_ALIAS_A_EDEFAULT.equals(columnAliasA);
            case RulesPackage.JOIN_ELEMENT__COLUMN_ALIAS_B:
                return COLUMN_ALIAS_B_EDEFAULT == null ? columnAliasB != null : !COLUMN_ALIAS_B_EDEFAULT.equals(columnAliasB);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(tableAliasA);
        result.append(".");
        result.append(columnAliasA);
        result.append(operator);
        result.append(tableAliasB);
        result.append(".");
        result.append(columnAliasB);
        return result.toString();
    }

} //JoinElementImpl

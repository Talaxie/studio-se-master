/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.core.model.properties.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.talend.core.model.properties.BusinessProcessItem;
import org.talend.core.model.properties.NotationHolder;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.SVGBusinessProcessItem;
import org.talend.designer.business.model.business.BusinessProcess;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Business Process Item</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.talend.core.model.properties.impl.BusinessProcessItemImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.BusinessProcessItemImpl#getSemantic <em>Semantic</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.BusinessProcessItemImpl#getNotationHolder <em>Notation Holder</em>}</li>
 *   <li>{@link org.talend.core.model.properties.impl.BusinessProcessItemImpl#getSvgBusinessProcessItem <em>Svg Business Process Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessProcessItemImpl extends ItemImpl implements BusinessProcessItem {

    /**
     * The cached value of the '{@link #getNotation() <em>Notation</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getNotation()
     * @generated
     * @ordered
     */
    protected Diagram notation;

    /**
     * The cached value of the '{@link #getSemantic() <em>Semantic</em>}' reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getSemantic()
     * @generated
     * @ordered
     */
    protected BusinessProcess semantic;

    /**
     * The cached value of the '{@link #getNotationHolder() <em>Notation Holder</em>}' reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @see #getNotationHolder()
     * @generated
     * @ordered
     */
    protected NotationHolder notationHolder;

    /**
     * The cached value of the '{@link #getSvgBusinessProcessItem() <em>Svg Business Process Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvgBusinessProcessItem()
     * @generated
     * @ordered
     */
    protected SVGBusinessProcessItem svgBusinessProcessItem;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected BusinessProcessItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return PropertiesPackage.Literals.BUSINESS_PROCESS_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Diagram getNotation() {
        if (notation != null && notation.eIsProxy()) {
            // migration from notation to notationHolder

            InternalEObject oldNotation = (InternalEObject) notation;
            notation = (Diagram) eResolveProxy(oldNotation);

            BusinessProcess semantic = getSemantic();

            Resource resource = semantic.eResource();
            resource.getContents().add(notationHolder);
            computeNotationHolder();
            resource.getContents().remove(notation);
            try {
                eResource().save(null);
                resource.save(null);
            } catch (IOException e) {
                e.printStackTrace();
            }

            notation = null;
            return getNotation();
        }
        if (notation == null && getNotationHolder().getNotationString() != null) {
            //automatically compute notation from notationholder
            ByteArrayInputStream in = new ByteArrayInputStream(getNotationHolder().getNotationString().getBytes());
            Resource resource = new XMIResourceImpl();
            try {
                resource.load(in, null);
            } catch (IOException e) {
                e.printStackTrace();
            }

            notation = (Diagram) resource.getContents().get(0);
            //don't seems to be usefull
            //EcoreUtil.resolveAll(notationHolder.eResource());
        }
        return notation;
    }

    public void computeNotationHolder() {
        Diagram notation = getNotation();

        Resource resource = new ResourceSetImpl().createResource(semantic.eResource().getURI());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        resource.getContents().add(notation);
        try {
            resource.save(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        notationHolder.setNotationString(out.toString());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Diagram basicGetNotation() {
        return notation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNotation(Diagram newNotation) {
        Diagram oldNotation = notation;
        notation = newNotation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION, oldNotation, notation));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessProcess getSemantic() {
        if (semantic != null && semantic.eIsProxy()) {
            InternalEObject oldSemantic = (InternalEObject)semantic;
            semantic = (BusinessProcess)eResolveProxy(oldSemantic);
            if (semantic != oldSemantic) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC, oldSemantic, semantic));
            }
        }
        return semantic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public BusinessProcess basicGetSemantic() {
        return semantic;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setSemantic(BusinessProcess newSemantic) {
        BusinessProcess oldSemantic = semantic;
        semantic = newSemantic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC, oldSemantic, semantic));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotationHolder getNotationHolder() {
        if (notationHolder != null && notationHolder.eIsProxy()) {
            InternalEObject oldNotationHolder = (InternalEObject)notationHolder;
            notationHolder = (NotationHolder)eResolveProxy(oldNotationHolder);
            if (notationHolder != oldNotationHolder) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER, oldNotationHolder, notationHolder));
            }
        }
        return notationHolder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotationHolder basicGetNotationHolder() {
        return notationHolder;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setNotationHolder(NotationHolder newNotationHolder) {
        NotationHolder oldNotationHolder = notationHolder;
        notationHolder = newNotationHolder;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER, oldNotationHolder, notationHolder));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVGBusinessProcessItem getSvgBusinessProcessItem() {
        if (svgBusinessProcessItem != null && svgBusinessProcessItem.eIsProxy()) {
            InternalEObject oldSvgBusinessProcessItem = (InternalEObject)svgBusinessProcessItem;
            svgBusinessProcessItem = (SVGBusinessProcessItem)eResolveProxy(oldSvgBusinessProcessItem);
            if (svgBusinessProcessItem != oldSvgBusinessProcessItem) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, oldSvgBusinessProcessItem, svgBusinessProcessItem));
            }
        }
        return svgBusinessProcessItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SVGBusinessProcessItem basicGetSvgBusinessProcessItem() {
        return svgBusinessProcessItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvgBusinessProcessItem(SVGBusinessProcessItem newSvgBusinessProcessItem, NotificationChain msgs) {
        SVGBusinessProcessItem oldSvgBusinessProcessItem = svgBusinessProcessItem;
        svgBusinessProcessItem = newSvgBusinessProcessItem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, oldSvgBusinessProcessItem, newSvgBusinessProcessItem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSvgBusinessProcessItem(SVGBusinessProcessItem newSvgBusinessProcessItem) {
        if (newSvgBusinessProcessItem != svgBusinessProcessItem) {
            NotificationChain msgs = null;
            if (svgBusinessProcessItem != null)
                msgs = ((InternalEObject)svgBusinessProcessItem).eInverseRemove(this, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, SVGBusinessProcessItem.class, msgs);
            if (newSvgBusinessProcessItem != null)
                msgs = ((InternalEObject)newSvgBusinessProcessItem).eInverseAdd(this, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, SVGBusinessProcessItem.class, msgs);
            msgs = basicSetSvgBusinessProcessItem(newSvgBusinessProcessItem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM, newSvgBusinessProcessItem, newSvgBusinessProcessItem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                if (svgBusinessProcessItem != null)
                    msgs = ((InternalEObject)svgBusinessProcessItem).eInverseRemove(this, PropertiesPackage.SVG_BUSINESS_PROCESS_ITEM__BUSINESS_PROCESS_ITEM, SVGBusinessProcessItem.class, msgs);
                return basicSetSvgBusinessProcessItem((SVGBusinessProcessItem)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                return basicSetSvgBusinessProcessItem(null, msgs);
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
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION:
                if (resolve) return getNotation();
                return basicGetNotation();
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC:
                if (resolve) return getSemantic();
                return basicGetSemantic();
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER:
                if (resolve) return getNotationHolder();
                return basicGetNotationHolder();
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                if (resolve) return getSvgBusinessProcessItem();
                return basicGetSvgBusinessProcessItem();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION:
                setNotation((Diagram)newValue);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC:
                setSemantic((BusinessProcess)newValue);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER:
                setNotationHolder((NotationHolder)newValue);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                setSvgBusinessProcessItem((SVGBusinessProcessItem)newValue);
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
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION:
                setNotation((Diagram)null);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC:
                setSemantic((BusinessProcess)null);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER:
                setNotationHolder((NotationHolder)null);
                return;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                setSvgBusinessProcessItem((SVGBusinessProcessItem)null);
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
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION:
                return notation != null;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SEMANTIC:
                return semantic != null;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__NOTATION_HOLDER:
                return notationHolder != null;
            case PropertiesPackage.BUSINESS_PROCESS_ITEM__SVG_BUSINESS_PROCESS_ITEM:
                return svgBusinessProcessItem != null;
        }
        return super.eIsSet(featureID);
    }

} // BusinessProcessItemImpl

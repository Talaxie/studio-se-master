/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.camel.core.model.camelProperties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.camel.core.model.camelProperties.CamelProcessItem;
import org.talend.camel.core.model.camelProperties.CamelPropertiesPackage;
import org.talend.core.model.properties.impl.ProcessItemImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Camel Process Item</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class CamelProcessItemImpl extends ProcessItemImpl implements CamelProcessItem {

    /**
     * The default value of the '{@link #getSpringContent() <em>Spring Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpringContent()
     * @generated
     * @ordered
     */
    protected static final String SPRING_CONTENT_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getSpringContent() <em>Spring Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpringContent()
     * @generated
     * @ordered
     */
    protected String springContent = SPRING_CONTENT_EDEFAULT;

    /**
     * The default value of the '{@link #isExportMicroService() <em>Export Micro Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExportMicroService()
     * @generated
     * @ordered
     */
    protected static final boolean EXPORT_MICRO_SERVICE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExportMicroService() <em>Export Micro Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExportMicroService()
     * @generated
     * @ordered
     */
    protected boolean exportMicroService = EXPORT_MICRO_SERVICE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CamelProcessItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CamelPropertiesPackage.Literals.CAMEL_PROCESS_ITEM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSpringContent() {
        return springContent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpringContent(String newSpringContent) {
        String oldSpringContent = springContent;
        springContent = newSpringContent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPropertiesPackage.CAMEL_PROCESS_ITEM__SPRING_CONTENT, oldSpringContent, springContent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExportMicroService() {
        return exportMicroService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExportMicroService(boolean newExportMicroService) {
        boolean oldExportMicroService = exportMicroService;
        exportMicroService = newExportMicroService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CamelPropertiesPackage.CAMEL_PROCESS_ITEM__EXPORT_MICRO_SERVICE, oldExportMicroService, exportMicroService));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__SPRING_CONTENT:
                return getSpringContent();
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__EXPORT_MICRO_SERVICE:
                return isExportMicroService();
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
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__SPRING_CONTENT:
                setSpringContent((String)newValue);
                return;
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__EXPORT_MICRO_SERVICE:
                setExportMicroService((Boolean)newValue);
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
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__SPRING_CONTENT:
                setSpringContent(SPRING_CONTENT_EDEFAULT);
                return;
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__EXPORT_MICRO_SERVICE:
                setExportMicroService(EXPORT_MICRO_SERVICE_EDEFAULT);
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
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__SPRING_CONTENT:
                return SPRING_CONTENT_EDEFAULT == null ? springContent != null : !SPRING_CONTENT_EDEFAULT.equals(springContent);
            case CamelPropertiesPackage.CAMEL_PROCESS_ITEM__EXPORT_MICRO_SERVICE:
                return exportMicroService != EXPORT_MICRO_SERVICE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (springContent: ");
        result.append(springContent);
        result.append(", exportMicroService: ");
        result.append(exportMicroService);
        result.append(')');
        return result.toString();
    }

} // CamelProcessItemImpl

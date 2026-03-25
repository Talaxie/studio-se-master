/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.talend.dataquality.indicators.schema.*;
import org.talend.dataquality.indicators.schema.AbstractTableIndicator;
import org.talend.dataquality.indicators.schema.CatalogIndicator;
import org.talend.dataquality.indicators.schema.ConnectionIndicator;
import org.talend.dataquality.indicators.schema.SchemaFactory;
import org.talend.dataquality.indicators.schema.SchemaIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;
import org.talend.dataquality.indicators.schema.TableIndicator;
import org.talend.dataquality.indicators.schema.ViewIndicator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaFactoryImpl extends EFactoryImpl implements SchemaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SchemaFactory init() {
        try {
            SchemaFactory theSchemaFactory = (SchemaFactory)EPackage.Registry.INSTANCE.getEFactory(SchemaPackage.eNS_URI);
            if (theSchemaFactory != null) {
                return theSchemaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SchemaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SchemaPackage.SCHEMA_INDICATOR: return createSchemaIndicator();
            case SchemaPackage.TABLE_INDICATOR: return createTableIndicator();
            case SchemaPackage.CONNECTION_INDICATOR: return createConnectionIndicator();
            case SchemaPackage.CATALOG_INDICATOR: return createCatalogIndicator();
            case SchemaPackage.VIEW_INDICATOR: return createViewIndicator();
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR: return createAbstractTableIndicator();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaIndicator createSchemaIndicator() {
        SchemaIndicatorImpl schemaIndicator = new SchemaIndicatorImpl();
        return schemaIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableIndicator createTableIndicator() {
        TableIndicatorImpl tableIndicator = new TableIndicatorImpl();
        return tableIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionIndicator createConnectionIndicator() {
        ConnectionIndicatorImpl connectionIndicator = new ConnectionIndicatorImpl();
        return connectionIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CatalogIndicator createCatalogIndicator() {
        CatalogIndicatorImpl catalogIndicator = new CatalogIndicatorImpl();
        return catalogIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ViewIndicator createViewIndicator() {
        ViewIndicatorImpl viewIndicator = new ViewIndicatorImpl();
        return viewIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractTableIndicator createAbstractTableIndicator() {
        AbstractTableIndicatorImpl abstractTableIndicator = new AbstractTableIndicatorImpl();
        return abstractTableIndicator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaPackage getSchemaPackage() {
        return (SchemaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SchemaPackage getPackage() {
        return SchemaPackage.eINSTANCE;
    }

} //SchemaFactoryImpl

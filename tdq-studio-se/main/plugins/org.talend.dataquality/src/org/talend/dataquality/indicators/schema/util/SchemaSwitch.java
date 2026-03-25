/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.indicators.schema.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.indicators.CompositeIndicator;
import org.talend.dataquality.indicators.Indicator;
import org.talend.dataquality.indicators.schema.*;
import org.talend.dataquality.indicators.schema.AbstractTableIndicator;
import org.talend.dataquality.indicators.schema.CatalogIndicator;
import org.talend.dataquality.indicators.schema.ConnectionIndicator;
import org.talend.dataquality.indicators.schema.SchemaIndicator;
import org.talend.dataquality.indicators.schema.SchemaPackage;
import org.talend.dataquality.indicators.schema.TableIndicator;
import org.talend.dataquality.indicators.schema.ViewIndicator;
import orgomg.cwm.objectmodel.core.Element;
import orgomg.cwm.objectmodel.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.indicators.schema.SchemaPackage
 * @generated
 */
public class SchemaSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SchemaPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaSwitch() {
        if (modelPackage == null) {
            modelPackage = SchemaPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SchemaPackage.SCHEMA_INDICATOR: {
                SchemaIndicator schemaIndicator = (SchemaIndicator)theEObject;
                T result = caseSchemaIndicator(schemaIndicator);
                if (result == null) result = caseCompositeIndicator(schemaIndicator);
                if (result == null) result = caseIndicator(schemaIndicator);
                if (result == null) result = caseModelElement(schemaIndicator);
                if (result == null) result = caseElement(schemaIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SchemaPackage.TABLE_INDICATOR: {
                TableIndicator tableIndicator = (TableIndicator)theEObject;
                T result = caseTableIndicator(tableIndicator);
                if (result == null) result = caseAbstractTableIndicator(tableIndicator);
                if (result == null) result = caseIndicator(tableIndicator);
                if (result == null) result = caseModelElement(tableIndicator);
                if (result == null) result = caseElement(tableIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SchemaPackage.CONNECTION_INDICATOR: {
                ConnectionIndicator connectionIndicator = (ConnectionIndicator)theEObject;
                T result = caseConnectionIndicator(connectionIndicator);
                if (result == null) result = caseCatalogIndicator(connectionIndicator);
                if (result == null) result = caseSchemaIndicator(connectionIndicator);
                if (result == null) result = caseCompositeIndicator(connectionIndicator);
                if (result == null) result = caseIndicator(connectionIndicator);
                if (result == null) result = caseModelElement(connectionIndicator);
                if (result == null) result = caseElement(connectionIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SchemaPackage.CATALOG_INDICATOR: {
                CatalogIndicator catalogIndicator = (CatalogIndicator)theEObject;
                T result = caseCatalogIndicator(catalogIndicator);
                if (result == null) result = caseSchemaIndicator(catalogIndicator);
                if (result == null) result = caseCompositeIndicator(catalogIndicator);
                if (result == null) result = caseIndicator(catalogIndicator);
                if (result == null) result = caseModelElement(catalogIndicator);
                if (result == null) result = caseElement(catalogIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SchemaPackage.VIEW_INDICATOR: {
                ViewIndicator viewIndicator = (ViewIndicator)theEObject;
                T result = caseViewIndicator(viewIndicator);
                if (result == null) result = caseAbstractTableIndicator(viewIndicator);
                if (result == null) result = caseIndicator(viewIndicator);
                if (result == null) result = caseModelElement(viewIndicator);
                if (result == null) result = caseElement(viewIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SchemaPackage.ABSTRACT_TABLE_INDICATOR: {
                AbstractTableIndicator abstractTableIndicator = (AbstractTableIndicator)theEObject;
                T result = caseAbstractTableIndicator(abstractTableIndicator);
                if (result == null) result = caseIndicator(abstractTableIndicator);
                if (result == null) result = caseModelElement(abstractTableIndicator);
                if (result == null) result = caseElement(abstractTableIndicator);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchemaIndicator(SchemaIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTableIndicator(TableIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connection Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connection Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectionIndicator(ConnectionIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Catalog Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Catalog Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCatalogIndicator(CatalogIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewIndicator(ViewIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Table Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Table Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractTableIndicator(AbstractTableIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelElement(ModelElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndicator(Indicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Composite Indicator</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Composite Indicator</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompositeIndicator(CompositeIndicator object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //SchemaSwitch

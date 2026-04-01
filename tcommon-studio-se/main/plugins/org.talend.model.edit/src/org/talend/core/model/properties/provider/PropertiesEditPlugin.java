/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.core.model.properties.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.eclipse.gmf.runtime.notation.NotationEditPlugin;

import org.talend.core.model.metadata.builder.connection.provider.MetadataEditPlugin;

import org.talend.designer.business.model.business.provider.BusinessEditPlugin;

import org.talend.designer.core.model.utils.emf.component.provider.componentEditPlugin;

import org.talend.designer.core.model.utils.emf.talendfile.provider.TalendFileEditPlugin;

import org.talend.designer.joblet.model.provider.JobletEditPlugin;
import orgomg.cwm.objectmodel.core.provider.Cwm_mipEditPlugin;

/**
 * This is the central singleton for the Properties edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PropertiesEditPlugin extends EMFPlugin {
    /**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final PropertiesEditPlugin INSTANCE = new PropertiesEditPlugin();

    /**
     * Keep track of the singleton.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static Implementation plugin;

    /**
     * Create the instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesEditPlugin() {
        super
          (new ResourceLocator [] {
             BusinessEditPlugin.INSTANCE,
             componentEditPlugin.INSTANCE,
             Cwm_mipEditPlugin.INSTANCE,
             EcoreEditPlugin.INSTANCE,
             JobletEditPlugin.INSTANCE,
             MetadataEditPlugin.INSTANCE,
             NotationEditPlugin.INSTANCE,
             TalendFileEditPlugin.INSTANCE,
           });
    }

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the singleton instance.
     * @generated
     */
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    /**
     * Returns the singleton instance of the Eclipse plugin.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the singleton instance.
     * @generated
     */
    public static Implementation getPlugin() {
        return plugin;
    }

    /**
     * The actual implementation of the Eclipse <b>Plugin</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class Implementation extends EclipsePlugin {
        /**
         * Creates an instance.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Implementation() {
            super();

            // Remember the static instance.
            //
            plugin = this;
        }
    }

}

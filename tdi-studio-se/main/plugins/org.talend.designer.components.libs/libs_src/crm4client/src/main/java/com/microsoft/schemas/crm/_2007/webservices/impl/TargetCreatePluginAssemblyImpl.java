/*
 * XML Type:  TargetCreatePluginAssembly
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreatePluginAssembly
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreatePluginAssembly(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreatePluginAssemblyImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreatePluginAssembly
{
    
    public TargetCreatePluginAssemblyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUGINASSEMBLY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginAssembly");
    
    
    /**
     * Gets the "PluginAssembly" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Pluginassembly getPluginAssembly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pluginassembly target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pluginassembly)get_store().find_element_user(PLUGINASSEMBLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PluginAssembly" element
     */
    public void setPluginAssembly(com.microsoft.schemas.crm._2007.webservices.Pluginassembly pluginAssembly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pluginassembly target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pluginassembly)get_store().find_element_user(PLUGINASSEMBLY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Pluginassembly)get_store().add_element_user(PLUGINASSEMBLY$0);
            }
            target.set(pluginAssembly);
        }
    }
    
    /**
     * Appends and returns a new empty "PluginAssembly" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Pluginassembly addNewPluginAssembly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Pluginassembly target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Pluginassembly)get_store().add_element_user(PLUGINASSEMBLY$0);
            return target;
        }
    }
}

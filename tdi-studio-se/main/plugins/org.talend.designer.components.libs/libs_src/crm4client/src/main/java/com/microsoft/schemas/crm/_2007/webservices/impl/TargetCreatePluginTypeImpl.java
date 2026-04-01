/*
 * XML Type:  TargetCreatePluginType
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreatePluginType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreatePluginType(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreatePluginTypeImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreatePluginType
{
    
    public TargetCreatePluginTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUGINTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginType");
    
    
    /**
     * Gets the "PluginType" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Plugintype getPluginType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Plugintype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Plugintype)get_store().find_element_user(PLUGINTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PluginType" element
     */
    public void setPluginType(com.microsoft.schemas.crm._2007.webservices.Plugintype pluginType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Plugintype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Plugintype)get_store().find_element_user(PLUGINTYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Plugintype)get_store().add_element_user(PLUGINTYPE$0);
            }
            target.set(pluginType);
        }
    }
    
    /**
     * Appends and returns a new empty "PluginType" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Plugintype addNewPluginType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Plugintype target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Plugintype)get_store().add_element_user(PLUGINTYPE$0);
            return target;
        }
    }
}

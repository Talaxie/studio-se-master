/*
 * XML Type:  RegisterSolutionResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RegisterSolutionResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RegisterSolutionResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RegisterSolutionResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RegisterSolutionResponse
{
    
    public RegisterSolutionResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUGINASSEMBLYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginAssemblyId");
    
    
    /**
     * Gets the "PluginAssemblyId" element
     */
    public java.lang.String getPluginAssemblyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINASSEMBLYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PluginAssemblyId" element
     */
    public com.microsoft.wsdl.types.Guid xgetPluginAssemblyId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PLUGINASSEMBLYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PluginAssemblyId" element
     */
    public void setPluginAssemblyId(java.lang.String pluginAssemblyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINASSEMBLYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINASSEMBLYID$0);
            }
            target.setStringValue(pluginAssemblyId);
        }
    }
    
    /**
     * Sets (as xml) the "PluginAssemblyId" element
     */
    public void xsetPluginAssemblyId(com.microsoft.wsdl.types.Guid pluginAssemblyId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PLUGINASSEMBLYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PLUGINASSEMBLYID$0);
            }
            target.set(pluginAssemblyId);
        }
    }
}

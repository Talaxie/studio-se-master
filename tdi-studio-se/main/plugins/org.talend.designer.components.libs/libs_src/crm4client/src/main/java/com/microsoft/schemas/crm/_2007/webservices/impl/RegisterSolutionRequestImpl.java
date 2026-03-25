/*
 * XML Type:  RegisterSolutionRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RegisterSolutionRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RegisterSolutionRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RegisterSolutionRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RegisterSolutionRequest
{
    
    public RegisterSolutionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLUGINASSEMBLY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginAssembly");
    private static final javax.xml.namespace.QName STEPS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Steps");
    
    
    /**
     * Gets the "PluginAssembly" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getPluginAssembly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(PLUGINASSEMBLY$0, 0);
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
    public void setPluginAssembly(com.microsoft.schemas.crm._2006.webservices.BusinessEntity pluginAssembly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(PLUGINASSEMBLY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(PLUGINASSEMBLY$0);
            }
            target.set(pluginAssembly);
        }
    }
    
    /**
     * Appends and returns a new empty "PluginAssembly" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewPluginAssembly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(PLUGINASSEMBLY$0);
            return target;
        }
    }
    
    /**
     * Gets the "Steps" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration getSteps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(STEPS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Steps" element
     */
    public void setSteps(com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration steps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().find_element_user(STEPS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(STEPS$2);
            }
            target.set(steps);
        }
    }
    
    /**
     * Appends and returns a new empty "Steps" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration addNewSteps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepRegistration)get_store().add_element_user(STEPS$2);
            return target;
        }
    }
}

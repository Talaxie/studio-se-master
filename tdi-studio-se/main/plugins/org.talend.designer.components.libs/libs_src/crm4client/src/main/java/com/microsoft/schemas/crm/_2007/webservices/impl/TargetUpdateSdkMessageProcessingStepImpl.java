/*
 * XML Type:  TargetUpdateSdkMessageProcessingStep
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateSdkMessageProcessingStep
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateSdkMessageProcessingStep(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateSdkMessageProcessingStepImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateSdkMessageProcessingStep
{
    
    public TargetUpdateSdkMessageProcessingStepImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStep");
    
    
    /**
     * Gets the "SdkMessageProcessingStep" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep getSdkMessageProcessingStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStep" element
     */
    public void setSdkMessageProcessingStep(com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep sdkMessageProcessingStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEP$0);
            }
            target.set(sdkMessageProcessingStep);
        }
    }
    
    /**
     * Appends and returns a new empty "SdkMessageProcessingStep" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep addNewSdkMessageProcessingStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstep)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEP$0);
            return target;
        }
    }
}

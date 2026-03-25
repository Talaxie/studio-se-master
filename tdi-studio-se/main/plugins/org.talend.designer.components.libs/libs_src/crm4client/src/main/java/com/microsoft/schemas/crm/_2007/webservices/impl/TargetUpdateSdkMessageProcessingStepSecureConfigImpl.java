/*
 * XML Type:  TargetUpdateSdkMessageProcessingStepSecureConfig
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateSdkMessageProcessingStepSecureConfig
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateSdkMessageProcessingStepSecureConfig(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateSdkMessageProcessingStepSecureConfigImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateSdkMessageProcessingStepSecureConfig
{
    
    public TargetUpdateSdkMessageProcessingStepSecureConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPSECURECONFIG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepSecureConfig");
    
    
    /**
     * Gets the "SdkMessageProcessingStepSecureConfig" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig getSdkMessageProcessingStepSecureConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepSecureConfig" element
     */
    public void setSdkMessageProcessingStepSecureConfig(com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig sdkMessageProcessingStepSecureConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIG$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIG$0);
            }
            target.set(sdkMessageProcessingStepSecureConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "SdkMessageProcessingStepSecureConfig" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig addNewSdkMessageProcessingStepSecureConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepsecureconfig)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSECURECONFIG$0);
            return target;
        }
    }
}

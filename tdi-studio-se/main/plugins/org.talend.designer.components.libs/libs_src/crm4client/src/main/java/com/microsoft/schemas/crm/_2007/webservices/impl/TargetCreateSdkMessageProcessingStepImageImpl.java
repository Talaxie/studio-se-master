/*
 * XML Type:  TargetCreateSdkMessageProcessingStepImage
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSdkMessageProcessingStepImage
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSdkMessageProcessingStepImage(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSdkMessageProcessingStepImageImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSdkMessageProcessingStepImage
{
    
    public TargetCreateSdkMessageProcessingStepImageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPIMAGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepImage");
    
    
    /**
     * Gets the "SdkMessageProcessingStepImage" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage getSdkMessageProcessingStepImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepImage" element
     */
    public void setSdkMessageProcessingStepImage(com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage sdkMessageProcessingStepImage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGE$0);
            }
            target.set(sdkMessageProcessingStepImage);
        }
    }
    
    /**
     * Appends and returns a new empty "SdkMessageProcessingStepImage" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage addNewSdkMessageProcessingStepImage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGE$0);
            return target;
        }
    }
}

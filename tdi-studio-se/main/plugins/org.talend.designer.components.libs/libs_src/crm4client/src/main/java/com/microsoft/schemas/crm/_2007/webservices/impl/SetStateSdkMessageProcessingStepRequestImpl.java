/*
 * XML Type:  SetStateSdkMessageProcessingStepRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateSdkMessageProcessingStepRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateSdkMessageProcessingStepRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateSdkMessageProcessingStepRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateSdkMessageProcessingStepRequest
{
    
    public SetStateSdkMessageProcessingStepRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepState");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SdkMessageProcessingStepStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "SdkMessageProcessingStepState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState.Enum getSdkMessageProcessingStepState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SdkMessageProcessingStepState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState xgetSdkMessageProcessingStepState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepState" element
     */
    public void setSdkMessageProcessingStepState(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState.Enum sdkMessageProcessingStepState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2);
            }
            target.setEnumValue(sdkMessageProcessingStepState);
        }
    }
    
    /**
     * Sets (as xml) the "SdkMessageProcessingStepState" element
     */
    public void xsetSdkMessageProcessingStepState(com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState sdkMessageProcessingStepState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepState)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSTATE$2);
            }
            target.set(sdkMessageProcessingStepState);
        }
    }
    
    /**
     * Gets the "SdkMessageProcessingStepStatus" element
     */
    public int getSdkMessageProcessingStepStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SdkMessageProcessingStepStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetSdkMessageProcessingStepStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SdkMessageProcessingStepStatus" element
     */
    public void setSdkMessageProcessingStepStatus(int sdkMessageProcessingStepStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4);
            }
            target.setIntValue(sdkMessageProcessingStepStatus);
        }
    }
    
    /**
     * Sets (as xml) the "SdkMessageProcessingStepStatus" element
     */
    public void xsetSdkMessageProcessingStepStatus(org.apache.xmlbeans.XmlInt sdkMessageProcessingStepStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPSTATUS$4);
            }
            target.set(sdkMessageProcessingStepStatus);
        }
    }
}

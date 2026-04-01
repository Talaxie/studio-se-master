/*
 * XML Type:  TargetCreateService
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateService
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateService(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateServiceImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateService
{
    
    public TargetCreateServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Service");
    
    
    /**
     * Gets the "Service" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Service getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Service target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Service)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Service" element
     */
    public void setService(com.microsoft.schemas.crm._2007.webservices.Service service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Service target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Service)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Service)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "Service" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Service addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Service target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Service)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}

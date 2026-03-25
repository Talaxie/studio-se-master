/*
 * XML Type:  TargetCreateBusinessTask
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateBusinessTask
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateBusinessTask(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateBusinessTaskImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateBusinessTask
{
    
    public TargetCreateBusinessTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSTASK$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessTask");
    
    
    /**
     * Gets the "BusinessTask" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businesstask getBusinessTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businesstask target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businesstask)get_store().find_element_user(BUSINESSTASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessTask" element
     */
    public void setBusinessTask(com.microsoft.schemas.crm._2007.webservices.Businesstask businessTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businesstask target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businesstask)get_store().find_element_user(BUSINESSTASK$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Businesstask)get_store().add_element_user(BUSINESSTASK$0);
            }
            target.set(businessTask);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessTask" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businesstask addNewBusinessTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businesstask target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businesstask)get_store().add_element_user(BUSINESSTASK$0);
            return target;
        }
    }
}

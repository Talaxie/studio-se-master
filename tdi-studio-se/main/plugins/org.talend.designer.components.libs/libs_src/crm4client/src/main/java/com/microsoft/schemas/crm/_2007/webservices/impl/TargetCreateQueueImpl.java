/*
 * XML Type:  TargetCreateQueue
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateQueue
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateQueue(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateQueueImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateQueue
{
    
    public TargetCreateQueueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUEUE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Queue");
    
    
    /**
     * Gets the "Queue" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Queue getQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Queue target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Queue)get_store().find_element_user(QUEUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Queue" element
     */
    public void setQueue(com.microsoft.schemas.crm._2007.webservices.Queue queue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Queue target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Queue)get_store().find_element_user(QUEUE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Queue)get_store().add_element_user(QUEUE$0);
            }
            target.set(queue);
        }
    }
    
    /**
     * Appends and returns a new empty "Queue" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Queue addNewQueue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Queue target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Queue)get_store().add_element_user(QUEUE$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetCreateTask
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTask
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTask(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTaskImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTask
{
    
    public TargetCreateTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASK$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Task");
    
    
    /**
     * Gets the "Task" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Task getTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Task target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Task)get_store().find_element_user(TASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Task" element
     */
    public void setTask(com.microsoft.schemas.crm._2007.webservices.Task task)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Task target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Task)get_store().find_element_user(TASK$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Task)get_store().add_element_user(TASK$0);
            }
            target.set(task);
        }
    }
    
    /**
     * Appends and returns a new empty "Task" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Task addNewTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Task target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Task)get_store().add_element_user(TASK$0);
            return target;
        }
    }
}

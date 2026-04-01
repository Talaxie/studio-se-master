/*
 * XML Type:  TargetCreateWorkflowLog
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateWorkflowLog
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateWorkflowLog(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateWorkflowLogImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateWorkflowLog
{
    
    public TargetCreateWorkflowLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOWLOG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowLog");
    
    
    /**
     * Gets the "WorkflowLog" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflowlog getWorkflowLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowlog target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowlog)get_store().find_element_user(WORKFLOWLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowLog" element
     */
    public void setWorkflowLog(com.microsoft.schemas.crm._2007.webservices.Workflowlog workflowLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowlog target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowlog)get_store().find_element_user(WORKFLOWLOG$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Workflowlog)get_store().add_element_user(WORKFLOWLOG$0);
            }
            target.set(workflowLog);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkflowLog" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflowlog addNewWorkflowLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowlog target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowlog)get_store().add_element_user(WORKFLOWLOG$0);
            return target;
        }
    }
}

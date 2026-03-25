/*
 * XML Type:  TargetUpdateWorkflowDependency
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateWorkflowDependency
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateWorkflowDependency(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateWorkflowDependencyImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateWorkflowDependency
{
    
    public TargetUpdateWorkflowDependencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOWDEPENDENCY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowDependency");
    
    
    /**
     * Gets the "WorkflowDependency" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflowdependency getWorkflowDependency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowdependency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowdependency)get_store().find_element_user(WORKFLOWDEPENDENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowDependency" element
     */
    public void setWorkflowDependency(com.microsoft.schemas.crm._2007.webservices.Workflowdependency workflowDependency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowdependency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowdependency)get_store().find_element_user(WORKFLOWDEPENDENCY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Workflowdependency)get_store().add_element_user(WORKFLOWDEPENDENCY$0);
            }
            target.set(workflowDependency);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkflowDependency" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflowdependency addNewWorkflowDependency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflowdependency target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflowdependency)get_store().add_element_user(WORKFLOWDEPENDENCY$0);
            return target;
        }
    }
}

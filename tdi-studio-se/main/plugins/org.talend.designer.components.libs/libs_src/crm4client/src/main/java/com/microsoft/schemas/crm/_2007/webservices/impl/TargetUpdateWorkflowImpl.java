/*
 * XML Type:  TargetUpdateWorkflow
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateWorkflow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateWorkflow(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateWorkflowImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateWorkflow
{
    
    public TargetUpdateWorkflowImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOW$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Workflow");
    
    
    /**
     * Gets the "Workflow" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflow getWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflow target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflow)get_store().find_element_user(WORKFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Workflow" element
     */
    public void setWorkflow(com.microsoft.schemas.crm._2007.webservices.Workflow workflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflow target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflow)get_store().find_element_user(WORKFLOW$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Workflow)get_store().add_element_user(WORKFLOW$0);
            }
            target.set(workflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Workflow" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Workflow addNewWorkflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Workflow target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Workflow)get_store().add_element_user(WORKFLOW$0);
            return target;
        }
    }
}

/*
 * XML Type:  CreateWorkflowFromTemplateRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CreateWorkflowFromTemplateRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CreateWorkflowFromTemplateRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CreateWorkflowFromTemplateRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CreateWorkflowFromTemplateRequest
{
    
    public CreateWorkflowFromTemplateRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKFLOWNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowName");
    private static final javax.xml.namespace.QName WORKFLOWTEMPLATEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowTemplateId");
    
    
    /**
     * Gets the "WorkflowName" element
     */
    public java.lang.String getWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkflowName" element
     */
    public org.apache.xmlbeans.XmlString xgetWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowName" element
     */
    public void setWorkflowName(java.lang.String workflowName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWNAME$0);
            }
            target.setStringValue(workflowName);
        }
    }
    
    /**
     * Sets (as xml) the "WorkflowName" element
     */
    public void xsetWorkflowName(org.apache.xmlbeans.XmlString workflowName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKFLOWNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKFLOWNAME$0);
            }
            target.set(workflowName);
        }
    }
    
    /**
     * Gets the "WorkflowTemplateId" element
     */
    public java.lang.String getWorkflowTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWTEMPLATEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkflowTemplateId" element
     */
    public com.microsoft.wsdl.types.Guid xgetWorkflowTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(WORKFLOWTEMPLATEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowTemplateId" element
     */
    public void setWorkflowTemplateId(java.lang.String workflowTemplateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWTEMPLATEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWTEMPLATEID$2);
            }
            target.setStringValue(workflowTemplateId);
        }
    }
    
    /**
     * Sets (as xml) the "WorkflowTemplateId" element
     */
    public void xsetWorkflowTemplateId(com.microsoft.wsdl.types.Guid workflowTemplateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(WORKFLOWTEMPLATEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(WORKFLOWTEMPLATEID$2);
            }
            target.set(workflowTemplateId);
        }
    }
}

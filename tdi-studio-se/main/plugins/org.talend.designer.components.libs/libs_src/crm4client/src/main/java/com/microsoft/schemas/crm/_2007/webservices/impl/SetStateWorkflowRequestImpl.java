/*
 * XML Type:  SetStateWorkflowRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateWorkflowRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateWorkflowRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateWorkflowRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateWorkflowRequest
{
    
    public SetStateWorkflowRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName WORKFLOWSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowState");
    private static final javax.xml.namespace.QName WORKFLOWSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "WorkflowStatus");
    
    
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
     * Gets the "WorkflowState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WorkflowState.Enum getWorkflowState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.WorkflowState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkflowState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.WorkflowState xgetWorkflowState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WorkflowState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WorkflowState)get_store().find_element_user(WORKFLOWSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowState" element
     */
    public void setWorkflowState(com.microsoft.schemas.crm._2007.webservices.WorkflowState.Enum workflowState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWSTATE$2);
            }
            target.setEnumValue(workflowState);
        }
    }
    
    /**
     * Sets (as xml) the "WorkflowState" element
     */
    public void xsetWorkflowState(com.microsoft.schemas.crm._2007.webservices.WorkflowState workflowState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.WorkflowState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.WorkflowState)get_store().find_element_user(WORKFLOWSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.WorkflowState)get_store().add_element_user(WORKFLOWSTATE$2);
            }
            target.set(workflowState);
        }
    }
    
    /**
     * Gets the "WorkflowStatus" element
     */
    public int getWorkflowStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "WorkflowStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetWorkflowStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKFLOWSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WorkflowStatus" element
     */
    public void setWorkflowStatus(int workflowStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKFLOWSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKFLOWSTATUS$4);
            }
            target.setIntValue(workflowStatus);
        }
    }
    
    /**
     * Sets (as xml) the "WorkflowStatus" element
     */
    public void xsetWorkflowStatus(org.apache.xmlbeans.XmlInt workflowStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WORKFLOWSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WORKFLOWSTATUS$4);
            }
            target.set(workflowStatus);
        }
    }
}

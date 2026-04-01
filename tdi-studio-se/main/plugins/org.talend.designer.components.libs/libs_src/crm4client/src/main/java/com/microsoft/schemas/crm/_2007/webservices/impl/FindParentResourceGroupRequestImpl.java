/*
 * XML Type:  FindParentResourceGroupRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.FindParentResourceGroupRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML FindParentResourceGroupRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class FindParentResourceGroupRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.FindParentResourceGroupRequest
{
    
    public FindParentResourceGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ParentId");
    private static final javax.xml.namespace.QName CHILDRENIDS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ChildrenIds");
    
    
    /**
     * Gets the "ParentId" element
     */
    public java.lang.String getParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentId" element
     */
    public com.microsoft.wsdl.types.Guid xgetParentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PARENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ParentId" element
     */
    public void setParentId(java.lang.String parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTID$0);
            }
            target.setStringValue(parentId);
        }
    }
    
    /**
     * Sets (as xml) the "ParentId" element
     */
    public void xsetParentId(com.microsoft.wsdl.types.Guid parentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(PARENTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(PARENTID$0);
            }
            target.set(parentId);
        }
    }
    
    /**
     * Gets the "ChildrenIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getChildrenIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CHILDRENIDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChildrenIds" element
     */
    public void setChildrenIds(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid childrenIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(CHILDRENIDS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CHILDRENIDS$2);
            }
            target.set(childrenIds);
        }
    }
    
    /**
     * Appends and returns a new empty "ChildrenIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewChildrenIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(CHILDRENIDS$2);
            return target;
        }
    }
}

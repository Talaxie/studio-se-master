/*
 * XML Type:  TargetCreateList
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateList
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateList(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateListImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateList
{
    
    public TargetCreateListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "List");
    
    
    /**
     * Gets the "List" element
     */
    public com.microsoft.schemas.crm._2007.webservices.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.List target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "List" element
     */
    public void setList(com.microsoft.schemas.crm._2007.webservices.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.List target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.List)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    public com.microsoft.schemas.crm._2007.webservices.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.List target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
}

/*
 * XML Type:  ErrorInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ErrorInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ErrorInfo(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ErrorInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ErrorInfo
{
    
    public ErrorInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCELIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ResourceList");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ErrorCode");
    
    
    /**
     * Gets the "ResourceList" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo getResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo)get_store().find_element_user(RESOURCELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceList" element
     */
    public boolean isSetResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCELIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ResourceList" element
     */
    public void setResourceList(com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo resourceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo)get_store().find_element_user(RESOURCELIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo)get_store().add_element_user(RESOURCELIST$0);
            }
            target.set(resourceList);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceList" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo addNewResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfResourceInfo)get_store().add_element_user(RESOURCELIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceList" element
     */
    public void unsetResourceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCELIST$0, 0);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public java.lang.String getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorCode" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(java.lang.String errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORCODE$2);
            }
            target.setStringValue(errorCode);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    public void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORCODE$2);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Unsets the "ErrorCode" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$2, 0);
        }
    }
}

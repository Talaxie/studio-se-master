/*
 * XML Type:  TraceInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.TraceInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML TraceInfo(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class TraceInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.TraceInfo
{
    
    public TraceInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORINFOLIST$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ErrorInfoList");
    
    
    /**
     * Gets the "ErrorInfoList" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo getErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo)get_store().find_element_user(ERRORINFOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ErrorInfoList" element
     */
    public boolean isSetErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORINFOLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "ErrorInfoList" element
     */
    public void setErrorInfoList(com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo errorInfoList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo)get_store().find_element_user(ERRORINFOLIST$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo)get_store().add_element_user(ERRORINFOLIST$0);
            }
            target.set(errorInfoList);
        }
    }
    
    /**
     * Appends and returns a new empty "ErrorInfoList" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo addNewErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfErrorInfo)get_store().add_element_user(ERRORINFOLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ErrorInfoList" element
     */
    public void unsetErrorInfoList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORINFOLIST$0, 0);
        }
    }
}

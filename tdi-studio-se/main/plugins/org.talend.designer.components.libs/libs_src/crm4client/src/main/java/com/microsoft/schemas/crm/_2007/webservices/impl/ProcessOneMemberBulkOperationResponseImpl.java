/*
 * XML Type:  ProcessOneMemberBulkOperationResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ProcessOneMemberBulkOperationResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ProcessOneMemberBulkOperationResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ProcessOneMemberBulkOperationResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.ProcessOneMemberBulkOperationResponse
{
    
    public ProcessOneMemberBulkOperationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ProcessResult");
    
    
    /**
     * Gets the "ProcessResult" element
     */
    public int getProcessResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSRESULT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcessResult" element
     */
    public org.apache.xmlbeans.XmlInt xgetProcessResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROCESSRESULT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProcessResult" element
     */
    public void setProcessResult(int processResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSRESULT$0);
            }
            target.setIntValue(processResult);
        }
    }
    
    /**
     * Sets (as xml) the "ProcessResult" element
     */
    public void xsetProcessResult(org.apache.xmlbeans.XmlInt processResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROCESSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROCESSRESULT$0);
            }
            target.set(processResult);
        }
    }
}

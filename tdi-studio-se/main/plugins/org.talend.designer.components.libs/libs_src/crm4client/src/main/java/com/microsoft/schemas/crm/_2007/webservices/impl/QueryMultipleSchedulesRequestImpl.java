/*
 * XML Type:  QueryMultipleSchedulesRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.QueryMultipleSchedulesRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML QueryMultipleSchedulesRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class QueryMultipleSchedulesRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.QueryMultipleSchedulesRequest
{
    
    public QueryMultipleSchedulesRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEIDS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ResourceIds");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Start");
    private static final javax.xml.namespace.QName END$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "End");
    private static final javax.xml.namespace.QName TIMECODES$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TimeCodes");
    
    
    /**
     * Gets the "ResourceIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getResourceIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(RESOURCEIDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResourceIds" element
     */
    public void setResourceIds(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid resourceIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(RESOURCEIDS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(RESOURCEIDS$0);
            }
            target.set(resourceIds);
        }
    }
    
    /**
     * Appends and returns a new empty "ResourceIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewResourceIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(RESOURCEIDS$0);
            return target;
        }
    }
    
    /**
     * Gets the "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$2);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$2);
            return target;
        }
    }
    
    /**
     * Gets the "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$4);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$4);
            return target;
        }
    }
    
    /**
     * Gets the "TimeCodes" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode getTimeCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(TIMECODES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCodes" element
     */
    public void setTimeCodes(com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode timeCodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().find_element_user(TIMECODES$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().add_element_user(TIMECODES$6);
            }
            target.set(timeCodes);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeCodes" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode addNewTimeCodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfTimeCode)get_store().add_element_user(TIMECODES$6);
            return target;
        }
    }
}

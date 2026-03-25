/*
 * XML Type:  QueryMultipleSchedulesResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.QueryMultipleSchedulesResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML QueryMultipleSchedulesResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class QueryMultipleSchedulesResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.QueryMultipleSchedulesResponse
{
    
    public QueryMultipleSchedulesResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINFOS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TimeInfos");
    
    
    /**
     * Gets the "TimeInfos" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo getTimeInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo)get_store().find_element_user(TIMEINFOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeInfos" element
     */
    public void setTimeInfos(com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo timeInfos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo)get_store().find_element_user(TIMEINFOS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo)get_store().add_element_user(TIMEINFOS$0);
            }
            target.set(timeInfos);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeInfos" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo addNewTimeInfos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfArrayOfTimeInfo)get_store().add_element_user(TIMEINFOS$0);
            return target;
        }
    }
}

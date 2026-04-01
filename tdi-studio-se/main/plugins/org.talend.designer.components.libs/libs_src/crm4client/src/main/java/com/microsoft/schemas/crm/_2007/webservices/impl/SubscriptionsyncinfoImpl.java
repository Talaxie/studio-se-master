/*
 * XML Type:  subscriptionsyncinfo
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Subscriptionsyncinfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML subscriptionsyncinfo(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SubscriptionsyncinfoImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Subscriptionsyncinfo
{
    
    public SubscriptionsyncinfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASIZE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "datasize");
    private static final javax.xml.namespace.QName DELETEOBJECTCOUNT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "deleteobjectcount");
    private static final javax.xml.namespace.QName ENDTIME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "endtime");
    private static final javax.xml.namespace.QName INSERTOBJECTCOUNT$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "insertobjectcount");
    private static final javax.xml.namespace.QName STARTTIME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "starttime");
    private static final javax.xml.namespace.QName SUBSCRIPTIONID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionid");
    private static final javax.xml.namespace.QName SUBSCRIPTIONSYNCINFOID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "subscriptionsyncinfoid");
    private static final javax.xml.namespace.QName SYNCRESULT$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "syncresult");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "datasize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDatasize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DATASIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "datasize" element
     */
    public boolean isSetDatasize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASIZE$0) != 0;
        }
    }
    
    /**
     * Sets the "datasize" element
     */
    public void setDatasize(com.microsoft.schemas.crm._2006.webservices.CrmNumber datasize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DATASIZE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DATASIZE$0);
            }
            target.set(datasize);
        }
    }
    
    /**
     * Appends and returns a new empty "datasize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDatasize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DATASIZE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "datasize" element
     */
    public void unsetDatasize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASIZE$0, 0);
        }
    }
    
    /**
     * Gets the "deleteobjectcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDeleteobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DELETEOBJECTCOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deleteobjectcount" element
     */
    public boolean isSetDeleteobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEOBJECTCOUNT$2) != 0;
        }
    }
    
    /**
     * Sets the "deleteobjectcount" element
     */
    public void setDeleteobjectcount(com.microsoft.schemas.crm._2006.webservices.CrmNumber deleteobjectcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DELETEOBJECTCOUNT$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DELETEOBJECTCOUNT$2);
            }
            target.set(deleteobjectcount);
        }
    }
    
    /**
     * Appends and returns a new empty "deleteobjectcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDeleteobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DELETEOBJECTCOUNT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "deleteobjectcount" element
     */
    public void unsetDeleteobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEOBJECTCOUNT$2, 0);
        }
    }
    
    /**
     * Gets the "endtime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endtime" element
     */
    public boolean isSetEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$4) != 0;
        }
    }
    
    /**
     * Sets the "endtime" element
     */
    public void setEndtime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime endtime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENDTIME$4);
            }
            target.set(endtime);
        }
    }
    
    /**
     * Appends and returns a new empty "endtime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(ENDTIME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endtime" element
     */
    public void unsetEndtime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$4, 0);
        }
    }
    
    /**
     * Gets the "insertobjectcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getInsertobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(INSERTOBJECTCOUNT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "insertobjectcount" element
     */
    public boolean isSetInsertobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSERTOBJECTCOUNT$6) != 0;
        }
    }
    
    /**
     * Sets the "insertobjectcount" element
     */
    public void setInsertobjectcount(com.microsoft.schemas.crm._2006.webservices.CrmNumber insertobjectcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(INSERTOBJECTCOUNT$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(INSERTOBJECTCOUNT$6);
            }
            target.set(insertobjectcount);
        }
    }
    
    /**
     * Appends and returns a new empty "insertobjectcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewInsertobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(INSERTOBJECTCOUNT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "insertobjectcount" element
     */
    public void unsetInsertobjectcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSERTOBJECTCOUNT$6, 0);
        }
    }
    
    /**
     * Gets the "starttime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTTIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "starttime" element
     */
    public boolean isSetStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$8) != 0;
        }
    }
    
    /**
     * Sets the "starttime" element
     */
    public void setStarttime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime starttime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(STARTTIME$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTTIME$8);
            }
            target.set(starttime);
        }
    }
    
    /**
     * Appends and returns a new empty "starttime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(STARTTIME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "starttime" element
     */
    public void unsetStarttime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$8, 0);
        }
    }
    
    /**
     * Gets the "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SUBSCRIPTIONID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptionid" element
     */
    public boolean isSetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONID$10) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionid" element
     */
    public void setSubscriptionid(com.microsoft.schemas.crm._2006.webservices.Lookup subscriptionid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SUBSCRIPTIONID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SUBSCRIPTIONID$10);
            }
            target.set(subscriptionid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SUBSCRIPTIONID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptionid" element
     */
    public void unsetSubscriptionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONID$10, 0);
        }
    }
    
    /**
     * Gets the "subscriptionsyncinfoid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSubscriptionsyncinfoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBSCRIPTIONSYNCINFOID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subscriptionsyncinfoid" element
     */
    public boolean isSetSubscriptionsyncinfoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONSYNCINFOID$12) != 0;
        }
    }
    
    /**
     * Sets the "subscriptionsyncinfoid" element
     */
    public void setSubscriptionsyncinfoid(com.microsoft.schemas.crm._2006.webservices.CrmNumber subscriptionsyncinfoid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUBSCRIPTIONSYNCINFOID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBSCRIPTIONSYNCINFOID$12);
            }
            target.set(subscriptionsyncinfoid);
        }
    }
    
    /**
     * Appends and returns a new empty "subscriptionsyncinfoid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSubscriptionsyncinfoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUBSCRIPTIONSYNCINFOID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "subscriptionsyncinfoid" element
     */
    public void unsetSubscriptionsyncinfoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONSYNCINFOID$12, 0);
        }
    }
    
    /**
     * Gets the "syncresult" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getSyncresult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SYNCRESULT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "syncresult" element
     */
    public boolean isSetSyncresult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNCRESULT$14) != 0;
        }
    }
    
    /**
     * Sets the "syncresult" element
     */
    public void setSyncresult(com.microsoft.schemas.crm._2006.webservices.CrmBoolean syncresult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(SYNCRESULT$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SYNCRESULT$14);
            }
            target.set(syncresult);
        }
    }
    
    /**
     * Appends and returns a new empty "syncresult" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewSyncresult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(SYNCRESULT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "syncresult" element
     */
    public void unsetSyncresult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNCRESULT$14, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    public boolean isSetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$16) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    public void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$16);
            }
            target.set(timezoneruleversionnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    public void unsetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$16, 0);
        }
    }
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    public boolean isSetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    public void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$18);
            }
            target.set(utcconversiontimezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    public void unsetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$18, 0);
        }
    }
}

/*
 * XML Type:  timezonerule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Timezonerule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML timezonerule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TimezoneruleImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Timezonerule
{
    
    public TimezoneruleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIAS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bias");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DAYLIGHTBIAS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightbias");
    private static final javax.xml.namespace.QName DAYLIGHTDAY$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightday");
    private static final javax.xml.namespace.QName DAYLIGHTDAYOFWEEK$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightdayofweek");
    private static final javax.xml.namespace.QName DAYLIGHTHOUR$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylighthour");
    private static final javax.xml.namespace.QName DAYLIGHTMINUTE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightminute");
    private static final javax.xml.namespace.QName DAYLIGHTMONTH$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightmonth");
    private static final javax.xml.namespace.QName DAYLIGHTSECOND$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightsecond");
    private static final javax.xml.namespace.QName DAYLIGHTYEAR$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "daylightyear");
    private static final javax.xml.namespace.QName EFFECTIVEDATETIME$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "effectivedatetime");
    private static final javax.xml.namespace.QName MODIFIEDBY$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName ORGANIZATIONID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName STANDARDBIAS$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardbias");
    private static final javax.xml.namespace.QName STANDARDDAY$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardday");
    private static final javax.xml.namespace.QName STANDARDDAYOFWEEK$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standarddayofweek");
    private static final javax.xml.namespace.QName STANDARDHOUR$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardhour");
    private static final javax.xml.namespace.QName STANDARDMINUTE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardminute");
    private static final javax.xml.namespace.QName STANDARDMONTH$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardmonth");
    private static final javax.xml.namespace.QName STANDARDSECOND$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardsecond");
    private static final javax.xml.namespace.QName STANDARDYEAR$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "standardyear");
    private static final javax.xml.namespace.QName TIMEZONEDEFINITIONID$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezonedefinitionid");
    private static final javax.xml.namespace.QName TIMEZONERULEID$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleid");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    
    
    /**
     * Gets the "bias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getBias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(BIAS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bias" element
     */
    public boolean isSetBias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIAS$0) != 0;
        }
    }
    
    /**
     * Sets the "bias" element
     */
    public void setBias(com.microsoft.schemas.crm._2006.webservices.CrmNumber bias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(BIAS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(BIAS$0);
            }
            target.set(bias);
        }
    }
    
    /**
     * Appends and returns a new empty "bias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewBias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(BIAS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "bias" element
     */
    public void unsetBias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIAS$0, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$2) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$2, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$4) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$4, 0);
        }
    }
    
    /**
     * Gets the "daylightbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTBIAS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightbias" element
     */
    public boolean isSetDaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTBIAS$6) != 0;
        }
    }
    
    /**
     * Sets the "daylightbias" element
     */
    public void setDaylightbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightbias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTBIAS$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTBIAS$6);
            }
            target.set(daylightbias);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTBIAS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightbias" element
     */
    public void unsetDaylightbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTBIAS$6, 0);
        }
    }
    
    /**
     * Gets the "daylightday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTDAY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightday" element
     */
    public boolean isSetDaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTDAY$8) != 0;
        }
    }
    
    /**
     * Sets the "daylightday" element
     */
    public void setDaylightday(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTDAY$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTDAY$8);
            }
            target.set(daylightday);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTDAY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightday" element
     */
    public void unsetDaylightday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTDAY$8, 0);
        }
    }
    
    /**
     * Gets the "daylightdayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTDAYOFWEEK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightdayofweek" element
     */
    public boolean isSetDaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTDAYOFWEEK$10) != 0;
        }
    }
    
    /**
     * Sets the "daylightdayofweek" element
     */
    public void setDaylightdayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightdayofweek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTDAYOFWEEK$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTDAYOFWEEK$10);
            }
            target.set(daylightdayofweek);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightdayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTDAYOFWEEK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightdayofweek" element
     */
    public void unsetDaylightdayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTDAYOFWEEK$10, 0);
        }
    }
    
    /**
     * Gets the "daylighthour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTHOUR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylighthour" element
     */
    public boolean isSetDaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTHOUR$12) != 0;
        }
    }
    
    /**
     * Sets the "daylighthour" element
     */
    public void setDaylighthour(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylighthour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTHOUR$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTHOUR$12);
            }
            target.set(daylighthour);
        }
    }
    
    /**
     * Appends and returns a new empty "daylighthour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTHOUR$12);
            return target;
        }
    }
    
    /**
     * Unsets the "daylighthour" element
     */
    public void unsetDaylighthour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTHOUR$12, 0);
        }
    }
    
    /**
     * Gets the "daylightminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTMINUTE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightminute" element
     */
    public boolean isSetDaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTMINUTE$14) != 0;
        }
    }
    
    /**
     * Sets the "daylightminute" element
     */
    public void setDaylightminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightminute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTMINUTE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTMINUTE$14);
            }
            target.set(daylightminute);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTMINUTE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightminute" element
     */
    public void unsetDaylightminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTMINUTE$14, 0);
        }
    }
    
    /**
     * Gets the "daylightmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTMONTH$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightmonth" element
     */
    public boolean isSetDaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTMONTH$16) != 0;
        }
    }
    
    /**
     * Sets the "daylightmonth" element
     */
    public void setDaylightmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightmonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTMONTH$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTMONTH$16);
            }
            target.set(daylightmonth);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTMONTH$16);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightmonth" element
     */
    public void unsetDaylightmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTMONTH$16, 0);
        }
    }
    
    /**
     * Gets the "daylightsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTSECOND$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightsecond" element
     */
    public boolean isSetDaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTSECOND$18) != 0;
        }
    }
    
    /**
     * Sets the "daylightsecond" element
     */
    public void setDaylightsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightsecond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTSECOND$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTSECOND$18);
            }
            target.set(daylightsecond);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTSECOND$18);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightsecond" element
     */
    public void unsetDaylightsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTSECOND$18, 0);
        }
    }
    
    /**
     * Gets the "daylightyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getDaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTYEAR$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "daylightyear" element
     */
    public boolean isSetDaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAYLIGHTYEAR$20) != 0;
        }
    }
    
    /**
     * Sets the "daylightyear" element
     */
    public void setDaylightyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber daylightyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(DAYLIGHTYEAR$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTYEAR$20);
            }
            target.set(daylightyear);
        }
    }
    
    /**
     * Appends and returns a new empty "daylightyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewDaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(DAYLIGHTYEAR$20);
            return target;
        }
    }
    
    /**
     * Unsets the "daylightyear" element
     */
    public void unsetDaylightyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAYLIGHTYEAR$20, 0);
        }
    }
    
    /**
     * Gets the "effectivedatetime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEffectivedatetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEDATETIME$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "effectivedatetime" element
     */
    public boolean isSetEffectivedatetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECTIVEDATETIME$22) != 0;
        }
    }
    
    /**
     * Sets the "effectivedatetime" element
     */
    public void setEffectivedatetime(com.microsoft.schemas.crm._2006.webservices.CrmDateTime effectivedatetime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(EFFECTIVEDATETIME$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEDATETIME$22);
            }
            target.set(effectivedatetime);
        }
    }
    
    /**
     * Appends and returns a new empty "effectivedatetime" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEffectivedatetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(EFFECTIVEDATETIME$22);
            return target;
        }
    }
    
    /**
     * Unsets the "effectivedatetime" element
     */
    public void unsetEffectivedatetime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECTIVEDATETIME$22, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$24) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$24);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$24);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$24, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$26) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$26);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$26);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$26, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationid" element
     */
    public boolean isSetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$28) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$28);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$28);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationid" element
     */
    public void unsetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$28, 0);
        }
    }
    
    /**
     * Gets the "standardbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDBIAS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardbias" element
     */
    public boolean isSetStandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDBIAS$30) != 0;
        }
    }
    
    /**
     * Sets the "standardbias" element
     */
    public void setStandardbias(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardbias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDBIAS$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDBIAS$30);
            }
            target.set(standardbias);
        }
    }
    
    /**
     * Appends and returns a new empty "standardbias" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDBIAS$30);
            return target;
        }
    }
    
    /**
     * Unsets the "standardbias" element
     */
    public void unsetStandardbias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDBIAS$30, 0);
        }
    }
    
    /**
     * Gets the "standardday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDDAY$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardday" element
     */
    public boolean isSetStandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDDAY$32) != 0;
        }
    }
    
    /**
     * Sets the "standardday" element
     */
    public void setStandardday(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDDAY$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDDAY$32);
            }
            target.set(standardday);
        }
    }
    
    /**
     * Appends and returns a new empty "standardday" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDDAY$32);
            return target;
        }
    }
    
    /**
     * Unsets the "standardday" element
     */
    public void unsetStandardday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDDAY$32, 0);
        }
    }
    
    /**
     * Gets the "standarddayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDDAYOFWEEK$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standarddayofweek" element
     */
    public boolean isSetStandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDDAYOFWEEK$34) != 0;
        }
    }
    
    /**
     * Sets the "standarddayofweek" element
     */
    public void setStandarddayofweek(com.microsoft.schemas.crm._2006.webservices.CrmNumber standarddayofweek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDDAYOFWEEK$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDDAYOFWEEK$34);
            }
            target.set(standarddayofweek);
        }
    }
    
    /**
     * Appends and returns a new empty "standarddayofweek" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDDAYOFWEEK$34);
            return target;
        }
    }
    
    /**
     * Unsets the "standarddayofweek" element
     */
    public void unsetStandarddayofweek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDDAYOFWEEK$34, 0);
        }
    }
    
    /**
     * Gets the "standardhour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDHOUR$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardhour" element
     */
    public boolean isSetStandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDHOUR$36) != 0;
        }
    }
    
    /**
     * Sets the "standardhour" element
     */
    public void setStandardhour(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardhour)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDHOUR$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDHOUR$36);
            }
            target.set(standardhour);
        }
    }
    
    /**
     * Appends and returns a new empty "standardhour" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDHOUR$36);
            return target;
        }
    }
    
    /**
     * Unsets the "standardhour" element
     */
    public void unsetStandardhour()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDHOUR$36, 0);
        }
    }
    
    /**
     * Gets the "standardminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDMINUTE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardminute" element
     */
    public boolean isSetStandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDMINUTE$38) != 0;
        }
    }
    
    /**
     * Sets the "standardminute" element
     */
    public void setStandardminute(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardminute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDMINUTE$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDMINUTE$38);
            }
            target.set(standardminute);
        }
    }
    
    /**
     * Appends and returns a new empty "standardminute" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDMINUTE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "standardminute" element
     */
    public void unsetStandardminute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDMINUTE$38, 0);
        }
    }
    
    /**
     * Gets the "standardmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDMONTH$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardmonth" element
     */
    public boolean isSetStandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDMONTH$40) != 0;
        }
    }
    
    /**
     * Sets the "standardmonth" element
     */
    public void setStandardmonth(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardmonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDMONTH$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDMONTH$40);
            }
            target.set(standardmonth);
        }
    }
    
    /**
     * Appends and returns a new empty "standardmonth" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDMONTH$40);
            return target;
        }
    }
    
    /**
     * Unsets the "standardmonth" element
     */
    public void unsetStandardmonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDMONTH$40, 0);
        }
    }
    
    /**
     * Gets the "standardsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDSECOND$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardsecond" element
     */
    public boolean isSetStandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDSECOND$42) != 0;
        }
    }
    
    /**
     * Sets the "standardsecond" element
     */
    public void setStandardsecond(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardsecond)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDSECOND$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDSECOND$42);
            }
            target.set(standardsecond);
        }
    }
    
    /**
     * Appends and returns a new empty "standardsecond" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDSECOND$42);
            return target;
        }
    }
    
    /**
     * Unsets the "standardsecond" element
     */
    public void unsetStandardsecond()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDSECOND$42, 0);
        }
    }
    
    /**
     * Gets the "standardyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getStandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDYEAR$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardyear" element
     */
    public boolean isSetStandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDYEAR$44) != 0;
        }
    }
    
    /**
     * Sets the "standardyear" element
     */
    public void setStandardyear(com.microsoft.schemas.crm._2006.webservices.CrmNumber standardyear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(STANDARDYEAR$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDYEAR$44);
            }
            target.set(standardyear);
        }
    }
    
    /**
     * Appends and returns a new empty "standardyear" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewStandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(STANDARDYEAR$44);
            return target;
        }
    }
    
    /**
     * Unsets the "standardyear" element
     */
    public void unsetStandardyear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDYEAR$44, 0);
        }
    }
    
    /**
     * Gets the "timezonedefinitionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTimezonedefinitionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TIMEZONEDEFINITIONID$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezonedefinitionid" element
     */
    public boolean isSetTimezonedefinitionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONEDEFINITIONID$46) != 0;
        }
    }
    
    /**
     * Sets the "timezonedefinitionid" element
     */
    public void setTimezonedefinitionid(com.microsoft.schemas.crm._2006.webservices.Lookup timezonedefinitionid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TIMEZONEDEFINITIONID$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TIMEZONEDEFINITIONID$46);
            }
            target.set(timezonedefinitionid);
        }
    }
    
    /**
     * Appends and returns a new empty "timezonedefinitionid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTimezonedefinitionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TIMEZONEDEFINITIONID$46);
            return target;
        }
    }
    
    /**
     * Unsets the "timezonedefinitionid" element
     */
    public void unsetTimezonedefinitionid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONEDEFINITIONID$46, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getTimezoneruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(TIMEZONERULEID$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleid" element
     */
    public boolean isSetTimezoneruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEID$48) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleid" element
     */
    public void setTimezoneruleid(com.microsoft.schemas.crm._2006.webservices.Key timezoneruleid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(TIMEZONERULEID$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(TIMEZONERULEID$48);
            }
            target.set(timezoneruleid);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewTimezoneruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(TIMEZONERULEID$48);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleid" element
     */
    public void unsetTimezoneruleid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEID$48, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$50, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$50) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$50);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$50);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$50, 0);
        }
    }
}

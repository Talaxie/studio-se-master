/*
 * XML Type:  bulkoperationlog
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Bulkoperationlog
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML bulkoperationlog(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BulkoperationlogImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Bulkoperationlog
{
    
    public BulkoperationlogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDITIONALINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "additionalinfo");
    private static final javax.xml.namespace.QName BULKOPERATIONID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bulkoperationid");
    private static final javax.xml.namespace.QName BULKOPERATIONLOGID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bulkoperationlogid");
    private static final javax.xml.namespace.QName CREATEDOBJECTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdobjectid");
    private static final javax.xml.namespace.QName ERRORNUMBER$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "errornumber");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName REGARDINGOBJECTID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "regardingobjectid");
    
    
    /**
     * Gets the "additionalinfo" element
     */
    public java.lang.String getAdditionalinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalinfo" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "additionalinfo" element
     */
    public boolean isSetAdditionalinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINFO$0) != 0;
        }
    }
    
    /**
     * Sets the "additionalinfo" element
     */
    public void setAdditionalinfo(java.lang.String additionalinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALINFO$0);
            }
            target.setStringValue(additionalinfo);
        }
    }
    
    /**
     * Sets (as xml) the "additionalinfo" element
     */
    public void xsetAdditionalinfo(org.apache.xmlbeans.XmlString additionalinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALINFO$0);
            }
            target.set(additionalinfo);
        }
    }
    
    /**
     * Unsets the "additionalinfo" element
     */
    public void unsetAdditionalinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINFO$0, 0);
        }
    }
    
    /**
     * Gets the "bulkoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBulkoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BULKOPERATIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bulkoperationid" element
     */
    public boolean isSetBulkoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKOPERATIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "bulkoperationid" element
     */
    public void setBulkoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup bulkoperationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BULKOPERATIONID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BULKOPERATIONID$2);
            }
            target.set(bulkoperationid);
        }
    }
    
    /**
     * Appends and returns a new empty "bulkoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewBulkoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BULKOPERATIONID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bulkoperationid" element
     */
    public void unsetBulkoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKOPERATIONID$2, 0);
        }
    }
    
    /**
     * Gets the "bulkoperationlogid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getBulkoperationlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(BULKOPERATIONLOGID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bulkoperationlogid" element
     */
    public boolean isSetBulkoperationlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKOPERATIONLOGID$4) != 0;
        }
    }
    
    /**
     * Sets the "bulkoperationlogid" element
     */
    public void setBulkoperationlogid(com.microsoft.schemas.crm._2006.webservices.Key bulkoperationlogid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(BULKOPERATIONLOGID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(BULKOPERATIONLOGID$4);
            }
            target.set(bulkoperationlogid);
        }
    }
    
    /**
     * Appends and returns a new empty "bulkoperationlogid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewBulkoperationlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(BULKOPERATIONLOGID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bulkoperationlogid" element
     */
    public void unsetBulkoperationlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKOPERATIONLOGID$4, 0);
        }
    }
    
    /**
     * Gets the "createdobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdobjectid" element
     */
    public boolean isSetCreatedobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDOBJECTID$6) != 0;
        }
    }
    
    /**
     * Sets the "createdobjectid" element
     */
    public void setCreatedobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup createdobjectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDOBJECTID$6);
            }
            target.set(createdobjectid);
        }
    }
    
    /**
     * Appends and returns a new empty "createdobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDOBJECTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "createdobjectid" element
     */
    public void unsetCreatedobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDOBJECTID$6, 0);
        }
    }
    
    /**
     * Gets the "errornumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getErrornumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ERRORNUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errornumber" element
     */
    public boolean isSetErrornumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORNUMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "errornumber" element
     */
    public void setErrornumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber errornumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ERRORNUMBER$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ERRORNUMBER$8);
            }
            target.set(errornumber);
        }
    }
    
    /**
     * Appends and returns a new empty "errornumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewErrornumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ERRORNUMBER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "errornumber" element
     */
    public void unsetErrornumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORNUMBER$8, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$10) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$10);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$10, 0);
        }
    }
    
    /**
     * Gets the "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owninguser" element
     */
    public boolean isSetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGUSER$12) != 0;
        }
    }
    
    /**
     * Sets the "owninguser" element
     */
    public void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$12);
            }
            target.set(owninguser);
        }
    }
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "owninguser" element
     */
    public void unsetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGUSER$12, 0);
        }
    }
    
    /**
     * Gets the "regardingobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regardingobjectid" element
     */
    public boolean isSetRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGARDINGOBJECTID$14) != 0;
        }
    }
    
    /**
     * Sets the "regardingobjectid" element
     */
    public void setRegardingobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup regardingobjectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$14);
            }
            target.set(regardingobjectid);
        }
    }
    
    /**
     * Appends and returns a new empty "regardingobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "regardingobjectid" element
     */
    public void unsetRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGARDINGOBJECTID$14, 0);
        }
    }
}

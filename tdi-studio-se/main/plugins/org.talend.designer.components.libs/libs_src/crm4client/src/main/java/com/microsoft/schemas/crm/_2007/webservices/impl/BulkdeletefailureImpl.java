/*
 * XML Type:  bulkdeletefailure
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML bulkdeletefailure(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class BulkdeletefailureImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Bulkdeletefailure
{
    
    public BulkdeletefailureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASYNCOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "asyncoperationid");
    private static final javax.xml.namespace.QName BULKDELETEFAILUREID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bulkdeletefailureid");
    private static final javax.xml.namespace.QName BULKDELETEOPERATIONID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bulkdeleteoperationid");
    private static final javax.xml.namespace.QName ERRORDESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "errordescription");
    private static final javax.xml.namespace.QName ERRORNUMBER$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "errornumber");
    private static final javax.xml.namespace.QName ORDEREDQUERYINDEX$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "orderedqueryindex");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName REGARDINGOBJECTID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "regardingobjectid");
    
    
    /**
     * Gets the "asyncoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ASYNCOPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asyncoperationid" element
     */
    public boolean isSetAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASYNCOPERATIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "asyncoperationid" element
     */
    public void setAsyncoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup asyncoperationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ASYNCOPERATIONID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ASYNCOPERATIONID$0);
            }
            target.set(asyncoperationid);
        }
    }
    
    /**
     * Appends and returns a new empty "asyncoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ASYNCOPERATIONID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "asyncoperationid" element
     */
    public void unsetAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASYNCOPERATIONID$0, 0);
        }
    }
    
    /**
     * Gets the "bulkdeletefailureid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getBulkdeletefailureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(BULKDELETEFAILUREID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bulkdeletefailureid" element
     */
    public boolean isSetBulkdeletefailureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKDELETEFAILUREID$2) != 0;
        }
    }
    
    /**
     * Sets the "bulkdeletefailureid" element
     */
    public void setBulkdeletefailureid(com.microsoft.schemas.crm._2006.webservices.Key bulkdeletefailureid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(BULKDELETEFAILUREID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(BULKDELETEFAILUREID$2);
            }
            target.set(bulkdeletefailureid);
        }
    }
    
    /**
     * Appends and returns a new empty "bulkdeletefailureid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewBulkdeletefailureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(BULKDELETEFAILUREID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "bulkdeletefailureid" element
     */
    public void unsetBulkdeletefailureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKDELETEFAILUREID$2, 0);
        }
    }
    
    /**
     * Gets the "bulkdeleteoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getBulkdeleteoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BULKDELETEOPERATIONID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "bulkdeleteoperationid" element
     */
    public boolean isSetBulkdeleteoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BULKDELETEOPERATIONID$4) != 0;
        }
    }
    
    /**
     * Sets the "bulkdeleteoperationid" element
     */
    public void setBulkdeleteoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup bulkdeleteoperationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(BULKDELETEOPERATIONID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BULKDELETEOPERATIONID$4);
            }
            target.set(bulkdeleteoperationid);
        }
    }
    
    /**
     * Appends and returns a new empty "bulkdeleteoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewBulkdeleteoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(BULKDELETEOPERATIONID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "bulkdeleteoperationid" element
     */
    public void unsetBulkdeleteoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BULKDELETEOPERATIONID$4, 0);
        }
    }
    
    /**
     * Gets the "errordescription" element
     */
    public java.lang.String getErrordescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errordescription" element
     */
    public org.apache.xmlbeans.XmlString xgetErrordescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "errordescription" element
     */
    public boolean isSetErrordescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "errordescription" element
     */
    public void setErrordescription(java.lang.String errordescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDESCRIPTION$6);
            }
            target.setStringValue(errordescription);
        }
    }
    
    /**
     * Sets (as xml) the "errordescription" element
     */
    public void xsetErrordescription(org.apache.xmlbeans.XmlString errordescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDESCRIPTION$6);
            }
            target.set(errordescription);
        }
    }
    
    /**
     * Unsets the "errordescription" element
     */
    public void unsetErrordescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORDESCRIPTION$6, 0);
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
     * Gets the "orderedqueryindex" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getOrderedqueryindex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ORDEREDQUERYINDEX$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orderedqueryindex" element
     */
    public boolean isSetOrderedqueryindex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDEREDQUERYINDEX$10) != 0;
        }
    }
    
    /**
     * Sets the "orderedqueryindex" element
     */
    public void setOrderedqueryindex(com.microsoft.schemas.crm._2006.webservices.CrmNumber orderedqueryindex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ORDEREDQUERYINDEX$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ORDEREDQUERYINDEX$10);
            }
            target.set(orderedqueryindex);
        }
    }
    
    /**
     * Appends and returns a new empty "orderedqueryindex" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewOrderedqueryindex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ORDEREDQUERYINDEX$10);
            return target;
        }
    }
    
    /**
     * Unsets the "orderedqueryindex" element
     */
    public void unsetOrderedqueryindex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDEREDQUERYINDEX$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$12, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$12);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$14, 0);
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
            return get_store().count_elements(OWNINGUSER$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$14);
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
            get_store().remove_element(OWNINGUSER$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$16, 0);
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
            return get_store().count_elements(REGARDINGOBJECTID$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$16);
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
            get_store().remove_element(REGARDINGOBJECTID$16, 0);
        }
    }
}

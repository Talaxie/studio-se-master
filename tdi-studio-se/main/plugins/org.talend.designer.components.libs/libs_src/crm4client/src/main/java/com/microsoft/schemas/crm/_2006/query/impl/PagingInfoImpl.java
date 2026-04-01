/*
 * XML Type:  PagingInfo
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.PagingInfo
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML PagingInfo(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class PagingInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.PagingInfo
{
    
    public PagingInfoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGENUMBER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "PageNumber");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "Count");
    private static final javax.xml.namespace.QName PAGINGCOOKIE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "PagingCookie");
    
    
    /**
     * Gets the "PageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$0);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "PageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$0);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Gets the "Count" element
     */
    public int getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Count" element
     */
    public org.apache.xmlbeans.XmlInt xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Count" element
     */
    public void setCount(int count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$2);
            }
            target.setIntValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "Count" element
     */
    public void xsetCount(org.apache.xmlbeans.XmlInt count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COUNT$2);
            }
            target.set(count);
        }
    }
    
    /**
     * Gets the "PagingCookie" element
     */
    public java.lang.String getPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PagingCookie" element
     */
    public org.apache.xmlbeans.XmlString xgetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PagingCookie" element
     */
    public boolean isSetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGINGCOOKIE$4) != 0;
        }
    }
    
    /**
     * Sets the "PagingCookie" element
     */
    public void setPagingCookie(java.lang.String pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGINGCOOKIE$4);
            }
            target.setStringValue(pagingCookie);
        }
    }
    
    /**
     * Sets (as xml) the "PagingCookie" element
     */
    public void xsetPagingCookie(org.apache.xmlbeans.XmlString pagingCookie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGINGCOOKIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGINGCOOKIE$4);
            }
            target.set(pagingCookie);
        }
    }
    
    /**
     * Unsets the "PagingCookie" element
     */
    public void unsetPagingCookie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGINGCOOKIE$4, 0);
        }
    }
}

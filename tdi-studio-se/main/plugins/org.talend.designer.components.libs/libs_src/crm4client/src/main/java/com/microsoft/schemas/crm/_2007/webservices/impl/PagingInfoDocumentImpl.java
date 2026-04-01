/*
 * An XML document type.
 * Localname: PagingInfo
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.PagingInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one PagingInfo(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class PagingInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.PagingInfoDocument
{
    
    public PagingInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGINGINFO$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PagingInfo");
    
    
    /**
     * Gets the "PagingInfo" element
     */
    public com.microsoft.schemas.crm._2006.query.PagingInfo getPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PagingInfo" element
     */
    public boolean isNilPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PagingInfo" element
     */
    public void setPagingInfo(com.microsoft.schemas.crm._2006.query.PagingInfo pagingInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$0);
            }
            target.set(pagingInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "PagingInfo" element
     */
    public com.microsoft.schemas.crm._2006.query.PagingInfo addNewPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$0);
            return target;
        }
    }
    
    /**
     * Nils the "PagingInfo" element
     */
    public void setNilPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$0);
            }
            target.setNil();
        }
    }
}

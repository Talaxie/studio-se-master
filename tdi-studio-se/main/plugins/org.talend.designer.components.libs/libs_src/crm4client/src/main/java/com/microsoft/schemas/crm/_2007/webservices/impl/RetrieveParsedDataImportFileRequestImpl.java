/*
 * XML Type:  RetrieveParsedDataImportFileRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveParsedDataImportFileRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveParsedDataImportFileRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveParsedDataImportFileRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveParsedDataImportFileRequest
{
    
    public RetrieveParsedDataImportFileRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTFILEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportFileId");
    private static final javax.xml.namespace.QName PAGINGINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PagingInfo");
    
    
    /**
     * Gets the "ImportFileId" element
     */
    public java.lang.String getImportFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTFILEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportFileId" element
     */
    public com.microsoft.wsdl.types.Guid xgetImportFileId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTFILEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportFileId" element
     */
    public void setImportFileId(java.lang.String importFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTFILEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTFILEID$0);
            }
            target.setStringValue(importFileId);
        }
    }
    
    /**
     * Sets (as xml) the "ImportFileId" element
     */
    public void xsetImportFileId(com.microsoft.wsdl.types.Guid importFileId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPORTFILEID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(IMPORTFILEID$0);
            }
            target.set(importFileId);
        }
    }
    
    /**
     * Gets the "PagingInfo" element
     */
    public com.microsoft.schemas.crm._2006.query.PagingInfo getPagingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.PagingInfo target = null;
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$2);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$2);
            return target;
        }
    }
}

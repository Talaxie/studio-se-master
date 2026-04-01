/*
 * XML Type:  GetDistinctValuesImportFileRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.GetDistinctValuesImportFileRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML GetDistinctValuesImportFileRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class GetDistinctValuesImportFileRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.GetDistinctValuesImportFileRequest
{
    
    public GetDistinctValuesImportFileRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTFILEID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImportFileId");
    private static final javax.xml.namespace.QName COLUMNNUMBER$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "columnNumber");
    private static final javax.xml.namespace.QName PAGENUMBER$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "pageNumber");
    private static final javax.xml.namespace.QName RECORDSPERPAGE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "recordsPerPage");
    
    
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
     * Gets the "columnNumber" element
     */
    public int getColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNUMBER$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetColumnNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "columnNumber" element
     */
    public void setColumnNumber(int columnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNNUMBER$2);
            }
            target.setIntValue(columnNumber);
        }
    }
    
    /**
     * Sets (as xml) the "columnNumber" element
     */
    public void xsetColumnNumber(org.apache.xmlbeans.XmlInt columnNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COLUMNNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COLUMNNUMBER$2);
            }
            target.set(columnNumber);
        }
    }
    
    /**
     * Gets the "pageNumber" element
     */
    public int getPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "pageNumber" element
     */
    public org.apache.xmlbeans.XmlInt xgetPageNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pageNumber" element
     */
    public void setPageNumber(int pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGENUMBER$4);
            }
            target.setIntValue(pageNumber);
        }
    }
    
    /**
     * Sets (as xml) the "pageNumber" element
     */
    public void xsetPageNumber(org.apache.xmlbeans.XmlInt pageNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PAGENUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PAGENUMBER$4);
            }
            target.set(pageNumber);
        }
    }
    
    /**
     * Gets the "recordsPerPage" element
     */
    public int getRecordsPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDSPERPAGE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "recordsPerPage" element
     */
    public org.apache.xmlbeans.XmlInt xgetRecordsPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDSPERPAGE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "recordsPerPage" element
     */
    public void setRecordsPerPage(int recordsPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECORDSPERPAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECORDSPERPAGE$6);
            }
            target.setIntValue(recordsPerPage);
        }
    }
    
    /**
     * Sets (as xml) the "recordsPerPage" element
     */
    public void xsetRecordsPerPage(org.apache.xmlbeans.XmlInt recordsPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RECORDSPERPAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RECORDSPERPAGE$6);
            }
            target.set(recordsPerPage);
        }
    }
}

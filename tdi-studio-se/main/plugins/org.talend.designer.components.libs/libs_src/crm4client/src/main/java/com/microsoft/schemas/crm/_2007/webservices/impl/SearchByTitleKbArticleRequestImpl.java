/*
 * XML Type:  SearchByTitleKbArticleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SearchByTitleKbArticleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SearchByTitleKbArticleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SearchByTitleKbArticleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SearchByTitleKbArticleRequest
{
    
    public SearchByTitleKbArticleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHTEXT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SearchText");
    private static final javax.xml.namespace.QName SUBJECTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SubjectId");
    private static final javax.xml.namespace.QName COLUMNSET$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ColumnSet");
    private static final javax.xml.namespace.QName RETURNDYNAMICENTITIES$6 = 
        new javax.xml.namespace.QName("", "ReturnDynamicEntities");
    
    
    /**
     * Gets the "SearchText" element
     */
    public java.lang.String getSearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SearchText" element
     */
    public org.apache.xmlbeans.XmlString xgetSearchText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SearchText" element
     */
    public void setSearchText(java.lang.String searchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHTEXT$0);
            }
            target.setStringValue(searchText);
        }
    }
    
    /**
     * Sets (as xml) the "SearchText" element
     */
    public void xsetSearchText(org.apache.xmlbeans.XmlString searchText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEARCHTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEARCHTEXT$0);
            }
            target.set(searchText);
        }
    }
    
    /**
     * Gets the "SubjectId" element
     */
    public java.lang.String getSubjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubjectId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSubjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBJECTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubjectId" element
     */
    public void setSubjectId(java.lang.String subjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTID$2);
            }
            target.setStringValue(subjectId);
        }
    }
    
    /**
     * Sets (as xml) the "SubjectId" element
     */
    public void xsetSubjectId(com.microsoft.wsdl.types.Guid subjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBJECTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SUBJECTID$2);
            }
            target.set(subjectId);
        }
    }
    
    /**
     * Gets the "ColumnSet" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase getColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ColumnSet" element
     */
    public void setColumnSet(com.microsoft.schemas.crm._2006.query.ColumnSetBase columnSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().find_element_user(COLUMNSET$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$4);
            }
            target.set(columnSet);
        }
    }
    
    /**
     * Appends and returns a new empty "ColumnSet" element
     */
    public com.microsoft.schemas.crm._2006.query.ColumnSetBase addNewColumnSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ColumnSetBase target = null;
            target = (com.microsoft.schemas.crm._2006.query.ColumnSetBase)get_store().add_element_user(COLUMNSET$4);
            return target;
        }
    }
    
    /**
     * Gets the "ReturnDynamicEntities" attribute
     */
    public boolean getReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnDynamicEntities" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnDynamicEntities" attribute
     */
    public void setReturnDynamicEntities(boolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNDYNAMICENTITIES$6);
            }
            target.setBooleanValue(returnDynamicEntities);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnDynamicEntities" attribute
     */
    public void xsetReturnDynamicEntities(org.apache.xmlbeans.XmlBoolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNDYNAMICENTITIES$6);
            }
            target.set(returnDynamicEntities);
        }
    }
}

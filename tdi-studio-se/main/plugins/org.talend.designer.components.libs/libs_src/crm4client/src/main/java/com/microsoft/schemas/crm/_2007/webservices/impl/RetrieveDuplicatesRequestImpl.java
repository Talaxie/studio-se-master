/*
 * XML Type:  RetrieveDuplicatesRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveDuplicatesRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveDuplicatesRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveDuplicatesRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveDuplicatesRequest
{
    
    public RetrieveDuplicatesRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessEntity");
    private static final javax.xml.namespace.QName MATCHINGENTITYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MatchingEntityName");
    private static final javax.xml.namespace.QName PAGINGINFO$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PagingInfo");
    private static final javax.xml.namespace.QName RETURNDYNAMICENTITIES$6 = 
        new javax.xml.namespace.QName("", "ReturnDynamicEntities");
    
    
    /**
     * Gets the "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessEntity" element
     */
    public void setBusinessEntity(com.microsoft.schemas.crm._2006.webservices.BusinessEntity businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(BUSINESSENTITY$0);
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(BUSINESSENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "MatchingEntityName" element
     */
    public java.lang.String getMatchingEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHINGENTITYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MatchingEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetMatchingEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHINGENTITYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MatchingEntityName" element
     */
    public void setMatchingEntityName(java.lang.String matchingEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHINGENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHINGENTITYNAME$2);
            }
            target.setStringValue(matchingEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "MatchingEntityName" element
     */
    public void xsetMatchingEntityName(org.apache.xmlbeans.XmlString matchingEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHINGENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCHINGENTITYNAME$2);
            }
            target.set(matchingEntityName);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().find_element_user(PAGINGINFO$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$4);
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
            target = (com.microsoft.schemas.crm._2006.query.PagingInfo)get_store().add_element_user(PAGINGINFO$4);
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

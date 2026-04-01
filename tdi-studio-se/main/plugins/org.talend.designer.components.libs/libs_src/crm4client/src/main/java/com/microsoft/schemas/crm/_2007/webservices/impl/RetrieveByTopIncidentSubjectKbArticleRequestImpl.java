/*
 * XML Type:  RetrieveByTopIncidentSubjectKbArticleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveByTopIncidentSubjectKbArticleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveByTopIncidentSubjectKbArticleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveByTopIncidentSubjectKbArticleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveByTopIncidentSubjectKbArticleRequest
{
    
    public RetrieveByTopIncidentSubjectKbArticleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SubjectId");
    private static final javax.xml.namespace.QName RETURNDYNAMICENTITIES$2 = 
        new javax.xml.namespace.QName("", "ReturnDynamicEntities");
    
    
    /**
     * Gets the "SubjectId" element
     */
    public java.lang.String getSubjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$0, 0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBJECTID$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTID$0);
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
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBJECTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SUBJECTID$0);
            }
            target.set(subjectId);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNDYNAMICENTITIES$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNDYNAMICENTITIES$2);
            }
            target.set(returnDynamicEntities);
        }
    }
}

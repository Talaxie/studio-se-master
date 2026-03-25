/*
 * XML Type:  LogSuccessBulkOperationRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML LogSuccessBulkOperationRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class LogSuccessBulkOperationRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.LogSuccessBulkOperationRequest
{
    
    public LogSuccessBulkOperationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULKOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BulkOperationId");
    private static final javax.xml.namespace.QName REGARDINGOBJECTID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RegardingObjectId");
    private static final javax.xml.namespace.QName REGARDINGOBJECTTYPECODE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RegardingObjectTypeCode");
    private static final javax.xml.namespace.QName CREATEDOBJECTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CreatedObjectId");
    private static final javax.xml.namespace.QName CREATEDOBJECTTYPECODE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CreatedObjectTypeCode");
    private static final javax.xml.namespace.QName ADDITIONALINFO$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AdditionalInfo");
    
    
    /**
     * Gets the "BulkOperationId" element
     */
    public java.lang.String getBulkOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BulkOperationId" element
     */
    public com.microsoft.wsdl.types.Guid xgetBulkOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BULKOPERATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BulkOperationId" element
     */
    public void setBulkOperationId(java.lang.String bulkOperationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BULKOPERATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BULKOPERATIONID$0);
            }
            target.setStringValue(bulkOperationId);
        }
    }
    
    /**
     * Sets (as xml) the "BulkOperationId" element
     */
    public void xsetBulkOperationId(com.microsoft.wsdl.types.Guid bulkOperationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BULKOPERATIONID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(BULKOPERATIONID$0);
            }
            target.set(bulkOperationId);
        }
    }
    
    /**
     * Gets the "RegardingObjectId" element
     */
    public java.lang.String getRegardingObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGOBJECTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegardingObjectId" element
     */
    public com.microsoft.wsdl.types.Guid xgetRegardingObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REGARDINGOBJECTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegardingObjectId" element
     */
    public void setRegardingObjectId(java.lang.String regardingObjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGOBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGARDINGOBJECTID$2);
            }
            target.setStringValue(regardingObjectId);
        }
    }
    
    /**
     * Sets (as xml) the "RegardingObjectId" element
     */
    public void xsetRegardingObjectId(com.microsoft.wsdl.types.Guid regardingObjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(REGARDINGOBJECTID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(REGARDINGOBJECTID$2);
            }
            target.set(regardingObjectId);
        }
    }
    
    /**
     * Gets the "RegardingObjectTypeCode" element
     */
    public int getRegardingObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGOBJECTTYPECODE$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegardingObjectTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetRegardingObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REGARDINGOBJECTTYPECODE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegardingObjectTypeCode" element
     */
    public void setRegardingObjectTypeCode(int regardingObjectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGARDINGOBJECTTYPECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGARDINGOBJECTTYPECODE$4);
            }
            target.setIntValue(regardingObjectTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "RegardingObjectTypeCode" element
     */
    public void xsetRegardingObjectTypeCode(org.apache.xmlbeans.XmlInt regardingObjectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REGARDINGOBJECTTYPECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REGARDINGOBJECTTYPECODE$4);
            }
            target.set(regardingObjectTypeCode);
        }
    }
    
    /**
     * Gets the "CreatedObjectId" element
     */
    public java.lang.String getCreatedObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedObjectId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCreatedObjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreatedObjectId" element
     */
    public void setCreatedObjectId(java.lang.String createdObjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDOBJECTID$6);
            }
            target.setStringValue(createdObjectId);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedObjectId" element
     */
    public void xsetCreatedObjectId(com.microsoft.wsdl.types.Guid createdObjectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CREATEDOBJECTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CREATEDOBJECTID$6);
            }
            target.set(createdObjectId);
        }
    }
    
    /**
     * Gets the "CreatedObjectTypeCode" element
     */
    public int getCreatedObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDOBJECTTYPECODE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedObjectTypeCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetCreatedObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREATEDOBJECTTYPECODE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreatedObjectTypeCode" element
     */
    public void setCreatedObjectTypeCode(int createdObjectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDOBJECTTYPECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDOBJECTTYPECODE$8);
            }
            target.setIntValue(createdObjectTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedObjectTypeCode" element
     */
    public void xsetCreatedObjectTypeCode(org.apache.xmlbeans.XmlInt createdObjectTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREATEDOBJECTTYPECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CREATEDOBJECTTYPECODE$8);
            }
            target.set(createdObjectTypeCode);
        }
    }
    
    /**
     * Gets the "AdditionalInfo" element
     */
    public java.lang.String getAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AdditionalInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AdditionalInfo" element
     */
    public void setAdditionalInfo(java.lang.String additionalInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALINFO$10);
            }
            target.setStringValue(additionalInfo);
        }
    }
    
    /**
     * Sets (as xml) the "AdditionalInfo" element
     */
    public void xsetAdditionalInfo(org.apache.xmlbeans.XmlString additionalInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALINFO$10);
            }
            target.set(additionalInfo);
        }
    }
}

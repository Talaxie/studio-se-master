/*
 * XML Type:  PropagateByExpressionResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.PropagateByExpressionResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML PropagateByExpressionResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class PropagateByExpressionResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.PropagateByExpressionResponse
{
    
    public PropagateByExpressionResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BULKOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BulkOperationId");
    
    
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
}

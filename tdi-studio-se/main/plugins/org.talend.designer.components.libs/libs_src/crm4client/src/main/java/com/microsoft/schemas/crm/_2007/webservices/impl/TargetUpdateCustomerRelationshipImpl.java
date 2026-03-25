/*
 * XML Type:  TargetUpdateCustomerRelationship
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerRelationship
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateCustomerRelationship(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateCustomerRelationshipImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateCustomerRelationship
{
    
    public TargetUpdateCustomerRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CustomerRelationship");
    
    
    /**
     * Gets the "CustomerRelationship" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customerrelationship getCustomerRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customerrelationship target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customerrelationship)get_store().find_element_user(CUSTOMERRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CustomerRelationship" element
     */
    public void setCustomerRelationship(com.microsoft.schemas.crm._2007.webservices.Customerrelationship customerRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customerrelationship target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customerrelationship)get_store().find_element_user(CUSTOMERRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Customerrelationship)get_store().add_element_user(CUSTOMERRELATIONSHIP$0);
            }
            target.set(customerRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerRelationship" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Customerrelationship addNewCustomerRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Customerrelationship target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Customerrelationship)get_store().add_element_user(CUSTOMERRELATIONSHIP$0);
            return target;
        }
    }
}

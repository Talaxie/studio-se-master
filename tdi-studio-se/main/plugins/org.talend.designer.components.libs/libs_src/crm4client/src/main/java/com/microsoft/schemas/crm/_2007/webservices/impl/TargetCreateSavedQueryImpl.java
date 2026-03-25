/*
 * XML Type:  TargetCreateSavedQuery
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateSavedQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateSavedQuery(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateSavedQueryImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateSavedQuery
{
    
    public TargetCreateSavedQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAVEDQUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SavedQuery");
    
    
    /**
     * Gets the "SavedQuery" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Savedquery getSavedQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Savedquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Savedquery)get_store().find_element_user(SAVEDQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SavedQuery" element
     */
    public void setSavedQuery(com.microsoft.schemas.crm._2007.webservices.Savedquery savedQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Savedquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Savedquery)get_store().find_element_user(SAVEDQUERY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Savedquery)get_store().add_element_user(SAVEDQUERY$0);
            }
            target.set(savedQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "SavedQuery" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Savedquery addNewSavedQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Savedquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Savedquery)get_store().add_element_user(SAVEDQUERY$0);
            return target;
        }
    }
}

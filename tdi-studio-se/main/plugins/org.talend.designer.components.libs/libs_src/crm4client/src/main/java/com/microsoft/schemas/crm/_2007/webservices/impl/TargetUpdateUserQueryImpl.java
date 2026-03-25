/*
 * XML Type:  TargetUpdateUserQuery
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateUserQuery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateUserQuery(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateUserQueryImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateUserQuery
{
    
    public TargetUpdateUserQueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERQUERY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UserQuery");
    
    
    /**
     * Gets the "UserQuery" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Userquery getUserQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Userquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Userquery)get_store().find_element_user(USERQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserQuery" element
     */
    public void setUserQuery(com.microsoft.schemas.crm._2007.webservices.Userquery userQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Userquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Userquery)get_store().find_element_user(USERQUERY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Userquery)get_store().add_element_user(USERQUERY$0);
            }
            target.set(userQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "UserQuery" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Userquery addNewUserQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Userquery target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Userquery)get_store().add_element_user(USERQUERY$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetUpdateSystemUser
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateSystemUser
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateSystemUser(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateSystemUserImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateSystemUser
{
    
    public TargetUpdateSystemUserImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMUSER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SystemUser");
    
    
    /**
     * Gets the "SystemUser" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Systemuser getSystemUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Systemuser target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Systemuser)get_store().find_element_user(SYSTEMUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemUser" element
     */
    public void setSystemUser(com.microsoft.schemas.crm._2007.webservices.Systemuser systemUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Systemuser target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Systemuser)get_store().find_element_user(SYSTEMUSER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Systemuser)get_store().add_element_user(SYSTEMUSER$0);
            }
            target.set(systemUser);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemUser" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Systemuser addNewSystemUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Systemuser target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Systemuser)get_store().add_element_user(SYSTEMUSER$0);
            return target;
        }
    }
}

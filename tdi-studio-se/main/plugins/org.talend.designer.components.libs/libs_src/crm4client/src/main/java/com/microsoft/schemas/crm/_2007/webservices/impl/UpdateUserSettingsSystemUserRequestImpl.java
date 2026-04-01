/*
 * XML Type:  UpdateUserSettingsSystemUserRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.UpdateUserSettingsSystemUserRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML UpdateUserSettingsSystemUserRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class UpdateUserSettingsSystemUserRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.UpdateUserSettingsSystemUserRequest
{
    
    public UpdateUserSettingsSystemUserRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UserId");
    private static final javax.xml.namespace.QName SETTINGS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Settings");
    
    
    /**
     * Gets the "UserId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserId" element
     */
    public com.microsoft.wsdl.types.Guid xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "UserId" element
     */
    public void xsetUserId(com.microsoft.wsdl.types.Guid userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(USERID$0);
            }
            target.set(userId);
        }
    }
    
    /**
     * Gets the "Settings" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(SETTINGS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Settings" element
     */
    public void setSettings(com.microsoft.schemas.crm._2006.webservices.BusinessEntity settings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(SETTINGS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(SETTINGS$2);
            }
            target.set(settings);
        }
    }
    
    /**
     * Appends and returns a new empty "Settings" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(SETTINGS$2);
            return target;
        }
    }
}

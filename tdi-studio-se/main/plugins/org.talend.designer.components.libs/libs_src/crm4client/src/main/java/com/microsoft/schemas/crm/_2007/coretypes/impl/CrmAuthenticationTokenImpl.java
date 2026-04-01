/*
 * XML Type:  CrmAuthenticationToken
 * Namespace: http://schemas.microsoft.com/crm/2007/CoreTypes
 * Java type: com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.coretypes.impl;
/**
 * An XML CrmAuthenticationToken(@http://schemas.microsoft.com/crm/2007/CoreTypes).
 *
 * This is a complex type.
 */
public class CrmAuthenticationTokenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.coretypes.CrmAuthenticationToken
{
    
    public CrmAuthenticationTokenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "AuthenticationType");
    private static final javax.xml.namespace.QName CRMTICKET$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "CrmTicket");
    private static final javax.xml.namespace.QName ORGANIZATIONNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "OrganizationName");
    private static final javax.xml.namespace.QName CALLERID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/CoreTypes", "CallerId");
    
    
    /**
     * Gets the "AuthenticationType" element
     */
    public int getAuthenticationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONTYPE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AuthenticationType" element
     */
    public org.apache.xmlbeans.XmlInt xgetAuthenticationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AUTHENTICATIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AuthenticationType" element
     */
    public void setAuthenticationType(int authenticationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATIONTYPE$0);
            }
            target.setIntValue(authenticationType);
        }
    }
    
    /**
     * Sets (as xml) the "AuthenticationType" element
     */
    public void xsetAuthenticationType(org.apache.xmlbeans.XmlInt authenticationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(AUTHENTICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(AUTHENTICATIONTYPE$0);
            }
            target.set(authenticationType);
        }
    }
    
    /**
     * Gets the "CrmTicket" element
     */
    public java.lang.String getCrmTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRMTICKET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CrmTicket" element
     */
    public org.apache.xmlbeans.XmlString xgetCrmTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRMTICKET$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CrmTicket" element
     */
    public boolean isSetCrmTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRMTICKET$2) != 0;
        }
    }
    
    /**
     * Sets the "CrmTicket" element
     */
    public void setCrmTicket(java.lang.String crmTicket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CRMTICKET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CRMTICKET$2);
            }
            target.setStringValue(crmTicket);
        }
    }
    
    /**
     * Sets (as xml) the "CrmTicket" element
     */
    public void xsetCrmTicket(org.apache.xmlbeans.XmlString crmTicket)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CRMTICKET$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CRMTICKET$2);
            }
            target.set(crmTicket);
        }
    }
    
    /**
     * Unsets the "CrmTicket" element
     */
    public void unsetCrmTicket()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRMTICKET$2, 0);
        }
    }
    
    /**
     * Gets the "OrganizationName" element
     */
    public java.lang.String getOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "OrganizationName" element
     */
    public boolean isSetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "OrganizationName" element
     */
    public void setOrganizationName(java.lang.String organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONNAME$4);
            }
            target.setStringValue(organizationName);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    public void xsetOrganizationName(org.apache.xmlbeans.XmlString organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATIONNAME$4);
            }
            target.set(organizationName);
        }
    }
    
    /**
     * Unsets the "OrganizationName" element
     */
    public void unsetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONNAME$4, 0);
        }
    }
    
    /**
     * Gets the "CallerId" element
     */
    public java.lang.String getCallerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallerId" element
     */
    public com.microsoft.wsdl.types.Guid xgetCallerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALLERID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CallerId" element
     */
    public void setCallerId(java.lang.String callerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLERID$6);
            }
            target.setStringValue(callerId);
        }
    }
    
    /**
     * Sets (as xml) the "CallerId" element
     */
    public void xsetCallerId(com.microsoft.wsdl.types.Guid callerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CALLERID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CALLERID$6);
            }
            target.set(callerId);
        }
    }
}

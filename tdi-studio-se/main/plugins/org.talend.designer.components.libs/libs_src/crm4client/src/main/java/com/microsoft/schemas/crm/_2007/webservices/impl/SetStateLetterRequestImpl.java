/*
 * XML Type:  SetStateLetterRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateLetterRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateLetterRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateLetterRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateLetterRequest
{
    
    public SetStateLetterRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName LETTERSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LetterState");
    private static final javax.xml.namespace.QName LETTERSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "LetterStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "LetterState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LetterState.Enum getLetterState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTERSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.LetterState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LetterState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LetterState xgetLetterState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LetterState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LetterState)get_store().find_element_user(LETTERSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LetterState" element
     */
    public void setLetterState(com.microsoft.schemas.crm._2007.webservices.LetterState.Enum letterState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTERSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETTERSTATE$2);
            }
            target.setEnumValue(letterState);
        }
    }
    
    /**
     * Sets (as xml) the "LetterState" element
     */
    public void xsetLetterState(com.microsoft.schemas.crm._2007.webservices.LetterState letterState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LetterState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LetterState)get_store().find_element_user(LETTERSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.LetterState)get_store().add_element_user(LETTERSTATE$2);
            }
            target.set(letterState);
        }
    }
    
    /**
     * Gets the "LetterStatus" element
     */
    public int getLetterStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTERSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LetterStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetLetterStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LETTERSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LetterStatus" element
     */
    public void setLetterStatus(int letterStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LETTERSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LETTERSTATUS$4);
            }
            target.setIntValue(letterStatus);
        }
    }
    
    /**
     * Sets (as xml) the "LetterStatus" element
     */
    public void xsetLetterStatus(org.apache.xmlbeans.XmlInt letterStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LETTERSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LETTERSTATUS$4);
            }
            target.set(letterStatus);
        }
    }
}

/*
 * XML Type:  SetStateKbArticleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateKbArticleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateKbArticleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateKbArticleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateKbArticleRequest
{
    
    public SetStateKbArticleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName KBARTICLESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "KbArticleState");
    private static final javax.xml.namespace.QName KBARTICLESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "KbArticleStatus");
    
    
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
     * Gets the "KbArticleState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.KbArticleState.Enum getKbArticleState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBARTICLESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.KbArticleState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "KbArticleState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.KbArticleState xgetKbArticleState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.KbArticleState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.KbArticleState)get_store().find_element_user(KBARTICLESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KbArticleState" element
     */
    public void setKbArticleState(com.microsoft.schemas.crm._2007.webservices.KbArticleState.Enum kbArticleState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBARTICLESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KBARTICLESTATE$2);
            }
            target.setEnumValue(kbArticleState);
        }
    }
    
    /**
     * Sets (as xml) the "KbArticleState" element
     */
    public void xsetKbArticleState(com.microsoft.schemas.crm._2007.webservices.KbArticleState kbArticleState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.KbArticleState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.KbArticleState)get_store().find_element_user(KBARTICLESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.KbArticleState)get_store().add_element_user(KBARTICLESTATE$2);
            }
            target.set(kbArticleState);
        }
    }
    
    /**
     * Gets the "KbArticleStatus" element
     */
    public int getKbArticleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBARTICLESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "KbArticleStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetKbArticleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(KBARTICLESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "KbArticleStatus" element
     */
    public void setKbArticleStatus(int kbArticleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KBARTICLESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KBARTICLESTATUS$4);
            }
            target.setIntValue(kbArticleStatus);
        }
    }
    
    /**
     * Sets (as xml) the "KbArticleStatus" element
     */
    public void xsetKbArticleStatus(org.apache.xmlbeans.XmlInt kbArticleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(KBARTICLESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(KBARTICLESTATUS$4);
            }
            target.set(kbArticleStatus);
        }
    }
}

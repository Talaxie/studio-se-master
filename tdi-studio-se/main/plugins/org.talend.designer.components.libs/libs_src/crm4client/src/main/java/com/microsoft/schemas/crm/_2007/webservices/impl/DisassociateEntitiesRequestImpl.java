/*
 * XML Type:  DisassociateEntitiesRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.DisassociateEntitiesRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML DisassociateEntitiesRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class DisassociateEntitiesRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.DisassociateEntitiesRequest
{
    
    public DisassociateEntitiesRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONIKER1$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Moniker1");
    private static final javax.xml.namespace.QName MONIKER2$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Moniker2");
    private static final javax.xml.namespace.QName RELATIONSHIPNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RelationshipName");
    
    
    /**
     * Gets the "Moniker1" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker getMoniker1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(MONIKER1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Moniker1" element
     */
    public void setMoniker1(com.microsoft.schemas.crm._2006.coretypes.Moniker moniker1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(MONIKER1$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(MONIKER1$0);
            }
            target.set(moniker1);
        }
    }
    
    /**
     * Appends and returns a new empty "Moniker1" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker addNewMoniker1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(MONIKER1$0);
            return target;
        }
    }
    
    /**
     * Gets the "Moniker2" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker getMoniker2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(MONIKER2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Moniker2" element
     */
    public void setMoniker2(com.microsoft.schemas.crm._2006.coretypes.Moniker moniker2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(MONIKER2$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(MONIKER2$2);
            }
            target.set(moniker2);
        }
    }
    
    /**
     * Appends and returns a new empty "Moniker2" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker addNewMoniker2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(MONIKER2$2);
            return target;
        }
    }
    
    /**
     * Gets the "RelationshipName" element
     */
    public java.lang.String getRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipName" element
     */
    public org.apache.xmlbeans.XmlString xgetRelationshipName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipName" element
     */
    public void setRelationshipName(java.lang.String relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPNAME$4);
            }
            target.setStringValue(relationshipName);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipName" element
     */
    public void xsetRelationshipName(org.apache.xmlbeans.XmlString relationshipName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATIONSHIPNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATIONSHIPNAME$4);
            }
            target.set(relationshipName);
        }
    }
}

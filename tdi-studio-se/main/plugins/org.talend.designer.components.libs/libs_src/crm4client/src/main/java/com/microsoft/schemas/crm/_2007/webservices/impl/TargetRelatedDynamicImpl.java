/*
 * XML Type:  TargetRelatedDynamic
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetRelatedDynamic
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetRelatedDynamic(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetRelatedDynamicImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetRelatedImpl implements com.microsoft.schemas.crm._2007.webservices.TargetRelatedDynamic
{
    
    public TargetRelatedDynamicImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITY1NAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity1Name");
    private static final javax.xml.namespace.QName ENTITY1ID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity1Id");
    private static final javax.xml.namespace.QName ENTITY2NAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity2Name");
    private static final javax.xml.namespace.QName ENTITY2ID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Entity2Id");
    
    
    /**
     * Gets the "Entity1Name" element
     */
    public java.lang.String getEntity1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity1Name" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity1Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Entity1Name" element
     */
    public void setEntity1Name(java.lang.String entity1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY1NAME$0);
            }
            target.setStringValue(entity1Name);
        }
    }
    
    /**
     * Sets (as xml) the "Entity1Name" element
     */
    public void xsetEntity1Name(org.apache.xmlbeans.XmlString entity1Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY1NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY1NAME$0);
            }
            target.set(entity1Name);
        }
    }
    
    /**
     * Gets the "Entity1Id" element
     */
    public java.lang.String getEntity1Id()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity1Id" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntity1Id()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITY1ID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Entity1Id" element
     */
    public void setEntity1Id(java.lang.String entity1Id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY1ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY1ID$2);
            }
            target.setStringValue(entity1Id);
        }
    }
    
    /**
     * Sets (as xml) the "Entity1Id" element
     */
    public void xsetEntity1Id(com.microsoft.wsdl.types.Guid entity1Id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITY1ID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITY1ID$2);
            }
            target.set(entity1Id);
        }
    }
    
    /**
     * Gets the "Entity2Name" element
     */
    public java.lang.String getEntity2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity2Name" element
     */
    public org.apache.xmlbeans.XmlString xgetEntity2Name()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Entity2Name" element
     */
    public void setEntity2Name(java.lang.String entity2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY2NAME$4);
            }
            target.setStringValue(entity2Name);
        }
    }
    
    /**
     * Sets (as xml) the "Entity2Name" element
     */
    public void xsetEntity2Name(org.apache.xmlbeans.XmlString entity2Name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITY2NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITY2NAME$4);
            }
            target.set(entity2Name);
        }
    }
    
    /**
     * Gets the "Entity2Id" element
     */
    public java.lang.String getEntity2Id()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2ID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Entity2Id" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntity2Id()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITY2ID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Entity2Id" element
     */
    public void setEntity2Id(java.lang.String entity2Id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITY2ID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITY2ID$6);
            }
            target.setStringValue(entity2Id);
        }
    }
    
    /**
     * Sets (as xml) the "Entity2Id" element
     */
    public void xsetEntity2Id(com.microsoft.wsdl.types.Guid entity2Id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITY2ID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITY2ID$6);
            }
            target.set(entity2Id);
        }
    }
}

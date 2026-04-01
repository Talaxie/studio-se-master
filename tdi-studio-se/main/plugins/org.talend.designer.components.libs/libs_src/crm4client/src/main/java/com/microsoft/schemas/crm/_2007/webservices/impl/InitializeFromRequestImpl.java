/*
 * XML Type:  InitializeFromRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.InitializeFromRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML InitializeFromRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class InitializeFromRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.InitializeFromRequest
{
    
    public InitializeFromRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMONIKER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityMoniker");
    private static final javax.xml.namespace.QName TARGETENTITYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TargetEntityName");
    private static final javax.xml.namespace.QName TARGETFIELDTYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TargetFieldType");
    private static final javax.xml.namespace.QName RETURNDYNAMICENTITIES$6 = 
        new javax.xml.namespace.QName("", "ReturnDynamicEntities");
    
    
    /**
     * Gets the "EntityMoniker" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker getEntityMoniker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(ENTITYMONIKER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EntityMoniker" element
     */
    public void setEntityMoniker(com.microsoft.schemas.crm._2006.coretypes.Moniker entityMoniker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().find_element_user(ENTITYMONIKER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(ENTITYMONIKER$0);
            }
            target.set(entityMoniker);
        }
    }
    
    /**
     * Appends and returns a new empty "EntityMoniker" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.Moniker addNewEntityMoniker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.Moniker target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.Moniker)get_store().add_element_user(ENTITYMONIKER$0);
            return target;
        }
    }
    
    /**
     * Gets the "TargetEntityName" element
     */
    public java.lang.String getTargetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetEntityName" element
     */
    public void setTargetEntityName(java.lang.String targetEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETENTITYNAME$2);
            }
            target.setStringValue(targetEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "TargetEntityName" element
     */
    public void xsetTargetEntityName(org.apache.xmlbeans.XmlString targetEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENTITYNAME$2);
            }
            target.set(targetEntityName);
        }
    }
    
    /**
     * Gets the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum getTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TargetFieldType" element
     */
    public com.microsoft.schemas.crm._2006.webservices.TargetFieldType xgetTargetFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TargetFieldType" element
     */
    public void setTargetFieldType(com.microsoft.schemas.crm._2006.webservices.TargetFieldType.Enum targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETFIELDTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETFIELDTYPE$4);
            }
            target.setEnumValue(targetFieldType);
        }
    }
    
    /**
     * Sets (as xml) the "TargetFieldType" element
     */
    public void xsetTargetFieldType(com.microsoft.schemas.crm._2006.webservices.TargetFieldType targetFieldType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.TargetFieldType target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().find_element_user(TARGETFIELDTYPE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.TargetFieldType)get_store().add_element_user(TARGETFIELDTYPE$4);
            }
            target.set(targetFieldType);
        }
    }
    
    /**
     * Gets the "ReturnDynamicEntities" attribute
     */
    public boolean getReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReturnDynamicEntities" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnDynamicEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            return target;
        }
    }
    
    /**
     * Sets the "ReturnDynamicEntities" attribute
     */
    public void setReturnDynamicEntities(boolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNDYNAMICENTITIES$6);
            }
            target.setBooleanValue(returnDynamicEntities);
        }
    }
    
    /**
     * Sets (as xml) the "ReturnDynamicEntities" attribute
     */
    public void xsetReturnDynamicEntities(org.apache.xmlbeans.XmlBoolean returnDynamicEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNDYNAMICENTITIES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNDYNAMICENTITIES$6);
            }
            target.set(returnDynamicEntities);
        }
    }
}

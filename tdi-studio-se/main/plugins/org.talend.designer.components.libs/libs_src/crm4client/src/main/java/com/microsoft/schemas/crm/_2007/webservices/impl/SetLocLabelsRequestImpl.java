/*
 * XML Type:  SetLocLabelsRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetLocLabelsRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetLocLabelsRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetLocLabelsRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetLocLabelsRequest
{
    
    public SetLocLabelsRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMONIKER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityMoniker");
    private static final javax.xml.namespace.QName ATTRIBUTENAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "AttributeName");
    private static final javax.xml.namespace.QName LABELS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Labels");
    
    
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
     * Gets the "AttributeName" element
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttributeName" element
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTENAME$2);
            }
            target.setStringValue(attributeName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeName" element
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$2);
            }
            target.set(attributeName);
        }
    }
    
    /**
     * Gets the "Labels" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel getLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(LABELS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Labels" element
     */
    public void setLabels(com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel labels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().find_element_user(LABELS$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(LABELS$4);
            }
            target.set(labels);
        }
    }
    
    /**
     * Appends and returns a new empty "Labels" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel addNewLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfLocLabel)get_store().add_element_user(LABELS$4);
            return target;
        }
    }
}

/*
 * XML Type:  MergeRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.MergeRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML MergeRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class MergeRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.MergeRequest
{
    
    public MergeRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName SUBORDINATEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SubordinateId");
    private static final javax.xml.namespace.QName UPDATECONTENT$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "UpdateContent");
    private static final javax.xml.namespace.QName PERFORMPARENTINGCHECKS$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PerformParentingChecks");
    
    
    /**
     * Gets the "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetMerge getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetMerge target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetMerge)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(com.microsoft.schemas.crm._2007.webservices.TargetMerge targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetMerge target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetMerge)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TargetMerge)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetMerge addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetMerge target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetMerge)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
    
    /**
     * Gets the "SubordinateId" element
     */
    public java.lang.String getSubordinateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBORDINATEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubordinateId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSubordinateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBORDINATEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SubordinateId" element
     */
    public void setSubordinateId(java.lang.String subordinateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBORDINATEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBORDINATEID$2);
            }
            target.setStringValue(subordinateId);
        }
    }
    
    /**
     * Sets (as xml) the "SubordinateId" element
     */
    public void xsetSubordinateId(com.microsoft.wsdl.types.Guid subordinateId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SUBORDINATEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SUBORDINATEID$2);
            }
            target.set(subordinateId);
        }
    }
    
    /**
     * Gets the "UpdateContent" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getUpdateContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(UPDATECONTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateContent" element
     */
    public void setUpdateContent(com.microsoft.schemas.crm._2006.webservices.BusinessEntity updateContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(UPDATECONTENT$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(UPDATECONTENT$4);
            }
            target.set(updateContent);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateContent" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewUpdateContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(UPDATECONTENT$4);
            return target;
        }
    }
    
    /**
     * Gets the "PerformParentingChecks" element
     */
    public boolean getPerformParentingChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERFORMPARENTINGCHECKS$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "PerformParentingChecks" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPerformParentingChecks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERFORMPARENTINGCHECKS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PerformParentingChecks" element
     */
    public void setPerformParentingChecks(boolean performParentingChecks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERFORMPARENTINGCHECKS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERFORMPARENTINGCHECKS$6);
            }
            target.setBooleanValue(performParentingChecks);
        }
    }
    
    /**
     * Sets (as xml) the "PerformParentingChecks" element
     */
    public void xsetPerformParentingChecks(org.apache.xmlbeans.XmlBoolean performParentingChecks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERFORMPARENTINGCHECKS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PERFORMPARENTINGCHECKS$6);
            }
            target.set(performParentingChecks);
        }
    }
}

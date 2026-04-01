/*
 * XML Type:  workflowdependency
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Workflowdependency
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML workflowdependency(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class WorkflowdependencyImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Workflowdependency
{
    
    public WorkflowdependencyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDBY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customentityname");
    private static final javax.xml.namespace.QName DEPENDENTATTRIBUTENAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dependentattributename");
    private static final javax.xml.namespace.QName DEPENDENTENTITYNAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "dependententityname");
    private static final javax.xml.namespace.QName ENTITYATTRIBUTES$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entityattributes");
    private static final javax.xml.namespace.QName MODIFIEDBY$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName PARAMETERNAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parametername");
    private static final javax.xml.namespace.QName PARAMETERTYPE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parametertype");
    private static final javax.xml.namespace.QName RELATEDATTRIBUTENAME$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "relatedattributename");
    private static final javax.xml.namespace.QName RELATEDENTITYNAME$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "relatedentityname");
    private static final javax.xml.namespace.QName SDKMESSAGEID$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageid");
    private static final javax.xml.namespace.QName TYPE$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "type");
    private static final javax.xml.namespace.QName WORKFLOWDEPENDENCYID$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "workflowdependencyid");
    private static final javax.xml.namespace.QName WORKFLOWID$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "workflowid");
    
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$0) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$0, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$2) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$2, 0);
        }
    }
    
    /**
     * Gets the "customentityname" element
     */
    public java.lang.String getCustomentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMENTITYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "customentityname" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "customentityname" element
     */
    public boolean isSetCustomentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMENTITYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "customentityname" element
     */
    public void setCustomentityname(java.lang.String customentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMENTITYNAME$4);
            }
            target.setStringValue(customentityname);
        }
    }
    
    /**
     * Sets (as xml) the "customentityname" element
     */
    public void xsetCustomentityname(org.apache.xmlbeans.XmlString customentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMENTITYNAME$4);
            }
            target.set(customentityname);
        }
    }
    
    /**
     * Unsets the "customentityname" element
     */
    public void unsetCustomentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMENTITYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "dependentattributename" element
     */
    public java.lang.String getDependentattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDENTATTRIBUTENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dependentattributename" element
     */
    public org.apache.xmlbeans.XmlString xgetDependentattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPENDENTATTRIBUTENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "dependentattributename" element
     */
    public boolean isSetDependentattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENTATTRIBUTENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "dependentattributename" element
     */
    public void setDependentattributename(java.lang.String dependentattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDENTATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENDENTATTRIBUTENAME$6);
            }
            target.setStringValue(dependentattributename);
        }
    }
    
    /**
     * Sets (as xml) the "dependentattributename" element
     */
    public void xsetDependentattributename(org.apache.xmlbeans.XmlString dependentattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPENDENTATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPENDENTATTRIBUTENAME$6);
            }
            target.set(dependentattributename);
        }
    }
    
    /**
     * Unsets the "dependentattributename" element
     */
    public void unsetDependentattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENTATTRIBUTENAME$6, 0);
        }
    }
    
    /**
     * Gets the "dependententityname" element
     */
    public java.lang.String getDependententityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDENTENTITYNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dependententityname" element
     */
    public org.apache.xmlbeans.XmlString xgetDependententityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPENDENTENTITYNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "dependententityname" element
     */
    public boolean isSetDependententityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDENTENTITYNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "dependententityname" element
     */
    public void setDependententityname(java.lang.String dependententityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPENDENTENTITYNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPENDENTENTITYNAME$8);
            }
            target.setStringValue(dependententityname);
        }
    }
    
    /**
     * Sets (as xml) the "dependententityname" element
     */
    public void xsetDependententityname(org.apache.xmlbeans.XmlString dependententityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPENDENTENTITYNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPENDENTENTITYNAME$8);
            }
            target.set(dependententityname);
        }
    }
    
    /**
     * Unsets the "dependententityname" element
     */
    public void unsetDependententityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDENTENTITYNAME$8, 0);
        }
    }
    
    /**
     * Gets the "entityattributes" element
     */
    public java.lang.String getEntityattributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYATTRIBUTES$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityattributes" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityattributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYATTRIBUTES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "entityattributes" element
     */
    public boolean isSetEntityattributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYATTRIBUTES$10) != 0;
        }
    }
    
    /**
     * Sets the "entityattributes" element
     */
    public void setEntityattributes(java.lang.String entityattributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYATTRIBUTES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYATTRIBUTES$10);
            }
            target.setStringValue(entityattributes);
        }
    }
    
    /**
     * Sets (as xml) the "entityattributes" element
     */
    public void xsetEntityattributes(org.apache.xmlbeans.XmlString entityattributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYATTRIBUTES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYATTRIBUTES$10);
            }
            target.set(entityattributes);
        }
    }
    
    /**
     * Unsets the "entityattributes" element
     */
    public void unsetEntityattributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYATTRIBUTES$10, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$12) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$12);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$12, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$14) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$14);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$14);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$14, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$16) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$16);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$16, 0);
        }
    }
    
    /**
     * Gets the "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owninguser" element
     */
    public boolean isSetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGUSER$18) != 0;
        }
    }
    
    /**
     * Sets the "owninguser" element
     */
    public void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$18);
            }
            target.set(owninguser);
        }
    }
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$18);
            return target;
        }
    }
    
    /**
     * Unsets the "owninguser" element
     */
    public void unsetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGUSER$18, 0);
        }
    }
    
    /**
     * Gets the "parametername" element
     */
    public java.lang.String getParametername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parametername" element
     */
    public org.apache.xmlbeans.XmlString xgetParametername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "parametername" element
     */
    public boolean isSetParametername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERNAME$20) != 0;
        }
    }
    
    /**
     * Sets the "parametername" element
     */
    public void setParametername(java.lang.String parametername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERNAME$20);
            }
            target.setStringValue(parametername);
        }
    }
    
    /**
     * Sets (as xml) the "parametername" element
     */
    public void xsetParametername(org.apache.xmlbeans.XmlString parametername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERNAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERNAME$20);
            }
            target.set(parametername);
        }
    }
    
    /**
     * Unsets the "parametername" element
     */
    public void unsetParametername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERNAME$20, 0);
        }
    }
    
    /**
     * Gets the "parametertype" element
     */
    public java.lang.String getParametertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERTYPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parametertype" element
     */
    public org.apache.xmlbeans.XmlString xgetParametertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERTYPE$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "parametertype" element
     */
    public boolean isSetParametertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERTYPE$22) != 0;
        }
    }
    
    /**
     * Sets the "parametertype" element
     */
    public void setParametertype(java.lang.String parametertype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERTYPE$22);
            }
            target.setStringValue(parametertype);
        }
    }
    
    /**
     * Sets (as xml) the "parametertype" element
     */
    public void xsetParametertype(org.apache.xmlbeans.XmlString parametertype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERTYPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERTYPE$22);
            }
            target.set(parametertype);
        }
    }
    
    /**
     * Unsets the "parametertype" element
     */
    public void unsetParametertype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERTYPE$22, 0);
        }
    }
    
    /**
     * Gets the "relatedattributename" element
     */
    public java.lang.String getRelatedattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDATTRIBUTENAME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedattributename" element
     */
    public org.apache.xmlbeans.XmlString xgetRelatedattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDATTRIBUTENAME$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "relatedattributename" element
     */
    public boolean isSetRelatedattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDATTRIBUTENAME$24) != 0;
        }
    }
    
    /**
     * Sets the "relatedattributename" element
     */
    public void setRelatedattributename(java.lang.String relatedattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDATTRIBUTENAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDATTRIBUTENAME$24);
            }
            target.setStringValue(relatedattributename);
        }
    }
    
    /**
     * Sets (as xml) the "relatedattributename" element
     */
    public void xsetRelatedattributename(org.apache.xmlbeans.XmlString relatedattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDATTRIBUTENAME$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDATTRIBUTENAME$24);
            }
            target.set(relatedattributename);
        }
    }
    
    /**
     * Unsets the "relatedattributename" element
     */
    public void unsetRelatedattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDATTRIBUTENAME$24, 0);
        }
    }
    
    /**
     * Gets the "relatedentityname" element
     */
    public java.lang.String getRelatedentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDENTITYNAME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedentityname" element
     */
    public org.apache.xmlbeans.XmlString xgetRelatedentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDENTITYNAME$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "relatedentityname" element
     */
    public boolean isSetRelatedentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDENTITYNAME$26) != 0;
        }
    }
    
    /**
     * Sets the "relatedentityname" element
     */
    public void setRelatedentityname(java.lang.String relatedentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDENTITYNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDENTITYNAME$26);
            }
            target.setStringValue(relatedentityname);
        }
    }
    
    /**
     * Sets (as xml) the "relatedentityname" element
     */
    public void xsetRelatedentityname(org.apache.xmlbeans.XmlString relatedentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDENTITYNAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDENTITYNAME$26);
            }
            target.set(relatedentityname);
        }
    }
    
    /**
     * Unsets the "relatedentityname" element
     */
    public void unsetRelatedentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDENTITYNAME$26, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSdkmessageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SDKMESSAGEID$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageid" element
     */
    public boolean isSetSdkmessageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEID$28) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageid" element
     */
    public void setSdkmessageid(com.microsoft.schemas.crm._2006.webservices.Lookup sdkmessageid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SDKMESSAGEID$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SDKMESSAGEID$28);
            }
            target.set(sdkmessageid);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSdkmessageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SDKMESSAGEID$28);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageid" element
     */
    public void unsetSdkmessageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEID$28, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TYPE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$30) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(com.microsoft.schemas.crm._2006.webservices.Picklist type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(TYPE$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TYPE$30);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(TYPE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$30, 0);
        }
    }
    
    /**
     * Gets the "workflowdependencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getWorkflowdependencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(WORKFLOWDEPENDENCYID$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workflowdependencyid" element
     */
    public boolean isSetWorkflowdependencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWDEPENDENCYID$32) != 0;
        }
    }
    
    /**
     * Sets the "workflowdependencyid" element
     */
    public void setWorkflowdependencyid(com.microsoft.schemas.crm._2006.webservices.Key workflowdependencyid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(WORKFLOWDEPENDENCYID$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(WORKFLOWDEPENDENCYID$32);
            }
            target.set(workflowdependencyid);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowdependencyid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewWorkflowdependencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(WORKFLOWDEPENDENCYID$32);
            return target;
        }
    }
    
    /**
     * Unsets the "workflowdependencyid" element
     */
    public void unsetWorkflowdependencyid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWDEPENDENCYID$32, 0);
        }
    }
    
    /**
     * Gets the "workflowid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getWorkflowid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(WORKFLOWID$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workflowid" element
     */
    public boolean isSetWorkflowid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWID$34) != 0;
        }
    }
    
    /**
     * Sets the "workflowid" element
     */
    public void setWorkflowid(com.microsoft.schemas.crm._2006.webservices.Lookup workflowid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(WORKFLOWID$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(WORKFLOWID$34);
            }
            target.set(workflowid);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewWorkflowid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(WORKFLOWID$34);
            return target;
        }
    }
    
    /**
     * Unsets the "workflowid" element
     */
    public void unsetWorkflowid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWID$34, 0);
        }
    }
}

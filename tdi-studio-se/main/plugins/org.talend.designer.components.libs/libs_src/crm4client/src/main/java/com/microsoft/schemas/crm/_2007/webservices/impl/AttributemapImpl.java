/*
 * XML Type:  attributemap
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Attributemap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML attributemap(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class AttributemapImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Attributemap
{
    
    public AttributemapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEMAPID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "attributemapid");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName ENTITYMAPID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entitymapid");
    private static final javax.xml.namespace.QName ISSYSTEM$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "issystem");
    private static final javax.xml.namespace.QName MODIFIEDBY$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName ORGANIZATIONID$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName PARENTATTRIBUTEMAPID$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentattributemapid");
    private static final javax.xml.namespace.QName SOURCEATTRIBUTENAME$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sourceattributename");
    private static final javax.xml.namespace.QName TARGETATTRIBUTENAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetattributename");
    
    
    /**
     * Gets the "attributemapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getAttributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ATTRIBUTEMAPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attributemapid" element
     */
    public boolean isSetAttributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEMAPID$0) != 0;
        }
    }
    
    /**
     * Sets the "attributemapid" element
     */
    public void setAttributemapid(com.microsoft.schemas.crm._2006.webservices.Key attributemapid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(ATTRIBUTEMAPID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ATTRIBUTEMAPID$0);
            }
            target.set(attributemapid);
        }
    }
    
    /**
     * Appends and returns a new empty "attributemapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewAttributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(ATTRIBUTEMAPID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "attributemapid" element
     */
    public void unsetAttributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEMAPID$0, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
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
            return get_store().count_elements(CREATEDBY$2) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$2);
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
            get_store().remove_element(CREATEDBY$2, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
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
            return get_store().count_elements(CREATEDON$4) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$4);
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
            get_store().remove_element(CREATEDON$4, 0);
        }
    }
    
    /**
     * Gets the "entitymapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getEntitymapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ENTITYMAPID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "entitymapid" element
     */
    public boolean isSetEntitymapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYMAPID$6) != 0;
        }
    }
    
    /**
     * Sets the "entitymapid" element
     */
    public void setEntitymapid(com.microsoft.schemas.crm._2006.webservices.Lookup entitymapid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ENTITYMAPID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ENTITYMAPID$6);
            }
            target.set(entitymapid);
        }
    }
    
    /**
     * Appends and returns a new empty "entitymapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewEntitymapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ENTITYMAPID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "entitymapid" element
     */
    public void unsetEntitymapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYMAPID$6, 0);
        }
    }
    
    /**
     * Gets the "issystem" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIssystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSYSTEM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "issystem" element
     */
    public boolean isSetIssystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSYSTEM$8) != 0;
        }
    }
    
    /**
     * Sets the "issystem" element
     */
    public void setIssystem(com.microsoft.schemas.crm._2006.webservices.CrmBoolean issystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSYSTEM$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSYSTEM$8);
            }
            target.set(issystem);
        }
    }
    
    /**
     * Appends and returns a new empty "issystem" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIssystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSYSTEM$8);
            return target;
        }
    }
    
    /**
     * Unsets the "issystem" element
     */
    public void unsetIssystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSYSTEM$8, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$10, 0);
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
            return get_store().count_elements(MODIFIEDBY$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$10);
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
            get_store().remove_element(MODIFIEDBY$10, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$12, 0);
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
            return get_store().count_elements(MODIFIEDON$12) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$12);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$12);
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
            get_store().remove_element(MODIFIEDON$12, 0);
        }
    }
    
    /**
     * Gets the "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizationid" element
     */
    public boolean isSetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONID$14) != 0;
        }
    }
    
    /**
     * Sets the "organizationid" element
     */
    public void setOrganizationid(com.microsoft.schemas.crm._2006.webservices.Lookup organizationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$14);
            }
            target.set(organizationid);
        }
    }
    
    /**
     * Appends and returns a new empty "organizationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "organizationid" element
     */
    public void unsetOrganizationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONID$14, 0);
        }
    }
    
    /**
     * Gets the "parentattributemapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getParentattributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTATTRIBUTEMAPID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentattributemapid" element
     */
    public boolean isSetParentattributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTATTRIBUTEMAPID$16) != 0;
        }
    }
    
    /**
     * Sets the "parentattributemapid" element
     */
    public void setParentattributemapid(com.microsoft.schemas.crm._2006.webservices.Lookup parentattributemapid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTATTRIBUTEMAPID$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTATTRIBUTEMAPID$16);
            }
            target.set(parentattributemapid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentattributemapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentattributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTATTRIBUTEMAPID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "parentattributemapid" element
     */
    public void unsetParentattributemapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTATTRIBUTEMAPID$16, 0);
        }
    }
    
    /**
     * Gets the "sourceattributename" element
     */
    public java.lang.String getSourceattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEATTRIBUTENAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceattributename" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEATTRIBUTENAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceattributename" element
     */
    public boolean isSetSourceattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEATTRIBUTENAME$18) != 0;
        }
    }
    
    /**
     * Sets the "sourceattributename" element
     */
    public void setSourceattributename(java.lang.String sourceattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEATTRIBUTENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEATTRIBUTENAME$18);
            }
            target.setStringValue(sourceattributename);
        }
    }
    
    /**
     * Sets (as xml) the "sourceattributename" element
     */
    public void xsetSourceattributename(org.apache.xmlbeans.XmlString sourceattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEATTRIBUTENAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEATTRIBUTENAME$18);
            }
            target.set(sourceattributename);
        }
    }
    
    /**
     * Unsets the "sourceattributename" element
     */
    public void unsetSourceattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEATTRIBUTENAME$18, 0);
        }
    }
    
    /**
     * Gets the "targetattributename" element
     */
    public java.lang.String getTargetattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETATTRIBUTENAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetattributename" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETATTRIBUTENAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetattributename" element
     */
    public boolean isSetTargetattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETATTRIBUTENAME$20) != 0;
        }
    }
    
    /**
     * Sets the "targetattributename" element
     */
    public void setTargetattributename(java.lang.String targetattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETATTRIBUTENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETATTRIBUTENAME$20);
            }
            target.setStringValue(targetattributename);
        }
    }
    
    /**
     * Sets (as xml) the "targetattributename" element
     */
    public void xsetTargetattributename(org.apache.xmlbeans.XmlString targetattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETATTRIBUTENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETATTRIBUTENAME$20);
            }
            target.set(targetattributename);
        }
    }
    
    /**
     * Unsets the "targetattributename" element
     */
    public void unsetTargetattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETATTRIBUTENAME$20, 0);
        }
    }
}

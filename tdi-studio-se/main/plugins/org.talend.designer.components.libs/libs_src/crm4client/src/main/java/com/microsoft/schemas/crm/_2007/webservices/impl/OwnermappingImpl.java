/*
 * XML Type:  ownermapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Ownermapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ownermapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class OwnermappingImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Ownermapping
{
    
    public OwnermappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDBY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName IMPORTMAPID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importmapid");
    private static final javax.xml.namespace.QName MODIFIEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OWNERMAPPINGID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownermappingid");
    private static final javax.xml.namespace.QName PROCESSCODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processcode");
    private static final javax.xml.namespace.QName SOURCESYSTEMUSERNAME$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sourcesystemusername");
    private static final javax.xml.namespace.QName SOURCEUSERVALUEFORSOURCECRMUSERLINK$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sourceuservalueforsourcecrmuserlink");
    private static final javax.xml.namespace.QName STATECODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName TARGETSYSTEMUSERDOMAINNAME$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetsystemuserdomainname");
    private static final javax.xml.namespace.QName TARGETSYSTEMUSERID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetsystemuserid");
    private static final javax.xml.namespace.QName TARGETUSERVALUEFORSOURCECRMUSERLINK$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetuservalueforsourcecrmuserlink");
    
    
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
     * Gets the "importmapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getImportmapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTMAPID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "importmapid" element
     */
    public boolean isSetImportmapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTMAPID$4) != 0;
        }
    }
    
    /**
     * Sets the "importmapid" element
     */
    public void setImportmapid(com.microsoft.schemas.crm._2006.webservices.Lookup importmapid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTMAPID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTMAPID$4);
            }
            target.set(importmapid);
        }
    }
    
    /**
     * Appends and returns a new empty "importmapid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewImportmapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTMAPID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "importmapid" element
     */
    public void unsetImportmapid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTMAPID$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
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
            return get_store().count_elements(MODIFIEDBY$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$6);
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
            get_store().remove_element(MODIFIEDBY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
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
            return get_store().count_elements(MODIFIEDON$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$8);
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
            get_store().remove_element(MODIFIEDON$8, 0);
        }
    }
    
    /**
     * Gets the "ownermappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getOwnermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OWNERMAPPINGID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownermappingid" element
     */
    public boolean isSetOwnermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERMAPPINGID$10) != 0;
        }
    }
    
    /**
     * Sets the "ownermappingid" element
     */
    public void setOwnermappingid(com.microsoft.schemas.crm._2006.webservices.Key ownermappingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(OWNERMAPPINGID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OWNERMAPPINGID$10);
            }
            target.set(ownermappingid);
        }
    }
    
    /**
     * Appends and returns a new empty "ownermappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewOwnermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(OWNERMAPPINGID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ownermappingid" element
     */
    public void unsetOwnermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERMAPPINGID$10, 0);
        }
    }
    
    /**
     * Gets the "processcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processcode" element
     */
    public boolean isSetProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "processcode" element
     */
    public void setProcesscode(com.microsoft.schemas.crm._2006.webservices.Picklist processcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$12);
            }
            target.set(processcode);
        }
    }
    
    /**
     * Appends and returns a new empty "processcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "processcode" element
     */
    public void unsetProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSCODE$12, 0);
        }
    }
    
    /**
     * Gets the "sourcesystemusername" element
     */
    public java.lang.String getSourcesystemusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEMUSERNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourcesystemusername" element
     */
    public org.apache.xmlbeans.XmlString xgetSourcesystemusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEMUSERNAME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourcesystemusername" element
     */
    public boolean isSetSourcesystemusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCESYSTEMUSERNAME$14) != 0;
        }
    }
    
    /**
     * Sets the "sourcesystemusername" element
     */
    public void setSourcesystemusername(java.lang.String sourcesystemusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESYSTEMUSERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESYSTEMUSERNAME$14);
            }
            target.setStringValue(sourcesystemusername);
        }
    }
    
    /**
     * Sets (as xml) the "sourcesystemusername" element
     */
    public void xsetSourcesystemusername(org.apache.xmlbeans.XmlString sourcesystemusername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESYSTEMUSERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESYSTEMUSERNAME$14);
            }
            target.set(sourcesystemusername);
        }
    }
    
    /**
     * Unsets the "sourcesystemusername" element
     */
    public void unsetSourcesystemusername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCESYSTEMUSERNAME$14, 0);
        }
    }
    
    /**
     * Gets the "sourceuservalueforsourcecrmuserlink" element
     */
    public java.lang.String getSourceuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceuservalueforsourcecrmuserlink" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceuservalueforsourcecrmuserlink" element
     */
    public boolean isSetSourceuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16) != 0;
        }
    }
    
    /**
     * Sets the "sourceuservalueforsourcecrmuserlink" element
     */
    public void setSourceuservalueforsourcecrmuserlink(java.lang.String sourceuservalueforsourcecrmuserlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16);
            }
            target.setStringValue(sourceuservalueforsourcecrmuserlink);
        }
    }
    
    /**
     * Sets (as xml) the "sourceuservalueforsourcecrmuserlink" element
     */
    public void xsetSourceuservalueforsourcecrmuserlink(org.apache.xmlbeans.XmlString sourceuservalueforsourcecrmuserlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16);
            }
            target.set(sourceuservalueforsourcecrmuserlink);
        }
    }
    
    /**
     * Unsets the "sourceuservalueforsourcecrmuserlink" element
     */
    public void unsetSourceuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEUSERVALUEFORSOURCECRMUSERLINK$16, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo)get_store().find_element_user(STATECODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statecode" element
     */
    public boolean isSetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATECODE$18) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo)get_store().find_element_user(STATECODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo)get_store().add_element_user(STATECODE$18);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OwnerMappingStateInfo)get_store().add_element_user(STATECODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "statecode" element
     */
    public void unsetStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATECODE$18, 0);
        }
    }
    
    /**
     * Gets the "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status getStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "statuscode" element
     */
    public boolean isSetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$20) != 0;
        }
    }
    
    /**
     * Sets the "statuscode" element
     */
    public void setStatuscode(com.microsoft.schemas.crm._2006.webservices.Status statuscode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$20);
            }
            target.set(statuscode);
        }
    }
    
    /**
     * Appends and returns a new empty "statuscode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Status addNewStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Status target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "statuscode" element
     */
    public void unsetStatuscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$20, 0);
        }
    }
    
    /**
     * Gets the "targetsystemuserdomainname" element
     */
    public java.lang.String getTargetsystemuserdomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSYSTEMUSERDOMAINNAME$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetsystemuserdomainname" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetsystemuserdomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSYSTEMUSERDOMAINNAME$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetsystemuserdomainname" element
     */
    public boolean isSetTargetsystemuserdomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSYSTEMUSERDOMAINNAME$22) != 0;
        }
    }
    
    /**
     * Sets the "targetsystemuserdomainname" element
     */
    public void setTargetsystemuserdomainname(java.lang.String targetsystemuserdomainname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSYSTEMUSERDOMAINNAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETSYSTEMUSERDOMAINNAME$22);
            }
            target.setStringValue(targetsystemuserdomainname);
        }
    }
    
    /**
     * Sets (as xml) the "targetsystemuserdomainname" element
     */
    public void xsetTargetsystemuserdomainname(org.apache.xmlbeans.XmlString targetsystemuserdomainname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSYSTEMUSERDOMAINNAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETSYSTEMUSERDOMAINNAME$22);
            }
            target.set(targetsystemuserdomainname);
        }
    }
    
    /**
     * Unsets the "targetsystemuserdomainname" element
     */
    public void unsetTargetsystemuserdomainname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSYSTEMUSERDOMAINNAME$22, 0);
        }
    }
    
    /**
     * Gets the "targetsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTargetsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TARGETSYSTEMUSERID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "targetsystemuserid" element
     */
    public boolean isSetTargetsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSYSTEMUSERID$24) != 0;
        }
    }
    
    /**
     * Sets the "targetsystemuserid" element
     */
    public void setTargetsystemuserid(com.microsoft.schemas.crm._2006.webservices.Lookup targetsystemuserid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TARGETSYSTEMUSERID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TARGETSYSTEMUSERID$24);
            }
            target.set(targetsystemuserid);
        }
    }
    
    /**
     * Appends and returns a new empty "targetsystemuserid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTargetsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TARGETSYSTEMUSERID$24);
            return target;
        }
    }
    
    /**
     * Unsets the "targetsystemuserid" element
     */
    public void unsetTargetsystemuserid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSYSTEMUSERID$24, 0);
        }
    }
    
    /**
     * Gets the "targetuservalueforsourcecrmuserlink" element
     */
    public java.lang.String getTargetuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetuservalueforsourcecrmuserlink" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetuservalueforsourcecrmuserlink" element
     */
    public boolean isSetTargetuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETUSERVALUEFORSOURCECRMUSERLINK$26) != 0;
        }
    }
    
    /**
     * Sets the "targetuservalueforsourcecrmuserlink" element
     */
    public void setTargetuservalueforsourcecrmuserlink(java.lang.String targetuservalueforsourcecrmuserlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26);
            }
            target.setStringValue(targetuservalueforsourcecrmuserlink);
        }
    }
    
    /**
     * Sets (as xml) the "targetuservalueforsourcecrmuserlink" element
     */
    public void xsetTargetuservalueforsourcecrmuserlink(org.apache.xmlbeans.XmlString targetuservalueforsourcecrmuserlink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETUSERVALUEFORSOURCECRMUSERLINK$26);
            }
            target.set(targetuservalueforsourcecrmuserlink);
        }
    }
    
    /**
     * Unsets the "targetuservalueforsourcecrmuserlink" element
     */
    public void unsetTargetuservalueforsourcecrmuserlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETUSERVALUEFORSOURCECRMUSERLINK$26, 0);
        }
    }
}

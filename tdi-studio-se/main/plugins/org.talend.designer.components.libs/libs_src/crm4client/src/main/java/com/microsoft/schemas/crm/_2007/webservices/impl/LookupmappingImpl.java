/*
 * XML Type:  lookupmapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Lookupmapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML lookupmapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class LookupmappingImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Lookupmapping
{
    
    public LookupmappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNMAPPINGID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "columnmappingid");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName LOOKUPATTRIBUTENAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lookupattributename");
    private static final javax.xml.namespace.QName LOOKUPENTITYNAME$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lookupentityname");
    private static final javax.xml.namespace.QName LOOKUPMAPPINGID$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lookupmappingid");
    private static final javax.xml.namespace.QName LOOKUPSOURCECODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "lookupsourcecode");
    private static final javax.xml.namespace.QName MODIFIEDBY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName PROCESSCODE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processcode");
    private static final javax.xml.namespace.QName STATECODE$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName TRANSFORMATIONPARAMETERMAPPINGID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transformationparametermappingid");
    
    
    /**
     * Gets the "columnmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getColumnmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(COLUMNMAPPINGID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "columnmappingid" element
     */
    public boolean isSetColumnmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNMAPPINGID$0) != 0;
        }
    }
    
    /**
     * Sets the "columnmappingid" element
     */
    public void setColumnmappingid(com.microsoft.schemas.crm._2006.webservices.Lookup columnmappingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(COLUMNMAPPINGID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(COLUMNMAPPINGID$0);
            }
            target.set(columnmappingid);
        }
    }
    
    /**
     * Appends and returns a new empty "columnmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewColumnmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(COLUMNMAPPINGID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "columnmappingid" element
     */
    public void unsetColumnmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNMAPPINGID$0, 0);
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
     * Gets the "lookupattributename" element
     */
    public java.lang.String getLookupattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPATTRIBUTENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lookupattributename" element
     */
    public org.apache.xmlbeans.XmlString xgetLookupattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPATTRIBUTENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "lookupattributename" element
     */
    public boolean isSetLookupattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOKUPATTRIBUTENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "lookupattributename" element
     */
    public void setLookupattributename(java.lang.String lookupattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOKUPATTRIBUTENAME$6);
            }
            target.setStringValue(lookupattributename);
        }
    }
    
    /**
     * Sets (as xml) the "lookupattributename" element
     */
    public void xsetLookupattributename(org.apache.xmlbeans.XmlString lookupattributename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOOKUPATTRIBUTENAME$6);
            }
            target.set(lookupattributename);
        }
    }
    
    /**
     * Unsets the "lookupattributename" element
     */
    public void unsetLookupattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOKUPATTRIBUTENAME$6, 0);
        }
    }
    
    /**
     * Gets the "lookupentityname" element
     */
    public java.lang.String getLookupentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPENTITYNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lookupentityname" element
     */
    public org.apache.xmlbeans.XmlString xgetLookupentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPENTITYNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "lookupentityname" element
     */
    public boolean isSetLookupentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOKUPENTITYNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "lookupentityname" element
     */
    public void setLookupentityname(java.lang.String lookupentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPENTITYNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOKUPENTITYNAME$8);
            }
            target.setStringValue(lookupentityname);
        }
    }
    
    /**
     * Sets (as xml) the "lookupentityname" element
     */
    public void xsetLookupentityname(org.apache.xmlbeans.XmlString lookupentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOOKUPENTITYNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOOKUPENTITYNAME$8);
            }
            target.set(lookupentityname);
        }
    }
    
    /**
     * Unsets the "lookupentityname" element
     */
    public void unsetLookupentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOKUPENTITYNAME$8, 0);
        }
    }
    
    /**
     * Gets the "lookupmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getLookupmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(LOOKUPMAPPINGID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lookupmappingid" element
     */
    public boolean isSetLookupmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOKUPMAPPINGID$10) != 0;
        }
    }
    
    /**
     * Sets the "lookupmappingid" element
     */
    public void setLookupmappingid(com.microsoft.schemas.crm._2006.webservices.Key lookupmappingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(LOOKUPMAPPINGID$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(LOOKUPMAPPINGID$10);
            }
            target.set(lookupmappingid);
        }
    }
    
    /**
     * Appends and returns a new empty "lookupmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewLookupmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(LOOKUPMAPPINGID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "lookupmappingid" element
     */
    public void unsetLookupmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOKUPMAPPINGID$10, 0);
        }
    }
    
    /**
     * Gets the "lookupsourcecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getLookupsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LOOKUPSOURCECODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lookupsourcecode" element
     */
    public boolean isSetLookupsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOKUPSOURCECODE$12) != 0;
        }
    }
    
    /**
     * Sets the "lookupsourcecode" element
     */
    public void setLookupsourcecode(com.microsoft.schemas.crm._2006.webservices.Picklist lookupsourcecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(LOOKUPSOURCECODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LOOKUPSOURCECODE$12);
            }
            target.set(lookupsourcecode);
        }
    }
    
    /**
     * Appends and returns a new empty "lookupsourcecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewLookupsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(LOOKUPSOURCECODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "lookupsourcecode" element
     */
    public void unsetLookupsourcecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOKUPSOURCECODE$12, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$14, 0);
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
            return get_store().count_elements(MODIFIEDBY$14) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$14);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$14);
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
            get_store().remove_element(MODIFIEDBY$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$16, 0);
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
            return get_store().count_elements(MODIFIEDON$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$16);
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
            get_store().remove_element(MODIFIEDON$16, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$18, 0);
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
            return get_store().count_elements(PROCESSCODE$18) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$18);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$18);
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
            get_store().remove_element(PROCESSCODE$18, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo)get_store().find_element_user(STATECODE$20, 0);
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
            return get_store().count_elements(STATECODE$20) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo)get_store().find_element_user(STATECODE$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo)get_store().add_element_user(STATECODE$20);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.LookUpMappingStateInfo)get_store().add_element_user(STATECODE$20);
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
            get_store().remove_element(STATECODE$20, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$22, 0);
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
            return get_store().count_elements(STATUSCODE$22) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$22);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$22);
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
            get_store().remove_element(STATUSCODE$22, 0);
        }
    }
    
    /**
     * Gets the "transformationparametermappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getTransformationparametermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSFORMATIONPARAMETERMAPPINGID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transformationparametermappingid" element
     */
    public boolean isSetTransformationparametermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATIONPARAMETERMAPPINGID$24) != 0;
        }
    }
    
    /**
     * Sets the "transformationparametermappingid" element
     */
    public void setTransformationparametermappingid(com.microsoft.schemas.crm._2006.webservices.Lookup transformationparametermappingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(TRANSFORMATIONPARAMETERMAPPINGID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSFORMATIONPARAMETERMAPPINGID$24);
            }
            target.set(transformationparametermappingid);
        }
    }
    
    /**
     * Appends and returns a new empty "transformationparametermappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewTransformationparametermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(TRANSFORMATIONPARAMETERMAPPINGID$24);
            return target;
        }
    }
    
    /**
     * Unsets the "transformationparametermappingid" element
     */
    public void unsetTransformationparametermappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATIONPARAMETERMAPPINGID$24, 0);
        }
    }
}

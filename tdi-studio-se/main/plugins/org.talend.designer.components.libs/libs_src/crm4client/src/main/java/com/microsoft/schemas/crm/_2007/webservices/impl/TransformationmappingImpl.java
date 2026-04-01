/*
 * XML Type:  transformationmapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Transformationmapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML transformationmapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TransformationmappingImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Transformationmapping
{
    
    public TransformationmappingImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName PROCESSCODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processcode");
    private static final javax.xml.namespace.QName SOURCEENTITYNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sourceentityname");
    private static final javax.xml.namespace.QName STATECODE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName TARGETENTITYNAME$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetentityname");
    private static final javax.xml.namespace.QName TRANSFORMATIONMAPPINGID$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transformationmappingid");
    private static final javax.xml.namespace.QName TRANSFORMATIONTYPENAME$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "transformationtypename");
    
    
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
     * Gets the "processcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getProcesscode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$10, 0);
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
            return get_store().count_elements(PROCESSCODE$10) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$10);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$10);
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
            get_store().remove_element(PROCESSCODE$10, 0);
        }
    }
    
    /**
     * Gets the "sourceentityname" element
     */
    public java.lang.String getSourceentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENTITYNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceentityname" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENTITYNAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceentityname" element
     */
    public boolean isSetSourceentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEENTITYNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "sourceentityname" element
     */
    public void setSourceentityname(java.lang.String sourceentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEENTITYNAME$12);
            }
            target.setStringValue(sourceentityname);
        }
    }
    
    /**
     * Sets (as xml) the "sourceentityname" element
     */
    public void xsetSourceentityname(org.apache.xmlbeans.XmlString sourceentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENTITYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEENTITYNAME$12);
            }
            target.set(sourceentityname);
        }
    }
    
    /**
     * Unsets the "sourceentityname" element
     */
    public void unsetSourceentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEENTITYNAME$12, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo)get_store().find_element_user(STATECODE$14, 0);
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
            return get_store().count_elements(STATECODE$14) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo)get_store().find_element_user(STATECODE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo)get_store().add_element_user(STATECODE$14);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TransformationMappingStateInfo)get_store().add_element_user(STATECODE$14);
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
            get_store().remove_element(STATECODE$14, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$16, 0);
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
            return get_store().count_elements(STATUSCODE$16) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$16);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$16);
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
            get_store().remove_element(STATUSCODE$16, 0);
        }
    }
    
    /**
     * Gets the "targetentityname" element
     */
    public java.lang.String getTargetentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetentityname" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetentityname" element
     */
    public boolean isSetTargetentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETENTITYNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "targetentityname" element
     */
    public void setTargetentityname(java.lang.String targetentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETENTITYNAME$18);
            }
            target.setStringValue(targetentityname);
        }
    }
    
    /**
     * Sets (as xml) the "targetentityname" element
     */
    public void xsetTargetentityname(org.apache.xmlbeans.XmlString targetentityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENTITYNAME$18);
            }
            target.set(targetentityname);
        }
    }
    
    /**
     * Unsets the "targetentityname" element
     */
    public void unsetTargetentityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETENTITYNAME$18, 0);
        }
    }
    
    /**
     * Gets the "transformationmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getTransformationmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(TRANSFORMATIONMAPPINGID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transformationmappingid" element
     */
    public boolean isSetTransformationmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATIONMAPPINGID$20) != 0;
        }
    }
    
    /**
     * Sets the "transformationmappingid" element
     */
    public void setTransformationmappingid(com.microsoft.schemas.crm._2006.webservices.Key transformationmappingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(TRANSFORMATIONMAPPINGID$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(TRANSFORMATIONMAPPINGID$20);
            }
            target.set(transformationmappingid);
        }
    }
    
    /**
     * Appends and returns a new empty "transformationmappingid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewTransformationmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(TRANSFORMATIONMAPPINGID$20);
            return target;
        }
    }
    
    /**
     * Unsets the "transformationmappingid" element
     */
    public void unsetTransformationmappingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATIONMAPPINGID$20, 0);
        }
    }
    
    /**
     * Gets the "transformationtypename" element
     */
    public java.lang.String getTransformationtypename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFORMATIONTYPENAME$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transformationtypename" element
     */
    public org.apache.xmlbeans.XmlString xgetTransformationtypename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFORMATIONTYPENAME$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "transformationtypename" element
     */
    public boolean isSetTransformationtypename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATIONTYPENAME$22) != 0;
        }
    }
    
    /**
     * Sets the "transformationtypename" element
     */
    public void setTransformationtypename(java.lang.String transformationtypename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSFORMATIONTYPENAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSFORMATIONTYPENAME$22);
            }
            target.setStringValue(transformationtypename);
        }
    }
    
    /**
     * Sets (as xml) the "transformationtypename" element
     */
    public void xsetTransformationtypename(org.apache.xmlbeans.XmlString transformationtypename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSFORMATIONTYPENAME$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSFORMATIONTYPENAME$22);
            }
            target.set(transformationtypename);
        }
    }
    
    /**
     * Unsets the "transformationtypename" element
     */
    public void unsetTransformationtypename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATIONTYPENAME$22, 0);
        }
    }
}

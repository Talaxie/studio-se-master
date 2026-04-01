/*
 * XML Type:  report
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Report
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML report(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ReportImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Report
{
    
    public ReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODYBINARY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bodybinary");
    private static final javax.xml.namespace.QName BODYTEXT$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bodytext");
    private static final javax.xml.namespace.QName BODYURL$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "bodyurl");
    private static final javax.xml.namespace.QName CREATEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMREPORTXML$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customreportxml");
    private static final javax.xml.namespace.QName DEFAULTFILTER$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "defaultfilter");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName FILENAME$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "filename");
    private static final javax.xml.namespace.QName FILESIZE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "filesize");
    private static final javax.xml.namespace.QName ISCUSTOMREPORT$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "iscustomreport");
    private static final javax.xml.namespace.QName ISPERSONAL$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ispersonal");
    private static final javax.xml.namespace.QName ISSCHEDULEDREPORT$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isscheduledreport");
    private static final javax.xml.namespace.QName LANGUAGECODE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "languagecode");
    private static final javax.xml.namespace.QName MIMETYPE$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "mimetype");
    private static final javax.xml.namespace.QName MODIFIEDBY$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OWNERID$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PARENTREPORTID$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parentreportid");
    private static final javax.xml.namespace.QName QUERYINFO$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queryinfo");
    private static final javax.xml.namespace.QName REPORTID$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reportid");
    private static final javax.xml.namespace.QName REPORTTYPECODE$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "reporttypecode");
    private static final javax.xml.namespace.QName SCHEDULEXML$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "schedulexml");
    private static final javax.xml.namespace.QName SIGNATUREDATE$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "signaturedate");
    private static final javax.xml.namespace.QName SIGNATUREID$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "signatureid");
    private static final javax.xml.namespace.QName SIGNATURELCID$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "signaturelcid");
    private static final javax.xml.namespace.QName SIGNATUREMAJORVERSION$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "signaturemajorversion");
    private static final javax.xml.namespace.QName SIGNATUREMINORVERSION$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "signatureminorversion");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "bodybinary" element
     */
    public java.lang.String getBodybinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYBINARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bodybinary" element
     */
    public org.apache.xmlbeans.XmlString xgetBodybinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYBINARY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "bodybinary" element
     */
    public boolean isSetBodybinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYBINARY$0) != 0;
        }
    }
    
    /**
     * Sets the "bodybinary" element
     */
    public void setBodybinary(java.lang.String bodybinary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYBINARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODYBINARY$0);
            }
            target.setStringValue(bodybinary);
        }
    }
    
    /**
     * Sets (as xml) the "bodybinary" element
     */
    public void xsetBodybinary(org.apache.xmlbeans.XmlString bodybinary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYBINARY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODYBINARY$0);
            }
            target.set(bodybinary);
        }
    }
    
    /**
     * Unsets the "bodybinary" element
     */
    public void unsetBodybinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYBINARY$0, 0);
        }
    }
    
    /**
     * Gets the "bodytext" element
     */
    public java.lang.String getBodytext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYTEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bodytext" element
     */
    public org.apache.xmlbeans.XmlString xgetBodytext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYTEXT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "bodytext" element
     */
    public boolean isSetBodytext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYTEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "bodytext" element
     */
    public void setBodytext(java.lang.String bodytext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODYTEXT$2);
            }
            target.setStringValue(bodytext);
        }
    }
    
    /**
     * Sets (as xml) the "bodytext" element
     */
    public void xsetBodytext(org.apache.xmlbeans.XmlString bodytext)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYTEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODYTEXT$2);
            }
            target.set(bodytext);
        }
    }
    
    /**
     * Unsets the "bodytext" element
     */
    public void unsetBodytext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYTEXT$2, 0);
        }
    }
    
    /**
     * Gets the "bodyurl" element
     */
    public java.lang.String getBodyurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYURL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bodyurl" element
     */
    public org.apache.xmlbeans.XmlString xgetBodyurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYURL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "bodyurl" element
     */
    public boolean isSetBodyurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYURL$4) != 0;
        }
    }
    
    /**
     * Sets the "bodyurl" element
     */
    public void setBodyurl(java.lang.String bodyurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODYURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODYURL$4);
            }
            target.setStringValue(bodyurl);
        }
    }
    
    /**
     * Sets (as xml) the "bodyurl" element
     */
    public void xsetBodyurl(org.apache.xmlbeans.XmlString bodyurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODYURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODYURL$4);
            }
            target.set(bodyurl);
        }
    }
    
    /**
     * Unsets the "bodyurl" element
     */
    public void unsetBodyurl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYURL$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
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
            return get_store().count_elements(CREATEDBY$6) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
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
            get_store().remove_element(CREATEDBY$6, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
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
            return get_store().count_elements(CREATEDON$8) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
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
            get_store().remove_element(CREATEDON$8, 0);
        }
    }
    
    /**
     * Gets the "customreportxml" element
     */
    public java.lang.String getCustomreportxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMREPORTXML$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "customreportxml" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomreportxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMREPORTXML$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "customreportxml" element
     */
    public boolean isSetCustomreportxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMREPORTXML$10) != 0;
        }
    }
    
    /**
     * Sets the "customreportxml" element
     */
    public void setCustomreportxml(java.lang.String customreportxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMREPORTXML$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMREPORTXML$10);
            }
            target.setStringValue(customreportxml);
        }
    }
    
    /**
     * Sets (as xml) the "customreportxml" element
     */
    public void xsetCustomreportxml(org.apache.xmlbeans.XmlString customreportxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMREPORTXML$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMREPORTXML$10);
            }
            target.set(customreportxml);
        }
    }
    
    /**
     * Unsets the "customreportxml" element
     */
    public void unsetCustomreportxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMREPORTXML$10, 0);
        }
    }
    
    /**
     * Gets the "defaultfilter" element
     */
    public java.lang.String getDefaultfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTFILTER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultfilter" element
     */
    public org.apache.xmlbeans.XmlString xgetDefaultfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTFILTER$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "defaultfilter" element
     */
    public boolean isSetDefaultfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFAULTFILTER$12) != 0;
        }
    }
    
    /**
     * Sets the "defaultfilter" element
     */
    public void setDefaultfilter(java.lang.String defaultfilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTFILTER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTFILTER$12);
            }
            target.setStringValue(defaultfilter);
        }
    }
    
    /**
     * Sets (as xml) the "defaultfilter" element
     */
    public void xsetDefaultfilter(org.apache.xmlbeans.XmlString defaultfilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTFILTER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTFILTER$12);
            }
            target.set(defaultfilter);
        }
    }
    
    /**
     * Unsets the "defaultfilter" element
     */
    public void unsetDefaultfilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFAULTFILTER$12, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$14);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$14);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$14, 0);
        }
    }
    
    /**
     * Gets the "filename" element
     */
    public java.lang.String getFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filename" element
     */
    public org.apache.xmlbeans.XmlString xgetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "filename" element
     */
    public boolean isSetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$16) != 0;
        }
    }
    
    /**
     * Sets the "filename" element
     */
    public void setFilename(java.lang.String filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILENAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILENAME$16);
            }
            target.setStringValue(filename);
        }
    }
    
    /**
     * Sets (as xml) the "filename" element
     */
    public void xsetFilename(org.apache.xmlbeans.XmlString filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILENAME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILENAME$16);
            }
            target.set(filename);
        }
    }
    
    /**
     * Unsets the "filename" element
     */
    public void unsetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$16, 0);
        }
    }
    
    /**
     * Gets the "filesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FILESIZE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filesize" element
     */
    public boolean isSetFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESIZE$18) != 0;
        }
    }
    
    /**
     * Sets the "filesize" element
     */
    public void setFilesize(com.microsoft.schemas.crm._2006.webservices.CrmNumber filesize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FILESIZE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FILESIZE$18);
            }
            target.set(filesize);
        }
    }
    
    /**
     * Appends and returns a new empty "filesize" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FILESIZE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "filesize" element
     */
    public void unsetFilesize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESIZE$18, 0);
        }
    }
    
    /**
     * Gets the "iscustomreport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCUSTOMREPORT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iscustomreport" element
     */
    public boolean isSetIscustomreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMREPORT$20) != 0;
        }
    }
    
    /**
     * Sets the "iscustomreport" element
     */
    public void setIscustomreport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomreport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCUSTOMREPORT$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCUSTOMREPORT$20);
            }
            target.set(iscustomreport);
        }
    }
    
    /**
     * Appends and returns a new empty "iscustomreport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCUSTOMREPORT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "iscustomreport" element
     */
    public void unsetIscustomreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMREPORT$20, 0);
        }
    }
    
    /**
     * Gets the "ispersonal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIspersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPERSONAL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ispersonal" element
     */
    public boolean isSetIspersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPERSONAL$22) != 0;
        }
    }
    
    /**
     * Sets the "ispersonal" element
     */
    public void setIspersonal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean ispersonal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPERSONAL$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPERSONAL$22);
            }
            target.set(ispersonal);
        }
    }
    
    /**
     * Appends and returns a new empty "ispersonal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIspersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPERSONAL$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ispersonal" element
     */
    public void unsetIspersonal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPERSONAL$22, 0);
        }
    }
    
    /**
     * Gets the "isscheduledreport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsscheduledreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSCHEDULEDREPORT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isscheduledreport" element
     */
    public boolean isSetIsscheduledreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSCHEDULEDREPORT$24) != 0;
        }
    }
    
    /**
     * Sets the "isscheduledreport" element
     */
    public void setIsscheduledreport(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isscheduledreport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISSCHEDULEDREPORT$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSCHEDULEDREPORT$24);
            }
            target.set(isscheduledreport);
        }
    }
    
    /**
     * Appends and returns a new empty "isscheduledreport" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsscheduledreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISSCHEDULEDREPORT$24);
            return target;
        }
    }
    
    /**
     * Unsets the "isscheduledreport" element
     */
    public void unsetIsscheduledreport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSCHEDULEDREPORT$24, 0);
        }
    }
    
    /**
     * Gets the "languagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LANGUAGECODE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "languagecode" element
     */
    public boolean isSetLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$26) != 0;
        }
    }
    
    /**
     * Sets the "languagecode" element
     */
    public void setLanguagecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber languagecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(LANGUAGECODE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LANGUAGECODE$26);
            }
            target.set(languagecode);
        }
    }
    
    /**
     * Appends and returns a new empty "languagecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(LANGUAGECODE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "languagecode" element
     */
    public void unsetLanguagecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$26, 0);
        }
    }
    
    /**
     * Gets the "mimetype" element
     */
    public java.lang.String getMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimetype" element
     */
    public org.apache.xmlbeans.XmlString xgetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "mimetype" element
     */
    public boolean isSetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMETYPE$28) != 0;
        }
    }
    
    /**
     * Sets the "mimetype" element
     */
    public void setMimetype(java.lang.String mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$28);
            }
            target.setStringValue(mimetype);
        }
    }
    
    /**
     * Sets (as xml) the "mimetype" element
     */
    public void xsetMimetype(org.apache.xmlbeans.XmlString mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMETYPE$28);
            }
            target.set(mimetype);
        }
    }
    
    /**
     * Unsets the "mimetype" element
     */
    public void unsetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMETYPE$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$30, 0);
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
            return get_store().count_elements(MODIFIEDBY$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$30);
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
            get_store().remove_element(MODIFIEDBY$30, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$32, 0);
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
            return get_store().count_elements(MODIFIEDON$32) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$32);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$32);
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
            get_store().remove_element(MODIFIEDON$32, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$34) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$34);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$34);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$34, 0);
        }
    }
    
    /**
     * Gets the "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner getOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ownerid" element
     */
    public boolean isSetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNERID$36) != 0;
        }
    }
    
    /**
     * Sets the "ownerid" element
     */
    public void setOwnerid(com.microsoft.schemas.crm._2006.webservices.Owner ownerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$36);
            }
            target.set(ownerid);
        }
    }
    
    /**
     * Appends and returns a new empty "ownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Owner addNewOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Owner target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$36);
            return target;
        }
    }
    
    /**
     * Unsets the "ownerid" element
     */
    public void unsetOwnerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNERID$36, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$38, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$38) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.Lookup owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$38);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$38);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$38, 0);
        }
    }
    
    /**
     * Gets the "parentreportid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getParentreportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTREPORTID$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parentreportid" element
     */
    public boolean isSetParentreportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTREPORTID$40) != 0;
        }
    }
    
    /**
     * Sets the "parentreportid" element
     */
    public void setParentreportid(com.microsoft.schemas.crm._2006.webservices.Lookup parentreportid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(PARENTREPORTID$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTREPORTID$40);
            }
            target.set(parentreportid);
        }
    }
    
    /**
     * Appends and returns a new empty "parentreportid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewParentreportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(PARENTREPORTID$40);
            return target;
        }
    }
    
    /**
     * Unsets the "parentreportid" element
     */
    public void unsetParentreportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTREPORTID$40, 0);
        }
    }
    
    /**
     * Gets the "queryinfo" element
     */
    public java.lang.String getQueryinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYINFO$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryinfo" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYINFO$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "queryinfo" element
     */
    public boolean isSetQueryinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYINFO$42) != 0;
        }
    }
    
    /**
     * Sets the "queryinfo" element
     */
    public void setQueryinfo(java.lang.String queryinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYINFO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYINFO$42);
            }
            target.setStringValue(queryinfo);
        }
    }
    
    /**
     * Sets (as xml) the "queryinfo" element
     */
    public void xsetQueryinfo(org.apache.xmlbeans.XmlString queryinfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYINFO$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYINFO$42);
            }
            target.set(queryinfo);
        }
    }
    
    /**
     * Unsets the "queryinfo" element
     */
    public void unsetQueryinfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYINFO$42, 0);
        }
    }
    
    /**
     * Gets the "reportid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getReportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(REPORTID$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportid" element
     */
    public boolean isSetReportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTID$44) != 0;
        }
    }
    
    /**
     * Sets the "reportid" element
     */
    public void setReportid(com.microsoft.schemas.crm._2006.webservices.Key reportid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(REPORTID$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(REPORTID$44);
            }
            target.set(reportid);
        }
    }
    
    /**
     * Appends and returns a new empty "reportid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewReportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(REPORTID$44);
            return target;
        }
    }
    
    /**
     * Unsets the "reportid" element
     */
    public void unsetReportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTID$44, 0);
        }
    }
    
    /**
     * Gets the "reporttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getReporttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(REPORTTYPECODE$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reporttypecode" element
     */
    public boolean isSetReporttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTTYPECODE$46) != 0;
        }
    }
    
    /**
     * Sets the "reporttypecode" element
     */
    public void setReporttypecode(com.microsoft.schemas.crm._2006.webservices.Picklist reporttypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(REPORTTYPECODE$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(REPORTTYPECODE$46);
            }
            target.set(reporttypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "reporttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewReporttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(REPORTTYPECODE$46);
            return target;
        }
    }
    
    /**
     * Unsets the "reporttypecode" element
     */
    public void unsetReporttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTTYPECODE$46, 0);
        }
    }
    
    /**
     * Gets the "schedulexml" element
     */
    public java.lang.String getSchedulexml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEXML$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schedulexml" element
     */
    public org.apache.xmlbeans.XmlString xgetSchedulexml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEDULEXML$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "schedulexml" element
     */
    public boolean isSetSchedulexml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEXML$48) != 0;
        }
    }
    
    /**
     * Sets the "schedulexml" element
     */
    public void setSchedulexml(java.lang.String schedulexml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEXML$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEXML$48);
            }
            target.setStringValue(schedulexml);
        }
    }
    
    /**
     * Sets (as xml) the "schedulexml" element
     */
    public void xsetSchedulexml(org.apache.xmlbeans.XmlString schedulexml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHEDULEXML$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHEDULEXML$48);
            }
            target.set(schedulexml);
        }
    }
    
    /**
     * Unsets the "schedulexml" element
     */
    public void unsetSchedulexml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEXML$48, 0);
        }
    }
    
    /**
     * Gets the "signaturedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getSignaturedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SIGNATUREDATE$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signaturedate" element
     */
    public boolean isSetSignaturedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREDATE$50) != 0;
        }
    }
    
    /**
     * Sets the "signaturedate" element
     */
    public void setSignaturedate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime signaturedate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(SIGNATUREDATE$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SIGNATUREDATE$50);
            }
            target.set(signaturedate);
        }
    }
    
    /**
     * Appends and returns a new empty "signaturedate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewSignaturedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(SIGNATUREDATE$50);
            return target;
        }
    }
    
    /**
     * Unsets the "signaturedate" element
     */
    public void unsetSignaturedate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREDATE$50, 0);
        }
    }
    
    /**
     * Gets the "signatureid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSignatureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SIGNATUREID$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signatureid" element
     */
    public boolean isSetSignatureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREID$52) != 0;
        }
    }
    
    /**
     * Sets the "signatureid" element
     */
    public void setSignatureid(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier signatureid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SIGNATUREID$52, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SIGNATUREID$52);
            }
            target.set(signatureid);
        }
    }
    
    /**
     * Appends and returns a new empty "signatureid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSignatureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SIGNATUREID$52);
            return target;
        }
    }
    
    /**
     * Unsets the "signatureid" element
     */
    public void unsetSignatureid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREID$52, 0);
        }
    }
    
    /**
     * Gets the "signaturelcid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignaturelcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATURELCID$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signaturelcid" element
     */
    public boolean isSetSignaturelcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATURELCID$54) != 0;
        }
    }
    
    /**
     * Sets the "signaturelcid" element
     */
    public void setSignaturelcid(com.microsoft.schemas.crm._2006.webservices.CrmNumber signaturelcid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATURELCID$54, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATURELCID$54);
            }
            target.set(signaturelcid);
        }
    }
    
    /**
     * Appends and returns a new empty "signaturelcid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignaturelcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATURELCID$54);
            return target;
        }
    }
    
    /**
     * Unsets the "signaturelcid" element
     */
    public void unsetSignaturelcid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATURELCID$54, 0);
        }
    }
    
    /**
     * Gets the "signaturemajorversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignaturemajorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATUREMAJORVERSION$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signaturemajorversion" element
     */
    public boolean isSetSignaturemajorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREMAJORVERSION$56) != 0;
        }
    }
    
    /**
     * Sets the "signaturemajorversion" element
     */
    public void setSignaturemajorversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber signaturemajorversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATUREMAJORVERSION$56, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATUREMAJORVERSION$56);
            }
            target.set(signaturemajorversion);
        }
    }
    
    /**
     * Appends and returns a new empty "signaturemajorversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignaturemajorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATUREMAJORVERSION$56);
            return target;
        }
    }
    
    /**
     * Unsets the "signaturemajorversion" element
     */
    public void unsetSignaturemajorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREMAJORVERSION$56, 0);
        }
    }
    
    /**
     * Gets the "signatureminorversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSignatureminorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATUREMINORVERSION$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "signatureminorversion" element
     */
    public boolean isSetSignatureminorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREMINORVERSION$58) != 0;
        }
    }
    
    /**
     * Sets the "signatureminorversion" element
     */
    public void setSignatureminorversion(com.microsoft.schemas.crm._2006.webservices.CrmNumber signatureminorversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SIGNATUREMINORVERSION$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATUREMINORVERSION$58);
            }
            target.set(signatureminorversion);
        }
    }
    
    /**
     * Appends and returns a new empty "signatureminorversion" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSignatureminorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SIGNATUREMINORVERSION$58);
            return target;
        }
    }
    
    /**
     * Unsets the "signatureminorversion" element
     */
    public void unsetSignatureminorversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREMINORVERSION$58, 0);
        }
    }
    
    /**
     * Gets the "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timezoneruleversionnumber" element
     */
    public boolean isSetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$60) != 0;
        }
    }
    
    /**
     * Sets the "timezoneruleversionnumber" element
     */
    public void setTimezoneruleversionnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber timezoneruleversionnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$60);
            }
            target.set(timezoneruleversionnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "timezoneruleversionnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$60);
            return target;
        }
    }
    
    /**
     * Unsets the "timezoneruleversionnumber" element
     */
    public void unsetTimezoneruleversionnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$60, 0);
        }
    }
    
    /**
     * Gets the "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "utcconversiontimezonecode" element
     */
    public boolean isSetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$62) != 0;
        }
    }
    
    /**
     * Sets the "utcconversiontimezonecode" element
     */
    public void setUtcconversiontimezonecode(com.microsoft.schemas.crm._2006.webservices.CrmNumber utcconversiontimezonecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$62);
            }
            target.set(utcconversiontimezonecode);
        }
    }
    
    /**
     * Appends and returns a new empty "utcconversiontimezonecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$62);
            return target;
        }
    }
    
    /**
     * Unsets the "utcconversiontimezonecode" element
     */
    public void unsetUtcconversiontimezonecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$62, 0);
        }
    }
}

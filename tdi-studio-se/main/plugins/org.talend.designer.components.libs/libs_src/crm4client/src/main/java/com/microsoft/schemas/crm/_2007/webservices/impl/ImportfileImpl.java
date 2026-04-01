/*
 * XML Type:  importfile
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Importfile
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML importfile(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ImportfileImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Importfile
{
    
    public ImportfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDITIONALHEADERROW$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "additionalheaderrow");
    private static final javax.xml.namespace.QName COMPLETEDON$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "completedon");
    private static final javax.xml.namespace.QName CONTENT$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "content");
    private static final javax.xml.namespace.QName CREATEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DATADELIMITERCODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "datadelimitercode");
    private static final javax.xml.namespace.QName ENABLEDUPLICATEDETECTION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "enableduplicatedetection");
    private static final javax.xml.namespace.QName FAILURECOUNT$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "failurecount");
    private static final javax.xml.namespace.QName FIELDDELIMITERCODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fielddelimitercode");
    private static final javax.xml.namespace.QName HEADERROW$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "headerrow");
    private static final javax.xml.namespace.QName IMPORTFILEID$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importfileid");
    private static final javax.xml.namespace.QName IMPORTID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importid");
    private static final javax.xml.namespace.QName IMPORTMAPID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "importmapid");
    private static final javax.xml.namespace.QName ISFIRSTROWHEADER$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isfirstrowheader");
    private static final javax.xml.namespace.QName MODIFIEDBY$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName OWNERID$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ownerid");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName PARSEDTABLECOLUMNPREFIX$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parsedtablecolumnprefix");
    private static final javax.xml.namespace.QName PARSEDTABLECOLUMNSNUMBER$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parsedtablecolumnsnumber");
    private static final javax.xml.namespace.QName PARSEDTABLENAME$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "parsedtablename");
    private static final javax.xml.namespace.QName PROCESSCODE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processcode");
    private static final javax.xml.namespace.QName PROCESSINGSTATUS$46 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "processingstatus");
    private static final javax.xml.namespace.QName PROGRESSCOUNTER$48 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "progresscounter");
    private static final javax.xml.namespace.QName RECORDSOWNERID$50 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "recordsownerid");
    private static final javax.xml.namespace.QName SIZE$52 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "size");
    private static final javax.xml.namespace.QName SOURCE$54 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "source");
    private static final javax.xml.namespace.QName SOURCEENTITYNAME$56 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sourceentityname");
    private static final javax.xml.namespace.QName STATECODE$58 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statecode");
    private static final javax.xml.namespace.QName STATUSCODE$60 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "statuscode");
    private static final javax.xml.namespace.QName SUCCESSCOUNT$62 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "successcount");
    private static final javax.xml.namespace.QName TARGETENTITYNAME$64 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "targetentityname");
    private static final javax.xml.namespace.QName TIMEZONERULEVERSIONNUMBER$66 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "timezoneruleversionnumber");
    private static final javax.xml.namespace.QName TOTALCOUNT$68 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "totalcount");
    private static final javax.xml.namespace.QName USESYSTEMMAP$70 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "usesystemmap");
    private static final javax.xml.namespace.QName UTCCONVERSIONTIMEZONECODE$72 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "utcconversiontimezonecode");
    
    
    /**
     * Gets the "additionalheaderrow" element
     */
    public java.lang.String getAdditionalheaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALHEADERROW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalheaderrow" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalheaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALHEADERROW$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "additionalheaderrow" element
     */
    public boolean isSetAdditionalheaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALHEADERROW$0) != 0;
        }
    }
    
    /**
     * Sets the "additionalheaderrow" element
     */
    public void setAdditionalheaderrow(java.lang.String additionalheaderrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALHEADERROW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALHEADERROW$0);
            }
            target.setStringValue(additionalheaderrow);
        }
    }
    
    /**
     * Sets (as xml) the "additionalheaderrow" element
     */
    public void xsetAdditionalheaderrow(org.apache.xmlbeans.XmlString additionalheaderrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALHEADERROW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALHEADERROW$0);
            }
            target.set(additionalheaderrow);
        }
    }
    
    /**
     * Unsets the "additionalheaderrow" element
     */
    public void unsetAdditionalheaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALHEADERROW$0, 0);
        }
    }
    
    /**
     * Gets the "completedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completedon" element
     */
    public boolean isSetCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEDON$2) != 0;
        }
    }
    
    /**
     * Sets the "completedon" element
     */
    public void setCompletedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime completedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDON$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDON$2);
            }
            target.set(completedon);
        }
    }
    
    /**
     * Appends and returns a new empty "completedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "completedon" element
     */
    public void unsetCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEDON$2, 0);
        }
    }
    
    /**
     * Gets the "content" element
     */
    public java.lang.String getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "content" element
     */
    public org.apache.xmlbeans.XmlString xgetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "content" element
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$4) != 0;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(java.lang.String content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$4);
            }
            target.setStringValue(content);
        }
    }
    
    /**
     * Sets (as xml) the "content" element
     */
    public void xsetContent(org.apache.xmlbeans.XmlString content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENT$4);
            }
            target.set(content);
        }
    }
    
    /**
     * Unsets the "content" element
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$4, 0);
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
     * Gets the "datadelimitercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getDatadelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(DATADELIMITERCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "datadelimitercode" element
     */
    public boolean isSetDatadelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADELIMITERCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "datadelimitercode" element
     */
    public void setDatadelimitercode(com.microsoft.schemas.crm._2006.webservices.Picklist datadelimitercode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(DATADELIMITERCODE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(DATADELIMITERCODE$10);
            }
            target.set(datadelimitercode);
        }
    }
    
    /**
     * Appends and returns a new empty "datadelimitercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewDatadelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(DATADELIMITERCODE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "datadelimitercode" element
     */
    public void unsetDatadelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADELIMITERCODE$10, 0);
        }
    }
    
    /**
     * Gets the "enableduplicatedetection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getEnableduplicatedetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ENABLEDUPLICATEDETECTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enableduplicatedetection" element
     */
    public boolean isSetEnableduplicatedetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLEDUPLICATEDETECTION$12) != 0;
        }
    }
    
    /**
     * Sets the "enableduplicatedetection" element
     */
    public void setEnableduplicatedetection(com.microsoft.schemas.crm._2006.webservices.CrmBoolean enableduplicatedetection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ENABLEDUPLICATEDETECTION$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ENABLEDUPLICATEDETECTION$12);
            }
            target.set(enableduplicatedetection);
        }
    }
    
    /**
     * Appends and returns a new empty "enableduplicatedetection" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewEnableduplicatedetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ENABLEDUPLICATEDETECTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "enableduplicatedetection" element
     */
    public void unsetEnableduplicatedetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLEDUPLICATEDETECTION$12, 0);
        }
    }
    
    /**
     * Gets the "failurecount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getFailurecount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FAILURECOUNT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "failurecount" element
     */
    public boolean isSetFailurecount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILURECOUNT$14) != 0;
        }
    }
    
    /**
     * Sets the "failurecount" element
     */
    public void setFailurecount(com.microsoft.schemas.crm._2006.webservices.CrmNumber failurecount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(FAILURECOUNT$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FAILURECOUNT$14);
            }
            target.set(failurecount);
        }
    }
    
    /**
     * Appends and returns a new empty "failurecount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewFailurecount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(FAILURECOUNT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "failurecount" element
     */
    public void unsetFailurecount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILURECOUNT$14, 0);
        }
    }
    
    /**
     * Gets the "fielddelimitercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getFielddelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FIELDDELIMITERCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fielddelimitercode" element
     */
    public boolean isSetFielddelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDDELIMITERCODE$16) != 0;
        }
    }
    
    /**
     * Sets the "fielddelimitercode" element
     */
    public void setFielddelimitercode(com.microsoft.schemas.crm._2006.webservices.Picklist fielddelimitercode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(FIELDDELIMITERCODE$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FIELDDELIMITERCODE$16);
            }
            target.set(fielddelimitercode);
        }
    }
    
    /**
     * Appends and returns a new empty "fielddelimitercode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewFielddelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(FIELDDELIMITERCODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "fielddelimitercode" element
     */
    public void unsetFielddelimitercode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDDELIMITERCODE$16, 0);
        }
    }
    
    /**
     * Gets the "headerrow" element
     */
    public java.lang.String getHeaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERROW$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "headerrow" element
     */
    public org.apache.xmlbeans.XmlString xgetHeaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADERROW$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "headerrow" element
     */
    public boolean isSetHeaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERROW$18) != 0;
        }
    }
    
    /**
     * Sets the "headerrow" element
     */
    public void setHeaderrow(java.lang.String headerrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERROW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADERROW$18);
            }
            target.setStringValue(headerrow);
        }
    }
    
    /**
     * Sets (as xml) the "headerrow" element
     */
    public void xsetHeaderrow(org.apache.xmlbeans.XmlString headerrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADERROW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADERROW$18);
            }
            target.set(headerrow);
        }
    }
    
    /**
     * Unsets the "headerrow" element
     */
    public void unsetHeaderrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERROW$18, 0);
        }
    }
    
    /**
     * Gets the "importfileid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getImportfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(IMPORTFILEID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "importfileid" element
     */
    public boolean isSetImportfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTFILEID$20) != 0;
        }
    }
    
    /**
     * Sets the "importfileid" element
     */
    public void setImportfileid(com.microsoft.schemas.crm._2006.webservices.Key importfileid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(IMPORTFILEID$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(IMPORTFILEID$20);
            }
            target.set(importfileid);
        }
    }
    
    /**
     * Appends and returns a new empty "importfileid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewImportfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(IMPORTFILEID$20);
            return target;
        }
    }
    
    /**
     * Unsets the "importfileid" element
     */
    public void unsetImportfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTFILEID$20, 0);
        }
    }
    
    /**
     * Gets the "importid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getImportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "importid" element
     */
    public boolean isSetImportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTID$22) != 0;
        }
    }
    
    /**
     * Sets the "importid" element
     */
    public void setImportid(com.microsoft.schemas.crm._2006.webservices.Lookup importid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTID$22);
            }
            target.set(importid);
        }
    }
    
    /**
     * Appends and returns a new empty "importid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewImportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "importid" element
     */
    public void unsetImportid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTID$22, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTMAPID$24, 0);
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
            return get_store().count_elements(IMPORTMAPID$24) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(IMPORTMAPID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTMAPID$24);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(IMPORTMAPID$24);
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
            get_store().remove_element(IMPORTMAPID$24, 0);
        }
    }
    
    /**
     * Gets the "isfirstrowheader" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsfirstrowheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFIRSTROWHEADER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isfirstrowheader" element
     */
    public boolean isSetIsfirstrowheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISFIRSTROWHEADER$26) != 0;
        }
    }
    
    /**
     * Sets the "isfirstrowheader" element
     */
    public void setIsfirstrowheader(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isfirstrowheader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISFIRSTROWHEADER$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFIRSTROWHEADER$26);
            }
            target.set(isfirstrowheader);
        }
    }
    
    /**
     * Appends and returns a new empty "isfirstrowheader" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsfirstrowheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISFIRSTROWHEADER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "isfirstrowheader" element
     */
    public void unsetIsfirstrowheader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISFIRSTROWHEADER$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$28, 0);
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
            return get_store().count_elements(MODIFIEDBY$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$28);
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
            get_store().remove_element(MODIFIEDBY$28, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$30, 0);
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
            return get_store().count_elements(MODIFIEDON$30) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$30, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$30);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$30);
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
            get_store().remove_element(MODIFIEDON$30, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$32, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$32, 0);
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
            return get_store().count_elements(NAME$32) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$32);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$32);
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
            get_store().remove_element(NAME$32, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$34, 0);
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
            return get_store().count_elements(OWNERID$34) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().find_element_user(OWNERID$34, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$34);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Owner)get_store().add_element_user(OWNERID$34);
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
            get_store().remove_element(OWNERID$34, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$36, 0);
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
            return get_store().count_elements(OWNINGBUSINESSUNIT$36) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(OWNINGBUSINESSUNIT$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$36);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(OWNINGBUSINESSUNIT$36);
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
            get_store().remove_element(OWNINGBUSINESSUNIT$36, 0);
        }
    }
    
    /**
     * Gets the "parsedtablecolumnprefix" element
     */
    public java.lang.String getParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parsedtablecolumnprefix" element
     */
    public org.apache.xmlbeans.XmlString xgetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "parsedtablecolumnprefix" element
     */
    public boolean isSetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARSEDTABLECOLUMNPREFIX$38) != 0;
        }
    }
    
    /**
     * Sets the "parsedtablecolumnprefix" element
     */
    public void setParsedtablecolumnprefix(java.lang.String parsedtablecolumnprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARSEDTABLECOLUMNPREFIX$38);
            }
            target.setStringValue(parsedtablecolumnprefix);
        }
    }
    
    /**
     * Sets (as xml) the "parsedtablecolumnprefix" element
     */
    public void xsetParsedtablecolumnprefix(org.apache.xmlbeans.XmlString parsedtablecolumnprefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLECOLUMNPREFIX$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARSEDTABLECOLUMNPREFIX$38);
            }
            target.set(parsedtablecolumnprefix);
        }
    }
    
    /**
     * Unsets the "parsedtablecolumnprefix" element
     */
    public void unsetParsedtablecolumnprefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARSEDTABLECOLUMNPREFIX$38, 0);
        }
    }
    
    /**
     * Gets the "parsedtablecolumnsnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getParsedtablecolumnsnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PARSEDTABLECOLUMNSNUMBER$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parsedtablecolumnsnumber" element
     */
    public boolean isSetParsedtablecolumnsnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARSEDTABLECOLUMNSNUMBER$40) != 0;
        }
    }
    
    /**
     * Sets the "parsedtablecolumnsnumber" element
     */
    public void setParsedtablecolumnsnumber(com.microsoft.schemas.crm._2006.webservices.CrmNumber parsedtablecolumnsnumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PARSEDTABLECOLUMNSNUMBER$40, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PARSEDTABLECOLUMNSNUMBER$40);
            }
            target.set(parsedtablecolumnsnumber);
        }
    }
    
    /**
     * Appends and returns a new empty "parsedtablecolumnsnumber" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewParsedtablecolumnsnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PARSEDTABLECOLUMNSNUMBER$40);
            return target;
        }
    }
    
    /**
     * Unsets the "parsedtablecolumnsnumber" element
     */
    public void unsetParsedtablecolumnsnumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARSEDTABLECOLUMNSNUMBER$40, 0);
        }
    }
    
    /**
     * Gets the "parsedtablename" element
     */
    public java.lang.String getParsedtablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLENAME$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parsedtablename" element
     */
    public org.apache.xmlbeans.XmlString xgetParsedtablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLENAME$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "parsedtablename" element
     */
    public boolean isSetParsedtablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARSEDTABLENAME$42) != 0;
        }
    }
    
    /**
     * Sets the "parsedtablename" element
     */
    public void setParsedtablename(java.lang.String parsedtablename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARSEDTABLENAME$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARSEDTABLENAME$42);
            }
            target.setStringValue(parsedtablename);
        }
    }
    
    /**
     * Sets (as xml) the "parsedtablename" element
     */
    public void xsetParsedtablename(org.apache.xmlbeans.XmlString parsedtablename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARSEDTABLENAME$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARSEDTABLENAME$42);
            }
            target.set(parsedtablename);
        }
    }
    
    /**
     * Unsets the "parsedtablename" element
     */
    public void unsetParsedtablename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARSEDTABLENAME$42, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$44, 0);
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
            return get_store().count_elements(PROCESSCODE$44) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSCODE$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$44);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSCODE$44);
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
            get_store().remove_element(PROCESSCODE$44, 0);
        }
    }
    
    /**
     * Gets the "processingstatus" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getProcessingstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSINGSTATUS$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "processingstatus" element
     */
    public boolean isSetProcessingstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINGSTATUS$46) != 0;
        }
    }
    
    /**
     * Sets the "processingstatus" element
     */
    public void setProcessingstatus(com.microsoft.schemas.crm._2006.webservices.Picklist processingstatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(PROCESSINGSTATUS$46, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSINGSTATUS$46);
            }
            target.set(processingstatus);
        }
    }
    
    /**
     * Appends and returns a new empty "processingstatus" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewProcessingstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(PROCESSINGSTATUS$46);
            return target;
        }
    }
    
    /**
     * Unsets the "processingstatus" element
     */
    public void unsetProcessingstatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINGSTATUS$46, 0);
        }
    }
    
    /**
     * Gets the "progresscounter" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getProgresscounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PROGRESSCOUNTER$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "progresscounter" element
     */
    public boolean isSetProgresscounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROGRESSCOUNTER$48) != 0;
        }
    }
    
    /**
     * Sets the "progresscounter" element
     */
    public void setProgresscounter(com.microsoft.schemas.crm._2006.webservices.CrmNumber progresscounter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(PROGRESSCOUNTER$48, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PROGRESSCOUNTER$48);
            }
            target.set(progresscounter);
        }
    }
    
    /**
     * Appends and returns a new empty "progresscounter" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewProgresscounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(PROGRESSCOUNTER$48);
            return target;
        }
    }
    
    /**
     * Unsets the "progresscounter" element
     */
    public void unsetProgresscounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROGRESSCOUNTER$48, 0);
        }
    }
    
    /**
     * Gets the "recordsownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getRecordsownerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RECORDSOWNERID$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "recordsownerid" element
     */
    public boolean isSetRecordsownerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDSOWNERID$50) != 0;
        }
    }
    
    /**
     * Sets the "recordsownerid" element
     */
    public void setRecordsownerid(com.microsoft.schemas.crm._2006.webservices.Lookup recordsownerid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(RECORDSOWNERID$50, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RECORDSOWNERID$50);
            }
            target.set(recordsownerid);
        }
    }
    
    /**
     * Appends and returns a new empty "recordsownerid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewRecordsownerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(RECORDSOWNERID$50);
            return target;
        }
    }
    
    /**
     * Unsets the "recordsownerid" element
     */
    public void unsetRecordsownerid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDSOWNERID$50, 0);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public java.lang.String getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" element
     */
    public org.apache.xmlbeans.XmlString xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$52) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(java.lang.String size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$52);
            }
            target.setStringValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlString size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIZE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIZE$52);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$52, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$54, 0);
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$54) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$54);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$54);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$54, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENTITYNAME$56, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENTITYNAME$56, 0);
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
            return get_store().count_elements(SOURCEENTITYNAME$56) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENTITYNAME$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEENTITYNAME$56);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENTITYNAME$56, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEENTITYNAME$56);
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
            get_store().remove_element(SOURCEENTITYNAME$56, 0);
        }
    }
    
    /**
     * Gets the "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo getStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo)get_store().find_element_user(STATECODE$58, 0);
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
            return get_store().count_elements(STATECODE$58) != 0;
        }
    }
    
    /**
     * Sets the "statecode" element
     */
    public void setStatecode(com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo statecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo)get_store().find_element_user(STATECODE$58, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo)get_store().add_element_user(STATECODE$58);
            }
            target.set(statecode);
        }
    }
    
    /**
     * Appends and returns a new empty "statecode" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo addNewStatecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ImportFileStateInfo)get_store().add_element_user(STATECODE$58);
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
            get_store().remove_element(STATECODE$58, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$60, 0);
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
            return get_store().count_elements(STATUSCODE$60) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().find_element_user(STATUSCODE$60, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$60);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Status)get_store().add_element_user(STATUSCODE$60);
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
            get_store().remove_element(STATUSCODE$60, 0);
        }
    }
    
    /**
     * Gets the "successcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getSuccesscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUCCESSCOUNT$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "successcount" element
     */
    public boolean isSetSuccesscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUCCESSCOUNT$62) != 0;
        }
    }
    
    /**
     * Sets the "successcount" element
     */
    public void setSuccesscount(com.microsoft.schemas.crm._2006.webservices.CrmNumber successcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(SUCCESSCOUNT$62, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUCCESSCOUNT$62);
            }
            target.set(successcount);
        }
    }
    
    /**
     * Appends and returns a new empty "successcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewSuccesscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(SUCCESSCOUNT$62);
            return target;
        }
    }
    
    /**
     * Unsets the "successcount" element
     */
    public void unsetSuccesscount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUCCESSCOUNT$62, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$64, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$64, 0);
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
            return get_store().count_elements(TARGETENTITYNAME$64) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENTITYNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETENTITYNAME$64);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENTITYNAME$64, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENTITYNAME$64);
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
            get_store().remove_element(TARGETENTITYNAME$64, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$66, 0);
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
            return get_store().count_elements(TIMEZONERULEVERSIONNUMBER$66) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TIMEZONERULEVERSIONNUMBER$66, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$66);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TIMEZONERULEVERSIONNUMBER$66);
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
            get_store().remove_element(TIMEZONERULEVERSIONNUMBER$66, 0);
        }
    }
    
    /**
     * Gets the "totalcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getTotalcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOTALCOUNT$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "totalcount" element
     */
    public boolean isSetTotalcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCOUNT$68) != 0;
        }
    }
    
    /**
     * Sets the "totalcount" element
     */
    public void setTotalcount(com.microsoft.schemas.crm._2006.webservices.CrmNumber totalcount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(TOTALCOUNT$68, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOTALCOUNT$68);
            }
            target.set(totalcount);
        }
    }
    
    /**
     * Appends and returns a new empty "totalcount" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewTotalcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(TOTALCOUNT$68);
            return target;
        }
    }
    
    /**
     * Unsets the "totalcount" element
     */
    public void unsetTotalcount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCOUNT$68, 0);
        }
    }
    
    /**
     * Gets the "usesystemmap" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getUsesystemmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USESYSTEMMAP$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesystemmap" element
     */
    public boolean isSetUsesystemmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESYSTEMMAP$70) != 0;
        }
    }
    
    /**
     * Sets the "usesystemmap" element
     */
    public void setUsesystemmap(com.microsoft.schemas.crm._2006.webservices.CrmBoolean usesystemmap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(USESYSTEMMAP$70, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USESYSTEMMAP$70);
            }
            target.set(usesystemmap);
        }
    }
    
    /**
     * Appends and returns a new empty "usesystemmap" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewUsesystemmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(USESYSTEMMAP$70);
            return target;
        }
    }
    
    /**
     * Unsets the "usesystemmap" element
     */
    public void unsetUsesystemmap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESYSTEMMAP$70, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$72, 0);
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
            return get_store().count_elements(UTCCONVERSIONTIMEZONECODE$72) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(UTCCONVERSIONTIMEZONECODE$72, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$72);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(UTCCONVERSIONTIMEZONECODE$72);
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
            get_store().remove_element(UTCCONVERSIONTIMEZONECODE$72, 0);
        }
    }
}

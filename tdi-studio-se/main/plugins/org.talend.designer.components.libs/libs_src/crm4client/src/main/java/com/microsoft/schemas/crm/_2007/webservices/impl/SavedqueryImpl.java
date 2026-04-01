/*
 * XML Type:  savedquery
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Savedquery
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML savedquery(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SavedqueryImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Savedquery
{
    
    public SavedqueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNSETXML$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "columnsetxml");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMIZATIONLEVEL$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customizationlevel");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName FETCHXML$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fetchxml");
    private static final javax.xml.namespace.QName INPRODUCTION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "inproduction");
    private static final javax.xml.namespace.QName ISCUSTOMIZABLE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "iscustomizable");
    private static final javax.xml.namespace.QName ISDEFAULT$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isdefault");
    private static final javax.xml.namespace.QName ISPRIVATE$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isprivate");
    private static final javax.xml.namespace.QName ISQUICKFINDQUERY$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isquickfindquery");
    private static final javax.xml.namespace.QName ISUSERDEFINED$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "isuserdefined");
    private static final javax.xml.namespace.QName LAYOUTXML$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "layoutxml");
    private static final javax.xml.namespace.QName MODIFIEDBY$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName NAME$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName ORGANIZATIONID$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName QUERYAPI$34 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queryapi");
    private static final javax.xml.namespace.QName QUERYAPPUSAGE$36 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "queryappusage");
    private static final javax.xml.namespace.QName QUERYTYPE$38 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "querytype");
    private static final javax.xml.namespace.QName RETURNEDTYPECODE$40 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "returnedtypecode");
    private static final javax.xml.namespace.QName SAVEDQUERYID$42 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "savedqueryid");
    private static final javax.xml.namespace.QName SAVEDQUERYIDUNIQUE$44 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "savedqueryidunique");
    
    
    /**
     * Gets the "columnsetxml" element
     */
    public java.lang.String getColumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNSETXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnsetxml" element
     */
    public org.apache.xmlbeans.XmlString xgetColumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNSETXML$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "columnsetxml" element
     */
    public boolean isSetColumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLUMNSETXML$0) != 0;
        }
    }
    
    /**
     * Sets the "columnsetxml" element
     */
    public void setColumnsetxml(java.lang.String columnsetxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNSETXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNSETXML$0);
            }
            target.setStringValue(columnsetxml);
        }
    }
    
    /**
     * Sets (as xml) the "columnsetxml" element
     */
    public void xsetColumnsetxml(org.apache.xmlbeans.XmlString columnsetxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COLUMNSETXML$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COLUMNSETXML$0);
            }
            target.set(columnsetxml);
        }
    }
    
    /**
     * Unsets the "columnsetxml" element
     */
    public void unsetColumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLUMNSETXML$0, 0);
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
     * Gets the "customizationlevel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customizationlevel" element
     */
    public boolean isSetCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMIZATIONLEVEL$6) != 0;
        }
    }
    
    /**
     * Sets the "customizationlevel" element
     */
    public void setCustomizationlevel(com.microsoft.schemas.crm._2006.webservices.CrmNumber customizationlevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$6);
            }
            target.set(customizationlevel);
        }
    }
    
    /**
     * Appends and returns a new empty "customizationlevel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "customizationlevel" element
     */
    public void unsetCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMIZATIONLEVEL$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
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
            return get_store().count_elements(DESCRIPTION$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "fetchxml" element
     */
    public java.lang.String getFetchxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXML$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fetchxml" element
     */
    public org.apache.xmlbeans.XmlString xgetFetchxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXML$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "fetchxml" element
     */
    public boolean isSetFetchxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FETCHXML$10) != 0;
        }
    }
    
    /**
     * Sets the "fetchxml" element
     */
    public void setFetchxml(java.lang.String fetchxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FETCHXML$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FETCHXML$10);
            }
            target.setStringValue(fetchxml);
        }
    }
    
    /**
     * Sets (as xml) the "fetchxml" element
     */
    public void xsetFetchxml(org.apache.xmlbeans.XmlString fetchxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FETCHXML$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FETCHXML$10);
            }
            target.set(fetchxml);
        }
    }
    
    /**
     * Unsets the "fetchxml" element
     */
    public void unsetFetchxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FETCHXML$10, 0);
        }
    }
    
    /**
     * Gets the "inproduction" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getInproduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(INPRODUCTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inproduction" element
     */
    public boolean isSetInproduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPRODUCTION$12) != 0;
        }
    }
    
    /**
     * Sets the "inproduction" element
     */
    public void setInproduction(com.microsoft.schemas.crm._2006.webservices.CrmBoolean inproduction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(INPRODUCTION$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(INPRODUCTION$12);
            }
            target.set(inproduction);
        }
    }
    
    /**
     * Appends and returns a new empty "inproduction" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewInproduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(INPRODUCTION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "inproduction" element
     */
    public void unsetInproduction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPRODUCTION$12, 0);
        }
    }
    
    /**
     * Gets the "iscustomizable" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIscustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCUSTOMIZABLE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "iscustomizable" element
     */
    public boolean isSetIscustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCUSTOMIZABLE$14) != 0;
        }
    }
    
    /**
     * Sets the "iscustomizable" element
     */
    public void setIscustomizable(com.microsoft.schemas.crm._2006.webservices.CrmBoolean iscustomizable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISCUSTOMIZABLE$14, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCUSTOMIZABLE$14);
            }
            target.set(iscustomizable);
        }
    }
    
    /**
     * Appends and returns a new empty "iscustomizable" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIscustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISCUSTOMIZABLE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "iscustomizable" element
     */
    public void unsetIscustomizable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCUSTOMIZABLE$14, 0);
        }
    }
    
    /**
     * Gets the "isdefault" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsdefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDEFAULT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isdefault" element
     */
    public boolean isSetIsdefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISDEFAULT$16) != 0;
        }
    }
    
    /**
     * Sets the "isdefault" element
     */
    public void setIsdefault(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISDEFAULT$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDEFAULT$16);
            }
            target.set(isdefault);
        }
    }
    
    /**
     * Appends and returns a new empty "isdefault" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsdefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISDEFAULT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "isdefault" element
     */
    public void unsetIsdefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISDEFAULT$16, 0);
        }
    }
    
    /**
     * Gets the "isprivate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsprivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRIVATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isprivate" element
     */
    public boolean isSetIsprivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISPRIVATE$18) != 0;
        }
    }
    
    /**
     * Sets the "isprivate" element
     */
    public void setIsprivate(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isprivate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISPRIVATE$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRIVATE$18);
            }
            target.set(isprivate);
        }
    }
    
    /**
     * Appends and returns a new empty "isprivate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsprivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISPRIVATE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "isprivate" element
     */
    public void unsetIsprivate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISPRIVATE$18, 0);
        }
    }
    
    /**
     * Gets the "isquickfindquery" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsquickfindquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISQUICKFINDQUERY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isquickfindquery" element
     */
    public boolean isSetIsquickfindquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISQUICKFINDQUERY$20) != 0;
        }
    }
    
    /**
     * Sets the "isquickfindquery" element
     */
    public void setIsquickfindquery(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isquickfindquery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISQUICKFINDQUERY$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISQUICKFINDQUERY$20);
            }
            target.set(isquickfindquery);
        }
    }
    
    /**
     * Appends and returns a new empty "isquickfindquery" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsquickfindquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISQUICKFINDQUERY$20);
            return target;
        }
    }
    
    /**
     * Unsets the "isquickfindquery" element
     */
    public void unsetIsquickfindquery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISQUICKFINDQUERY$20, 0);
        }
    }
    
    /**
     * Gets the "isuserdefined" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getIsuserdefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISUSERDEFINED$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isuserdefined" element
     */
    public boolean isSetIsuserdefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISUSERDEFINED$22) != 0;
        }
    }
    
    /**
     * Sets the "isuserdefined" element
     */
    public void setIsuserdefined(com.microsoft.schemas.crm._2006.webservices.CrmBoolean isuserdefined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(ISUSERDEFINED$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISUSERDEFINED$22);
            }
            target.set(isuserdefined);
        }
    }
    
    /**
     * Appends and returns a new empty "isuserdefined" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewIsuserdefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(ISUSERDEFINED$22);
            return target;
        }
    }
    
    /**
     * Unsets the "isuserdefined" element
     */
    public void unsetIsuserdefined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISUSERDEFINED$22, 0);
        }
    }
    
    /**
     * Gets the "layoutxml" element
     */
    public java.lang.String getLayoutxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUTXML$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "layoutxml" element
     */
    public org.apache.xmlbeans.XmlString xgetLayoutxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUTXML$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "layoutxml" element
     */
    public boolean isSetLayoutxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYOUTXML$24) != 0;
        }
    }
    
    /**
     * Sets the "layoutxml" element
     */
    public void setLayoutxml(java.lang.String layoutxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYOUTXML$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYOUTXML$24);
            }
            target.setStringValue(layoutxml);
        }
    }
    
    /**
     * Sets (as xml) the "layoutxml" element
     */
    public void xsetLayoutxml(org.apache.xmlbeans.XmlString layoutxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYOUTXML$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAYOUTXML$24);
            }
            target.set(layoutxml);
        }
    }
    
    /**
     * Unsets the "layoutxml" element
     */
    public void unsetLayoutxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYOUTXML$24, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$26, 0);
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
            return get_store().count_elements(MODIFIEDBY$26) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$26);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$26);
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
            get_store().remove_element(MODIFIEDBY$26, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$28, 0);
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
            return get_store().count_elements(MODIFIEDON$28) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$28);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$28);
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
            get_store().remove_element(MODIFIEDON$28, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$30, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$30, 0);
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
            return get_store().count_elements(NAME$30) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$30);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$30);
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
            get_store().remove_element(NAME$30, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$32, 0);
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
            return get_store().count_elements(ORGANIZATIONID$32) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$32);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$32);
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
            get_store().remove_element(ORGANIZATIONID$32, 0);
        }
    }
    
    /**
     * Gets the "queryapi" element
     */
    public java.lang.String getQueryapi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYAPI$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryapi" element
     */
    public org.apache.xmlbeans.XmlString xgetQueryapi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYAPI$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "queryapi" element
     */
    public boolean isSetQueryapi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYAPI$34) != 0;
        }
    }
    
    /**
     * Sets the "queryapi" element
     */
    public void setQueryapi(java.lang.String queryapi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYAPI$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYAPI$34);
            }
            target.setStringValue(queryapi);
        }
    }
    
    /**
     * Sets (as xml) the "queryapi" element
     */
    public void xsetQueryapi(org.apache.xmlbeans.XmlString queryapi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYAPI$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYAPI$34);
            }
            target.set(queryapi);
        }
    }
    
    /**
     * Unsets the "queryapi" element
     */
    public void unsetQueryapi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYAPI$34, 0);
        }
    }
    
    /**
     * Gets the "queryappusage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getQueryappusage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUERYAPPUSAGE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "queryappusage" element
     */
    public boolean isSetQueryappusage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYAPPUSAGE$36) != 0;
        }
    }
    
    /**
     * Sets the "queryappusage" element
     */
    public void setQueryappusage(com.microsoft.schemas.crm._2006.webservices.CrmNumber queryappusage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUERYAPPUSAGE$36, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUERYAPPUSAGE$36);
            }
            target.set(queryappusage);
        }
    }
    
    /**
     * Appends and returns a new empty "queryappusage" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQueryappusage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUERYAPPUSAGE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "queryappusage" element
     */
    public void unsetQueryappusage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYAPPUSAGE$36, 0);
        }
    }
    
    /**
     * Gets the "querytype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getQuerytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUERYTYPE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "querytype" element
     */
    public boolean isSetQuerytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYTYPE$38) != 0;
        }
    }
    
    /**
     * Sets the "querytype" element
     */
    public void setQuerytype(com.microsoft.schemas.crm._2006.webservices.CrmNumber querytype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(QUERYTYPE$38, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUERYTYPE$38);
            }
            target.set(querytype);
        }
    }
    
    /**
     * Appends and returns a new empty "querytype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewQuerytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(QUERYTYPE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "querytype" element
     */
    public void unsetQuerytype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYTYPE$38, 0);
        }
    }
    
    /**
     * Gets the "returnedtypecode" element
     */
    public java.lang.String getReturnedtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEDTYPECODE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "returnedtypecode" element
     */
    public org.apache.xmlbeans.XmlString xgetReturnedtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURNEDTYPECODE$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "returnedtypecode" element
     */
    public boolean isSetReturnedtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURNEDTYPECODE$40) != 0;
        }
    }
    
    /**
     * Sets the "returnedtypecode" element
     */
    public void setReturnedtypecode(java.lang.String returnedtypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURNEDTYPECODE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURNEDTYPECODE$40);
            }
            target.setStringValue(returnedtypecode);
        }
    }
    
    /**
     * Sets (as xml) the "returnedtypecode" element
     */
    public void xsetReturnedtypecode(org.apache.xmlbeans.XmlString returnedtypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURNEDTYPECODE$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURNEDTYPECODE$40);
            }
            target.set(returnedtypecode);
        }
    }
    
    /**
     * Unsets the "returnedtypecode" element
     */
    public void unsetReturnedtypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURNEDTYPECODE$40, 0);
        }
    }
    
    /**
     * Gets the "savedqueryid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSavedqueryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SAVEDQUERYID$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "savedqueryid" element
     */
    public boolean isSetSavedqueryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEDQUERYID$42) != 0;
        }
    }
    
    /**
     * Sets the "savedqueryid" element
     */
    public void setSavedqueryid(com.microsoft.schemas.crm._2006.webservices.Key savedqueryid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SAVEDQUERYID$42, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SAVEDQUERYID$42);
            }
            target.set(savedqueryid);
        }
    }
    
    /**
     * Appends and returns a new empty "savedqueryid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSavedqueryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SAVEDQUERYID$42);
            return target;
        }
    }
    
    /**
     * Unsets the "savedqueryid" element
     */
    public void unsetSavedqueryid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEDQUERYID$42, 0);
        }
    }
    
    /**
     * Gets the "savedqueryidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSavedqueryidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SAVEDQUERYIDUNIQUE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "savedqueryidunique" element
     */
    public boolean isSetSavedqueryidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAVEDQUERYIDUNIQUE$44) != 0;
        }
    }
    
    /**
     * Sets the "savedqueryidunique" element
     */
    public void setSavedqueryidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier savedqueryidunique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SAVEDQUERYIDUNIQUE$44, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SAVEDQUERYIDUNIQUE$44);
            }
            target.set(savedqueryidunique);
        }
    }
    
    /**
     * Appends and returns a new empty "savedqueryidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSavedqueryidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SAVEDQUERYIDUNIQUE$44);
            return target;
        }
    }
    
    /**
     * Unsets the "savedqueryidunique" element
     */
    public void unsetSavedqueryidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAVEDQUERYIDUNIQUE$44, 0);
        }
    }
}

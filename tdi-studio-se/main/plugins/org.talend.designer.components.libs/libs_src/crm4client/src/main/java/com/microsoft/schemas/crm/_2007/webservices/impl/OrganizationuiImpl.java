/*
 * XML Type:  organizationui
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Organizationui
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML organizationui(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class OrganizationuiImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Organizationui
{
    
    public OrganizationuiImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMIZATIONLEVEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customizationlevel");
    private static final javax.xml.namespace.QName FIELDXML$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "fieldxml");
    private static final javax.xml.namespace.QName FORMID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "formid");
    private static final javax.xml.namespace.QName FORMIDUNIQUE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "formidunique");
    private static final javax.xml.namespace.QName FORMXML$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "formxml");
    private static final javax.xml.namespace.QName GRIDICON$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "gridicon");
    private static final javax.xml.namespace.QName INPRODUCTION$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "inproduction");
    private static final javax.xml.namespace.QName LARGEENTITYICON$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "largeentityicon");
    private static final javax.xml.namespace.QName OBJECTTYPECODE$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "objecttypecode");
    private static final javax.xml.namespace.QName ORGANIZATIONID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName OUTLOOKSHORTCUTICON$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "outlookshortcuticon");
    private static final javax.xml.namespace.QName PREVIEWCOLUMNSETXML$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "previewcolumnsetxml");
    private static final javax.xml.namespace.QName PREVIEWXML$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "previewxml");
    private static final javax.xml.namespace.QName VERSION$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "version");
    
    
    /**
     * Gets the "customizationlevel" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getCustomizationlevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$0, 0);
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
            return get_store().count_elements(CUSTOMIZATIONLEVEL$0) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(CUSTOMIZATIONLEVEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(CUSTOMIZATIONLEVEL$0);
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
            get_store().remove_element(CUSTOMIZATIONLEVEL$0, 0);
        }
    }
    
    /**
     * Gets the "fieldxml" element
     */
    public java.lang.String getFieldxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDXML$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldxml" element
     */
    public org.apache.xmlbeans.XmlString xgetFieldxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDXML$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "fieldxml" element
     */
    public boolean isSetFieldxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDXML$2) != 0;
        }
    }
    
    /**
     * Sets the "fieldxml" element
     */
    public void setFieldxml(java.lang.String fieldxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDXML$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDXML$2);
            }
            target.setStringValue(fieldxml);
        }
    }
    
    /**
     * Sets (as xml) the "fieldxml" element
     */
    public void xsetFieldxml(org.apache.xmlbeans.XmlString fieldxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FIELDXML$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FIELDXML$2);
            }
            target.set(fieldxml);
        }
    }
    
    /**
     * Unsets the "fieldxml" element
     */
    public void unsetFieldxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDXML$2, 0);
        }
    }
    
    /**
     * Gets the "formid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getFormid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(FORMID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formid" element
     */
    public boolean isSetFormid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMID$4) != 0;
        }
    }
    
    /**
     * Sets the "formid" element
     */
    public void setFormid(com.microsoft.schemas.crm._2006.webservices.Key formid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(FORMID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(FORMID$4);
            }
            target.set(formid);
        }
    }
    
    /**
     * Appends and returns a new empty "formid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewFormid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(FORMID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "formid" element
     */
    public void unsetFormid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMID$4, 0);
        }
    }
    
    /**
     * Gets the "formidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getFormidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(FORMIDUNIQUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formidunique" element
     */
    public boolean isSetFormidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMIDUNIQUE$6) != 0;
        }
    }
    
    /**
     * Sets the "formidunique" element
     */
    public void setFormidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier formidunique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(FORMIDUNIQUE$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(FORMIDUNIQUE$6);
            }
            target.set(formidunique);
        }
    }
    
    /**
     * Appends and returns a new empty "formidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewFormidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(FORMIDUNIQUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "formidunique" element
     */
    public void unsetFormidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMIDUNIQUE$6, 0);
        }
    }
    
    /**
     * Gets the "formxml" element
     */
    public java.lang.String getFormxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMXML$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formxml" element
     */
    public org.apache.xmlbeans.XmlString xgetFormxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMXML$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "formxml" element
     */
    public boolean isSetFormxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMXML$8) != 0;
        }
    }
    
    /**
     * Sets the "formxml" element
     */
    public void setFormxml(java.lang.String formxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMXML$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMXML$8);
            }
            target.setStringValue(formxml);
        }
    }
    
    /**
     * Sets (as xml) the "formxml" element
     */
    public void xsetFormxml(org.apache.xmlbeans.XmlString formxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMXML$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMXML$8);
            }
            target.set(formxml);
        }
    }
    
    /**
     * Unsets the "formxml" element
     */
    public void unsetFormxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMXML$8, 0);
        }
    }
    
    /**
     * Gets the "gridicon" element
     */
    public java.lang.String getGridicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRIDICON$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "gridicon" element
     */
    public org.apache.xmlbeans.XmlString xgetGridicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GRIDICON$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "gridicon" element
     */
    public boolean isSetGridicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRIDICON$10) != 0;
        }
    }
    
    /**
     * Sets the "gridicon" element
     */
    public void setGridicon(java.lang.String gridicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRIDICON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRIDICON$10);
            }
            target.setStringValue(gridicon);
        }
    }
    
    /**
     * Sets (as xml) the "gridicon" element
     */
    public void xsetGridicon(org.apache.xmlbeans.XmlString gridicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GRIDICON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GRIDICON$10);
            }
            target.set(gridicon);
        }
    }
    
    /**
     * Unsets the "gridicon" element
     */
    public void unsetGridicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRIDICON$10, 0);
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
     * Gets the "largeentityicon" element
     */
    public java.lang.String getLargeentityicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGEENTITYICON$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "largeentityicon" element
     */
    public org.apache.xmlbeans.XmlString xgetLargeentityicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LARGEENTITYICON$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "largeentityicon" element
     */
    public boolean isSetLargeentityicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LARGEENTITYICON$14) != 0;
        }
    }
    
    /**
     * Sets the "largeentityicon" element
     */
    public void setLargeentityicon(java.lang.String largeentityicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LARGEENTITYICON$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LARGEENTITYICON$14);
            }
            target.setStringValue(largeentityicon);
        }
    }
    
    /**
     * Sets (as xml) the "largeentityicon" element
     */
    public void xsetLargeentityicon(org.apache.xmlbeans.XmlString largeentityicon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LARGEENTITYICON$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LARGEENTITYICON$14);
            }
            target.set(largeentityicon);
        }
    }
    
    /**
     * Unsets the "largeentityicon" element
     */
    public void unsetLargeentityicon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LARGEENTITYICON$14, 0);
        }
    }
    
    /**
     * Gets the "objecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference getObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objecttypecode" element
     */
    public boolean isSetObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPECODE$16) != 0;
        }
    }
    
    /**
     * Sets the "objecttypecode" element
     */
    public void setObjecttypecode(com.microsoft.schemas.crm._2006.webservices.EntityNameReference objecttypecode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().find_element_user(OBJECTTYPECODE$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$16);
            }
            target.set(objecttypecode);
        }
    }
    
    /**
     * Appends and returns a new empty "objecttypecode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.EntityNameReference addNewObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.EntityNameReference target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.EntityNameReference)get_store().add_element_user(OBJECTTYPECODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "objecttypecode" element
     */
    public void unsetObjecttypecode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPECODE$16, 0);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$18, 0);
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
            return get_store().count_elements(ORGANIZATIONID$18) != 0;
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ORGANIZATIONID$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$18);
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
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ORGANIZATIONID$18);
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
            get_store().remove_element(ORGANIZATIONID$18, 0);
        }
    }
    
    /**
     * Gets the "outlookshortcuticon" element
     */
    public java.lang.String getOutlookshortcuticon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTLOOKSHORTCUTICON$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outlookshortcuticon" element
     */
    public org.apache.xmlbeans.XmlString xgetOutlookshortcuticon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTLOOKSHORTCUTICON$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "outlookshortcuticon" element
     */
    public boolean isSetOutlookshortcuticon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLOOKSHORTCUTICON$20) != 0;
        }
    }
    
    /**
     * Sets the "outlookshortcuticon" element
     */
    public void setOutlookshortcuticon(java.lang.String outlookshortcuticon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTLOOKSHORTCUTICON$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTLOOKSHORTCUTICON$20);
            }
            target.setStringValue(outlookshortcuticon);
        }
    }
    
    /**
     * Sets (as xml) the "outlookshortcuticon" element
     */
    public void xsetOutlookshortcuticon(org.apache.xmlbeans.XmlString outlookshortcuticon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OUTLOOKSHORTCUTICON$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OUTLOOKSHORTCUTICON$20);
            }
            target.set(outlookshortcuticon);
        }
    }
    
    /**
     * Unsets the "outlookshortcuticon" element
     */
    public void unsetOutlookshortcuticon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLOOKSHORTCUTICON$20, 0);
        }
    }
    
    /**
     * Gets the "previewcolumnsetxml" element
     */
    public java.lang.String getPreviewcolumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWCOLUMNSETXML$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "previewcolumnsetxml" element
     */
    public org.apache.xmlbeans.XmlString xgetPreviewcolumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWCOLUMNSETXML$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "previewcolumnsetxml" element
     */
    public boolean isSetPreviewcolumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIEWCOLUMNSETXML$22) != 0;
        }
    }
    
    /**
     * Sets the "previewcolumnsetxml" element
     */
    public void setPreviewcolumnsetxml(java.lang.String previewcolumnsetxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWCOLUMNSETXML$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIEWCOLUMNSETXML$22);
            }
            target.setStringValue(previewcolumnsetxml);
        }
    }
    
    /**
     * Sets (as xml) the "previewcolumnsetxml" element
     */
    public void xsetPreviewcolumnsetxml(org.apache.xmlbeans.XmlString previewcolumnsetxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWCOLUMNSETXML$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIEWCOLUMNSETXML$22);
            }
            target.set(previewcolumnsetxml);
        }
    }
    
    /**
     * Unsets the "previewcolumnsetxml" element
     */
    public void unsetPreviewcolumnsetxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIEWCOLUMNSETXML$22, 0);
        }
    }
    
    /**
     * Gets the "previewxml" element
     */
    public java.lang.String getPreviewxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWXML$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "previewxml" element
     */
    public org.apache.xmlbeans.XmlString xgetPreviewxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWXML$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "previewxml" element
     */
    public boolean isSetPreviewxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIEWXML$24) != 0;
        }
    }
    
    /**
     * Sets the "previewxml" element
     */
    public void setPreviewxml(java.lang.String previewxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWXML$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIEWXML$24);
            }
            target.setStringValue(previewxml);
        }
    }
    
    /**
     * Sets (as xml) the "previewxml" element
     */
    public void xsetPreviewxml(org.apache.xmlbeans.XmlString previewxml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWXML$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIEWXML$24);
            }
            target.set(previewxml);
        }
    }
    
    /**
     * Unsets the "previewxml" element
     */
    public void unsetPreviewxml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIEWXML$24, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(VERSION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$26) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(com.microsoft.schemas.crm._2006.webservices.CrmNumber version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(VERSION$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(VERSION$26);
            }
            target.set(version);
        }
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(VERSION$26);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$26, 0);
        }
    }
}

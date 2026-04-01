/*
 * XML Type:  sdkmessageprocessingstepimage
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML sdkmessageprocessingstepimage(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SdkmessageprocessingstepimageImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Sdkmessageprocessingstepimage
{
    
    public SdkmessageprocessingstepimageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "attributes");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName CUSTOMIZATIONLEVEL$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "customizationlevel");
    private static final javax.xml.namespace.QName ENTITYALIAS$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "entityalias");
    private static final javax.xml.namespace.QName IMAGETYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "imagetype");
    private static final javax.xml.namespace.QName MESSAGEPROPERTYNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "messagepropertyname");
    private static final javax.xml.namespace.QName MODIFIEDBY$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName ORGANIZATIONID$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "organizationid");
    private static final javax.xml.namespace.QName RELATEDATTRIBUTENAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "relatedattributename");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPID$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageprocessingstepid");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPIMAGEID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageprocessingstepimageid");
    private static final javax.xml.namespace.QName SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "sdkmessageprocessingstepimageidunique");
    
    
    /**
     * Gets the "attributes" element
     */
    public java.lang.String getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributes" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTES$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$0) != 0;
        }
    }
    
    /**
     * Sets the "attributes" element
     */
    public void setAttributes(java.lang.String attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.setStringValue(attributes);
        }
    }
    
    /**
     * Sets (as xml) the "attributes" element
     */
    public void xsetAttributes(org.apache.xmlbeans.XmlString attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTES$0);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Unsets the "attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$0, 0);
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
     * Gets the "entityalias" element
     */
    public java.lang.String getEntityalias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entityalias" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityalias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "entityalias" element
     */
    public boolean isSetEntityalias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYALIAS$8) != 0;
        }
    }
    
    /**
     * Sets the "entityalias" element
     */
    public void setEntityalias(java.lang.String entityalias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYALIAS$8);
            }
            target.setStringValue(entityalias);
        }
    }
    
    /**
     * Sets (as xml) the "entityalias" element
     */
    public void xsetEntityalias(org.apache.xmlbeans.XmlString entityalias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$8);
            }
            target.set(entityalias);
        }
    }
    
    /**
     * Unsets the "entityalias" element
     */
    public void unsetEntityalias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYALIAS$8, 0);
        }
    }
    
    /**
     * Gets the "imagetype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getImagetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(IMAGETYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "imagetype" element
     */
    public boolean isSetImagetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGETYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "imagetype" element
     */
    public void setImagetype(com.microsoft.schemas.crm._2006.webservices.Picklist imagetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(IMAGETYPE$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(IMAGETYPE$10);
            }
            target.set(imagetype);
        }
    }
    
    /**
     * Appends and returns a new empty "imagetype" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewImagetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(IMAGETYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "imagetype" element
     */
    public void unsetImagetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGETYPE$10, 0);
        }
    }
    
    /**
     * Gets the "messagepropertyname" element
     */
    public java.lang.String getMessagepropertyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "messagepropertyname" element
     */
    public org.apache.xmlbeans.XmlString xgetMessagepropertyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "messagepropertyname" element
     */
    public boolean isSetMessagepropertyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEPROPERTYNAME$12) != 0;
        }
    }
    
    /**
     * Sets the "messagepropertyname" element
     */
    public void setMessagepropertyname(java.lang.String messagepropertyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEPROPERTYNAME$12);
            }
            target.setStringValue(messagepropertyname);
        }
    }
    
    /**
     * Sets (as xml) the "messagepropertyname" element
     */
    public void xsetMessagepropertyname(org.apache.xmlbeans.XmlString messagepropertyname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEPROPERTYNAME$12);
            }
            target.set(messagepropertyname);
        }
    }
    
    /**
     * Unsets the "messagepropertyname" element
     */
    public void unsetMessagepropertyname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEPROPERTYNAME$12, 0);
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
     * Gets the "relatedattributename" element
     */
    public java.lang.String getRelatedattributename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDATTRIBUTENAME$20, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDATTRIBUTENAME$20, 0);
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
            return get_store().count_elements(RELATEDATTRIBUTENAME$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATEDATTRIBUTENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATEDATTRIBUTENAME$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATEDATTRIBUTENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATEDATTRIBUTENAME$20);
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
            get_store().remove_element(RELATEDATTRIBUTENAME$20, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageprocessingstepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getSdkmessageprocessingstepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageprocessingstepid" element
     */
    public boolean isSetSdkmessageprocessingstepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPID$22) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageprocessingstepid" element
     */
    public void setSdkmessageprocessingstepid(com.microsoft.schemas.crm._2006.webservices.Lookup sdkmessageprocessingstepid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPID$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPID$22);
            }
            target.set(sdkmessageprocessingstepid);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewSdkmessageprocessingstepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageprocessingstepid" element
     */
    public void unsetSdkmessageprocessingstepid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPID$22, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageprocessingstepimageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getSdkmessageprocessingstepimageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageprocessingstepimageid" element
     */
    public boolean isSetSdkmessageprocessingstepimageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPIMAGEID$24) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageprocessingstepimageid" element
     */
    public void setSdkmessageprocessingstepimageid(com.microsoft.schemas.crm._2006.webservices.Key sdkmessageprocessingstepimageid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEID$24);
            }
            target.set(sdkmessageprocessingstepimageid);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepimageid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewSdkmessageprocessingstepimageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEID$24);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageprocessingstepimageid" element
     */
    public void unsetSdkmessageprocessingstepimageid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPIMAGEID$24, 0);
        }
    }
    
    /**
     * Gets the "sdkmessageprocessingstepimageidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getSdkmessageprocessingstepimageidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sdkmessageprocessingstepimageidunique" element
     */
    public boolean isSetSdkmessageprocessingstepimageidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26) != 0;
        }
    }
    
    /**
     * Sets the "sdkmessageprocessingstepimageidunique" element
     */
    public void setSdkmessageprocessingstepimageidunique(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier sdkmessageprocessingstepimageidunique)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26);
            }
            target.set(sdkmessageprocessingstepimageidunique);
        }
    }
    
    /**
     * Appends and returns a new empty "sdkmessageprocessingstepimageidunique" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewSdkmessageprocessingstepimageidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "sdkmessageprocessingstepimageidunique" element
     */
    public void unsetSdkmessageprocessingstepimageidunique()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SDKMESSAGEPROCESSINGSTEPIMAGEIDUNIQUE$26, 0);
        }
    }
}

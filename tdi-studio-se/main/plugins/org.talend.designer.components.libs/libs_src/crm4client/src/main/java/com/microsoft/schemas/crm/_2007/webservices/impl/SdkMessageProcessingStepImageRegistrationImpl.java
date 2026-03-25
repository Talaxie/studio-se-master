/*
 * XML Type:  SdkMessageProcessingStepImageRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SdkMessageProcessingStepImageRegistration(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepImageRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepImageRegistration
{
    
    public SdkMessageProcessingStepImageRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEPROPERTYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MessagePropertyName");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Attributes");
    private static final javax.xml.namespace.QName ENTITYALIAS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityAlias");
    private static final javax.xml.namespace.QName IMAGETYPE$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImageType");
    
    
    /**
     * Gets the "MessagePropertyName" element
     */
    public java.lang.String getMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessagePropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MessagePropertyName" element
     */
    public boolean isSetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEPROPERTYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "MessagePropertyName" element
     */
    public void setMessagePropertyName(java.lang.String messagePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEPROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEPROPERTYNAME$0);
            }
            target.setStringValue(messagePropertyName);
        }
    }
    
    /**
     * Sets (as xml) the "MessagePropertyName" element
     */
    public void xsetMessagePropertyName(org.apache.xmlbeans.XmlString messagePropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEPROPERTYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEPROPERTYNAME$0);
            }
            target.set(messagePropertyName);
        }
    }
    
    /**
     * Unsets the "MessagePropertyName" element
     */
    public void unsetMessagePropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEPROPERTYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(com.microsoft.schemas.crm._2007.webservices.ArrayOfString attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ATTRIBUTES$2);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfString addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfString target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfString)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$2, 0);
        }
    }
    
    /**
     * Gets the "EntityAlias" element
     */
    public java.lang.String getEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityAlias" element
     */
    public org.apache.xmlbeans.XmlString xgetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "EntityAlias" element
     */
    public boolean isSetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYALIAS$4) != 0;
        }
    }
    
    /**
     * Sets the "EntityAlias" element
     */
    public void setEntityAlias(java.lang.String entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYALIAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYALIAS$4);
            }
            target.setStringValue(entityAlias);
        }
    }
    
    /**
     * Sets (as xml) the "EntityAlias" element
     */
    public void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTITYALIAS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTITYALIAS$4);
            }
            target.set(entityAlias);
        }
    }
    
    /**
     * Unsets the "EntityAlias" element
     */
    public void unsetEntityAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYALIAS$4, 0);
        }
    }
    
    /**
     * Gets the "ImageType" element
     */
    public int getImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGETYPE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImageType" element
     */
    public org.apache.xmlbeans.XmlInt xgetImageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImageType" element
     */
    public void setImageType(int imageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMAGETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMAGETYPE$6);
            }
            target.setIntValue(imageType);
        }
    }
    
    /**
     * Sets (as xml) the "ImageType" element
     */
    public void xsetImageType(org.apache.xmlbeans.XmlInt imageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(IMAGETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(IMAGETYPE$6);
            }
            target.set(imageType);
        }
    }
}

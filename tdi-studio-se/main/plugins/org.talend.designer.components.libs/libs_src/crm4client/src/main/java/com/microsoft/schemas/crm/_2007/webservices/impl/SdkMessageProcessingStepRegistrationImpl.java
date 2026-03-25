/*
 * XML Type:  SdkMessageProcessingStepRegistration
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SdkMessageProcessingStepRegistration(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SdkMessageProcessingStepRegistrationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.SdkMessageProcessingStepRegistration
{
    
    public SdkMessageProcessingStepRegistrationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MessageName");
    private static final javax.xml.namespace.QName PRIMARYENTITYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PrimaryEntityName");
    private static final javax.xml.namespace.QName SECONDARYENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SecondaryEntityName");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Description");
    private static final javax.xml.namespace.QName STAGE$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Stage");
    private static final javax.xml.namespace.QName MODE$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Mode");
    private static final javax.xml.namespace.QName IMPERSONATINGUSERID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ImpersonatingUserId");
    private static final javax.xml.namespace.QName SUPPORTEDDEPLOYMENT$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SupportedDeployment");
    private static final javax.xml.namespace.QName FILTERINGATTRIBUTES$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "FilteringAttributes");
    private static final javax.xml.namespace.QName PLUGINTYPEFRIENDLYNAME$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginTypeFriendlyName");
    private static final javax.xml.namespace.QName PLUGINTYPENAME$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "PluginTypeName");
    private static final javax.xml.namespace.QName CUSTOMCONFIGURATION$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CustomConfiguration");
    private static final javax.xml.namespace.QName INVOCATIONSOURCE$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "InvocationSource");
    private static final javax.xml.namespace.QName IMAGES$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Images");
    
    
    /**
     * Gets the "MessageName" element
     */
    public java.lang.String getMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageName" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "MessageName" element
     */
    public boolean isSetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "MessageName" element
     */
    public void setMessageName(java.lang.String messageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGENAME$0);
            }
            target.setStringValue(messageName);
        }
    }
    
    /**
     * Sets (as xml) the "MessageName" element
     */
    public void xsetMessageName(org.apache.xmlbeans.XmlString messageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGENAME$0);
            }
            target.set(messageName);
        }
    }
    
    /**
     * Unsets the "MessageName" element
     */
    public void unsetMessageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGENAME$0, 0);
        }
    }
    
    /**
     * Gets the "PrimaryEntityName" element
     */
    public java.lang.String getPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimaryEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrimaryEntityName" element
     */
    public boolean isSetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYENTITYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryEntityName" element
     */
    public void setPrimaryEntityName(java.lang.String primaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYENTITYNAME$2);
            }
            target.setStringValue(primaryEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "PrimaryEntityName" element
     */
    public void xsetPrimaryEntityName(org.apache.xmlbeans.XmlString primaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIMARYENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIMARYENTITYNAME$2);
            }
            target.set(primaryEntityName);
        }
    }
    
    /**
     * Unsets the "PrimaryEntityName" element
     */
    public void unsetPrimaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYENTITYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "SecondaryEntityName" element
     */
    public java.lang.String getSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYENTITYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecondaryEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecondaryEntityName" element
     */
    public boolean isSetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDARYENTITYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "SecondaryEntityName" element
     */
    public void setSecondaryEntityName(java.lang.String secondaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDARYENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDARYENTITYNAME$4);
            }
            target.setStringValue(secondaryEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "SecondaryEntityName" element
     */
    public void xsetSecondaryEntityName(org.apache.xmlbeans.XmlString secondaryEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECONDARYENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECONDARYENTITYNAME$4);
            }
            target.set(secondaryEntityName);
        }
    }
    
    /**
     * Unsets the "SecondaryEntityName" element
     */
    public void unsetSecondaryEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDARYENTITYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "Stage" element
     */
    public int getStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Stage" element
     */
    public org.apache.xmlbeans.XmlInt xgetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STAGE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Stage" element
     */
    public void setStage(int stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAGE$8);
            }
            target.setIntValue(stage);
        }
    }
    
    /**
     * Sets (as xml) the "Stage" element
     */
    public void xsetStage(org.apache.xmlbeans.XmlInt stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STAGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STAGE$8);
            }
            target.set(stage);
        }
    }
    
    /**
     * Gets the "Mode" element
     */
    public int getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mode" element
     */
    public org.apache.xmlbeans.XmlInt xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Mode" element
     */
    public void setMode(int mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$10);
            }
            target.setIntValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "Mode" element
     */
    public void xsetMode(org.apache.xmlbeans.XmlInt mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MODE$10);
            }
            target.set(mode);
        }
    }
    
    /**
     * Gets the "ImpersonatingUserId" element
     */
    public java.lang.String getImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPERSONATINGUSERID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImpersonatingUserId" element
     */
    public com.microsoft.wsdl.types.Guid xgetImpersonatingUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPERSONATINGUSERID$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImpersonatingUserId" element
     */
    public void setImpersonatingUserId(java.lang.String impersonatingUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPERSONATINGUSERID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPERSONATINGUSERID$12);
            }
            target.setStringValue(impersonatingUserId);
        }
    }
    
    /**
     * Sets (as xml) the "ImpersonatingUserId" element
     */
    public void xsetImpersonatingUserId(com.microsoft.wsdl.types.Guid impersonatingUserId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(IMPERSONATINGUSERID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(IMPERSONATINGUSERID$12);
            }
            target.set(impersonatingUserId);
        }
    }
    
    /**
     * Gets the "SupportedDeployment" element
     */
    public int getSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDDEPLOYMENT$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportedDeployment" element
     */
    public org.apache.xmlbeans.XmlInt xgetSupportedDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUPPORTEDDEPLOYMENT$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SupportedDeployment" element
     */
    public void setSupportedDeployment(int supportedDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDDEPLOYMENT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTEDDEPLOYMENT$14);
            }
            target.setIntValue(supportedDeployment);
        }
    }
    
    /**
     * Sets (as xml) the "SupportedDeployment" element
     */
    public void xsetSupportedDeployment(org.apache.xmlbeans.XmlInt supportedDeployment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUPPORTEDDEPLOYMENT$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUPPORTEDDEPLOYMENT$14);
            }
            target.set(supportedDeployment);
        }
    }
    
    /**
     * Gets the "FilteringAttributes" element
     */
    public java.lang.String getFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERINGATTRIBUTES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FilteringAttributes" element
     */
    public org.apache.xmlbeans.XmlString xgetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "FilteringAttributes" element
     */
    public boolean isSetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERINGATTRIBUTES$16) != 0;
        }
    }
    
    /**
     * Sets the "FilteringAttributes" element
     */
    public void setFilteringAttributes(java.lang.String filteringAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILTERINGATTRIBUTES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILTERINGATTRIBUTES$16);
            }
            target.setStringValue(filteringAttributes);
        }
    }
    
    /**
     * Sets (as xml) the "FilteringAttributes" element
     */
    public void xsetFilteringAttributes(org.apache.xmlbeans.XmlString filteringAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILTERINGATTRIBUTES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILTERINGATTRIBUTES$16);
            }
            target.set(filteringAttributes);
        }
    }
    
    /**
     * Unsets the "FilteringAttributes" element
     */
    public void unsetFilteringAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERINGATTRIBUTES$16, 0);
        }
    }
    
    /**
     * Gets the "PluginTypeFriendlyName" element
     */
    public java.lang.String getPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PluginTypeFriendlyName" element
     */
    public org.apache.xmlbeans.XmlString xgetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "PluginTypeFriendlyName" element
     */
    public boolean isSetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINTYPEFRIENDLYNAME$18) != 0;
        }
    }
    
    /**
     * Sets the "PluginTypeFriendlyName" element
     */
    public void setPluginTypeFriendlyName(java.lang.String pluginTypeFriendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINTYPEFRIENDLYNAME$18);
            }
            target.setStringValue(pluginTypeFriendlyName);
        }
    }
    
    /**
     * Sets (as xml) the "PluginTypeFriendlyName" element
     */
    public void xsetPluginTypeFriendlyName(org.apache.xmlbeans.XmlString pluginTypeFriendlyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPEFRIENDLYNAME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPEFRIENDLYNAME$18);
            }
            target.set(pluginTypeFriendlyName);
        }
    }
    
    /**
     * Unsets the "PluginTypeFriendlyName" element
     */
    public void unsetPluginTypeFriendlyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINTYPEFRIENDLYNAME$18, 0);
        }
    }
    
    /**
     * Gets the "PluginTypeName" element
     */
    public java.lang.String getPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPENAME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PluginTypeName" element
     */
    public org.apache.xmlbeans.XmlString xgetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "PluginTypeName" element
     */
    public boolean isSetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLUGINTYPENAME$20) != 0;
        }
    }
    
    /**
     * Sets the "PluginTypeName" element
     */
    public void setPluginTypeName(java.lang.String pluginTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLUGINTYPENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLUGINTYPENAME$20);
            }
            target.setStringValue(pluginTypeName);
        }
    }
    
    /**
     * Sets (as xml) the "PluginTypeName" element
     */
    public void xsetPluginTypeName(org.apache.xmlbeans.XmlString pluginTypeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLUGINTYPENAME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLUGINTYPENAME$20);
            }
            target.set(pluginTypeName);
        }
    }
    
    /**
     * Unsets the "PluginTypeName" element
     */
    public void unsetPluginTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLUGINTYPENAME$20, 0);
        }
    }
    
    /**
     * Gets the "CustomConfiguration" element
     */
    public java.lang.String getCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMCONFIGURATION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomConfiguration" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomConfiguration" element
     */
    public boolean isSetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMCONFIGURATION$22) != 0;
        }
    }
    
    /**
     * Sets the "CustomConfiguration" element
     */
    public void setCustomConfiguration(java.lang.String customConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMCONFIGURATION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMCONFIGURATION$22);
            }
            target.setStringValue(customConfiguration);
        }
    }
    
    /**
     * Sets (as xml) the "CustomConfiguration" element
     */
    public void xsetCustomConfiguration(org.apache.xmlbeans.XmlString customConfiguration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMCONFIGURATION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMCONFIGURATION$22);
            }
            target.set(customConfiguration);
        }
    }
    
    /**
     * Unsets the "CustomConfiguration" element
     */
    public void unsetCustomConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMCONFIGURATION$22, 0);
        }
    }
    
    /**
     * Gets the "InvocationSource" element
     */
    public int getInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOCATIONSOURCE$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvocationSource" element
     */
    public org.apache.xmlbeans.XmlInt xgetInvocationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOCATIONSOURCE$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InvocationSource" element
     */
    public void setInvocationSource(int invocationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVOCATIONSOURCE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVOCATIONSOURCE$24);
            }
            target.setIntValue(invocationSource);
        }
    }
    
    /**
     * Sets (as xml) the "InvocationSource" element
     */
    public void xsetInvocationSource(org.apache.xmlbeans.XmlInt invocationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVOCATIONSOURCE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INVOCATIONSOURCE$24);
            }
            target.set(invocationSource);
        }
    }
    
    /**
     * Gets the "Images" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration getImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(IMAGES$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Images" element
     */
    public boolean isSetImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMAGES$26) != 0;
        }
    }
    
    /**
     * Sets the "Images" element
     */
    public void setImages(com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration images)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().find_element_user(IMAGES$26, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(IMAGES$26);
            }
            target.set(images);
        }
    }
    
    /**
     * Appends and returns a new empty "Images" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration addNewImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfSdkMessageProcessingStepImageRegistration)get_store().add_element_user(IMAGES$26);
            return target;
        }
    }
    
    /**
     * Unsets the "Images" element
     */
    public void unsetImages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMAGES$26, 0);
        }
    }
}

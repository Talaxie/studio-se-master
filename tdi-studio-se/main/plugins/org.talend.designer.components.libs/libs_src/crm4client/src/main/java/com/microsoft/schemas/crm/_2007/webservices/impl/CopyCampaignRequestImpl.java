/*
 * XML Type:  CopyCampaignRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CopyCampaignRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CopyCampaignRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CopyCampaignRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CopyCampaignRequest
{
    
    public CopyCampaignRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECAMPAIGN$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BaseCampaign");
    private static final javax.xml.namespace.QName SAVEASTEMPLATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SaveAsTemplate");
    
    
    /**
     * Gets the "BaseCampaign" element
     */
    public java.lang.String getBaseCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECAMPAIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BaseCampaign" element
     */
    public com.microsoft.wsdl.types.Guid xgetBaseCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BASECAMPAIGN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BaseCampaign" element
     */
    public void setBaseCampaign(java.lang.String baseCampaign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASECAMPAIGN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASECAMPAIGN$0);
            }
            target.setStringValue(baseCampaign);
        }
    }
    
    /**
     * Sets (as xml) the "BaseCampaign" element
     */
    public void xsetBaseCampaign(com.microsoft.wsdl.types.Guid baseCampaign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(BASECAMPAIGN$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(BASECAMPAIGN$0);
            }
            target.set(baseCampaign);
        }
    }
    
    /**
     * Gets the "SaveAsTemplate" element
     */
    public boolean getSaveAsTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEASTEMPLATE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SaveAsTemplate" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSaveAsTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SAVEASTEMPLATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SaveAsTemplate" element
     */
    public void setSaveAsTemplate(boolean saveAsTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAVEASTEMPLATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAVEASTEMPLATE$2);
            }
            target.setBooleanValue(saveAsTemplate);
        }
    }
    
    /**
     * Sets (as xml) the "SaveAsTemplate" element
     */
    public void xsetSaveAsTemplate(org.apache.xmlbeans.XmlBoolean saveAsTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SAVEASTEMPLATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SAVEASTEMPLATE$2);
            }
            target.set(saveAsTemplate);
        }
    }
}

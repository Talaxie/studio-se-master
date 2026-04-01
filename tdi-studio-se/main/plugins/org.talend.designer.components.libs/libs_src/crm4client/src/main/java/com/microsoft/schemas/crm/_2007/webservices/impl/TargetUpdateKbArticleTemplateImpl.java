/*
 * XML Type:  TargetUpdateKbArticleTemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateKbArticleTemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateKbArticleTemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateKbArticleTemplateImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateKbArticleTemplate
{
    
    public TargetUpdateKbArticleTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KBARTICLETEMPLATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "KbArticleTemplate");
    
    
    /**
     * Gets the "KbArticleTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate getKbArticleTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate)get_store().find_element_user(KBARTICLETEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KbArticleTemplate" element
     */
    public void setKbArticleTemplate(com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate kbArticleTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate)get_store().find_element_user(KBARTICLETEMPLATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate)get_store().add_element_user(KBARTICLETEMPLATE$0);
            }
            target.set(kbArticleTemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "KbArticleTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate addNewKbArticleTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticletemplate)get_store().add_element_user(KBARTICLETEMPLATE$0);
            return target;
        }
    }
}

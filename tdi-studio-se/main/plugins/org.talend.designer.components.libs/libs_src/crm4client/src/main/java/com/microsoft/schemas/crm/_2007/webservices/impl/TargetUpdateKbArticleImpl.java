/*
 * XML Type:  TargetUpdateKbArticle
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateKbArticle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateKbArticle(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateKbArticleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateKbArticle
{
    
    public TargetUpdateKbArticleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KBARTICLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "KbArticle");
    
    
    /**
     * Gets the "KbArticle" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticle getKbArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticle)get_store().find_element_user(KBARTICLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KbArticle" element
     */
    public void setKbArticle(com.microsoft.schemas.crm._2007.webservices.Kbarticle kbArticle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticle)get_store().find_element_user(KBARTICLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Kbarticle)get_store().add_element_user(KBARTICLE$0);
            }
            target.set(kbArticle);
        }
    }
    
    /**
     * Appends and returns a new empty "KbArticle" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticle addNewKbArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticle)get_store().add_element_user(KBARTICLE$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetCreateBusinessUnitNewsArticle
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateBusinessUnitNewsArticle
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateBusinessUnitNewsArticle(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateBusinessUnitNewsArticleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateBusinessUnitNewsArticle
{
    
    public TargetCreateBusinessUnitNewsArticleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSUNITNEWSARTICLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "BusinessUnitNewsArticle");
    
    
    /**
     * Gets the "BusinessUnitNewsArticle" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle getBusinessUnitNewsArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle)get_store().find_element_user(BUSINESSUNITNEWSARTICLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BusinessUnitNewsArticle" element
     */
    public void setBusinessUnitNewsArticle(com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle businessUnitNewsArticle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle)get_store().find_element_user(BUSINESSUNITNEWSARTICLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle)get_store().add_element_user(BUSINESSUNITNEWSARTICLE$0);
            }
            target.set(businessUnitNewsArticle);
        }
    }
    
    /**
     * Appends and returns a new empty "BusinessUnitNewsArticle" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle addNewBusinessUnitNewsArticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Businessunitnewsarticle)get_store().add_element_user(BUSINESSUNITNEWSARTICLE$0);
            return target;
        }
    }
}

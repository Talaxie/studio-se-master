/*
 * XML Type:  TargetCreateKbArticleComment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateKbArticleComment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateKbArticleComment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateKbArticleCommentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateKbArticleComment
{
    
    public TargetCreateKbArticleCommentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KBARTICLECOMMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "KbArticleComment");
    
    
    /**
     * Gets the "KbArticleComment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment getKbArticleComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment)get_store().find_element_user(KBARTICLECOMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KbArticleComment" element
     */
    public void setKbArticleComment(com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment kbArticleComment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment)get_store().find_element_user(KBARTICLECOMMENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment)get_store().add_element_user(KBARTICLECOMMENT$0);
            }
            target.set(kbArticleComment);
        }
    }
    
    /**
     * Appends and returns a new empty "KbArticleComment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment addNewKbArticleComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Kbarticlecomment)get_store().add_element_user(KBARTICLECOMMENT$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetCreateTemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTemplateImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTemplate
{
    
    public TargetCreateTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPLATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Template");
    
    
    /**
     * Gets the "Template" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Template getTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Template target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Template)get_store().find_element_user(TEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Template" element
     */
    public void setTemplate(com.microsoft.schemas.crm._2007.webservices.Template template)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Template target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Template)get_store().find_element_user(TEMPLATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Template)get_store().add_element_user(TEMPLATE$0);
            }
            target.set(template);
        }
    }
    
    /**
     * Appends and returns a new empty "Template" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Template addNewTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Template target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Template)get_store().add_element_user(TEMPLATE$0);
            return target;
        }
    }
}

/*
 * XML Type:  RetrieveLocLabelsResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RetrieveLocLabelsResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RetrieveLocLabelsResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RetrieveLocLabelsResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.RetrieveLocLabelsResponse
{
    
    public RetrieveLocLabelsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Label");
    
    
    /**
     * Gets the "Label" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CrmLabel getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Label" element
     */
    public void setLabel(com.microsoft.schemas.crm._2007.webservices.CrmLabel label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().add_element_user(LABEL$0);
            }
            target.set(label);
        }
    }
    
    /**
     * Appends and returns a new empty "Label" element
     */
    public com.microsoft.schemas.crm._2007.webservices.CrmLabel addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.CrmLabel target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.CrmLabel)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetUpdateFax
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateFax
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateFax(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateFaxImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateFax
{
    
    public TargetUpdateFaxImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAX$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Fax");
    
    
    /**
     * Gets the "Fax" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Fax getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fax target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fax)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Fax" element
     */
    public void setFax(com.microsoft.schemas.crm._2007.webservices.Fax fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fax target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fax)get_store().find_element_user(FAX$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Fax)get_store().add_element_user(FAX$0);
            }
            target.set(fax);
        }
    }
    
    /**
     * Appends and returns a new empty "Fax" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Fax addNewFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Fax target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Fax)get_store().add_element_user(FAX$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetUpdateIsvConfig
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateIsvConfig
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateIsvConfig(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateIsvConfigImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateIsvConfig
{
    
    public TargetUpdateIsvConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISVCONFIG$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "IsvConfig");
    
    
    /**
     * Gets the "IsvConfig" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Isvconfig getIsvConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Isvconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Isvconfig)get_store().find_element_user(ISVCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IsvConfig" element
     */
    public void setIsvConfig(com.microsoft.schemas.crm._2007.webservices.Isvconfig isvConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Isvconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Isvconfig)get_store().find_element_user(ISVCONFIG$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Isvconfig)get_store().add_element_user(ISVCONFIG$0);
            }
            target.set(isvConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "IsvConfig" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Isvconfig addNewIsvConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Isvconfig target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Isvconfig)get_store().add_element_user(ISVCONFIG$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetUpdateContractTemplate
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateContractTemplate
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateContractTemplate(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateContractTemplateImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateContractTemplate
{
    
    public TargetUpdateContractTemplateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACTTEMPLATE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContractTemplate");
    
    
    /**
     * Gets the "ContractTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contracttemplate getContractTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contracttemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contracttemplate)get_store().find_element_user(CONTRACTTEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContractTemplate" element
     */
    public void setContractTemplate(com.microsoft.schemas.crm._2007.webservices.Contracttemplate contractTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contracttemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contracttemplate)get_store().find_element_user(CONTRACTTEMPLATE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Contracttemplate)get_store().add_element_user(CONTRACTTEMPLATE$0);
            }
            target.set(contractTemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "ContractTemplate" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contracttemplate addNewContractTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contracttemplate target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contracttemplate)get_store().add_element_user(CONTRACTTEMPLATE$0);
            return target;
        }
    }
}

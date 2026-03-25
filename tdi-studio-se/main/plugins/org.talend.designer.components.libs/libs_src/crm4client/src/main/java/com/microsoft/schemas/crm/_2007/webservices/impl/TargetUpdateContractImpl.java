/*
 * XML Type:  TargetUpdateContract
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateContract
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateContract(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateContractImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateContract
{
    
    public TargetUpdateContractImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Contract");
    
    
    /**
     * Gets the "Contract" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contract getContract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contract target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contract)get_store().find_element_user(CONTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Contract" element
     */
    public void setContract(com.microsoft.schemas.crm._2007.webservices.Contract contract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contract target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contract)get_store().find_element_user(CONTRACT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Contract)get_store().add_element_user(CONTRACT$0);
            }
            target.set(contract);
        }
    }
    
    /**
     * Appends and returns a new empty "Contract" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contract addNewContract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contract target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contract)get_store().add_element_user(CONTRACT$0);
            return target;
        }
    }
}

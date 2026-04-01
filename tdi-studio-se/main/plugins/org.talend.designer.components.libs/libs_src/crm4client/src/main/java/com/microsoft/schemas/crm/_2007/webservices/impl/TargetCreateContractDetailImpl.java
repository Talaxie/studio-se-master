/*
 * XML Type:  TargetCreateContractDetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateContractDetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateContractDetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateContractDetailImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateContractDetail
{
    
    public TargetCreateContractDetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACTDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContractDetail");
    
    
    /**
     * Gets the "ContractDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contractdetail getContractDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contractdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contractdetail)get_store().find_element_user(CONTRACTDETAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContractDetail" element
     */
    public void setContractDetail(com.microsoft.schemas.crm._2007.webservices.Contractdetail contractDetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contractdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contractdetail)get_store().find_element_user(CONTRACTDETAIL$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Contractdetail)get_store().add_element_user(CONTRACTDETAIL$0);
            }
            target.set(contractDetail);
        }
    }
    
    /**
     * Appends and returns a new empty "ContractDetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Contractdetail addNewContractDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Contractdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Contractdetail)get_store().add_element_user(CONTRACTDETAIL$0);
            return target;
        }
    }
}

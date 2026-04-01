/*
 * XML Type:  CancelContractRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.CancelContractRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML CancelContractRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class CancelContractRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.CancelContractRequest
{
    
    public CancelContractRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRACTID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContractId");
    private static final javax.xml.namespace.QName CANCELDATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "CancelDate");
    private static final javax.xml.namespace.QName STATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Status");
    
    
    /**
     * Gets the "ContractId" element
     */
    public java.lang.String getContractId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContractId" element
     */
    public com.microsoft.wsdl.types.Guid xgetContractId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTRACTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContractId" element
     */
    public void setContractId(java.lang.String contractId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTID$0);
            }
            target.setStringValue(contractId);
        }
    }
    
    /**
     * Sets (as xml) the "ContractId" element
     */
    public void xsetContractId(com.microsoft.wsdl.types.Guid contractId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(CONTRACTID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(CONTRACTID$0);
            }
            target.set(contractId);
        }
    }
    
    /**
     * Gets the "CancelDate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCancelDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CANCELDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelDate" element
     */
    public void setCancelDate(com.microsoft.schemas.crm._2006.webservices.CrmDateTime cancelDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CANCELDATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CANCELDATE$2);
            }
            target.set(cancelDate);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelDate" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCancelDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CANCELDATE$2);
            return target;
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public int getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlInt xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(int status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$4);
            }
            target.setIntValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlInt status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATUS$4);
            }
            target.set(status);
        }
    }
}

/*
 * XML Type:  SetStateContractDetailRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateContractDetailRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateContractDetailRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateContractDetailRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateContractDetailRequest
{
    
    public SetStateContractDetailRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName CONTRACTDETAILSTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContractDetailState");
    private static final javax.xml.namespace.QName CONTRACTDETAILSTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ContractDetailStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "ContractDetailState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContractDetailState.Enum getContractDetailState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTDETAILSTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.ContractDetailState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContractDetailState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ContractDetailState xgetContractDetailState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContractDetailState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailState)get_store().find_element_user(CONTRACTDETAILSTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContractDetailState" element
     */
    public void setContractDetailState(com.microsoft.schemas.crm._2007.webservices.ContractDetailState.Enum contractDetailState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTDETAILSTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTDETAILSTATE$2);
            }
            target.setEnumValue(contractDetailState);
        }
    }
    
    /**
     * Sets (as xml) the "ContractDetailState" element
     */
    public void xsetContractDetailState(com.microsoft.schemas.crm._2007.webservices.ContractDetailState contractDetailState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ContractDetailState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailState)get_store().find_element_user(CONTRACTDETAILSTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ContractDetailState)get_store().add_element_user(CONTRACTDETAILSTATE$2);
            }
            target.set(contractDetailState);
        }
    }
    
    /**
     * Gets the "ContractDetailStatus" element
     */
    public int getContractDetailStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTDETAILSTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContractDetailStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetContractDetailStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONTRACTDETAILSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ContractDetailStatus" element
     */
    public void setContractDetailStatus(int contractDetailStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTDETAILSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTDETAILSTATUS$4);
            }
            target.setIntValue(contractDetailStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ContractDetailStatus" element
     */
    public void xsetContractDetailStatus(org.apache.xmlbeans.XmlInt contractDetailStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CONTRACTDETAILSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CONTRACTDETAILSTATUS$4);
            }
            target.set(contractDetailStatus);
        }
    }
}

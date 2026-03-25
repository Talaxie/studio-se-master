/*
 * XML Type:  ArrayOfBusinessEntity
 * Namespace: http://schemas.microsoft.com/crm/2006/WebServices
 * Java type: com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.webservices.impl;
/**
 * An XML ArrayOfBusinessEntity(@http://schemas.microsoft.com/crm/2006/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfBusinessEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.webservices.ArrayOfBusinessEntity
{
    
    public ArrayOfBusinessEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/WebServices", "BusinessEntity");
    
    
    /**
     * Gets array of all "BusinessEntity" elements
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity[] getBusinessEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUSINESSENTITY$0, targetList);
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity[] result = new com.microsoft.schemas.crm._2006.webservices.BusinessEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity getBusinessEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BusinessEntity" element
     */
    public int sizeOfBusinessEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSENTITY$0);
        }
    }
    
    /**
     * Sets array of all "BusinessEntity" element
     */
    public void setBusinessEntityArray(com.microsoft.schemas.crm._2006.webservices.BusinessEntity[] businessEntityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(businessEntityArray, BUSINESSENTITY$0);
        }
    }
    
    /**
     * Sets ith "BusinessEntity" element
     */
    public void setBusinessEntityArray(int i, com.microsoft.schemas.crm._2006.webservices.BusinessEntity businessEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().find_element_user(BUSINESSENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(businessEntity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity insertNewBusinessEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().insert_element_user(BUSINESSENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BusinessEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.BusinessEntity addNewBusinessEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.BusinessEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.BusinessEntity)get_store().add_element_user(BUSINESSENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BusinessEntity" element
     */
    public void removeBusinessEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSENTITY$0, i);
        }
    }
}

/*
 * XML Type:  ArrayOfsalesorderdetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfsalesorderdetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfsalesorderdetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfsalesorderdetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfsalesorderdetail
{
    
    public ArrayOfsalesorderdetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESORDERDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "salesorderdetail");
    
    
    /**
     * Gets array of all "salesorderdetail" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail[] getSalesorderdetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SALESORDERDETAIL$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail[] result = new com.microsoft.schemas.crm._2007.webservices.Salesorderdetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "salesorderdetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail getSalesorderdetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().find_element_user(SALESORDERDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "salesorderdetail" element
     */
    public int sizeOfSalesorderdetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORDERDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "salesorderdetail" element
     */
    public void setSalesorderdetailArray(com.microsoft.schemas.crm._2007.webservices.Salesorderdetail[] salesorderdetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(salesorderdetailArray, SALESORDERDETAIL$0);
        }
    }
    
    /**
     * Sets ith "salesorderdetail" element
     */
    public void setSalesorderdetailArray(int i, com.microsoft.schemas.crm._2007.webservices.Salesorderdetail salesorderdetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().find_element_user(SALESORDERDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(salesorderdetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "salesorderdetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail insertNewSalesorderdetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().insert_element_user(SALESORDERDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "salesorderdetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Salesorderdetail addNewSalesorderdetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Salesorderdetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Salesorderdetail)get_store().add_element_user(SALESORDERDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "salesorderdetail" element
     */
    public void removeSalesorderdetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORDERDETAIL$0, i);
        }
    }
}

/*
 * XML Type:  ArrayOfinvoicedetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfinvoicedetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfinvoicedetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfinvoicedetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfinvoicedetail
{
    
    public ArrayOfinvoicedetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOICEDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "invoicedetail");
    
    
    /**
     * Gets array of all "invoicedetail" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail[] getInvoicedetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INVOICEDETAIL$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail[] result = new com.microsoft.schemas.crm._2007.webservices.Invoicedetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "invoicedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail getInvoicedetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().find_element_user(INVOICEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "invoicedetail" element
     */
    public int sizeOfInvoicedetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVOICEDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "invoicedetail" element
     */
    public void setInvoicedetailArray(com.microsoft.schemas.crm._2007.webservices.Invoicedetail[] invoicedetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(invoicedetailArray, INVOICEDETAIL$0);
        }
    }
    
    /**
     * Sets ith "invoicedetail" element
     */
    public void setInvoicedetailArray(int i, com.microsoft.schemas.crm._2007.webservices.Invoicedetail invoicedetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().find_element_user(INVOICEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(invoicedetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "invoicedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail insertNewInvoicedetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().insert_element_user(INVOICEDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "invoicedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Invoicedetail addNewInvoicedetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Invoicedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Invoicedetail)get_store().add_element_user(INVOICEDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "invoicedetail" element
     */
    public void removeInvoicedetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVOICEDETAIL$0, i);
        }
    }
}

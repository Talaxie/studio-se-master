/*
 * XML Type:  ArrayOfquotedetail
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfquotedetail(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfquotedetailImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfquotedetail
{
    
    public ArrayOfquotedetailImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUOTEDETAIL$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "quotedetail");
    
    
    /**
     * Gets array of all "quotedetail" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail[] getQuotedetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUOTEDETAIL$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Quotedetail[] result = new com.microsoft.schemas.crm._2007.webservices.Quotedetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "quotedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail getQuotedetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().find_element_user(QUOTEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "quotedetail" element
     */
    public int sizeOfQuotedetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUOTEDETAIL$0);
        }
    }
    
    /**
     * Sets array of all "quotedetail" element
     */
    public void setQuotedetailArray(com.microsoft.schemas.crm._2007.webservices.Quotedetail[] quotedetailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(quotedetailArray, QUOTEDETAIL$0);
        }
    }
    
    /**
     * Sets ith "quotedetail" element
     */
    public void setQuotedetailArray(int i, com.microsoft.schemas.crm._2007.webservices.Quotedetail quotedetail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().find_element_user(QUOTEDETAIL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(quotedetail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "quotedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail insertNewQuotedetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().insert_element_user(QUOTEDETAIL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "quotedetail" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Quotedetail addNewQuotedetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Quotedetail target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Quotedetail)get_store().add_element_user(QUOTEDETAIL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "quotedetail" element
     */
    public void removeQuotedetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUOTEDETAIL$0, i);
        }
    }
}

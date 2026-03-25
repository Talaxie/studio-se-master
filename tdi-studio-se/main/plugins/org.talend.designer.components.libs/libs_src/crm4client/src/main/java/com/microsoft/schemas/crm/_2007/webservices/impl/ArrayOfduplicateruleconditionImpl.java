/*
 * XML Type:  ArrayOfduplicaterulecondition
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfduplicaterulecondition
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfduplicaterulecondition(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfduplicateruleconditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfduplicaterulecondition
{
    
    public ArrayOfduplicateruleconditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUPLICATERULECONDITION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "duplicaterulecondition");
    
    
    /**
     * Gets array of all "duplicaterulecondition" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition[] getDuplicateruleconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DUPLICATERULECONDITION$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition[] result = new com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "duplicaterulecondition" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition getDuplicateruleconditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().find_element_user(DUPLICATERULECONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "duplicaterulecondition" element
     */
    public int sizeOfDuplicateruleconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DUPLICATERULECONDITION$0);
        }
    }
    
    /**
     * Sets array of all "duplicaterulecondition" element
     */
    public void setDuplicateruleconditionArray(com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition[] duplicateruleconditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(duplicateruleconditionArray, DUPLICATERULECONDITION$0);
        }
    }
    
    /**
     * Sets ith "duplicaterulecondition" element
     */
    public void setDuplicateruleconditionArray(int i, com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition duplicaterulecondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().find_element_user(DUPLICATERULECONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(duplicaterulecondition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "duplicaterulecondition" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition insertNewDuplicaterulecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().insert_element_user(DUPLICATERULECONDITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "duplicaterulecondition" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition addNewDuplicaterulecondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().add_element_user(DUPLICATERULECONDITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "duplicaterulecondition" element
     */
    public void removeDuplicaterulecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DUPLICATERULECONDITION$0, i);
        }
    }
}

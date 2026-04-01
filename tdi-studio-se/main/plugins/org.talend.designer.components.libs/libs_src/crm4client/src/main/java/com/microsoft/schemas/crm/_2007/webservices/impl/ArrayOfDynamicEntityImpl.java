/*
 * XML Type:  ArrayOfDynamicEntity
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfDynamicEntity(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfDynamicEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfDynamicEntity
{
    
    public ArrayOfDynamicEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DYNAMICENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DynamicEntity");
    
    
    /**
     * Gets array of all "DynamicEntity" elements
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity[] getDynamicEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DYNAMICENTITY$0, targetList);
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity[] result = new com.microsoft.schemas.crm._2006.webservices.DynamicEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DynamicEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity getDynamicEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DynamicEntity" element
     */
    public int sizeOfDynamicEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICENTITY$0);
        }
    }
    
    /**
     * Sets array of all "DynamicEntity" element
     */
    public void setDynamicEntityArray(com.microsoft.schemas.crm._2006.webservices.DynamicEntity[] dynamicEntityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dynamicEntityArray, DYNAMICENTITY$0);
        }
    }
    
    /**
     * Sets ith "DynamicEntity" element
     */
    public void setDynamicEntityArray(int i, com.microsoft.schemas.crm._2006.webservices.DynamicEntity dynamicEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().find_element_user(DYNAMICENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dynamicEntity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DynamicEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity insertNewDynamicEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().insert_element_user(DYNAMICENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DynamicEntity" element
     */
    public com.microsoft.schemas.crm._2006.webservices.DynamicEntity addNewDynamicEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.DynamicEntity target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.DynamicEntity)get_store().add_element_user(DYNAMICENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DynamicEntity" element
     */
    public void removeDynamicEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICENTITY$0, i);
        }
    }
}

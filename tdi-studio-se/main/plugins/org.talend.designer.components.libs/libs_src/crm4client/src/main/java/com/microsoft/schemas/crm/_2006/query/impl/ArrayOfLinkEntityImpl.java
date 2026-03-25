/*
 * XML Type:  ArrayOfLinkEntity
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML ArrayOfLinkEntity(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class ArrayOfLinkEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity
{
    
    public ArrayOfLinkEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKENTITY$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkEntity");
    
    
    /**
     * Gets array of all "LinkEntity" elements
     */
    public com.microsoft.schemas.crm._2006.query.LinkEntity[] getLinkEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKENTITY$0, targetList);
            com.microsoft.schemas.crm._2006.query.LinkEntity[] result = new com.microsoft.schemas.crm._2006.query.LinkEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LinkEntity" element
     */
    public com.microsoft.schemas.crm._2006.query.LinkEntity getLinkEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LinkEntity" element
     */
    public int sizeOfLinkEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITY$0);
        }
    }
    
    /**
     * Sets array of all "LinkEntity" element
     */
    public void setLinkEntityArray(com.microsoft.schemas.crm._2006.query.LinkEntity[] linkEntityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkEntityArray, LINKENTITY$0);
        }
    }
    
    /**
     * Sets ith "LinkEntity" element
     */
    public void setLinkEntityArray(int i, com.microsoft.schemas.crm._2006.query.LinkEntity linkEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.LinkEntity)get_store().find_element_user(LINKENTITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkEntity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LinkEntity" element
     */
    public com.microsoft.schemas.crm._2006.query.LinkEntity insertNewLinkEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.LinkEntity)get_store().insert_element_user(LINKENTITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LinkEntity" element
     */
    public com.microsoft.schemas.crm._2006.query.LinkEntity addNewLinkEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.LinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.LinkEntity)get_store().add_element_user(LINKENTITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LinkEntity" element
     */
    public void removeLinkEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITY$0, i);
        }
    }
}

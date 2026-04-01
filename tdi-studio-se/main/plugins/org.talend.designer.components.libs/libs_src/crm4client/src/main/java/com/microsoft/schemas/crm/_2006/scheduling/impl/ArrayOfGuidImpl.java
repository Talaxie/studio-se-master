/*
 * XML Type:  ArrayOfGuid
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ArrayOfGuid(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ArrayOfGuidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ArrayOfGuid
{
    
    public ArrayOfGuidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GUID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "guid");
    
    
    /**
     * Gets array of all "guid" elements
     */
    public java.lang.String[] getGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "guid" element
     */
    public java.lang.String getGuidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "guid" elements
     */
    public com.microsoft.wsdl.types.Guid[] xgetGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUID$0, targetList);
            com.microsoft.wsdl.types.Guid[] result = new com.microsoft.wsdl.types.Guid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "guid" element
     */
    public com.microsoft.wsdl.types.Guid xgetGuidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.microsoft.wsdl.types.Guid)target;
        }
    }
    
    /**
     * Returns number of "guid" element
     */
    public int sizeOfGuidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUID$0);
        }
    }
    
    /**
     * Sets array of all "guid" element
     */
    public void setGuidArray(java.lang.String[] guidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guidArray, GUID$0);
        }
    }
    
    /**
     * Sets ith "guid" element
     */
    public void setGuidArray(int i, java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(guid);
        }
    }
    
    /**
     * Sets (as xml) array of all "guid" element
     */
    public void xsetGuidArray(com.microsoft.wsdl.types.Guid[]guidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(guidArray, GUID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "guid" element
     */
    public void xsetGuidArray(int i, com.microsoft.wsdl.types.Guid guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(GUID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(guid);
        }
    }
    
    /**
     * Inserts the value as the ith "guid" element
     */
    public void insertGuid(int i, java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GUID$0, i);
            target.setStringValue(guid);
        }
    }
    
    /**
     * Appends the value as the last "guid" element
     */
    public void addGuid(java.lang.String guid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GUID$0);
            target.setStringValue(guid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guid" element
     */
    public com.microsoft.wsdl.types.Guid insertNewGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().insert_element_user(GUID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guid" element
     */
    public com.microsoft.wsdl.types.Guid addNewGuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(GUID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "guid" element
     */
    public void removeGuid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUID$0, i);
        }
    }
}

/*
 * XML Type:  ArrayOfOptionalParameter
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfOptionalParameter(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfOptionalParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter
{
    
    public ArrayOfOptionalParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONALPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OptionalParameter");
    
    
    /**
     * Gets array of all "OptionalParameter" elements
     */
    public com.microsoft.schemas.crm._2007.webservices.OptionalParameter[] getOptionalParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALPARAMETER$0, targetList);
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter[] result = new com.microsoft.schemas.crm._2007.webservices.OptionalParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OptionalParameter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OptionalParameter getOptionalParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().find_element_user(OPTIONALPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OptionalParameter" element
     */
    public boolean isNilOptionalParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().find_element_user(OPTIONALPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OptionalParameter" element
     */
    public int sizeOfOptionalParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONALPARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "OptionalParameter" element
     */
    public void setOptionalParameterArray(com.microsoft.schemas.crm._2007.webservices.OptionalParameter[] optionalParameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalParameterArray, OPTIONALPARAMETER$0);
        }
    }
    
    /**
     * Sets ith "OptionalParameter" element
     */
    public void setOptionalParameterArray(int i, com.microsoft.schemas.crm._2007.webservices.OptionalParameter optionalParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().find_element_user(OPTIONALPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionalParameter);
        }
    }
    
    /**
     * Nils the ith "OptionalParameter" element
     */
    public void setNilOptionalParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().find_element_user(OPTIONALPARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OptionalParameter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OptionalParameter insertNewOptionalParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().insert_element_user(OPTIONALPARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OptionalParameter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.OptionalParameter addNewOptionalParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.OptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.OptionalParameter)get_store().add_element_user(OPTIONALPARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OptionalParameter" element
     */
    public void removeOptionalParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONALPARAMETER$0, i);
        }
    }
}

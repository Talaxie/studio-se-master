/*
 * XML Type:  ArrayOfObjectiveRelation
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ArrayOfObjectiveRelation(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ArrayOfObjectiveRelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ArrayOfObjectiveRelation
{
    
    public ArrayOfObjectiveRelationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTIVERELATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ObjectiveRelation");
    
    
    /**
     * Gets array of all "ObjectiveRelation" elements
     */
    public com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation[] getObjectiveRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTIVERELATION$0, targetList);
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation[] result = new com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation getObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ObjectiveRelation" element
     */
    public boolean isNilObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ObjectiveRelation" element
     */
    public int sizeOfObjectiveRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVERELATION$0);
        }
    }
    
    /**
     * Sets array of all "ObjectiveRelation" element
     */
    public void setObjectiveRelationArray(com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation[] objectiveRelationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectiveRelationArray, OBJECTIVERELATION$0);
        }
    }
    
    /**
     * Sets ith "ObjectiveRelation" element
     */
    public void setObjectiveRelationArray(int i, com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation objectiveRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objectiveRelation);
        }
    }
    
    /**
     * Nils the ith "ObjectiveRelation" element
     */
    public void setNilObjectiveRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().find_element_user(OBJECTIVERELATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation insertNewObjectiveRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().insert_element_user(OBJECTIVERELATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ObjectiveRelation" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation addNewObjectiveRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ObjectiveRelation)get_store().add_element_user(OBJECTIVERELATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ObjectiveRelation" element
     */
    public void removeObjectiveRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVERELATION$0, i);
        }
    }
}

/*
 * XML Type:  ArrayOfRolePrivilege
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML ArrayOfRolePrivilege(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class ArrayOfRolePrivilegeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.ArrayOfRolePrivilege
{
    
    public ArrayOfRolePrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPRIVILEGE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RolePrivilege");
    
    
    /**
     * Gets array of all "RolePrivilege" elements
     */
    public com.microsoft.schemas.crm._2006.coretypes.RolePrivilege[] getRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLEPRIVILEGE$0, targetList);
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege[] result = new com.microsoft.schemas.crm._2006.coretypes.RolePrivilege[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RolePrivilege getRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RolePrivilege" element
     */
    public boolean isNilRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RolePrivilege" element
     */
    public int sizeOfRolePrivilegeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEPRIVILEGE$0);
        }
    }
    
    /**
     * Sets array of all "RolePrivilege" element
     */
    public void setRolePrivilegeArray(com.microsoft.schemas.crm._2006.coretypes.RolePrivilege[] rolePrivilegeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rolePrivilegeArray, ROLEPRIVILEGE$0);
        }
    }
    
    /**
     * Sets ith "RolePrivilege" element
     */
    public void setRolePrivilegeArray(int i, com.microsoft.schemas.crm._2006.coretypes.RolePrivilege rolePrivilege)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rolePrivilege);
        }
    }
    
    /**
     * Nils the ith "RolePrivilege" element
     */
    public void setNilRolePrivilegeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().find_element_user(ROLEPRIVILEGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RolePrivilege insertNewRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().insert_element_user(ROLEPRIVILEGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RolePrivilege" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RolePrivilege addNewRolePrivilege()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RolePrivilege target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RolePrivilege)get_store().add_element_user(ROLEPRIVILEGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RolePrivilege" element
     */
    public void removeRolePrivilege(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEPRIVILEGE$0, i);
        }
    }
}

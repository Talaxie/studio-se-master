/*
 * XML Type:  TargetCreateConstraintBasedGroup
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateConstraintBasedGroup
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateConstraintBasedGroup(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateConstraintBasedGroupImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateConstraintBasedGroup
{
    
    public TargetCreateConstraintBasedGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTBASEDGROUP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ConstraintBasedGroup");
    
    
    /**
     * Gets the "ConstraintBasedGroup" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup getConstraintBasedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup)get_store().find_element_user(CONSTRAINTBASEDGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintBasedGroup" element
     */
    public void setConstraintBasedGroup(com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup constraintBasedGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup)get_store().find_element_user(CONSTRAINTBASEDGROUP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup)get_store().add_element_user(CONSTRAINTBASEDGROUP$0);
            }
            target.set(constraintBasedGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintBasedGroup" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup addNewConstraintBasedGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Constraintbasedgroup)get_store().add_element_user(CONSTRAINTBASEDGROUP$0);
            return target;
        }
    }
}

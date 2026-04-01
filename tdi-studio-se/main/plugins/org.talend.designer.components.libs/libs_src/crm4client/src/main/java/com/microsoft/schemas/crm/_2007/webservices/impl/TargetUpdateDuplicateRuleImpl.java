/*
 * XML Type:  TargetUpdateDuplicateRule
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateDuplicateRule
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateDuplicateRule(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateDuplicateRuleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateDuplicateRule
{
    
    public TargetUpdateDuplicateRuleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUPLICATERULE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DuplicateRule");
    
    
    /**
     * Gets the "DuplicateRule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterule getDuplicateRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterule)get_store().find_element_user(DUPLICATERULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DuplicateRule" element
     */
    public void setDuplicateRule(com.microsoft.schemas.crm._2007.webservices.Duplicaterule duplicateRule)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterule)get_store().find_element_user(DUPLICATERULE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterule)get_store().add_element_user(DUPLICATERULE$0);
            }
            target.set(duplicateRule);
        }
    }
    
    /**
     * Appends and returns a new empty "DuplicateRule" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterule addNewDuplicateRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterule target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterule)get_store().add_element_user(DUPLICATERULE$0);
            return target;
        }
    }
}

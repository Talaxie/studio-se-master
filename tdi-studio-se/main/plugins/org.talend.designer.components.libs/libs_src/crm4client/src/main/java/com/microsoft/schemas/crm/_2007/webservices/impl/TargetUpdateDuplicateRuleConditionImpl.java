/*
 * XML Type:  TargetUpdateDuplicateRuleCondition
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateDuplicateRuleCondition
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateDuplicateRuleCondition(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateDuplicateRuleConditionImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateDuplicateRuleCondition
{
    
    public TargetUpdateDuplicateRuleConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DUPLICATERULECONDITION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "DuplicateRuleCondition");
    
    
    /**
     * Gets the "DuplicateRuleCondition" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition getDuplicateRuleCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().find_element_user(DUPLICATERULECONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DuplicateRuleCondition" element
     */
    public void setDuplicateRuleCondition(com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition duplicateRuleCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().find_element_user(DUPLICATERULECONDITION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().add_element_user(DUPLICATERULECONDITION$0);
            }
            target.set(duplicateRuleCondition);
        }
    }
    
    /**
     * Appends and returns a new empty "DuplicateRuleCondition" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition addNewDuplicateRuleCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Duplicaterulecondition)get_store().add_element_user(DUPLICATERULECONDITION$0);
            return target;
        }
    }
}

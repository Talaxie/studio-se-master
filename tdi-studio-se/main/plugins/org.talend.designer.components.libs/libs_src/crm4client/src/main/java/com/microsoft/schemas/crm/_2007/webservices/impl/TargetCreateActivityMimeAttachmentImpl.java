/*
 * XML Type:  TargetCreateActivityMimeAttachment
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateActivityMimeAttachment
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateActivityMimeAttachment(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateActivityMimeAttachmentImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateActivityMimeAttachment
{
    
    public TargetCreateActivityMimeAttachmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYMIMEATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "ActivityMimeAttachment");
    
    
    /**
     * Gets the "ActivityMimeAttachment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment getActivityMimeAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment)get_store().find_element_user(ACTIVITYMIMEATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ActivityMimeAttachment" element
     */
    public void setActivityMimeAttachment(com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment activityMimeAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment)get_store().find_element_user(ACTIVITYMIMEATTACHMENT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment)get_store().add_element_user(ACTIVITYMIMEATTACHMENT$0);
            }
            target.set(activityMimeAttachment);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityMimeAttachment" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment addNewActivityMimeAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Activitymimeattachment)get_store().add_element_user(ACTIVITYMIMEATTACHMENT$0);
            return target;
        }
    }
}

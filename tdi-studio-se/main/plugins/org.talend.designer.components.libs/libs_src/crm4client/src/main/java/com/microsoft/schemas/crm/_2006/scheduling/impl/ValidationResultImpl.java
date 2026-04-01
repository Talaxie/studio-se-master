/*
 * XML Type:  ValidationResult
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.ValidationResult
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML ValidationResult(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class ValidationResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.ValidationResult
{
    
    public ValidationResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONSUCCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ValidationSuccess");
    private static final javax.xml.namespace.QName TRACEINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "TraceInfo");
    private static final javax.xml.namespace.QName ACTIVITYID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ActivityId");
    
    
    /**
     * Gets the "ValidationSuccess" element
     */
    public boolean getValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSUCCESS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ValidationSuccess" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetValidationSuccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATIONSUCCESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ValidationSuccess" element
     */
    public void setValidationSuccess(boolean validationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALIDATIONSUCCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALIDATIONSUCCESS$0);
            }
            target.setBooleanValue(validationSuccess);
        }
    }
    
    /**
     * Sets (as xml) the "ValidationSuccess" element
     */
    public void xsetValidationSuccess(org.apache.xmlbeans.XmlBoolean validationSuccess)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VALIDATIONSUCCESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VALIDATIONSUCCESS$0);
            }
            target.set(validationSuccess);
        }
    }
    
    /**
     * Gets the "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TraceInfo getTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TraceInfo" element
     */
    public boolean isSetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACEINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "TraceInfo" element
     */
    public void setTraceInfo(com.microsoft.schemas.crm._2006.scheduling.TraceInfo traceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            }
            target.set(traceInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TraceInfo" element
     */
    public void unsetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACEINFO$2, 0);
        }
    }
    
    /**
     * Gets the "ActivityId" element
     */
    public java.lang.String getActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActivityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetActivityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACTIVITYID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ActivityId" element
     */
    public void setActivityId(java.lang.String activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYID$4);
            }
            target.setStringValue(activityId);
        }
    }
    
    /**
     * Sets (as xml) the "ActivityId" element
     */
    public void xsetActivityId(com.microsoft.wsdl.types.Guid activityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ACTIVITYID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ACTIVITYID$4);
            }
            target.set(activityId);
        }
    }
}

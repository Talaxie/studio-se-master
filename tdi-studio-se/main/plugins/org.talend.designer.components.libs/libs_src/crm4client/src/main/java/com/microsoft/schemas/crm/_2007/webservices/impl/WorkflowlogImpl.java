/*
 * XML Type:  workflowlog
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Workflowlog
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML workflowlog(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class WorkflowlogImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Workflowlog
{
    
    public WorkflowlogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYNAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "activityname");
    private static final javax.xml.namespace.QName ASYNCOPERATIONID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "asyncoperationid");
    private static final javax.xml.namespace.QName COMPLETEDON$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "completedon");
    private static final javax.xml.namespace.QName CREATEDBY$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdby");
    private static final javax.xml.namespace.QName CREATEDON$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "createdon");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "description");
    private static final javax.xml.namespace.QName ERRORCODE$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "errorcode");
    private static final javax.xml.namespace.QName MESSAGE$14 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "message");
    private static final javax.xml.namespace.QName MODIFIEDBY$16 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedby");
    private static final javax.xml.namespace.QName MODIFIEDON$18 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "modifiedon");
    private static final javax.xml.namespace.QName OWNINGBUSINESSUNIT$20 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owningbusinessunit");
    private static final javax.xml.namespace.QName OWNINGUSER$22 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "owninguser");
    private static final javax.xml.namespace.QName REGARDINGOBJECTID$24 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "regardingobjectid");
    private static final javax.xml.namespace.QName STAGENAME$26 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stagename");
    private static final javax.xml.namespace.QName STATUS$28 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "status");
    private static final javax.xml.namespace.QName STEPNAME$30 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "stepname");
    private static final javax.xml.namespace.QName WORKFLOWLOGID$32 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "workflowlogid");
    
    
    /**
     * Gets the "activityname" element
     */
    public java.lang.String getActivityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityname" element
     */
    public org.apache.xmlbeans.XmlString xgetActivityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "activityname" element
     */
    public boolean isSetActivityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "activityname" element
     */
    public void setActivityname(java.lang.String activityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVITYNAME$0);
            }
            target.setStringValue(activityname);
        }
    }
    
    /**
     * Sets (as xml) the "activityname" element
     */
    public void xsetActivityname(org.apache.xmlbeans.XmlString activityname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVITYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVITYNAME$0);
            }
            target.set(activityname);
        }
    }
    
    /**
     * Unsets the "activityname" element
     */
    public void unsetActivityname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "asyncoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ASYNCOPERATIONID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asyncoperationid" element
     */
    public boolean isSetAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASYNCOPERATIONID$2) != 0;
        }
    }
    
    /**
     * Sets the "asyncoperationid" element
     */
    public void setAsyncoperationid(com.microsoft.schemas.crm._2006.webservices.Lookup asyncoperationid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(ASYNCOPERATIONID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ASYNCOPERATIONID$2);
            }
            target.set(asyncoperationid);
        }
    }
    
    /**
     * Appends and returns a new empty "asyncoperationid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(ASYNCOPERATIONID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "asyncoperationid" element
     */
    public void unsetAsyncoperationid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASYNCOPERATIONID$2, 0);
        }
    }
    
    /**
     * Gets the "completedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completedon" element
     */
    public boolean isSetCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEDON$4) != 0;
        }
    }
    
    /**
     * Sets the "completedon" element
     */
    public void setCompletedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime completedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(COMPLETEDON$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDON$4);
            }
            target.set(completedon);
        }
    }
    
    /**
     * Appends and returns a new empty "completedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(COMPLETEDON$4);
            return target;
        }
    }
    
    /**
     * Unsets the "completedon" element
     */
    public void unsetCompletedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEDON$4, 0);
        }
    }
    
    /**
     * Gets the "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdby" element
     */
    public boolean isSetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$6) != 0;
        }
    }
    
    /**
     * Sets the "createdby" element
     */
    public void setCreatedby(com.microsoft.schemas.crm._2006.webservices.Lookup createdby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(CREATEDBY$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
            }
            target.set(createdby);
        }
    }
    
    /**
     * Appends and returns a new empty "createdby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(CREATEDBY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "createdby" element
     */
    public void unsetCreatedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$6, 0);
        }
    }
    
    /**
     * Gets the "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "createdon" element
     */
    public boolean isSetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDON$8) != 0;
        }
    }
    
    /**
     * Sets the "createdon" element
     */
    public void setCreatedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime createdon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(CREATEDON$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
            }
            target.set(createdon);
        }
    }
    
    /**
     * Appends and returns a new empty "createdon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(CREATEDON$8);
            return target;
        }
    }
    
    /**
     * Unsets the "createdon" element
     */
    public void unsetCreatedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDON$8, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$10);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$10);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets the "errorcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getErrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ERRORCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errorcode" element
     */
    public boolean isSetErrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "errorcode" element
     */
    public void setErrorcode(com.microsoft.schemas.crm._2006.webservices.CrmNumber errorcode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ERRORCODE$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ERRORCODE$12);
            }
            target.set(errorcode);
        }
    }
    
    /**
     * Appends and returns a new empty "errorcode" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewErrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ERRORCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "errorcode" element
     */
    public void unsetErrorcode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$12, 0);
        }
    }
    
    /**
     * Gets the "message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$14) != 0;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$14);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$14);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$14, 0);
        }
    }
    
    /**
     * Gets the "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedby" element
     */
    public boolean isSetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$16) != 0;
        }
    }
    
    /**
     * Sets the "modifiedby" element
     */
    public void setModifiedby(com.microsoft.schemas.crm._2006.webservices.Lookup modifiedby)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(MODIFIEDBY$16, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$16);
            }
            target.set(modifiedby);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedby" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(MODIFIEDBY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedby" element
     */
    public void unsetModifiedby()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$16, 0);
        }
    }
    
    /**
     * Gets the "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "modifiedon" element
     */
    public boolean isSetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDON$18) != 0;
        }
    }
    
    /**
     * Sets the "modifiedon" element
     */
    public void setModifiedon(com.microsoft.schemas.crm._2006.webservices.CrmDateTime modifiedon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(MODIFIEDON$18, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$18);
            }
            target.set(modifiedon);
        }
    }
    
    /**
     * Appends and returns a new empty "modifiedon" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(MODIFIEDON$18);
            return target;
        }
    }
    
    /**
     * Unsets the "modifiedon" element
     */
    public void unsetModifiedon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDON$18, 0);
        }
    }
    
    /**
     * Gets the "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owningbusinessunit" element
     */
    public boolean isSetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGBUSINESSUNIT$20) != 0;
        }
    }
    
    /**
     * Sets the "owningbusinessunit" element
     */
    public void setOwningbusinessunit(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owningbusinessunit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGBUSINESSUNIT$20, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$20);
            }
            target.set(owningbusinessunit);
        }
    }
    
    /**
     * Appends and returns a new empty "owningbusinessunit" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGBUSINESSUNIT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "owningbusinessunit" element
     */
    public void unsetOwningbusinessunit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGBUSINESSUNIT$20, 0);
        }
    }
    
    /**
     * Gets the "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier getOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owninguser" element
     */
    public boolean isSetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGUSER$22) != 0;
        }
    }
    
    /**
     * Sets the "owninguser" element
     */
    public void setOwninguser(com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier owninguser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().find_element_user(OWNINGUSER$22, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$22);
            }
            target.set(owninguser);
        }
    }
    
    /**
     * Appends and returns a new empty "owninguser" element
     */
    public com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier addNewOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.UniqueIdentifier)get_store().add_element_user(OWNINGUSER$22);
            return target;
        }
    }
    
    /**
     * Unsets the "owninguser" element
     */
    public void unsetOwninguser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGUSER$22, 0);
        }
    }
    
    /**
     * Gets the "regardingobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup getRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regardingobjectid" element
     */
    public boolean isSetRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGARDINGOBJECTID$24) != 0;
        }
    }
    
    /**
     * Sets the "regardingobjectid" element
     */
    public void setRegardingobjectid(com.microsoft.schemas.crm._2006.webservices.Lookup regardingobjectid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().find_element_user(REGARDINGOBJECTID$24, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$24);
            }
            target.set(regardingobjectid);
        }
    }
    
    /**
     * Appends and returns a new empty "regardingobjectid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Lookup addNewRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Lookup target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Lookup)get_store().add_element_user(REGARDINGOBJECTID$24);
            return target;
        }
    }
    
    /**
     * Unsets the "regardingobjectid" element
     */
    public void unsetRegardingobjectid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGARDINGOBJECTID$24, 0);
        }
    }
    
    /**
     * Gets the "stagename" element
     */
    public java.lang.String getStagename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGENAME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stagename" element
     */
    public org.apache.xmlbeans.XmlString xgetStagename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STAGENAME$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "stagename" element
     */
    public boolean isSetStagename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAGENAME$26) != 0;
        }
    }
    
    /**
     * Sets the "stagename" element
     */
    public void setStagename(java.lang.String stagename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGENAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAGENAME$26);
            }
            target.setStringValue(stagename);
        }
    }
    
    /**
     * Sets (as xml) the "stagename" element
     */
    public void xsetStagename(org.apache.xmlbeans.XmlString stagename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STAGENAME$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STAGENAME$26);
            }
            target.set(stagename);
        }
    }
    
    /**
     * Unsets the "stagename" element
     */
    public void unsetStagename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAGENAME$26, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(STATUS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$28) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(com.microsoft.schemas.crm._2006.webservices.Picklist status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().find_element_user(STATUS$28, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(STATUS$28);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Picklist addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Picklist target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Picklist)get_store().add_element_user(STATUS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$28, 0);
        }
    }
    
    /**
     * Gets the "stepname" element
     */
    public java.lang.String getStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEPNAME$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stepname" element
     */
    public org.apache.xmlbeans.XmlString xgetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEPNAME$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "stepname" element
     */
    public boolean isSetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STEPNAME$30) != 0;
        }
    }
    
    /**
     * Sets the "stepname" element
     */
    public void setStepname(java.lang.String stepname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STEPNAME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STEPNAME$30);
            }
            target.setStringValue(stepname);
        }
    }
    
    /**
     * Sets (as xml) the "stepname" element
     */
    public void xsetStepname(org.apache.xmlbeans.XmlString stepname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STEPNAME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STEPNAME$30);
            }
            target.set(stepname);
        }
    }
    
    /**
     * Unsets the "stepname" element
     */
    public void unsetStepname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STEPNAME$30, 0);
        }
    }
    
    /**
     * Gets the "workflowlogid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getWorkflowlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(WORKFLOWLOGID$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "workflowlogid" element
     */
    public boolean isSetWorkflowlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKFLOWLOGID$32) != 0;
        }
    }
    
    /**
     * Sets the "workflowlogid" element
     */
    public void setWorkflowlogid(com.microsoft.schemas.crm._2006.webservices.Key workflowlogid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(WORKFLOWLOGID$32, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(WORKFLOWLOGID$32);
            }
            target.set(workflowlogid);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowlogid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewWorkflowlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(WORKFLOWLOGID$32);
            return target;
        }
    }
    
    /**
     * Unsets the "workflowlogid" element
     */
    public void unsetWorkflowlogid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKFLOWLOGID$32, 0);
        }
    }
}

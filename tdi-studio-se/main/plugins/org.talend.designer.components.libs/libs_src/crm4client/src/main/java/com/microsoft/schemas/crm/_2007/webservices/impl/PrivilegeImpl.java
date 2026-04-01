/*
 * XML Type:  privilege
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Privilege
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML privilege(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class PrivilegeImpl extends com.microsoft.schemas.crm._2006.webservices.impl.BusinessEntityImpl implements com.microsoft.schemas.crm._2007.webservices.Privilege
{
    
    public PrivilegeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHT$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "accessright");
    private static final javax.xml.namespace.QName CANBEBASIC$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "canbebasic");
    private static final javax.xml.namespace.QName CANBEDEEP$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "canbedeep");
    private static final javax.xml.namespace.QName CANBEGLOBAL$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "canbeglobal");
    private static final javax.xml.namespace.QName CANBELOCAL$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "canbelocal");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "name");
    private static final javax.xml.namespace.QName PRIVILEGEID$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "privilegeid");
    
    
    /**
     * Gets the "accessright" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber getAccessright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ACCESSRIGHT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accessright" element
     */
    public boolean isSetAccessright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSRIGHT$0) != 0;
        }
    }
    
    /**
     * Sets the "accessright" element
     */
    public void setAccessright(com.microsoft.schemas.crm._2006.webservices.CrmNumber accessright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().find_element_user(ACCESSRIGHT$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ACCESSRIGHT$0);
            }
            target.set(accessright);
        }
    }
    
    /**
     * Appends and returns a new empty "accessright" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmNumber addNewAccessright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmNumber target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmNumber)get_store().add_element_user(ACCESSRIGHT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "accessright" element
     */
    public void unsetAccessright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSRIGHT$0, 0);
        }
    }
    
    /**
     * Gets the "canbebasic" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbebasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEBASIC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "canbebasic" element
     */
    public boolean isSetCanbebasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEBASIC$2) != 0;
        }
    }
    
    /**
     * Sets the "canbebasic" element
     */
    public void setCanbebasic(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbebasic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEBASIC$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEBASIC$2);
            }
            target.set(canbebasic);
        }
    }
    
    /**
     * Appends and returns a new empty "canbebasic" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbebasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEBASIC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "canbebasic" element
     */
    public void unsetCanbebasic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEBASIC$2, 0);
        }
    }
    
    /**
     * Gets the "canbedeep" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbedeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEDEEP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "canbedeep" element
     */
    public boolean isSetCanbedeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEDEEP$4) != 0;
        }
    }
    
    /**
     * Sets the "canbedeep" element
     */
    public void setCanbedeep(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbedeep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEDEEP$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEDEEP$4);
            }
            target.set(canbedeep);
        }
    }
    
    /**
     * Appends and returns a new empty "canbedeep" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbedeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEDEEP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "canbedeep" element
     */
    public void unsetCanbedeep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEDEEP$4, 0);
        }
    }
    
    /**
     * Gets the "canbeglobal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbeglobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEGLOBAL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "canbeglobal" element
     */
    public boolean isSetCanbeglobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBEGLOBAL$6) != 0;
        }
    }
    
    /**
     * Sets the "canbeglobal" element
     */
    public void setCanbeglobal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbeglobal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBEGLOBAL$6, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEGLOBAL$6);
            }
            target.set(canbeglobal);
        }
    }
    
    /**
     * Appends and returns a new empty "canbeglobal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbeglobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBEGLOBAL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "canbeglobal" element
     */
    public void unsetCanbeglobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBEGLOBAL$6, 0);
        }
    }
    
    /**
     * Gets the "canbelocal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean getCanbelocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBELOCAL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "canbelocal" element
     */
    public boolean isSetCanbelocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CANBELOCAL$8) != 0;
        }
    }
    
    /**
     * Sets the "canbelocal" element
     */
    public void setCanbelocal(com.microsoft.schemas.crm._2006.webservices.CrmBoolean canbelocal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().find_element_user(CANBELOCAL$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBELOCAL$8);
            }
            target.set(canbelocal);
        }
    }
    
    /**
     * Appends and returns a new empty "canbelocal" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmBoolean addNewCanbelocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmBoolean target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmBoolean)get_store().add_element_user(CANBELOCAL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "canbelocal" element
     */
    public void unsetCanbelocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CANBELOCAL$8, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$10) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$10);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$10);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$10, 0);
        }
    }
    
    /**
     * Gets the "privilegeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key getPrivilegeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PRIVILEGEID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "privilegeid" element
     */
    public boolean isSetPrivilegeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVILEGEID$12) != 0;
        }
    }
    
    /**
     * Sets the "privilegeid" element
     */
    public void setPrivilegeid(com.microsoft.schemas.crm._2006.webservices.Key privilegeid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().find_element_user(PRIVILEGEID$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PRIVILEGEID$12);
            }
            target.set(privilegeid);
        }
    }
    
    /**
     * Appends and returns a new empty "privilegeid" element
     */
    public com.microsoft.schemas.crm._2006.webservices.Key addNewPrivilegeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.Key target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.Key)get_store().add_element_user(PRIVILEGEID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "privilegeid" element
     */
    public void unsetPrivilegeid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVILEGEID$12, 0);
        }
    }
}

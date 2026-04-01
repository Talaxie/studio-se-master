/*
 * XML Type:  Request
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.Request
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML Request(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.Request
{
    
    public RequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTIONALPARAMETERS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "OptionalParameters");
    
    
    /**
     * Gets the "OptionalParameters" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter getOptionalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(OPTIONALPARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OptionalParameters" element
     */
    public void setOptionalParameters(com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter optionalParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().find_element_user(OPTIONALPARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().add_element_user(OPTIONALPARAMETERS$0);
            }
            target.set(optionalParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "OptionalParameters" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter addNewOptionalParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfOptionalParameter)get_store().add_element_user(OPTIONALPARAMETERS$0);
            return target;
        }
    }
}

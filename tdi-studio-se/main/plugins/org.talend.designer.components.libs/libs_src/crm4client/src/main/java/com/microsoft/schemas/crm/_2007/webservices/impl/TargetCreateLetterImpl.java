/*
 * XML Type:  TargetCreateLetter
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateLetter
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateLetter(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateLetterImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateLetter
{
    
    public TargetCreateLetterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LETTER$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Letter");
    
    
    /**
     * Gets the "Letter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Letter getLetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Letter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Letter)get_store().find_element_user(LETTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Letter" element
     */
    public void setLetter(com.microsoft.schemas.crm._2007.webservices.Letter letter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Letter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Letter)get_store().find_element_user(LETTER$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Letter)get_store().add_element_user(LETTER$0);
            }
            target.set(letter);
        }
    }
    
    /**
     * Appends and returns a new empty "Letter" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Letter addNewLetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Letter target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Letter)get_store().add_element_user(LETTER$0);
            return target;
        }
    }
}

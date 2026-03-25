/*
 * XML Type:  TargetUpdateAnnotation
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateAnnotation
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateAnnotation(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateAnnotationImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateAnnotation
{
    
    public TargetUpdateAnnotationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Annotation");
    
    
    /**
     * Gets the "Annotation" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Annotation getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annotation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annotation" element
     */
    public void setAnnotation(com.microsoft.schemas.crm._2007.webservices.Annotation annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annotation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Annotation)get_store().add_element_user(ANNOTATION$0);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotation" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Annotation addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Annotation target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Annotation)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
}

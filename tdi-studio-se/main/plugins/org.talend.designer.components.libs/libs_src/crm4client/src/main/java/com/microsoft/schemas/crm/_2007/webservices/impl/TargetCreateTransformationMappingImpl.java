/*
 * XML Type:  TargetCreateTransformationMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTransformationMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTransformationMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTransformationMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTransformationMapping
{
    
    public TargetCreateTransformationMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATIONMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransformationMapping");
    
    
    /**
     * Gets the "TransformationMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transformationmapping getTransformationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationmapping)get_store().find_element_user(TRANSFORMATIONMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TransformationMapping" element
     */
    public void setTransformationMapping(com.microsoft.schemas.crm._2007.webservices.Transformationmapping transformationMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationmapping)get_store().find_element_user(TRANSFORMATIONMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Transformationmapping)get_store().add_element_user(TRANSFORMATIONMAPPING$0);
            }
            target.set(transformationMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "TransformationMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transformationmapping addNewTransformationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationmapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationmapping)get_store().add_element_user(TRANSFORMATIONMAPPING$0);
            return target;
        }
    }
}

/*
 * XML Type:  TargetCreateTransformationParameterMapping
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTransformationParameterMapping
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTransformationParameterMapping(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTransformationParameterMappingImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTransformationParameterMapping
{
    
    public TargetCreateTransformationParameterMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATIONPARAMETERMAPPING$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TransformationParameterMapping");
    
    
    /**
     * Gets the "TransformationParameterMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping getTransformationParameterMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping)get_store().find_element_user(TRANSFORMATIONPARAMETERMAPPING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TransformationParameterMapping" element
     */
    public void setTransformationParameterMapping(com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping transformationParameterMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping)get_store().find_element_user(TRANSFORMATIONPARAMETERMAPPING$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping)get_store().add_element_user(TRANSFORMATIONPARAMETERMAPPING$0);
            }
            target.set(transformationParameterMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "TransformationParameterMapping" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping addNewTransformationParameterMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Transformationparametermapping)get_store().add_element_user(TRANSFORMATIONPARAMETERMAPPING$0);
            return target;
        }
    }
}

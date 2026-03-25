/*
 * An XML document type.
 * Localname: RouteType
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RouteTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * A document containing one RouteType(@http://schemas.microsoft.com/crm/2007/WebServices) element.
 *
 * This is a complex type.
 */
public class RouteTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2007.webservices.RouteTypeDocument
{
    
    public RouteTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROUTETYPE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RouteType");
    
    
    /**
     * Gets the "RouteType" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RouteType.Enum getRouteType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.coretypes.RouteType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RouteType" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RouteType xgetRouteType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RouteType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().find_element_user(ROUTETYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RouteType" element
     */
    public void setRouteType(com.microsoft.schemas.crm._2006.coretypes.RouteType.Enum routeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTETYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROUTETYPE$0);
            }
            target.setEnumValue(routeType);
        }
    }
    
    /**
     * Sets (as xml) the "RouteType" element
     */
    public void xsetRouteType(com.microsoft.schemas.crm._2006.coretypes.RouteType routeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.coretypes.RouteType target = null;
            target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().find_element_user(ROUTETYPE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().add_element_user(ROUTETYPE$0);
            }
            target.set(routeType);
        }
    }
}

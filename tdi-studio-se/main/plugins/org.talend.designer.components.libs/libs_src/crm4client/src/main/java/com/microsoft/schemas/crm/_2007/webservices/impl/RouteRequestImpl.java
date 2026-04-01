/*
 * XML Type:  RouteRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RouteRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RouteRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RouteRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RouteRequest
{
    
    public RouteRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Target");
    private static final javax.xml.namespace.QName SOURCEQUEUEID$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SourceQueueId");
    private static final javax.xml.namespace.QName ROUTETYPE$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RouteType");
    private static final javax.xml.namespace.QName ENDPOINTID$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EndpointId");
    
    
    /**
     * Gets the "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetQueued getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQueued target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQueued)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(com.microsoft.schemas.crm._2007.webservices.TargetQueued targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQueued target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQueued)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.TargetQueued)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public com.microsoft.schemas.crm._2007.webservices.TargetQueued addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.TargetQueued target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.TargetQueued)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
    
    /**
     * Gets the "SourceQueueId" element
     */
    public java.lang.String getSourceQueueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEQUEUEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceQueueId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSourceQueueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCEQUEUEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SourceQueueId" element
     */
    public void setSourceQueueId(java.lang.String sourceQueueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEQUEUEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEQUEUEID$2);
            }
            target.setStringValue(sourceQueueId);
        }
    }
    
    /**
     * Sets (as xml) the "SourceQueueId" element
     */
    public void xsetSourceQueueId(com.microsoft.wsdl.types.Guid sourceQueueId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SOURCEQUEUEID$2, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SOURCEQUEUEID$2);
            }
            target.set(sourceQueueId);
        }
    }
    
    /**
     * Gets the "RouteType" element
     */
    public com.microsoft.schemas.crm._2006.coretypes.RouteType.Enum getRouteType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTETYPE$4, 0);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().find_element_user(ROUTETYPE$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROUTETYPE$4);
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
            target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().find_element_user(ROUTETYPE$4, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.coretypes.RouteType)get_store().add_element_user(ROUTETYPE$4);
            }
            target.set(routeType);
        }
    }
    
    /**
     * Gets the "EndpointId" element
     */
    public java.lang.String getEndpointId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndpointId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEndpointId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENDPOINTID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EndpointId" element
     */
    public void setEndpointId(java.lang.String endpointId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINTID$6);
            }
            target.setStringValue(endpointId);
        }
    }
    
    /**
     * Sets (as xml) the "EndpointId" element
     */
    public void xsetEndpointId(com.microsoft.wsdl.types.Guid endpointId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENDPOINTID$6, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENDPOINTID$6);
            }
            target.set(endpointId);
        }
    }
}

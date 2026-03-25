/*
 * XML Type:  TargetCreateRelationshipRoleMap
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateRelationshipRoleMap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateRelationshipRoleMap(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateRelationshipRoleMapImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateRelationshipRoleMap
{
    
    public TargetCreateRelationshipRoleMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPROLEMAP$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RelationshipRoleMap");
    
    
    /**
     * Gets the "RelationshipRoleMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap getRelationshipRoleMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap)get_store().find_element_user(RELATIONSHIPROLEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipRoleMap" element
     */
    public void setRelationshipRoleMap(com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap relationshipRoleMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap)get_store().find_element_user(RELATIONSHIPROLEMAP$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap)get_store().add_element_user(RELATIONSHIPROLEMAP$0);
            }
            target.set(relationshipRoleMap);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationshipRoleMap" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap addNewRelationshipRoleMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprolemap)get_store().add_element_user(RELATIONSHIPROLEMAP$0);
            return target;
        }
    }
}

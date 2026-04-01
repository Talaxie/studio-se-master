/*
 * XML Type:  TargetUpdateRelationshipRole
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetUpdateRelationshipRole
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetUpdateRelationshipRole(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetUpdateRelationshipRoleImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetUpdateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetUpdateRelationshipRole
{
    
    public TargetUpdateRelationshipRoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIPROLE$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RelationshipRole");
    
    
    /**
     * Gets the "RelationshipRole" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Relationshiprole getRelationshipRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprole)get_store().find_element_user(RELATIONSHIPROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipRole" element
     */
    public void setRelationshipRole(com.microsoft.schemas.crm._2007.webservices.Relationshiprole relationshipRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprole)get_store().find_element_user(RELATIONSHIPROLE$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprole)get_store().add_element_user(RELATIONSHIPROLE$0);
            }
            target.set(relationshipRole);
        }
    }
    
    /**
     * Appends and returns a new empty "RelationshipRole" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Relationshiprole addNewRelationshipRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Relationshiprole target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Relationshiprole)get_store().add_element_user(RELATIONSHIPROLE$0);
            return target;
        }
    }
}

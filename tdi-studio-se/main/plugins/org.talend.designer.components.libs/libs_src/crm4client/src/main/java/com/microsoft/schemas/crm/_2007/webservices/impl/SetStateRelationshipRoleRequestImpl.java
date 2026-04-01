/*
 * XML Type:  SetStateRelationshipRoleRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SetStateRelationshipRoleRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SetStateRelationshipRoleRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SetStateRelationshipRoleRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.SetStateRelationshipRoleRequest
{
    
    public SetStateRelationshipRoleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "EntityId");
    private static final javax.xml.namespace.QName RELATIONSHIPROLESTATE$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RelationshipRoleState");
    private static final javax.xml.namespace.QName RELATIONSHIPROLESTATUS$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "RelationshipRoleStatus");
    
    
    /**
     * Gets the "EntityId" element
     */
    public java.lang.String getEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EntityId" element
     */
    public com.microsoft.wsdl.types.Guid xgetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EntityId" element
     */
    public void setEntityId(java.lang.String entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
            }
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "EntityId" element
     */
    public void xsetEntityId(com.microsoft.wsdl.types.Guid entityId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(ENTITYID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(ENTITYID$0);
            }
            target.set(entityId);
        }
    }
    
    /**
     * Gets the "RelationshipRoleState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState.Enum getRelationshipRoleState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPROLESTATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipRoleState" element
     */
    public com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState xgetRelationshipRoleState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState)get_store().find_element_user(RELATIONSHIPROLESTATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipRoleState" element
     */
    public void setRelationshipRoleState(com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState.Enum relationshipRoleState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPROLESTATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPROLESTATE$2);
            }
            target.setEnumValue(relationshipRoleState);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipRoleState" element
     */
    public void xsetRelationshipRoleState(com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState relationshipRoleState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState)get_store().find_element_user(RELATIONSHIPROLESTATE$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.RelationshipRoleState)get_store().add_element_user(RELATIONSHIPROLESTATE$2);
            }
            target.set(relationshipRoleState);
        }
    }
    
    /**
     * Gets the "RelationshipRoleStatus" element
     */
    public int getRelationshipRoleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPROLESTATUS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelationshipRoleStatus" element
     */
    public org.apache.xmlbeans.XmlInt xgetRelationshipRoleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELATIONSHIPROLESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RelationshipRoleStatus" element
     */
    public void setRelationshipRoleStatus(int relationshipRoleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIPROLESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIPROLESTATUS$4);
            }
            target.setIntValue(relationshipRoleStatus);
        }
    }
    
    /**
     * Sets (as xml) the "RelationshipRoleStatus" element
     */
    public void xsetRelationshipRoleStatus(org.apache.xmlbeans.XmlInt relationshipRoleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RELATIONSHIPROLESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RELATIONSHIPROLESTATUS$4);
            }
            target.set(relationshipRoleStatus);
        }
    }
}

/*
 * XML Type:  RemoveMembersTeamRequest
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.RemoveMembersTeamRequest
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML RemoveMembersTeamRequest(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class RemoveMembersTeamRequestImpl extends com.microsoft.schemas.crm._2007.webservices.impl.RequestImpl implements com.microsoft.schemas.crm._2007.webservices.RemoveMembersTeamRequest
{
    
    public RemoveMembersTeamRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEAMID$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "TeamId");
    private static final javax.xml.namespace.QName MEMBERIDS$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "MemberIds");
    
    
    /**
     * Gets the "TeamId" element
     */
    public java.lang.String getTeamId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEAMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TeamId" element
     */
    public com.microsoft.wsdl.types.Guid xgetTeamId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEAMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TeamId" element
     */
    public void setTeamId(java.lang.String teamId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEAMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEAMID$0);
            }
            target.setStringValue(teamId);
        }
    }
    
    /**
     * Sets (as xml) the "TeamId" element
     */
    public void xsetTeamId(com.microsoft.wsdl.types.Guid teamId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(TEAMID$0, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(TEAMID$0);
            }
            target.set(teamId);
        }
    }
    
    /**
     * Gets the "MemberIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid getMemberIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(MEMBERIDS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MemberIds" element
     */
    public void setMemberIds(com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid memberIds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().find_element_user(MEMBERIDS$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(MEMBERIDS$2);
            }
            target.set(memberIds);
        }
    }
    
    /**
     * Appends and returns a new empty "MemberIds" element
     */
    public com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid addNewMemberIds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.ArrayOfGuid)get_store().add_element_user(MEMBERIDS$2);
            return target;
        }
    }
}

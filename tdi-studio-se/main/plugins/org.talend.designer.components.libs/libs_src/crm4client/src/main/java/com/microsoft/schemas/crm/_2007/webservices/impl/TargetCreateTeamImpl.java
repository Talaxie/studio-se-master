/*
 * XML Type:  TargetCreateTeam
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.TargetCreateTeam
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML TargetCreateTeam(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class TargetCreateTeamImpl extends com.microsoft.schemas.crm._2007.webservices.impl.TargetCreateImpl implements com.microsoft.schemas.crm._2007.webservices.TargetCreateTeam
{
    
    public TargetCreateTeamImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEAM$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "Team");
    
    
    /**
     * Gets the "Team" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Team getTeam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Team target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Team)get_store().find_element_user(TEAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Team" element
     */
    public void setTeam(com.microsoft.schemas.crm._2007.webservices.Team team)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Team target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Team)get_store().find_element_user(TEAM$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2007.webservices.Team)get_store().add_element_user(TEAM$0);
            }
            target.set(team);
        }
    }
    
    /**
     * Appends and returns a new empty "Team" element
     */
    public com.microsoft.schemas.crm._2007.webservices.Team addNewTeam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2007.webservices.Team target = null;
            target = (com.microsoft.schemas.crm._2007.webservices.Team)get_store().add_element_user(TEAM$0);
            return target;
        }
    }
}

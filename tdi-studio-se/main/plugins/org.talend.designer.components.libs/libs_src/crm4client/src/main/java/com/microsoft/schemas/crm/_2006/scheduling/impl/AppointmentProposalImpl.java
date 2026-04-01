/*
 * XML Type:  AppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML AppointmentProposal(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class AppointmentProposalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.AppointmentProposal
{
    
    public AppointmentProposalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "End");
    private static final javax.xml.namespace.QName SITEID$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SiteId");
    private static final javax.xml.namespace.QName SITENAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "SiteName");
    private static final javax.xml.namespace.QName PROPOSALPARTIES$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "ProposalParties");
    
    
    /**
     * Gets the "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Start" element
     */
    public boolean isSetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(START$0) != 0;
        }
    }
    
    /**
     * Sets the "Start" element
     */
    public void setStart(com.microsoft.schemas.crm._2006.webservices.CrmDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Appends and returns a new empty "Start" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Start" element
     */
    public void unsetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(START$0, 0);
        }
    }
    
    /**
     * Gets the "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "End" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$2) != 0;
        }
    }
    
    /**
     * Sets the "End" element
     */
    public void setEnd(com.microsoft.schemas.crm._2006.webservices.CrmDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$2);
            }
            target.set(end);
        }
    }
    
    /**
     * Appends and returns a new empty "End" element
     */
    public com.microsoft.schemas.crm._2006.webservices.CrmDateTime addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.webservices.CrmDateTime target = null;
            target = (com.microsoft.schemas.crm._2006.webservices.CrmDateTime)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Unsets the "End" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$2, 0);
        }
    }
    
    /**
     * Gets the "SiteId" element
     */
    public java.lang.String getSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteId" element
     */
    public com.microsoft.wsdl.types.Guid xgetSiteId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SITEID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SiteId" element
     */
    public void setSiteId(java.lang.String siteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$4);
            }
            target.setStringValue(siteId);
        }
    }
    
    /**
     * Sets (as xml) the "SiteId" element
     */
    public void xsetSiteId(com.microsoft.wsdl.types.Guid siteId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.wsdl.types.Guid target = null;
            target = (com.microsoft.wsdl.types.Guid)get_store().find_element_user(SITEID$4, 0);
            if (target == null)
            {
                target = (com.microsoft.wsdl.types.Guid)get_store().add_element_user(SITEID$4);
            }
            target.set(siteId);
        }
    }
    
    /**
     * Gets the "SiteName" element
     */
    public java.lang.String getSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SiteName" element
     */
    public org.apache.xmlbeans.XmlString xgetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SiteName" element
     */
    public boolean isSetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "SiteName" element
     */
    public void setSiteName(java.lang.String siteName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITENAME$6);
            }
            target.setStringValue(siteName);
        }
    }
    
    /**
     * Sets (as xml) the "SiteName" element
     */
    public void xsetSiteName(org.apache.xmlbeans.XmlString siteName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITENAME$6);
            }
            target.set(siteName);
        }
    }
    
    /**
     * Unsets the "SiteName" element
     */
    public void unsetSiteName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITENAME$6, 0);
        }
    }
    
    /**
     * Gets the "ProposalParties" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty getProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty)get_store().find_element_user(PROPOSALPARTIES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProposalParties" element
     */
    public boolean isSetProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSALPARTIES$8) != 0;
        }
    }
    
    /**
     * Sets the "ProposalParties" element
     */
    public void setProposalParties(com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty proposalParties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty)get_store().find_element_user(PROPOSALPARTIES$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty)get_store().add_element_user(PROPOSALPARTIES$8);
            }
            target.set(proposalParties);
        }
    }
    
    /**
     * Appends and returns a new empty "ProposalParties" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty addNewProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfProposalParty)get_store().add_element_user(PROPOSALPARTIES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ProposalParties" element
     */
    public void unsetProposalParties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSALPARTIES$8, 0);
        }
    }
}

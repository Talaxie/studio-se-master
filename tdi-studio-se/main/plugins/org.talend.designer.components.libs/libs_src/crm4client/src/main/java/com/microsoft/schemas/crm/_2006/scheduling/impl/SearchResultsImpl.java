/*
 * XML Type:  SearchResults
 * Namespace: http://schemas.microsoft.com/crm/2006/Scheduling
 * Java type: com.microsoft.schemas.crm._2006.scheduling.SearchResults
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.scheduling.impl;
/**
 * An XML SearchResults(@http://schemas.microsoft.com/crm/2006/Scheduling).
 *
 * This is a complex type.
 */
public class SearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.scheduling.SearchResults
{
    
    public SearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPOSALS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "Proposals");
    private static final javax.xml.namespace.QName TRACEINFO$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Scheduling", "TraceInfo");
    
    
    /**
     * Gets the "Proposals" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal getProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal)get_store().find_element_user(PROPOSALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Proposals" element
     */
    public boolean isSetProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSALS$0) != 0;
        }
    }
    
    /**
     * Sets the "Proposals" element
     */
    public void setProposals(com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal proposals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal)get_store().find_element_user(PROPOSALS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal)get_store().add_element_user(PROPOSALS$0);
            }
            target.set(proposals);
        }
    }
    
    /**
     * Appends and returns a new empty "Proposals" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal addNewProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.ArrayOfAppointmentProposal)get_store().add_element_user(PROPOSALS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Proposals" element
     */
    public void unsetProposals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSALS$0, 0);
        }
    }
    
    /**
     * Gets the "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TraceInfo getTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TraceInfo" element
     */
    public boolean isSetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACEINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "TraceInfo" element
     */
    public void setTraceInfo(com.microsoft.schemas.crm._2006.scheduling.TraceInfo traceInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().find_element_user(TRACEINFO$2, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            }
            target.set(traceInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "TraceInfo" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.TraceInfo addNewTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.TraceInfo target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.TraceInfo)get_store().add_element_user(TRACEINFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TraceInfo" element
     */
    public void unsetTraceInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACEINFO$2, 0);
        }
    }
}

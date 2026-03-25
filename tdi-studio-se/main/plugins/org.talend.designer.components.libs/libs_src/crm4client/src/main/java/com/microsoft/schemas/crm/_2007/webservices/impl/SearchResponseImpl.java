/*
 * XML Type:  SearchResponse
 * Namespace: http://schemas.microsoft.com/crm/2007/WebServices
 * Java type: com.microsoft.schemas.crm._2007.webservices.SearchResponse
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2007.webservices.impl;
/**
 * An XML SearchResponse(@http://schemas.microsoft.com/crm/2007/WebServices).
 *
 * This is a complex type.
 */
public class SearchResponseImpl extends com.microsoft.schemas.crm._2007.webservices.impl.ResponseImpl implements com.microsoft.schemas.crm._2007.webservices.SearchResponse
{
    
    public SearchResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2007/WebServices", "SearchResults");
    
    
    /**
     * Gets the "SearchResults" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchResults getSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SearchResults" element
     */
    public void setSearchResults(com.microsoft.schemas.crm._2006.scheduling.SearchResults searchResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().find_element_user(SEARCHRESULTS$0, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            }
            target.set(searchResults);
        }
    }
    
    /**
     * Appends and returns a new empty "SearchResults" element
     */
    public com.microsoft.schemas.crm._2006.scheduling.SearchResults addNewSearchResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.scheduling.SearchResults target = null;
            target = (com.microsoft.schemas.crm._2006.scheduling.SearchResults)get_store().add_element_user(SEARCHRESULTS$0);
            return target;
        }
    }
}

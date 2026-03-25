/*
 * XML Type:  LinkEntity
 * Namespace: http://schemas.microsoft.com/crm/2006/Query
 * Java type: com.microsoft.schemas.crm._2006.query.LinkEntity
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2006.query.impl;
/**
 * An XML LinkEntity(@http://schemas.microsoft.com/crm/2006/Query).
 *
 * This is a complex type.
 */
public class LinkEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.crm._2006.query.LinkEntity
{
    
    public LinkEntityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKFROMATTRIBUTENAME$0 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkFromAttributeName");
    private static final javax.xml.namespace.QName LINKFROMENTITYNAME$2 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkFromEntityName");
    private static final javax.xml.namespace.QName LINKTOENTITYNAME$4 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkToEntityName");
    private static final javax.xml.namespace.QName LINKTOATTRIBUTENAME$6 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkToAttributeName");
    private static final javax.xml.namespace.QName JOINOPERATOR$8 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "JoinOperator");
    private static final javax.xml.namespace.QName LINKCRITERIA$10 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkCriteria");
    private static final javax.xml.namespace.QName LINKENTITIES$12 = 
        new javax.xml.namespace.QName("http://schemas.microsoft.com/crm/2006/Query", "LinkEntities");
    
    
    /**
     * Gets the "LinkFromAttributeName" element
     */
    public java.lang.String getLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMATTRIBUTENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkFromAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkFromAttributeName" element
     */
    public boolean isSetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFROMATTRIBUTENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "LinkFromAttributeName" element
     */
    public void setLinkFromAttributeName(java.lang.String linkFromAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKFROMATTRIBUTENAME$0);
            }
            target.setStringValue(linkFromAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkFromAttributeName" element
     */
    public void xsetLinkFromAttributeName(org.apache.xmlbeans.XmlString linkFromAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMATTRIBUTENAME$0);
            }
            target.set(linkFromAttributeName);
        }
    }
    
    /**
     * Unsets the "LinkFromAttributeName" element
     */
    public void unsetLinkFromAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFROMATTRIBUTENAME$0, 0);
        }
    }
    
    /**
     * Gets the "LinkFromEntityName" element
     */
    public java.lang.String getLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMENTITYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkFromEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkFromEntityName" element
     */
    public boolean isSetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKFROMENTITYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "LinkFromEntityName" element
     */
    public void setLinkFromEntityName(java.lang.String linkFromEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKFROMENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKFROMENTITYNAME$2);
            }
            target.setStringValue(linkFromEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkFromEntityName" element
     */
    public void xsetLinkFromEntityName(org.apache.xmlbeans.XmlString linkFromEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKFROMENTITYNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKFROMENTITYNAME$2);
            }
            target.set(linkFromEntityName);
        }
    }
    
    /**
     * Unsets the "LinkFromEntityName" element
     */
    public void unsetLinkFromEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKFROMENTITYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "LinkToEntityName" element
     */
    public java.lang.String getLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOENTITYNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkToEntityName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkToEntityName" element
     */
    public boolean isSetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKTOENTITYNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "LinkToEntityName" element
     */
    public void setLinkToEntityName(java.lang.String linkToEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTOENTITYNAME$4);
            }
            target.setStringValue(linkToEntityName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkToEntityName" element
     */
    public void xsetLinkToEntityName(org.apache.xmlbeans.XmlString linkToEntityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOENTITYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOENTITYNAME$4);
            }
            target.set(linkToEntityName);
        }
    }
    
    /**
     * Unsets the "LinkToEntityName" element
     */
    public void unsetLinkToEntityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKTOENTITYNAME$4, 0);
        }
    }
    
    /**
     * Gets the "LinkToAttributeName" element
     */
    public java.lang.String getLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOATTRIBUTENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LinkToAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "LinkToAttributeName" element
     */
    public boolean isSetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKTOATTRIBUTENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "LinkToAttributeName" element
     */
    public void setLinkToAttributeName(java.lang.String linkToAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINKTOATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINKTOATTRIBUTENAME$6);
            }
            target.setStringValue(linkToAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "LinkToAttributeName" element
     */
    public void xsetLinkToAttributeName(org.apache.xmlbeans.XmlString linkToAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINKTOATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINKTOATTRIBUTENAME$6);
            }
            target.set(linkToAttributeName);
        }
    }
    
    /**
     * Unsets the "LinkToAttributeName" element
     */
    public void unsetLinkToAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKTOATTRIBUTENAME$6, 0);
        }
    }
    
    /**
     * Gets the "JoinOperator" element
     */
    public com.microsoft.schemas.crm._2006.query.JoinOperator.Enum getJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.microsoft.schemas.crm._2006.query.JoinOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "JoinOperator" element
     */
    public com.microsoft.schemas.crm._2006.query.JoinOperator xgetJoinOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.JoinOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.JoinOperator)get_store().find_element_user(JOINOPERATOR$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "JoinOperator" element
     */
    public void setJoinOperator(com.microsoft.schemas.crm._2006.query.JoinOperator.Enum joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINOPERATOR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOINOPERATOR$8);
            }
            target.setEnumValue(joinOperator);
        }
    }
    
    /**
     * Sets (as xml) the "JoinOperator" element
     */
    public void xsetJoinOperator(com.microsoft.schemas.crm._2006.query.JoinOperator joinOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.JoinOperator target = null;
            target = (com.microsoft.schemas.crm._2006.query.JoinOperator)get_store().find_element_user(JOINOPERATOR$8, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.JoinOperator)get_store().add_element_user(JOINOPERATOR$8);
            }
            target.set(joinOperator);
        }
    }
    
    /**
     * Gets the "LinkCriteria" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression getLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(LINKCRITERIA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LinkCriteria" element
     */
    public boolean isSetLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKCRITERIA$10) != 0;
        }
    }
    
    /**
     * Sets the "LinkCriteria" element
     */
    public void setLinkCriteria(com.microsoft.schemas.crm._2006.query.FilterExpression linkCriteria)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().find_element_user(LINKCRITERIA$10, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().add_element_user(LINKCRITERIA$10);
            }
            target.set(linkCriteria);
        }
    }
    
    /**
     * Appends and returns a new empty "LinkCriteria" element
     */
    public com.microsoft.schemas.crm._2006.query.FilterExpression addNewLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.FilterExpression target = null;
            target = (com.microsoft.schemas.crm._2006.query.FilterExpression)get_store().add_element_user(LINKCRITERIA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "LinkCriteria" element
     */
    public void unsetLinkCriteria()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKCRITERIA$10, 0);
        }
    }
    
    /**
     * Gets the "LinkEntities" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity getLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LinkEntities" element
     */
    public boolean isSetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKENTITIES$12) != 0;
        }
    }
    
    /**
     * Sets the "LinkEntities" element
     */
    public void setLinkEntities(com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity linkEntities)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().find_element_user(LINKENTITIES$12, 0);
            if (target == null)
            {
                target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$12);
            }
            target.set(linkEntities);
        }
    }
    
    /**
     * Appends and returns a new empty "LinkEntities" element
     */
    public com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity addNewLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity target = null;
            target = (com.microsoft.schemas.crm._2006.query.ArrayOfLinkEntity)get_store().add_element_user(LINKENTITIES$12);
            return target;
        }
    }
    
    /**
     * Unsets the "LinkEntities" element
     */
    public void unsetLinkEntities()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKENTITIES$12, 0);
        }
    }
}

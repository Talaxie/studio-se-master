/**
 * WSVersioningUniverseVersionsTagStructure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSVersioningUniverseVersionsTagStructure  implements java.io.Serializable {
    private java.lang.String tagName;

    private java.lang.String lastDate;

    private java.lang.String lastAuthor;

    private java.lang.String lastComment;

    private java.lang.String[] clusters;

    public WSVersioningUniverseVersionsTagStructure() {
    }

    public WSVersioningUniverseVersionsTagStructure(
           java.lang.String tagName,
           java.lang.String lastDate,
           java.lang.String lastAuthor,
           java.lang.String lastComment,
           java.lang.String[] clusters) {
           this.tagName = tagName;
           this.lastDate = lastDate;
           this.lastAuthor = lastAuthor;
           this.lastComment = lastComment;
           this.clusters = clusters;
    }


    /**
     * Gets the tagName value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @return tagName
     */
    public java.lang.String getTagName() {
        return tagName;
    }


    /**
     * Sets the tagName value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @param tagName
     */
    public void setTagName(java.lang.String tagName) {
        this.tagName = tagName;
    }


    /**
     * Gets the lastDate value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @return lastDate
     */
    public java.lang.String getLastDate() {
        return lastDate;
    }


    /**
     * Sets the lastDate value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @param lastDate
     */
    public void setLastDate(java.lang.String lastDate) {
        this.lastDate = lastDate;
    }


    /**
     * Gets the lastAuthor value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @return lastAuthor
     */
    public java.lang.String getLastAuthor() {
        return lastAuthor;
    }


    /**
     * Sets the lastAuthor value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @param lastAuthor
     */
    public void setLastAuthor(java.lang.String lastAuthor) {
        this.lastAuthor = lastAuthor;
    }


    /**
     * Gets the lastComment value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @return lastComment
     */
    public java.lang.String getLastComment() {
        return lastComment;
    }


    /**
     * Sets the lastComment value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @param lastComment
     */
    public void setLastComment(java.lang.String lastComment) {
        this.lastComment = lastComment;
    }


    /**
     * Gets the clusters value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @return clusters
     */
    public java.lang.String[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this WSVersioningUniverseVersionsTagStructure.
     * 
     * @param clusters
     */
    public void setClusters(java.lang.String[] clusters) {
        this.clusters = clusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningUniverseVersionsTagStructure)) return false;
        WSVersioningUniverseVersionsTagStructure other = (WSVersioningUniverseVersionsTagStructure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tagName==null && other.getTagName()==null) || 
             (this.tagName!=null &&
              this.tagName.equals(other.getTagName()))) &&
            ((this.lastDate==null && other.getLastDate()==null) || 
             (this.lastDate!=null &&
              this.lastDate.equals(other.getLastDate()))) &&
            ((this.lastAuthor==null && other.getLastAuthor()==null) || 
             (this.lastAuthor!=null &&
              this.lastAuthor.equals(other.getLastAuthor()))) &&
            ((this.lastComment==null && other.getLastComment()==null) || 
             (this.lastComment!=null &&
              this.lastComment.equals(other.getLastComment()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTagName() != null) {
            _hashCode += getTagName().hashCode();
        }
        if (getLastDate() != null) {
            _hashCode += getLastDate().hashCode();
        }
        if (getLastAuthor() != null) {
            _hashCode += getLastAuthor().hashCode();
        }
        if (getLastComment() != null) {
            _hashCode += getLastComment().hashCode();
        }
        if (getClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSVersioningUniverseVersionsTagStructure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningUniverseVersions>tagStructure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

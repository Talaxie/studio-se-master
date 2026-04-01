/**
 * WSGetChildrenItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Get children items
 */
public class WSGetChildrenItems  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.String conceptName;

    private java.lang.String[] PKXpaths;

    private java.lang.String FKXpath;

    private java.lang.String labelXpath;

    private java.lang.String fatherPK;

    private org.talend.mdm.webservice.WSWhereItem whereItem;

    private int start;

    private int limit;

    public WSGetChildrenItems() {
    }

    public WSGetChildrenItems(
           java.lang.String clusterName,
           java.lang.String conceptName,
           java.lang.String[] PKXpaths,
           java.lang.String FKXpath,
           java.lang.String labelXpath,
           java.lang.String fatherPK,
           org.talend.mdm.webservice.WSWhereItem whereItem,
           int start,
           int limit) {
           this.clusterName = clusterName;
           this.conceptName = conceptName;
           this.PKXpaths = PKXpaths;
           this.FKXpath = FKXpath;
           this.labelXpath = labelXpath;
           this.fatherPK = fatherPK;
           this.whereItem = whereItem;
           this.start = start;
           this.limit = limit;
    }


    /**
     * Gets the clusterName value for this WSGetChildrenItems.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WSGetChildrenItems.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the conceptName value for this WSGetChildrenItems.
     * 
     * @return conceptName
     */
    public java.lang.String getConceptName() {
        return conceptName;
    }


    /**
     * Sets the conceptName value for this WSGetChildrenItems.
     * 
     * @param conceptName
     */
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }


    /**
     * Gets the PKXpaths value for this WSGetChildrenItems.
     * 
     * @return PKXpaths
     */
    public java.lang.String[] getPKXpaths() {
        return PKXpaths;
    }


    /**
     * Sets the PKXpaths value for this WSGetChildrenItems.
     * 
     * @param PKXpaths
     */
    public void setPKXpaths(java.lang.String[] PKXpaths) {
        this.PKXpaths = PKXpaths;
    }


    /**
     * Gets the FKXpath value for this WSGetChildrenItems.
     * 
     * @return FKXpath
     */
    public java.lang.String getFKXpath() {
        return FKXpath;
    }


    /**
     * Sets the FKXpath value for this WSGetChildrenItems.
     * 
     * @param FKXpath
     */
    public void setFKXpath(java.lang.String FKXpath) {
        this.FKXpath = FKXpath;
    }


    /**
     * Gets the labelXpath value for this WSGetChildrenItems.
     * 
     * @return labelXpath
     */
    public java.lang.String getLabelXpath() {
        return labelXpath;
    }


    /**
     * Sets the labelXpath value for this WSGetChildrenItems.
     * 
     * @param labelXpath
     */
    public void setLabelXpath(java.lang.String labelXpath) {
        this.labelXpath = labelXpath;
    }


    /**
     * Gets the fatherPK value for this WSGetChildrenItems.
     * 
     * @return fatherPK
     */
    public java.lang.String getFatherPK() {
        return fatherPK;
    }


    /**
     * Sets the fatherPK value for this WSGetChildrenItems.
     * 
     * @param fatherPK
     */
    public void setFatherPK(java.lang.String fatherPK) {
        this.fatherPK = fatherPK;
    }


    /**
     * Gets the whereItem value for this WSGetChildrenItems.
     * 
     * @return whereItem
     */
    public org.talend.mdm.webservice.WSWhereItem getWhereItem() {
        return whereItem;
    }


    /**
     * Sets the whereItem value for this WSGetChildrenItems.
     * 
     * @param whereItem
     */
    public void setWhereItem(org.talend.mdm.webservice.WSWhereItem whereItem) {
        this.whereItem = whereItem;
    }


    /**
     * Gets the start value for this WSGetChildrenItems.
     * 
     * @return start
     */
    public int getStart() {
        return start;
    }


    /**
     * Sets the start value for this WSGetChildrenItems.
     * 
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }


    /**
     * Gets the limit value for this WSGetChildrenItems.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this WSGetChildrenItems.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetChildrenItems)) return false;
        WSGetChildrenItems other = (WSGetChildrenItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.conceptName==null && other.getConceptName()==null) || 
             (this.conceptName!=null &&
              this.conceptName.equals(other.getConceptName()))) &&
            ((this.PKXpaths==null && other.getPKXpaths()==null) || 
             (this.PKXpaths!=null &&
              java.util.Arrays.equals(this.PKXpaths, other.getPKXpaths()))) &&
            ((this.FKXpath==null && other.getFKXpath()==null) || 
             (this.FKXpath!=null &&
              this.FKXpath.equals(other.getFKXpath()))) &&
            ((this.labelXpath==null && other.getLabelXpath()==null) || 
             (this.labelXpath!=null &&
              this.labelXpath.equals(other.getLabelXpath()))) &&
            ((this.fatherPK==null && other.getFatherPK()==null) || 
             (this.fatherPK!=null &&
              this.fatherPK.equals(other.getFatherPK()))) &&
            ((this.whereItem==null && other.getWhereItem()==null) || 
             (this.whereItem!=null &&
              this.whereItem.equals(other.getWhereItem()))) &&
            this.start == other.getStart() &&
            this.limit == other.getLimit();
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
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getConceptName() != null) {
            _hashCode += getConceptName().hashCode();
        }
        if (getPKXpaths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPKXpaths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPKXpaths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFKXpath() != null) {
            _hashCode += getFKXpath().hashCode();
        }
        if (getLabelXpath() != null) {
            _hashCode += getLabelXpath().hashCode();
        }
        if (getFatherPK() != null) {
            _hashCode += getFatherPK().hashCode();
        }
        if (getWhereItem() != null) {
            _hashCode += getWhereItem().hashCode();
        }
        _hashCode += getStart();
        _hashCode += getLimit();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetChildrenItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetChildrenItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conceptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PKXpaths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PKXpaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FKXpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FKXpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelXpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelXpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fatherPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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

/**
 * WSGetItemsPivotIndex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Get items hierarchical tree according to pivots
 */
public class WSGetItemsPivotIndex  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.String mainPivotName;

    private org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry[] pivotWithKeys;

    private java.lang.String[] indexPaths;

    private org.talend.mdm.webservice.WSWhereItem whereItem;

    private java.lang.String[] pivotDirections;

    private java.lang.String[] indexDirections;

    private int start;

    private int limit;

    public WSGetItemsPivotIndex() {
    }

    public WSGetItemsPivotIndex(
           java.lang.String clusterName,
           java.lang.String mainPivotName,
           org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry[] pivotWithKeys,
           java.lang.String[] indexPaths,
           org.talend.mdm.webservice.WSWhereItem whereItem,
           java.lang.String[] pivotDirections,
           java.lang.String[] indexDirections,
           int start,
           int limit) {
           this.clusterName = clusterName;
           this.mainPivotName = mainPivotName;
           this.pivotWithKeys = pivotWithKeys;
           this.indexPaths = indexPaths;
           this.whereItem = whereItem;
           this.pivotDirections = pivotDirections;
           this.indexDirections = indexDirections;
           this.start = start;
           this.limit = limit;
    }


    /**
     * Gets the clusterName value for this WSGetItemsPivotIndex.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WSGetItemsPivotIndex.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the mainPivotName value for this WSGetItemsPivotIndex.
     * 
     * @return mainPivotName
     */
    public java.lang.String getMainPivotName() {
        return mainPivotName;
    }


    /**
     * Sets the mainPivotName value for this WSGetItemsPivotIndex.
     * 
     * @param mainPivotName
     */
    public void setMainPivotName(java.lang.String mainPivotName) {
        this.mainPivotName = mainPivotName;
    }


    /**
     * Gets the pivotWithKeys value for this WSGetItemsPivotIndex.
     * 
     * @return pivotWithKeys
     */
    public org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry[] getPivotWithKeys() {
        return pivotWithKeys;
    }


    /**
     * Sets the pivotWithKeys value for this WSGetItemsPivotIndex.
     * 
     * @param pivotWithKeys
     */
    public void setPivotWithKeys(org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry[] pivotWithKeys) {
        this.pivotWithKeys = pivotWithKeys;
    }


    /**
     * Gets the indexPaths value for this WSGetItemsPivotIndex.
     * 
     * @return indexPaths
     */
    public java.lang.String[] getIndexPaths() {
        return indexPaths;
    }


    /**
     * Sets the indexPaths value for this WSGetItemsPivotIndex.
     * 
     * @param indexPaths
     */
    public void setIndexPaths(java.lang.String[] indexPaths) {
        this.indexPaths = indexPaths;
    }


    /**
     * Gets the whereItem value for this WSGetItemsPivotIndex.
     * 
     * @return whereItem
     */
    public org.talend.mdm.webservice.WSWhereItem getWhereItem() {
        return whereItem;
    }


    /**
     * Sets the whereItem value for this WSGetItemsPivotIndex.
     * 
     * @param whereItem
     */
    public void setWhereItem(org.talend.mdm.webservice.WSWhereItem whereItem) {
        this.whereItem = whereItem;
    }


    /**
     * Gets the pivotDirections value for this WSGetItemsPivotIndex.
     * 
     * @return pivotDirections
     */
    public java.lang.String[] getPivotDirections() {
        return pivotDirections;
    }


    /**
     * Sets the pivotDirections value for this WSGetItemsPivotIndex.
     * 
     * @param pivotDirections
     */
    public void setPivotDirections(java.lang.String[] pivotDirections) {
        this.pivotDirections = pivotDirections;
    }


    /**
     * Gets the indexDirections value for this WSGetItemsPivotIndex.
     * 
     * @return indexDirections
     */
    public java.lang.String[] getIndexDirections() {
        return indexDirections;
    }


    /**
     * Sets the indexDirections value for this WSGetItemsPivotIndex.
     * 
     * @param indexDirections
     */
    public void setIndexDirections(java.lang.String[] indexDirections) {
        this.indexDirections = indexDirections;
    }


    /**
     * Gets the start value for this WSGetItemsPivotIndex.
     * 
     * @return start
     */
    public int getStart() {
        return start;
    }


    /**
     * Sets the start value for this WSGetItemsPivotIndex.
     * 
     * @param start
     */
    public void setStart(int start) {
        this.start = start;
    }


    /**
     * Gets the limit value for this WSGetItemsPivotIndex.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this WSGetItemsPivotIndex.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetItemsPivotIndex)) return false;
        WSGetItemsPivotIndex other = (WSGetItemsPivotIndex) obj;
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
            ((this.mainPivotName==null && other.getMainPivotName()==null) || 
             (this.mainPivotName!=null &&
              this.mainPivotName.equals(other.getMainPivotName()))) &&
            ((this.pivotWithKeys==null && other.getPivotWithKeys()==null) || 
             (this.pivotWithKeys!=null &&
              java.util.Arrays.equals(this.pivotWithKeys, other.getPivotWithKeys()))) &&
            ((this.indexPaths==null && other.getIndexPaths()==null) || 
             (this.indexPaths!=null &&
              java.util.Arrays.equals(this.indexPaths, other.getIndexPaths()))) &&
            ((this.whereItem==null && other.getWhereItem()==null) || 
             (this.whereItem!=null &&
              this.whereItem.equals(other.getWhereItem()))) &&
            ((this.pivotDirections==null && other.getPivotDirections()==null) || 
             (this.pivotDirections!=null &&
              java.util.Arrays.equals(this.pivotDirections, other.getPivotDirections()))) &&
            ((this.indexDirections==null && other.getIndexDirections()==null) || 
             (this.indexDirections!=null &&
              java.util.Arrays.equals(this.indexDirections, other.getIndexDirections()))) &&
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
        if (getMainPivotName() != null) {
            _hashCode += getMainPivotName().hashCode();
        }
        if (getPivotWithKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPivotWithKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPivotWithKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndexPaths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndexPaths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndexPaths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhereItem() != null) {
            _hashCode += getWhereItem().hashCode();
        }
        if (getPivotDirections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPivotDirections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPivotDirections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndexDirections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndexDirections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndexDirections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStart();
        _hashCode += getLimit();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetItemsPivotIndex.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsPivotIndex"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainPivotName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainPivotName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivotWithKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pivotWithKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSLinkedHashMap>typedContentEntry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexPaths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexPaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pivotDirections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pivotDirections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indexDirections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indexDirections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
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

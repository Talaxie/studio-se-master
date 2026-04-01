/**
 * WSGetItemsByCustomFKFilters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Return items based on customized FK filters
 */
public class WSGetItemsByCustomFKFilters  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private java.lang.String conceptName;

    private java.lang.String[] viewablePaths;

    private java.lang.String injectedXpath;

    private int skip;

    private int maxItems;

    private java.lang.String orderBy;

    private java.lang.String direction;

    private java.lang.Boolean returnCount;

    private org.talend.mdm.webservice.WSWhereItem whereItem;

    public WSGetItemsByCustomFKFilters() {
    }

    public WSGetItemsByCustomFKFilters(
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           java.lang.String conceptName,
           java.lang.String[] viewablePaths,
           java.lang.String injectedXpath,
           int skip,
           int maxItems,
           java.lang.String orderBy,
           java.lang.String direction,
           java.lang.Boolean returnCount,
           org.talend.mdm.webservice.WSWhereItem whereItem) {
           this.wsDataClusterPK = wsDataClusterPK;
           this.conceptName = conceptName;
           this.viewablePaths = viewablePaths;
           this.injectedXpath = injectedXpath;
           this.skip = skip;
           this.maxItems = maxItems;
           this.orderBy = orderBy;
           this.direction = direction;
           this.returnCount = returnCount;
           this.whereItem = whereItem;
    }


    /**
     * Gets the wsDataClusterPK value for this WSGetItemsByCustomFKFilters.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSGetItemsByCustomFKFilters.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the conceptName value for this WSGetItemsByCustomFKFilters.
     * 
     * @return conceptName
     */
    public java.lang.String getConceptName() {
        return conceptName;
    }


    /**
     * Sets the conceptName value for this WSGetItemsByCustomFKFilters.
     * 
     * @param conceptName
     */
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }


    /**
     * Gets the viewablePaths value for this WSGetItemsByCustomFKFilters.
     * 
     * @return viewablePaths
     */
    public java.lang.String[] getViewablePaths() {
        return viewablePaths;
    }


    /**
     * Sets the viewablePaths value for this WSGetItemsByCustomFKFilters.
     * 
     * @param viewablePaths
     */
    public void setViewablePaths(java.lang.String[] viewablePaths) {
        this.viewablePaths = viewablePaths;
    }


    /**
     * Gets the injectedXpath value for this WSGetItemsByCustomFKFilters.
     * 
     * @return injectedXpath
     */
    public java.lang.String getInjectedXpath() {
        return injectedXpath;
    }


    /**
     * Sets the injectedXpath value for this WSGetItemsByCustomFKFilters.
     * 
     * @param injectedXpath
     */
    public void setInjectedXpath(java.lang.String injectedXpath) {
        this.injectedXpath = injectedXpath;
    }


    /**
     * Gets the skip value for this WSGetItemsByCustomFKFilters.
     * 
     * @return skip
     */
    public int getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this WSGetItemsByCustomFKFilters.
     * 
     * @param skip
     */
    public void setSkip(int skip) {
        this.skip = skip;
    }


    /**
     * Gets the maxItems value for this WSGetItemsByCustomFKFilters.
     * 
     * @return maxItems
     */
    public int getMaxItems() {
        return maxItems;
    }


    /**
     * Sets the maxItems value for this WSGetItemsByCustomFKFilters.
     * 
     * @param maxItems
     */
    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }


    /**
     * Gets the orderBy value for this WSGetItemsByCustomFKFilters.
     * 
     * @return orderBy
     */
    public java.lang.String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this WSGetItemsByCustomFKFilters.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the direction value for this WSGetItemsByCustomFKFilters.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this WSGetItemsByCustomFKFilters.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the returnCount value for this WSGetItemsByCustomFKFilters.
     * 
     * @return returnCount
     */
    public java.lang.Boolean getReturnCount() {
        return returnCount;
    }


    /**
     * Sets the returnCount value for this WSGetItemsByCustomFKFilters.
     * 
     * @param returnCount
     */
    public void setReturnCount(java.lang.Boolean returnCount) {
        this.returnCount = returnCount;
    }


    /**
     * Gets the whereItem value for this WSGetItemsByCustomFKFilters.
     * 
     * @return whereItem
     */
    public org.talend.mdm.webservice.WSWhereItem getWhereItem() {
        return whereItem;
    }


    /**
     * Sets the whereItem value for this WSGetItemsByCustomFKFilters.
     * 
     * @param whereItem
     */
    public void setWhereItem(org.talend.mdm.webservice.WSWhereItem whereItem) {
        this.whereItem = whereItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetItemsByCustomFKFilters)) return false;
        WSGetItemsByCustomFKFilters other = (WSGetItemsByCustomFKFilters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataClusterPK==null && other.getWsDataClusterPK()==null) || 
             (this.wsDataClusterPK!=null &&
              this.wsDataClusterPK.equals(other.getWsDataClusterPK()))) &&
            ((this.conceptName==null && other.getConceptName()==null) || 
             (this.conceptName!=null &&
              this.conceptName.equals(other.getConceptName()))) &&
            ((this.viewablePaths==null && other.getViewablePaths()==null) || 
             (this.viewablePaths!=null &&
              java.util.Arrays.equals(this.viewablePaths, other.getViewablePaths()))) &&
            ((this.injectedXpath==null && other.getInjectedXpath()==null) || 
             (this.injectedXpath!=null &&
              this.injectedXpath.equals(other.getInjectedXpath()))) &&
            this.skip == other.getSkip() &&
            this.maxItems == other.getMaxItems() &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.returnCount==null && other.getReturnCount()==null) || 
             (this.returnCount!=null &&
              this.returnCount.equals(other.getReturnCount()))) &&
            ((this.whereItem==null && other.getWhereItem()==null) || 
             (this.whereItem!=null &&
              this.whereItem.equals(other.getWhereItem())));
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
        if (getWsDataClusterPK() != null) {
            _hashCode += getWsDataClusterPK().hashCode();
        }
        if (getConceptName() != null) {
            _hashCode += getConceptName().hashCode();
        }
        if (getViewablePaths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewablePaths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewablePaths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInjectedXpath() != null) {
            _hashCode += getInjectedXpath().hashCode();
        }
        _hashCode += getSkip();
        _hashCode += getMaxItems();
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getReturnCount() != null) {
            _hashCode += getReturnCount().hashCode();
        }
        if (getWhereItem() != null) {
            _hashCode += getWhereItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetItemsByCustomFKFilters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsByCustomFKFilters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conceptName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conceptName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewablePaths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewablePaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("injectedXpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "injectedXpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returnCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

/**
 * WSExtractUsingTransformerThruView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Extract data using a Transformer and thru a View
 * 				Data is returned in the pipeline in com.amalto.core.extract.xxx
 * 				where xxx is sequential number starting from 1
 */
public class WSExtractUsingTransformerThruView  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private org.talend.mdm.webservice.WSTransformerPK wsTransformerPK;

    private org.talend.mdm.webservice.WSViewPK wsViewPK;

    private org.talend.mdm.webservice.WSWhereItem whereItem;

    private int spellTreshold;

    private int skip;

    private int maxItems;

    private java.lang.String orderBy;

    private java.lang.String direction;

    public WSExtractUsingTransformerThruView() {
    }

    public WSExtractUsingTransformerThruView(
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           org.talend.mdm.webservice.WSTransformerPK wsTransformerPK,
           org.talend.mdm.webservice.WSViewPK wsViewPK,
           org.talend.mdm.webservice.WSWhereItem whereItem,
           int spellTreshold,
           int skip,
           int maxItems,
           java.lang.String orderBy,
           java.lang.String direction) {
           this.wsDataClusterPK = wsDataClusterPK;
           this.wsTransformerPK = wsTransformerPK;
           this.wsViewPK = wsViewPK;
           this.whereItem = whereItem;
           this.spellTreshold = spellTreshold;
           this.skip = skip;
           this.maxItems = maxItems;
           this.orderBy = orderBy;
           this.direction = direction;
    }


    /**
     * Gets the wsDataClusterPK value for this WSExtractUsingTransformerThruView.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSExtractUsingTransformerThruView.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the wsTransformerPK value for this WSExtractUsingTransformerThruView.
     * 
     * @return wsTransformerPK
     */
    public org.talend.mdm.webservice.WSTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }


    /**
     * Sets the wsTransformerPK value for this WSExtractUsingTransformerThruView.
     * 
     * @param wsTransformerPK
     */
    public void setWsTransformerPK(org.talend.mdm.webservice.WSTransformerPK wsTransformerPK) {
        this.wsTransformerPK = wsTransformerPK;
    }


    /**
     * Gets the wsViewPK value for this WSExtractUsingTransformerThruView.
     * 
     * @return wsViewPK
     */
    public org.talend.mdm.webservice.WSViewPK getWsViewPK() {
        return wsViewPK;
    }


    /**
     * Sets the wsViewPK value for this WSExtractUsingTransformerThruView.
     * 
     * @param wsViewPK
     */
    public void setWsViewPK(org.talend.mdm.webservice.WSViewPK wsViewPK) {
        this.wsViewPK = wsViewPK;
    }


    /**
     * Gets the whereItem value for this WSExtractUsingTransformerThruView.
     * 
     * @return whereItem
     */
    public org.talend.mdm.webservice.WSWhereItem getWhereItem() {
        return whereItem;
    }


    /**
     * Sets the whereItem value for this WSExtractUsingTransformerThruView.
     * 
     * @param whereItem
     */
    public void setWhereItem(org.talend.mdm.webservice.WSWhereItem whereItem) {
        this.whereItem = whereItem;
    }


    /**
     * Gets the spellTreshold value for this WSExtractUsingTransformerThruView.
     * 
     * @return spellTreshold
     */
    public int getSpellTreshold() {
        return spellTreshold;
    }


    /**
     * Sets the spellTreshold value for this WSExtractUsingTransformerThruView.
     * 
     * @param spellTreshold
     */
    public void setSpellTreshold(int spellTreshold) {
        this.spellTreshold = spellTreshold;
    }


    /**
     * Gets the skip value for this WSExtractUsingTransformerThruView.
     * 
     * @return skip
     */
    public int getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this WSExtractUsingTransformerThruView.
     * 
     * @param skip
     */
    public void setSkip(int skip) {
        this.skip = skip;
    }


    /**
     * Gets the maxItems value for this WSExtractUsingTransformerThruView.
     * 
     * @return maxItems
     */
    public int getMaxItems() {
        return maxItems;
    }


    /**
     * Sets the maxItems value for this WSExtractUsingTransformerThruView.
     * 
     * @param maxItems
     */
    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }


    /**
     * Gets the orderBy value for this WSExtractUsingTransformerThruView.
     * 
     * @return orderBy
     */
    public java.lang.String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this WSExtractUsingTransformerThruView.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the direction value for this WSExtractUsingTransformerThruView.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this WSExtractUsingTransformerThruView.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExtractUsingTransformerThruView)) return false;
        WSExtractUsingTransformerThruView other = (WSExtractUsingTransformerThruView) obj;
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
            ((this.wsTransformerPK==null && other.getWsTransformerPK()==null) || 
             (this.wsTransformerPK!=null &&
              this.wsTransformerPK.equals(other.getWsTransformerPK()))) &&
            ((this.wsViewPK==null && other.getWsViewPK()==null) || 
             (this.wsViewPK!=null &&
              this.wsViewPK.equals(other.getWsViewPK()))) &&
            ((this.whereItem==null && other.getWhereItem()==null) || 
             (this.whereItem!=null &&
              this.whereItem.equals(other.getWhereItem()))) &&
            this.spellTreshold == other.getSpellTreshold() &&
            this.skip == other.getSkip() &&
            this.maxItems == other.getMaxItems() &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              this.orderBy.equals(other.getOrderBy()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection())));
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
        if (getWsTransformerPK() != null) {
            _hashCode += getWsTransformerPK().hashCode();
        }
        if (getWsViewPK() != null) {
            _hashCode += getWsViewPK().hashCode();
        }
        if (getWhereItem() != null) {
            _hashCode += getWhereItem().hashCode();
        }
        _hashCode += getSpellTreshold();
        _hashCode += getSkip();
        _hashCode += getMaxItems();
        if (getOrderBy() != null) {
            _hashCode += getOrderBy().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExtractUsingTransformerThruView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformerThruView"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformerPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformerPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsViewPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsViewPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spellTreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spellTreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

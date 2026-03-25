/**
 * WSQuickSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Quick searches on the searchable elements of the view
 */
public class WSQuickSearch  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private org.talend.mdm.webservice.WSViewPK wsViewPK;

    private java.lang.String searchedValue;

    private int maxItems;

    private int skip;

    private int spellTreshold;

    private boolean matchAllWords;

    private java.lang.String orderBy;

    private java.lang.String direction;

    public WSQuickSearch() {
    }

    public WSQuickSearch(
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           org.talend.mdm.webservice.WSViewPK wsViewPK,
           java.lang.String searchedValue,
           int maxItems,
           int skip,
           int spellTreshold,
           boolean matchAllWords,
           java.lang.String orderBy,
           java.lang.String direction) {
           this.wsDataClusterPK = wsDataClusterPK;
           this.wsViewPK = wsViewPK;
           this.searchedValue = searchedValue;
           this.maxItems = maxItems;
           this.skip = skip;
           this.spellTreshold = spellTreshold;
           this.matchAllWords = matchAllWords;
           this.orderBy = orderBy;
           this.direction = direction;
    }


    /**
     * Gets the wsDataClusterPK value for this WSQuickSearch.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSQuickSearch.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the wsViewPK value for this WSQuickSearch.
     * 
     * @return wsViewPK
     */
    public org.talend.mdm.webservice.WSViewPK getWsViewPK() {
        return wsViewPK;
    }


    /**
     * Sets the wsViewPK value for this WSQuickSearch.
     * 
     * @param wsViewPK
     */
    public void setWsViewPK(org.talend.mdm.webservice.WSViewPK wsViewPK) {
        this.wsViewPK = wsViewPK;
    }


    /**
     * Gets the searchedValue value for this WSQuickSearch.
     * 
     * @return searchedValue
     */
    public java.lang.String getSearchedValue() {
        return searchedValue;
    }


    /**
     * Sets the searchedValue value for this WSQuickSearch.
     * 
     * @param searchedValue
     */
    public void setSearchedValue(java.lang.String searchedValue) {
        this.searchedValue = searchedValue;
    }


    /**
     * Gets the maxItems value for this WSQuickSearch.
     * 
     * @return maxItems
     */
    public int getMaxItems() {
        return maxItems;
    }


    /**
     * Sets the maxItems value for this WSQuickSearch.
     * 
     * @param maxItems
     */
    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }


    /**
     * Gets the skip value for this WSQuickSearch.
     * 
     * @return skip
     */
    public int getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this WSQuickSearch.
     * 
     * @param skip
     */
    public void setSkip(int skip) {
        this.skip = skip;
    }


    /**
     * Gets the spellTreshold value for this WSQuickSearch.
     * 
     * @return spellTreshold
     */
    public int getSpellTreshold() {
        return spellTreshold;
    }


    /**
     * Sets the spellTreshold value for this WSQuickSearch.
     * 
     * @param spellTreshold
     */
    public void setSpellTreshold(int spellTreshold) {
        this.spellTreshold = spellTreshold;
    }


    /**
     * Gets the matchAllWords value for this WSQuickSearch.
     * 
     * @return matchAllWords
     */
    public boolean isMatchAllWords() {
        return matchAllWords;
    }


    /**
     * Sets the matchAllWords value for this WSQuickSearch.
     * 
     * @param matchAllWords
     */
    public void setMatchAllWords(boolean matchAllWords) {
        this.matchAllWords = matchAllWords;
    }


    /**
     * Gets the orderBy value for this WSQuickSearch.
     * 
     * @return orderBy
     */
    public java.lang.String getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this WSQuickSearch.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the direction value for this WSQuickSearch.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this WSQuickSearch.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSQuickSearch)) return false;
        WSQuickSearch other = (WSQuickSearch) obj;
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
            ((this.wsViewPK==null && other.getWsViewPK()==null) || 
             (this.wsViewPK!=null &&
              this.wsViewPK.equals(other.getWsViewPK()))) &&
            ((this.searchedValue==null && other.getSearchedValue()==null) || 
             (this.searchedValue!=null &&
              this.searchedValue.equals(other.getSearchedValue()))) &&
            this.maxItems == other.getMaxItems() &&
            this.skip == other.getSkip() &&
            this.spellTreshold == other.getSpellTreshold() &&
            this.matchAllWords == other.isMatchAllWords() &&
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
        if (getWsViewPK() != null) {
            _hashCode += getWsViewPK().hashCode();
        }
        if (getSearchedValue() != null) {
            _hashCode += getSearchedValue().hashCode();
        }
        _hashCode += getMaxItems();
        _hashCode += getSkip();
        _hashCode += getSpellTreshold();
        _hashCode += (isMatchAllWords() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        new org.apache.axis.description.TypeDesc(WSQuickSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSQuickSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsViewPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsViewPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxItems"));
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
        elemField.setFieldName("spellTreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spellTreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchAllWords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchAllWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

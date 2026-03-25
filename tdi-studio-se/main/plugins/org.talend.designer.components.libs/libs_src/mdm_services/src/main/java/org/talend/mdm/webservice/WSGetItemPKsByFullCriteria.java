/**
 * WSGetItemPKsByFullCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Returns items based on criteria
 */
public class WSGetItemPKsByFullCriteria  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSGetItemPKsByCriteria wsGetItemPKsByCriteria;

    private boolean useFTSearch;

    public WSGetItemPKsByFullCriteria() {
    }

    public WSGetItemPKsByFullCriteria(
           org.talend.mdm.webservice.WSGetItemPKsByCriteria wsGetItemPKsByCriteria,
           boolean useFTSearch) {
           this.wsGetItemPKsByCriteria = wsGetItemPKsByCriteria;
           this.useFTSearch = useFTSearch;
    }


    /**
     * Gets the wsGetItemPKsByCriteria value for this WSGetItemPKsByFullCriteria.
     * 
     * @return wsGetItemPKsByCriteria
     */
    public org.talend.mdm.webservice.WSGetItemPKsByCriteria getWsGetItemPKsByCriteria() {
        return wsGetItemPKsByCriteria;
    }


    /**
     * Sets the wsGetItemPKsByCriteria value for this WSGetItemPKsByFullCriteria.
     * 
     * @param wsGetItemPKsByCriteria
     */
    public void setWsGetItemPKsByCriteria(org.talend.mdm.webservice.WSGetItemPKsByCriteria wsGetItemPKsByCriteria) {
        this.wsGetItemPKsByCriteria = wsGetItemPKsByCriteria;
    }


    /**
     * Gets the useFTSearch value for this WSGetItemPKsByFullCriteria.
     * 
     * @return useFTSearch
     */
    public boolean isUseFTSearch() {
        return useFTSearch;
    }


    /**
     * Sets the useFTSearch value for this WSGetItemPKsByFullCriteria.
     * 
     * @param useFTSearch
     */
    public void setUseFTSearch(boolean useFTSearch) {
        this.useFTSearch = useFTSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetItemPKsByFullCriteria)) return false;
        WSGetItemPKsByFullCriteria other = (WSGetItemPKsByFullCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsGetItemPKsByCriteria==null && other.getWsGetItemPKsByCriteria()==null) || 
             (this.wsGetItemPKsByCriteria!=null &&
              this.wsGetItemPKsByCriteria.equals(other.getWsGetItemPKsByCriteria()))) &&
            this.useFTSearch == other.isUseFTSearch();
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
        if (getWsGetItemPKsByCriteria() != null) {
            _hashCode += getWsGetItemPKsByCriteria().hashCode();
        }
        _hashCode += (isUseFTSearch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetItemPKsByFullCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByFullCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsGetItemPKsByCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsGetItemPKsByCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByCriteria"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useFTSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useFTSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

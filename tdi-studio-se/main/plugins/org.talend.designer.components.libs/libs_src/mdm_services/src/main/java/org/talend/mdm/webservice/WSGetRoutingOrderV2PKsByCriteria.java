/**
 * WSGetRoutingOrderV2PKsByCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSGetRoutingOrderV2PKsByCriteria  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteria wsSearchCriteria;

    public WSGetRoutingOrderV2PKsByCriteria() {
    }

    public WSGetRoutingOrderV2PKsByCriteria(
           org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteria wsSearchCriteria) {
           this.wsSearchCriteria = wsSearchCriteria;
    }


    /**
     * Gets the wsSearchCriteria value for this WSGetRoutingOrderV2PKsByCriteria.
     * 
     * @return wsSearchCriteria
     */
    public org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteria getWsSearchCriteria() {
        return wsSearchCriteria;
    }


    /**
     * Sets the wsSearchCriteria value for this WSGetRoutingOrderV2PKsByCriteria.
     * 
     * @param wsSearchCriteria
     */
    public void setWsSearchCriteria(org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteria wsSearchCriteria) {
        this.wsSearchCriteria = wsSearchCriteria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetRoutingOrderV2PKsByCriteria)) return false;
        WSGetRoutingOrderV2PKsByCriteria other = (WSGetRoutingOrderV2PKsByCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSearchCriteria==null && other.getWsSearchCriteria()==null) || 
             (this.wsSearchCriteria!=null &&
              this.wsSearchCriteria.equals(other.getWsSearchCriteria())));
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
        if (getWsSearchCriteria() != null) {
            _hashCode += getWsSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetRoutingOrderV2PKsByCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2PKsByCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2SearchCriteria"));
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

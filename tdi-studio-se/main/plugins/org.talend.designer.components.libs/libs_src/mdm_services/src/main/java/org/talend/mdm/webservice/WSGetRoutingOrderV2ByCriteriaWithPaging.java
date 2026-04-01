/**
 * WSGetRoutingOrderV2ByCriteriaWithPaging.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSGetRoutingOrderV2ByCriteriaWithPaging  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteriaWithPaging wsSearchCriteriaWithPaging;

    public WSGetRoutingOrderV2ByCriteriaWithPaging() {
    }

    public WSGetRoutingOrderV2ByCriteriaWithPaging(
           org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteriaWithPaging wsSearchCriteriaWithPaging) {
           this.wsSearchCriteriaWithPaging = wsSearchCriteriaWithPaging;
    }


    /**
     * Gets the wsSearchCriteriaWithPaging value for this WSGetRoutingOrderV2ByCriteriaWithPaging.
     * 
     * @return wsSearchCriteriaWithPaging
     */
    public org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteriaWithPaging getWsSearchCriteriaWithPaging() {
        return wsSearchCriteriaWithPaging;
    }


    /**
     * Sets the wsSearchCriteriaWithPaging value for this WSGetRoutingOrderV2ByCriteriaWithPaging.
     * 
     * @param wsSearchCriteriaWithPaging
     */
    public void setWsSearchCriteriaWithPaging(org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteriaWithPaging wsSearchCriteriaWithPaging) {
        this.wsSearchCriteriaWithPaging = wsSearchCriteriaWithPaging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetRoutingOrderV2ByCriteriaWithPaging)) return false;
        WSGetRoutingOrderV2ByCriteriaWithPaging other = (WSGetRoutingOrderV2ByCriteriaWithPaging) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSearchCriteriaWithPaging==null && other.getWsSearchCriteriaWithPaging()==null) || 
             (this.wsSearchCriteriaWithPaging!=null &&
              this.wsSearchCriteriaWithPaging.equals(other.getWsSearchCriteriaWithPaging())));
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
        if (getWsSearchCriteriaWithPaging() != null) {
            _hashCode += getWsSearchCriteriaWithPaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetRoutingOrderV2ByCriteriaWithPaging.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2ByCriteriaWithPaging"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSearchCriteriaWithPaging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSearchCriteriaWithPaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2SearchCriteriaWithPaging"));
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

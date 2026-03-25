/**
 * WSExecuteRoutingOrderV2Synchronously.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSExecuteRoutingOrderV2Synchronously  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingOrderV2PK routingOrderV2PK;

    public WSExecuteRoutingOrderV2Synchronously() {
    }

    public WSExecuteRoutingOrderV2Synchronously(
           org.talend.mdm.webservice.WSRoutingOrderV2PK routingOrderV2PK) {
           this.routingOrderV2PK = routingOrderV2PK;
    }


    /**
     * Gets the routingOrderV2PK value for this WSExecuteRoutingOrderV2Synchronously.
     * 
     * @return routingOrderV2PK
     */
    public org.talend.mdm.webservice.WSRoutingOrderV2PK getRoutingOrderV2PK() {
        return routingOrderV2PK;
    }


    /**
     * Sets the routingOrderV2PK value for this WSExecuteRoutingOrderV2Synchronously.
     * 
     * @param routingOrderV2PK
     */
    public void setRoutingOrderV2PK(org.talend.mdm.webservice.WSRoutingOrderV2PK routingOrderV2PK) {
        this.routingOrderV2PK = routingOrderV2PK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExecuteRoutingOrderV2Synchronously)) return false;
        WSExecuteRoutingOrderV2Synchronously other = (WSExecuteRoutingOrderV2Synchronously) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routingOrderV2PK==null && other.getRoutingOrderV2PK()==null) || 
             (this.routingOrderV2PK!=null &&
              this.routingOrderV2PK.equals(other.getRoutingOrderV2PK())));
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
        if (getRoutingOrderV2PK() != null) {
            _hashCode += getRoutingOrderV2PK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExecuteRoutingOrderV2Synchronously.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Synchronously"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingOrderV2PK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingOrderV2PK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
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

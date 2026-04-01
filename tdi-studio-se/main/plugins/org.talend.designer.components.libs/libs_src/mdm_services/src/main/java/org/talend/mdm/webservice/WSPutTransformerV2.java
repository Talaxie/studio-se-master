/**
 * WSPutTransformerV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutTransformerV2  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSTransformerV2 wsTransformerV2;

    public WSPutTransformerV2() {
    }

    public WSPutTransformerV2(
           org.talend.mdm.webservice.WSTransformerV2 wsTransformerV2) {
           this.wsTransformerV2 = wsTransformerV2;
    }


    /**
     * Gets the wsTransformerV2 value for this WSPutTransformerV2.
     * 
     * @return wsTransformerV2
     */
    public org.talend.mdm.webservice.WSTransformerV2 getWsTransformerV2() {
        return wsTransformerV2;
    }


    /**
     * Sets the wsTransformerV2 value for this WSPutTransformerV2.
     * 
     * @param wsTransformerV2
     */
    public void setWsTransformerV2(org.talend.mdm.webservice.WSTransformerV2 wsTransformerV2) {
        this.wsTransformerV2 = wsTransformerV2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutTransformerV2)) return false;
        WSPutTransformerV2 other = (WSPutTransformerV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsTransformerV2==null && other.getWsTransformerV2()==null) || 
             (this.wsTransformerV2!=null &&
              this.wsTransformerV2.equals(other.getWsTransformerV2())));
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
        if (getWsTransformerV2() != null) {
            _hashCode += getWsTransformerV2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutTransformerV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformerV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformerV2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformerV2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2"));
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

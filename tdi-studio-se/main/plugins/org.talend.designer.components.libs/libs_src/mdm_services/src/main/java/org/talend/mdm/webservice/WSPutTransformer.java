/**
 * WSPutTransformer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutTransformer  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSTransformer wsTransformer;

    public WSPutTransformer() {
    }

    public WSPutTransformer(
           org.talend.mdm.webservice.WSTransformer wsTransformer) {
           this.wsTransformer = wsTransformer;
    }


    /**
     * Gets the wsTransformer value for this WSPutTransformer.
     * 
     * @return wsTransformer
     */
    public org.talend.mdm.webservice.WSTransformer getWsTransformer() {
        return wsTransformer;
    }


    /**
     * Sets the wsTransformer value for this WSPutTransformer.
     * 
     * @param wsTransformer
     */
    public void setWsTransformer(org.talend.mdm.webservice.WSTransformer wsTransformer) {
        this.wsTransformer = wsTransformer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutTransformer)) return false;
        WSPutTransformer other = (WSPutTransformer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsTransformer==null && other.getWsTransformer()==null) || 
             (this.wsTransformer!=null &&
              this.wsTransformer.equals(other.getWsTransformer())));
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
        if (getWsTransformer() != null) {
            _hashCode += getWsTransformer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutTransformer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformer"));
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

/**
 * WSPutUniverse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutUniverse  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSUniverse wsUniverse;

    public WSPutUniverse() {
    }

    public WSPutUniverse(
           org.talend.mdm.webservice.WSUniverse wsUniverse) {
           this.wsUniverse = wsUniverse;
    }


    /**
     * Gets the wsUniverse value for this WSPutUniverse.
     * 
     * @return wsUniverse
     */
    public org.talend.mdm.webservice.WSUniverse getWsUniverse() {
        return wsUniverse;
    }


    /**
     * Sets the wsUniverse value for this WSPutUniverse.
     * 
     * @param wsUniverse
     */
    public void setWsUniverse(org.talend.mdm.webservice.WSUniverse wsUniverse) {
        this.wsUniverse = wsUniverse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutUniverse)) return false;
        WSPutUniverse other = (WSPutUniverse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsUniverse==null && other.getWsUniverse()==null) || 
             (this.wsUniverse!=null &&
              this.wsUniverse.equals(other.getWsUniverse())));
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
        if (getWsUniverse() != null) {
            _hashCode += getWsUniverse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutUniverse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutUniverse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsUniverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsUniverse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
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

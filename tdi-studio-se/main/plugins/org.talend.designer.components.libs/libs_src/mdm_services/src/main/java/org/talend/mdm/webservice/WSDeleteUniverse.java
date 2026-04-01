/**
 * WSDeleteUniverse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSDeleteUniverse  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSUniversePK wsUniversePK;

    public WSDeleteUniverse() {
    }

    public WSDeleteUniverse(
           org.talend.mdm.webservice.WSUniversePK wsUniversePK) {
           this.wsUniversePK = wsUniversePK;
    }


    /**
     * Gets the wsUniversePK value for this WSDeleteUniverse.
     * 
     * @return wsUniversePK
     */
    public org.talend.mdm.webservice.WSUniversePK getWsUniversePK() {
        return wsUniversePK;
    }


    /**
     * Sets the wsUniversePK value for this WSDeleteUniverse.
     * 
     * @param wsUniversePK
     */
    public void setWsUniversePK(org.talend.mdm.webservice.WSUniversePK wsUniversePK) {
        this.wsUniversePK = wsUniversePK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDeleteUniverse)) return false;
        WSDeleteUniverse other = (WSDeleteUniverse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsUniversePK==null && other.getWsUniversePK()==null) || 
             (this.wsUniversePK!=null &&
              this.wsUniversePK.equals(other.getWsUniversePK())));
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
        if (getWsUniversePK() != null) {
            _hashCode += getWsUniversePK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDeleteUniverse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteUniverse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsUniversePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsUniversePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
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

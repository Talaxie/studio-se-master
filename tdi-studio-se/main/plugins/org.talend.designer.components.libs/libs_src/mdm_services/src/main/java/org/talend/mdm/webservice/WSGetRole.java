/**
 * WSGetRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSGetRole  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRolePK wsRolePK;

    public WSGetRole() {
    }

    public WSGetRole(
           org.talend.mdm.webservice.WSRolePK wsRolePK) {
           this.wsRolePK = wsRolePK;
    }


    /**
     * Gets the wsRolePK value for this WSGetRole.
     * 
     * @return wsRolePK
     */
    public org.talend.mdm.webservice.WSRolePK getWsRolePK() {
        return wsRolePK;
    }


    /**
     * Sets the wsRolePK value for this WSGetRole.
     * 
     * @param wsRolePK
     */
    public void setWsRolePK(org.talend.mdm.webservice.WSRolePK wsRolePK) {
        this.wsRolePK = wsRolePK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetRole)) return false;
        WSGetRole other = (WSGetRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsRolePK==null && other.getWsRolePK()==null) || 
             (this.wsRolePK!=null &&
              this.wsRolePK.equals(other.getWsRolePK())));
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
        if (getWsRolePK() != null) {
            _hashCode += getWsRolePK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsRolePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsRolePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK"));
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

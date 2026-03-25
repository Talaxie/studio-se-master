/**
 * WSDeleteMenu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSDeleteMenu  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSMenuPK wsMenuPK;

    public WSDeleteMenu() {
    }

    public WSDeleteMenu(
           org.talend.mdm.webservice.WSMenuPK wsMenuPK) {
           this.wsMenuPK = wsMenuPK;
    }


    /**
     * Gets the wsMenuPK value for this WSDeleteMenu.
     * 
     * @return wsMenuPK
     */
    public org.talend.mdm.webservice.WSMenuPK getWsMenuPK() {
        return wsMenuPK;
    }


    /**
     * Sets the wsMenuPK value for this WSDeleteMenu.
     * 
     * @param wsMenuPK
     */
    public void setWsMenuPK(org.talend.mdm.webservice.WSMenuPK wsMenuPK) {
        this.wsMenuPK = wsMenuPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDeleteMenu)) return false;
        WSDeleteMenu other = (WSDeleteMenu) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsMenuPK==null && other.getWsMenuPK()==null) || 
             (this.wsMenuPK!=null &&
              this.wsMenuPK.equals(other.getWsMenuPK())));
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
        if (getWsMenuPK() != null) {
            _hashCode += getWsMenuPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDeleteMenu.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMenu"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsMenuPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsMenuPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK"));
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

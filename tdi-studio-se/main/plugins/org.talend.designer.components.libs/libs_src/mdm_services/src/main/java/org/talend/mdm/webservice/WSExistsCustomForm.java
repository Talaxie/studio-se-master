/**
 * WSExistsCustomForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSExistsCustomForm  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSCustomFormPK wsCustomFormPK;

    public WSExistsCustomForm() {
    }

    public WSExistsCustomForm(
           org.talend.mdm.webservice.WSCustomFormPK wsCustomFormPK) {
           this.wsCustomFormPK = wsCustomFormPK;
    }


    /**
     * Gets the wsCustomFormPK value for this WSExistsCustomForm.
     * 
     * @return wsCustomFormPK
     */
    public org.talend.mdm.webservice.WSCustomFormPK getWsCustomFormPK() {
        return wsCustomFormPK;
    }


    /**
     * Sets the wsCustomFormPK value for this WSExistsCustomForm.
     * 
     * @param wsCustomFormPK
     */
    public void setWsCustomFormPK(org.talend.mdm.webservice.WSCustomFormPK wsCustomFormPK) {
        this.wsCustomFormPK = wsCustomFormPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExistsCustomForm)) return false;
        WSExistsCustomForm other = (WSExistsCustomForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsCustomFormPK==null && other.getWsCustomFormPK()==null) || 
             (this.wsCustomFormPK!=null &&
              this.wsCustomFormPK.equals(other.getWsCustomFormPK())));
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
        if (getWsCustomFormPK() != null) {
            _hashCode += getWsCustomFormPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExistsCustomForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsCustomForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsCustomFormPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsCustomFormPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK"));
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

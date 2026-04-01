/**
 * WSPutCustomForm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutCustomForm  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSCustomForm wsCustomForm;

    public WSPutCustomForm() {
    }

    public WSPutCustomForm(
           org.talend.mdm.webservice.WSCustomForm wsCustomForm) {
           this.wsCustomForm = wsCustomForm;
    }


    /**
     * Gets the wsCustomForm value for this WSPutCustomForm.
     * 
     * @return wsCustomForm
     */
    public org.talend.mdm.webservice.WSCustomForm getWsCustomForm() {
        return wsCustomForm;
    }


    /**
     * Sets the wsCustomForm value for this WSPutCustomForm.
     * 
     * @param wsCustomForm
     */
    public void setWsCustomForm(org.talend.mdm.webservice.WSCustomForm wsCustomForm) {
        this.wsCustomForm = wsCustomForm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutCustomForm)) return false;
        WSPutCustomForm other = (WSPutCustomForm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsCustomForm==null && other.getWsCustomForm()==null) || 
             (this.wsCustomForm!=null &&
              this.wsCustomForm.equals(other.getWsCustomForm())));
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
        if (getWsCustomForm() != null) {
            _hashCode += getWsCustomForm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutCustomForm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutCustomForm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsCustomForm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsCustomForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomForm"));
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

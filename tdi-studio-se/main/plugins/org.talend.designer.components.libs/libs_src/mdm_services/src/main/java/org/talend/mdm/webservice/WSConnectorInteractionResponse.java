/**
 * WSConnectorInteractionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSConnectorInteractionResponse  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSConnectorResponseCode code;

    private org.talend.mdm.webservice.WSBase64KeyValue[] parameters;

    public WSConnectorInteractionResponse() {
    }

    public WSConnectorInteractionResponse(
           org.talend.mdm.webservice.WSConnectorResponseCode code,
           org.talend.mdm.webservice.WSBase64KeyValue[] parameters) {
           this.code = code;
           this.parameters = parameters;
    }


    /**
     * Gets the code value for this WSConnectorInteractionResponse.
     * 
     * @return code
     */
    public org.talend.mdm.webservice.WSConnectorResponseCode getCode() {
        return code;
    }


    /**
     * Sets the code value for this WSConnectorInteractionResponse.
     * 
     * @param code
     */
    public void setCode(org.talend.mdm.webservice.WSConnectorResponseCode code) {
        this.code = code;
    }


    /**
     * Gets the parameters value for this WSConnectorInteractionResponse.
     * 
     * @return parameters
     */
    public org.talend.mdm.webservice.WSBase64KeyValue[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSConnectorInteractionResponse.
     * 
     * @param parameters
     */
    public void setParameters(org.talend.mdm.webservice.WSBase64KeyValue[] parameters) {
        this.parameters = parameters;
    }

    public org.talend.mdm.webservice.WSBase64KeyValue getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, org.talend.mdm.webservice.WSBase64KeyValue _value) {
        this.parameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSConnectorInteractionResponse)) return false;
        WSConnectorInteractionResponse other = (WSConnectorInteractionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSConnectorInteractionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteractionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorResponseCode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBase64KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

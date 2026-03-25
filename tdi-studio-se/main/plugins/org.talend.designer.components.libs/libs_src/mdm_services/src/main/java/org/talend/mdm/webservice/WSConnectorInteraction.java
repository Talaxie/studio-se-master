/**
 * WSConnectorInteraction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSConnectorInteraction  implements java.io.Serializable {
    private java.lang.String JNDIName;

    private org.talend.mdm.webservice.WSConnectorFunction function;

    private org.talend.mdm.webservice.WSBase64KeyValue[] parameters;

    public WSConnectorInteraction() {
    }

    public WSConnectorInteraction(
           java.lang.String JNDIName,
           org.talend.mdm.webservice.WSConnectorFunction function,
           org.talend.mdm.webservice.WSBase64KeyValue[] parameters) {
           this.JNDIName = JNDIName;
           this.function = function;
           this.parameters = parameters;
    }


    /**
     * Gets the JNDIName value for this WSConnectorInteraction.
     * 
     * @return JNDIName
     */
    public java.lang.String getJNDIName() {
        return JNDIName;
    }


    /**
     * Sets the JNDIName value for this WSConnectorInteraction.
     * 
     * @param JNDIName
     */
    public void setJNDIName(java.lang.String JNDIName) {
        this.JNDIName = JNDIName;
    }


    /**
     * Gets the function value for this WSConnectorInteraction.
     * 
     * @return function
     */
    public org.talend.mdm.webservice.WSConnectorFunction getFunction() {
        return function;
    }


    /**
     * Sets the function value for this WSConnectorInteraction.
     * 
     * @param function
     */
    public void setFunction(org.talend.mdm.webservice.WSConnectorFunction function) {
        this.function = function;
    }


    /**
     * Gets the parameters value for this WSConnectorInteraction.
     * 
     * @return parameters
     */
    public org.talend.mdm.webservice.WSBase64KeyValue[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSConnectorInteraction.
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
        if (!(obj instanceof WSConnectorInteraction)) return false;
        WSConnectorInteraction other = (WSConnectorInteraction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.JNDIName==null && other.getJNDIName()==null) || 
             (this.JNDIName!=null &&
              this.JNDIName.equals(other.getJNDIName()))) &&
            ((this.function==null && other.getFunction()==null) || 
             (this.function!=null &&
              this.function.equals(other.getFunction()))) &&
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
        if (getJNDIName() != null) {
            _hashCode += getJNDIName().hashCode();
        }
        if (getFunction() != null) {
            _hashCode += getFunction().hashCode();
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
        new org.apache.axis.description.TypeDesc(WSConnectorInteraction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteraction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JNDIName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JNDIName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "function"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorFunction"));
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

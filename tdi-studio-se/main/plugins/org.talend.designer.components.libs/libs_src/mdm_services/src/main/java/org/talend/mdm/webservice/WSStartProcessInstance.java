/**
 * WSStartProcessInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSStartProcessInstance  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID processUUID;

    private org.talend.mdm.webservice.WSHashMapEntry[] variable;

    public WSStartProcessInstance() {
    }

    public WSStartProcessInstance(
           org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID processUUID,
           org.talend.mdm.webservice.WSHashMapEntry[] variable) {
           this.processUUID = processUUID;
           this.variable = variable;
    }


    /**
     * Gets the processUUID value for this WSStartProcessInstance.
     * 
     * @return processUUID
     */
    public org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID getProcessUUID() {
        return processUUID;
    }


    /**
     * Sets the processUUID value for this WSStartProcessInstance.
     * 
     * @param processUUID
     */
    public void setProcessUUID(org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID processUUID) {
        this.processUUID = processUUID;
    }


    /**
     * Gets the variable value for this WSStartProcessInstance.
     * 
     * @return variable
     */
    public org.talend.mdm.webservice.WSHashMapEntry[] getVariable() {
        return variable;
    }


    /**
     * Sets the variable value for this WSStartProcessInstance.
     * 
     * @param variable
     */
    public void setVariable(org.talend.mdm.webservice.WSHashMapEntry[] variable) {
        this.variable = variable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSStartProcessInstance)) return false;
        WSStartProcessInstance other = (WSStartProcessInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processUUID==null && other.getProcessUUID()==null) || 
             (this.processUUID!=null &&
              this.processUUID.equals(other.getProcessUUID()))) &&
            ((this.variable==null && other.getVariable()==null) || 
             (this.variable!=null &&
              java.util.Arrays.equals(this.variable, other.getVariable())));
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
        if (getProcessUUID() != null) {
            _hashCode += getProcessUUID().hashCode();
        }
        if (getVariable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariable(), i);
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
        new org.apache.axis.description.TypeDesc(WSStartProcessInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStartProcessInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSHashMap>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
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

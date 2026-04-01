/**
 * WSAssignTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSAssignTask  implements java.io.Serializable {
    private java.lang.String taskUUID;

    private java.lang.String[] candicates;

    public WSAssignTask() {
    }

    public WSAssignTask(
           java.lang.String taskUUID,
           java.lang.String[] candicates) {
           this.taskUUID = taskUUID;
           this.candicates = candicates;
    }


    /**
     * Gets the taskUUID value for this WSAssignTask.
     * 
     * @return taskUUID
     */
    public java.lang.String getTaskUUID() {
        return taskUUID;
    }


    /**
     * Sets the taskUUID value for this WSAssignTask.
     * 
     * @param taskUUID
     */
    public void setTaskUUID(java.lang.String taskUUID) {
        this.taskUUID = taskUUID;
    }


    /**
     * Gets the candicates value for this WSAssignTask.
     * 
     * @return candicates
     */
    public java.lang.String[] getCandicates() {
        return candicates;
    }


    /**
     * Sets the candicates value for this WSAssignTask.
     * 
     * @param candicates
     */
    public void setCandicates(java.lang.String[] candicates) {
        this.candicates = candicates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAssignTask)) return false;
        WSAssignTask other = (WSAssignTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskUUID==null && other.getTaskUUID()==null) || 
             (this.taskUUID!=null &&
              this.taskUUID.equals(other.getTaskUUID()))) &&
            ((this.candicates==null && other.getCandicates()==null) || 
             (this.candicates!=null &&
              java.util.Arrays.equals(this.candicates, other.getCandicates())));
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
        if (getTaskUUID() != null) {
            _hashCode += getTaskUUID().hashCode();
        }
        if (getCandicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCandicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCandicates(), i);
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
        new org.apache.axis.description.TypeDesc(WSAssignTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAssignTask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candicates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "candicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "strings"));
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

/**
 * WSSuspendTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSuspendTask  implements java.io.Serializable {
    private java.lang.String taskUUID;

    private boolean assignTask;

    public WSSuspendTask() {
    }

    public WSSuspendTask(
           java.lang.String taskUUID,
           boolean assignTask) {
           this.taskUUID = taskUUID;
           this.assignTask = assignTask;
    }


    /**
     * Gets the taskUUID value for this WSSuspendTask.
     * 
     * @return taskUUID
     */
    public java.lang.String getTaskUUID() {
        return taskUUID;
    }


    /**
     * Sets the taskUUID value for this WSSuspendTask.
     * 
     * @param taskUUID
     */
    public void setTaskUUID(java.lang.String taskUUID) {
        this.taskUUID = taskUUID;
    }


    /**
     * Gets the assignTask value for this WSSuspendTask.
     * 
     * @return assignTask
     */
    public boolean isAssignTask() {
        return assignTask;
    }


    /**
     * Sets the assignTask value for this WSSuspendTask.
     * 
     * @param assignTask
     */
    public void setAssignTask(boolean assignTask) {
        this.assignTask = assignTask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSuspendTask)) return false;
        WSSuspendTask other = (WSSuspendTask) obj;
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
            this.assignTask == other.isAssignTask();
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
        _hashCode += (isAssignTask() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSSuspendTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSuspendTask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskUUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskUUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignTask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

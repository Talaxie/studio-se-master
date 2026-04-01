/**
 * WSWorkflowProcessDefinitionUUID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * A process definition UUID
 */
public class WSWorkflowProcessDefinitionUUID  implements java.io.Serializable {
    private java.lang.String processName;

    private java.lang.String processVersion;

    public WSWorkflowProcessDefinitionUUID() {
    }

    public WSWorkflowProcessDefinitionUUID(
           java.lang.String processName,
           java.lang.String processVersion) {
           this.processName = processName;
           this.processVersion = processVersion;
    }


    /**
     * Gets the processName value for this WSWorkflowProcessDefinitionUUID.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this WSWorkflowProcessDefinitionUUID.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the processVersion value for this WSWorkflowProcessDefinitionUUID.
     * 
     * @return processVersion
     */
    public java.lang.String getProcessVersion() {
        return processVersion;
    }


    /**
     * Sets the processVersion value for this WSWorkflowProcessDefinitionUUID.
     * 
     * @param processVersion
     */
    public void setProcessVersion(java.lang.String processVersion) {
        this.processVersion = processVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWorkflowProcessDefinitionUUID)) return false;
        WSWorkflowProcessDefinitionUUID other = (WSWorkflowProcessDefinitionUUID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.processVersion==null && other.getProcessVersion()==null) || 
             (this.processVersion!=null &&
              this.processVersion.equals(other.getProcessVersion())));
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
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getProcessVersion() != null) {
            _hashCode += getProcessVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWorkflowProcessDefinitionUUID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

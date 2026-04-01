/**
 * WSTransformerVariablesMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerVariablesMapping  implements java.io.Serializable {
    private java.lang.String pipelineVariable;

    private java.lang.String pluginVariable;

    private org.talend.mdm.webservice.WSTypedContent hardCoding;

    public WSTransformerVariablesMapping() {
    }

    public WSTransformerVariablesMapping(
           java.lang.String pipelineVariable,
           java.lang.String pluginVariable,
           org.talend.mdm.webservice.WSTypedContent hardCoding) {
           this.pipelineVariable = pipelineVariable;
           this.pluginVariable = pluginVariable;
           this.hardCoding = hardCoding;
    }


    /**
     * Gets the pipelineVariable value for this WSTransformerVariablesMapping.
     * 
     * @return pipelineVariable
     */
    public java.lang.String getPipelineVariable() {
        return pipelineVariable;
    }


    /**
     * Sets the pipelineVariable value for this WSTransformerVariablesMapping.
     * 
     * @param pipelineVariable
     */
    public void setPipelineVariable(java.lang.String pipelineVariable) {
        this.pipelineVariable = pipelineVariable;
    }


    /**
     * Gets the pluginVariable value for this WSTransformerVariablesMapping.
     * 
     * @return pluginVariable
     */
    public java.lang.String getPluginVariable() {
        return pluginVariable;
    }


    /**
     * Sets the pluginVariable value for this WSTransformerVariablesMapping.
     * 
     * @param pluginVariable
     */
    public void setPluginVariable(java.lang.String pluginVariable) {
        this.pluginVariable = pluginVariable;
    }


    /**
     * Gets the hardCoding value for this WSTransformerVariablesMapping.
     * 
     * @return hardCoding
     */
    public org.talend.mdm.webservice.WSTypedContent getHardCoding() {
        return hardCoding;
    }


    /**
     * Sets the hardCoding value for this WSTransformerVariablesMapping.
     * 
     * @param hardCoding
     */
    public void setHardCoding(org.talend.mdm.webservice.WSTypedContent hardCoding) {
        this.hardCoding = hardCoding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerVariablesMapping)) return false;
        WSTransformerVariablesMapping other = (WSTransformerVariablesMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pipelineVariable==null && other.getPipelineVariable()==null) || 
             (this.pipelineVariable!=null &&
              this.pipelineVariable.equals(other.getPipelineVariable()))) &&
            ((this.pluginVariable==null && other.getPluginVariable()==null) || 
             (this.pluginVariable!=null &&
              this.pluginVariable.equals(other.getPluginVariable()))) &&
            ((this.hardCoding==null && other.getHardCoding()==null) || 
             (this.hardCoding!=null &&
              this.hardCoding.equals(other.getHardCoding())));
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
        if (getPipelineVariable() != null) {
            _hashCode += getPipelineVariable().hashCode();
        }
        if (getPluginVariable() != null) {
            _hashCode += getPluginVariable().hashCode();
        }
        if (getHardCoding() != null) {
            _hashCode += getHardCoding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerVariablesMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerVariablesMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipelineVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pipelineVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pluginVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardCoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardCoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTypedContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

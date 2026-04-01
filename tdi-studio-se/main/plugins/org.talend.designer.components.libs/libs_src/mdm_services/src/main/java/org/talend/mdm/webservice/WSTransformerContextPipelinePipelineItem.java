/**
 * WSTransformerContextPipelinePipelineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerContextPipelinePipelineItem  implements java.io.Serializable {
    private java.lang.String variable;

    private org.talend.mdm.webservice.WSTypedContent wsTypedContent;

    public WSTransformerContextPipelinePipelineItem() {
    }

    public WSTransformerContextPipelinePipelineItem(
           java.lang.String variable,
           org.talend.mdm.webservice.WSTypedContent wsTypedContent) {
           this.variable = variable;
           this.wsTypedContent = wsTypedContent;
    }


    /**
     * Gets the variable value for this WSTransformerContextPipelinePipelineItem.
     * 
     * @return variable
     */
    public java.lang.String getVariable() {
        return variable;
    }


    /**
     * Sets the variable value for this WSTransformerContextPipelinePipelineItem.
     * 
     * @param variable
     */
    public void setVariable(java.lang.String variable) {
        this.variable = variable;
    }


    /**
     * Gets the wsTypedContent value for this WSTransformerContextPipelinePipelineItem.
     * 
     * @return wsTypedContent
     */
    public org.talend.mdm.webservice.WSTypedContent getWsTypedContent() {
        return wsTypedContent;
    }


    /**
     * Sets the wsTypedContent value for this WSTransformerContextPipelinePipelineItem.
     * 
     * @param wsTypedContent
     */
    public void setWsTypedContent(org.talend.mdm.webservice.WSTypedContent wsTypedContent) {
        this.wsTypedContent = wsTypedContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerContextPipelinePipelineItem)) return false;
        WSTransformerContextPipelinePipelineItem other = (WSTransformerContextPipelinePipelineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variable==null && other.getVariable()==null) || 
             (this.variable!=null &&
              this.variable.equals(other.getVariable()))) &&
            ((this.wsTypedContent==null && other.getWsTypedContent()==null) || 
             (this.wsTypedContent!=null &&
              this.wsTypedContent.equals(other.getWsTypedContent())));
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
        if (getVariable() != null) {
            _hashCode += getVariable().hashCode();
        }
        if (getWsTypedContent() != null) {
            _hashCode += getWsTypedContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerContextPipelinePipelineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSTransformerContext>pipeline>pipelineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTypedContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTypedContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTypedContent"));
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

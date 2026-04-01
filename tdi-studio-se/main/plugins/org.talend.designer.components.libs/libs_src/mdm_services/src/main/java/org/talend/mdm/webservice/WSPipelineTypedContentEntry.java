/**
 * WSPipelineTypedContentEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPipelineTypedContentEntry  implements java.io.Serializable {
    private java.lang.String output;

    private org.talend.mdm.webservice.WSExtractedContent wsExtractedContent;

    public WSPipelineTypedContentEntry() {
    }

    public WSPipelineTypedContentEntry(
           java.lang.String output,
           org.talend.mdm.webservice.WSExtractedContent wsExtractedContent) {
           this.output = output;
           this.wsExtractedContent = wsExtractedContent;
    }


    /**
     * Gets the output value for this WSPipelineTypedContentEntry.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this WSPipelineTypedContentEntry.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the wsExtractedContent value for this WSPipelineTypedContentEntry.
     * 
     * @return wsExtractedContent
     */
    public org.talend.mdm.webservice.WSExtractedContent getWsExtractedContent() {
        return wsExtractedContent;
    }


    /**
     * Sets the wsExtractedContent value for this WSPipelineTypedContentEntry.
     * 
     * @param wsExtractedContent
     */
    public void setWsExtractedContent(org.talend.mdm.webservice.WSExtractedContent wsExtractedContent) {
        this.wsExtractedContent = wsExtractedContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPipelineTypedContentEntry)) return false;
        WSPipelineTypedContentEntry other = (WSPipelineTypedContentEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.wsExtractedContent==null && other.getWsExtractedContent()==null) || 
             (this.wsExtractedContent!=null &&
              this.wsExtractedContent.equals(other.getWsExtractedContent())));
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
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getWsExtractedContent() != null) {
            _hashCode += getWsExtractedContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPipelineTypedContentEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSPipeline>typedContentEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsExtractedContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsExtractedContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractedContent"));
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

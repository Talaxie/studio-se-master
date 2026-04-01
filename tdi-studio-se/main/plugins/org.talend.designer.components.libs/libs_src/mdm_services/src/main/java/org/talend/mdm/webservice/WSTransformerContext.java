/**
 * WSTransformerContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerContext  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSTransformerV2PK wsTransformerPK;

    private org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem[] pipeline;

    private org.talend.mdm.webservice.WSItemPK[] projectedItemPKs;

    public WSTransformerContext() {
    }

    public WSTransformerContext(
           org.talend.mdm.webservice.WSTransformerV2PK wsTransformerPK,
           org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem[] pipeline,
           org.talend.mdm.webservice.WSItemPK[] projectedItemPKs) {
           this.wsTransformerPK = wsTransformerPK;
           this.pipeline = pipeline;
           this.projectedItemPKs = projectedItemPKs;
    }


    /**
     * Gets the wsTransformerPK value for this WSTransformerContext.
     * 
     * @return wsTransformerPK
     */
    public org.talend.mdm.webservice.WSTransformerV2PK getWsTransformerPK() {
        return wsTransformerPK;
    }


    /**
     * Sets the wsTransformerPK value for this WSTransformerContext.
     * 
     * @param wsTransformerPK
     */
    public void setWsTransformerPK(org.talend.mdm.webservice.WSTransformerV2PK wsTransformerPK) {
        this.wsTransformerPK = wsTransformerPK;
    }


    /**
     * Gets the pipeline value for this WSTransformerContext.
     * 
     * @return pipeline
     */
    public org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem[] getPipeline() {
        return pipeline;
    }


    /**
     * Sets the pipeline value for this WSTransformerContext.
     * 
     * @param pipeline
     */
    public void setPipeline(org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem[] pipeline) {
        this.pipeline = pipeline;
    }


    /**
     * Gets the projectedItemPKs value for this WSTransformerContext.
     * 
     * @return projectedItemPKs
     */
    public org.talend.mdm.webservice.WSItemPK[] getProjectedItemPKs() {
        return projectedItemPKs;
    }


    /**
     * Sets the projectedItemPKs value for this WSTransformerContext.
     * 
     * @param projectedItemPKs
     */
    public void setProjectedItemPKs(org.talend.mdm.webservice.WSItemPK[] projectedItemPKs) {
        this.projectedItemPKs = projectedItemPKs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerContext)) return false;
        WSTransformerContext other = (WSTransformerContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsTransformerPK==null && other.getWsTransformerPK()==null) || 
             (this.wsTransformerPK!=null &&
              this.wsTransformerPK.equals(other.getWsTransformerPK()))) &&
            ((this.pipeline==null && other.getPipeline()==null) || 
             (this.pipeline!=null &&
              java.util.Arrays.equals(this.pipeline, other.getPipeline()))) &&
            ((this.projectedItemPKs==null && other.getProjectedItemPKs()==null) || 
             (this.projectedItemPKs!=null &&
              java.util.Arrays.equals(this.projectedItemPKs, other.getProjectedItemPKs())));
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
        if (getWsTransformerPK() != null) {
            _hashCode += getWsTransformerPK().hashCode();
        }
        if (getPipeline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPipeline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPipeline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedItemPKs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedItemPKs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedItemPKs(), i);
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
        new org.apache.axis.description.TypeDesc(WSTransformerContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformerPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformerPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSTransformerContext>pipeline>pipelineItem"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "pipelineItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedItemPKs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectedItemPKs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "wsItemPOJOPK"));
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

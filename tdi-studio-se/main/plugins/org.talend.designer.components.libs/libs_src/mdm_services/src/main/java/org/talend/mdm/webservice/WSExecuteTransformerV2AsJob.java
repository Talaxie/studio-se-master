/**
 * WSExecuteTransformerV2AsJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Starts the execution of a transformer as a background job and return
 * the PK of a Background Job
 * 				The result must be obtained by reading the content of the BackgroundJob
 */
public class WSExecuteTransformerV2AsJob  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSTransformerContext wsTransformerContext;

    public WSExecuteTransformerV2AsJob() {
    }

    public WSExecuteTransformerV2AsJob(
           org.talend.mdm.webservice.WSTransformerContext wsTransformerContext) {
           this.wsTransformerContext = wsTransformerContext;
    }


    /**
     * Gets the wsTransformerContext value for this WSExecuteTransformerV2AsJob.
     * 
     * @return wsTransformerContext
     */
    public org.talend.mdm.webservice.WSTransformerContext getWsTransformerContext() {
        return wsTransformerContext;
    }


    /**
     * Sets the wsTransformerContext value for this WSExecuteTransformerV2AsJob.
     * 
     * @param wsTransformerContext
     */
    public void setWsTransformerContext(org.talend.mdm.webservice.WSTransformerContext wsTransformerContext) {
        this.wsTransformerContext = wsTransformerContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExecuteTransformerV2AsJob)) return false;
        WSExecuteTransformerV2AsJob other = (WSExecuteTransformerV2AsJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsTransformerContext==null && other.getWsTransformerContext()==null) || 
             (this.wsTransformerContext!=null &&
              this.wsTransformerContext.equals(other.getWsTransformerContext())));
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
        if (getWsTransformerContext() != null) {
            _hashCode += getWsTransformerContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExecuteTransformerV2AsJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2AsJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformerContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformerContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
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

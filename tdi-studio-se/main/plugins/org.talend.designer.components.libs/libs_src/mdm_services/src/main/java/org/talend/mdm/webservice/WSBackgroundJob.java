/**
 * WSBackgroundJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Background Jobs are created and updated by asynchronous methods
 * ending up with ...AsJob
 * 				Use getBackgroundJob to read the progress of the job and read
 * the status.
 */
public class WSBackgroundJob  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String description;

    private org.talend.mdm.webservice.BackgroundJobStatusType status;

    private java.lang.String message;

    private java.lang.Integer percentage;

    private java.lang.String timestamp;

    private org.talend.mdm.webservice.WSPipelineTypedContentEntry[] pipeline;

    private byte[] serializedObject;

    public WSBackgroundJob() {
    }

    public WSBackgroundJob(
           java.lang.String id,
           java.lang.String description,
           org.talend.mdm.webservice.BackgroundJobStatusType status,
           java.lang.String message,
           java.lang.Integer percentage,
           java.lang.String timestamp,
           org.talend.mdm.webservice.WSPipelineTypedContentEntry[] pipeline,
           byte[] serializedObject) {
           this.id = id;
           this.description = description;
           this.status = status;
           this.message = message;
           this.percentage = percentage;
           this.timestamp = timestamp;
           this.pipeline = pipeline;
           this.serializedObject = serializedObject;
    }


    /**
     * Gets the id value for this WSBackgroundJob.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WSBackgroundJob.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the description value for this WSBackgroundJob.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSBackgroundJob.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this WSBackgroundJob.
     * 
     * @return status
     */
    public org.talend.mdm.webservice.BackgroundJobStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSBackgroundJob.
     * 
     * @param status
     */
    public void setStatus(org.talend.mdm.webservice.BackgroundJobStatusType status) {
        this.status = status;
    }


    /**
     * Gets the message value for this WSBackgroundJob.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this WSBackgroundJob.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the percentage value for this WSBackgroundJob.
     * 
     * @return percentage
     */
    public java.lang.Integer getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this WSBackgroundJob.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.Integer percentage) {
        this.percentage = percentage;
    }


    /**
     * Gets the timestamp value for this WSBackgroundJob.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this WSBackgroundJob.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the pipeline value for this WSBackgroundJob.
     * 
     * @return pipeline
     */
    public org.talend.mdm.webservice.WSPipelineTypedContentEntry[] getPipeline() {
        return pipeline;
    }


    /**
     * Sets the pipeline value for this WSBackgroundJob.
     * 
     * @param pipeline
     */
    public void setPipeline(org.talend.mdm.webservice.WSPipelineTypedContentEntry[] pipeline) {
        this.pipeline = pipeline;
    }


    /**
     * Gets the serializedObject value for this WSBackgroundJob.
     * 
     * @return serializedObject
     */
    public byte[] getSerializedObject() {
        return serializedObject;
    }


    /**
     * Sets the serializedObject value for this WSBackgroundJob.
     * 
     * @param serializedObject
     */
    public void setSerializedObject(byte[] serializedObject) {
        this.serializedObject = serializedObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSBackgroundJob)) return false;
        WSBackgroundJob other = (WSBackgroundJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.pipeline==null && other.getPipeline()==null) || 
             (this.pipeline!=null &&
              java.util.Arrays.equals(this.pipeline, other.getPipeline()))) &&
            ((this.serializedObject==null && other.getSerializedObject()==null) || 
             (this.serializedObject!=null &&
              java.util.Arrays.equals(this.serializedObject, other.getSerializedObject())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
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
        if (getSerializedObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerializedObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerializedObject(), i);
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
        new org.apache.axis.description.TypeDesc(WSBackgroundJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "BackgroundJobStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSPipeline>typedContentEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serializedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serializedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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

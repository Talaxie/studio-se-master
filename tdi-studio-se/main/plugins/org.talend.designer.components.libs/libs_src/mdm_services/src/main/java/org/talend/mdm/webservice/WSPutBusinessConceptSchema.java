/**
 * WSPutBusinessConceptSchema.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutBusinessConceptSchema  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataModelPK wsDataModelPK;

    private java.lang.String businessConceptSchema;

    public WSPutBusinessConceptSchema() {
    }

    public WSPutBusinessConceptSchema(
           org.talend.mdm.webservice.WSDataModelPK wsDataModelPK,
           java.lang.String businessConceptSchema) {
           this.wsDataModelPK = wsDataModelPK;
           this.businessConceptSchema = businessConceptSchema;
    }


    /**
     * Gets the wsDataModelPK value for this WSPutBusinessConceptSchema.
     * 
     * @return wsDataModelPK
     */
    public org.talend.mdm.webservice.WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }


    /**
     * Sets the wsDataModelPK value for this WSPutBusinessConceptSchema.
     * 
     * @param wsDataModelPK
     */
    public void setWsDataModelPK(org.talend.mdm.webservice.WSDataModelPK wsDataModelPK) {
        this.wsDataModelPK = wsDataModelPK;
    }


    /**
     * Gets the businessConceptSchema value for this WSPutBusinessConceptSchema.
     * 
     * @return businessConceptSchema
     */
    public java.lang.String getBusinessConceptSchema() {
        return businessConceptSchema;
    }


    /**
     * Sets the businessConceptSchema value for this WSPutBusinessConceptSchema.
     * 
     * @param businessConceptSchema
     */
    public void setBusinessConceptSchema(java.lang.String businessConceptSchema) {
        this.businessConceptSchema = businessConceptSchema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutBusinessConceptSchema)) return false;
        WSPutBusinessConceptSchema other = (WSPutBusinessConceptSchema) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataModelPK==null && other.getWsDataModelPK()==null) || 
             (this.wsDataModelPK!=null &&
              this.wsDataModelPK.equals(other.getWsDataModelPK()))) &&
            ((this.businessConceptSchema==null && other.getBusinessConceptSchema()==null) || 
             (this.businessConceptSchema!=null &&
              this.businessConceptSchema.equals(other.getBusinessConceptSchema())));
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
        if (getWsDataModelPK() != null) {
            _hashCode += getWsDataModelPK().hashCode();
        }
        if (getBusinessConceptSchema() != null) {
            _hashCode += getBusinessConceptSchema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutBusinessConceptSchema.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConceptSchema"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataModelPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataModelPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessConceptSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessConceptSchema"));
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

/**
 * WSProcessBytesUsingTransformer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Process Bytes after transformation in a Transformer
 * 				and using a DecisionTable for the ouput variables
 */
public class WSProcessBytesUsingTransformer  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSByteArray wsBytes;

    private java.lang.String contentType;

    private org.talend.mdm.webservice.WSTransformerPK wsTransformerPK;

    private org.talend.mdm.webservice.WSOutputDecisionTableDecisions[] wsOutputDecisionTable;

    public WSProcessBytesUsingTransformer() {
    }

    public WSProcessBytesUsingTransformer(
           org.talend.mdm.webservice.WSByteArray wsBytes,
           java.lang.String contentType,
           org.talend.mdm.webservice.WSTransformerPK wsTransformerPK,
           org.talend.mdm.webservice.WSOutputDecisionTableDecisions[] wsOutputDecisionTable) {
           this.wsBytes = wsBytes;
           this.contentType = contentType;
           this.wsTransformerPK = wsTransformerPK;
           this.wsOutputDecisionTable = wsOutputDecisionTable;
    }


    /**
     * Gets the wsBytes value for this WSProcessBytesUsingTransformer.
     * 
     * @return wsBytes
     */
    public org.talend.mdm.webservice.WSByteArray getWsBytes() {
        return wsBytes;
    }


    /**
     * Sets the wsBytes value for this WSProcessBytesUsingTransformer.
     * 
     * @param wsBytes
     */
    public void setWsBytes(org.talend.mdm.webservice.WSByteArray wsBytes) {
        this.wsBytes = wsBytes;
    }


    /**
     * Gets the contentType value for this WSProcessBytesUsingTransformer.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this WSProcessBytesUsingTransformer.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the wsTransformerPK value for this WSProcessBytesUsingTransformer.
     * 
     * @return wsTransformerPK
     */
    public org.talend.mdm.webservice.WSTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }


    /**
     * Sets the wsTransformerPK value for this WSProcessBytesUsingTransformer.
     * 
     * @param wsTransformerPK
     */
    public void setWsTransformerPK(org.talend.mdm.webservice.WSTransformerPK wsTransformerPK) {
        this.wsTransformerPK = wsTransformerPK;
    }


    /**
     * Gets the wsOutputDecisionTable value for this WSProcessBytesUsingTransformer.
     * 
     * @return wsOutputDecisionTable
     */
    public org.talend.mdm.webservice.WSOutputDecisionTableDecisions[] getWsOutputDecisionTable() {
        return wsOutputDecisionTable;
    }


    /**
     * Sets the wsOutputDecisionTable value for this WSProcessBytesUsingTransformer.
     * 
     * @param wsOutputDecisionTable
     */
    public void setWsOutputDecisionTable(org.talend.mdm.webservice.WSOutputDecisionTableDecisions[] wsOutputDecisionTable) {
        this.wsOutputDecisionTable = wsOutputDecisionTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSProcessBytesUsingTransformer)) return false;
        WSProcessBytesUsingTransformer other = (WSProcessBytesUsingTransformer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsBytes==null && other.getWsBytes()==null) || 
             (this.wsBytes!=null &&
              this.wsBytes.equals(other.getWsBytes()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.wsTransformerPK==null && other.getWsTransformerPK()==null) || 
             (this.wsTransformerPK!=null &&
              this.wsTransformerPK.equals(other.getWsTransformerPK()))) &&
            ((this.wsOutputDecisionTable==null && other.getWsOutputDecisionTable()==null) || 
             (this.wsOutputDecisionTable!=null &&
              java.util.Arrays.equals(this.wsOutputDecisionTable, other.getWsOutputDecisionTable())));
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
        if (getWsBytes() != null) {
            _hashCode += getWsBytes().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getWsTransformerPK() != null) {
            _hashCode += getWsTransformerPK().hashCode();
        }
        if (getWsOutputDecisionTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsOutputDecisionTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsOutputDecisionTable(), i);
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
        new org.apache.axis.description.TypeDesc(WSProcessBytesUsingTransformer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSByteArray"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsTransformerPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsTransformerPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsOutputDecisionTable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsOutputDecisionTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSOutputDecisionTable>decisions"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "decisions"));
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

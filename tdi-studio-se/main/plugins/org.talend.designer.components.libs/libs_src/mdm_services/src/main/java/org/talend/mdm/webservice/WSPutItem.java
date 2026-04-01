/**
 * WSPutItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Puts an item in the xml storage.
 */
public class WSPutItem  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private java.lang.String xmlString;

    private org.talend.mdm.webservice.WSDataModelPK wsDataModelPK;

    private java.lang.Boolean isUpdate;

    public WSPutItem() {
    }

    public WSPutItem(
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           java.lang.String xmlString,
           org.talend.mdm.webservice.WSDataModelPK wsDataModelPK,
           java.lang.Boolean isUpdate) {
           this.wsDataClusterPK = wsDataClusterPK;
           this.xmlString = xmlString;
           this.wsDataModelPK = wsDataModelPK;
           this.isUpdate = isUpdate;
    }


    /**
     * Gets the wsDataClusterPK value for this WSPutItem.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSPutItem.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the xmlString value for this WSPutItem.
     * 
     * @return xmlString
     */
    public java.lang.String getXmlString() {
        return xmlString;
    }


    /**
     * Sets the xmlString value for this WSPutItem.
     * 
     * @param xmlString
     */
    public void setXmlString(java.lang.String xmlString) {
        this.xmlString = xmlString;
    }


    /**
     * Gets the wsDataModelPK value for this WSPutItem.
     * 
     * @return wsDataModelPK
     */
    public org.talend.mdm.webservice.WSDataModelPK getWsDataModelPK() {
        return wsDataModelPK;
    }


    /**
     * Sets the wsDataModelPK value for this WSPutItem.
     * 
     * @param wsDataModelPK
     */
    public void setWsDataModelPK(org.talend.mdm.webservice.WSDataModelPK wsDataModelPK) {
        this.wsDataModelPK = wsDataModelPK;
    }


    /**
     * Gets the isUpdate value for this WSPutItem.
     * 
     * @return isUpdate
     */
    public java.lang.Boolean getIsUpdate() {
        return isUpdate;
    }


    /**
     * Sets the isUpdate value for this WSPutItem.
     * 
     * @param isUpdate
     */
    public void setIsUpdate(java.lang.Boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutItem)) return false;
        WSPutItem other = (WSPutItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataClusterPK==null && other.getWsDataClusterPK()==null) || 
             (this.wsDataClusterPK!=null &&
              this.wsDataClusterPK.equals(other.getWsDataClusterPK()))) &&
            ((this.xmlString==null && other.getXmlString()==null) || 
             (this.xmlString!=null &&
              this.xmlString.equals(other.getXmlString()))) &&
            ((this.wsDataModelPK==null && other.getWsDataModelPK()==null) || 
             (this.wsDataModelPK!=null &&
              this.wsDataModelPK.equals(other.getWsDataModelPK()))) &&
            ((this.isUpdate==null && other.getIsUpdate()==null) || 
             (this.isUpdate!=null &&
              this.isUpdate.equals(other.getIsUpdate())));
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
        if (getWsDataClusterPK() != null) {
            _hashCode += getWsDataClusterPK().hashCode();
        }
        if (getXmlString() != null) {
            _hashCode += getXmlString().hashCode();
        }
        if (getWsDataModelPK() != null) {
            _hashCode += getWsDataModelPK().hashCode();
        }
        if (getIsUpdate() != null) {
            _hashCode += getIsUpdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataModelPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataModelPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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

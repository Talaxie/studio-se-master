/**
 * WSDroppedItemPK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSDroppedItemPK  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSItemPK wsItemPK;

    private java.lang.String partPath;

    private java.lang.String revisionId;

    public WSDroppedItemPK() {
    }

    public WSDroppedItemPK(
           org.talend.mdm.webservice.WSItemPK wsItemPK,
           java.lang.String partPath,
           java.lang.String revisionId) {
           this.wsItemPK = wsItemPK;
           this.partPath = partPath;
           this.revisionId = revisionId;
    }


    /**
     * Gets the wsItemPK value for this WSDroppedItemPK.
     * 
     * @return wsItemPK
     */
    public org.talend.mdm.webservice.WSItemPK getWsItemPK() {
        return wsItemPK;
    }


    /**
     * Sets the wsItemPK value for this WSDroppedItemPK.
     * 
     * @param wsItemPK
     */
    public void setWsItemPK(org.talend.mdm.webservice.WSItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }


    /**
     * Gets the partPath value for this WSDroppedItemPK.
     * 
     * @return partPath
     */
    public java.lang.String getPartPath() {
        return partPath;
    }


    /**
     * Sets the partPath value for this WSDroppedItemPK.
     * 
     * @param partPath
     */
    public void setPartPath(java.lang.String partPath) {
        this.partPath = partPath;
    }


    /**
     * Gets the revisionId value for this WSDroppedItemPK.
     * 
     * @return revisionId
     */
    public java.lang.String getRevisionId() {
        return revisionId;
    }


    /**
     * Sets the revisionId value for this WSDroppedItemPK.
     * 
     * @param revisionId
     */
    public void setRevisionId(java.lang.String revisionId) {
        this.revisionId = revisionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDroppedItemPK)) return false;
        WSDroppedItemPK other = (WSDroppedItemPK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsItemPK==null && other.getWsItemPK()==null) || 
             (this.wsItemPK!=null &&
              this.wsItemPK.equals(other.getWsItemPK()))) &&
            ((this.partPath==null && other.getPartPath()==null) || 
             (this.partPath!=null &&
              this.partPath.equals(other.getPartPath()))) &&
            ((this.revisionId==null && other.getRevisionId()==null) || 
             (this.revisionId!=null &&
              this.revisionId.equals(other.getRevisionId())));
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
        if (getWsItemPK() != null) {
            _hashCode += getWsItemPK().hashCode();
        }
        if (getPartPath() != null) {
            _hashCode += getPartPath().hashCode();
        }
        if (getRevisionId() != null) {
            _hashCode += getRevisionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDroppedItemPK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

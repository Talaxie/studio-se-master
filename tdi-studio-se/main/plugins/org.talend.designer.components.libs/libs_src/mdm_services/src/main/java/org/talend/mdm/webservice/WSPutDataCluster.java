/**
 * WSPutDataCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Creates a data-cluster. Characteristics (stemming, etc...) of a
 * data cluster cannot be changed
 */
public class WSPutDataCluster  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataCluster wsDataCluster;

    public WSPutDataCluster() {
    }

    public WSPutDataCluster(
           org.talend.mdm.webservice.WSDataCluster wsDataCluster) {
           this.wsDataCluster = wsDataCluster;
    }


    /**
     * Gets the wsDataCluster value for this WSPutDataCluster.
     * 
     * @return wsDataCluster
     */
    public org.talend.mdm.webservice.WSDataCluster getWsDataCluster() {
        return wsDataCluster;
    }


    /**
     * Sets the wsDataCluster value for this WSPutDataCluster.
     * 
     * @param wsDataCluster
     */
    public void setWsDataCluster(org.talend.mdm.webservice.WSDataCluster wsDataCluster) {
        this.wsDataCluster = wsDataCluster;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutDataCluster)) return false;
        WSPutDataCluster other = (WSPutDataCluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDataCluster==null && other.getWsDataCluster()==null) || 
             (this.wsDataCluster!=null &&
              this.wsDataCluster.equals(other.getWsDataCluster())));
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
        if (getWsDataCluster() != null) {
            _hashCode += getWsDataCluster().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutDataCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataCluster"));
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

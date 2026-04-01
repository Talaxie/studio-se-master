/**
 * WSGetBusinessConceptValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Returns the value for a business concept based on its key
 */
public class WSGetBusinessConceptValue  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private org.talend.mdm.webservice.WSBusinessConceptPK wsBusinessConceptPK;

    public WSGetBusinessConceptValue() {
    }

    public WSGetBusinessConceptValue(
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           org.talend.mdm.webservice.WSBusinessConceptPK wsBusinessConceptPK) {
           this.wsDataClusterPK = wsDataClusterPK;
           this.wsBusinessConceptPK = wsBusinessConceptPK;
    }


    /**
     * Gets the wsDataClusterPK value for this WSGetBusinessConceptValue.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSGetBusinessConceptValue.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the wsBusinessConceptPK value for this WSGetBusinessConceptValue.
     * 
     * @return wsBusinessConceptPK
     */
    public org.talend.mdm.webservice.WSBusinessConceptPK getWsBusinessConceptPK() {
        return wsBusinessConceptPK;
    }


    /**
     * Sets the wsBusinessConceptPK value for this WSGetBusinessConceptValue.
     * 
     * @param wsBusinessConceptPK
     */
    public void setWsBusinessConceptPK(org.talend.mdm.webservice.WSBusinessConceptPK wsBusinessConceptPK) {
        this.wsBusinessConceptPK = wsBusinessConceptPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSGetBusinessConceptValue)) return false;
        WSGetBusinessConceptValue other = (WSGetBusinessConceptValue) obj;
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
            ((this.wsBusinessConceptPK==null && other.getWsBusinessConceptPK()==null) || 
             (this.wsBusinessConceptPK!=null &&
              this.wsBusinessConceptPK.equals(other.getWsBusinessConceptPK())));
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
        if (getWsBusinessConceptPK() != null) {
            _hashCode += getWsBusinessConceptPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSGetBusinessConceptValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsBusinessConceptPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsBusinessConceptPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBusinessConceptPK"));
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

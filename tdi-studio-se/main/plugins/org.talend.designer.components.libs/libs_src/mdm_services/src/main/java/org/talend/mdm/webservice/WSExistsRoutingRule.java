/**
 * WSExistsRoutingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSExistsRoutingRule  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSRoutingRulePK wsRoutingRulePK;

    public WSExistsRoutingRule() {
    }

    public WSExistsRoutingRule(
           org.talend.mdm.webservice.WSRoutingRulePK wsRoutingRulePK) {
           this.wsRoutingRulePK = wsRoutingRulePK;
    }


    /**
     * Gets the wsRoutingRulePK value for this WSExistsRoutingRule.
     * 
     * @return wsRoutingRulePK
     */
    public org.talend.mdm.webservice.WSRoutingRulePK getWsRoutingRulePK() {
        return wsRoutingRulePK;
    }


    /**
     * Sets the wsRoutingRulePK value for this WSExistsRoutingRule.
     * 
     * @param wsRoutingRulePK
     */
    public void setWsRoutingRulePK(org.talend.mdm.webservice.WSRoutingRulePK wsRoutingRulePK) {
        this.wsRoutingRulePK = wsRoutingRulePK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExistsRoutingRule)) return false;
        WSExistsRoutingRule other = (WSExistsRoutingRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsRoutingRulePK==null && other.getWsRoutingRulePK()==null) || 
             (this.wsRoutingRulePK!=null &&
              this.wsRoutingRulePK.equals(other.getWsRoutingRulePK())));
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
        if (getWsRoutingRulePK() != null) {
            _hashCode += getWsRoutingRulePK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSExistsRoutingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsRoutingRulePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsRoutingRulePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK"));
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

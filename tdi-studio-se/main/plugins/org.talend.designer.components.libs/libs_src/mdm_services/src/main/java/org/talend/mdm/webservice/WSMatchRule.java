/**
 * WSMatchRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSMatchRule  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSMatchRulePK PK;

    private java.lang.String configurationXmlContent;

    public WSMatchRule() {
    }

    public WSMatchRule(
           org.talend.mdm.webservice.WSMatchRulePK PK,
           java.lang.String configurationXmlContent) {
           this.PK = PK;
           this.configurationXmlContent = configurationXmlContent;
    }


    /**
     * Gets the PK value for this WSMatchRule.
     * 
     * @return PK
     */
    public org.talend.mdm.webservice.WSMatchRulePK getPK() {
        return PK;
    }


    /**
     * Sets the PK value for this WSMatchRule.
     * 
     * @param PK
     */
    public void setPK(org.talend.mdm.webservice.WSMatchRulePK PK) {
        this.PK = PK;
    }


    /**
     * Gets the configurationXmlContent value for this WSMatchRule.
     * 
     * @return configurationXmlContent
     */
    public java.lang.String getConfigurationXmlContent() {
        return configurationXmlContent;
    }


    /**
     * Sets the configurationXmlContent value for this WSMatchRule.
     * 
     * @param configurationXmlContent
     */
    public void setConfigurationXmlContent(java.lang.String configurationXmlContent) {
        this.configurationXmlContent = configurationXmlContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMatchRule)) return false;
        WSMatchRule other = (WSMatchRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PK==null && other.getPK()==null) || 
             (this.PK!=null &&
              this.PK.equals(other.getPK()))) &&
            ((this.configurationXmlContent==null && other.getConfigurationXmlContent()==null) || 
             (this.configurationXmlContent!=null &&
              this.configurationXmlContent.equals(other.getConfigurationXmlContent())));
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
        if (getPK() != null) {
            _hashCode += getPK().hashCode();
        }
        if (getConfigurationXmlContent() != null) {
            _hashCode += getConfigurationXmlContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSMatchRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationXmlContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configurationXmlContent"));
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

/**
 * WSRoutingRuleExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingRuleExpression  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String xpath;

    private org.talend.mdm.webservice.WSRoutingRuleOperator wsOperator;

    private java.lang.String value;

    public WSRoutingRuleExpression() {
    }

    public WSRoutingRuleExpression(
           java.lang.String name,
           java.lang.String xpath,
           org.talend.mdm.webservice.WSRoutingRuleOperator wsOperator,
           java.lang.String value) {
           this.name = name;
           this.xpath = xpath;
           this.wsOperator = wsOperator;
           this.value = value;
    }


    /**
     * Gets the name value for this WSRoutingRuleExpression.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSRoutingRuleExpression.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the xpath value for this WSRoutingRuleExpression.
     * 
     * @return xpath
     */
    public java.lang.String getXpath() {
        return xpath;
    }


    /**
     * Sets the xpath value for this WSRoutingRuleExpression.
     * 
     * @param xpath
     */
    public void setXpath(java.lang.String xpath) {
        this.xpath = xpath;
    }


    /**
     * Gets the wsOperator value for this WSRoutingRuleExpression.
     * 
     * @return wsOperator
     */
    public org.talend.mdm.webservice.WSRoutingRuleOperator getWsOperator() {
        return wsOperator;
    }


    /**
     * Sets the wsOperator value for this WSRoutingRuleExpression.
     * 
     * @param wsOperator
     */
    public void setWsOperator(org.talend.mdm.webservice.WSRoutingRuleOperator wsOperator) {
        this.wsOperator = wsOperator;
    }


    /**
     * Gets the value value for this WSRoutingRuleExpression.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this WSRoutingRuleExpression.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoutingRuleExpression)) return false;
        WSRoutingRuleExpression other = (WSRoutingRuleExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.xpath==null && other.getXpath()==null) || 
             (this.xpath!=null &&
              this.xpath.equals(other.getXpath()))) &&
            ((this.wsOperator==null && other.getWsOperator()==null) || 
             (this.wsOperator!=null &&
              this.wsOperator.equals(other.getWsOperator()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getXpath() != null) {
            _hashCode += getXpath().hashCode();
        }
        if (getWsOperator() != null) {
            _hashCode += getWsOperator().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRoutingRuleExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

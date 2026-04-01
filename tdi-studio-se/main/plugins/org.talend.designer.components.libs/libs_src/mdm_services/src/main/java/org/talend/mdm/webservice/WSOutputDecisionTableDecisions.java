/**
 * WSOutputDecisionTableDecisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSOutputDecisionTableDecisions  implements java.io.Serializable {
    private java.lang.String outputVariableName;

    private java.lang.String decision;

    public WSOutputDecisionTableDecisions() {
    }

    public WSOutputDecisionTableDecisions(
           java.lang.String outputVariableName,
           java.lang.String decision) {
           this.outputVariableName = outputVariableName;
           this.decision = decision;
    }


    /**
     * Gets the outputVariableName value for this WSOutputDecisionTableDecisions.
     * 
     * @return outputVariableName
     */
    public java.lang.String getOutputVariableName() {
        return outputVariableName;
    }


    /**
     * Sets the outputVariableName value for this WSOutputDecisionTableDecisions.
     * 
     * @param outputVariableName
     */
    public void setOutputVariableName(java.lang.String outputVariableName) {
        this.outputVariableName = outputVariableName;
    }


    /**
     * Gets the decision value for this WSOutputDecisionTableDecisions.
     * 
     * @return decision
     */
    public java.lang.String getDecision() {
        return decision;
    }


    /**
     * Sets the decision value for this WSOutputDecisionTableDecisions.
     * 
     * @param decision
     */
    public void setDecision(java.lang.String decision) {
        this.decision = decision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSOutputDecisionTableDecisions)) return false;
        WSOutputDecisionTableDecisions other = (WSOutputDecisionTableDecisions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outputVariableName==null && other.getOutputVariableName()==null) || 
             (this.outputVariableName!=null &&
              this.outputVariableName.equals(other.getOutputVariableName()))) &&
            ((this.decision==null && other.getDecision()==null) || 
             (this.decision!=null &&
              this.decision.equals(other.getDecision())));
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
        if (getOutputVariableName() != null) {
            _hashCode += getOutputVariableName().hashCode();
        }
        if (getDecision() != null) {
            _hashCode += getDecision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSOutputDecisionTableDecisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSOutputDecisionTable>decisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputVariableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputVariableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decision"));
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

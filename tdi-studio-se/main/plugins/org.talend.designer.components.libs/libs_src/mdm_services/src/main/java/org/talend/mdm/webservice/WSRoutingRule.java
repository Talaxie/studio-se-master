/**
 * WSRoutingRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSRoutingRule  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private boolean synchronous;

    private java.lang.String concept;

    private java.lang.String serviceJNDI;

    private java.lang.String parameters;

    private org.talend.mdm.webservice.WSRoutingRuleExpression[] wsRoutingRuleExpressions;

    private java.lang.String condition;

    private java.lang.Boolean deactive;

    private java.lang.Integer executeOrder;

    public WSRoutingRule() {
    }

    public WSRoutingRule(
           java.lang.String name,
           java.lang.String description,
           boolean synchronous,
           java.lang.String concept,
           java.lang.String serviceJNDI,
           java.lang.String parameters,
           org.talend.mdm.webservice.WSRoutingRuleExpression[] wsRoutingRuleExpressions,
           java.lang.String condition,
           java.lang.Boolean deactive,
           java.lang.Integer executeOrder) {
           this.name = name;
           this.description = description;
           this.synchronous = synchronous;
           this.concept = concept;
           this.serviceJNDI = serviceJNDI;
           this.parameters = parameters;
           this.wsRoutingRuleExpressions = wsRoutingRuleExpressions;
           this.condition = condition;
           this.deactive = deactive;
           this.executeOrder = executeOrder;
    }


    /**
     * Gets the name value for this WSRoutingRule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSRoutingRule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this WSRoutingRule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSRoutingRule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the synchronous value for this WSRoutingRule.
     * 
     * @return synchronous
     */
    public boolean isSynchronous() {
        return synchronous;
    }


    /**
     * Sets the synchronous value for this WSRoutingRule.
     * 
     * @param synchronous
     */
    public void setSynchronous(boolean synchronous) {
        this.synchronous = synchronous;
    }


    /**
     * Gets the concept value for this WSRoutingRule.
     * 
     * @return concept
     */
    public java.lang.String getConcept() {
        return concept;
    }


    /**
     * Sets the concept value for this WSRoutingRule.
     * 
     * @param concept
     */
    public void setConcept(java.lang.String concept) {
        this.concept = concept;
    }


    /**
     * Gets the serviceJNDI value for this WSRoutingRule.
     * 
     * @return serviceJNDI
     */
    public java.lang.String getServiceJNDI() {
        return serviceJNDI;
    }


    /**
     * Sets the serviceJNDI value for this WSRoutingRule.
     * 
     * @param serviceJNDI
     */
    public void setServiceJNDI(java.lang.String serviceJNDI) {
        this.serviceJNDI = serviceJNDI;
    }


    /**
     * Gets the parameters value for this WSRoutingRule.
     * 
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSRoutingRule.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the wsRoutingRuleExpressions value for this WSRoutingRule.
     * 
     * @return wsRoutingRuleExpressions
     */
    public org.talend.mdm.webservice.WSRoutingRuleExpression[] getWsRoutingRuleExpressions() {
        return wsRoutingRuleExpressions;
    }


    /**
     * Sets the wsRoutingRuleExpressions value for this WSRoutingRule.
     * 
     * @param wsRoutingRuleExpressions
     */
    public void setWsRoutingRuleExpressions(org.talend.mdm.webservice.WSRoutingRuleExpression[] wsRoutingRuleExpressions) {
        this.wsRoutingRuleExpressions = wsRoutingRuleExpressions;
    }

    public org.talend.mdm.webservice.WSRoutingRuleExpression getWsRoutingRuleExpressions(int i) {
        return this.wsRoutingRuleExpressions[i];
    }

    public void setWsRoutingRuleExpressions(int i, org.talend.mdm.webservice.WSRoutingRuleExpression _value) {
        this.wsRoutingRuleExpressions[i] = _value;
    }


    /**
     * Gets the condition value for this WSRoutingRule.
     * 
     * @return condition
     */
    public java.lang.String getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this WSRoutingRule.
     * 
     * @param condition
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }


    /**
     * Gets the deactive value for this WSRoutingRule.
     * 
     * @return deactive
     */
    public java.lang.Boolean getDeactive() {
        return deactive;
    }


    /**
     * Sets the deactive value for this WSRoutingRule.
     * 
     * @param deactive
     */
    public void setDeactive(java.lang.Boolean deactive) {
        this.deactive = deactive;
    }


    /**
     * Gets the executeOrder value for this WSRoutingRule.
     * 
     * @return executeOrder
     */
    public java.lang.Integer getExecuteOrder() {
        return executeOrder;
    }


    /**
     * Sets the executeOrder value for this WSRoutingRule.
     * 
     * @param executeOrder
     */
    public void setExecuteOrder(java.lang.Integer executeOrder) {
        this.executeOrder = executeOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRoutingRule)) return false;
        WSRoutingRule other = (WSRoutingRule) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.synchronous == other.isSynchronous() &&
            ((this.concept==null && other.getConcept()==null) || 
             (this.concept!=null &&
              this.concept.equals(other.getConcept()))) &&
            ((this.serviceJNDI==null && other.getServiceJNDI()==null) || 
             (this.serviceJNDI!=null &&
              this.serviceJNDI.equals(other.getServiceJNDI()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.wsRoutingRuleExpressions==null && other.getWsRoutingRuleExpressions()==null) || 
             (this.wsRoutingRuleExpressions!=null &&
              java.util.Arrays.equals(this.wsRoutingRuleExpressions, other.getWsRoutingRuleExpressions()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.deactive==null && other.getDeactive()==null) || 
             (this.deactive!=null &&
              this.deactive.equals(other.getDeactive()))) &&
            ((this.executeOrder==null && other.getExecuteOrder()==null) || 
             (this.executeOrder!=null &&
              this.executeOrder.equals(other.getExecuteOrder())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isSynchronous() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConcept() != null) {
            _hashCode += getConcept().hashCode();
        }
        if (getServiceJNDI() != null) {
            _hashCode += getServiceJNDI().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getWsRoutingRuleExpressions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsRoutingRuleExpressions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsRoutingRuleExpressions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getDeactive() != null) {
            _hashCode += getDeactive().hashCode();
        }
        if (getExecuteOrder() != null) {
            _hashCode += getExecuteOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRoutingRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronous");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synchronous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concept");
        elemField.setXmlName(new javax.xml.namespace.QName("", "concept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceJNDI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceJNDI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsRoutingRuleExpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsRoutingRuleExpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "executeOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

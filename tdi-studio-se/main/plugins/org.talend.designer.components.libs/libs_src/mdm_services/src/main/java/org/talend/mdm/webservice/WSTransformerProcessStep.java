/**
 * WSTransformerProcessStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerProcessStep  implements java.io.Serializable {
    private java.lang.String pluginJNDI;

    private java.lang.String description;

    private java.lang.String parameters;

    private org.talend.mdm.webservice.WSTransformerVariablesMapping[] inputMappings;

    private org.talend.mdm.webservice.WSTransformerVariablesMapping[] outputMappings;

    private java.lang.Boolean disabled;

    public WSTransformerProcessStep() {
    }

    public WSTransformerProcessStep(
           java.lang.String pluginJNDI,
           java.lang.String description,
           java.lang.String parameters,
           org.talend.mdm.webservice.WSTransformerVariablesMapping[] inputMappings,
           org.talend.mdm.webservice.WSTransformerVariablesMapping[] outputMappings,
           java.lang.Boolean disabled) {
           this.pluginJNDI = pluginJNDI;
           this.description = description;
           this.parameters = parameters;
           this.inputMappings = inputMappings;
           this.outputMappings = outputMappings;
           this.disabled = disabled;
    }


    /**
     * Gets the pluginJNDI value for this WSTransformerProcessStep.
     * 
     * @return pluginJNDI
     */
    public java.lang.String getPluginJNDI() {
        return pluginJNDI;
    }


    /**
     * Sets the pluginJNDI value for this WSTransformerProcessStep.
     * 
     * @param pluginJNDI
     */
    public void setPluginJNDI(java.lang.String pluginJNDI) {
        this.pluginJNDI = pluginJNDI;
    }


    /**
     * Gets the description value for this WSTransformerProcessStep.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSTransformerProcessStep.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the parameters value for this WSTransformerProcessStep.
     * 
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSTransformerProcessStep.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the inputMappings value for this WSTransformerProcessStep.
     * 
     * @return inputMappings
     */
    public org.talend.mdm.webservice.WSTransformerVariablesMapping[] getInputMappings() {
        return inputMappings;
    }


    /**
     * Sets the inputMappings value for this WSTransformerProcessStep.
     * 
     * @param inputMappings
     */
    public void setInputMappings(org.talend.mdm.webservice.WSTransformerVariablesMapping[] inputMappings) {
        this.inputMappings = inputMappings;
    }

    public org.talend.mdm.webservice.WSTransformerVariablesMapping getInputMappings(int i) {
        return this.inputMappings[i];
    }

    public void setInputMappings(int i, org.talend.mdm.webservice.WSTransformerVariablesMapping _value) {
        this.inputMappings[i] = _value;
    }


    /**
     * Gets the outputMappings value for this WSTransformerProcessStep.
     * 
     * @return outputMappings
     */
    public org.talend.mdm.webservice.WSTransformerVariablesMapping[] getOutputMappings() {
        return outputMappings;
    }


    /**
     * Sets the outputMappings value for this WSTransformerProcessStep.
     * 
     * @param outputMappings
     */
    public void setOutputMappings(org.talend.mdm.webservice.WSTransformerVariablesMapping[] outputMappings) {
        this.outputMappings = outputMappings;
    }

    public org.talend.mdm.webservice.WSTransformerVariablesMapping getOutputMappings(int i) {
        return this.outputMappings[i];
    }

    public void setOutputMappings(int i, org.talend.mdm.webservice.WSTransformerVariablesMapping _value) {
        this.outputMappings[i] = _value;
    }


    /**
     * Gets the disabled value for this WSTransformerProcessStep.
     * 
     * @return disabled
     */
    public java.lang.Boolean getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this WSTransformerProcessStep.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.Boolean disabled) {
        this.disabled = disabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerProcessStep)) return false;
        WSTransformerProcessStep other = (WSTransformerProcessStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pluginJNDI==null && other.getPluginJNDI()==null) || 
             (this.pluginJNDI!=null &&
              this.pluginJNDI.equals(other.getPluginJNDI()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.inputMappings==null && other.getInputMappings()==null) || 
             (this.inputMappings!=null &&
              java.util.Arrays.equals(this.inputMappings, other.getInputMappings()))) &&
            ((this.outputMappings==null && other.getOutputMappings()==null) || 
             (this.outputMappings!=null &&
              java.util.Arrays.equals(this.outputMappings, other.getOutputMappings()))) &&
            ((this.disabled==null && other.getDisabled()==null) || 
             (this.disabled!=null &&
              this.disabled.equals(other.getDisabled())));
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
        if (getPluginJNDI() != null) {
            _hashCode += getPluginJNDI().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getInputMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisabled() != null) {
            _hashCode += getDisabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerProcessStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerProcessStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginJNDI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PluginJNDI"));
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
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerVariablesMapping"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerVariablesMapping"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disabled"));
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

/**
 * WSTransformerPluginV2Details.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerPluginV2Details  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] inputVariableDescriptors;

    private org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] outputVariableDescriptors;

    private java.lang.String description;

    private java.lang.String documentation;

    private java.lang.String parametersSchema;

    public WSTransformerPluginV2Details() {
    }

    public WSTransformerPluginV2Details(
           org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] inputVariableDescriptors,
           org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] outputVariableDescriptors,
           java.lang.String description,
           java.lang.String documentation,
           java.lang.String parametersSchema) {
           this.inputVariableDescriptors = inputVariableDescriptors;
           this.outputVariableDescriptors = outputVariableDescriptors;
           this.description = description;
           this.documentation = documentation;
           this.parametersSchema = parametersSchema;
    }


    /**
     * Gets the inputVariableDescriptors value for this WSTransformerPluginV2Details.
     * 
     * @return inputVariableDescriptors
     */
    public org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] getInputVariableDescriptors() {
        return inputVariableDescriptors;
    }


    /**
     * Sets the inputVariableDescriptors value for this WSTransformerPluginV2Details.
     * 
     * @param inputVariableDescriptors
     */
    public void setInputVariableDescriptors(org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] inputVariableDescriptors) {
        this.inputVariableDescriptors = inputVariableDescriptors;
    }

    public org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor getInputVariableDescriptors(int i) {
        return this.inputVariableDescriptors[i];
    }

    public void setInputVariableDescriptors(int i, org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor _value) {
        this.inputVariableDescriptors[i] = _value;
    }


    /**
     * Gets the outputVariableDescriptors value for this WSTransformerPluginV2Details.
     * 
     * @return outputVariableDescriptors
     */
    public org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] getOutputVariableDescriptors() {
        return outputVariableDescriptors;
    }


    /**
     * Sets the outputVariableDescriptors value for this WSTransformerPluginV2Details.
     * 
     * @param outputVariableDescriptors
     */
    public void setOutputVariableDescriptors(org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor[] outputVariableDescriptors) {
        this.outputVariableDescriptors = outputVariableDescriptors;
    }

    public org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor getOutputVariableDescriptors(int i) {
        return this.outputVariableDescriptors[i];
    }

    public void setOutputVariableDescriptors(int i, org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor _value) {
        this.outputVariableDescriptors[i] = _value;
    }


    /**
     * Gets the description value for this WSTransformerPluginV2Details.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSTransformerPluginV2Details.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the documentation value for this WSTransformerPluginV2Details.
     * 
     * @return documentation
     */
    public java.lang.String getDocumentation() {
        return documentation;
    }


    /**
     * Sets the documentation value for this WSTransformerPluginV2Details.
     * 
     * @param documentation
     */
    public void setDocumentation(java.lang.String documentation) {
        this.documentation = documentation;
    }


    /**
     * Gets the parametersSchema value for this WSTransformerPluginV2Details.
     * 
     * @return parametersSchema
     */
    public java.lang.String getParametersSchema() {
        return parametersSchema;
    }


    /**
     * Sets the parametersSchema value for this WSTransformerPluginV2Details.
     * 
     * @param parametersSchema
     */
    public void setParametersSchema(java.lang.String parametersSchema) {
        this.parametersSchema = parametersSchema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerPluginV2Details)) return false;
        WSTransformerPluginV2Details other = (WSTransformerPluginV2Details) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputVariableDescriptors==null && other.getInputVariableDescriptors()==null) || 
             (this.inputVariableDescriptors!=null &&
              java.util.Arrays.equals(this.inputVariableDescriptors, other.getInputVariableDescriptors()))) &&
            ((this.outputVariableDescriptors==null && other.getOutputVariableDescriptors()==null) || 
             (this.outputVariableDescriptors!=null &&
              java.util.Arrays.equals(this.outputVariableDescriptors, other.getOutputVariableDescriptors()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.documentation==null && other.getDocumentation()==null) || 
             (this.documentation!=null &&
              this.documentation.equals(other.getDocumentation()))) &&
            ((this.parametersSchema==null && other.getParametersSchema()==null) || 
             (this.parametersSchema!=null &&
              this.parametersSchema.equals(other.getParametersSchema())));
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
        if (getInputVariableDescriptors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputVariableDescriptors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputVariableDescriptors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputVariableDescriptors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputVariableDescriptors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputVariableDescriptors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDocumentation() != null) {
            _hashCode += getDocumentation().hashCode();
        }
        if (getParametersSchema() != null) {
            _hashCode += getParametersSchema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerPluginV2Details.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2Details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputVariableDescriptors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputVariableDescriptors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2VariableDescriptor"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputVariableDescriptors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputVariableDescriptors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2VariableDescriptor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametersSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametersSchema"));
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

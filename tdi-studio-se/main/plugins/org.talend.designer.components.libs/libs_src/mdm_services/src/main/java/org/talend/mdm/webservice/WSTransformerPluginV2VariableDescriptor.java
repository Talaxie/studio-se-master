/**
 * WSTransformerPluginV2VariableDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerPluginV2VariableDescriptor  implements java.io.Serializable {
    private java.lang.String variableName;

    private boolean mandatory;

    private java.lang.String description;

    private java.lang.String[] contentTypesRegex;

    private java.lang.String[] possibleValuesRegex;

    public WSTransformerPluginV2VariableDescriptor() {
    }

    public WSTransformerPluginV2VariableDescriptor(
           java.lang.String variableName,
           boolean mandatory,
           java.lang.String description,
           java.lang.String[] contentTypesRegex,
           java.lang.String[] possibleValuesRegex) {
           this.variableName = variableName;
           this.mandatory = mandatory;
           this.description = description;
           this.contentTypesRegex = contentTypesRegex;
           this.possibleValuesRegex = possibleValuesRegex;
    }


    /**
     * Gets the variableName value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @return variableName
     */
    public java.lang.String getVariableName() {
        return variableName;
    }


    /**
     * Sets the variableName value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @param variableName
     */
    public void setVariableName(java.lang.String variableName) {
        this.variableName = variableName;
    }


    /**
     * Gets the mandatory value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @return mandatory
     */
    public boolean isMandatory() {
        return mandatory;
    }


    /**
     * Sets the mandatory value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @param mandatory
     */
    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }


    /**
     * Gets the description value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the contentTypesRegex value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @return contentTypesRegex
     */
    public java.lang.String[] getContentTypesRegex() {
        return contentTypesRegex;
    }


    /**
     * Sets the contentTypesRegex value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @param contentTypesRegex
     */
    public void setContentTypesRegex(java.lang.String[] contentTypesRegex) {
        this.contentTypesRegex = contentTypesRegex;
    }

    public java.lang.String getContentTypesRegex(int i) {
        return this.contentTypesRegex[i];
    }

    public void setContentTypesRegex(int i, java.lang.String _value) {
        this.contentTypesRegex[i] = _value;
    }


    /**
     * Gets the possibleValuesRegex value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @return possibleValuesRegex
     */
    public java.lang.String[] getPossibleValuesRegex() {
        return possibleValuesRegex;
    }


    /**
     * Sets the possibleValuesRegex value for this WSTransformerPluginV2VariableDescriptor.
     * 
     * @param possibleValuesRegex
     */
    public void setPossibleValuesRegex(java.lang.String[] possibleValuesRegex) {
        this.possibleValuesRegex = possibleValuesRegex;
    }

    public java.lang.String getPossibleValuesRegex(int i) {
        return this.possibleValuesRegex[i];
    }

    public void setPossibleValuesRegex(int i, java.lang.String _value) {
        this.possibleValuesRegex[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerPluginV2VariableDescriptor)) return false;
        WSTransformerPluginV2VariableDescriptor other = (WSTransformerPluginV2VariableDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variableName==null && other.getVariableName()==null) || 
             (this.variableName!=null &&
              this.variableName.equals(other.getVariableName()))) &&
            this.mandatory == other.isMandatory() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.contentTypesRegex==null && other.getContentTypesRegex()==null) || 
             (this.contentTypesRegex!=null &&
              java.util.Arrays.equals(this.contentTypesRegex, other.getContentTypesRegex()))) &&
            ((this.possibleValuesRegex==null && other.getPossibleValuesRegex()==null) || 
             (this.possibleValuesRegex!=null &&
              java.util.Arrays.equals(this.possibleValuesRegex, other.getPossibleValuesRegex())));
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
        if (getVariableName() != null) {
            _hashCode += getVariableName().hashCode();
        }
        _hashCode += (isMandatory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getContentTypesRegex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentTypesRegex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentTypesRegex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPossibleValuesRegex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPossibleValuesRegex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPossibleValuesRegex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerPluginV2VariableDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2VariableDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "variableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTypesRegex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentTypesRegex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possibleValuesRegex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "possibleValuesRegex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

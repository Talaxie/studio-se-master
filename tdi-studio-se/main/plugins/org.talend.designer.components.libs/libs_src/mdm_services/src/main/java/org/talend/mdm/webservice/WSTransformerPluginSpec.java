/**
 * WSTransformerPluginSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSTransformerPluginSpec  implements java.io.Serializable {
    private java.lang.String pluginJNDI;

    private java.lang.String description;

    private java.lang.String input;

    private java.lang.String output;

    private java.lang.String parameters;

    public WSTransformerPluginSpec() {
    }

    public WSTransformerPluginSpec(
           java.lang.String pluginJNDI,
           java.lang.String description,
           java.lang.String input,
           java.lang.String output,
           java.lang.String parameters) {
           this.pluginJNDI = pluginJNDI;
           this.description = description;
           this.input = input;
           this.output = output;
           this.parameters = parameters;
    }


    /**
     * Gets the pluginJNDI value for this WSTransformerPluginSpec.
     * 
     * @return pluginJNDI
     */
    public java.lang.String getPluginJNDI() {
        return pluginJNDI;
    }


    /**
     * Sets the pluginJNDI value for this WSTransformerPluginSpec.
     * 
     * @param pluginJNDI
     */
    public void setPluginJNDI(java.lang.String pluginJNDI) {
        this.pluginJNDI = pluginJNDI;
    }


    /**
     * Gets the description value for this WSTransformerPluginSpec.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSTransformerPluginSpec.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the input value for this WSTransformerPluginSpec.
     * 
     * @return input
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this WSTransformerPluginSpec.
     * 
     * @param input
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the output value for this WSTransformerPluginSpec.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this WSTransformerPluginSpec.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the parameters value for this WSTransformerPluginSpec.
     * 
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSTransformerPluginSpec.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTransformerPluginSpec)) return false;
        WSTransformerPluginSpec other = (WSTransformerPluginSpec) obj;
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
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters())));
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
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTransformerPluginSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginSpec"));
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
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
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

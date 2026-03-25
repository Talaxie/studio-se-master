/**
 * WSServiceGetDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSServiceGetDocument  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String configure;

    private java.lang.String document;

    private java.lang.String configureSchema;

    private java.lang.String defaultConfig;

    public WSServiceGetDocument() {
    }

    public WSServiceGetDocument(
           java.lang.String description,
           java.lang.String configure,
           java.lang.String document,
           java.lang.String configureSchema,
           java.lang.String defaultConfig) {
           this.description = description;
           this.configure = configure;
           this.document = document;
           this.configureSchema = configureSchema;
           this.defaultConfig = defaultConfig;
    }


    /**
     * Gets the description value for this WSServiceGetDocument.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSServiceGetDocument.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the configure value for this WSServiceGetDocument.
     * 
     * @return configure
     */
    public java.lang.String getConfigure() {
        return configure;
    }


    /**
     * Sets the configure value for this WSServiceGetDocument.
     * 
     * @param configure
     */
    public void setConfigure(java.lang.String configure) {
        this.configure = configure;
    }


    /**
     * Gets the document value for this WSServiceGetDocument.
     * 
     * @return document
     */
    public java.lang.String getDocument() {
        return document;
    }


    /**
     * Sets the document value for this WSServiceGetDocument.
     * 
     * @param document
     */
    public void setDocument(java.lang.String document) {
        this.document = document;
    }


    /**
     * Gets the configureSchema value for this WSServiceGetDocument.
     * 
     * @return configureSchema
     */
    public java.lang.String getConfigureSchema() {
        return configureSchema;
    }


    /**
     * Sets the configureSchema value for this WSServiceGetDocument.
     * 
     * @param configureSchema
     */
    public void setConfigureSchema(java.lang.String configureSchema) {
        this.configureSchema = configureSchema;
    }


    /**
     * Gets the defaultConfig value for this WSServiceGetDocument.
     * 
     * @return defaultConfig
     */
    public java.lang.String getDefaultConfig() {
        return defaultConfig;
    }


    /**
     * Sets the defaultConfig value for this WSServiceGetDocument.
     * 
     * @param defaultConfig
     */
    public void setDefaultConfig(java.lang.String defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSServiceGetDocument)) return false;
        WSServiceGetDocument other = (WSServiceGetDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.configure==null && other.getConfigure()==null) || 
             (this.configure!=null &&
              this.configure.equals(other.getConfigure()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.configureSchema==null && other.getConfigureSchema()==null) || 
             (this.configureSchema!=null &&
              this.configureSchema.equals(other.getConfigureSchema()))) &&
            ((this.defaultConfig==null && other.getDefaultConfig()==null) || 
             (this.defaultConfig!=null &&
              this.defaultConfig.equals(other.getDefaultConfig())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getConfigure() != null) {
            _hashCode += getConfigure().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getConfigureSchema() != null) {
            _hashCode += getConfigureSchema().hashCode();
        }
        if (getDefaultConfig() != null) {
            _hashCode += getDefaultConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSServiceGetDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configureSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultConfig"));
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

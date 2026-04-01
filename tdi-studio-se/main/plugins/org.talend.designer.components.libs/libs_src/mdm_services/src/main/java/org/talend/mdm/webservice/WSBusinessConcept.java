/**
 * WSBusinessConcept.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Can be used as a simple alternative to avoid loading a schema xsd:element
 * 				
 * @see putBusinessConceptSchema
 * 				xsd types can be used as business template
 */
public class WSBusinessConcept  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String businessTemplate;

    private org.talend.mdm.webservice.WSKey wsUniqueKey;

    private org.talend.mdm.webservice.WSI18NString[] wsLabel;

    private org.talend.mdm.webservice.WSI18NString[] wsDescription;

    public WSBusinessConcept() {
    }

    public WSBusinessConcept(
           java.lang.String name,
           java.lang.String businessTemplate,
           org.talend.mdm.webservice.WSKey wsUniqueKey,
           org.talend.mdm.webservice.WSI18NString[] wsLabel,
           org.talend.mdm.webservice.WSI18NString[] wsDescription) {
           this.name = name;
           this.businessTemplate = businessTemplate;
           this.wsUniqueKey = wsUniqueKey;
           this.wsLabel = wsLabel;
           this.wsDescription = wsDescription;
    }


    /**
     * Gets the name value for this WSBusinessConcept.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSBusinessConcept.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the businessTemplate value for this WSBusinessConcept.
     * 
     * @return businessTemplate
     */
    public java.lang.String getBusinessTemplate() {
        return businessTemplate;
    }


    /**
     * Sets the businessTemplate value for this WSBusinessConcept.
     * 
     * @param businessTemplate
     */
    public void setBusinessTemplate(java.lang.String businessTemplate) {
        this.businessTemplate = businessTemplate;
    }


    /**
     * Gets the wsUniqueKey value for this WSBusinessConcept.
     * 
     * @return wsUniqueKey
     */
    public org.talend.mdm.webservice.WSKey getWsUniqueKey() {
        return wsUniqueKey;
    }


    /**
     * Sets the wsUniqueKey value for this WSBusinessConcept.
     * 
     * @param wsUniqueKey
     */
    public void setWsUniqueKey(org.talend.mdm.webservice.WSKey wsUniqueKey) {
        this.wsUniqueKey = wsUniqueKey;
    }


    /**
     * Gets the wsLabel value for this WSBusinessConcept.
     * 
     * @return wsLabel
     */
    public org.talend.mdm.webservice.WSI18NString[] getWsLabel() {
        return wsLabel;
    }


    /**
     * Sets the wsLabel value for this WSBusinessConcept.
     * 
     * @param wsLabel
     */
    public void setWsLabel(org.talend.mdm.webservice.WSI18NString[] wsLabel) {
        this.wsLabel = wsLabel;
    }

    public org.talend.mdm.webservice.WSI18NString getWsLabel(int i) {
        return this.wsLabel[i];
    }

    public void setWsLabel(int i, org.talend.mdm.webservice.WSI18NString _value) {
        this.wsLabel[i] = _value;
    }


    /**
     * Gets the wsDescription value for this WSBusinessConcept.
     * 
     * @return wsDescription
     */
    public org.talend.mdm.webservice.WSI18NString[] getWsDescription() {
        return wsDescription;
    }


    /**
     * Sets the wsDescription value for this WSBusinessConcept.
     * 
     * @param wsDescription
     */
    public void setWsDescription(org.talend.mdm.webservice.WSI18NString[] wsDescription) {
        this.wsDescription = wsDescription;
    }

    public org.talend.mdm.webservice.WSI18NString getWsDescription(int i) {
        return this.wsDescription[i];
    }

    public void setWsDescription(int i, org.talend.mdm.webservice.WSI18NString _value) {
        this.wsDescription[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSBusinessConcept)) return false;
        WSBusinessConcept other = (WSBusinessConcept) obj;
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
            ((this.businessTemplate==null && other.getBusinessTemplate()==null) || 
             (this.businessTemplate!=null &&
              this.businessTemplate.equals(other.getBusinessTemplate()))) &&
            ((this.wsUniqueKey==null && other.getWsUniqueKey()==null) || 
             (this.wsUniqueKey!=null &&
              this.wsUniqueKey.equals(other.getWsUniqueKey()))) &&
            ((this.wsLabel==null && other.getWsLabel()==null) || 
             (this.wsLabel!=null &&
              java.util.Arrays.equals(this.wsLabel, other.getWsLabel()))) &&
            ((this.wsDescription==null && other.getWsDescription()==null) || 
             (this.wsDescription!=null &&
              java.util.Arrays.equals(this.wsDescription, other.getWsDescription())));
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
        if (getBusinessTemplate() != null) {
            _hashCode += getBusinessTemplate().hashCode();
        }
        if (getWsUniqueKey() != null) {
            _hashCode += getWsUniqueKey().hashCode();
        }
        if (getWsLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWsDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsDescription(), i);
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
        new org.apache.axis.description.TypeDesc(WSBusinessConcept.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBusinessConcept"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSI18nString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSI18nString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

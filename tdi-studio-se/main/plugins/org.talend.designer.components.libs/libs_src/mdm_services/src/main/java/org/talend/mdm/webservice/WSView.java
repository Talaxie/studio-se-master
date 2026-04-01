/**
 * WSView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSView  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String[] viewableBusinessElements;

    private org.talend.mdm.webservice.WSWhereCondition[] whereConditions;

    private java.lang.String[] searchableBusinessElements;

    private java.lang.String transformerPK;

    private org.talend.mdm.webservice.WSBoolean isTransformerActive;

    public WSView() {
    }

    public WSView(
           java.lang.String name,
           java.lang.String description,
           java.lang.String[] viewableBusinessElements,
           org.talend.mdm.webservice.WSWhereCondition[] whereConditions,
           java.lang.String[] searchableBusinessElements,
           java.lang.String transformerPK,
           org.talend.mdm.webservice.WSBoolean isTransformerActive) {
           this.name = name;
           this.description = description;
           this.viewableBusinessElements = viewableBusinessElements;
           this.whereConditions = whereConditions;
           this.searchableBusinessElements = searchableBusinessElements;
           this.transformerPK = transformerPK;
           this.isTransformerActive = isTransformerActive;
    }


    /**
     * Gets the name value for this WSView.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSView.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this WSView.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSView.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the viewableBusinessElements value for this WSView.
     * 
     * @return viewableBusinessElements
     */
    public java.lang.String[] getViewableBusinessElements() {
        return viewableBusinessElements;
    }


    /**
     * Sets the viewableBusinessElements value for this WSView.
     * 
     * @param viewableBusinessElements
     */
    public void setViewableBusinessElements(java.lang.String[] viewableBusinessElements) {
        this.viewableBusinessElements = viewableBusinessElements;
    }

    public java.lang.String getViewableBusinessElements(int i) {
        return this.viewableBusinessElements[i];
    }

    public void setViewableBusinessElements(int i, java.lang.String _value) {
        this.viewableBusinessElements[i] = _value;
    }


    /**
     * Gets the whereConditions value for this WSView.
     * 
     * @return whereConditions
     */
    public org.talend.mdm.webservice.WSWhereCondition[] getWhereConditions() {
        return whereConditions;
    }


    /**
     * Sets the whereConditions value for this WSView.
     * 
     * @param whereConditions
     */
    public void setWhereConditions(org.talend.mdm.webservice.WSWhereCondition[] whereConditions) {
        this.whereConditions = whereConditions;
    }

    public org.talend.mdm.webservice.WSWhereCondition getWhereConditions(int i) {
        return this.whereConditions[i];
    }

    public void setWhereConditions(int i, org.talend.mdm.webservice.WSWhereCondition _value) {
        this.whereConditions[i] = _value;
    }


    /**
     * Gets the searchableBusinessElements value for this WSView.
     * 
     * @return searchableBusinessElements
     */
    public java.lang.String[] getSearchableBusinessElements() {
        return searchableBusinessElements;
    }


    /**
     * Sets the searchableBusinessElements value for this WSView.
     * 
     * @param searchableBusinessElements
     */
    public void setSearchableBusinessElements(java.lang.String[] searchableBusinessElements) {
        this.searchableBusinessElements = searchableBusinessElements;
    }

    public java.lang.String getSearchableBusinessElements(int i) {
        return this.searchableBusinessElements[i];
    }

    public void setSearchableBusinessElements(int i, java.lang.String _value) {
        this.searchableBusinessElements[i] = _value;
    }


    /**
     * Gets the transformerPK value for this WSView.
     * 
     * @return transformerPK
     */
    public java.lang.String getTransformerPK() {
        return transformerPK;
    }


    /**
     * Sets the transformerPK value for this WSView.
     * 
     * @param transformerPK
     */
    public void setTransformerPK(java.lang.String transformerPK) {
        this.transformerPK = transformerPK;
    }


    /**
     * Gets the isTransformerActive value for this WSView.
     * 
     * @return isTransformerActive
     */
    public org.talend.mdm.webservice.WSBoolean getIsTransformerActive() {
        return isTransformerActive;
    }


    /**
     * Sets the isTransformerActive value for this WSView.
     * 
     * @param isTransformerActive
     */
    public void setIsTransformerActive(org.talend.mdm.webservice.WSBoolean isTransformerActive) {
        this.isTransformerActive = isTransformerActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSView)) return false;
        WSView other = (WSView) obj;
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
            ((this.viewableBusinessElements==null && other.getViewableBusinessElements()==null) || 
             (this.viewableBusinessElements!=null &&
              java.util.Arrays.equals(this.viewableBusinessElements, other.getViewableBusinessElements()))) &&
            ((this.whereConditions==null && other.getWhereConditions()==null) || 
             (this.whereConditions!=null &&
              java.util.Arrays.equals(this.whereConditions, other.getWhereConditions()))) &&
            ((this.searchableBusinessElements==null && other.getSearchableBusinessElements()==null) || 
             (this.searchableBusinessElements!=null &&
              java.util.Arrays.equals(this.searchableBusinessElements, other.getSearchableBusinessElements()))) &&
            ((this.transformerPK==null && other.getTransformerPK()==null) || 
             (this.transformerPK!=null &&
              this.transformerPK.equals(other.getTransformerPK()))) &&
            ((this.isTransformerActive==null && other.getIsTransformerActive()==null) || 
             (this.isTransformerActive!=null &&
              this.isTransformerActive.equals(other.getIsTransformerActive())));
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
        if (getViewableBusinessElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewableBusinessElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewableBusinessElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhereConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhereConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhereConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchableBusinessElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchableBusinessElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchableBusinessElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformerPK() != null) {
            _hashCode += getTransformerPK().hashCode();
        }
        if (getIsTransformerActive() != null) {
            _hashCode += getIsTransformerActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSView.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSView"));
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
        elemField.setFieldName("viewableBusinessElements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewableBusinessElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "whereConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchableBusinessElements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchableBusinessElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformerPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformerPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTransformerActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTransformerActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
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

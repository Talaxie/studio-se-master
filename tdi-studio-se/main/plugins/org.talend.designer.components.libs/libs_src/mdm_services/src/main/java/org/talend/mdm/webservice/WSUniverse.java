/**
 * WSUniverse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSUniverse  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs;

    private java.lang.String defaultItemsRevisionID;

    private org.talend.mdm.webservice.WSUniverseItemsRevisionIDs[] itemsRevisionIDs;

    public WSUniverse() {
    }

    public WSUniverse(
           java.lang.String name,
           java.lang.String description,
           org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs,
           java.lang.String defaultItemsRevisionID,
           org.talend.mdm.webservice.WSUniverseItemsRevisionIDs[] itemsRevisionIDs) {
           this.name = name;
           this.description = description;
           this.xtentisObjectsRevisionIDs = xtentisObjectsRevisionIDs;
           this.defaultItemsRevisionID = defaultItemsRevisionID;
           this.itemsRevisionIDs = itemsRevisionIDs;
    }


    /**
     * Gets the name value for this WSUniverse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSUniverse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this WSUniverse.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSUniverse.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the xtentisObjectsRevisionIDs value for this WSUniverse.
     * 
     * @return xtentisObjectsRevisionIDs
     */
    public org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs[] getXtentisObjectsRevisionIDs() {
        return xtentisObjectsRevisionIDs;
    }


    /**
     * Sets the xtentisObjectsRevisionIDs value for this WSUniverse.
     * 
     * @param xtentisObjectsRevisionIDs
     */
    public void setXtentisObjectsRevisionIDs(org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs) {
        this.xtentisObjectsRevisionIDs = xtentisObjectsRevisionIDs;
    }

    public org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs getXtentisObjectsRevisionIDs(int i) {
        return this.xtentisObjectsRevisionIDs[i];
    }

    public void setXtentisObjectsRevisionIDs(int i, org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs _value) {
        this.xtentisObjectsRevisionIDs[i] = _value;
    }


    /**
     * Gets the defaultItemsRevisionID value for this WSUniverse.
     * 
     * @return defaultItemsRevisionID
     */
    public java.lang.String getDefaultItemsRevisionID() {
        return defaultItemsRevisionID;
    }


    /**
     * Sets the defaultItemsRevisionID value for this WSUniverse.
     * 
     * @param defaultItemsRevisionID
     */
    public void setDefaultItemsRevisionID(java.lang.String defaultItemsRevisionID) {
        this.defaultItemsRevisionID = defaultItemsRevisionID;
    }


    /**
     * Gets the itemsRevisionIDs value for this WSUniverse.
     * 
     * @return itemsRevisionIDs
     */
    public org.talend.mdm.webservice.WSUniverseItemsRevisionIDs[] getItemsRevisionIDs() {
        return itemsRevisionIDs;
    }


    /**
     * Sets the itemsRevisionIDs value for this WSUniverse.
     * 
     * @param itemsRevisionIDs
     */
    public void setItemsRevisionIDs(org.talend.mdm.webservice.WSUniverseItemsRevisionIDs[] itemsRevisionIDs) {
        this.itemsRevisionIDs = itemsRevisionIDs;
    }

    public org.talend.mdm.webservice.WSUniverseItemsRevisionIDs getItemsRevisionIDs(int i) {
        return this.itemsRevisionIDs[i];
    }

    public void setItemsRevisionIDs(int i, org.talend.mdm.webservice.WSUniverseItemsRevisionIDs _value) {
        this.itemsRevisionIDs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSUniverse)) return false;
        WSUniverse other = (WSUniverse) obj;
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
            ((this.xtentisObjectsRevisionIDs==null && other.getXtentisObjectsRevisionIDs()==null) || 
             (this.xtentisObjectsRevisionIDs!=null &&
              java.util.Arrays.equals(this.xtentisObjectsRevisionIDs, other.getXtentisObjectsRevisionIDs()))) &&
            ((this.defaultItemsRevisionID==null && other.getDefaultItemsRevisionID()==null) || 
             (this.defaultItemsRevisionID!=null &&
              this.defaultItemsRevisionID.equals(other.getDefaultItemsRevisionID()))) &&
            ((this.itemsRevisionIDs==null && other.getItemsRevisionIDs()==null) || 
             (this.itemsRevisionIDs!=null &&
              java.util.Arrays.equals(this.itemsRevisionIDs, other.getItemsRevisionIDs())));
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
        if (getXtentisObjectsRevisionIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXtentisObjectsRevisionIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXtentisObjectsRevisionIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultItemsRevisionID() != null) {
            _hashCode += getDefaultItemsRevisionID().hashCode();
        }
        if (getItemsRevisionIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsRevisionIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsRevisionIDs(), i);
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
        new org.apache.axis.description.TypeDesc(WSUniverse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
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
        elemField.setFieldName("xtentisObjectsRevisionIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xtentisObjectsRevisionIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSUniverse>xtentisObjectsRevisionIDs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultItemsRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultItemsRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsRevisionIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemsRevisionIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSUniverse>itemsRevisionIDs"));
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

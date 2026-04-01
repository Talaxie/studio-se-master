/**
 * WSMenuEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSMenuEntry  implements java.io.Serializable {
    private java.lang.String id;

    private org.talend.mdm.webservice.WSMenuEntryDescriptions[] descriptions;

    private java.lang.String context;

    private java.lang.String application;

    private java.lang.String icon;

    private org.talend.mdm.webservice.WSMenuEntry[] subMenus;

    public WSMenuEntry() {
    }

    public WSMenuEntry(
           java.lang.String id,
           org.talend.mdm.webservice.WSMenuEntryDescriptions[] descriptions,
           java.lang.String context,
           java.lang.String application,
           java.lang.String icon,
           org.talend.mdm.webservice.WSMenuEntry[] subMenus) {
           this.id = id;
           this.descriptions = descriptions;
           this.context = context;
           this.application = application;
           this.icon = icon;
           this.subMenus = subMenus;
    }


    /**
     * Gets the id value for this WSMenuEntry.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WSMenuEntry.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the descriptions value for this WSMenuEntry.
     * 
     * @return descriptions
     */
    public org.talend.mdm.webservice.WSMenuEntryDescriptions[] getDescriptions() {
        return descriptions;
    }


    /**
     * Sets the descriptions value for this WSMenuEntry.
     * 
     * @param descriptions
     */
    public void setDescriptions(org.talend.mdm.webservice.WSMenuEntryDescriptions[] descriptions) {
        this.descriptions = descriptions;
    }

    public org.talend.mdm.webservice.WSMenuEntryDescriptions getDescriptions(int i) {
        return this.descriptions[i];
    }

    public void setDescriptions(int i, org.talend.mdm.webservice.WSMenuEntryDescriptions _value) {
        this.descriptions[i] = _value;
    }


    /**
     * Gets the context value for this WSMenuEntry.
     * 
     * @return context
     */
    public java.lang.String getContext() {
        return context;
    }


    /**
     * Sets the context value for this WSMenuEntry.
     * 
     * @param context
     */
    public void setContext(java.lang.String context) {
        this.context = context;
    }


    /**
     * Gets the application value for this WSMenuEntry.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this WSMenuEntry.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the icon value for this WSMenuEntry.
     * 
     * @return icon
     */
    public java.lang.String getIcon() {
        return icon;
    }


    /**
     * Sets the icon value for this WSMenuEntry.
     * 
     * @param icon
     */
    public void setIcon(java.lang.String icon) {
        this.icon = icon;
    }


    /**
     * Gets the subMenus value for this WSMenuEntry.
     * 
     * @return subMenus
     */
    public org.talend.mdm.webservice.WSMenuEntry[] getSubMenus() {
        return subMenus;
    }


    /**
     * Sets the subMenus value for this WSMenuEntry.
     * 
     * @param subMenus
     */
    public void setSubMenus(org.talend.mdm.webservice.WSMenuEntry[] subMenus) {
        this.subMenus = subMenus;
    }

    public org.talend.mdm.webservice.WSMenuEntry getSubMenus(int i) {
        return this.subMenus[i];
    }

    public void setSubMenus(int i, org.talend.mdm.webservice.WSMenuEntry _value) {
        this.subMenus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSMenuEntry)) return false;
        WSMenuEntry other = (WSMenuEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.descriptions==null && other.getDescriptions()==null) || 
             (this.descriptions!=null &&
              java.util.Arrays.equals(this.descriptions, other.getDescriptions()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.icon==null && other.getIcon()==null) || 
             (this.icon!=null &&
              this.icon.equals(other.getIcon()))) &&
            ((this.subMenus==null && other.getSubMenus()==null) || 
             (this.subMenus!=null &&
              java.util.Arrays.equals(this.subMenus, other.getSubMenus())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescriptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getIcon() != null) {
            _hashCode += getIcon().hashCode();
        }
        if (getSubMenus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubMenus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubMenus(), i);
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
        new org.apache.axis.description.TypeDesc(WSMenuEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSMenuEntry>descriptions"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("", "context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subMenus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subMenus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuEntry"));
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

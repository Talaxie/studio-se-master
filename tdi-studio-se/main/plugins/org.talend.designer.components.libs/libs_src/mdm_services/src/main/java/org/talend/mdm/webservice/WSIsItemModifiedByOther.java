/**
 * WSIsItemModifiedByOther.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSIsItemModifiedByOther  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSItem wsItem;

    public WSIsItemModifiedByOther() {
    }

    public WSIsItemModifiedByOther(
           org.talend.mdm.webservice.WSItem wsItem) {
           this.wsItem = wsItem;
    }


    /**
     * Gets the wsItem value for this WSIsItemModifiedByOther.
     * 
     * @return wsItem
     */
    public org.talend.mdm.webservice.WSItem getWsItem() {
        return wsItem;
    }


    /**
     * Sets the wsItem value for this WSIsItemModifiedByOther.
     * 
     * @param wsItem
     */
    public void setWsItem(org.talend.mdm.webservice.WSItem wsItem) {
        this.wsItem = wsItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSIsItemModifiedByOther)) return false;
        WSIsItemModifiedByOther other = (WSIsItemModifiedByOther) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsItem==null && other.getWsItem()==null) || 
             (this.wsItem!=null &&
              this.wsItem.equals(other.getWsItem())));
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
        if (getWsItem() != null) {
            _hashCode += getWsItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSIsItemModifiedByOther.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSIsItemModifiedByOther"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItem"));
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

/**
 * WSPutSynchronizationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSPutSynchronizationItem  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSSynchronizationItem wsSynchronizationItem;

    public WSPutSynchronizationItem() {
    }

    public WSPutSynchronizationItem(
           org.talend.mdm.webservice.WSSynchronizationItem wsSynchronizationItem) {
           this.wsSynchronizationItem = wsSynchronizationItem;
    }


    /**
     * Gets the wsSynchronizationItem value for this WSPutSynchronizationItem.
     * 
     * @return wsSynchronizationItem
     */
    public org.talend.mdm.webservice.WSSynchronizationItem getWsSynchronizationItem() {
        return wsSynchronizationItem;
    }


    /**
     * Sets the wsSynchronizationItem value for this WSPutSynchronizationItem.
     * 
     * @param wsSynchronizationItem
     */
    public void setWsSynchronizationItem(org.talend.mdm.webservice.WSSynchronizationItem wsSynchronizationItem) {
        this.wsSynchronizationItem = wsSynchronizationItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPutSynchronizationItem)) return false;
        WSPutSynchronizationItem other = (WSPutSynchronizationItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSynchronizationItem==null && other.getWsSynchronizationItem()==null) || 
             (this.wsSynchronizationItem!=null &&
              this.wsSynchronizationItem.equals(other.getWsSynchronizationItem())));
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
        if (getWsSynchronizationItem() != null) {
            _hashCode += getWsSynchronizationItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPutSynchronizationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSynchronizationItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSynchronizationItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
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

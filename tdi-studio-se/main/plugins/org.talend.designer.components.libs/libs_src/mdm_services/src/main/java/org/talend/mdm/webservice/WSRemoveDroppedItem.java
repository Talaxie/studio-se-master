/**
 * WSRemoveDroppedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;


/**
 * Remove a dropped item from items trash
 */
public class WSRemoveDroppedItem  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSDroppedItemPK wsDroppedItemPK;

    public WSRemoveDroppedItem() {
    }

    public WSRemoveDroppedItem(
           org.talend.mdm.webservice.WSDroppedItemPK wsDroppedItemPK) {
           this.wsDroppedItemPK = wsDroppedItemPK;
    }


    /**
     * Gets the wsDroppedItemPK value for this WSRemoveDroppedItem.
     * 
     * @return wsDroppedItemPK
     */
    public org.talend.mdm.webservice.WSDroppedItemPK getWsDroppedItemPK() {
        return wsDroppedItemPK;
    }


    /**
     * Sets the wsDroppedItemPK value for this WSRemoveDroppedItem.
     * 
     * @param wsDroppedItemPK
     */
    public void setWsDroppedItemPK(org.talend.mdm.webservice.WSDroppedItemPK wsDroppedItemPK) {
        this.wsDroppedItemPK = wsDroppedItemPK;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSRemoveDroppedItem)) return false;
        WSRemoveDroppedItem other = (WSRemoveDroppedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsDroppedItemPK==null && other.getWsDroppedItemPK()==null) || 
             (this.wsDroppedItemPK!=null &&
              this.wsDroppedItemPK.equals(other.getWsDroppedItemPK())));
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
        if (getWsDroppedItemPK() != null) {
            _hashCode += getWsDroppedItemPK().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSRemoveDroppedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRemoveDroppedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDroppedItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDroppedItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
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

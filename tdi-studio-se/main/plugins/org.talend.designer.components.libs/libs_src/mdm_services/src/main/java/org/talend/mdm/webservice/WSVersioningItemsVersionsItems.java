/**
 * WSVersioningItemsVersionsItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSVersioningItemsVersionsItems  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSItemPK wsItemPK;

    private org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries;

    public WSVersioningItemsVersionsItems() {
    }

    public WSVersioningItemsVersionsItems(
           org.talend.mdm.webservice.WSItemPK wsItemPK,
           org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries) {
           this.wsItemPK = wsItemPK;
           this.wsVersionEntries = wsVersionEntries;
    }


    /**
     * Gets the wsItemPK value for this WSVersioningItemsVersionsItems.
     * 
     * @return wsItemPK
     */
    public org.talend.mdm.webservice.WSItemPK getWsItemPK() {
        return wsItemPK;
    }


    /**
     * Sets the wsItemPK value for this WSVersioningItemsVersionsItems.
     * 
     * @param wsItemPK
     */
    public void setWsItemPK(org.talend.mdm.webservice.WSItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }


    /**
     * Gets the wsVersionEntries value for this WSVersioningItemsVersionsItems.
     * 
     * @return wsVersionEntries
     */
    public org.talend.mdm.webservice.WSVersioningHistoryEntry[] getWsVersionEntries() {
        return wsVersionEntries;
    }


    /**
     * Sets the wsVersionEntries value for this WSVersioningItemsVersionsItems.
     * 
     * @param wsVersionEntries
     */
    public void setWsVersionEntries(org.talend.mdm.webservice.WSVersioningHistoryEntry[] wsVersionEntries) {
        this.wsVersionEntries = wsVersionEntries;
    }

    public org.talend.mdm.webservice.WSVersioningHistoryEntry getWsVersionEntries(int i) {
        return this.wsVersionEntries[i];
    }

    public void setWsVersionEntries(int i, org.talend.mdm.webservice.WSVersioningHistoryEntry _value) {
        this.wsVersionEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSVersioningItemsVersionsItems)) return false;
        WSVersioningItemsVersionsItems other = (WSVersioningItemsVersionsItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsItemPK==null && other.getWsItemPK()==null) || 
             (this.wsItemPK!=null &&
              this.wsItemPK.equals(other.getWsItemPK()))) &&
            ((this.wsVersionEntries==null && other.getWsVersionEntries()==null) || 
             (this.wsVersionEntries!=null &&
              java.util.Arrays.equals(this.wsVersionEntries, other.getWsVersionEntries())));
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
        if (getWsItemPK() != null) {
            _hashCode += getWsItemPK().hashCode();
        }
        if (getWsVersionEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsVersionEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsVersionEntries(), i);
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
        new org.apache.axis.description.TypeDesc(WSVersioningItemsVersionsItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningItemsVersions>items"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsVersionEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsVersionEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningHistoryEntry"));
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

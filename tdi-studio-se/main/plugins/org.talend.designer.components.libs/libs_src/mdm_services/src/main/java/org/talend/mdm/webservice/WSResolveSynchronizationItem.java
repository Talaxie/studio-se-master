/**
 * WSResolveSynchronizationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSResolveSynchronizationItem  implements java.io.Serializable {
    private java.lang.String[] wsSynchronizationItemPK;

    private java.lang.String newProjection;

    public WSResolveSynchronizationItem() {
    }

    public WSResolveSynchronizationItem(
           java.lang.String[] wsSynchronizationItemPK,
           java.lang.String newProjection) {
           this.wsSynchronizationItemPK = wsSynchronizationItemPK;
           this.newProjection = newProjection;
    }


    /**
     * Gets the wsSynchronizationItemPK value for this WSResolveSynchronizationItem.
     * 
     * @return wsSynchronizationItemPK
     */
    public java.lang.String[] getWsSynchronizationItemPK() {
        return wsSynchronizationItemPK;
    }


    /**
     * Sets the wsSynchronizationItemPK value for this WSResolveSynchronizationItem.
     * 
     * @param wsSynchronizationItemPK
     */
    public void setWsSynchronizationItemPK(java.lang.String[] wsSynchronizationItemPK) {
        this.wsSynchronizationItemPK = wsSynchronizationItemPK;
    }


    /**
     * Gets the newProjection value for this WSResolveSynchronizationItem.
     * 
     * @return newProjection
     */
    public java.lang.String getNewProjection() {
        return newProjection;
    }


    /**
     * Sets the newProjection value for this WSResolveSynchronizationItem.
     * 
     * @param newProjection
     */
    public void setNewProjection(java.lang.String newProjection) {
        this.newProjection = newProjection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSResolveSynchronizationItem)) return false;
        WSResolveSynchronizationItem other = (WSResolveSynchronizationItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsSynchronizationItemPK==null && other.getWsSynchronizationItemPK()==null) || 
             (this.wsSynchronizationItemPK!=null &&
              java.util.Arrays.equals(this.wsSynchronizationItemPK, other.getWsSynchronizationItemPK()))) &&
            ((this.newProjection==null && other.getNewProjection()==null) || 
             (this.newProjection!=null &&
              this.newProjection.equals(other.getNewProjection())));
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
        if (getWsSynchronizationItemPK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWsSynchronizationItemPK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWsSynchronizationItemPK(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewProjection() != null) {
            _hashCode += getNewProjection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSResolveSynchronizationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResolveSynchronizationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsSynchronizationItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsSynchronizationItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ids"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newProjection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newProjection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

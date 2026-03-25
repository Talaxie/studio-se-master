/**
 * WSSynchronizationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationItem  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSItemPK wsItemPK;

    private java.lang.String localRevisionID;

    private java.lang.String lastRunPlan;

    private org.talend.mdm.webservice.WSSynchronizationItemStatus status;

    private java.lang.String resolvedProjection;

    private org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances[] remoteInstances;

    public WSSynchronizationItem() {
    }

    public WSSynchronizationItem(
           org.talend.mdm.webservice.WSItemPK wsItemPK,
           java.lang.String localRevisionID,
           java.lang.String lastRunPlan,
           org.talend.mdm.webservice.WSSynchronizationItemStatus status,
           java.lang.String resolvedProjection,
           org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances[] remoteInstances) {
           this.wsItemPK = wsItemPK;
           this.localRevisionID = localRevisionID;
           this.lastRunPlan = lastRunPlan;
           this.status = status;
           this.resolvedProjection = resolvedProjection;
           this.remoteInstances = remoteInstances;
    }


    /**
     * Gets the wsItemPK value for this WSSynchronizationItem.
     * 
     * @return wsItemPK
     */
    public org.talend.mdm.webservice.WSItemPK getWsItemPK() {
        return wsItemPK;
    }


    /**
     * Sets the wsItemPK value for this WSSynchronizationItem.
     * 
     * @param wsItemPK
     */
    public void setWsItemPK(org.talend.mdm.webservice.WSItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }


    /**
     * Gets the localRevisionID value for this WSSynchronizationItem.
     * 
     * @return localRevisionID
     */
    public java.lang.String getLocalRevisionID() {
        return localRevisionID;
    }


    /**
     * Sets the localRevisionID value for this WSSynchronizationItem.
     * 
     * @param localRevisionID
     */
    public void setLocalRevisionID(java.lang.String localRevisionID) {
        this.localRevisionID = localRevisionID;
    }


    /**
     * Gets the lastRunPlan value for this WSSynchronizationItem.
     * 
     * @return lastRunPlan
     */
    public java.lang.String getLastRunPlan() {
        return lastRunPlan;
    }


    /**
     * Sets the lastRunPlan value for this WSSynchronizationItem.
     * 
     * @param lastRunPlan
     */
    public void setLastRunPlan(java.lang.String lastRunPlan) {
        this.lastRunPlan = lastRunPlan;
    }


    /**
     * Gets the status value for this WSSynchronizationItem.
     * 
     * @return status
     */
    public org.talend.mdm.webservice.WSSynchronizationItemStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSSynchronizationItem.
     * 
     * @param status
     */
    public void setStatus(org.talend.mdm.webservice.WSSynchronizationItemStatus status) {
        this.status = status;
    }


    /**
     * Gets the resolvedProjection value for this WSSynchronizationItem.
     * 
     * @return resolvedProjection
     */
    public java.lang.String getResolvedProjection() {
        return resolvedProjection;
    }


    /**
     * Sets the resolvedProjection value for this WSSynchronizationItem.
     * 
     * @param resolvedProjection
     */
    public void setResolvedProjection(java.lang.String resolvedProjection) {
        this.resolvedProjection = resolvedProjection;
    }


    /**
     * Gets the remoteInstances value for this WSSynchronizationItem.
     * 
     * @return remoteInstances
     */
    public org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances[] getRemoteInstances() {
        return remoteInstances;
    }


    /**
     * Sets the remoteInstances value for this WSSynchronizationItem.
     * 
     * @param remoteInstances
     */
    public void setRemoteInstances(org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances[] remoteInstances) {
        this.remoteInstances = remoteInstances;
    }

    public org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances getRemoteInstances(int i) {
        return this.remoteInstances[i];
    }

    public void setRemoteInstances(int i, org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances _value) {
        this.remoteInstances[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationItem)) return false;
        WSSynchronizationItem other = (WSSynchronizationItem) obj;
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
            ((this.localRevisionID==null && other.getLocalRevisionID()==null) || 
             (this.localRevisionID!=null &&
              this.localRevisionID.equals(other.getLocalRevisionID()))) &&
            ((this.lastRunPlan==null && other.getLastRunPlan()==null) || 
             (this.lastRunPlan!=null &&
              this.lastRunPlan.equals(other.getLastRunPlan()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.resolvedProjection==null && other.getResolvedProjection()==null) || 
             (this.resolvedProjection!=null &&
              this.resolvedProjection.equals(other.getResolvedProjection()))) &&
            ((this.remoteInstances==null && other.getRemoteInstances()==null) || 
             (this.remoteInstances!=null &&
              java.util.Arrays.equals(this.remoteInstances, other.getRemoteInstances())));
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
        if (getLocalRevisionID() != null) {
            _hashCode += getLocalRevisionID().hashCode();
        }
        if (getLastRunPlan() != null) {
            _hashCode += getLastRunPlan().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getResolvedProjection() != null) {
            _hashCode += getResolvedProjection().hashCode();
        }
        if (getRemoteInstances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoteInstances());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoteInstances(), i);
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
        new org.apache.axis.description.TypeDesc(WSSynchronizationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsItemPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsItemPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localRevisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localRevisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRunPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastRunPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedProjection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolvedProjection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationItem>remoteInstances"));
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

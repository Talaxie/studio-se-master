/**
 * WSExecuteStoredProcedure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSExecuteStoredProcedure  implements java.io.Serializable {
    private org.talend.mdm.webservice.WSStoredProcedurePK wsStoredProcedurePK;

    private java.lang.String revisionID;

    private org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK;

    private java.lang.String[] parameters;

    public WSExecuteStoredProcedure() {
    }

    public WSExecuteStoredProcedure(
           org.talend.mdm.webservice.WSStoredProcedurePK wsStoredProcedurePK,
           java.lang.String revisionID,
           org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK,
           java.lang.String[] parameters) {
           this.wsStoredProcedurePK = wsStoredProcedurePK;
           this.revisionID = revisionID;
           this.wsDataClusterPK = wsDataClusterPK;
           this.parameters = parameters;
    }


    /**
     * Gets the wsStoredProcedurePK value for this WSExecuteStoredProcedure.
     * 
     * @return wsStoredProcedurePK
     */
    public org.talend.mdm.webservice.WSStoredProcedurePK getWsStoredProcedurePK() {
        return wsStoredProcedurePK;
    }


    /**
     * Sets the wsStoredProcedurePK value for this WSExecuteStoredProcedure.
     * 
     * @param wsStoredProcedurePK
     */
    public void setWsStoredProcedurePK(org.talend.mdm.webservice.WSStoredProcedurePK wsStoredProcedurePK) {
        this.wsStoredProcedurePK = wsStoredProcedurePK;
    }


    /**
     * Gets the revisionID value for this WSExecuteStoredProcedure.
     * 
     * @return revisionID
     */
    public java.lang.String getRevisionID() {
        return revisionID;
    }


    /**
     * Sets the revisionID value for this WSExecuteStoredProcedure.
     * 
     * @param revisionID
     */
    public void setRevisionID(java.lang.String revisionID) {
        this.revisionID = revisionID;
    }


    /**
     * Gets the wsDataClusterPK value for this WSExecuteStoredProcedure.
     * 
     * @return wsDataClusterPK
     */
    public org.talend.mdm.webservice.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }


    /**
     * Sets the wsDataClusterPK value for this WSExecuteStoredProcedure.
     * 
     * @param wsDataClusterPK
     */
    public void setWsDataClusterPK(org.talend.mdm.webservice.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }


    /**
     * Gets the parameters value for this WSExecuteStoredProcedure.
     * 
     * @return parameters
     */
    public java.lang.String[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this WSExecuteStoredProcedure.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String[] parameters) {
        this.parameters = parameters;
    }

    public java.lang.String getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, java.lang.String _value) {
        this.parameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSExecuteStoredProcedure)) return false;
        WSExecuteStoredProcedure other = (WSExecuteStoredProcedure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wsStoredProcedurePK==null && other.getWsStoredProcedurePK()==null) || 
             (this.wsStoredProcedurePK!=null &&
              this.wsStoredProcedurePK.equals(other.getWsStoredProcedurePK()))) &&
            ((this.revisionID==null && other.getRevisionID()==null) || 
             (this.revisionID!=null &&
              this.revisionID.equals(other.getRevisionID()))) &&
            ((this.wsDataClusterPK==null && other.getWsDataClusterPK()==null) || 
             (this.wsDataClusterPK!=null &&
              this.wsDataClusterPK.equals(other.getWsDataClusterPK()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters())));
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
        if (getWsStoredProcedurePK() != null) {
            _hashCode += getWsStoredProcedurePK().hashCode();
        }
        if (getRevisionID() != null) {
            _hashCode += getRevisionID().hashCode();
        }
        if (getWsDataClusterPK() != null) {
            _hashCode += getWsDataClusterPK().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
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
        new org.apache.axis.description.TypeDesc(WSExecuteStoredProcedure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteStoredProcedure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsStoredProcedurePK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsStoredProcedurePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revisionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsDataClusterPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsDataClusterPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

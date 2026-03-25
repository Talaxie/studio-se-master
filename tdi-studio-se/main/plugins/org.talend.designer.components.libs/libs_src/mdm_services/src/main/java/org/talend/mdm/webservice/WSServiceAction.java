/**
 * WSServiceAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSServiceAction  implements java.io.Serializable {
    private java.lang.String jndiName;

    private org.talend.mdm.webservice.WSServiceActionCode wsAction;

    private java.lang.String methodName;

    private java.lang.String[] methodParameters;

    public WSServiceAction() {
    }

    public WSServiceAction(
           java.lang.String jndiName,
           org.talend.mdm.webservice.WSServiceActionCode wsAction,
           java.lang.String methodName,
           java.lang.String[] methodParameters) {
           this.jndiName = jndiName;
           this.wsAction = wsAction;
           this.methodName = methodName;
           this.methodParameters = methodParameters;
    }


    /**
     * Gets the jndiName value for this WSServiceAction.
     * 
     * @return jndiName
     */
    public java.lang.String getJndiName() {
        return jndiName;
    }


    /**
     * Sets the jndiName value for this WSServiceAction.
     * 
     * @param jndiName
     */
    public void setJndiName(java.lang.String jndiName) {
        this.jndiName = jndiName;
    }


    /**
     * Gets the wsAction value for this WSServiceAction.
     * 
     * @return wsAction
     */
    public org.talend.mdm.webservice.WSServiceActionCode getWsAction() {
        return wsAction;
    }


    /**
     * Sets the wsAction value for this WSServiceAction.
     * 
     * @param wsAction
     */
    public void setWsAction(org.talend.mdm.webservice.WSServiceActionCode wsAction) {
        this.wsAction = wsAction;
    }


    /**
     * Gets the methodName value for this WSServiceAction.
     * 
     * @return methodName
     */
    public java.lang.String getMethodName() {
        return methodName;
    }


    /**
     * Sets the methodName value for this WSServiceAction.
     * 
     * @param methodName
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }


    /**
     * Gets the methodParameters value for this WSServiceAction.
     * 
     * @return methodParameters
     */
    public java.lang.String[] getMethodParameters() {
        return methodParameters;
    }


    /**
     * Sets the methodParameters value for this WSServiceAction.
     * 
     * @param methodParameters
     */
    public void setMethodParameters(java.lang.String[] methodParameters) {
        this.methodParameters = methodParameters;
    }

    public java.lang.String getMethodParameters(int i) {
        return this.methodParameters[i];
    }

    public void setMethodParameters(int i, java.lang.String _value) {
        this.methodParameters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSServiceAction)) return false;
        WSServiceAction other = (WSServiceAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jndiName==null && other.getJndiName()==null) || 
             (this.jndiName!=null &&
              this.jndiName.equals(other.getJndiName()))) &&
            ((this.wsAction==null && other.getWsAction()==null) || 
             (this.wsAction!=null &&
              this.wsAction.equals(other.getWsAction()))) &&
            ((this.methodName==null && other.getMethodName()==null) || 
             (this.methodName!=null &&
              this.methodName.equals(other.getMethodName()))) &&
            ((this.methodParameters==null && other.getMethodParameters()==null) || 
             (this.methodParameters!=null &&
              java.util.Arrays.equals(this.methodParameters, other.getMethodParameters())));
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
        if (getJndiName() != null) {
            _hashCode += getJndiName().hashCode();
        }
        if (getWsAction() != null) {
            _hashCode += getWsAction().hashCode();
        }
        if (getMethodName() != null) {
            _hashCode += getMethodName().hashCode();
        }
        if (getMethodParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethodParameters(), i);
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
        new org.apache.axis.description.TypeDesc(WSServiceAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jndiName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jndiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceActionCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methodParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

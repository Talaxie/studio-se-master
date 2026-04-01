/**
 * WSSynchronizationPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class WSSynchronizationPlan  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String remoteSystemName;

    private java.lang.String remoteSystemURL;

    private java.lang.String remoteSystemUsername;

    private java.lang.String remoteSystemPassword;

    private java.lang.String tisURL;

    private java.lang.String tisUsername;

    private java.lang.String tisPassword;

    private java.lang.String tisParameters;

    private org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations;

    private org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations;

    public WSSynchronizationPlan() {
    }

    public WSSynchronizationPlan(
           java.lang.String name,
           java.lang.String description,
           java.lang.String remoteSystemName,
           java.lang.String remoteSystemURL,
           java.lang.String remoteSystemUsername,
           java.lang.String remoteSystemPassword,
           java.lang.String tisURL,
           java.lang.String tisUsername,
           java.lang.String tisPassword,
           java.lang.String tisParameters,
           org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations,
           org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations) {
           this.name = name;
           this.description = description;
           this.remoteSystemName = remoteSystemName;
           this.remoteSystemURL = remoteSystemURL;
           this.remoteSystemUsername = remoteSystemUsername;
           this.remoteSystemPassword = remoteSystemPassword;
           this.tisURL = tisURL;
           this.tisUsername = tisUsername;
           this.tisPassword = tisPassword;
           this.tisParameters = tisParameters;
           this.xtentisObjectsSynchronizations = xtentisObjectsSynchronizations;
           this.itemsSynchronizations = itemsSynchronizations;
    }


    /**
     * Gets the name value for this WSSynchronizationPlan.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSSynchronizationPlan.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this WSSynchronizationPlan.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WSSynchronizationPlan.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the remoteSystemName value for this WSSynchronizationPlan.
     * 
     * @return remoteSystemName
     */
    public java.lang.String getRemoteSystemName() {
        return remoteSystemName;
    }


    /**
     * Sets the remoteSystemName value for this WSSynchronizationPlan.
     * 
     * @param remoteSystemName
     */
    public void setRemoteSystemName(java.lang.String remoteSystemName) {
        this.remoteSystemName = remoteSystemName;
    }


    /**
     * Gets the remoteSystemURL value for this WSSynchronizationPlan.
     * 
     * @return remoteSystemURL
     */
    public java.lang.String getRemoteSystemURL() {
        return remoteSystemURL;
    }


    /**
     * Sets the remoteSystemURL value for this WSSynchronizationPlan.
     * 
     * @param remoteSystemURL
     */
    public void setRemoteSystemURL(java.lang.String remoteSystemURL) {
        this.remoteSystemURL = remoteSystemURL;
    }


    /**
     * Gets the remoteSystemUsername value for this WSSynchronizationPlan.
     * 
     * @return remoteSystemUsername
     */
    public java.lang.String getRemoteSystemUsername() {
        return remoteSystemUsername;
    }


    /**
     * Sets the remoteSystemUsername value for this WSSynchronizationPlan.
     * 
     * @param remoteSystemUsername
     */
    public void setRemoteSystemUsername(java.lang.String remoteSystemUsername) {
        this.remoteSystemUsername = remoteSystemUsername;
    }


    /**
     * Gets the remoteSystemPassword value for this WSSynchronizationPlan.
     * 
     * @return remoteSystemPassword
     */
    public java.lang.String getRemoteSystemPassword() {
        return remoteSystemPassword;
    }


    /**
     * Sets the remoteSystemPassword value for this WSSynchronizationPlan.
     * 
     * @param remoteSystemPassword
     */
    public void setRemoteSystemPassword(java.lang.String remoteSystemPassword) {
        this.remoteSystemPassword = remoteSystemPassword;
    }


    /**
     * Gets the tisURL value for this WSSynchronizationPlan.
     * 
     * @return tisURL
     */
    public java.lang.String getTisURL() {
        return tisURL;
    }


    /**
     * Sets the tisURL value for this WSSynchronizationPlan.
     * 
     * @param tisURL
     */
    public void setTisURL(java.lang.String tisURL) {
        this.tisURL = tisURL;
    }


    /**
     * Gets the tisUsername value for this WSSynchronizationPlan.
     * 
     * @return tisUsername
     */
    public java.lang.String getTisUsername() {
        return tisUsername;
    }


    /**
     * Sets the tisUsername value for this WSSynchronizationPlan.
     * 
     * @param tisUsername
     */
    public void setTisUsername(java.lang.String tisUsername) {
        this.tisUsername = tisUsername;
    }


    /**
     * Gets the tisPassword value for this WSSynchronizationPlan.
     * 
     * @return tisPassword
     */
    public java.lang.String getTisPassword() {
        return tisPassword;
    }


    /**
     * Sets the tisPassword value for this WSSynchronizationPlan.
     * 
     * @param tisPassword
     */
    public void setTisPassword(java.lang.String tisPassword) {
        this.tisPassword = tisPassword;
    }


    /**
     * Gets the tisParameters value for this WSSynchronizationPlan.
     * 
     * @return tisParameters
     */
    public java.lang.String getTisParameters() {
        return tisParameters;
    }


    /**
     * Sets the tisParameters value for this WSSynchronizationPlan.
     * 
     * @param tisParameters
     */
    public void setTisParameters(java.lang.String tisParameters) {
        this.tisParameters = tisParameters;
    }


    /**
     * Gets the xtentisObjectsSynchronizations value for this WSSynchronizationPlan.
     * 
     * @return xtentisObjectsSynchronizations
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations[] getXtentisObjectsSynchronizations() {
        return xtentisObjectsSynchronizations;
    }


    /**
     * Sets the xtentisObjectsSynchronizations value for this WSSynchronizationPlan.
     * 
     * @param xtentisObjectsSynchronizations
     */
    public void setXtentisObjectsSynchronizations(org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations[] xtentisObjectsSynchronizations) {
        this.xtentisObjectsSynchronizations = xtentisObjectsSynchronizations;
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations getXtentisObjectsSynchronizations(int i) {
        return this.xtentisObjectsSynchronizations[i];
    }

    public void setXtentisObjectsSynchronizations(int i, org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations _value) {
        this.xtentisObjectsSynchronizations[i] = _value;
    }


    /**
     * Gets the itemsSynchronizations value for this WSSynchronizationPlan.
     * 
     * @return itemsSynchronizations
     */
    public org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations[] getItemsSynchronizations() {
        return itemsSynchronizations;
    }


    /**
     * Sets the itemsSynchronizations value for this WSSynchronizationPlan.
     * 
     * @param itemsSynchronizations
     */
    public void setItemsSynchronizations(org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations[] itemsSynchronizations) {
        this.itemsSynchronizations = itemsSynchronizations;
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations getItemsSynchronizations(int i) {
        return this.itemsSynchronizations[i];
    }

    public void setItemsSynchronizations(int i, org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations _value) {
        this.itemsSynchronizations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSSynchronizationPlan)) return false;
        WSSynchronizationPlan other = (WSSynchronizationPlan) obj;
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
            ((this.remoteSystemName==null && other.getRemoteSystemName()==null) || 
             (this.remoteSystemName!=null &&
              this.remoteSystemName.equals(other.getRemoteSystemName()))) &&
            ((this.remoteSystemURL==null && other.getRemoteSystemURL()==null) || 
             (this.remoteSystemURL!=null &&
              this.remoteSystemURL.equals(other.getRemoteSystemURL()))) &&
            ((this.remoteSystemUsername==null && other.getRemoteSystemUsername()==null) || 
             (this.remoteSystemUsername!=null &&
              this.remoteSystemUsername.equals(other.getRemoteSystemUsername()))) &&
            ((this.remoteSystemPassword==null && other.getRemoteSystemPassword()==null) || 
             (this.remoteSystemPassword!=null &&
              this.remoteSystemPassword.equals(other.getRemoteSystemPassword()))) &&
            ((this.tisURL==null && other.getTisURL()==null) || 
             (this.tisURL!=null &&
              this.tisURL.equals(other.getTisURL()))) &&
            ((this.tisUsername==null && other.getTisUsername()==null) || 
             (this.tisUsername!=null &&
              this.tisUsername.equals(other.getTisUsername()))) &&
            ((this.tisPassword==null && other.getTisPassword()==null) || 
             (this.tisPassword!=null &&
              this.tisPassword.equals(other.getTisPassword()))) &&
            ((this.tisParameters==null && other.getTisParameters()==null) || 
             (this.tisParameters!=null &&
              this.tisParameters.equals(other.getTisParameters()))) &&
            ((this.xtentisObjectsSynchronizations==null && other.getXtentisObjectsSynchronizations()==null) || 
             (this.xtentisObjectsSynchronizations!=null &&
              java.util.Arrays.equals(this.xtentisObjectsSynchronizations, other.getXtentisObjectsSynchronizations()))) &&
            ((this.itemsSynchronizations==null && other.getItemsSynchronizations()==null) || 
             (this.itemsSynchronizations!=null &&
              java.util.Arrays.equals(this.itemsSynchronizations, other.getItemsSynchronizations())));
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
        if (getRemoteSystemName() != null) {
            _hashCode += getRemoteSystemName().hashCode();
        }
        if (getRemoteSystemURL() != null) {
            _hashCode += getRemoteSystemURL().hashCode();
        }
        if (getRemoteSystemUsername() != null) {
            _hashCode += getRemoteSystemUsername().hashCode();
        }
        if (getRemoteSystemPassword() != null) {
            _hashCode += getRemoteSystemPassword().hashCode();
        }
        if (getTisURL() != null) {
            _hashCode += getTisURL().hashCode();
        }
        if (getTisUsername() != null) {
            _hashCode += getTisUsername().hashCode();
        }
        if (getTisPassword() != null) {
            _hashCode += getTisPassword().hashCode();
        }
        if (getTisParameters() != null) {
            _hashCode += getTisParameters().hashCode();
        }
        if (getXtentisObjectsSynchronizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXtentisObjectsSynchronizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXtentisObjectsSynchronizations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemsSynchronizations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemsSynchronizations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsSynchronizations(), i);
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
        new org.apache.axis.description.TypeDesc(WSSynchronizationPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlan"));
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
        elemField.setFieldName("remoteSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSystemURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSystemURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSystemUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSystemUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSystemPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteSystemPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tisURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tisURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tisUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tisUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tisPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tisPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tisParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tisParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xtentisObjectsSynchronizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xtentisObjectsSynchronizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>xtentisObjectsSynchronizations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsSynchronizations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemsSynchronizations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>itemsSynchronizations"));
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

/**
 * XtentisBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.talend.mdm.webservice;

public class XtentisBindingStub extends org.apache.axis.client.Stub implements org.talend.mdm.webservice.XtentisPort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[204];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
        _initOperationDesc21();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getComponentVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetComponentVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetComponentVersion"), org.talend.mdm.webservice.WSGetComponentVersion.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersion"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersion"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPing"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPing"), org.talend.mdm.webservice.WSPing.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refreshCache");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRefreshCache"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRefreshCache"), org.talend.mdm.webservice.WSRefreshCache.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLogout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLogout"), org.talend.mdm.webservice.WSLogout.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isXmlDB");
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDigest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigestKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigestKey"), org.talend.mdm.webservice.WSDigestKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigest"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDigest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigest"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDigest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigest"), org.talend.mdm.webservice.WSDigest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSLong"));
        oper.setReturnClass(org.talend.mdm.webservice.WSLong.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLong"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putMatchRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMatchRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMatchRule"), org.talend.mdm.webservice.WSPutMatchRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMatchRulePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMatchRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMatchRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMatchRule"), org.talend.mdm.webservice.WSDeleteMatchRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMatchRulePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("initMDM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInitData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInitData"), org.talend.mdm.webservice.WSInitData.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInt"));
        oper.setReturnClass(org.talend.mdm.webservice.WSInt.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInt"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataModelPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataModelPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataModelPKs"), org.talend.mdm.webservice.WSRegexDataModelPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataModelPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsDataModelPKs"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataModel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataModel"), org.talend.mdm.webservice.WSGetDataModel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModel"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataModel.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModel"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsDataModel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataModel"), org.talend.mdm.webservice.WSExistsDataModel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putDataModel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataModel"), org.talend.mdm.webservice.WSPutDataModel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataModelPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDataModel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataModel"), org.talend.mdm.webservice.WSDeleteDataModel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataModelPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckSchema"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckSchema"), org.talend.mdm.webservice.WSCheckSchema.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteBusinessConcept");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteBusinessConcept"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteBusinessConcept"), org.talend.mdm.webservice.WSDeleteBusinessConcept.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBusinessConcepts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConcepts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConcepts"), org.talend.mdm.webservice.WSGetBusinessConcepts.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putBusinessConcept");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConcept"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConcept"), org.talend.mdm.webservice.WSPutBusinessConcept.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putBusinessConceptSchema");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConceptSchema"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConceptSchema"), org.talend.mdm.webservice.WSPutBusinessConceptSchema.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBusinessConceptKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptKey"), org.talend.mdm.webservice.WSGetBusinessConceptKey.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptKey"));
        oper.setReturnClass(org.talend.mdm.webservice.WSConceptKey.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptKey"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataClusterPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataClusterPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataClusterPKs"), org.talend.mdm.webservice.WSRegexDataClusterPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataClusterPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsDataClusterPKs"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataCluster"), org.talend.mdm.webservice.WSGetDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataCluster"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataCluster.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataCluster"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataCluster"), org.talend.mdm.webservice.WSExistsDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsDBDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDBDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDBDataCluster"), org.talend.mdm.webservice.WSExistsDBDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataCluster"), org.talend.mdm.webservice.WSPutDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataClusterPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putDBDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDBDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDBDataCluster"), org.talend.mdm.webservice.WSPutDBDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataCluster"), org.talend.mdm.webservice.WSDeleteDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDataClusterPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConceptsInDataCluster");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataCluster"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataCluster"), org.talend.mdm.webservice.WSGetConceptsInDataCluster.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getConceptsInDataClusterWithRevisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataClusterWithRevisions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataClusterWithRevisions"), org.talend.mdm.webservice.WSGetConceptsInDataClusterWithRevisions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptRevisionMap"));
        oper.setReturnClass(org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptRevisionMap"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "mapEntry"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getViewPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetViewPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetViewPKs"), org.talend.mdm.webservice.WSGetViewPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSViewPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsViewPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetView"), org.talend.mdm.webservice.WSGetView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSView"));
        oper.setReturnClass(org.talend.mdm.webservice.WSView.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSView"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsView"), org.talend.mdm.webservice.WSExistsView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutView"), org.talend.mdm.webservice.WSPutView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSViewPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteView"), org.talend.mdm.webservice.WSDeleteView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSViewPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBusinessConceptValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptValue"), org.talend.mdm.webservice.WSGetBusinessConceptValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFullPathValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetFullPathValues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetFullPathValues"), org.talend.mdm.webservice.WSGetFullPathValues.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItem"), org.talend.mdm.webservice.WSGetItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItem"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItem"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsItem"), org.talend.mdm.webservice.WSExistsItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItems"), org.talend.mdm.webservice.WSGetItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemsSort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsSort"), org.talend.mdm.webservice.WSGetItemsSort.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemPKsByCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByCriteria"), org.talend.mdm.webservice.WSGetItemPKsByCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKsByCriteriaResponse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKsByCriteriaResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemPKsByFullCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByFullCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByFullCriteria"), org.talend.mdm.webservice.WSGetItemPKsByFullCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKsByCriteriaResponse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKsByCriteriaResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "results"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("countItemsByCustomFKFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCountItemsByCustomFKFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCountItemsByCustomFKFilters"), org.talend.mdm.webservice.WSCountItemsByCustomFKFilters.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemsByCustomFKFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsByCustomFKFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsByCustomFKFilters"), org.talend.mdm.webservice.WSGetItemsByCustomFKFilters.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("viewSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewSearch"), org.talend.mdm.webservice.WSViewSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xPathsSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSXPathsSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSXPathsSearch"), org.talend.mdm.webservice.WSXPathsSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemsPivotIndex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsPivotIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsPivotIndex"), org.talend.mdm.webservice.WSGetItemsPivotIndex.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildrenItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetChildrenItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetChildrenItems"), org.talend.mdm.webservice.WSGetChildrenItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCount"), org.talend.mdm.webservice.WSCount.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("quickSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSQuickSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSQuickSearch"), org.talend.mdm.webservice.WSQuickSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItem"), org.talend.mdm.webservice.WSPutItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateItemMetadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateMetadataItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateMetadataItem"), org.talend.mdm.webservice.WSUpdateMetadataItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("partialPutItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPartialPutItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPartialPutItem"), org.talend.mdm.webservice.WSPartialPutItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItemByOperatorType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemByOperatorType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemByOperatorType"), org.talend.mdm.webservice.WSPutItemByOperatorType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItemArray");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemArray"), org.talend.mdm.webservice.WSPutItem[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "wsPutItem"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateItemArrayMetadata");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateItemArrayMetadata"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateItemArrayMetadata"), org.talend.mdm.webservice.WSUpdateMetadataItem[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "wsUpdateMetadataItem"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItemWithReportArray");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReportArray"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReportArray"), org.talend.mdm.webservice.WSPutItemWithReport[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "wsPutItem"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItemWithReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReport"), org.talend.mdm.webservice.WSPutItemWithReport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putItemWithCustomReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithCustomReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithCustomReport"), org.talend.mdm.webservice.WSPutItemWithCustomReport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isItemModifiedByOther");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSIsItemModifiedByOther"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSIsItemModifiedByOther"), org.talend.mdm.webservice.WSIsItemModifiedByOther.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("extractUsingTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformer"), org.talend.mdm.webservice.WSExtractUsingTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        oper.setReturnClass(org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("extractUsingTransformerThruView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformerThruView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformerThruView"), org.talend.mdm.webservice.WSExtractUsingTransformerThruView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        oper.setReturnClass(org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItem"), org.talend.mdm.webservice.WSDeleteItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteItemWithReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItemWithReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItemWithReport"), org.talend.mdm.webservice.WSDeleteItemWithReport.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItems"), org.talend.mdm.webservice.WSDeleteItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInt"));
        oper.setReturnClass(org.talend.mdm.webservice.WSInt.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInt"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dropItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDropItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDropItem"), org.talend.mdm.webservice.WSDropItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDroppedItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("runQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRunQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRunQuery"), org.talend.mdm.webservice.WSRunQuery.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("connectorInteraction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteraction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteraction"), org.talend.mdm.webservice.WSConnectorInteraction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteractionResponse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSConnectorInteractionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteractionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingRulePKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRulePKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRulePKs"), org.talend.mdm.webservice.WSGetRoutingRulePKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingRulePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRoutingRulePKs"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRule"), org.talend.mdm.webservice.WSGetRoutingRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRule"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingRule.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRule"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsRoutingRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingRule"), org.talend.mdm.webservice.WSExistsRoutingRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putRoutingRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRoutingRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRoutingRule"), org.talend.mdm.webservice.WSPutRoutingRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingRulePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRoutingRule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingRule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingRule"), org.talend.mdm.webservice.WSDeleteRoutingRule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingRulePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("serviceAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceAction"), org.talend.mdm.webservice.WSServiceAction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetConfiguration"), org.talend.mdm.webservice.WSServiceGetConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putServiceConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicePutConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicePutConfiguration"), org.talend.mdm.webservice.WSServicePutConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServicesList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetServicesList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetServicesList"), org.talend.mdm.webservice.WSGetServicesList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicesList"));
        oper.setReturnClass(org.talend.mdm.webservice.WSServicesListItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicesList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Item"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"), org.talend.mdm.webservice.WSString.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetDocument"));
        oper.setReturnClass(org.talend.mdm.webservice.WSServiceGetDocument.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetDocument"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStoredProcedure");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetStoredProcedure"), org.talend.mdm.webservice.WSGetStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedure"));
        oper.setReturnClass(org.talend.mdm.webservice.WSStoredProcedure.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedure"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsStoredProcedure");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsStoredProcedure"), org.talend.mdm.webservice.WSExistsStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStoredProcedurePKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexStoredProcedure"), org.talend.mdm.webservice.WSRegexStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSStoredProcedurePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsStoredProcedurePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putStoredProcedure");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutStoredProcedure"), org.talend.mdm.webservice.WSPutStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSStoredProcedurePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteStoredProcedure");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteStoredProcedure"), org.talend.mdm.webservice.WSDeleteStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSStoredProcedurePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeStoredProcedure");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteStoredProcedure"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteStoredProcedure"), org.talend.mdm.webservice.WSExecuteStoredProcedure.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformer"), org.talend.mdm.webservice.WSGetTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformer"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformer"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformer"), org.talend.mdm.webservice.WSExistsTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPKs"), org.talend.mdm.webservice.WSGetTransformerPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsTransformerPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformer"), org.talend.mdm.webservice.WSPutTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformer"), org.talend.mdm.webservice.WSDeleteTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processBytesUsingTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformer"), org.talend.mdm.webservice.WSProcessBytesUsingTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        oper.setReturnClass(org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processFileUsingTransformer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformer"), org.talend.mdm.webservice.WSProcessFileUsingTransformer.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        oper.setReturnClass(org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "typedContentEntry"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processBytesUsingTransformerAsBackgroundJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformerAsBackgroundJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformerAsBackgroundJob"), org.talend.mdm.webservice.WSProcessBytesUsingTransformerAsBackgroundJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processFileUsingTransformerAsBackgroundJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformerAsBackgroundJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformerAsBackgroundJob"), org.talend.mdm.webservice.WSProcessFileUsingTransformerAsBackgroundJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2"), org.talend.mdm.webservice.WSGetTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerV2"), org.talend.mdm.webservice.WSExistsTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerV2PKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2PKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2PKs"), org.talend.mdm.webservice.WSGetTransformerV2PKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerV2PK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsTransformerV2PK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformerV2"), org.talend.mdm.webservice.WSPutTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerV2PK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformerV2"), org.talend.mdm.webservice.WSDeleteTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerV2PK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2"), org.talend.mdm.webservice.WSExecuteTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerContext.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeTransformerV2AsJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2AsJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2AsJob"), org.talend.mdm.webservice.WSExecuteTransformerV2AsJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("extractThroughTransformerV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractThroughTransformerV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractThroughTransformerV2"), org.talend.mdm.webservice.WSExtractThroughTransformerV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerContext.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsTransformerPluginV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerPluginV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerPluginV2"), org.talend.mdm.webservice.WSExistsTransformerPluginV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerPluginV2Configuration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2GetConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2GetConfiguration"), org.talend.mdm.webservice.WSTransformerPluginV2GetConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putTransformerPluginV2Configuration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2PutConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2PutConfiguration"), org.talend.mdm.webservice.WSTransformerPluginV2PutConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerPluginV2Details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2Details"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2Details"), org.talend.mdm.webservice.WSGetTransformerPluginV2Details.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2Details"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerPluginV2Details.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2Details"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTransformerPluginV2sList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2sList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2sList"), org.talend.mdm.webservice.WSGetTransformerPluginV2SList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2sList"));
        oper.setReturnClass(org.talend.mdm.webservice.WSTransformerPluginV2SListItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2sList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Item"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRole"), org.talend.mdm.webservice.WSGetRole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRole"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRole"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRole"), org.talend.mdm.webservice.WSExistsRole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRolePKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRolePKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRolePKs"), org.talend.mdm.webservice.WSGetRolePKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRolePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRolePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRole"), org.talend.mdm.webservice.WSPutRole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRolePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRole"), org.talend.mdm.webservice.WSDeleteRole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRolePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getObjectsForRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForRoles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForRoles"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "regex"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomForm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomForm"), org.talend.mdm.webservice.WSGetCustomForm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomForm"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCustomForm.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomForm"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsCustomForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsCustomForm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsCustomForm"), org.talend.mdm.webservice.WSExistsCustomForm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomFormPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomFormPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomFormPKs"), org.talend.mdm.webservice.WSGetCustomFormPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCustomFormPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsCustomFormPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putCustomForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutCustomForm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutCustomForm"), org.talend.mdm.webservice.WSPutCustomForm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCustomFormPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCustomForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteCustomForm"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteCustomForm"), org.talend.mdm.webservice.WSDeleteCustomForm.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCustomFormPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenu"), org.talend.mdm.webservice.WSGetMenu.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenu"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMenu.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenu"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsMenu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsMenu"), org.talend.mdm.webservice.WSExistsMenu.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMenuPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenuPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenuPKs"), org.talend.mdm.webservice.WSGetMenuPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMenuPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsMenuPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMenu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMenu"), org.talend.mdm.webservice.WSPutMenu.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMenuPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMenu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMenu"), org.talend.mdm.webservice.WSDeleteMenu.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMenuPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningCommitItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningCommitItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningCommitItems"), org.talend.mdm.webservice.WSVersioningCommitItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningRestoreItemByRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItemByRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItemByRevision"), org.talend.mdm.webservice.WSVersioningRestoreItemByRevision.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetItemHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemHistory"), org.talend.mdm.webservice.WSVersioningGetItemHistory.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemHistory"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningItemHistory.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemHistory"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetItemsVersions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemsVersions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemsVersions"), org.talend.mdm.webservice.WSVersioningGetItemsVersions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemsVersions"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningItemsVersionsItems[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemsVersions"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "items"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetItemContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemContent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemContent"), org.talend.mdm.webservice.WSVersioningGetItemContent.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetObjectsVersions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetObjectsVersions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetObjectsVersions"), org.talend.mdm.webservice.WSVersioningGetObjectsVersions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningObjectsVersions"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningObjectsVersions"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "objects"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetUniverseVersions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetUniverseVersions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetUniverseVersions"), org.talend.mdm.webservice.WSVersioningGetUniverseVersions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningUniverseVersions"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningUniverseVersions"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "tagStructure"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersioningSystemConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetVersioningSystemConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetVersioningSystemConfiguration"), org.talend.mdm.webservice.WSGetVersioningSystemConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningSystemConfiguration"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningSystemConfiguration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningSystemConfiguration"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putVersioningSystemConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutVersioningSystemConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutVersioningSystemConfiguration"), org.talend.mdm.webservice.WSPutVersioningSystemConfiguration.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningGetInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetInfo"), org.talend.mdm.webservice.WSVersioningGetInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningInfo"));
        oper.setReturnClass(org.talend.mdm.webservice.WSVersioningInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningInfo"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningTagObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagObjects"), org.talend.mdm.webservice.WSVersioningTagObjects.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningTagUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagUniverse"), org.talend.mdm.webservice.WSVersioningTagUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningTagItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagItems"), org.talend.mdm.webservice.WSVersioningTagItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningRestoreObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreObjects"), org.talend.mdm.webservice.WSVersioningRestoreObjects.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningRestoreUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreUniverse"), org.talend.mdm.webservice.WSVersioningRestoreUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versioningRestoreItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItems"), org.talend.mdm.webservice.WSVersioningRestoreItems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findBackgroundJobPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindBackgroundJobPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindBackgroundJobPKs"), org.talend.mdm.webservice.WSFindBackgroundJobPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBackgroundJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBackgroundJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBackgroundJob"), org.talend.mdm.webservice.WSGetBackgroundJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJob"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJob.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJob"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putBackgroundJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBackgroundJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBackgroundJob"), org.talend.mdm.webservice.WSPutBackgroundJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBackgroundJobPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2"), org.talend.mdm.webservice.WSGetRoutingOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsRoutingOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingOrderV2"), org.talend.mdm.webservice.WSExistsRoutingOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRoutingOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingOrderV2"), org.talend.mdm.webservice.WSDeleteRoutingOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2PK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeRoutingOrderV2Asynchronously");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Asynchronously"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Asynchronously"), org.talend.mdm.webservice.WSExecuteRoutingOrderV2Asynchronously.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2PK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeRoutingOrderV2Synchronously");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Synchronously"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Synchronously"), org.talend.mdm.webservice.WSExecuteRoutingOrderV2Synchronously.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingOrderV2PKsByCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2PKsByCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2PKsByCriteria"), org.talend.mdm.webservice.WSGetRoutingOrderV2PKsByCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2PK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRoutingOrder"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingOrderV2sByCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2sByCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2sByCriteria"), org.talend.mdm.webservice.WSGetRoutingOrderV2SByCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Array"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Array"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRoutingOrder"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRoutingOrderV2ByCriteriaWithPaging");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2ByCriteriaWithPaging"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2ByCriteriaWithPaging"), org.talend.mdm.webservice.WSGetRoutingOrderV2ByCriteriaWithPaging.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Array"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingOrderV2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Array"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRoutingOrder"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("routeItemV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRouteItemV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRouteItemV2"), org.talend.mdm.webservice.WSRouteItemV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingRulePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsRoutingRulePKs"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("routingEngineV2Action");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Action"), org.talend.mdm.webservice.WSRoutingEngineV2Action.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Status"));
        oper.setReturnClass(org.talend.mdm.webservice.WSRoutingEngineV2Status.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Status"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverse"), org.talend.mdm.webservice.WSGetUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniverse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsUniverse"), org.talend.mdm.webservice.WSExistsUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniversePKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniversePKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniversePKs"), org.talend.mdm.webservice.WSGetUniversePKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniversePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsUniversePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniverseByRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverseByRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverseByRevision"), org.talend.mdm.webservice.WSGetUniverseByRevision.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniversePK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsUniversePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutUniverse"), org.talend.mdm.webservice.WSPutUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniversePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteUniverse"), org.talend.mdm.webservice.WSDeleteUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniversePK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getObjectsForUniverses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForUniverses"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForUniverses"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "regex"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentUniverse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCurrentUniverse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCurrentUniverse"), org.talend.mdm.webservice.WSGetCurrentUniverse.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSUniverse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlan"), org.talend.mdm.webservice.WSGetSynchronizationPlan.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlan"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationPlan.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlan"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsSynchronizationPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationPlan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationPlan"), org.talend.mdm.webservice.WSExistsSynchronizationPlan.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationPlanPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanPKs"), org.talend.mdm.webservice.WSGetSynchronizationPlanPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationPlanPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsSynchronizationPlanPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putSynchronizationPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationPlan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationPlan"), org.talend.mdm.webservice.WSPutSynchronizationPlan.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationPlanPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSynchronizationPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationPlan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationPlan"), org.talend.mdm.webservice.WSDeleteSynchronizationPlan.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationPlanPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getObjectsForSynchronizationPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForSynchronizationPlans"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForSynchronizationPlans"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "regex"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationPlanObjectsAlgorithms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanObjectsAlgorithms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanObjectsAlgorithms"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "algorithm"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationPlanItemsAlgorithms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanItemsAlgorithms"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanItemsAlgorithms"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "algorithm"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationPlanAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanAction"), org.talend.mdm.webservice.WSSynchronizationPlanAction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatus"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationPlanStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatus"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationGetUnsynchronizedObjectsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedObjectsIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedObjectsIDs"), org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedObjectsIDs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "strings"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationGetObjectXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetObjectXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetObjectXML"), org.talend.mdm.webservice.WSSynchronizationGetObjectXML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationPutObjectXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutObjectXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutObjectXML"), org.talend.mdm.webservice.WSSynchronizationPutObjectXML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationGetUnsynchronizedItemPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedItemPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedItemPKs"), org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedItemPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationGetItemXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetItemXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetItemXML"), org.talend.mdm.webservice.WSSynchronizationGetItemXML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString"));
        oper.setReturnClass(org.talend.mdm.webservice.WSString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSString"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("synchronizationPutItemXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutItemXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutItemXML"), org.talend.mdm.webservice.WSSynchronizationPutItemXML.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItem"), org.talend.mdm.webservice.WSGetSynchronizationItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("existsSynchronizationItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationItem"), org.talend.mdm.webservice.WSExistsSynchronizationItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSynchronizationItemPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItemPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItemPKs"), org.talend.mdm.webservice.WSGetSynchronizationItemPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPKArray"));
        oper.setReturnClass(java.lang.String[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsSynchronizationItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putSynchronizationItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationItem"), org.talend.mdm.webservice.WSPutSynchronizationItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ids"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSynchronizationItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationItem"), org.talend.mdm.webservice.WSDeleteSynchronizationItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "ids"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resolveSynchronizationItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResolveSynchronizationItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResolveSynchronizationItem"), org.talend.mdm.webservice.WSResolveSynchronizationItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
        oper.setReturnClass(org.talend.mdm.webservice.WSSynchronizationItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recoverDroppedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRecoverDroppedItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRecoverDroppedItem"), org.talend.mdm.webservice.WSRecoverDroppedItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAllDroppedItemsPKs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindAllDroppedItemsPKs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindAllDroppedItemsPKs"), org.talend.mdm.webservice.WSFindAllDroppedItemsPKs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPKArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDroppedItemPK[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPKArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsDroppedItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loadDroppedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLoadDroppedItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLoadDroppedItem"), org.talend.mdm.webservice.WSLoadDroppedItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItem"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDroppedItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItem"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDroppedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRemoveDroppedItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRemoveDroppedItem"), org.talend.mdm.webservice.WSRemoveDroppedItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
        oper.setReturnClass(org.talend.mdm.webservice.WSDroppedItemPK.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMDMConfiguration");
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMConfig"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMDMConfig.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMConfig"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkServiceConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigRequest"), org.talend.mdm.webservice.WSCheckServiceConfigRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigResponse"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCheckServiceConfigResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowGetProcessDefinitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessDefinitions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessDefinitions"), org.talend.mdm.webservice.WSWorkflowGetProcessDefinitions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUIDArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUIDArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsWorkflowProcessDefinitions"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowDeploy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeploy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeploy"), org.talend.mdm.webservice.WSWorkflowDeploy.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID"));
        oper.setReturnClass(org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowUnDeploy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowUnDeploy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowUnDeploy"), org.talend.mdm.webservice.WSWorkflowUnDeploy.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowGetTaskList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetTaskList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetTaskList"), org.talend.mdm.webservice.WSWorkflowGetTaskList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstanceArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSProcessTaskInstance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstanceArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wstaskinstance"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowGetProcessInstances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessInstances"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessInstances"), org.talend.mdm.webservice.WSWorkflowGetProcessInstances.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessInstanceArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSProcessInstance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessInstanceArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "instance"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowDeleteProcessInstances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeleteProcessInstancesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeleteProcessInstancesRequest"), org.talend.mdm.webservice.WSWorkflowDeleteProcessInstancesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[192] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowUnassignTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUnassignTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUnassignTask"), org.talend.mdm.webservice.WSUnassignTask.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[193] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowAssignTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAssignTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAssignTask"), org.talend.mdm.webservice.WSAssignTask.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[194] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowSetTaskPriority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSetTaskPriority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSetTaskPriority"), org.talend.mdm.webservice.WSSetTaskPriority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[195] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowSuspendTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSuspendTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSuspendTask"), org.talend.mdm.webservice.WSSuspendTask.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[196] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowResumeTask");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResumeTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResumeTask"), org.talend.mdm.webservice.WSResumeTask.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[197] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("workflowStartProcessInstance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStartProcessInstance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStartProcessInstance"), org.talend.mdm.webservice.WSStartProcessInstance.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[198] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMDMJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMNULL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMNULL"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "mdmjob"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMJobArray"));
        oper.setReturnClass(org.talend.mdm.webservice.WSMDMJob[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMJobArray"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "wsMDMJob"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[199] = oper;

    }

    private static void _initOperationDesc21(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putMDMJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPUTMDMJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPUTMDMJob"), org.talend.mdm.webservice.WSPUTMDMJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[200] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMDMJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDELMDMJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDELMDMJob"), org.talend.mdm.webservice.WSDELMDMJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setReturnClass(org.talend.mdm.webservice.WSBoolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[201] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMDMCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCategoryData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCategoryData"), org.talend.mdm.webservice.WSCategoryData.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCategoryData"));
        oper.setReturnClass(org.talend.mdm.webservice.WSCategoryData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCategoryData"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[202] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoIncrement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAutoIncrement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAutoIncrement"), org.talend.mdm.webservice.WSAutoIncrement.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAutoIncrement"));
        oper.setReturnClass(org.talend.mdm.webservice.WSAutoIncrement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAutoIncrement"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[203] = oper;

    }

    public XtentisBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public XtentisBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public XtentisBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSRole>specification>instance");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoleSpecificationInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSSynchronizationPlan>xtentisObjectsSynchronizations>synchronizations");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizationsSynchronizations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSTransformerContext>pipeline>pipelineItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSConceptRevisionMap>mapEntry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConceptRevisionMapMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSHashMap>entry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSHashMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSItemPKsByCriteriaResponse>results");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSLinkedHashMap>typedContentEntry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSLong");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSMenuEntry>descriptions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMenuEntryDescriptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSOutputDecisionTable>decisions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSOutputDecisionTableDecisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSPipeline>typedContentEntry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPipelineTypedContentEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSRole>specification");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoleSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSServicesList>Item");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServicesListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSString");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationItem>remoteInstances");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationItemRemoteInstances.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>itemsSynchronizations");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanItemsSynchronizations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSSynchronizationPlan>xtentisObjectsSynchronizations");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanXtentisObjectsSynchronizations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSTransformerContext>pipeline");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerContextPipelinePipelineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">>WSTransformerContext>pipeline>pipelineItem");
            qName2 = new javax.xml.namespace.QName("", "pipelineItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSTransformerContext>projectedItemPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItemPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK");
            qName2 = new javax.xml.namespace.QName("", "wsItemPOJOPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSTransformerPluginV2sList>Item");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2SListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSUniverse>itemsRevisionIDs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUniverseItemsRevisionIDs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSUniverse>xtentisObjectsRevisionIDs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUniverseXtentisObjectsRevisionIDs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningItemsVersions>items");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningItemsVersionsItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningObjectsVersions>objects");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningUniverseVersions>tagStructure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "BackgroundJobStatusType");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.BackgroundJobStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAssignTask");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSAssignTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSAutoIncrement");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSAutoIncrement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBackgroundJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBackgroundJobPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBackgroundJobPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBackgroundJobPK");
            qName2 = new javax.xml.namespace.QName("", "wsBackgroundJobPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBase64KeyValue");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBase64KeyValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBoolean");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBoolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBusinessConcept");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBusinessConcept.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSBusinessConceptPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSBusinessConceptPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSByteArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSByteArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCategoryData");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckSchema");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCheckSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigRequest");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCheckServiceConfigRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCheckServiceConfigResponse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCheckServiceConfigResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSComponent");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptKey");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConceptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConceptRevisionMap");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSConceptRevisionMap>mapEntry");
            qName2 = new javax.xml.namespace.QName("", "mapEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorFunction");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConnectorFunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteraction");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConnectorInteraction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorInteractionResponse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConnectorInteractionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSConnectorResponseCode");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSConnectorResponseCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCount");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCountItemsByCustomFKFilters");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCountItemsByCustomFKFilters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomForm");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCustomForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCustomFormPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSCustomFormPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSCustomFormPK");
            qName2 = new javax.xml.namespace.QName("", "wsCustomFormPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataClusterPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataClusterPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK");
            qName2 = new javax.xml.namespace.QName("", "wsDataClusterPKs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModel");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataModelPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDataModelPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDataModelPK");
            qName2 = new javax.xml.namespace.QName("", "wsDataModelPKs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteBusinessConcept");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteBusinessConcept.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteCustomForm");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteCustomForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteDataModel");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteDataModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteItemWithReport");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteItemWithReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMatchRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteMatchRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteMenu");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRole");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingOrderV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteRoutingOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteRoutingRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteRoutingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteSynchronizationPlan");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteSynchronizationPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDeleteView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDeleteView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDELMDMJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDELMDMJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigest");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDigest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDigestKey");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDigestKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDropItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDropItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDroppedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDroppedItemPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSDroppedItemPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSDroppedItemPK");
            qName2 = new javax.xml.namespace.QName("", "wsDroppedItemPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Asynchronously");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExecuteRoutingOrderV2Asynchronously.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteRoutingOrderV2Synchronously");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExecuteRoutingOrderV2Synchronously.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExecuteStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExecuteTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExecuteTransformerV2AsJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExecuteTransformerV2AsJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsCustomForm");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsCustomForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDataModel");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsDataModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsDBDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsDBDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsMenu");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRole");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingOrderV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsRoutingOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsRoutingRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsRoutingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsSynchronizationPlan");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsSynchronizationPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerPluginV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsTransformerPluginV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExistsView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExistsView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractedContent");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExtractedContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractThroughTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExtractThroughTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExtractUsingTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSExtractUsingTransformerThruView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSExtractUsingTransformerThruView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindAllDroppedItemsPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSFindAllDroppedItemsPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSFindBackgroundJobPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSFindBackgroundJobPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBackgroundJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetBackgroundJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptKey");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetBusinessConceptKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConcepts");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetBusinessConcepts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetBusinessConceptValue");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetBusinessConceptValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetChildrenItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetChildrenItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetComponentVersion");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetComponentVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetConceptsInDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetConceptsInDataClusterWithRevisions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetConceptsInDataClusterWithRevisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCurrentUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetCurrentUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomForm");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetCustomForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetCustomFormPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetCustomFormPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetDataModel");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetDataModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetFullPathValues");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetFullPathValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByCriteria");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItemPKsByCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemPKsByFullCriteria");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItemPKsByFullCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsByCustomFKFilters");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItemsByCustomFKFilters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsPivotIndex");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItemsPivotIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetItemsSort");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetItemsSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenu");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetMenuPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetMenuPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForRoles");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "regex");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForSynchronizationPlans");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "regex");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetObjectsForUniverses");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "regex");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRole");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRolePKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRolePKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2ByCriteriaWithPaging");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingOrderV2ByCriteriaWithPaging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2PKsByCriteria");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingOrderV2PKsByCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingOrderV2sByCriteria");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingOrderV2SByCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetRoutingRulePKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetRoutingRulePKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetServicesList");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetServicesList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationItemPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetSynchronizationItemPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlan");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetSynchronizationPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanItemsAlgorithms");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "algorithm");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanObjectsAlgorithms");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "algorithm");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetSynchronizationPlanPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetSynchronizationPlanPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformerPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2Details");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformerPluginV2Details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerPluginV2sList");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformerPluginV2SList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetTransformerV2PKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetTransformerV2PKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverseByRevision");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetUniverseByRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniverseByRevisionType");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetUniverseByRevisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetUniversePKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetUniversePKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetVersioningSystemConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetVersioningSystemConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSGetViewPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSGetViewPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSHashMap");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSHashMapEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSHashMap>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSI18nString");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSI18NString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInitData");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSInitData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSInt");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSInt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSIsItemModifiedByOther");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSIsItemModifiedByOther.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItemPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItemPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPK");
            qName2 = new javax.xml.namespace.QName("", "wsItemPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSItemPKsByCriteriaResponse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSItemPKsByCriteriaResponse>results");
            qName2 = new javax.xml.namespace.QName("", "results");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSKey");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLanguage");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLinkedHashMap");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLinkedHashMapTypedContentEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSLinkedHashMap>typedContentEntry");
            qName2 = new javax.xml.namespace.QName("", "typedContentEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLoadDroppedItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLoadDroppedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSLogout");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSLogout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMatchRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMatchRulePK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMatchRulePK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMConfig");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMDMConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMDMJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMJobArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMDMJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMJob");
            qName2 = new javax.xml.namespace.QName("", "wsMDMJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMDMNULL");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "mdmjob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenu");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuEntry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMenuEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMenuPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSMenuPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSMenuPK");
            qName2 = new javax.xml.namespace.QName("", "wsMenuPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSOperatorType");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSOutputDecisionTable");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSOutputDecisionTableDecisions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSOutputDecisionTable>decisions");
            qName2 = new javax.xml.namespace.QName("", "decisions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPartialPutItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPartialPutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPing");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPipeline");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSPipeline>typedContentEntry");
            qName2 = new javax.xml.namespace.QName("", "typedContentEntry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessBytesUsingTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessBytesUsingTransformerAsBackgroundJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessBytesUsingTransformerAsBackgroundJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessFileUsingTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessFileUsingTransformerAsBackgroundJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessFileUsingTransformerAsBackgroundJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessInstance");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessInstanceArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessInstance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessInstance");
            qName2 = new javax.xml.namespace.QName("", "instance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstance");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessTaskInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstanceArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSProcessTaskInstance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSProcessTaskInstance");
            qName2 = new javax.xml.namespace.QName("", "wstaskinstance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBackgroundJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutBackgroundJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConcept");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutBusinessConcept.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutBusinessConceptSchema");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutBusinessConceptSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutCustomForm");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutCustomForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDataModel");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutDataModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutDBDataCluster");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutDBDataCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItem");
            qName2 = new javax.xml.namespace.QName("", "wsPutItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemByOperatorType");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItemByOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithCustomReport");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItemWithCustomReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReport");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItemWithReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReportArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutItemWithReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutItemWithReport");
            qName2 = new javax.xml.namespace.QName("", "wsPutItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMatchRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutMatchRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPUTMDMJob");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPUTMDMJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutMenu");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRole");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutRoutingRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutRoutingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutSynchronizationPlan");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutSynchronizationPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutVersioningSystemConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutVersioningSystemConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSPutView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSPutView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSQuickSearch");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSQuickSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRecoverDroppedItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRecoverDroppedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRefreshCache");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRefreshCache.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataClusterPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRegexDataClusterPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexDataModelPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRegexDataModelPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRegexStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRegexStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRemoveDroppedItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRemoveDroppedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResolveSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSResolveSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSResumeTask");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSResumeTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRole");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRolePK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRolePK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRolePK");
            qName2 = new javax.xml.namespace.QName("", "wsRolePK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRouteItemV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRouteItemV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Action");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingEngineV2Action.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2ActionCode");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingEngineV2ActionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2Status");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingEngineV2Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Array");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2");
            qName2 = new javax.xml.namespace.QName("", "wsRoutingOrder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2PK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2PK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2PK");
            qName2 = new javax.xml.namespace.QName("", "wsRoutingOrder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2SearchCriteria");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2SearchCriteriaWithPaging");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2SearchCriteriaWithPaging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingOrderV2Status");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingOrderV2Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRule");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleExpression");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingRuleExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRuleOperator");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingRuleOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingRulePK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRoutingRulePK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRoutingRulePK");
            qName2 = new javax.xml.namespace.QName("", "wsRoutingRulePKs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSRunQuery");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSRunQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceAction");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServiceAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceActionCode");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServiceActionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServiceGetConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServiceGetDocument");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServiceGetDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicePutConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServicePutConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSServicesList");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSServicesListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSServicesList>Item");
            qName2 = new javax.xml.namespace.QName("", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSetTaskPriority");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSetTaskPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStartProcessInstance");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSStartProcessInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedure");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSStoredProcedure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSStoredProcedurePK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSStoredProcedurePK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStoredProcedurePK");
            qName2 = new javax.xml.namespace.QName("", "wsStoredProcedurePK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "strings");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSStringPredicate");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSStringPredicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSuspendTask");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSuspendTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetItemXML");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationGetItemXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetObjectXML");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationGetObjectXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedItemPKs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedItemPKs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationGetUnsynchronizedObjectsIDs");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedObjectsIDs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPKArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemPK");
            qName2 = new javax.xml.namespace.QName("", "wsSynchronizationItemPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationItemStatus");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlan");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanAction");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanActionCode");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanActionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanPK");
            qName2 = new javax.xml.namespace.QName("", "wsSynchronizationPlanPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatus");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPlanStatusCode");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPlanStatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutItemXML");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPutItemXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSSynchronizationPutObjectXML");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSSynchronizationPutObjectXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformer");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerContext");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPK");
            qName2 = new javax.xml.namespace.QName("", "wsTransformerPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginSpec");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginSpec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2Details");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2Details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2GetConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2GetConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2PutConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2PutConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2sList");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2SListItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSTransformerPluginV2sList>Item");
            qName2 = new javax.xml.namespace.QName("", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerPluginV2VariableDescriptor");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerPluginV2VariableDescriptor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerProcessStep");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerProcessStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerV2PK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerV2PK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerV2PK");
            qName2 = new javax.xml.namespace.QName("", "wsTransformerV2PK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTransformerVariablesMapping");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTransformerVariablesMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSTypedContent");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSTypedContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUnassignTask");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUnassignTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUniversePK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUniversePK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUniversePK");
            qName2 = new javax.xml.namespace.QName("", "wsUniversePK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateItemArrayMetadata");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUpdateMetadataItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateMetadataItem");
            qName2 = new javax.xml.namespace.QName("", "wsUpdateMetadataItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSUpdateMetadataItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSUpdateMetadataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersion");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningCommitItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningCommitItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetInfo");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemContent");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetItemContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemHistory");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetItemHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetItemsVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetItemsVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetObjectsVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetObjectsVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningGetUniverseVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningGetUniverseVersions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningHistoryEntry");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningHistoryEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningInfo");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemHistory");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningItemHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningItemsVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningItemsVersionsItems[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningItemsVersions>items");
            qName2 = new javax.xml.namespace.QName("", "items");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningObjectsVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningObjectsVersions>objects");
            qName2 = new javax.xml.namespace.QName("", "objects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItemByRevision");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningRestoreItemByRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningRestoreItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreObjects");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningRestoreObjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningRestoreUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningRestoreUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningSystemConfiguration");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningSystemConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagItems");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningTagItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagObjects");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningTagObjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningTagUniverse");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningTagUniverse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSVersioningUniverseVersions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", ">WSVersioningUniverseVersions>tagStructure");
            qName2 = new javax.xml.namespace.QName("", "tagStructure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSView");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSViewPK.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPKArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSViewPK[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewPK");
            qName2 = new javax.xml.namespace.QName("", "wsViewPK");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSViewSearch");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSViewSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereAnd");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWhereItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem");
            qName2 = new javax.xml.namespace.QName("", "whereItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWhereCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWhereItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereOperator");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWhereOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereOr");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWhereItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWhereItem");
            qName2 = new javax.xml.namespace.QName("", "whereItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeleteProcessInstancesRequest");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowDeleteProcessInstancesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowDeploy");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowDeploy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessDefinitions");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowGetProcessDefinitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetProcessInstances");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowGetProcessInstances.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowGetTaskList");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowGetTaskList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUIDArray");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID");
            qName2 = new javax.xml.namespace.QName("", "wsWorkflowProcessDefinitions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSWorkflowUnDeploy");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSWorkflowUnDeploy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn-com-amalto-xtentis-webservice", "WSXPathsSearch");
            cachedSerQNames.add(qName);
            cls = org.talend.mdm.webservice.WSXPathsSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.talend.mdm.webservice.WSVersion getComponentVersion(org.talend.mdm.webservice.WSGetComponentVersion wsGetComponentVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getComponentVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetComponentVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersion) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString ping(org.talend.mdm.webservice.WSPing wsPing) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPing});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString refreshCache(org.talend.mdm.webservice.WSRefreshCache refreshCache) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "refreshCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {refreshCache});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString logout(org.talend.mdm.webservice.WSLogout wsLogout) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsLogout});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean isXmlDB() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "isXmlDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDigest getDigest(org.talend.mdm.webservice.WSDigestKey wsDigestKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDigest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDigestKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDigest) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDigest) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDigest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSLong updateDigest(org.talend.mdm.webservice.WSDigest wsDigest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateDigest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDigest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSLong) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSLong) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSLong.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMatchRulePK putMatchRule(org.talend.mdm.webservice.WSPutMatchRule rule) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putMatchRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMatchRulePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMatchRulePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMatchRulePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMatchRulePK deleteMatchRule(org.talend.mdm.webservice.WSDeleteMatchRule wsDeleteMatchRuleKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteMatchRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteMatchRuleKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMatchRulePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMatchRulePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMatchRulePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSInt initMDM(org.talend.mdm.webservice.WSInitData initData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "initMDM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {initData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSInt) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSInt) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataModelPK[] getDataModelPKs(org.talend.mdm.webservice.WSRegexDataModelPKs regexp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataModelPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regexp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataModelPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataModelPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataModelPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataModel getDataModel(org.talend.mdm.webservice.WSGetDataModel wsDataModelget) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataModel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataModelget});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataModel) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataModel) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataModel.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsDataModel(org.talend.mdm.webservice.WSExistsDataModel wsDataModelExists) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsDataModel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataModelExists});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataModelPK putDataModel(org.talend.mdm.webservice.WSPutDataModel wsDataModel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putDataModel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataModel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataModelPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataModelPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataModelPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataModelPK deleteDataModel(org.talend.mdm.webservice.WSDeleteDataModel wsDeleteDataModel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteDataModel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteDataModel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataModelPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataModelPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataModelPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString checkSchema(org.talend.mdm.webservice.WSCheckSchema wsSchema) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSchema});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString deleteBusinessConcept(org.talend.mdm.webservice.WSDeleteBusinessConcept wsDeleteBusinessConcept) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteBusinessConcept"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteBusinessConcept});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getBusinessConcepts(org.talend.mdm.webservice.WSGetBusinessConcepts wsGetBusinessConcepts) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBusinessConcepts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetBusinessConcepts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString putBusinessConcept(org.talend.mdm.webservice.WSPutBusinessConcept wsPutBusinessConcept) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putBusinessConcept"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutBusinessConcept});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString putBusinessConceptSchema(org.talend.mdm.webservice.WSPutBusinessConceptSchema wsPutBusinessConceptSchema) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putBusinessConceptSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutBusinessConceptSchema});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSConceptKey getBusinessConceptKey(org.talend.mdm.webservice.WSGetBusinessConceptKey wsGetBusinessConceptKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBusinessConceptKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetBusinessConceptKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSConceptKey) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSConceptKey) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSConceptKey.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataClusterPK[] getDataClusterPKs(org.talend.mdm.webservice.WSRegexDataClusterPKs regexp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataClusterPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regexp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataClusterPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataClusterPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataClusterPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataCluster getDataCluster(org.talend.mdm.webservice.WSGetDataCluster wsDataClusterPK) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataClusterPK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataCluster) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataCluster) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataCluster.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsDataCluster(org.talend.mdm.webservice.WSExistsDataCluster wsExistsDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsDBDataCluster(org.talend.mdm.webservice.WSExistsDBDataCluster wsExistsDBDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsDBDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsDBDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataClusterPK putDataCluster(org.talend.mdm.webservice.WSPutDataCluster wsDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataClusterPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataClusterPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataClusterPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean putDBDataCluster(org.talend.mdm.webservice.WSPutDBDataCluster wsDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putDBDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDataClusterPK deleteDataCluster(org.talend.mdm.webservice.WSDeleteDataCluster wsDeleteDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDataClusterPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDataClusterPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDataClusterPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getConceptsInDataCluster(org.talend.mdm.webservice.WSGetConceptsInDataCluster wsGetConceptsInDataCluster) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConceptsInDataCluster"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetConceptsInDataCluster});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[] getConceptsInDataClusterWithRevisions(org.talend.mdm.webservice.WSGetConceptsInDataClusterWithRevisions wsGetConceptsInDataClusterWithRevisions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getConceptsInDataClusterWithRevisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetConceptsInDataClusterWithRevisions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSConceptRevisionMapMapEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSViewPK[] getViewPKs(org.talend.mdm.webservice.WSGetViewPKs regexp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getViewPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regexp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSViewPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSViewPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSViewPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSView getView(org.talend.mdm.webservice.WSGetView wsViewPK) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsViewPK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSView) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSView) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSView.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsView(org.talend.mdm.webservice.WSExistsView wsViewPK) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsViewPK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSViewPK putView(org.talend.mdm.webservice.WSPutView wsView) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsView});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSViewPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSViewPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSViewPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSViewPK deleteView(org.talend.mdm.webservice.WSDeleteView wsViewDel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsViewDel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSViewPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSViewPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSViewPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString getBusinessConceptValue(org.talend.mdm.webservice.WSGetBusinessConceptValue wsGetBusinessConceptValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBusinessConceptValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetBusinessConceptValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getFullPathValues(org.talend.mdm.webservice.WSGetFullPathValues wsGetFullPathValues) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getFullPathValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetFullPathValues});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItem getItem(org.talend.mdm.webservice.WSGetItem wsGetItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItem) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsItem(org.talend.mdm.webservice.WSExistsItem wsExistsItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getItems(org.talend.mdm.webservice.WSGetItems wsGetItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getItemsSort(org.talend.mdm.webservice.WSGetItemsSort wsGetItemsSort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemsSort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItemsSort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[] getItemPKsByCriteria(org.talend.mdm.webservice.WSGetItemPKsByCriteria wsGetItemPKsByCriteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemPKsByCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItemPKsByCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[] getItemPKsByFullCriteria(org.talend.mdm.webservice.WSGetItemPKsByFullCriteria wsGetItemPKsByFullCriteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemPKsByFullCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItemPKsByFullCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPKsByCriteriaResponseResults[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString countItemsByCustomFKFilters(org.talend.mdm.webservice.WSCountItemsByCustomFKFilters wsCountItemsByCustomFKFilters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "countItemsByCustomFKFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsCountItemsByCustomFKFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getItemsByCustomFKFilters(org.talend.mdm.webservice.WSGetItemsByCustomFKFilters wsGetItemsByCustomFKFilters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemsByCustomFKFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItemsByCustomFKFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] viewSearch(org.talend.mdm.webservice.WSViewSearch wsViewSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "viewSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsViewSearch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] xPathsSearch(org.talend.mdm.webservice.WSXPathsSearch wsXPathsSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "xPathsSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsXPathsSearch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getItemsPivotIndex(org.talend.mdm.webservice.WSGetItemsPivotIndex wsGetItemsPivotIndex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemsPivotIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetItemsPivotIndex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getChildrenItems(org.talend.mdm.webservice.WSGetChildrenItems wsGetChildrenItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getChildrenItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetChildrenItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString count(org.talend.mdm.webservice.WSCount wsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsCount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] quickSearch(org.talend.mdm.webservice.WSQuickSearch wsQuickSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "quickSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsQuickSearch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK putItem(org.talend.mdm.webservice.WSPutItem wsPutItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK updateItemMetadata(org.talend.mdm.webservice.WSUpdateMetadataItem wsUpdateMetadataItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateItemMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUpdateMetadataItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK partialPutItem(org.talend.mdm.webservice.WSPartialPutItem wsPartialPutItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "partialPutItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPartialPutItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK putItemByOperatorType(org.talend.mdm.webservice.WSPutItemByOperatorType putItemByOperatorType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItemByOperatorType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {putItemByOperatorType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK[] putItemArray(org.talend.mdm.webservice.WSPutItem[] wsPutItemArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItemArray"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutItemArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK[] updateItemArrayMetadata(org.talend.mdm.webservice.WSUpdateMetadataItem[] wsUpdateItemArrayMetadata) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateItemArrayMetadata"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUpdateItemArrayMetadata});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK[] putItemWithReportArray(org.talend.mdm.webservice.WSPutItemWithReport[] wsPutItemWithReportArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItemWithReportArray"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutItemWithReportArray});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK putItemWithReport(org.talend.mdm.webservice.WSPutItemWithReport wsPutItemWithReport) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItemWithReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutItemWithReport});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK putItemWithCustomReport(org.talend.mdm.webservice.WSPutItemWithCustomReport wsPutItemWithCustomReport) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putItemWithCustomReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutItemWithCustomReport});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean isItemModifiedByOther(org.talend.mdm.webservice.WSIsItemModifiedByOther wsItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "isItemModifiedByOther"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSPipelineTypedContentEntry[] extractUsingTransformer(org.talend.mdm.webservice.WSExtractUsingTransformer wsExtractUsingTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "extractUsingTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExtractUsingTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSPipelineTypedContentEntry[] extractUsingTransformerThruView(org.talend.mdm.webservice.WSExtractUsingTransformerThruView wsExtractUsingTransformerThruView) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "extractUsingTransformerThruView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExtractUsingTransformerThruView});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK deleteItem(org.talend.mdm.webservice.WSDeleteItem wsDeleteItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString deleteItemWithReport(org.talend.mdm.webservice.WSDeleteItemWithReport wsDeleteItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteItemWithReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSInt deleteItems(org.talend.mdm.webservice.WSDeleteItems wsDeleteItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSInt) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSInt) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDroppedItemPK dropItem(org.talend.mdm.webservice.WSDropItem wsDropItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "dropItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDropItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDroppedItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDroppedItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDroppedItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] runQuery(org.talend.mdm.webservice.WSRunQuery wsRunQuery) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "runQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRunQuery});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSConnectorInteractionResponse connectorInteraction(org.talend.mdm.webservice.WSConnectorInteraction wsConnectorInteraction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "connectorInteraction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsConnectorInteraction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSConnectorInteractionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSConnectorInteractionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSConnectorInteractionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingRulePK[] getRoutingRulePKs(org.talend.mdm.webservice.WSGetRoutingRulePKs regexp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingRulePKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regexp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingRulePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingRulePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingRulePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingRule getRoutingRule(org.talend.mdm.webservice.WSGetRoutingRule wsRoutingRulePK) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoutingRulePK});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingRule) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingRule) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingRule.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsRoutingRule(org.talend.mdm.webservice.WSExistsRoutingRule wsExistsRoutingRule) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsRoutingRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsRoutingRule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingRulePK putRoutingRule(org.talend.mdm.webservice.WSPutRoutingRule wsRoutingRule) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putRoutingRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoutingRule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingRulePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingRulePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingRulePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingRulePK deleteRoutingRule(org.talend.mdm.webservice.WSDeleteRoutingRule wsRoutingRuleDel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteRoutingRule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoutingRuleDel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingRulePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingRulePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingRulePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString serviceAction(org.talend.mdm.webservice.WSServiceAction wsServiceAction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "serviceAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsServiceAction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString getServiceConfiguration(org.talend.mdm.webservice.WSServiceGetConfiguration wsGetConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServiceConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString putServiceConfiguration(org.talend.mdm.webservice.WSServicePutConfiguration wsPutConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putServiceConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSServicesListItem[] getServicesList(org.talend.mdm.webservice.WSGetServicesList wsGetServicesList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServicesList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetServicesList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSServicesListItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSServicesListItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSServicesListItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSServiceGetDocument getServiceDocument(org.talend.mdm.webservice.WSString serviceName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServiceDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSServiceGetDocument) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSServiceGetDocument) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSServiceGetDocument.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSStoredProcedure getStoredProcedure(org.talend.mdm.webservice.WSGetStoredProcedure wsGetStoredProcedure) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getStoredProcedure"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetStoredProcedure});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSStoredProcedure) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSStoredProcedure) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSStoredProcedure.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsStoredProcedure(org.talend.mdm.webservice.WSExistsStoredProcedure wsExistsStoredProcedure) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsStoredProcedure"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsStoredProcedure});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSStoredProcedurePK[] getStoredProcedurePKs(org.talend.mdm.webservice.WSRegexStoredProcedure regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getStoredProcedurePKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSStoredProcedurePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSStoredProcedurePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSStoredProcedurePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSStoredProcedurePK putStoredProcedure(org.talend.mdm.webservice.WSPutStoredProcedure wsStoredProcedure) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putStoredProcedure"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsStoredProcedure});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSStoredProcedurePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSStoredProcedurePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSStoredProcedurePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSStoredProcedurePK deleteStoredProcedure(org.talend.mdm.webservice.WSDeleteStoredProcedure wsStoredProcedureDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteStoredProcedure"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsStoredProcedureDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSStoredProcedurePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSStoredProcedurePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSStoredProcedurePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] executeStoredProcedure(org.talend.mdm.webservice.WSExecuteStoredProcedure wsExecuteStoredProcedure) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeStoredProcedure"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExecuteStoredProcedure});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformer getTransformer(org.talend.mdm.webservice.WSGetTransformer wsGetTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformer) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformer) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsTransformer(org.talend.mdm.webservice.WSExistsTransformer wsExistsTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerPK[] getTransformerPKs(org.talend.mdm.webservice.WSGetTransformerPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerPK putTransformer(org.talend.mdm.webservice.WSPutTransformer wsTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerPK deleteTransformer(org.talend.mdm.webservice.WSDeleteTransformer wsTransformerDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsTransformerDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSPipelineTypedContentEntry[] processBytesUsingTransformer(org.talend.mdm.webservice.WSProcessBytesUsingTransformer wsProcessBytesUsingTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processBytesUsingTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsProcessBytesUsingTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSPipelineTypedContentEntry[] processFileUsingTransformer(org.talend.mdm.webservice.WSProcessFileUsingTransformer wsProcessFileUsingTransformer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processFileUsingTransformer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsProcessFileUsingTransformer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSPipelineTypedContentEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSPipelineTypedContentEntry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK processBytesUsingTransformerAsBackgroundJob(org.talend.mdm.webservice.WSProcessBytesUsingTransformerAsBackgroundJob wsProcessBytesUsingTransformerAsBackgroundJob) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processBytesUsingTransformerAsBackgroundJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsProcessBytesUsingTransformerAsBackgroundJob});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK processFileUsingTransformerAsBackgroundJob(org.talend.mdm.webservice.WSProcessFileUsingTransformerAsBackgroundJob wsProcessFileUsingTransformerAsBackgroundJob) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processFileUsingTransformerAsBackgroundJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsProcessFileUsingTransformerAsBackgroundJob});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerV2 getTransformerV2(org.talend.mdm.webservice.WSGetTransformerV2 wsGetTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerV2) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsTransformerV2(org.talend.mdm.webservice.WSExistsTransformerV2 wsExistsTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerV2PK[] getTransformerV2PKs(org.talend.mdm.webservice.WSGetTransformerV2PKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerV2PKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerV2PK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerV2PK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerV2PK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerV2PK putTransformerV2(org.talend.mdm.webservice.WSPutTransformerV2 wsTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerV2PK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerV2PK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerV2PK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerV2PK deleteTransformerV2(org.talend.mdm.webservice.WSDeleteTransformerV2 wsDeleteTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerV2PK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerV2PK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerV2PK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerContext executeTransformerV2(org.talend.mdm.webservice.WSExecuteTransformerV2 wsExecuteTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExecuteTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerContext) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerContext) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerContext.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK executeTransformerV2AsJob(org.talend.mdm.webservice.WSExecuteTransformerV2AsJob wsExecuteTransformerV2AsJob) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeTransformerV2AsJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExecuteTransformerV2AsJob});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerContext extractThroughTransformerV2(org.talend.mdm.webservice.WSExtractThroughTransformerV2 wsExtractThroughTransformerV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "extractThroughTransformerV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExtractThroughTransformerV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerContext) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerContext) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerContext.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsTransformerPluginV2(org.talend.mdm.webservice.WSExistsTransformerPluginV2 wsExistsTransformerPluginV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsTransformerPluginV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsTransformerPluginV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString getTransformerPluginV2Configuration(org.talend.mdm.webservice.WSTransformerPluginV2GetConfiguration wsGetConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerPluginV2Configuration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString putTransformerPluginV2Configuration(org.talend.mdm.webservice.WSTransformerPluginV2PutConfiguration wsPutConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putTransformerPluginV2Configuration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerPluginV2Details getTransformerPluginV2Details(org.talend.mdm.webservice.WSGetTransformerPluginV2Details wsGetTransformerPluginV2Details) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerPluginV2Details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetTransformerPluginV2Details});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerPluginV2Details) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerPluginV2Details) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerPluginV2Details.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSTransformerPluginV2SListItem[] getTransformerPluginV2SList(org.talend.mdm.webservice.WSGetTransformerPluginV2SList wsGetTransformerPluginV2SList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getTransformerPluginV2sList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetTransformerPluginV2SList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSTransformerPluginV2SListItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSTransformerPluginV2SListItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSTransformerPluginV2SListItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRole getRole(org.talend.mdm.webservice.WSGetRole wsGetRole) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetRole});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRole) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRole) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsRole(org.talend.mdm.webservice.WSExistsRole wsExistsRole) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsRole});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRolePK[] getRolePKs(org.talend.mdm.webservice.WSGetRolePKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRolePKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRolePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRolePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRolePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRolePK putRole(org.talend.mdm.webservice.WSPutRole wsRole) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRole});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRolePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRolePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRolePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRolePK deleteRole(org.talend.mdm.webservice.WSDeleteRole wsRoleDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoleDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRolePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRolePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRolePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getObjectsForRoles(java.lang.String[] wsRoleDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getObjectsForRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoleDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCustomForm getCustomForm(org.talend.mdm.webservice.WSGetCustomForm wsGetCustomForm) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetCustomForm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCustomForm) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCustomForm) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCustomForm.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsCustomForm(org.talend.mdm.webservice.WSExistsCustomForm wsExistsCustomForm) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsCustomForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsCustomForm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCustomFormPK[] getCustomFormPKs(org.talend.mdm.webservice.WSGetCustomFormPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomFormPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCustomFormPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCustomFormPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCustomFormPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCustomFormPK putCustomForm(org.talend.mdm.webservice.WSPutCustomForm wsCustomForm) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putCustomForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsCustomForm});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCustomFormPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCustomFormPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCustomFormPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCustomFormPK deleteCustomForm(org.talend.mdm.webservice.WSDeleteCustomForm wsCustomFormDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteCustomForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsCustomFormDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCustomFormPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCustomFormPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCustomFormPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMenu getMenu(org.talend.mdm.webservice.WSGetMenu wsGetMenu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetMenu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMenu) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMenu) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMenu.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsMenu(org.talend.mdm.webservice.WSExistsMenu wsExistsMenu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsMenu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMenuPK[] getMenuPKs(org.talend.mdm.webservice.WSGetMenuPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMenuPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMenuPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMenuPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMenuPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMenuPK putMenu(org.talend.mdm.webservice.WSPutMenu wsMenu) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsMenu});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMenuPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMenuPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMenuPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMenuPK deleteMenu(org.talend.mdm.webservice.WSDeleteMenu wsMenuDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsMenuDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMenuPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMenuPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMenuPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningCommitItems(org.talend.mdm.webservice.WSVersioningCommitItems wsVersioningCommitItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningCommitItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningCommitItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean versioningRestoreItemByRevision(org.talend.mdm.webservice.WSVersioningRestoreItemByRevision wsVersioningRestoreItemByRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningRestoreItemByRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningRestoreItemByRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningItemHistory versioningGetItemHistory(org.talend.mdm.webservice.WSVersioningGetItemHistory wsVersioningGetItemHistory) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetItemHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetItemHistory});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningItemHistory) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningItemHistory) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningItemHistory.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningItemsVersionsItems[] versioningGetItemsVersions(org.talend.mdm.webservice.WSVersioningGetItemsVersions wsVersioningGetItemsVersions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetItemsVersions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetItemsVersions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningItemsVersionsItems[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningItemsVersionsItems[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningItemsVersionsItems[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString versioningGetItemContent(org.talend.mdm.webservice.WSVersioningGetItemContent wsVersioningGetItemContent) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetItemContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetItemContent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[] versioningGetObjectsVersions(org.talend.mdm.webservice.WSVersioningGetObjectsVersions wsVersioningGetObjectsVersions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetObjectsVersions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetObjectsVersions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningObjectsVersionsObjects[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[] versioningGetUniverseVersions(org.talend.mdm.webservice.WSVersioningGetUniverseVersions wsVersioningGetUniverseVersions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetUniverseVersions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetUniverseVersions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningUniverseVersionsTagStructure[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningSystemConfiguration getVersioningSystemConfiguration(org.talend.mdm.webservice.WSGetVersioningSystemConfiguration wsGetVersioningSystemConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVersioningSystemConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetVersioningSystemConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningSystemConfiguration) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningSystemConfiguration) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningSystemConfiguration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString putVersioningSystemConfiguration(org.talend.mdm.webservice.WSPutVersioningSystemConfiguration wsPutVersioningSystemConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putVersioningSystemConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutVersioningSystemConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSVersioningInfo versioningGetInfo(org.talend.mdm.webservice.WSVersioningGetInfo wsVersioningGetInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningGetInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningGetInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSVersioningInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSVersioningInfo) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSVersioningInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningTagObjects(org.talend.mdm.webservice.WSVersioningTagObjects wsVersioningTagObjects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningTagObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningTagObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningTagUniverse(org.talend.mdm.webservice.WSVersioningTagUniverse wsVersioningTagUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningTagUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningTagUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningTagItems(org.talend.mdm.webservice.WSVersioningTagItems wsVersioningTagItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningTagItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningTagItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningRestoreObjects(org.talend.mdm.webservice.WSVersioningRestoreObjects wsVersioningRestoreObjects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningRestoreObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningRestoreObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningRestoreUniverse(org.talend.mdm.webservice.WSVersioningRestoreUniverse wsVersioningRestoreUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningRestoreUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningRestoreUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK versioningRestoreItems(org.talend.mdm.webservice.WSVersioningRestoreItems wsVersioningRestoreItems) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "versioningRestoreItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsVersioningRestoreItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK[] findBackgroundJobPKs(org.talend.mdm.webservice.WSFindBackgroundJobPKs status) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findBackgroundJobPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJob getBackgroundJob(org.talend.mdm.webservice.WSGetBackgroundJob wsGetBackgroundJob) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getBackgroundJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetBackgroundJob});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJob) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJob) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJob.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBackgroundJobPK putBackgroundJob(org.talend.mdm.webservice.WSPutBackgroundJob wsPutBackgroundJob) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putBackgroundJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsPutBackgroundJob});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBackgroundJobPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBackgroundJobPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2 getRoutingOrderV2(org.talend.mdm.webservice.WSGetRoutingOrderV2 wsGetRoutingOrderV2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetRoutingOrderV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2 existsRoutingOrderV2(org.talend.mdm.webservice.WSExistsRoutingOrderV2 wsExistsRoutingOrder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsRoutingOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsRoutingOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2PK deleteRoutingOrderV2(org.talend.mdm.webservice.WSDeleteRoutingOrderV2 wsDeleteRoutingOrder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteRoutingOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsDeleteRoutingOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2PK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2PK executeRoutingOrderV2Asynchronously(org.talend.mdm.webservice.WSExecuteRoutingOrderV2Asynchronously wsExecuteRoutingOrderAsynchronously) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeRoutingOrderV2Asynchronously"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExecuteRoutingOrderAsynchronously});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2PK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString executeRoutingOrderV2Synchronously(org.talend.mdm.webservice.WSExecuteRoutingOrderV2Synchronously wsExecuteRoutingOrderSynchronously) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeRoutingOrderV2Synchronously"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExecuteRoutingOrderSynchronously});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2PK[] getRoutingOrderV2PKsByCriteria(org.talend.mdm.webservice.WSGetRoutingOrderV2PKsByCriteria wsGetRoutingOrderV2PKsByCriteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingOrderV2PKsByCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetRoutingOrderV2PKsByCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2PK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2PK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2[] getRoutingOrderV2SByCriteria(org.talend.mdm.webservice.WSGetRoutingOrderV2SByCriteria wsGetRoutingOrderV2SByCriteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingOrderV2sByCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetRoutingOrderV2SByCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingOrderV2[] getRoutingOrderV2ByCriteriaWithPaging(org.talend.mdm.webservice.WSGetRoutingOrderV2ByCriteriaWithPaging wsGetRoutingOrderV2ByCriteriaWithPaging) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRoutingOrderV2ByCriteriaWithPaging"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetRoutingOrderV2ByCriteriaWithPaging});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingOrderV2[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingOrderV2[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingOrderV2[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingRulePK[] routeItemV2(org.talend.mdm.webservice.WSRouteItemV2 wsRouteItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "routeItemV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRouteItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingRulePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingRulePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingRulePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSRoutingEngineV2Status routingEngineV2Action(org.talend.mdm.webservice.WSRoutingEngineV2Action wsRoutingEngineAction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "routingEngineV2Action"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRoutingEngineAction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSRoutingEngineV2Status) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSRoutingEngineV2Status) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSRoutingEngineV2Status.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniverse getUniverse(org.talend.mdm.webservice.WSGetUniverse wsGetUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniverse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniverse) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniverse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsUniverse(org.talend.mdm.webservice.WSExistsUniverse wsExistsUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniversePK[] getUniversePKs(org.talend.mdm.webservice.WSGetUniversePKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUniversePKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniversePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniversePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniversePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniversePK[] getUniverseByRevision(org.talend.mdm.webservice.WSGetUniverseByRevision wsUniverseByRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUniverseByRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUniverseByRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniversePK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniversePK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniversePK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniversePK putUniverse(org.talend.mdm.webservice.WSPutUniverse wsUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniversePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniversePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniversePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniversePK deleteUniverse(org.talend.mdm.webservice.WSDeleteUniverse wsUniverseDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsUniverseDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniversePK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniversePK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniversePK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getObjectsForUniverses(java.lang.String[] regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getObjectsForUniverses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSUniverse getCurrentUniverse(org.talend.mdm.webservice.WSGetCurrentUniverse wsGetCurrentUniverse) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCurrentUniverse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetCurrentUniverse});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSUniverse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSUniverse) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSUniverse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationPlan getSynchronizationPlan(org.talend.mdm.webservice.WSGetSynchronizationPlan wsGetSynchronizationPlan) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetSynchronizationPlan});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationPlan) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationPlan) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationPlan.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsSynchronizationPlan(org.talend.mdm.webservice.WSExistsSynchronizationPlan wsExistsSynchronizationPlan) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsSynchronizationPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsSynchronizationPlan});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanPK[] getSynchronizationPlanPKs(org.talend.mdm.webservice.WSGetSynchronizationPlanPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationPlanPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationPlanPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanPK putSynchronizationPlan(org.talend.mdm.webservice.WSPutSynchronizationPlan wsSynchronizationPlan) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putSynchronizationPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationPlan});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationPlanPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanPK deleteSynchronizationPlan(org.talend.mdm.webservice.WSDeleteSynchronizationPlan wsSynchronizationPlanDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteSynchronizationPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationPlanDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationPlanPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationPlanPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getObjectsForSynchronizationPlans(java.lang.String[] regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getObjectsForSynchronizationPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getSynchronizationPlanObjectsAlgorithms(java.lang.String[] regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationPlanObjectsAlgorithms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getSynchronizationPlanItemsAlgorithms(java.lang.String[] regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationPlanItemsAlgorithms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationPlanStatus synchronizationPlanAction(org.talend.mdm.webservice.WSSynchronizationPlanAction wsSynchronizationPlanAction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationPlanAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationPlanAction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationPlanStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationPlanStatus) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationPlanStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] synchronizationGetUnsynchronizedObjectsIDs(org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedObjectsIDs wsSynchronizationGetUnsynchronizedObjectsIDs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationGetUnsynchronizedObjectsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationGetUnsynchronizedObjectsIDs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString synchronizationGetObjectXML(org.talend.mdm.webservice.WSSynchronizationGetObjectXML wsSynchronizationGetObjectXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationGetObjectXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationGetObjectXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString synchronizationPutObjectXML(org.talend.mdm.webservice.WSSynchronizationPutObjectXML wsSynchronizationPutObjectXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationPutObjectXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationPutObjectXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK[] synchronizationGetUnsynchronizedItemPKs(org.talend.mdm.webservice.WSSynchronizationGetUnsynchronizedItemPKs wsSynchronizationGetUnsynchronizedItemPKs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationGetUnsynchronizedItemPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationGetUnsynchronizedItemPKs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSString synchronizationGetItemXML(org.talend.mdm.webservice.WSSynchronizationGetItemXML wsSynchronizationGetItemXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationGetItemXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationGetItemXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSString) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSString) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK synchronizationPutItemXML(org.talend.mdm.webservice.WSSynchronizationPutItemXML wsSynchronizationPutItemXML) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "synchronizationPutItemXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationPutItemXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationItem getSynchronizationItem(org.talend.mdm.webservice.WSGetSynchronizationItem wsGetSynchronizationItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsGetSynchronizationItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationItem) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean existsSynchronizationItem(org.talend.mdm.webservice.WSExistsSynchronizationItem wsExistsSynchronizationItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "existsSynchronizationItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsExistsSynchronizationItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[][] getSynchronizationItemPKs(org.talend.mdm.webservice.WSGetSynchronizationItemPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSynchronizationItemPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[][]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[][]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[][].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] putSynchronizationItem(org.talend.mdm.webservice.WSPutSynchronizationItem wsSynchronizationItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putSynchronizationItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] deleteSynchronizationItem(org.talend.mdm.webservice.WSDeleteSynchronizationItem wsSynchronizationItemDelete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteSynchronizationItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsSynchronizationItemDelete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSSynchronizationItem resolveSynchronizationItem(org.talend.mdm.webservice.WSResolveSynchronizationItem wsResolveSynchronizationItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resolveSynchronizationItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsResolveSynchronizationItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSSynchronizationItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSSynchronizationItem) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSSynchronizationItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSItemPK recoverDroppedItem(org.talend.mdm.webservice.WSRecoverDroppedItem wsRecoverDroppedItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recoverDroppedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRecoverDroppedItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDroppedItemPK[] findAllDroppedItemsPKs(org.talend.mdm.webservice.WSFindAllDroppedItemsPKs regex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findAllDroppedItemsPKs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {regex});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDroppedItemPK[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDroppedItemPK[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDroppedItemPK[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDroppedItem loadDroppedItem(org.talend.mdm.webservice.WSLoadDroppedItem wsLoadDroppedItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "loadDroppedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsLoadDroppedItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDroppedItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDroppedItem) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDroppedItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSDroppedItemPK removeDroppedItem(org.talend.mdm.webservice.WSRemoveDroppedItem wsRemoveDroppedItem) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeDroppedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsRemoveDroppedItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSDroppedItemPK) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSDroppedItemPK) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSDroppedItemPK.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMDMConfig getMDMConfiguration() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMDMConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMDMConfig) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMDMConfig) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMDMConfig.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCheckServiceConfigResponse checkServiceConfiguration(org.talend.mdm.webservice.WSCheckServiceConfigRequest serviceName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkServiceConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCheckServiceConfigResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCheckServiceConfigResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCheckServiceConfigResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[] workflowGetProcessDefinitions(org.talend.mdm.webservice.WSWorkflowGetProcessDefinitions wsworkflowProcessDefinitions) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowGetProcessDefinitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsworkflowProcessDefinitions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID workflowDeploy(org.talend.mdm.webservice.WSWorkflowDeploy wsWorkflowDeploy) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowDeploy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsWorkflowDeploy});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSWorkflowProcessDefinitionUUID.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowUnDeploy(org.talend.mdm.webservice.WSWorkflowUnDeploy wsWorkflowUnDeploy) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowUnDeploy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsWorkflowUnDeploy});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSProcessTaskInstance[] workflowGetTaskList(org.talend.mdm.webservice.WSWorkflowGetTaskList uuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowGetTaskList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSProcessTaskInstance[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSProcessTaskInstance[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSProcessTaskInstance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSProcessInstance[] workflowGetProcessInstances(org.talend.mdm.webservice.WSWorkflowGetProcessInstances uuid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowGetProcessInstances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uuid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSProcessInstance[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSProcessInstance[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSProcessInstance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowDeleteProcessInstances(org.talend.mdm.webservice.WSWorkflowDeleteProcessInstancesRequest deleteWolkflowRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowDeleteProcessInstances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteWolkflowRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowUnassignTask(org.talend.mdm.webservice.WSUnassignTask task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[193]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowUnassignTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowAssignTask(org.talend.mdm.webservice.WSAssignTask task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[194]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowAssignTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowSetTaskPriority(org.talend.mdm.webservice.WSSetTaskPriority task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[195]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowSetTaskPriority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowSuspendTask(org.talend.mdm.webservice.WSSuspendTask task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[196]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowSuspendTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowResumeTask(org.talend.mdm.webservice.WSResumeTask task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[197]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowResumeTask"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean workflowStartProcessInstance(org.talend.mdm.webservice.WSStartProcessInstance task) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[198]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "workflowStartProcessInstance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {task});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSMDMJob[] getMDMJob(java.lang.String[] mdmJobRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[199]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMDMJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {mdmJobRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSMDMJob[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSMDMJob[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSMDMJob[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean putMDMJob(org.talend.mdm.webservice.WSPUTMDMJob putMDMJobRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[200]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "putMDMJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {putMDMJobRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSBoolean deleteMDMJob(org.talend.mdm.webservice.WSDELMDMJob deleteMDMJobRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[201]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteMDMJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteMDMJobRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSBoolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSBoolean) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSBoolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSCategoryData getMDMCategory(org.talend.mdm.webservice.WSCategoryData wsCategoryDataRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[202]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMDMCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsCategoryDataRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSCategoryData) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSCategoryData) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSCategoryData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.talend.mdm.webservice.WSAutoIncrement getAutoIncrement(org.talend.mdm.webservice.WSAutoIncrement wsAutoIncrementRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[203]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAutoIncrement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {wsAutoIncrementRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.talend.mdm.webservice.WSAutoIncrement) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.talend.mdm.webservice.WSAutoIncrement) org.apache.axis.utils.JavaUtils.convert(_resp, org.talend.mdm.webservice.WSAutoIncrement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

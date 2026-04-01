package org.talend.designer.webservice.ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.talend.commons.ui.runtime.exception.MessageBoxExceptionHandler;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.designer.webservice.ws.wsdlinfo.Function;
import org.talend.designer.webservice.ws.wsdlinfo.OperationInfo;
import org.talend.designer.webservice.ws.wsdlinfo.ParameterInfo;
import org.talend.designer.webservice.ws.wsdlinfo.ServiceInfo;
import org.talend.designer.webservice.ws.wsdlutil.ComponentBuilder;
import org.talend.designer.webservice.ws.wsdlutil.ServiceHelperConfiguration;

/**
 * 
 * @author gcui
 */
public class WSDLDiscoveryHelper {

    public List<Function> functionsAvailable;

    public List<ParameterInfo> inputParameters;

    public List<ParameterInfo> outputParameters;

    /**
     * DOC gcui Comment method "getFunctionsAvailable".
     * 
     * @param wsdlURI
     * @return
     */
    public List<Function> getFunctionsAvailable(String wsdlURI, ServiceHelperConfiguration config) {
        functionsAvailable = new ArrayList();
        wsdlURI = TalendTextUtils.removeQuotes(wsdlURI);

        try {
            ComponentBuilder builder = new ComponentBuilder();

            ServiceInfo serviceInfo = new ServiceInfo();
            serviceInfo.setWsdlUri(wsdlURI);
            serviceInfo.setAuthConfig(config);
            serviceInfo = builder.buildserviceinformation(serviceInfo);

            if (serviceInfo != null) {
                Iterator iter = serviceInfo.getOperations();
                while (iter.hasNext()) {

                    OperationInfo oper = (OperationInfo) iter.next();
                    // operationName
                    Function f = new Function(oper.getTargetMethodName());
                    String operationName = oper.getTargetMethodName() + "(";

                    if (serviceInfo.getServerName() != null) {
                        f.setServerName(serviceInfo.getServerName());
                    }
                    if (serviceInfo.getServerNameSpace() != null) {
                        f.setServerNameSpace(serviceInfo.getServerNameSpace());
                    }
                    if (serviceInfo.getPortNames() != null) {
                        f.setPortNames(serviceInfo.getPortNames());
                    }
                    if (oper.getSoapActionURI() != null) {
                        f.setSoapAction(oper.getSoapActionURI());
                    }
                    if (oper.getNamespaceURI() != null) {
                        f.setNameSpaceURI(oper.getNamespaceURI());
                    }
                    if (oper.getEncodingStyle() != null) {
                        f.setEncodingStyle(oper.getEncodingStyle());
                    }

                    if (oper.getTargetURL() != null) {
                        f.setAddressLocation(oper.getTargetURL());
                    }

                    List inps = oper.getInparameters();
                    List outps = oper.getOutparameters();
                    // input parameters
                    inputParameters = new ArrayList();
                    if (inps.size() == 0) {
                        inputParameters.add(new ParameterInfo());
                        operationName = operationName + "):";
                    } else if (inps.size() > 0 && inps != null) {
                        for (Iterator iterator1 = inps.iterator(); iterator1.hasNext();) {
                            ParameterInfo element = (ParameterInfo) iterator1.next();
                            getParaFullName(element);
                            // ParameterInfo p = new ParameterInfo();
                            // p.setType(element.getKind());
                            inputParameters.add(element);
                            if (element.getType() != null) {
                                operationName = operationName + element.getType() + ",";
                            } else if (element.getType() == null && element.getName() != null) {
                                operationName = operationName + element.getName() + ",";
                            } else if (element.getType() == null) {
                                operationName = operationName + "noType" + ",";
                            }
                            if (element.getType() == null
                                    && (element.getParameterInfos() == null || element.getParameterInfos().isEmpty())
                                    && inps.size() == 1) {

                                element.setName(element.getName());
                            }
                        }
                        int operationNamelen = operationName.length();
                        operationName = operationName.substring(0, operationNamelen - 1) + "):";
                        f.setInputParameters(inputParameters);
                    }
                    // output parameters
                    outputParameters = new ArrayList();
                    if (outps.size() == 0) {
                        outputParameters.add(new ParameterInfo());
                    } else {
                        for (Iterator iterator2 = outps.iterator(); iterator2.hasNext();) {
                            ParameterInfo element = (ParameterInfo) iterator2.next();
                            getParaFullName(element);
                            // ParameterInfo p = new ParameterInfo();
                            // p.setType(element.getKind());
                            outputParameters.add(element);
                            if (element.getType() != null) {
                                operationName = operationName + element.getType() + ",";
                            } else if (element.getParameterInfos() != null && !element.getParameterInfos().isEmpty()) {
                                for (Object element2 : element.getParameterInfos()) {
                                    ParameterInfo elementBranch = (ParameterInfo) element2;
                                    if (elementBranch.getType() != null) {
                                        operationName = operationName + elementBranch.getType() + ",";
                                    } else {
                                        operationName = operationName + "noType" + ",";
                                    }
                                }
                            }
                        }
                        int operationNamelen = operationName.length();
                        operationName = operationName.substring(0, operationNamelen - 1);
                        f.setOutputParameters(outputParameters);
                    }
                    f.setName(operationName);
                    functionsAvailable.add(f);
                }
            }
        } catch (Exception e) {
            MessageBoxExceptionHandler.process(e);
        }

        return functionsAvailable;
    }

    /**
     * DOC gcui Comment method "getParaFullName".
     * 
     * @param element
     */
    private void getParaFullName(ParameterInfo paraElement) {
        paraElement.setParaFullName(paraElement.getName());
        List<ParameterInfo> allChildList = getAllChildren(paraElement);

    }

    public List<ParameterInfo> getAllChildren(ParameterInfo para) {
        List<ParameterInfo> list = new ArrayList<ParameterInfo>();
        List<ParameterInfo> childList = para.getParameterInfos();
        for (ParameterInfo paraC : childList) {
            if (paraC.getParent().getParaFullName() != null) {
                paraC.setParaFullName(paraC.getParent().getParaFullName() + "." + paraC.getName());
            }
        }
        list.addAll(childList);
        for (ParameterInfo paraC : childList) {
            if (paraC.getParameterInfos().size() > 0) {
                list.addAll(getAllChildren(paraC));
            }
        }
        return list;
    }

    public List<Function> getFunctionsAvailable(String wsdlURI) {
        ServiceHelperConfiguration config = null;
        return getFunctionsAvailable(wsdlURI, config);

    }

    public static void main(String[] args) {
        List<Function> test = new ArrayList<Function>();
        // test = getFunctionsAvailable("\"C:/Documents and Settings/Administrator/桌面/wsdl/Person.wsdl\"");
        // test =
        // getFunctionsAvailable("F:/strivecui_work_log/week_21(0622-0626)/TestAxis/src/org/soyatec/wsdl/testExample.wsdl"
        // );
        // test = getFunctionsAvailable("C:/Documents and Settings/Administrator/桌面/wsdl/mathservice.asmx.wsdl");
        // test = getFunctionsAvailable("http://www.deeptraining.com/webservices/mathservice.asmx?WSDL");
    }
}

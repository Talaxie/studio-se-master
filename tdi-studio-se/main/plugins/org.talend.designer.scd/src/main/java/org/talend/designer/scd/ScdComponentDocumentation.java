// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.scd;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.talend.commons.runtime.utils.io.FileCopyUtils;
import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.model.genhtml.HTMLDocUtils;
import org.talend.core.model.genhtml.HTMLHandler;
import org.talend.core.model.genhtml.IHTMLDocConstants;
import org.talend.core.model.genhtml.XMLHandler;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.IComponentDocumentation;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.designer.scd.i18n.Messages;
import org.talend.designer.scd.model.SurrogateCreationType;
import org.talend.designer.scd.model.VersionEndType;
import org.talend.designer.scd.model.VersionStartType;
import org.talend.designer.scd.model.Versioning;
import org.talend.designer.scd.ui.Type3Section;

/**
 * This class is used for generating HTML file for t*SCD Component .
 *
 */
public class ScdComponentDocumentation implements IComponentDocumentation {

    private String componentName;

    private String tempFolderPath;

    private Document document;

    private String previewPicPath;

    private INode externalNode;

    private Set<String> unusedColumns;

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.process.IComponentDocumentation#getHTMLFile()
     */
    public URL getHTMLFile() {
        String xmlFilepath = this.tempFolderPath + File.separatorChar + this.componentName + IHTMLDocConstants.XML_FILE_SUFFIX;

        String htmlFilePath = this.tempFolderPath + File.separatorChar + this.componentName + IHTMLDocConstants.HTML_FILE_SUFFIX;

        final Bundle b = Platform.getBundle(ScdPlugin.PLUGIN_ID);

        URL xslFileUrl = null;
        try {
            xslFileUrl = FileLocator.toFileURL(FileLocator.find(b, new Path("resources/tScd.xsl"), null)); //$NON-NLS-1$
            String picturesFolderPath = this.tempFolderPath + File.separatorChar + IHTMLDocConstants.PIC_FOLDER_NAME;
            File file = new File(picturesFolderPath);
            if (!file.exists()) {
                file.mkdir();
            }
            FileCopyUtils.copy(FileLocator.toFileURL(FileLocator.find(b, new Path("icons/checked.png"), null)).getPath(),
                    picturesFolderPath + File.separatorChar + "checked.png");
            FileCopyUtils.copy(FileLocator.toFileURL(FileLocator.find(b, new Path("icons/unchecked.png"), null)).getPath(),
                    picturesFolderPath + File.separatorChar + "unchecked.png");
        } catch (IOException e) {
            // e.printStackTrace();
            ExceptionHandler.process(e);
        }

        String xslFilePath = xslFileUrl.getPath();

        generateXMLInfo(getExternalNode());

        XMLHandler.generateXMLFile(tempFolderPath, xmlFilepath, document);
        HTMLHandler.generateHTMLFile(this.tempFolderPath, xslFilePath, xmlFilepath, htmlFilePath);

        File htmlFile = new File(htmlFilePath);
        if (htmlFile.exists()) {
            try {
                return htmlFile.toURL();
            } catch (MalformedURLException e) {
                ExceptionHandler.process(e);
            }
        }
        return null;
    }

    private void generateMessages(Element element) {
        // tscd.xsl
        element.addAttribute("i18n.scd.properties.for", Messages.getString("HTMLDocGenerator.scd.properties"));
        element.addAttribute("i18n.scd.unused", Messages.getString("JavaScdDialog.unUsed"));
        element.addAttribute("i18n.scd.sourceKeys", Messages.getString("JavaScdDialog.sourceKey"));
        element.addAttribute("i18n.scd.surrogateKeys", Messages.getString("JavaScdDialog.surrogateKey"));
        element.addAttribute("i18n.scd.type0Fields", Messages.getString("JavaScdDialog.type0Field"));
        element.addAttribute("i18n.scd.type1Fields", Messages.getString("JavaScdDialog.type1Field"));
        element.addAttribute("i18n.scd.type2Fields", Messages.getString("JavaScdDialog.type2Field"));
        element.addAttribute("i18n.scd.type3Fields", Messages.getString("JavaScdDialog.type3Key"));
        element.addAttribute("i18n.scd.name", "name");
        element.addAttribute("i18n.scd.type", "type");
        element.addAttribute("i18n.scd.creation", "creation");
        element.addAttribute("i18n.scd.complement", "complement");
        element.addAttribute("i18n.scd.versioning", "Versioning");
        element.addAttribute("i18n.scd.currentValue", Type3Section.CURRENT_HEADER);
        element.addAttribute("i18n.scd.previousValue", Type3Section.PREVIOUS_HEADER);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.process.IComponentDocumentation#setComponentName(java.lang.String)
     */
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.process.IComponentDocumentation#setTempFolderPath(java.lang.String)
     */
    public void setTempFolderPath(String tempFolderpath) {
        this.tempFolderPath = tempFolderpath;
    }

    /**
     * Generates all information which for XML file.
     */
    private void generateXMLInfo(INode externalNode) {
        document = DocumentHelper.createDocument();
        Element externalNodeElement = document.addElement("externalNode"); //$NON-NLS-1$
        generateMessages(externalNodeElement);
        externalNodeElement.addAttribute("name", HTMLDocUtils.checkString(this.componentName)); //$NON-NLS-1$
        externalNodeElement.addAttribute("preview", HTMLDocUtils.checkString(this.previewPicPath)); //$NON-NLS-1$

        // get all input columns as unused
        unusedColumns = new HashSet<String>();
        List<IMetadataColumn> columns = getInputColumns(externalNode);
        if (columns != null) {
            for (IMetadataColumn column : columns) {
                unusedColumns.add(column == null ? "" : column.getLabel());
            }
        }
        Element unUsedElement = externalNodeElement.addElement("unUsed"); //$NON-NLS-1$

        Element sourceKeysElement = externalNodeElement.addElement("sourceKeys");
        generateSourceKeys(externalNode, sourceKeysElement);

        Element surrogateKeysElement = externalNodeElement.addElement("surrogateKeys");
        generateSurrogateKeys(externalNode, surrogateKeysElement);

        Element type0FieldsElement = externalNodeElement.addElement("type0Fields");
        generateType0Fields(externalNode, type0FieldsElement);

        Element type1FieldsElement = externalNodeElement.addElement("type1Fields");
        generateType1Fields(externalNode, type1FieldsElement);

        Element type2FieldsElement = externalNodeElement.addElement("type2Fields");
        generateType2Fields(externalNode, type2FieldsElement);

        Element type3FieldsElement = externalNodeElement.addElement("type3Fields");
        generateType3Fields(externalNode, type3FieldsElement);

        // remove used and generate final unused columns
        generateUnused(externalNode, unUsedElement);

    }

    private void generateUnused(INode externalNode, Element unUsedElement) {
        if (unusedColumns != null) {
            List<String> unusedList = new ArrayList<String>(unusedColumns);
            Collections.sort(unusedList);
            for (String column : unusedList) {
                Element fieldEle = unUsedElement.addElement("field");
                fieldEle.addAttribute("name", column);
            }
        }
    }

    private void generateSourceKeys(INode externalNode, Element type0FieldsElement) {
        IElementParameter param = externalNode.getElementParameter(ScdParameterConstants.SOURCE_KEYS_PARAM_NAME);
        if (param == null)
            return;
        List<Map<String, String>> values = (List<Map<String, String>>) param.getValue();
        if (values != null && values.size() > 0) {
            for (Map<String, String> entry : values) {
                for (String value : entry.values()) {
                    if (value != null) {
                        Element keyEle = type0FieldsElement.addElement("key");
                        keyEle.addAttribute("name", value);
                        unusedColumns.remove(value);
                    }
                }
            }
        }
    }

    private void generateSurrogateKeys(INode externalNode, Element surrogateKeysElement) {
        IElementParameter columnParam = externalNode.getElementParameter(ScdParameterConstants.SURROGATE_KEY);
        IElementParameter creationPara = externalNode.getElementParameter(ScdParameterConstants.SK_CREATION);

        if (columnParam != null || creationPara != null) {
            Element keyEle = surrogateKeysElement.addElement("key");
            String column = "", creation = "", complement = "";
            column = (String) columnParam.getValue();
            keyEle.addAttribute("name", column);
            if (creationPara != null) {
                creation = (String) creationPara.getValue();
                SurrogateCreationType scType= SurrogateCreationType.getTypeByValue(creation);
                keyEle.addAttribute("creation", scType == null ? "" : scType.getName());
                if (ScdParameterConstants.INPUT_FIELD.equalsIgnoreCase(creation)) {
                    IElementParameter para = externalNode.getElementParameter(ScdParameterConstants.SK_INPUT_FIELD);
                    if (para != null)
                        complement = (String) para.getValue();
                } else if (ScdParameterConstants.ROUTINE.equalsIgnoreCase(creation)) {
                    IElementParameter para = externalNode.getElementParameter(ScdParameterConstants.SK_ROUTINE);
                    if (para != null)
                        complement = (String) para.getValue();
                } else if (ScdParameterConstants.DB_SEQUENCE.equalsIgnoreCase(creation)) {
                    IElementParameter para = externalNode.getElementParameter(ScdParameterConstants.SK_DB_SEQUENCE);
                    if (para != null)
                        complement = (String) para.getValue();
                }
                keyEle.addAttribute("complement", complement);
            }
        }
    }

    private void generateType0Fields(INode externalNode, Element type0FieldsElement) {
        IElementParameter useL0 = externalNode.getElementParameter(ScdParameterConstants.USE_L0);
        if (useL0 != null && useL0.getValue().equals(Boolean.TRUE)) {
            IElementParameter l0FieldsParam = externalNode.getElementParameter(ScdParameterConstants.L0_FIELDS_PARAM_NAME);
            if (l0FieldsParam == null)
                return;
            List<Map<String, String>> values = (List<Map<String, String>>) l0FieldsParam.getValue();
            if (values != null && values.size() > 0) {
                for (Map<String, String> entry : values) {
                    for (String value : entry.values()) {
                        if (value != null) {
                            Element fieldEle = type0FieldsElement.addElement("field");
                            fieldEle.addAttribute("name", value);
                            unusedColumns.remove(value);
                        }
                    }
                }
            }
        }
    }

    private void generateType1Fields(INode externalNode, Element type1FieldsElement) {
        IElementParameter useL1 = externalNode.getElementParameter(ScdParameterConstants.USE_L1);
        if (useL1 != null && useL1.getValue().equals(Boolean.TRUE)) {
            IElementParameter l1FieldsParam = externalNode.getElementParameter(ScdParameterConstants.L1_FIELDS_PARAM_NAME);
            if (l1FieldsParam == null)
                return;
            List<Map<String, String>> values = (List<Map<String, String>>) l1FieldsParam.getValue();
            if (values != null && values.size() > 0) {
                for (Map<String, String> entry : values) {
                    for (String value : entry.values()) {
                        if (value != null) {
                            Element fieldEle = type1FieldsElement.addElement("field");
                            fieldEle.addAttribute("name", value);
                            unusedColumns.remove(value);
                        }
                    }
                }
            }
        }
    }

    private void generateType2Fields(INode externalNode, Element type2FieldsElement) {
        IElementParameter useL2 = externalNode.getElementParameter(ScdParameterConstants.USE_L2);
        if (useL2 != null && useL2.getValue().equals(Boolean.TRUE)) {
            IElementParameter l2FieldsParam = externalNode.getElementParameter(ScdParameterConstants.L2_FIELDS_PARAM_NAME);
            if (l2FieldsParam == null)
                return;
            List<Map<String, String>> values = (List<Map<String, String>>) l2FieldsParam.getValue();
            if (values != null && values.size() > 0) {
                for (Map<String, String> entry : values) {
                    for (String value : entry.values()) {
                        if (value != null) {
                            Element fieldEle = type2FieldsElement.addElement("field");
                            fieldEle.addAttribute("name", value);
                            unusedColumns.remove(value);
                        }
                    }
                }
                Element versioningEle = type2FieldsElement.addElement("versioning");
                Versioning versionData = new Versioning();

                // start date
                versionData.setStartName(getStringParameter(externalNode, ScdParameterConstants.L2_STARTDATE_FIELD));
                IElementParameter param = externalNode.getElementParameter(ScdParameterConstants.L2_STARTDATE_VALUE);
                if (param != null) {
                    versionData.setStartType(VersionStartType.getTypeByValue((String) param.getValue()));
                    if (versionData.getStartType() == VersionStartType.INPUT_FIELD) {
                        versionData.setStartComplement(
                                getStringParameter(externalNode, ScdParameterConstants.L2_STARTDATE_INPUT_FIELD));
                    }
                }

                // end date
                versionData.setEndName(getStringParameter(externalNode, ScdParameterConstants.L2_ENDDATE_FIELD));
                param = externalNode.getElementParameter(ScdParameterConstants.L2_ENDDATE_VALUE);
                if (param != null) {
                    versionData.setEndType(VersionEndType.getTypeByValue((String) param.getValue()));
                    if (versionData.getEndType() == VersionEndType.FIXED_YEAR) {
                        versionData
                                .setEndComplement(getStringParameter(externalNode, ScdParameterConstants.L2_ENDDATE_FIXED_VALUE));
                    }
                }

                // version
                versionData.setVersionChecked(getBooleanParameter(externalNode, ScdParameterConstants.USE_L2_VERSION));
                if (versionData.isVersionChecked()) {
                    versionData.setVersionName(getStringParameter(externalNode, ScdParameterConstants.L2_VERSION_FIELD));
                }

                // activate
                versionData.setActiveChecked(getBooleanParameter(externalNode, ScdParameterConstants.USE_L2_ACTIVE));
                if (versionData.isActiveChecked()) {
                    versionData.setActiveName(getStringParameter(externalNode, ScdParameterConstants.L2_ACTIVE_FIELD));
                }
                // start
                Element ele = versioningEle.addElement("entry");
                ele.addAttribute("checked", "");
                ele.addAttribute("type", versionData.START_LABEL);
                ele.addAttribute("name", versionData.getStartName());
                ele.addAttribute("creation", versionData.getStartType().getName());
                ele.addAttribute("complement", versionData.getStartComplement());

                // end
                ele = versioningEle.addElement("entry");
                ele.addAttribute("checked", "");
                ele.addAttribute("type", versionData.END_LABEL);
                ele.addAttribute("name", versionData.getEndName());
                ele.addAttribute("creation", versionData.getEndType().getName());
                ele.addAttribute("complement", versionData.getEndComplement());

                // version
                ele = versioningEle.addElement("entry");
                ele.addAttribute("checked", Boolean.toString(versionData.isVersionChecked()));
                ele.addAttribute("type", versionData.VERSION_LABEL);
                ele.addAttribute("name", versionData.getVersionName());
                ele.addAttribute("creation", "");
                ele.addAttribute("complement", "");

                // activate
                ele = versioningEle.addElement("entry");
                ele.addAttribute("checked", Boolean.toString(versionData.isActiveChecked()));
                ele.addAttribute("type", versionData.ACTIVE_LABEL);
                ele.addAttribute("name", versionData.getActiveName());
                ele.addAttribute("creation", "");
                ele.addAttribute("complement", "");
            }
        }
    }

    private String getStringParameter(INode externalNode, String paraName) {
        IElementParameter para = externalNode.getElementParameter(paraName);
        String value = null;
        if (para != null)
            value = (String) para.getValue();
        return value;
    }

    private boolean getBooleanParameter(INode externalNode, String paraName) {
        IElementParameter para = externalNode.getElementParameter(paraName);
        if (para == null)
            return false;
        return ((Boolean) para.getValue()).booleanValue();
    }

    private void generateType3Fields(INode externalNode, Element type3FieldsElement) {
        IElementParameter useL3 = externalNode.getElementParameter(ScdParameterConstants.USE_L3);
        if (useL3 != null && useL3.getValue().equals(Boolean.TRUE)) {
            IElementParameter l3FieldsParam = externalNode.getElementParameter(ScdParameterConstants.L3_FIELDS_PARAM_NAME);
            if (l3FieldsParam == null)
                return;
            List<Map<String, String>> values = (List<Map<String, String>>) l3FieldsParam.getValue();
            if (values != null && values.size() > 0) {
                for (Map<String, String> entry : values) {
                    String current = entry.get(ScdParameterConstants.L3_ITEM_CURRENT_VALUE);
                    String previous = entry.get(ScdParameterConstants.L3_ITEM_PREV_VALUE);
                    Element fieldEle = type3FieldsElement.addElement("field");
                    fieldEle.addAttribute("currentValue", current);
                    fieldEle.addAttribute("previousValue", previous);
                    unusedColumns.remove(current);
                }
            }
        }
    }

    public List<IMetadataColumn> getInputColumns(INode node) {
        List<IMetadataColumn> inputSchema = Collections.emptyList();
        List<? extends IConnection> incomingConnections = node.getIncomingConnections();
        if (incomingConnections != null && incomingConnections.size() > 0) {
            for (IConnection incomingConnection : incomingConnections) {
                if (incomingConnection.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
                    IMetadataTable schemaTable = incomingConnection.getMetadataTable();
                    if (schemaTable != null) {
                        inputSchema = schemaTable.getListColumns();
                    }
                }
            }
        }
        return inputSchema;
    }

    /**
     * Sets the preview picture path of component.
     *
     * @param previewPicPath
     */
    public void setPreviewPicPath(String previewPicPath) {
        this.previewPicPath = previewPicPath;

    }

    public INode getExternalNode() {
        return this.externalNode;
    }

    public void setExternalNode(INode externalNode) {
        this.externalNode = externalNode;
    }

}

// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.generic.model.migration;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.context.ContextUtils;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.util.GenericTypeUtils;
import org.talend.daikon.NamedThing;
import org.talend.daikon.properties.Properties;
import org.talend.daikon.properties.property.Property;
import org.talend.daikon.properties.property.PropertyValueEvaluator;
import org.talend.daikon.serialize.PostDeserializeSetup;
import org.talend.designer.core.generic.constants.IGenericConstants;
import org.talend.designer.core.generic.utils.ComponentsUtils;
import org.talend.designer.core.generic.utils.ParameterUtilTool;
import org.talend.designer.core.model.utils.emf.talendfile.ConnectionType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.MetadataType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.utils.UnifiedComponentUtil;
import org.talend.utils.security.StudioEncryption;

public abstract class ConvertTCompV0ToTckComponentMigrationTask extends AbstractJobMigrationTask {

    static class TckMigrationModel {
        String oldComponentName;
        String newComponentName;
        
        String oldPath;
        String newPath;
        String fieldType;
    }
    
    private boolean isDynamicSetting(Property property) {
        if(property == null) {
            return false;
        }
        Object obj = property.getTaggedValue(IGenericConstants.IS_DYNAMIC);
        if(obj != null) {
            if(obj instanceof Boolean) {
                return Boolean.class.cast(obj);
            } else {
                return Boolean.parseBoolean(String.valueOf(obj));
            }
        }
        return false;
    }
    
    private Object typeConvert(String type, Object storedValue) {
        if("java.lang.Boolean".equals(type)) {
            if("true".equals(storedValue)) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        }
        return storedValue;
    }
    
    @Override
    public ExecutionResult execute(final Item item) {
        final ProcessType processType = getProcessType(item);
        final ComponentCategory category = ComponentCategory.getComponentCategoryFromItem(item);
        final Map<String, List<TckMigrationModel>> props = getMigrationInfoFromFile();
        final IComponentConversion conversion = new IComponentConversion() {

            @Override
            public void transform(final NodeType nodeType) {
                if (nodeType == null || props == null) {
                    return;
                }
                
                final String currComponentName = nodeType.getComponentName();
                final List<TckMigrationModel> infos = props.get(currComponentName);
                final String newComponentName = infos.get(0).newComponentName;
                final String oldComponentName = nodeType.getComponentName();
                
                //update component node name to new one
                nodeType.setComponentName(newComponentName);
                nodeType.setComponentVersion("1");
                
                //get the new tck component define model
                //final IComponent component = ComponentsFactoryProvider.getInstance().get(newComponentName, category.getName());
                
                ElementParameterType tcompV0PropertiesElement = ParameterUtilTool.findParameterType(nodeType, "PROPERTIES");
                final String jsonProperties = tcompV0PropertiesElement.getValue();
                final ComponentProperties compProperties = Properties.Helper.fromSerializedPersistent(jsonProperties, ComponentProperties.class, new PostDeserializeSetup() {

                    @Override
                    public void setup(Object properties) {
                        ((Properties) properties).setValueEvaluator(new PropertyValueEvaluator() {

                            @Override
                            public Object evaluate(Property property, Object storedValue) {
                                if(property == null) {
                                    return storedValue;
                                }
                                
                                if (storedValue instanceof String) {
                                    final String strValue = (String)storedValue;
                                    final String type = property.getType();
                                    
                                    boolean isDynamicSetting = isDynamicSetting(property);
                                    if(isDynamicSetting) {
                                        if (ContextParameterUtils.isContainContextParam(strValue)) {
                                            storedValue = getRealParamValueFromContext(processType, strValue);
                                        }
                                        
                                        //we need to computer it here, if not, exception will appear for can't cast string.class to boolean.class
                                        storedValue = typeConvert(type, storedValue);
                                    } else {
                                        //two cases when isDynamicSetting is false:
                                        //1: basic case: user never use dynamic setting for current property
                                        //2: hell case: user used dynamic setting for current property, but remove the dynamic setting later, that will store value in item, for this case, no need to computer the context value
                                        if("java.lang.String".equals(type)) {
                                            //even case 2, no need to computer it here
                                        } else if("java.lang.Boolean".equals(type)) {
                                            //if context mode for boolean type, is sure case 2 above
                                            if (ContextParameterUtils.isContainContextParam(strValue)) {
                                                storedValue = getRealParamValueFromContext(processType, strValue);
                                            }
                                            
                                            //we need to computer it here, if not, exception will appear for can't cast string.class to boolean.class
                                            storedValue = typeConvert(type, storedValue);
                                        }
                                    }
                                    
                                    //see EnumProperty, it have a bug, for example : "org.talend.components.jdbc.tjdbcoutput.TJDBCOutputProperties$DataAction", whose "$" is stored by ".", then class not found issue
                                    //so have to fix here
                                    
                                    if (GenericTypeUtils.isEnumType(property)) {
                                        String componentName = correctComponentName(oldComponentName);
                                        ComponentProperties newProperties = ComponentsUtils.getComponentProperties(componentName);

                                        Property newProperty = (Property) newProperties.getProperty(property.getName());
                                        if (newProperty == null) {
                                            newProperty = (Property) newProperties.getProperty("dataAction");
                                        }
                                        if (newProperty != null) {
                                            List<?> propertyPossibleValues = ((Property<?>) newProperty).getPossibleValues();
                                            if (propertyPossibleValues != null) {
                                                for (Object possibleValue : propertyPossibleValues) {
                                                    if (possibleValue != null && possibleValue.toString().equals(storedValue)) {
                                                        property.setStoredValue(possibleValue);
                                                        return possibleValue;
                                                    }
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                                
                                return storedValue;
                            }
                        });
                        
                        //go through the tcompv0 self migration
                        ComponentsUtils.getComponentService().postDeserialize(((Properties) properties));
                    }

                }).object;
                
                if(compProperties == null) {
                    return;
                }
                
                //if use label format in current component instance, and label is a defined as a var like tcompv0 model "__sql__", 
                //the code below for that:
                String label = ParameterUtilTool.getParameterValue(nodeType, "LABEL");
                if (label != null && label.contains("_")) {
                    final String oldPath = label.replaceAll("_", "");
                    String value = null;
                    
                    //find from javajet style element parameter
                    ElementParameterType paraType = ParameterUtilTool.findParameterType(nodeType, oldPath);
                    if (paraType != null) {
                        value = paraType.getValue();
                    } else {
                        //find from tcompv0 model json
                        NamedThing nt = compProperties.getProperty(oldPath);
                        if(nt != null) {
                            if(nt instanceof Property) {
                                Object storedValue = Property.class.cast(nt).getStoredValue();
                                if(storedValue != null) {
                                    value = storedValue.toString();
                                }
                            }
                        }
                    }
                    
                    if(value != null) {
                        ParameterUtilTool.findParameterType(nodeType, "LABEL").setValue(value);
                    }
                }
                
                final TalendFileFactory fileFact = TalendFileFactory.eINSTANCE;
                
                for(TckMigrationModel model : infos) {
                    if(model.fieldType == null || model.fieldType.isEmpty()) {
                        //field="TECHNICAL", and oldPath is value directly, so use it directly
                        ElementParameterType ept = ParameterUtilTool.createParameterType("TECHNICAL", model.newPath, model.oldPath);
                        ParameterUtilTool.addParameterType(nodeType, ept);
                    } else {
                        if("COMPONENT_LIST".equals(model.fieldType)) {
                            final Enum<?> referenceType = Enum.class.cast(Property.class.cast(compProperties.getProperty(model.oldPath + ".referenceType")).getStoredValue());
                            //USE_EXISTING_CONNECTION field may exist after migration from javajet to tcompv0, so here consider it
                            final ElementParameterType oldUseConnectionElement = ComponentUtilities.getNodeProperty(nodeType, "USE_EXISTING_CONNECTION");
                            if(oldUseConnectionElement == null) {
                                ComponentUtilities.addNodeProperty(nodeType, "USE_EXISTING_CONNECTION", "CHECK");
                            }
                            
                            ComponentUtilities.addNodeProperty(nodeType, model.newPath, "COMPONENT_LIST");
                            ComponentUtilities.setNodeValue(nodeType, model.newPath, "");
                            if(referenceType == null || "THIS_COMPONENT".equals(referenceType.name())) {
                                if(oldUseConnectionElement == null) {
                                    ComponentUtilities.setNodeValue(nodeType, "USE_EXISTING_CONNECTION", "false");
                                }
                            } else {
                                final Object value = Property.class.cast(compProperties.getProperty(model.oldPath + ".componentInstanceId")).getStoredValue();
                                ComponentUtilities.setNodeValue(nodeType, model.newPath, value == null ? "" : String.valueOf(value));
                                
                                if(oldUseConnectionElement == null && value != null) {
                                    ComponentUtilities.setNodeValue(nodeType, "USE_EXISTING_CONNECTION", "true");
                                }
                            }
                        } else if("TABLE".equals(model.fieldType)) {
                            final java.util.List<ElementValueType> elementValues = new ArrayList<ElementValueType>();
                            String[] tableColumnMappings = model.oldPath.split(";");
                            int[] rowStarts = null;
                            for(String mapping : tableColumnMappings) {
                                String[] oldPathAndNewPath = mapping.split("=");
                                String oldPath = oldPathAndNewPath[0];
                                String newPath = oldPathAndNewPath[1];
                                
                                Property<?> property = Property.class.cast(compProperties.getProperty(oldPath));
                                Object originValue = property.getStoredValue();
                                if(originValue == null) {
                                    //any list is null, break directly as tcompv0 table store every column as list, their size should be the same,
                                    //but have some special case, the code below process it
                                    elementValues.clear();
                                    break;
                                }

                                final List<Object> value;
                                if(List.class.isInstance(originValue)) {
                                    value = List.class.cast(originValue);
                                    if(rowStarts == null) {//as common, the first column should return a full list, not lose row in ui
                                        rowStarts = new int[value.size()];
                                        int elementValueSize = rowStarts.length * tableColumnMappings.length;
                                        for(int i=0;i<elementValueSize;i++) {
                                            elementValues.add(null);
                                        }
                                        for(int i=0;i<rowStarts.length;i++) {
                                            rowStarts[i] = i * tableColumnMappings.length;
                                        }
                                    }
                                } else {
                                    //no idea why tcompv0 model not return list, process it here
                                    value = new ArrayList<>();
                                    if(rowStarts != null) {
                                        for(int i=0;i<rowStarts.length;i++) {//correct the wrong list length
                                            value.add(originValue);
                                        }
                                    }
                                }
                                if(rowStarts != null) {
                                    for(int i=0;i<rowStarts.length;i++) {
                                        ElementValueType elementValue = fileFact.createElementValueType();
                                        elementValue.setElementRef(model.newPath + "[]."+ newPath);
                                    
                                        Object item = i<value.size() ? value.get(i) : null;//have to process the strange tcompv0 model
                                        elementValue.setValue(item == null ? null : String.valueOf(item));
                                    
                                        //here for match tck model requirement in item, that need order
                                        elementValues.set(rowStarts[i]++, elementValue);
                                    }
                                }
                            }
                            ComponentUtilities.addNodeProperty(nodeType, model.newPath, "TABLE");
                            ComponentUtilities.setNodeProperty(nodeType, model.newPath, elementValues);
                        } else if("PASSWORD".equals(model.fieldType)) {
                            Property property = Property.class.cast(compProperties.getProperty(model.oldPath));
                            String value = String.class.cast(property.getStoredValue());
                            if(value != null) {//TODO check if user not set password(default is "\"\""), or empty string as user remove default one
                                if(value.length() > 1 && value.startsWith("\"") && value.endsWith("\"")) {
                                    //need to encrypt with double quote
                                    value = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.SYSTEM).encrypt(value);
                                } else {//a var like context.pwd, no need to encrypt
                                    //tuj TDI44051_tJDBCInput_MySQL5_Dynamic_SpecialCharacter will return a wrong password with char 0x1b that is not valid for studio item store
                                    //and also if TDI44051_tJDBCInput_MySQL5_Dynamic_SpecialCharacter not use existed connection and generate current password in generated code, 
                                    //the generated code will be wrong too, so set value to null if that
                                    String invalid = "" + (char)27;
                                    if(value.contains(invalid)) {//indexOf(int) works for unicode? not sure, so not use
                                        value = null;
                                    }
                                }
                            }
                            ElementParameterType ept = ParameterUtilTool.createParameterType(model.fieldType, model.newPath, value);
                            ParameterUtilTool.addParameterType(nodeType, ept);
                        } else if("TECHNICAL".equals(model.fieldType)) {
                            ElementParameterType ept = ParameterUtilTool.findParameterType(nodeType, model.oldPath);
                            if(ept != null) {
                                ept.setName(model.newPath);
                            }
                        } else if ("CHECK".equals(model.fieldType) || "CLOSED_LIST".equals(model.fieldType) || "RADIO".equals(model.fieldType)) {
                            Property property = Property.class.cast(compProperties.getProperty(model.oldPath));
                            Object value = property.getStoredValue();
                            
                            //if CHECK/CLOSED_LIST/RADIO use context value here, it mean they are dynamic setting now, or use dynamic setting before(add dynamic setting and remove it later)
                            if (value instanceof String && ContextParameterUtils.isContainContextParam((String) value)) {
                                value = getRealParamValueFromContext(processType, (String) value);
                            }
                            
                            ElementParameterType ept = ParameterUtilTool.createParameterType(model.fieldType, model.newPath,
                                    value == null ? null : correctValue(model.oldPath, String.valueOf(value)));
                            ParameterUtilTool.addParameterType(nodeType, ept);
                        } else {
                            Property property = Property.class.cast(compProperties.getProperty(model.oldPath));
                            Object value = property.getStoredValue();
                            // enum's tostring to call name(), so ok
                            ElementParameterType ept = ParameterUtilTool.createParameterType(model.fieldType, model.newPath,
                                    value == null ? null : correctValue(model.oldPath, String.valueOf(value)));
                            ParameterUtilTool.addParameterType(nodeType, ept);
                        }
                    }
                }
                
                // Migrate schemas : the reverse action with the one in NewComponentFrameworkMigrationTask
                final String uniqueName = ParameterUtilTool.getParameterValue(nodeType, "UNIQUE_NAME");
                final EList<MetadataType> metadatas = nodeType.getMetadata();
                int indexOfFlow = -1;
                boolean mainExists = false;
                for (int i=0;i<metadatas.size();i++) {
                    final MetadataType metadataType = metadatas.get(i);
                    
                    if("FLOW".equals(metadataType.getConnector()) && uniqueName.equals(metadataType.getName())) {
                        indexOfFlow = i;
                    } if("MAIN".equals(metadataType.getConnector()) && "MAIN".equals(metadataType.getName())) {//tcompV0 use "MAIN" to match connection default
                        mainExists = true;
                        
                        metadataType.setConnector("FLOW");
                        metadataType.setName(uniqueName);
                        
                        for (Object connectionObj : processType.getConnection()) {
                            if (connectionObj instanceof ConnectionType) {
                                ConnectionType connectionType = (ConnectionType) connectionObj;
                                if (connectionType.getSource().equals(uniqueName)
                                        && connectionType.getConnectorName().equals("MAIN")) {
                                    connectionType.setConnectorName("FLOW");
                                    connectionType.setMetaname(uniqueName);
                                }
                            }
                        }
                    } else if("REJECT".equals(metadataType.getConnector()) && "REJECT".equals(metadataType.getName())) {
                        //TODO tck jdbc connector special? check it
                        metadataType.setConnector("reject");
                        metadataType.setName("reject");
                        
                        for (Object connectionObj : processType.getConnection()) {
                            if (connectionObj instanceof ConnectionType) {
                                ConnectionType connectionType = (ConnectionType) connectionObj;
                                if (connectionType.getSource().equals(uniqueName)
                                        && connectionType.getConnectorName().equals("REJECT")) {
                                    connectionType.setConnectorName("reject");
                                    connectionType.setMetaname("reject");
                                }
                            }
                        }
                    }
                }
                //here consider tcompv0 model and javajet model for schema part both, as common, migration should only consider the lastest status/model, 
                //but seems if old javajet jdbc component import, the schema part keep the old format, not tcompv0 format
                if(mainExists && indexOfFlow > -1) { 
                    metadatas.remove(indexOfFlow);
                }
                
                //remove tcompv0 PROPERTIES element at last
                ParameterUtilTool.removeParameterType(nodeType, tcompV0PropertiesElement);
                
                ElementParameterType familyElementParameter = ParameterUtilTool.findParameterType(nodeType, "FAMILY");
                if(familyElementParameter != null) {
                    ParameterUtilTool.removeParameterType(nodeType, familyElementParameter);
                }
                
                ElementParameterType versionElementParameter = ParameterUtilTool.findParameterType(nodeType, "VERSION");
                if(versionElementParameter != null) {
                    ParameterUtilTool.removeParameterType(nodeType, versionElementParameter);
                }
                
                ElementParameterType componentElementParameter = ParameterUtilTool.findParameterType(nodeType, "COMPONENT_NAME");
                if(componentElementParameter != null) {
                    ParameterUtilTool.removeParameterType(nodeType, componentElementParameter);
                }
                
                //no need to change the unique name as it use unify name like "tDBInput_1", and tcompv0's node's metadata(metadata name/connection name/schema) in item match the connection by the unique name,
                //so no need to migrate the metadata/connection line from tcompv0 to tck, it should work.
            }
        };

        if (processType != null) {
            boolean modified = false;
            for (Object obj : processType.getNode()) {
                if (obj != null && obj instanceof NodeType) {
                    String componentName = ((NodeType) obj).getComponentName();
                    if (props.get(componentName) == null) {
                        continue;
                    }
                    IComponentFilter filter = new NameComponentFilter(componentName);
                    modified = ModifyComponentsAction.searchAndModify((NodeType) obj, filter,
                            Arrays.<IComponentConversion> asList(conversion))
                            || modified;
                }
            }
            if (modified) {
                try {
                    ProxyRepositoryFactory.getInstance().save(item, true);
                    return ExecutionResult.SUCCESS_NO_ALERT;
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                    return ExecutionResult.FAILURE;
                }
            }
        }
        return ExecutionResult.NOTHING_TO_DO;
    }
    
    protected String correctComponentName(String componentName) {
        if (componentName.indexOf("tSingleStore") >= 0) {
           return componentName.replace("tSingleStore", "tJDBC");
        }
        if (componentName.indexOf("tDeltaLake") >= 0) {
            return componentName.replace("tDeltaLake", "tJDBC");
        }
        return componentName;
    }
    
    protected String correctValue(String path, String value) {
        return value;
    }

    abstract protected String getMigrationFile();
    
    private Pattern pattern = Pattern.compile("(t?\\w++)(\\.([a-zA-Z_:.]++))?=([^#]++)(#([a-zA-Z_]++))?");

    private Map<String, List<TckMigrationModel>> getMigrationInfoFromFile() {
        Map<String, List<TckMigrationModel>> result = new HashMap<>();
        try(InputStream in = getClass().getResourceAsStream(getMigrationFile());BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF8"))) {
            List<TckMigrationModel> modelList = new ArrayList<>();
            
            String oldComponentName = null;
            
            String line = null;
            while(true) {
                if((line = br.readLine())==null) {
                    if(oldComponentName!=null) {
                        result.put(oldComponentName, modelList);
                    }
                    break;
                }
                
                if(line.trim().isEmpty()) {//next component
                    if(oldComponentName!=null) {
                        result.put(oldComponentName, modelList);
                        modelList = new ArrayList<>();
                    }
                    continue;
                }
                
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()) {
                    final TckMigrationModel model = new TckMigrationModel();
                    model.newComponentName = matcher.group(1);
                    model.newPath = matcher.group(3);
                    if(model.newPath == null || model.newPath.isEmpty()) {
                        oldComponentName = matcher.group(4);
                        model.oldComponentName = oldComponentName;
                    } else {
                        model.oldPath = matcher.group(4);
                        model.fieldType = matcher.group(6);
                        
                        modelList.add(model);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    
    private static String getRealParamValueFromContext(ProcessType processType, String value) {
        String var = ContextParameterUtils.getVariableFromCode(value);
        if (var != null) {
            String defaultContextName = processType.getDefaultContext();
            ContextType selectedContext = null;
            for (Object obj : processType.getContext()) {
                if (obj instanceof ContextType) {
                    if (defaultContextName.equals(((ContextType) obj).getName())) {
                        selectedContext = (ContextType) obj;
                    }
                }
            }
            if (selectedContext != null) {
                ContextParameterType param = ContextUtils.getContextParameterTypeByName(selectedContext, var);
                if (param != null) {
                    return param.getValue();
                }
            }
        }
        return value;
    }

}

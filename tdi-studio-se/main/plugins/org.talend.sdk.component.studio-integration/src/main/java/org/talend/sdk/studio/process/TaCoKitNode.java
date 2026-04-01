package org.talend.sdk.studio.process;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.talend.sdk.component.studio.util.TaCoKitConst.BASE64_PREFIX;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.impl.NodeTypeImpl;
import org.talend.designer.core.model.utils.emf.talendfile.impl.TalendFileFactoryImpl;
import org.talend.sdk.component.server.front.model.ComponentDetail;
import org.talend.sdk.component.server.front.model.ConfigTypeNode;
import org.talend.sdk.component.server.front.model.SimplePropertyDefinition;
import org.talend.sdk.component.studio.Lookups;
import org.talend.sdk.component.studio.model.parameter.PropertyDefinitionDecorator;
import org.talend.sdk.component.studio.model.parameter.VersionParameter;
import org.talend.sdk.component.studio.model.parameter.WidgetTypeMapper;
import org.talend.sdk.component.studio.util.TaCoKitConst;

/**
 * Wrapper for NodeTypeImpl - class which represents persisted node (component in the process).
 * Provides additional functionality
 */
public final class TaCoKitNode {

    public static final String TACOKIT_COMPONENT_ID = "TACOKIT_COMPONENT_ID";

    public static final String TACOKIT_METADATA_TYPE_ID = "TACOKIT_METADATA_TYPE_ID";

    private final NodeTypeImpl node;

    private final ComponentDetail detail;

    private final String compType;

    private static Collection<String> commonParameterNames = null;

    public TaCoKitNode(final NodeTypeImpl node, final String componentType) {
        Objects.requireNonNull(node, "Node should not be null");
        if (!isTacokit(node)) {
            throw new IllegalArgumentException("It is not Tacokit node " + node.getComponentName());
        }
        this.node = node;
        final String componentId = getComponentId(node).orElseThrow(() ->
                new IllegalStateException("No component detail for " + node.getComponentName()));
        this.detail = Lookups.service().getDetailById(componentId);
        this.compType = componentType == null ? ComponentCategory.CATEGORY_4_DI.getName() : componentType;
    }

    public String getId() {
        return detail.getId().getId();
    }

    public boolean needsMigration() {
        if (isVirtualComponentNode() && !Lookups.taCoKitCache().isVirtualConnectionComponent(node.getComponentName())) {
            return false;
        }
        final int currentVersion = detail.getVersion();
        final int persistedVersion = getPersistedVersion();
        if (currentVersion < persistedVersion) {
            throw new IllegalStateException("current version: " + currentVersion + " persisted version: " + persistedVersion);
        }
        return currentVersion != persistedVersion;
    }

    public Map<String, String> getPropertiesToMigrate(boolean encode) {
        Map<String, String> properties = new HashMap<>();
        @SuppressWarnings("rawtypes")
        EList parameters = node.getElementParameter();
        for (final Object elem : parameters) {
            ElementParameterType parameter = (ElementParameterType) elem;
            if (!isCommonParameterName(parameter.getName())) {
                if (EParameterFieldType.TABLE.name().equals(parameter.getField())) {
                    addTableElementValue(properties, parameter);
                } else if (!EParameterFieldType.TECHNICAL.name().equals(parameter.getField())
                        || parameter.getName().endsWith(VersionParameter.VERSION_SUFFIX)) {
                    String value = null;
                    if (encode) {
                        // we encode anything that may be escaped to avoid jsonb transform errors
                        final String encodedValue = Base64.getUrlEncoder().encodeToString(parameter.getValue().getBytes(UTF_8));
                        value = BASE64_PREFIX + encodedValue;
                    } else {
                        value = parameter.getValue();
                    }
                    properties.put(parameter.getName(), value);
                }
            }
        }

        return properties;
    }

    private Collection<SimplePropertyDefinition> getPropertyDefinition() {
        Collection<SimplePropertyDefinition> props = null;
        if (isVirtualComponentNode()) {
            String family = Lookups.service().getDetail(node.getComponentName()).get().getId().getFamily();
            ConfigTypeNode configTypeNode = Lookups.taCoKitCache().findDatastoreConfigTypeNodeByName(family);
            props = configTypeNode.getProperties();
        } else {
            props = detail.getProperties();
        }
        return props;
    }

    private boolean isVirtualComponentNode() {
        String componentName = node.getComponentName();
        return Lookups.taCoKitCache().isVirtualComponentName(componentName);
    }

    private void addTableElementValue(Map<String, String> properties, ElementParameterType tableElementParam) {
        List list = tableElementParam.getElementValue();
        if (list != null) {
            int index = 0;
            String firstColumnKey = null;
            for (int i = 0; i < list.size(); i++) {
                Object value = list.get(i);
                if (value instanceof ElementValueType) {
                    ElementValueType eValue = (ElementValueType) value;
                    if (firstColumnKey == null) {
                        firstColumnKey = eValue.getElementRef();
                    } else if (firstColumnKey.equals(eValue.getElementRef())){
                        index++;
                    }
                    String paramName = getTableParamName(index, eValue);
                    if (paramName != null) {
                        properties.put(paramName, eValue.getValue());
                    }
                }
            }
        }
    }

    private String getTableParamName(int index, ElementValueType elementValueType) {
        String paramValue = elementValueType.getElementRef();
        if (paramValue != null && paramValue.indexOf("[") >= 0 && paramValue.indexOf("]") > 0) {
            StringBuffer sb = new StringBuffer();
            sb.append(paramValue.substring(0, paramValue.indexOf("[") + 1)).append(index)
                    .append(paramValue.substring(paramValue.indexOf("]")));
            return sb.toString();
        }
        return null;
    }

    private boolean isComponentProperty(Collection<SimplePropertyDefinition> props, final String name) {
        return props.stream().anyMatch(property -> property.getPath().equals(name));
    }

    @SuppressWarnings("unchecked")
    public void migrate(final Map<String, String> properties) {
        final List<ElementParameterType> noMigration = getParametersExcludedFromMigration();
        final List<ElementParameterType> tableFieldParamList = getTableFieldParameterFromMigration();
        node.getElementParameter().clear();
        node.getElementParameter().addAll(noMigration);

        Collection<SimplePropertyDefinition> props = getPropertyDefinition();
        properties.entrySet().stream()
                .filter(e -> (isComponentProperty(props, e.getKey()) && !(Pattern.compile("(\\[)\\d+(\\])")
                        .matcher(e.getKey())
                        .find())))
                .forEach(e -> node.getElementParameter().add(createParameter(e.getKey(), e.getValue())));
        properties.entrySet().stream().filter(e -> e.getKey().endsWith(VersionParameter.VERSION_SUFFIX)).forEach(e -> {
            final ElementParameterType parameter = TalendFileFactoryImpl.eINSTANCE.createElementParameterType();
            parameter.setName(e.getKey());
            parameter.setValue(e.getValue());
            parameter.setField(EParameterFieldType.TECHNICAL.getName());
            parameter.setShow(false);
            node.getElementParameter().add(parameter);
        });
        properties.entrySet().stream().filter(e -> Pattern.compile("(\\[)\\d+(\\])").matcher(e.getKey()).find())
                .forEach(e -> fillTableParamData(tableFieldParamList, e.getKey(), e.getValue()));
        node.getElementParameter().addAll(tableFieldParamList);
        node.setComponentVersion(Integer.toString(detail.getVersion()));
    }

    private void fillTableParamData(List<ElementParameterType> tableFieldParamList, String paramKey, String paramValue) {
        String paramName = paramKey.substring(0, paramKey.indexOf("["));
        String elemRef = paramKey.substring(0, paramKey.indexOf("[") + 1) + paramKey.substring(paramKey.indexOf("]"));
        int paramIndex = Integer.parseInt(paramKey.substring(paramKey.indexOf("[") + 1, paramKey.indexOf("]")));
        ElementParameterType sameNameParam = null;
        for (ElementParameterType param : tableFieldParamList) {
            if (param.getName().equals(paramName)) {
                sameNameParam = param;
                List list = param.getElementValue();
                int index = 0;
                for (int i = 0; i < list.size(); i++) {
                    ElementValueType eValue = (ElementValueType) list.get(i);
                    if (elemRef.equals(eValue.getElementRef())) {
                        if (paramIndex == index) {
                            eValue.setValue(paramValue);
                            return;
                        } else {
                            index ++;
                        }
                    }
                }
            }              
        }
        if (sameNameParam == null) {
            sameNameParam = TalendFileFactoryImpl.eINSTANCE.createElementParameterType();
            sameNameParam.setName(paramName);
            sameNameParam.setField(EParameterFieldType.TABLE.name());
            tableFieldParamList.add(sameNameParam);
        }
        ElementValueType elementValueType = TalendFileFactoryImpl.eINSTANCE.createElementValueType();
        elementValueType.setElementRef(elemRef);
        elementValueType.setValue(paramValue);
        sameNameParam.getElementValue().add(elementValueType);
    }

    private ElementParameterType createParameter(final String name, final String value) {
        final ElementParameterType parameter = TalendFileFactoryImpl.eINSTANCE.createElementParameterType();
        parameter.setName(name);
        parameter.setValue(value);
        parameter.setField(getPropertyType(name));
        return parameter;
    }

    private SimplePropertyDefinition getProperty(final String path) {
        Collection<SimplePropertyDefinition> props = getPropertyDefinition();
        return props.stream().filter(property -> property.getPath().equals(path)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find property for name: " + path));
    }

    private String getPropertyType(final String path) {
        final PropertyDefinitionDecorator property = PropertyDefinitionDecorator.wrap(getProperty(path));
        return new WidgetTypeMapper().getFieldType(property).getName();
    }

    private List<ElementParameterType> getTableFieldParameterFromMigration() {
        List<ElementParameterType> list = new ArrayList<>();
        for (final Object elem : node.getElementParameter()) {
            if (EParameterFieldType.TABLE.name().equals(((ElementParameterType) elem).getField())) {
                list.add((ElementParameterType) elem);
            }
        }
        return list;
    }

    private List<ElementParameterType> getParametersExcludedFromMigration() {
        List<ElementParameterType> technical = new ArrayList<>();
        for (final Object elem : node.getElementParameter()) {
            if (isCommonParameterName(((ElementParameterType) elem).getName())) {
                technical.add((ElementParameterType) elem);
            }
        }
        return technical;
    }

    public int getPersistedVersion() {
        return Integer.parseInt(node.getComponentVersion());
    }

    public static boolean isTacokit(final NodeTypeImpl node) {
        return getComponentId(node).isPresent();
    }

    private static Optional<String> getComponentId(final NodeTypeImpl node) {
        for (final Object elem : node.getElementParameter()) {
            ElementParameterType parameter = (ElementParameterType) elem;
            if (TACOKIT_COMPONENT_ID.equals(parameter.getName())) {
                return Optional.ofNullable(parameter.getValue());
            }
        }
        return Optional.empty();
    }

    private static boolean isCommonParameterName(String paramName) {
        if (paramName == null) {
            return false;
        }
        if (paramName.endsWith(":" + EParameterName.PROPERTY_TYPE)
                || paramName.endsWith(":" + EParameterName.REPOSITORY_PROPERTY_TYPE)) {
            return true;
        }
        return getCommonParameterNames().contains(paramName);
    }

    private static Collection<String> getCommonParameterNames() {
        if (commonParameterNames == null) {
            Collection<String> paramNames = new HashSet<>();
            paramNames.add(TACOKIT_COMPONENT_ID);
            paramNames.add(TACOKIT_METADATA_TYPE_ID);
            paramNames.add(TaCoKitConst.TACOKIT_COMPONENT_PLUGIN_NAME);
            for (EParameterName parameter : EParameterName.values()) {
                paramNames.add(parameter.getName());
            }
            commonParameterNames = paramNames;
        }
        return commonParameterNames;
    }
}

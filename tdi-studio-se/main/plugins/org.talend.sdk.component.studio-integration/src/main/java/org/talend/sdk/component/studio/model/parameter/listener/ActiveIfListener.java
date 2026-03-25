/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.model.parameter.listener;

import static java.util.Locale.ROOT;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toMap;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.IElement;
import org.talend.core.model.process.IElementParameter;
import org.talend.designer.core.model.components.DummyComponent;
import org.talend.designer.core.model.process.DataNode;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.sdk.component.studio.model.parameter.PropertyDefinitionDecorator;
import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter;
import org.talend.sdk.component.studio.model.parameter.TableElementParameter;
import org.talend.sdk.component.studio.model.parameter.TextElementParameter;
import org.talend.sdk.component.studio.model.parameter.condition.ConditionGroup;
import org.talend.sdk.component.studio.util.TaCoKitConst;

/**
 * {@link PropertyChangeListener}, which activates/deactivates {@link IElementParameter} according target
 * {@link IElementParameter} new value
 * If new value is the same as one of specified <code>values</code>, then {@link ActiveIfListener} activates (shows)
 * {@link IElementParameter}.
 * Else it deactivates {@link IElementParameter}
 */
public class ActiveIfListener implements PropertyChangeListener {
    private static final Function<Object, String> TOSTRING_PREPROCESSOR =
            v -> v == null ? null : String.valueOf(v);
    private static final Function<Object, String> LOWERCASE_TOSTRING_PREPROCESSOR =
            v -> v == null ? null : String.valueOf(v).toLowerCase(ROOT);

    private final Collection<ConditionGroup> conditions;

    private final Map<String, TaCoKitElementParameter> targetParams;

    /**
     * Parameter which visibility is controlled by ActiveIfs annotations
     */
    private final TaCoKitElementParameter sourceParameter;

    public ActiveIfListener(
            final Collection<ConditionGroup> conditions,
            final TaCoKitElementParameter sourceParam,
            final Map<String, TaCoKitElementParameter> targetParams) {
        this.conditions = conditions;
        this.sourceParameter = sourceParam;
        this.targetParams = targetParams;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        if(!"value".equals(event.getPropertyName())){
            return;
        }
        final boolean show = conditions.stream()
                .allMatch(group -> group.getAggregator().apply(group.getConditions().stream().map(this::evaluateCondition)));
        if(sourceParameter.isDisplayedByDefault()  != show) {
            sourceParameter.setShow(show);
            sourceParameter.redraw(); // request source parameter redraw
            sourceParameter.firePropertyChange("show", null, show);
            //need to revalidate to either show or hide the validation label
            sourceParameter.firePropertyChange("value", null, sourceParameter.getValue());
        }
    }

    public void propertyShow() {
        final boolean show = conditions.stream()
                .allMatch(group -> group.getAggregator().apply(group.getConditions().stream().map(this::evaluateCondition)));
        sourceParameter.setShow(show);
        sourceParameter.redraw(); // request source parameter redraw
    }

    private boolean evaluateCondition(final PropertyDefinitionDecorator.Condition cond) {
        if (targetParams.get(cond.getTargetPath()) == null) {
            return evaluteScope(cond);
        }
        return cond.isNegation() != Stream.of(cond.getValues()).anyMatch(val -> evalute(cond, val));
    }

    private boolean evalute(final PropertyDefinitionDecorator.Condition condition, final String value) {
        final String evaluationStrategy = condition.getEvaluationStrategy().toUpperCase(ROOT);

        final TaCoKitElementParameter targetParam = targetParams.get(condition.getTargetPath());
        switch (evaluationStrategy) {
            case "DEFAULT":
                return value.equals(TOSTRING_PREPROCESSOR.apply(targetParam.getStringValue()));
            case "LENGTH":
                if (targetParam.getValue() == null) {
                    return "0".equals(value);
                }
                final int expectedSize = Integer.parseInt(value);
                if (TextElementParameter.class.isInstance(targetParam)) {
                    return ofNullable(targetParam.getStringValue()).map(String::length).orElse(0) == expectedSize;
                }
                if (TableElementParameter.class.isInstance(targetParam)) {
                    return ofNullable(List.class.cast(targetParam.getValue())).map(Collection::size).orElse(0) == expectedSize;
                }
                return false; // unsupported
            default:
                Function<Object, String> preprocessor = TOSTRING_PREPROCESSOR;
                if (evaluationStrategy.startsWith("CONTAINS")) {
                    final int start = evaluationStrategy.indexOf('(');
                    if (start >= 0) {
                        final int end = evaluationStrategy.indexOf(')', start);
                        if (end >= 0) {
                            final Map<String, String> configuration = Stream.of(condition.getEvaluationStrategy().substring(start + 1, end).split(","))
                                .map(String::trim)
                                .filter(it -> !it.isEmpty())
                                .map(it -> {
                                    final int sep = it.indexOf('=');
                                    if (sep > 0) {
                                        return new String[]{ it.substring(0, sep), it.substring(sep + 1) };
                                    }
                                    return new String[] { "value", it };
                                })
                                .collect(toMap(a -> a[0], a -> a[1]));
                            if (Boolean.parseBoolean(configuration.getOrDefault("lowercase", "false"))) {
                                preprocessor = LOWERCASE_TOSTRING_PREPROCESSOR;
                            }
                        }
                    }
                    if (TaCoKitElementParameter.class.isInstance(targetParam)) {
                        return ofNullable(preprocessor.apply(targetParam.getStringValue()))
                                .map(it -> it.contains(value))
                                .orElse(false);
                    }
                    if (TableElementParameter.class.isInstance(targetParam)) {
                        return ofNullable(List.class.cast(targetParam.getValue()))
                                .map(Collection::stream)
                                .orElseGet(Stream::empty)
                                .map(preprocessor)
                                .anyMatch(it -> it.toString()/*compile hack, jdk 8_u161*/.contains(value));
                    }
                    return false;
                }
                throw new IllegalArgumentException("Not supported operation '" + evaluationStrategy + "'");
        }
    }

    private boolean evaluteScope(final PropertyDefinitionDecorator.Condition cond) {
        String[] values = cond.getValues();
        String targetPath = cond.getTargetPath();
        if (TaCoKitConst.TARGET.equalsIgnoreCase(targetPath)) {
            TaCoKitElementParameter targetParam = targetParams.get(cond.getPath());
            if (targetParam == null && sourceParameter.getName().equals(cond.getPath())) {
                targetParam = sourceParameter;
            }
            if (targetParam != null) {
                List contexts = evaluteContext(targetParam);
                for (String value : values) {
                    String[] scopes = value.split(","); //$NON-NLS-1$
                    for (String scope : scopes) {
                        if (contexts.contains(scope)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private List evaluteContext(TaCoKitElementParameter targetParam) {
        List<String> contextList = new ArrayList<String>();
        contextList.add(TaCoKitConst.STUDIO_SCOPE);
        if (targetParam != null) {
            boolean checkComponent = false;
            IComponent component = null;
            IElement element = targetParam.getElement();
            if (element instanceof DataNode) {
                component = ((DataNode) element).getComponent();
                if (component instanceof DummyComponent) {
                    // wizard
                    contextList.add(TaCoKitConst.STUDIO_METADATA_SCOPE);
                } else {
                    checkComponent = true;
                }
            } else if (element instanceof Node) {
                component = ((Node) element).getComponent();
                checkComponent = true;
            }
            if (checkComponent) {
                contextList.add(TaCoKitConst.STUDIO_COMPONENT_SCOPE);
                if (component != null) {
                    String componentName = component.getName();
                    if (componentName != null && componentName.endsWith("Connection")) { //$NON-NLS-1$
                        contextList.add(TaCoKitConst.STUDIO_CONNECTION_COMPONENT_SCOPE);
                    }
                }
            }
        }
        return contextList;
    }
}

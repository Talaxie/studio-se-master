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
package org.talend.sdk.component.studio.ui.composite;

import static java.util.stream.Stream.of;
import static org.talend.sdk.component.studio.model.parameter.SchemaElementParameter.guessButtonName;

import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.gmf.util.DisplayUtils;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.IElementParameter;
import org.talend.designer.core.model.FakeElement;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.properties.controllers.ISWTBusinessControllerUI;
import org.talend.designer.core.ui.views.properties.composites.MissingSettingsMultiThreadDynamicComposite;
import org.talend.sdk.component.studio.model.parameter.Layout;
import org.talend.sdk.component.studio.model.parameter.LayoutParameter;
import org.talend.sdk.component.studio.model.parameter.Level;
import org.talend.sdk.component.studio.model.parameter.Metadatas;
import org.talend.sdk.component.studio.model.parameter.TaCoKitElementParameter;
import org.talend.sdk.component.studio.ui.composite.problemmanager.IProblemManager;
import org.talend.sdk.component.studio.util.TaCoKitConst;

/**
 * Registers PropertyChangeListener for each IElementParameter during instantiation
 * PropertyChangeListener refreshes layout after each IElementParameter value update
 */
public class TaCoKitComposite extends MissingSettingsMultiThreadDynamicComposite {

    /**
     * Indent between component options on properties form
     */
    private static final int OPTIONS_INDENT = Platform.getOS().equals(Platform.OS_LINUX) ? 0 : 2;

    private List<? extends IElementParameter> parameters;

    private final IProblemManager problemManager;

    protected Composite commonComposite;

    private String form;

    private PropertyChangeListener redrawListener = evt -> {
        if (!"show".equals(evt.getPropertyName())) {
            return;
        }
        refresh();
    };

    public TaCoKitComposite(final Composite parentComposite, final int styles, final EComponentCategory section,
            final Element element, final boolean isCompactView, final IProblemManager problemManager) {
        super(parentComposite, styles, section, element, isCompactView);
        this.problemManager = problemManager;
        form = section == EComponentCategory.ADVANCED ? Metadatas.ADVANCED_FORM : Metadatas.MAIN_FORM;
        registProblemManager();
        postInit();
    }

    TaCoKitComposite(final Composite parentComposite, final int styles, final EComponentCategory section, final Element element,
            final boolean isCompactView, final Color backgroundColor, final IProblemManager problemManager) {
        super(parentComposite, styles, section, element, isCompactView, backgroundColor);
        this.problemManager = problemManager;
        form = section == EComponentCategory.ADVANCED ? Metadatas.ADVANCED_FORM : Metadatas.MAIN_FORM;
        registProblemManager();
        postInit();
    }

    private void registProblemManager() {
        if (this.problemManager != null) {
            this.problemManager.registTckComposite(this);
        }
        elem.getElementParameters().stream().filter(Objects::nonNull).filter(TaCoKitElementParameter.class::isInstance)
                .map(TaCoKitElementParameter.class::cast).forEach(p -> {
                    /**
                     * Regist validators, so that problems from validators can be shown using problem manager
                     */
                    p.getRegistValidatorCallback().ifPresent(r -> {
                        try {
                            r.call();
                        } catch (Exception e) {
                            ExceptionHandler.process(e);
                        }
                    });
                    p.setProblemManager(problemManager);
                });
    }

    private void unregistProblemManager() {
        if (this.problemManager != null) {
            this.problemManager.unregistTckComposite(this);
        }
        elem.getElementParameters().stream().filter(Objects::nonNull).filter(TaCoKitElementParameter.class::isInstance)
                .map(TaCoKitElementParameter.class::cast).forEach(p -> p.setProblemManager(null));
    }

    protected void postInit() {
        elem.getElementParameters().stream()
                .filter(Objects::nonNull)
                .filter(TaCoKitElementParameter.class::isInstance)
                .map(TaCoKitElementParameter.class::cast)
                .filter(p -> p.getForm() == null || p.getForm().equals(form))
                .forEach(p -> p.registerRedrawListener("show", redrawListener));
    }

    protected void preDispose() {
        elem.getElementParameters().stream()
                .filter(Objects::nonNull)
                .filter(TaCoKitElementParameter.class::isInstance)
                .map(TaCoKitElementParameter.class::cast)
                .filter(p -> p.getForm() == null || p.getForm().equals(form))
                .forEach(p -> p.unregisterRedrawListener("show", redrawListener));
    }

    @Override
    public synchronized void dispose() {
        unregistProblemManager();
        preDispose();
        super.dispose();
    }

    @Override
    public void refresh() {
        if (elem instanceof FakeElement) { // sync exec
            DisplayUtils.getDisplay().syncExec(this::operationInThread);
        } else { // async exec
            super.refresh();
        }
    }

    public PropertyChangeListener getRedrawListener() {
        return redrawListener;
    }

    /**
     * Specifies minimal height of current UI element
     *
     * @return minimal height
     */
    @Override
    public int getMinHeight() {
        if (minHeight < 200) {
            return 200;
        } else if (minHeight > 700) {
            return 700;
        }
        return minHeight;
    }

    /**
     * Initialize all components for the defined section for this node.
     * Note, the method was copied from MultipleThreadDynamicComposite
     *
     * @param forceRedraw  defines whether to force redraw or not
     * @param reInitialize defines whether Composite is re-initialized. If yes, then children are disposed
     * @param height       not used, but it is here, because the method is overridden
     */
    @Override
    protected synchronized void placeComponents(final boolean forceRedraw, final boolean reInitialize,
            final int height) {
        // achen modifed to fix feature 0005991 if composite.isDisposed return
       if (elem == null || composite.isDisposed()) {
            return;
        }
        if (!forceRedraw) {
            final boolean needRedraw = isNeedRedraw();
            if (!needRedraw) {
                return;
            }
        }
        if (reInitialize) {
            if (currentComponent != null) {
                disposeChildren();
            }
        }
        hashCurControls = new DualHashBidiMap();
        parameters = elem.getElementParametersWithChildrens();
        generator.initController(this);
        final Composite previousComposite = addCommonWidgets();
        final Optional<Layout> layout = getFormLayout();
        layout.ifPresent(l -> {
            updateQueryTypeLayout(l);
            fillComposite(commonComposite, l, previousComposite);
        });
        resizeScrolledComposite();
    }

    private void updateQueryTypeLayout(Layout layout) {
        if (Node.class.isInstance(elem)) {
            IComponent component = Node.class.cast(elem).getComponent();
            String compName = component.getName();
            if (!compName.equals("JDBCInput") && !compName.equals("JDBCRow")) {
                return;
            }
        }
        final String queryTypeId = "configuration.dataSet.queryType";
        final String sqlQueryId = "configuration.dataSet.sqlQuery";

        if (findParentLayout(queryTypeId, layout, null) != null) {
            return;
        }

        Layout parentLayout = findParentLayout(sqlQueryId, layout, null);
        if (parentLayout != null) {
            Layout sqlQueryLayout = parentLayout.getLevels().stream().flatMap(level -> level.getColumns().stream())
                    .filter(ly -> ly.getPath().equals(sqlQueryId)).findFirst().get();
            Level sqlQueryLevel = parentLayout.getLevels().stream().filter(l -> l.getColumns().contains(sqlQueryLayout))
                    .findFirst().get();

            Level queryTypeLevel = new Level();
            queryTypeLevel.setHeight(1);
            queryTypeLevel.setPosition(sqlQueryLevel.getPosition());

            Layout queryTypeLayout = new Layout(queryTypeId);
            queryTypeLayout.setHeight(1);
            queryTypeLayout.setPosition(sqlQueryLayout.getPosition());

            queryTypeLevel.getColumns().add(queryTypeLayout);

            parentLayout.getLevels().add(parentLayout.getLevels().indexOf(sqlQueryLevel), queryTypeLevel);

            // FIXME if in future there are more layouts after sqlQueryLayout, should set position + 1 for all
            sqlQueryLevel.setPosition(sqlQueryLevel.getPosition() + 1);
            sqlQueryLayout.setPosition(sqlQueryLayout.getPosition() + 1);
        }
    }

    private Layout findParentLayout(String id, Layout layout, Layout parent) {
        if (layout.getPath().equals(id)) {
            return parent;
        }
        if (!layout.getLevels().isEmpty()) {
            for (Level levels : layout.getLevels()) {
                for (Layout ly : levels.getColumns()) {
                    Layout toReturn = findParentLayout(id, ly, layout);
                    if (toReturn != null) {
                        return toReturn;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Adds common widgets on specified {@code parent} Composite.
     * These widgets will shown in the top of parent Composite.
     * The method may be overridden.
     *
     * @return last Composite added
     */
    protected Composite addCommonWidgets() {
        Composite previous = getMessagesComp();
        commonComposite = new Composite(composite, SWT.NONE);
        commonComposite.setBackground(composite.getBackground());
        commonComposite.setLayout(new FormLayout());
        commonComposite.setLayoutData(levelLayoutData(previous));

        final Composite unifiedComposite = addUnified(commonComposite);
        final Composite propertyComposite = addPropertyType(commonComposite, unifiedComposite);
        final Composite existConnectionComposite = addUseExistConnection(commonComposite, propertyComposite);
        final Composite schemaComposite = addSchemas(commonComposite, existConnectionComposite);
        final Composite statCatcherComposite = addStatCatcher(schemaComposite);
        final Composite paralelizeComposite = addParalelize(commonComposite, statCatcherComposite);
        // final Composite queryTypeComposite = addQueryType(commonComposite, paralelizeComposite);
        final Composite lastComposite = addParalelizeNum(commonComposite, paralelizeComposite);
        return lastComposite;
    }

    protected Composite addUnified(final Composite parent) {
        Composite previous = getMessagesComp();
        IElementParameter parameter = elem.getElementParameterFromField(EParameterFieldType.UNIFIED_COMPONENTS);
        if (parameter != null) {
            final Composite unifiedComposite = new Composite(parent, SWT.NONE);
            unifiedComposite.setBackground(parent.getBackground());
            unifiedComposite.setLayout(new FormLayout());
            unifiedComposite.setLayoutData(levelLayoutData(previous, 3));
            addWidgetIfActive(unifiedComposite, parameter);
            return unifiedComposite;
        }
        return previous;
    }

    protected Composite addPropertyType(final Composite parent, final Composite previous) {
        final Composite propertyComposite = new Composite(parent, SWT.NONE);
        propertyComposite.setBackground(parent.getBackground());
        propertyComposite.setLayout(new FormLayout());
        propertyComposite.setLayoutData(levelLayoutData(previous, 3));
        final IElementParameter propertyType = elem.getElementParameter("PROPERTY");
        addWidgetIfActive(propertyComposite, propertyType);
        return propertyComposite;
    }
    
    protected Composite addUseExistConnection(final Composite parent, final Composite previous) {
        Composite previousComposite = previous;
        IElementParameter useExistConnectionParameter = null, connectionParameter = null;
        for (IElementParameter p : parameters) {
            if (TaCoKitConst.PARAMETER_USE_EXISTING_CONNECTION.equals(p.getName())) {
                useExistConnectionParameter = p;
            }
            if (TaCoKitConst.PARAMETER_CONNECTION.equals(p.getName())) {
                connectionParameter = p;
            }
        }
        if (useExistConnectionParameter != null || connectionParameter != null) {
            final Composite connectionComposite = new Composite(parent, SWT.NONE);
            connectionComposite.setBackground(parent.getBackground());
            connectionComposite.setLayout(new FormLayout());
            connectionComposite.setLayoutData(levelLayoutData(previousComposite));
            previousComposite = connectionComposite;
            if (useExistConnectionParameter != null) {
                if (doShow(useExistConnectionParameter)) {
                    Control connectionControl = addWidget(connectionComposite, useExistConnectionParameter, null);
                    if (doShow(connectionParameter)) {
                        addWidget(connectionComposite, connectionParameter, connectionControl);
                    }
                }
            } else if (connectionParameter != null && doShow(connectionParameter)) {
                addWidget(connectionComposite, connectionParameter, null);
            }
        }
        return previousComposite;
    }

    /**
     * Adds activated schemas (show = true), which are not present on layout
     *
     * @param parent   Composite on which schema will be located
     * @param previous Composite which is located above this schema. Schema will be attached to the bottom of prev
     *                 Composite
     * @return Schema Composite
     */
    protected Composite addSchemas(final Composite parent, final Composite previous) {
        Composite previousComposite = previous;
        final List<IElementParameter> activeSchemas = parameters
                .stream()
                .filter(p -> p.getFieldType() == EParameterFieldType.SCHEMA_TYPE)
                .filter(this::doShow)
                .filter(this::isNotPresentOnLayout)
                .collect(Collectors.toList());
        for (final IElementParameter schema : activeSchemas) {
            final Composite schemaComposite = new Composite(parent, SWT.NONE);
            schemaComposite.setBackground(parent.getBackground());
            schemaComposite.setLayout(new FormLayout());
            schemaComposite.setLayoutData(levelLayoutData(previousComposite, 3));
            previousComposite = schemaComposite;
            addSchemaWidget(schemaComposite, schema);
        }
        return previousComposite;
    }

    protected Composite addQueryType(final Composite parent, final Composite previous) {
        final Composite composite = new Composite(parent, SWT.NONE);
        composite.setBackground(parent.getBackground());
        composite.setLayout(new FormLayout());
        composite.setLayoutData(levelLayoutData(previous, 3));
        final IElementParameter param = elem.getElementParameter("QUERYSTORE"); //$NON-NLS-1$
        updateParameters(param);
        addWidgetIfActive(composite, param);
        return composite;
    }

    protected Composite addStatCatcher(final Composite parent) {
        final IElementParameter parameter = elem.getElementParameter(EParameterName.TSTATCATCHER_STATS.getName());
        if (doShow(parameter)) {
            addWidget(parent, parameter, null);
        }
        return parent;
    }

    protected Composite addParalelize(final Composite parent, final Composite previous) {
        final Composite composite = new Composite(parent, SWT.NONE);
        composite.setBackground(parent.getBackground());
        composite.setLayout(new FormLayout());
        composite.setLayoutData(levelLayoutData(previous));
        final IElementParameter parameter = elem.getElementParameter(EParameterName.PARALLELIZE.getName());
        addWidgetIfActive(composite, parameter);
        return composite;
    }

    protected Composite addParalelizeNum(final Composite parent, final Composite previous) {
        final Composite composite = new Composite(parent, SWT.NONE);
        composite.setBackground(parent.getBackground());
        composite.setLayout(new FormLayout());
        composite.setLayoutData(levelLayoutData(previous));
        final IElementParameter parameter = elem.getElementParameter(EParameterName.PARALLELIZE_NUMBER.getName());
        addWidgetIfActive(composite, parameter);
        return composite;
    }

    private boolean isNotPresentOnLayout(final IElementParameter schema) {
        final Optional<Layout> rootLayout = getFormLayout();
        if (rootLayout.isPresent()) {
            final String path = schema.getName();
            return toStream(rootLayout.get()).noneMatch(l -> path.equals(l.getPath()));
        } else {
            return true;
        }
    }

    private Stream<Layout> toStream(final Layout layout) {
        return Stream.concat(of(layout),
                layout.getLevels().stream().flatMap(l -> l.getColumns().stream()).flatMap(this::toStream));
    }

    private Optional<Layout> getFormLayout() {
        final LayoutParameter layoutParameter =
                (LayoutParameter) elem.getElementParameter(LayoutParameter.name(section));
        if (layoutParameter == null) {
            return Optional.empty();
        } else {
            return Optional.of(layoutParameter.getLayout());
        }
    }

    /**
     * Fills composite according specified layout
     *
     * @param composite composite to fill
     * @param layout    composite layout
     */
    private void fillComposite(final Composite composite, final Layout layout, final Composite previous) {
        if (layout.isLeaf()) {
            final String path = layout.getPath();
            final IElementParameter current;
            if (path.equals("configuration.dataSet.queryType")) {
                current = elem.getElementParameter("QUERYSTORE"); //$NON-NLS-1$
                updateParameters(current);
            } else {
                current = elem.getElementParameter(path);
            }
            addWidgetIfActive(composite, current);
        } else {
            Composite previousLevel = previous;
            final Composite subComposite = new Composite(composite, SWT.NONE);
            subComposite.setBackground(composite.getBackground());
            subComposite.setLayout(new FormLayout());
            subComposite.setLayoutData(levelLayoutData(previousLevel));
            for (final Level level : layout.getLevels()) {
                final Composite levelComposite = new Composite(subComposite, SWT.NONE);
                levelComposite.setBackground(subComposite.getBackground());
                levelComposite.setLayout(new FormLayout());
                levelComposite.setLayoutData(levelLayoutData(previousLevel));
                previousLevel = levelComposite;

                final int columnSize = level.getColumns().size();
                for (int i = 0; i < columnSize; i++) {
                    final Layout column = level.getColumns().get(i);
                    final Composite columnComposite = new Composite(levelComposite, SWT.NONE);
                    columnComposite.setLayout(new FormLayout());
                    columnComposite.setBackground(levelComposite.getBackground());
                    if (columnSize == 1) {
                        columnComposite.setLayoutData(columnLevelLayoutData(previousLevel, column));
                    } else {
                        final FormData columnLayoutData = new FormData();
                        columnLayoutData.top = new FormAttachment(0, 2);
                        columnLayoutData.left = new FormAttachment((100 / columnSize) * i, 0);
                        columnLayoutData.right = new FormAttachment((100 / columnSize) * (i + 1), 0);
                        columnLayoutData.bottom = new FormAttachment(100, 0);
                        columnComposite.setLayoutData(columnLayoutData);
                    }
                    fillComposite(columnComposite, column, null);
                }
            }
        }
    }

    private void updateParameters(IElementParameter param) {
        if (param != null) {
            IElementParameter queryParam = elem.getElementParameter("configuration.dataSet.sqlQuery"); //$NON-NLS-1$
            if (queryParam != null) {
                int rowNum = queryParam.getNumRow();
                param.setShow(true);
                param.setNumRow(rowNum);
                param.getChildParameters().get(EParameterName.QUERYSTORE_TYPE.getName()).setNumRow(rowNum);
                param.getChildParameters().get(EParameterName.REPOSITORY_QUERYSTORE_TYPE.getName()).setNumRow(rowNum);
            }
        }
    }

    /**
     * Checks whether IElementParameter is active and creates Control for it, if it is.
     * Parameter is active when:
     * <ol>
     * <li>it is not null</li>
     * <li>its category is the same for which Composite is building</li>
     * <li>it is not TECHNICAL parameter</li>
     * <li>its field show=true</li>
     * </ol>
     *
     * @param parent    Composite on which widget will be added
     * @param parameter ElementParameter(Model) associated with widget
     */
    protected void addWidgetIfActive(final Composite parent, final IElementParameter parameter) {
        if (doShow(parameter)) {
            if (EParameterFieldType.SCHEMA_TYPE.equals(parameter.getFieldType())) {
                addSchemaWidget(parent, parameter);
            } else {
                addWidget(parent, parameter, null);
            }
        }
    }

    protected Control addWidget(final Composite parent, final IElementParameter parameter, final Control previous) {
        EParameterFieldType fieldType = parameter.getFieldType();
        // Use tacokit table controller but still keep TABLE type for the parameter.
        if (EParameterFieldType.TABLE == parameter.getFieldType()) {
            fieldType = EParameterFieldType.TACOKIT_TABLE;
        }
        final ISWTBusinessControllerUI controller = generator.getController(fieldType, this);
        return controller.createControl(parent, parameter, 1, 1, OPTIONS_INDENT, previous);
    }

    /**
     * Creates schema and guess schema button widgets
     *
     * @param schemaComposite parent Composite
     * @param schema Schema ElementParameter
     */
    private void addSchemaWidget(final Composite schemaComposite, final IElementParameter schema) {
        final Control schemaControl = addWidget(schemaComposite, schema, null);
        final String schemaName = schema.getName();
        final IElementParameter guessSchema = elem.getElementParameter(guessButtonName(schemaName));
        if (guessSchema != null) {
            addWidget(schemaComposite, guessSchema, schemaControl);
        }
    }

    private FormData levelLayoutData(final Composite previousLevel) {
        return levelLayoutData(previousLevel, 0);
    }

    private FormData levelLayoutData(final Composite previousLevel, int offset) {
        final FormData layoutData = new FormData();
        if (previousLevel == null) {
            layoutData.top = new FormAttachment(0, offset);
        } else {
            layoutData.top = new FormAttachment(previousLevel, offset);
        }
        layoutData.left = new FormAttachment(0, 0);
        layoutData.right = new FormAttachment(100, 0);
        return layoutData;
    }

    private FormData columnLevelLayoutData(final Composite previousLevel, final Layout column) {
        final FormData layoutData = new FormData();
        layoutData.left = new FormAttachment(0, 0);
        layoutData.right = new FormAttachment(100, 0);
        layoutData.bottom = new FormAttachment(100, 0);
        //
        int offset = 0;
        final String path = column.getPath();
        final IElementParameter parameter = elem.getElementParameter(path);
        if (doShow(parameter)) {
            offset = 2;
        }
        if (previousLevel == null) {
            layoutData.top = new FormAttachment(0, offset);
        } else {
            layoutData.top = new FormAttachment(previousLevel, offset);
        }
        return layoutData;
    }

    protected boolean doShow(final IElementParameter parameter) {
        return parameter != null && parameter.getCategory() == section
                && parameter.getFieldType() != EParameterFieldType.TECHNICAL && parameter.isShow(parameters);
    }
}

package org.talend.designer.core.generic.utils;

import static org.talend.daikon.properties.property.PropertyFactory.*;
import static org.talend.daikon.properties.presentation.Widget.*;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.talend.components.api.properties.ComponentPropertiesImpl;
import org.talend.daikon.properties.presentation.Form;
import org.talend.daikon.properties.presentation.Widget;
import org.talend.daikon.properties.property.Property;

/**
 * created by ycbai on 2016年3月15日 Detailled comment
 * <p>
 * Only for test which is copied from org.talend.components.common.SchemaProperties
 *
 */
public class SchemaProperties extends ComponentPropertiesImpl {

    /** An empty schema is used for an uninitialized SchemaProperties. */
    public static final Schema EMPTY_SCHEMA = SchemaBuilder.builder().record("EmptyRecord").fields().endRecord(); //$NON-NLS-1$

    public SchemaProperties(String name) {
        super(name);
    }

    //
    // Properties
    //
    public Property schema = newSchema("schema"); //$NON-NLS-1$

    @Override
    public void setupProperties() {
        super.setupProperties();
        schema.setValue(EMPTY_SCHEMA);
    }

    @Override
    public void setupLayout() {
        super.setupLayout();

        Form schemaForm = Form.create(this, Form.MAIN); //$NON-NLS-1$
        schemaForm.addRow(widget(schema).setWidgetType(Widget.SCHEMA_EDITOR_WIDGET_TYPE));

        Form schemaRefForm = Form.create(this, Form.REFERENCE); //$NON-NLS-1$
        schemaRefForm.addRow(widget(schema).setWidgetType(Widget.SCHEMA_REFERENCE_WIDGET_TYPE));
    }

}
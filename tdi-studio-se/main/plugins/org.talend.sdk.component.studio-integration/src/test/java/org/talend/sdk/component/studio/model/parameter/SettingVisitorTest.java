package org.talend.sdk.component.studio.model.parameter;

import java.util.Collections;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.sdk.component.server.front.model.SimplePropertyDefinition;

class SettingVisitorTest {

    @Test
    void getSettings() {
        final SettingVisitor visitor = new SettingVisitor(null, null, Collections.emptyList())
                .withCategory(EComponentCategory.MAIN);

        final PropertyNode nodeValue = this.nodeValue();
        visitor.visit(nodeValue);


        final PropertyNode node = this.newNode();
        visitor.visit(node);

        final PropertyNode node2 = this.newNode();
        visitor.visit(node2);

        visitor.getSettings();
    }

    private PropertyNode nodeValue() {
        final SimplePropertyDefinition def = new SimplePropertyDefinition();
        final PropertyDefinitionDecorator prop = new PropertyDefinitionDecorator(def);

        def.setPath("value");
        def.setMetadata(new HashMap<>());
        final PropertyNode node = new PropertyNode(prop, EParameterFieldType.TEXT, true);
        node.getLayouts().put("Main", new Layout("Main"));
        return node;
    }

    private PropertyNode newNode() {
        final SimplePropertyDefinition def = new SimplePropertyDefinition();
        final PropertyDefinitionDecorator prop = new PropertyDefinitionDecorator(def);

        def.setPath("hello");
        def.setMetadata(new HashMap<>());
        def.getMetadata().put(Metadatas.CONDITION_IF_TARGET, "value");

        final PropertyNode node = new PropertyNode(prop, EParameterFieldType.MAPPING_TYPE, true);

        node.getLayouts().put("Main", new Layout("Main"));
        return node;
    }
}
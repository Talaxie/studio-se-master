// ============================================================================
//
// Copyright (C) 2006-2022 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.sdk.component.studio.model.action;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.sdk.component.studio.lang.Pair;
import org.talend.sdk.component.studio.model.parameter.TextElementParameter;

/**
 * created by hcyi on Mar 14, 2022
 * Detailled comment
 *
 */
public class SettingsActionParameterTest {

    @Test
    public void testParameters() {
        final TextElementParameter text = new TextElementParameter(null);
        text.setName("configuration.dataSet.dataStore.password");
        text.setFieldType(EParameterFieldType.PASSWORD);
        text.setValue("\"test123\"");

        final IActionParameter actionParameter = new SettingsActionParameter(text, "dataStore.password");

        final Collection<Pair<String, String>> parameters = actionParameter.parameters();
        assertEquals(1, parameters.size());
        final Iterator<Pair<String, String>> iterator = parameters.iterator();
        assertEquals(new Pair<String, String>("dataStore.password", "test123"), iterator.next());
    }

    @Test
    public void testParametersWithDoubleQuotes() {
        final TextElementParameter text = new TextElementParameter(null);
        text.setName("configuration.dataSet.dataStore.password");
        text.setFieldType(EParameterFieldType.PASSWORD);
        text.setValue("\"test\\\"123\"");

        final IActionParameter actionParameter = new SettingsActionParameter(text, "dataStore.password");

        final Collection<Pair<String, String>> parameters = actionParameter.parameters();
        assertEquals(1, parameters.size());
        final Iterator<Pair<String, String>> iterator = parameters.iterator();
        assertEquals(new Pair<String, String>("dataStore.password", "test\"123"), iterator.next());
    }

    @Test
    public void testParametersWithNull() {
        final TextElementParameter text = new TextElementParameter(null);
        text.setName("configuration.dataSet.dataStore.password");
        text.setFieldType(EParameterFieldType.PASSWORD);
        text.setValue("");

        final IActionParameter actionParameter = new SettingsActionParameter(text, "dataStore.password");

        final Collection<Pair<String, String>> parameters = actionParameter.parameters();
        assertEquals(1, parameters.size());
        final Iterator<Pair<String, String>> iterator = parameters.iterator();
        assertEquals(new Pair<String, String>("dataStore.password", ""), iterator.next());
    }

    @Test
    public void testParametersWithTextFieldType() {
        final TextElementParameter text = new TextElementParameter(null);
        text.setName("configuration.dataSet.dataStore.username");
        text.setFieldType(EParameterFieldType.TEXT);
        text.setValue("\"TestTextFieldType\"");

        final IActionParameter actionParameter = new SettingsActionParameter(text, "dataStore.username");

        final Collection<Pair<String, String>> parameters = actionParameter.parameters();
        assertEquals(1, parameters.size());
        final Iterator<Pair<String, String>> iterator = parameters.iterator();
        assertEquals(new Pair<String, String>("dataStore.username", "TestTextFieldType"), iterator.next());
    }

}

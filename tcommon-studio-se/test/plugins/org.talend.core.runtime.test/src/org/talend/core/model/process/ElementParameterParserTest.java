// ============================================================================
//
// Copyright (C) 2006-202121 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.model.process;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.talend.utils.security.StudioEncryption;

/**
 * created by wchen on 2014-4-16 Detailled comment
 *
 */
public class ElementParameterParserTest {

    private static final StudioEncryption SE = StudioEncryption.getStudioEncryption(StudioEncryption.EncryptionKeyName.ROUTINE);

    private static String decryptPassword(String input) {
        input = input.replace("\"", "");
        return SE.decrypt(input);
    }

    @Test
    public void testCanEncrypt() {
        String paramName = "__PASSWORD__";
        // mock parameter
        IElementParameter parameter = mock(IElementParameter.class);
        when(parameter.getVariableName()).thenReturn(paramName);
        when(parameter.getName()).thenReturn("PASSWORD");

        // mock the node
        IElement node = mock(IElement.class);
        List elementParametersWithChildrens = new ArrayList();
        elementParametersWithChildrens.add(parameter);
        when(node.getElementParametersWithChildrens()).thenReturn(elementParametersWithChildrens);

        // "ab"
        when(parameter.getValue()).thenReturn("\"ab\"");
        assertTrue(ElementParameterParser.canEncrypt(node, paramName));
        // "a\"b"
        when(parameter.getValue()).thenReturn("\"a\\\"b\"");
        assertTrue(ElementParameterParser.canEncrypt(node, paramName));
        // "a\\b"
        when(parameter.getValue()).thenReturn("\"a\\\\b\"");
        assertTrue(ElementParameterParser.canEncrypt(node, paramName));

        // "a\\\\b"
        when(parameter.getValue()).thenReturn("\"a\\\\\\\\b\"");
        assertTrue(ElementParameterParser.canEncrypt(node, paramName));

        // "test"+context.mypassword + "a"
        when(parameter.getValue()).thenReturn("\"test\"+context.mypassword + \"a\"");
        assertFalse(ElementParameterParser.canEncrypt(node, paramName));
        // "a" + "b"
        when(parameter.getValue()).thenReturn("\"a\" + \"b\"");
        assertFalse(ElementParameterParser.canEncrypt(node, paramName));
    }

    @Test
    public void testGetEncryptedValue() throws Exception {
        String paramName = "__PASSWORD__";
        // mock parameter
        IElementParameter parameter = mock(IElementParameter.class);
        when(parameter.getVariableName()).thenReturn(paramName);
        when(parameter.getName()).thenReturn("PASSWORD");

        // mock the node
        IElement node = mock(IElement.class);
        List elementParametersWithChildrens = new ArrayList();
        elementParametersWithChildrens.add(parameter);
        when(node.getElementParametersWithChildrens()).thenReturn(elementParametersWithChildrens);

        // input: "ab"
        String val = "\"ab\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("ab",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "a\"b"
        val = "\"a\\\"b\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("a\"b",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "a\\b" (keep the studio behavior)
        val = "\"a\\\\b\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("a\\\\b",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "a\\\\b" (keep the studio behavior)
        val = "\"a\\\\\\\\b\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("a\\\\\\\\b",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "test"+context.mypassword + "a"
        val = "\"test\"+context.mypassword + \"a\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals(val,
                ElementParameterParser.getEncryptedValue(node, paramName));
        // input: "a" + "b"
        val = "\"a\" + \"b\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals(val, ElementParameterParser.getEncryptedValue(node, paramName));
        // input: "\\123456/" (keep the studio behavior)
        val = "\"\\\\123456/\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("\\\\123456/",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "\123456/" (keep the studio behavior)
        val = "\"\\123456/\"";
        final String exp = "\\123456/";
        when(parameter.getValue()).thenReturn(val);
        assertEquals(exp,
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
        // input: "\,\n123\"" (keep the studio behavior)
        val = "\"\\,\\n123\\\"\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("\\,\\n123\"", decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
    }

    @Test
    public void testGetEncryptedValue_multiLine() {
        String paramName = "__PASSWORD__";
        // mock parameter
        IElementParameter parameter = mock(IElementParameter.class);
        when(parameter.getVariableName()).thenReturn(paramName);
        when(parameter.getName()).thenReturn("PASSWORD");

        // mock the node
        IElement node = mock(IElement.class);
        List elementParametersWithChildrens = new ArrayList();
        elementParametersWithChildrens.add(parameter);
        when(node.getElementParametersWithChildrens()).thenReturn(elementParametersWithChildrens);

        // {
        // "a":"b",
        // "c":"d"
        // }

        // "{\r\n\"a\":\"b\",\r\n\"c\":\"d\"\r\n}" (keep the studio behavior)
        String val = "\"{\r\n\\\"a\\\":\\\"b\\\",\r\n\\\"c\\\":\\\"d\\\"\r\n}\"";
        when(parameter.getValue()).thenReturn(val);
        assertEquals("{\r\n\"a\":\"b\",\r\n\"c\":\"d\"\r\n}",
                decryptPassword(ElementParameterParser.getEncryptedValue(node, paramName)));
    }

}

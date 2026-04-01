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
package org.talend.repository.json.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class JSONUtilTest {

    @Test
    public void testDetachJsonPathExpression() throws Exception {
        String toTest = "$.person[?(@.attribute==1)].birthday";
        String expected = "$.person.birthday";
        String actual = JSONUtil.detachJsonPathExpression(expected);
        assertEquals(expected, actual);
        actual = JSONUtil.detachJsonPathExpression(toTest);
        assertEquals(expected, actual);

        toTest = "$.person[?(@.attribute==1)].birthday[?(@.test==1)].date[?(@.test==1)].id";
        expected = "$.person.birthday.date.id";
        actual = JSONUtil.detachJsonPathExpression(toTest);
        assertEquals(expected, actual);

        toTest = "$.person[?(@.attribute==1)].['first name']";
        expected = "$.person.first name";
        actual = JSONUtil.detachJsonPathExpression(toTest);
        assertEquals(expected, actual);

        toTest = "$.person[?(@.attribute==1)].['first name'][?(@.test==1)].name";
        expected = "$.person.first name.name";
        actual = JSONUtil.detachJsonPathExpression(toTest);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsFieldNameWrapped() throws Exception {
        String expression = "$.person[?(@.attribute==1)].first name[?(@.test==1)].name";
        String fieldName = "first name";
        int start = expression.indexOf(fieldName);
        boolean wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertFalse(wrapped);

        expression = "$.person[?(@.attribute==1)].['first name'][?(@.test==1)].name";
        start = expression.indexOf(fieldName);
        wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertTrue(wrapped);

        expression = "$.person[?(@.attribute==1)].[' first name '][?(@.test==1)].name";
        start = expression.indexOf(fieldName);
        wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertTrue(wrapped);

        expression = "$.person[?(@.attribute==1)].['   first name   '][?(@.test==1)].name";
        start = expression.indexOf(fieldName);
        wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertTrue(wrapped);

        expression = "$.person[?(@.attribute==1)].first name'][?(@.test==1)].name";
        start = expression.indexOf(fieldName);
        wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertFalse(wrapped);

        expression = "$.person[?(@.attribute==1)].['first name[?(@.test==1)].name";
        start = expression.indexOf(fieldName);
        wrapped = JSONUtil.isFieldNameWrapped(expression.toCharArray(), start, start + fieldName.length() - 1);
        assertFalse(wrapped);
    }

    @Test
    public void testGetAllIndexOfString() throws Exception {
        String expression = "test_data";
        String fieldName = "test_data";
        List<Integer> list = JSONUtil.getAllIndexOfString(expression, fieldName);
        assertTrue(list.size() == 1);
        assertTrue(list.get(0) == 0);

        expression = "$.test[?(@.attribute==1)].test_data.other_data.test_data";
        list = JSONUtil.getAllIndexOfString(expression, fieldName);
        assertTrue(list.size() == 2);
        assertTrue(list.contains(26));
        assertTrue(list.contains(47));
    }

    @Test
    public void testIsXPathOfJson() {
        String[] jsonfiles = {"json1.json", "json2.json"};
        String[][] xpaths = {{"/rcp.authorized.plug-ins","/root/rcp.authorized.plug-ins"},{"/Class/student","/root/object/Class/student"}};
        
        Bundle jsontestBundle = Platform.getBundle("org.talend.repository.json.test");
        
        for(int i = 0; i<jsonfiles.length; i++) {
            URL jsonurl = FileLocator.find(jsontestBundle, new Path("/resources/" + jsonfiles[i]), null);
            
            try(InputStream input = jsonurl.openStream()) {
                String jsonStr = IOUtils.toString(input, "UTF-8");
                assertTrue(JSONUtil.isXPathOfJson(jsonStr, xpaths[i][0], '/'));
                assertFalse(JSONUtil.isXPathOfJson(jsonStr, xpaths[i][1], '/'));
            } catch (IOException e) {
                Assert.fail(e.getMessage());
            }
        }
    }
}

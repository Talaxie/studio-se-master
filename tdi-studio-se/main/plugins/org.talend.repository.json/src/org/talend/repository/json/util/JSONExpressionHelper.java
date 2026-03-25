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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.talend.repository.model.json.SchemaTarget;
import org.talend.repository.ui.wizards.metadata.connection.files.json.JsonTreeNode;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class JSONExpressionHelper {

    public void autoWrapFieldToExpression(List<Object> treeViewerInput, List<SchemaTarget> fieldBeansList) {
        Set<String> fieldNameSet = new HashSet<String>();
        for (Object object : treeViewerInput) {
            if (object instanceof JsonTreeNode) {
                JsonTreeNode jsonTreeNode = (JsonTreeNode) object;
                collectSpecialJsonNodeTreeFieldNames(jsonTreeNode, fieldNameSet);
            }
        }
        List<String> fieldNameList = new ArrayList<String>(fieldNameSet);
        if (fieldNameList.isEmpty()) {
            return;
        }
        Collections.sort(fieldNameList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }

        });
        for (SchemaTarget schemaTarget : fieldBeansList) {
            String expression = schemaTarget.getRelativeXPathQuery();
            char[] charArray = expression.toCharArray();
            int[] expBucket = new int[expression.length()];
            Map<String, List<Integer>> fieldIndexMap = new HashMap<String, List<Integer>>();
            for (String fieldName : fieldNameList) {
                List<Integer> indexList = JSONUtil.getAllIndexOfString(expression, fieldName);
                for (Integer index : indexList) {
                    int end = index + fieldName.length() - 1;
                    if (expBucket[index] == 0 && expBucket[end] == 0) {
                        fillBitBucketFlag(expBucket, index, end);
                        if (!JSONUtil.isFieldNameWrapped(charArray, index, end)) {
                            if (fieldIndexMap.get(fieldName) == null) {
                                fieldIndexMap.put(fieldName, new ArrayList<Integer>());
                            }
                            fieldIndexMap.get(fieldName).add(index);
                        }
                    }
                }
            }
            if (fieldIndexMap.isEmpty()) {
                continue;
            }
            StringBuffer strBuffer = new StringBuffer();
            for (int i = 0; i < charArray.length; i++) {
                String fieldName = getWrapFieldNameByIndex(i, fieldIndexMap);
                if (StringUtils.isNotBlank(fieldName)) {
                    strBuffer.append("['").append(fieldName).append("']");
                    i = i + fieldName.length() - 1;
                } else {
                    strBuffer.append(charArray[i]);
                }
            }
            schemaTarget.setRelativeXPathQuery(strBuffer.toString());
        }
    }

    private String getWrapFieldNameByIndex(int index, Map<String, List<Integer>> fieldIndexMap) {
        for (String fieldName : fieldIndexMap.keySet()) {
            List<Integer> list = fieldIndexMap.get(fieldName);
            if (list.contains(index)) {
                return fieldName;
            }
        }
        return null;
    }

    private void collectSpecialJsonNodeTreeFieldNames(JsonTreeNode treeNode, Set<String> fieldNameSet) {
        if (StringUtils.isNotBlank(treeNode.getLabel()) && treeNode.getLabel().contains(" ")) {
            fieldNameSet.add(treeNode.getLabel());
        }
        Object[] children = treeNode.getChildren();
        for (Object object : children) {
            if (object instanceof JsonTreeNode) {
                JsonTreeNode childTreeNode = (JsonTreeNode) object;
                collectSpecialJsonNodeTreeFieldNames(childTreeNode, fieldNameSet);
            }
        }
    }

    private void fillBitBucketFlag(int[] bitBucket, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex + 1; i++) {
            bitBucket[i] = 1;
        }
    }

}

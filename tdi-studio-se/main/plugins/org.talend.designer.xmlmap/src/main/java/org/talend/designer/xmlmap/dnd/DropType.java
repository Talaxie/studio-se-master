package org.talend.designer.xmlmap.dnd;

public enum DropType {
    DROP_FILTER("Drop to update tree filter"),
    DROP_EXPRESSION("Drop to update node filter"),
    DROP_OUTPUT_DOC_CHILD("Drop to create new output document child"),
    DROP_INSERT_INPUT("Drop to insert a new input column"),
    DROP_INSERT_OUTPUT("Drop to insert a new output column"),
    DROP_INSERT_VAR("Drop to insert a new var column"), ;

    DropType(String str) {

    }
}

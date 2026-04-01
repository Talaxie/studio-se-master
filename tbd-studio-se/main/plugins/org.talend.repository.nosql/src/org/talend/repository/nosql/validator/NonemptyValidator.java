package org.talend.repository.nosql.validator;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * created by ycbai on Jul 23, 2014 Detailled comment
 * 
 */
public class NonemptyValidator implements IValidator {

    private Object value;

    /**
     * DOC ycbai AbstractNoSQLConnForm.NonemptyValidator constructor comment.
     */
    public NonemptyValidator(Object value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.nosql.ui.common.AbstractNoSQLConnForm.Validator#validate(java.lang.Object)
     */
    @Override
    public boolean validate() {
        if (value == null) {
            return false;
        }

        return StringUtils.isNotEmpty(String.valueOf(value));
    }

}
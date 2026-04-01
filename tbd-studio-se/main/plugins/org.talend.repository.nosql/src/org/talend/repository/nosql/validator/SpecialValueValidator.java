package org.talend.repository.nosql.validator;

/**
 * 
 * created by ycbai on Jul 23, 2014 Detailled comment
 * 
 */
public class SpecialValueValidator implements IValidator {

    private Object value;

    private Object expectValue;

    /**
     * DOC ycbai AbstractNoSQLConnForm.SpecialValidator constructor comment.
     */
    public SpecialValueValidator(Object value, Object expectValue) {
        this.value = value;
        this.expectValue = expectValue;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.nosql.ui.common.AbstractNoSQLConnForm.Validator#validate(java.lang.Object)
     */
    @Override
    public boolean validate() {
        if (value != null && value.equals(expectValue) || expectValue != null && expectValue.equals(value) || value == null
                && expectValue == null) {
            return true;
        }
        return false;
    }

}
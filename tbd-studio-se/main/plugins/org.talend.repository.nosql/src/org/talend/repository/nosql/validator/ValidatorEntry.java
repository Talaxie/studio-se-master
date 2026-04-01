package org.talend.repository.nosql.validator;

/**
 * 
 * created by ycbai on Jul 23, 2014 Detailled comment
 * 
 */
public class ValidatorEntry implements IValidatorEntry {

    private IValidator validator;

    private boolean reject;

    private String failMsg, successfulMsg;

    public ValidatorEntry(IValidator validator, String failMsg) {
        this(validator, false, failMsg);
    }

    public ValidatorEntry(IValidator validator, boolean reject, String failMsg) {
        this(validator, reject, failMsg, null);
    }

    public ValidatorEntry(IValidator validator, boolean reject, String failMsg, String successfulMsg) {
        this.validator = validator;
        this.reject = reject;
        this.failMsg = failMsg;
        this.successfulMsg = successfulMsg;
    }

    @Override
    public boolean doValidate() {
        return reject ? !validator.validate() : validator.validate();
    }

    @Override
    public String getFailMsg() {
        return this.failMsg;
    }

    @Override
    public String getSuccessfulMsg() {
        return this.successfulMsg;
    }

}
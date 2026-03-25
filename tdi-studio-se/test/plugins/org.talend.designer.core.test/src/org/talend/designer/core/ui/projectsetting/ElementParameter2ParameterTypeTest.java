package org.talend.designer.core.ui.projectsetting;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;


public class ElementParameter2ParameterTypeTest {

    @Test
    public void testSetParameterValue() {
        ParametersType pt = null;
        // if ParametersType is not, won't set value and won't throw exception
        try {
            ElementParameter2ParameterType.setParameterValue(pt, "ParamName", "value");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}

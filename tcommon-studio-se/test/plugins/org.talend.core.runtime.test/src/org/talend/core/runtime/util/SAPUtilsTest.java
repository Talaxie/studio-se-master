// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.runtime.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.talend.core.model.metadata.ISAPConstant;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.metadata.builder.connection.SAPConnection;
import org.talend.cwm.helper.TaggedValueHelper;

/**
 * created by hcyi on Dec 10, 2021
 * Detailled comment
 *
 */
public class SAPUtilsTest {
    
    private  SAPConnection connection = null;
    
    @Before
    public void setUp() throws Exception {
        init();
     }

  private void init() {
      connection = ConnectionFactory.eINSTANCE.createSAPConnection();
      connection.setName("sap"); //$NON-NLS-1$
  }

    @Test
    public void test_isHana_null() {
        assertFalse(SAPUtils.isHana(null));
    }
    
    @Test
    public void test_isHana_empty() {
        TaggedValueHelper.setTaggedValue(connection, ISAPConstant.ADSO_CONNECTION_TYPE, "");
        assertFalse(SAPUtils.isHana(connection));
    }

    @Test
    public void test_isHANA_JDBC() {
        TaggedValueHelper.setTaggedValue(connection, ISAPConstant.ADSO_CONNECTION_TYPE, ISAPConstant.HANA_JDBC);
        String connectionType = TaggedValueHelper.getValueString(ISAPConstant.ADSO_CONNECTION_TYPE, connection);
        assertTrue(SAPUtils.isHana(connection));
        assertEquals(ISAPConstant.HANA_JDBC, connectionType);
    }

    @Test
    public void test_isSAP_JCO() {
        TaggedValueHelper.setTaggedValue(connection, ISAPConstant.ADSO_CONNECTION_TYPE, ISAPConstant.SAP_JCO);
        String connectionType = TaggedValueHelper.getValueString(ISAPConstant.ADSO_CONNECTION_TYPE, connection);
        assertFalse(SAPUtils.isHana(connection));
        assertEquals(ISAPConstant.SAP_JCO, connectionType);
    }
}

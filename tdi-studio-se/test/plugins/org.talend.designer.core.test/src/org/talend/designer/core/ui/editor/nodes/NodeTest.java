// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.nodes;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.talend.core.model.process.IConnection;
import org.talend.designer.core.ui.editor.connections.Connection;


/**
 * DOC sbliu  class global comment. Detailled comment
 */
public class NodeTest {

    @Test
    public void testAddInputConnectionInOrder() {
        List<IConnection> inputs = new ArrayList<>();

        Node mock = mock(Node.class);
        Mockito.doCallRealMethod().when(mock).addInputConnectionInOrder(Mockito.anyList(), Mockito.any(Connection.class));

        //input order is set
        Connection conn1 = Mockito.mock(Connection.class);
        when(conn1.getInputOrder()).thenReturn(0);
        mock.addInputConnectionInOrder(inputs, conn1);
        assertTrue(inputs.size() == 1); // assert 
        
        Connection conn2 = Mockito.mock(Connection.class);
        when(conn2.getInputOrder()).thenReturn(1);
        
        Connection conn3 = Mockito.mock(Connection.class);
        when(conn3.getInputOrder()).thenReturn(2);
        
        Connection conn4 = Mockito.mock(Connection.class);
        when(conn4.getInputOrder()).thenReturn(3);
        mock.addInputConnectionInOrder(inputs, conn3);
        mock.addInputConnectionInOrder(inputs, conn4);
        mock.addInputConnectionInOrder(inputs, conn2);
        assertTrue(inputs.size() == 4);
        assertSame(inputs.get(0), conn1);
        assertSame(inputs.get(1), conn2);
        assertSame(inputs.get(2), conn3);
        assertSame(inputs.get(3), conn4);
        
        //input order is not set
        inputs.clear();
        when(conn1.getInputOrder()).thenReturn(-1);
        when(conn2.getInputOrder()).thenReturn(-1);
        when(conn3.getInputOrder()).thenReturn(-1);
        when(conn4.getInputOrder()).thenReturn(-1);
        mock.addInputConnectionInOrder(inputs, conn1);
        mock.addInputConnectionInOrder(inputs, conn3);
        mock.addInputConnectionInOrder(inputs, conn4);
        mock.addInputConnectionInOrder(inputs, conn2);
        
        assertTrue(inputs.size() == 4);
        assertSame(inputs.get(0), conn1);
        assertSame(inputs.get(1), conn3);
        assertSame(inputs.get(2), conn4);
        assertSame(inputs.get(3), conn2);
        
    }

}

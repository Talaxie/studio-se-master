// ============================================================================
//
// Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.Test;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.designer.core.model.utils.emf.talendfile.ParametersType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.RoutinesParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;
import org.talend.designer.core.ui.routine.RoutineItemRecord;

public class SetupProcessDependenciesRoutinesActionTest {

    @Test
    public void testCreateRoutineAndCustomJarDependencies() {
        ProcessType process = TalendFileFactory.eINSTANCE.createProcessType();
        ParametersType parameters = TalendFileFactory.eINSTANCE.createParametersType();
        process.setParameters(parameters);

        RoutineItemRecord globalRoutine = record("routine-id", "MyRoutine", null);
        RoutineItemRecord routinesJar = record("jar-id", "konvertilo", ERepositoryObjectType.ROUTINESJAR.name());

        SetupProcessDependenciesRoutinesAction.createRoutinesDependencies(process,
                Arrays.asList(globalRoutine, routinesJar, routinesJar));

        assertEquals(2, parameters.getRoutinesParameter().size());
        RoutinesParameterType storedRoutine = (RoutinesParameterType) parameters.getRoutinesParameter().get(0);
        assertEquals("routine-id", storedRoutine.getId());
        assertEquals("MyRoutine", storedRoutine.getName());
        assertNull(storedRoutine.getType());
        RoutinesParameterType storedJar = (RoutinesParameterType) parameters.getRoutinesParameter().get(1);
        assertEquals("jar-id", storedJar.getId());
        assertNull(storedJar.getName());
        assertEquals(ERepositoryObjectType.ROUTINESJAR.name(), storedJar.getType());
    }

    private RoutineItemRecord record(String id, String name, String type) {
        RoutineItemRecord record = new RoutineItemRecord();
        record.setId(id);
        record.setName(name);
        record.setLabel(name);
        record.setType(type);
        return record;
    }
}

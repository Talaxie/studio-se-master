package org.talend.camel.designer.codegen;

import org.eclipse.core.runtime.jobs.Job;
import org.talend.camel.model.IRouteProcess;
import org.talend.core.model.process.IProcess;
import org.talend.designer.codegen.ICamelCodeGeneratorService;
import org.talend.designer.codegen.ICodeGenerator;
import org.talend.designer.codegen.ISQLPatternSynchronizer;
import org.talend.designer.codegen.ITalendSynchronizer;
import org.talend.designer.codegen.JavaRoutineSynchronizer;
import org.talend.designer.codegen.model.CodeGeneratorEmittersPoolFactory;

public class CamelCodeGeneratorService implements ICamelCodeGeneratorService {

    @Override
    public Job initializeTemplates() {
        return null;
    }

    @Override
    public Job refreshTemplates() {
        return null;
    }

    @Override
    public ICodeGenerator createCodeGenerator() {
        throw new AssertionError("This code generator only use to generate process specific generator");
    }

    @Override
    public ICodeGenerator createCodeGenerator(IProcess process, boolean statistics, boolean trace, String... options) {
        if (!validProcess(process)) {
            return null;
        }
        return new CamelCodeGenerator((IRouteProcess) process, statistics, trace, options);
    }

    @Override
    public ITalendSynchronizer createPerlRoutineSynchronizer() {
        return null;
    }

    @Override
    public ITalendSynchronizer createJavaRoutineSynchronizer() {
        return new JavaRoutineSynchronizer();
    }

    @Override
    public ITalendSynchronizer createRoutineSynchronizer() {
        return createJavaRoutineSynchronizer();
    }

    @Override
    public ISQLPatternSynchronizer getSQLPatternSynchronizer() {
        return null;
    }

    @Override
    public boolean isInitializingJet() {
        return !CodeGeneratorEmittersPoolFactory.isInitialized() && CodeGeneratorEmittersPoolFactory.isInitializeStart();
    }

    @Override
    public boolean validProcess(IProcess process) {
        return process != null && process instanceof IRouteProcess;
    }

}

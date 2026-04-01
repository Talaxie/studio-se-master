// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.ui.runtime;

import org.talend.commons.ui.runtime.custom.IBusinessHandler;
import org.talend.commons.ui.runtime.custom.ICustomUI;
import org.talend.commons.ui.runtime.custom.ICustomUIEngine;

/**
 * DOC cmeng  class global comment. Detailled comment
 */
public class TalendUI {

    private static TalendUI inst;

    private static Object lock = new Object();

    private boolean isStudio = true;

    private ICustomUIEngine stigmaUIEngine;

    private TalendUI() {
    }

    public static TalendUI get() {
        if (inst == null) {
            synchronized (lock) {
                if (inst == null) {
                    inst = new TalendUI();
                }
            }
        }
        return inst;
    }

    public void setStudio(boolean isStudio) {
        this.isStudio = isStudio;
    }

    public boolean isStudio() {
        return this.isStudio;
    }

    public ICustomUIEngine getStigmaUIEngine() {
        return this.stigmaUIEngine;
    }

    public void setStigmaUIEngine(ICustomUIEngine engine) {
        this.stigmaUIEngine = engine;
    }

    /**
     * should try to refactor them to different fragment
     */
    @Deprecated
    public <T extends IBusinessHandler> T run(IStudioRunnable<T> studioRun, ICustomUI<T> stigmaRun) {
        if (isStudio()) {
            return run(studioRun);
        } else {
            return run(stigmaRun);
        }
    }

    /**
     * should try to refactor them to different fragment
     */
    @Deprecated
    public <T extends IBusinessHandler> T run(IStudioRunnable<T> run) {
        return run.run();
    }

    public <T extends IBusinessHandler> T run(ICustomUI<T> ui) {
        if (ui == null) {
            throw new RuntimeException("Custom ui is not defined!");
        }
        return stigmaUIEngine.run(ui);
    }

    @Deprecated
    public static interface IStudioRunnable<T extends IBusinessHandler> {

        T run();

    }

    @Deprecated
    public static abstract class AbsStudioRunnable<T extends IBusinessHandler> implements IStudioRunnable<T> {

        @Override
        public T run() {
            return doRun();
        }

        abstract public T doRun();

    }

    public static class Events {

        public static final String EVENT_UPDATE = "TalendUI.update";

    }

}

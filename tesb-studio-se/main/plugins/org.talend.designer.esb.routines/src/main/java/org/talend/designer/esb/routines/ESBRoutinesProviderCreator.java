package org.talend.designer.esb.routines;

import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.routines.IRoutineProviderCreator;
import org.talend.core.model.routines.IRoutinesProvider;

public class ESBRoutinesProviderCreator implements IRoutineProviderCreator {

    final IRoutinesProvider javaProvider;

    public ESBRoutinesProviderCreator() {
        javaProvider = new ESBJavaRoutinesProvider();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.model.routines.IRoutineProviderCreator#
     * createIRoutinesProviderByLanguage(org.talend.core.language.ECodeLanguage)
     */
    public IRoutinesProvider createIRoutinesProviderByLanguage(ECodeLanguage lan) {
        return javaProvider;
    }

}
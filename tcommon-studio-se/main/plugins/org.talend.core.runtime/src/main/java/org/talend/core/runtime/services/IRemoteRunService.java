package org.talend.core.runtime.services;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Map;

import org.talend.core.IService;
import org.talend.core.model.process.ITargetExecutionConfig;
import org.talend.designer.runprocess.IProcessMessageManager;

public interface IRemoteRunService extends IService {

    public Process executeJobOnServer(IProcessMessageManager processMessageManager, ITargetExecutionConfig config,
            PipedInputStream stdInputStream, PipedInputStream errInputStream, PipedOutputStream stdOutputStream,
            PipedOutputStream errOutputStream, String remoteJobId, String jobName, Map<String, String> jobParams,
            Map<String, String> contextParams) throws Exception;
}

package org.talend.components.talendscp;

import org.apache.sshd.scp.client.AbstractScpClientCreator;
import org.apache.sshd.scp.client.ScpClient;
import org.apache.sshd.scp.client.ScpClientCreator;
import org.apache.sshd.client.session.ClientSession;
import org.apache.sshd.scp.common.ScpFileOpener;
import org.apache.sshd.scp.common.ScpTransferEventListener;

public class TalendScpClientCreator extends AbstractScpClientCreator implements ScpClientCreator {
    public static final TalendScpClientCreator INSTANCE = new TalendScpClientCreator();

    @Override
    public ScpClient createScpClient(ClientSession session) {
        return this.createScpClient(session, this.getScpFileOpener(), this.getScpTransferEventListener());
    }

    @Override public ScpClient createScpClient(ClientSession clientSession, ScpFileOpener scpFileOpener,
            ScpTransferEventListener scpTransferEventListener) {
        return new TalendScpClient(clientSession, scpFileOpener, scpTransferEventListener);
    }
}

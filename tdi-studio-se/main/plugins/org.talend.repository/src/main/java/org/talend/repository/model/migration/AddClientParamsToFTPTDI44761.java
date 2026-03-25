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
package org.talend.repository.model.migration;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.core.language.ECodeLanguage;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.components.ModifyComponentsAction;
import org.talend.core.model.components.conversions.IComponentConversion;
import org.talend.core.model.components.filters.IComponentFilter;
import org.talend.core.model.components.filters.NameComponentFilter;
import org.talend.core.model.migration.AbstractJobMigrationTask;
import org.talend.core.model.properties.Item;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFileFactory;


public class AddClientParamsToFTPTDI44761 extends AbstractJobMigrationTask {
	
	/*
	 * (non-Javadoc)
	 *
	 * @see org.talend.migration.IMigrationTask#getOrder()
	 */
	public Date getOrder() {
        GregorianCalendar gc = new GregorianCalendar(2022, 6, 6, 11, 0, 0);
        return gc.getTime();
    }

    /*
     * (non-Javadoc)
     *
     * @seeorg.talend.core.model.migration.AbstractJobMigrationTask#executeOnProcess(org.talend.core.model.properties.
     * ProcessItem)
     */
    @Override
    public ExecutionResult execute(Item item) {
        ProcessType processType = getProcessType(item);
        if (getProject().getLanguage() != ECodeLanguage.JAVA || processType == null) {
            return ExecutionResult.NOTHING_TO_DO;
        }
        String[] componentsName = new String[] { "tFTPConnection","tFTPDelete","tFTPFileExist","tFTPFileList",
        		"tFTPFileProperties","tFTPGet","tFTPPut","tFTPRename","tFTPTruncate" };

        try {
            boolean modified = false;
            for (int i = 0; i < componentsName.length; i++) {
                IComponentFilter filter = new NameComponentFilter(componentsName[i]);
                modified |= ModifyComponentsAction.searchAndModify(item, processType, filter,
                        Arrays.<IComponentConversion> asList(new IComponentConversion() {

                            public void transform(NodeType node) {
                            	String useExistConnection = ComponentUtilities.getNodePropertyValue(node, "USE_EXISTING_CONNECTION");
                            	boolean useSFTP = "true".equals(ComponentUtilities.getNodePropertyValue(node, "SFTP"));
                                if (useSFTP && (useExistConnection == null || "false". equals(useExistConnection)) 
                                		&& ComponentUtilities.getNodeProperty(node, "CONFIG_CLIENT") == null) {
                                    ComponentUtilities.addNodeProperty(node, "CONFIG_CLIENT", "CHECK");
                                    ComponentUtilities.getNodeProperty(node, "CONFIG_CLIENT").setValue("true");
                                    ComponentUtilities.addNodeProperty(node, "CLIENT_PARAMETERS", "TABLE");
                                    
                                    List<ElementValueType> values = new ArrayList<ElementValueType>();
                                    TalendFileFactory fileFact = TalendFileFactory.eINSTANCE;
                                    List<String> params = new ArrayList<>();
                                    
                                    params.add("\"kex\":\"ecdh-sha2-nistp256,ecdh-sha2-nistp384,ecdh-sha2-nistp521,diffie-hellman-group14-sha1,diffie-hellman-group-exchange-sha256,diffie-hellman-group-exchange-sha1,diffie-hellman-group1-sha1,curve25519-sha256,curve25519-sha256@libssh.org,diffie-hellman-group16-sha512,diffie-hellman-group18-sha512,diffie-hellman-group14-sha256\"");
                                    params.add("\"server_host_key\":\"ssh-rsa,ssh-dss,ecdsa-sha2-nistp256,ecdsa-sha2-nistp384,ecdsa-sha2-nistp521,rsa-sha2-512,rsa-sha2-256\"");
                                    params.add("\"cipher.s2c\":\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"");
                                    params.add("\"cipher.c2s\":\"aes128-ctr,aes128-cbc,3des-ctr,3des-cbc,blowfish-cbc,aes192-ctr,aes192-cbc,aes256-ctr,aes256-cbc,aes128-gcm@openssh.com,aes256-gcm@openssh.com\"");
                                    params.add("\"mac.s2c\":\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"");
                                    params.add("\"mac.c2s\":\"hmac-md5,hmac-sha1,hmac-sha2-256,hmac-sha1-96,hmac-md5-96,hmac-sha2-256-etm@openssh.com,hmac-sha2-512-etm@openssh.com,hmac-sha1-etm@openssh.com,hmac-sha2-512\"");
                                    
                                    for (String param : params) {
                                    	String[] strs = param.split(":");
                                    	ElementValueType elementKey = fileFact.createElementValueType();
                                        elementKey.setElementRef("PARAMETER"); //$NON-NLS-1$
                                        elementKey.setValue(strs[0]);
                                        values.add(elementKey);
                                        
                                        ElementValueType elementValue = fileFact.createElementValueType();
                                        elementValue.setElementRef("VALUE"); //$NON-NLS-1$
                                        elementValue.setValue(strs[1]);
                                        values.add(elementValue);
                                    }
                                    ComponentUtilities.setNodeProperty(node, "CLIENT_PARAMETERS", values);
                                }
                            }

                        }));
            }

            if (modified) {
                return ExecutionResult.SUCCESS_NO_ALERT;
            } else {
                return ExecutionResult.NOTHING_TO_DO;
            }
        } catch (Exception e) {
            ExceptionHandler.process(e);
            return ExecutionResult.FAILURE;
        }
    }
}

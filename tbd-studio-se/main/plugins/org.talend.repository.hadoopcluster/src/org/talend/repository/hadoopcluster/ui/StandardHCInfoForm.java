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
package org.talend.repository.hadoopcluster.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.ui.runtime.image.EImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.swt.formtools.Form;
import org.talend.commons.ui.swt.formtools.LabelledCheckbox;
import org.talend.commons.ui.swt.formtools.LabelledCombo;
import org.talend.commons.ui.swt.formtools.LabelledFileField;
import org.talend.commons.ui.swt.formtools.LabelledText;
import org.talend.commons.ui.swt.formtools.LabelledWidget;
import org.talend.commons.ui.swt.formtools.UtilsButton;
import org.talend.core.database.conn.ConnParameterKeys;
import org.talend.core.hadoop.repository.HadoopRepositoryUtil;
import org.talend.core.hadoop.version.EAuthenticationMode;
import org.talend.core.hadoop.version.EDataprocAuthType;
import org.talend.core.hadoop.version.custom.ECustomVersionGroup;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.process.INode;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.utils.ContextParameterUtils;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.designer.core.IDesignerCoreService;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.hdfsbrowse.hadoop.service.EHadoopServiceType;
import org.talend.designer.hdfsbrowse.hadoop.service.HadoopServiceProperties;
import org.talend.designer.hdfsbrowse.hadoop.service.check.CheckHadoopServicesDialog;
import org.talend.designer.hdfsbrowse.manager.HadoopParameterValidator;
import org.talend.hadoop.distribution.DistributionFactory;
import org.talend.hadoop.distribution.component.MRComponent;
import org.talend.hadoop.distribution.constants.apache.ESparkMode;
import org.talend.hadoop.distribution.constants.apache.ISparkDistribution;
import org.talend.hadoop.distribution.constants.databricks.DatabricksRuntimeVersion;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksCloudProvider;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksClusterType ;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksNodesType;
import org.talend.hadoop.distribution.constants.databricks.EDatabricksSubmitMode;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesAzureCredentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesBucketCloudProvider;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesS3Credentials;
import org.talend.hadoop.distribution.constants.kubernetes.EKubernetesSubmitMode;
import org.talend.hadoop.distribution.helper.HadoopDistributionsHelper;
import org.talend.hadoop.distribution.model.DistributionBean;
import org.talend.hadoop.distribution.model.DistributionVersion;
import org.talend.metadata.managment.ui.dialog.HadoopPropertiesDialog;
import org.talend.metadata.managment.ui.dialog.SparkPropertiesDialog;
import org.talend.metadata.managment.ui.utils.ConnectionContextHelper;
import org.talend.metadata.managment.ui.utils.ExtendedNodeConnectionContextUtils.EHadoopParamName;
import org.talend.repository.hadoopcluster.conf.HadoopConfsUtils;
import org.talend.repository.hadoopcluster.i18n.Messages;
import org.talend.repository.hadoopcluster.ui.common.AbstractHadoopClusterInfoForm;
import org.talend.repository.hadoopcluster.ui.common.AbstractHadoopForm;
import org.talend.repository.hadoopcluster.ui.conf.HadoopContextConfConfigDialog;
import org.talend.repository.hadoopcluster.util.HCParameterUtil;
import org.talend.repository.hadoopcluster.util.HCRepositoryUtil;
import org.talend.repository.hadoopcluster.util.HCVersionUtil;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;
import org.talend.repository.model.hadoopcluster.impl.HadoopClusterConnectionImpl;
import org.talend.repository.model.hadoopcluster.util.EncryptionUtil;
import org.talend.hadoop.distribution.constants.synapse.ESynapseAuthType;
import org.talend.core.hadoop.version.EHdinsightStorage;

/**
 *
 * created by ycbai on 2014年9月16日 Detailled comment
 *
 */
public class StandardHCInfoForm extends AbstractHadoopClusterInfoForm<HadoopClusterConnection> {

    private SashForm sash;

    private Composite upsash;

    private Composite downsash;

    private ScrolledComposite scrolledComposite;

    private Composite bigComposite;

    private Composite parentForm;

    protected Composite propertiesComposite;

    private Composite hadoopPropertiesComposite;

    private Composite sparkPropertiesComposite;

    private SparkPropertiesDialog sparkPropertiesDialog;

    private Button useSparkPropertiesBtn;

    private LabelledCombo authenticationCombo;

    private Button kerberosBtn;

    private Composite authPartComposite;

    private Composite authPartCompositeDataproc;

    private Composite authCommonComposite;

    private Composite authNodejtOrRmHistoryComposite;

    private Composite authKeytabComposite;

    private Button keytabBtn;

    private Button useClouderaNaviBtn;

    private Button clouderaNaviButton;

    private LabelledText namenodeUriText;

    private LabelledText jobtrackerUriText;

    private LabelledText rmSchedulerText;

    private LabelledText jobHistoryText;

    private LabelledText stagingDirectoryText;

    private LabelledText namenodePrincipalText;

    private LabelledText jtOrRmPrincipalText;

    private LabelledText jobHistoryPrincipalText;

    private LabelledText keytabPrincipalText;

    private LabelledText userNameText;

    private LabelledText groupText;

    private Button useDNHostBtn;

    private Button hadoopConfsButton;

    private Button useCustomConfBtn;

    private Button setHadoopConfBtn;

    private Button browseHadoopConfBtn;

    private Text hadoopConfSpecificJarText;

    private Group hadoopConfsGroup;

    private ScrolledComposite propertiesScroll;

    private LabelledFileField keytabText;

    private Group customGroup;

    private HadoopPropertiesDialog propertiesDialog;

    private UtilsButton checkServicesBtn;

    private final boolean creation;

    protected DistributionBean hadoopDistribution;

    protected DistributionVersion hadoopVersison;

    private boolean needInitializeContext = false;

    // Mapr Ticket Authentication
    private Button maprTBtn;

    private LabelledText maprTPasswordText;

    private LabelledText maprTClusterText;

    private LabelledText maprTDurationText;

    private Button setMaprTHomeDirBtn;

    private Button setHadoopLoginBtn;

    private Button preloadAuthentificationBtn;

    private LabelledText maprTHomeDirText;

    private LabelledText maprTHadoopLoginText;

    private Composite authMaprTComposite;

    private Composite maprTPCDCompposite;

    private Composite maprTPasswordCompposite;

    private Composite maprTSetComposite;

    private Group authGroup;

    private Group connectionGroup;

    private Group webHDFSSSLEncryptionGrp;

    private Button useWebHDFSSSLEncryptionBtn;

    private Composite webHDFSSSLEncryptionDetailComposite;

    private LabelledFileField webHDFSSSLTrustStorePath;

    private LabelledText webHDFSSSLTrustStorePassword;

    private LabelledCombo sparkModeCombo;

    private ISparkDistribution sparkDistribution;

    private Group dataBricksGroup;

    private Group cdeGroup;

    private LabelledText endpointText;

    private LabelledCombo cloudProviderCombo;

    private LabelledCombo runSubmitCombo;

    private LabelledText clusterIDText;

    private LabelledText tokenText;

    private LabelledText dbfsDepFolderText;

    private Group kubernetesGroup;

    private Group kubernetesS3Group;

    private Group kubernetesAzureGroup;

    private Group kubernetesBlobGroup;

    private LabelledCombo k8sSubmitMode;

    private LabelledText k8sMaster;

    private LabelledText k8sInstances;

    private Button k8sUseRegistrySecret;

    private LabelledText k8sRegistrySecret;

    private LabelledText k8sImage;

    private LabelledText k8sNamespace;

    private LabelledText k8sServiceAccount;

    private LabelledCombo k8sDistUpload;

    private LabelledText k8sS3Bucket;

    private LabelledText k8sS3Folder;

    private LabelledCombo k8sS3Credentials;

    private LabelledText k8sS3AccessKey;

    private LabelledText k8sS3SecretKey;

    private LabelledText k8sBlobAccount;

    private LabelledText k8sBlobContainer;

    private LabelledText k8sBlobSecretKey;

    private LabelledText k8sAzureAccount;

    private LabelledCombo k8sAzureCredentials;

    private LabelledText k8sAzureContainer;

    private LabelledText k8sAzureSecretKey;

    private LabelledText k8sAzureAADKey;

    private LabelledText k8sAzureAADClientID;

    private LabelledText k8sAzureAADDirectoryID;
    private LabelledCombo clusterType;

    private LabelledCombo driverNodeType;

    private LabelledCombo nodeType;

    private LabelledCombo clusterRuntimeVersion;

    private Group dataProcGroup;

    //Dataproc
    private LabelledText projectIdNameText;

    private LabelledText clusterIdNameText;

    private LabelledText regionNameText;

    private LabelledText jarsBucketNameText;

    private LabelledCombo credentialTypeCombo;

    private LabelledFileField pathToCredentials;

    private LabelledText oauthTokenText;

    private Button credentialsBtn;

    // Standalone 

    private Group standaloneGroup;
    private LabelledWidget standaloneMaster;
    private LabelledWidget standaloneConfigureExec;
    private LabelledWidget standaloneExecCore;
    private LabelledWidget standaloneExecMemory;
    
    // Spark Submit scripts
    
    private Group sparkSubmitScriptGroup;
    private LabelledWidget sparkSubmitScriptHome;

    // CDE widgets
    private LabelledWidget cdeApiEndPoint;
    private LabelledWidget cdeAutoGenerateToken;
    private LabelledWidget cdeToken;
    private LabelledWidget cdeTokenEndpoint;
    private LabelledWidget cdeWorkloadUser;
    private LabelledWidget cdeWorkloadPassword;
    // Mapping between connection parameter and form field 
    private Map<String, LabelledWidget> fieldByParamKey;

    // knox
    private Button useKnoxButton;

    //Synapse widgets
    private Group synapseGroup;
    private LabelledText synapseHostname;

    private LabelledWidget synapseToken;

    private LabelledWidget synapseSparkPools;

    private LabelledCombo storage;

    private LabelledWidget azureHostname;

    private LabelledWidget azureContainer;

    private LabelledCombo storageAuthType;

    private LabelledWidget azureUsername;

    private LabelledWidget azurePassword;

    private LabelledWidget azureClientId;

    private LabelledWidget azureDirectoryId;

    private LabelledWidget azureClientKey;

    private LabelledWidget useSynapseCertificate;

    private LabelledFileField azureClientCertificate;

    private LabelledWidget azureDeployBlob;

    private LabelledWidget driverMemory;

    private LabelledWidget driverCores;

    private LabelledWidget executorCores;

    private LabelledWidget executorMemory;

    //HDI widgets
    private Group hdiGroup;

    private Group livyGroup;

    private Group fsGroup;

    private LabelledText livyHostname;

    private LabelledText livyPort;

    private LabelledText livyUsername;

    private LabelledText hdiUsername;

    private LabelledText hdiPassword;

    private LabelledText fsHostname;

    private LabelledText fsContainer;

    private LabelledText fsUsername;

    private LabelledText fsPassword;

    private LabelledText fsDeployBlob;

    private LabelledCombo hdiStorageType;

    public StandardHCInfoForm(Composite parent, ConnectionItem connectionItem, String[] existingNames, boolean creation,
                              DistributionBean hadoopDistribution, DistributionVersion hadoopVersison) {
        super(parent, SWT.NONE, existingNames);
        this.parentForm = parent;
        this.connectionItem = connectionItem;
        this.creation = creation;
        this.hadoopDistribution = hadoopDistribution;
        this.hadoopVersison = hadoopVersison;
        if (hadoopVersison != null && hadoopVersison.hadoopComponent instanceof ISparkDistribution) {
            this.sparkDistribution = (ISparkDistribution) hadoopVersison.hadoopComponent;
        }
        setConnectionItem(connectionItem);
        setupForm(true);
        init();
        setLayoutData(new GridData(GridData.FILL_BOTH));
        GridLayout layout = (GridLayout) getLayout();
        layout.marginWidth = 0;
        layout.marginHeight = 0;
        setLayout(layout);
    }

    @Override
    public void initialize() {
        // initialize for context mode
        if (needInitializeContext) {
            init();
        }
    }

    @Override
    public void init() {
        if (isNeedFillDefaults()) {
            fillDefaults();
        }
        if (isContextMode()) {
            adaptFormToEditable();
        }

        EAuthenticationMode authMode = EAuthenticationMode.getAuthenticationByName(getConnection().getAuthMode(), false);
        if (authMode != null) {
            authenticationCombo.setText(authMode.getDisplayName());
        } else {
            authenticationCombo.select(0);
        }
        HadoopClusterConnection connection = getConnection();
        namenodeUriText.setText(connection.getNameNodeURI());
        jobtrackerUriText.setText(connection.getJobTrackerURI());
        rmSchedulerText.setText(StringUtils.trimToEmpty(connection.getRmScheduler()));
        jobHistoryText.setText(StringUtils.trimToEmpty(connection.getJobHistory()));
        stagingDirectoryText.setText(StringUtils.trimToEmpty(connection.getStagingDirectory()));
        useDNHostBtn.setSelection(connection.isUseDNHost());
        useSparkPropertiesBtn.setSelection(connection.isUseSparkProperties());
        useCustomConfBtn.setSelection(connection.isUseCustomConfs());
        if (useClouderaNaviBtn != null) {
            useClouderaNaviBtn.setSelection(connection.isUseClouderaNavi());
        }
        kerberosBtn.setSelection(connection.isEnableKerberos());
        namenodePrincipalText.setText(connection.getPrincipal());
        jtOrRmPrincipalText.setText(connection.getJtOrRmPrincipal());
        jobHistoryPrincipalText.setText(connection.getJobHistoryPrincipal());
        keytabBtn.setSelection(connection.isUseKeytab());
        keytabPrincipalText.setText(connection.getKeytabPrincipal());
        keytabText.setText(connection.getKeytab());
        userNameText.setText(connection.getUserName());
        groupText.setText(connection.getGroup());

        //
        maprTBtn.setSelection(connection.isEnableMaprT());
        maprTPasswordText.setText(connection.getMaprTPassword());
        maprTClusterText.setText(connection.getMaprTCluster());
        maprTDurationText.setText(connection.getMaprTDuration());
        setMaprTHomeDirBtn.setSelection(connection.isSetMaprTHomeDir());
        setHadoopLoginBtn.setSelection(connection.isSetHadoopLogin());
        preloadAuthentificationBtn.setSelection(connection.isPreloadAuthentification());
        maprTHomeDirText.setText(connection.getMaprTHomeDir());
        maprTHadoopLoginText.setText(connection.getMaprTHadoopLogin());
        //
        useWebHDFSSSLEncryptionBtn.setSelection(connection.isUseWebHDFSSSL());
        webHDFSSSLTrustStorePath.setText(connection.getWebHDFSSSLTrustStorePath());
        webHDFSSSLTrustStorePassword.setText(connection.getWebHDFSSSLTrustStorePassword());

        setHadoopConfBtn.setSelection(
                Boolean.valueOf(HCParameterUtil.isOverrideHadoopConfs(connection)));
        hadoopConfSpecificJarText.setText(Optional
                .ofNullable(connection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CONF_SPECIFIC_JAR))
                .orElse(""));

        needInitializeContext = true;
        updateStatus(IStatus.OK, EMPTY_STRING);

        onUseCustomConfBtnSelected(null);
        onOverrideHadoopConfBtnSelected(null);

        if ("SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())) {
            useCustomConfBtn.setEnabled(false);
            useCustomConfBtn.setSelection(true);
            setHadoopConfBtn.setEnabled(false);
            setHadoopConfBtn.setSelection(true);
            hadoopConfSpecificJarText.setEditable(true);
            String sparkModeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE);

            if (sparkModeValue != null) {
                sparkModeCombo.setText(getSparkModeByValue(sparkModeValue).getLabel());
            } else {
                sparkModeCombo.setText(ESparkMode.KUBERNETES.getLabel());
            }

            String providerValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER);
            if (providerValue != null) {
                if (providerValue.startsWith("context.")) {
                    cloudProviderCombo.setText(providerValue);
                } else {
                    cloudProviderCombo.setText(getDatabricksCloudProviderByValue(providerValue).getProviderLableName());
                }
            }

            String runtimeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION);
            if (providerValue != null) {
                clusterRuntimeVersion.setText(runtimeValue);
            } else {
                clusterRuntimeVersion.setText(DatabricksRuntimeVersion.defaultVersion);
            }

            String clusterTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE);
            if (providerValue != null) {
                clusterType.setText(getDatabricksClusterTypeLabelByValue(clusterTypeValue));
            } else {
                clusterType.setText(EDatabricksClusterType.INTERACTIVE.getLabelName());
            }

            String driverNodeTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE);
            if (providerValue != null) {
                driverNodeType.setText(driverNodeTypeValue);
            } else {
                driverNodeType.setText(EDatabricksNodesType.getDefaultNodeTypeByProvider(providerValue));
            }

            String nodeTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE);
            if (providerValue != null) {
                nodeType.setText(nodeTypeValue);
            } else {
                nodeType.setText(EDatabricksNodesType.getDefaultNodeTypeByProvider(providerValue));
            }

            String runModeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE);
            if (runModeValue != null) {
                if (runModeValue.startsWith("context.")) {
                    runSubmitCombo.setText(runModeValue);
                } else {
                    runSubmitCombo.setText(getDatabricksRunModeByValue(runModeValue).getRunModeLabel());
                }
            } else {
                runSubmitCombo.setText(EDatabricksSubmitMode.CREATE_RUN_JOB.getRunModeLabel());
            }

            String endPoint = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_ENDPOINT));
            endpointText.setText(endPoint);

            String clusterId = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_ID));
            clusterIDText.setText(clusterId);

            String token = StringUtils
                    .trimToEmpty(EncryptionUtil.getValue(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_TOKEN), false));
            tokenText.setText(token);

            String folder = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DBFS_DEP_FOLDER));
            dbfsDepFolderText.setText(folder);

            String k8sSubmitModeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_SUBMIT_MODE);
            if (k8sSubmitModeValue != null) {
                this.k8sSubmitMode.setText(getK8sSubmitModeByValue(k8sSubmitModeValue).getLabel());
            } else {
                this.k8sSubmitMode.setText(EKubernetesSubmitMode.SPARK_SUBMIT.getLabel());
            }

            String k8sMaster = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_MASTER));
            this.k8sMaster.setText(k8sMaster);

            String k8sInstances = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_INSTANCES));
            this.k8sInstances.setText(k8sInstances);

            String k8sRegistrySecret = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_REGISTRYSECRET));
            this.k8sRegistrySecret.setText(k8sRegistrySecret);

            String k8sImage = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_IMAGE));
            this.k8sImage.setText(k8sImage);

            String k8sNamespace = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_NAMESPACE));
            this.k8sNamespace.setText(k8sNamespace);

            String k8sServiceAccount = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_SERVICEACCOUNT));
            this.k8sServiceAccount.setText(k8sServiceAccount);

            String k8sDistUploadValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_DISTUPLOAD);
            if (k8sDistUploadValue != null) {
                this.k8sDistUpload.setText(getK8sDistUploadByValue(k8sDistUploadValue).getLabel());
            } else {
                this.k8sDistUpload.setText(EKubernetesBucketCloudProvider.S3.getLabel());
            }

            String k8sS3Bucket = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3BUCKET));
            this.k8sS3Bucket.setText(k8sS3Bucket);

            String k8sS3Folder = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3FOLDER));
            this.k8sS3Folder.setText(k8sS3Folder);

            String k8sS3CredentialsValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3CREDENTIALS);
            if (k8sS3CredentialsValue != null) {
                this.k8sS3Credentials.setText(getK8sS3CredentialsByValue(k8sS3CredentialsValue).getLabel());
            } else {
                this.k8sS3Credentials.setText(EKubernetesS3Credentials.ACCESSANDSECRET.getLabel());
            }

            String k8sS3AccessKey = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3ACCESSKEY));
            this.k8sS3AccessKey.setText(k8sS3AccessKey);

            String k8sS3SecretKey = StringUtils
                    .trimToEmpty(EncryptionUtil.getValue(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3SECRETKEY), false));
            this.k8sS3SecretKey.setText(k8sS3SecretKey);

            String k8sBlobAccount = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBACCOUNT));
            this.k8sBlobAccount.setText(k8sBlobAccount);

            String k8sBlobContainer = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBCONTAINER));
            this.k8sBlobContainer.setText(k8sBlobContainer);

            String k8sBlobSecretKey = StringUtils
                    .trimToEmpty(EncryptionUtil.getValue(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBSECRETKEY), false));
            this.k8sBlobSecretKey.setText(k8sBlobSecretKey);

            String k8sAzureAccount = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREACCOUNT));
            this.k8sAzureAccount.setText(k8sAzureAccount);

            String k8sAzureCredentialsValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECREDENTIALS);
            if (k8sAzureCredentialsValue != null) {
                this.k8sAzureCredentials.setText(getK8sAzureCredentialsByValue(k8sAzureCredentialsValue).getLabel());
            } else {
                this.k8sAzureCredentials.setText(EKubernetesAzureCredentials.SECRET.getLabel());
            }

            String k8sAzureContainer = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECONTAINER));
            this.k8sAzureContainer.setText(k8sAzureContainer);

            String k8sAzureSecretKey = StringUtils
                    .trimToEmpty(EncryptionUtil.getValue(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURESECRETKEY), false));
            this.k8sAzureSecretKey.setText(k8sAzureSecretKey);

            String k8sAzureAADKey = StringUtils
                    .trimToEmpty(EncryptionUtil.getValue(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADKEY), false));
            this.k8sAzureAADKey.setText(k8sAzureAADKey);

            String k8sAzureAADClientID = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADCLIENTID));
            this.k8sAzureAADClientID.setText(k8sAzureAADClientID);

            String k8sAzureAADDirectoryID = StringUtils
                    .trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADDIRECTORYID));
            this.k8sAzureAADDirectoryID.setText(k8sAzureAADDirectoryID);

            //Dataproc
            String projectIdValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_PROJECT_ID));
            projectIdNameText.setText(projectIdValue);

            String clusterIdValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_CLUSTER_ID));
            clusterIdNameText.setText(clusterIdValue);

            String regionValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_REGION));
            regionNameText.setText(regionValue);

            String jarsBucketValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_JARS_BUCKET));
            jarsBucketNameText.setText(jarsBucketValue);

            boolean checkCredentialsBtn = Boolean.parseBoolean(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_PROVIDE_GOOGLE_CREDENTIALS));
            credentialsBtn.setSelection(checkCredentialsBtn);

            credentialTypeCombo.setVisible(credentialsBtn.getSelection());
            String authModeValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AUTH_MODE));
            if (authModeValue != null) {
                EDataprocAuthType type = EDataprocAuthType.getDataprocAuthTypeByName(authModeValue, false);
                if (type != null) {
                    credentialTypeCombo.setText(type.getDisplayName());
                } else {
                    credentialTypeCombo.select(0);
                }
            } else {
                credentialTypeCombo.select(0);
            }

            String pathToGoogleCredentials = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_PATH_TO_GOOGLE_CREDENTIALS));
            pathToCredentials.setText(pathToGoogleCredentials);

            String credentialName = credentialTypeCombo.getText();
            pathToCredentials.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.SERVICE_ACCOUNT.getDisplayName().equals(credentialName));

            String oauthTokenValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_OAUTH2_TOKEN_TO_GOOGLE_CREDENTIALS));
            oauthTokenText.setText(oauthTokenValue);
            oauthTokenText.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.OAUTH_API.getDisplayName().equals(credentialName));

            // CDE - Set widget values from connection
            for (Entry<String, LabelledWidget> entry : fieldByParamKey.entrySet())
            {
                String value = StringUtils.trimToEmpty(getConnection().getParameters().get(entry.getKey()));
                entry.getValue().set(value);
            }
            updateCdeFieldsVisibility();
            updateStandaloneConfigureExecutors();
            updateDatabricksFields();
            updateSynapseFieldsVisibility();

            //knox
            String useKnoxStr = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_USE_KNOX);
            useKnoxButton.setSelection("true".equals(useKnoxStr));
            updateKnoxPart();

        }
    }


    @Override
    protected void adaptFormToReadOnly() {
        readOnly = isReadOnly();
        namenodeUriText.setReadOnly(readOnly);
        jobtrackerUriText.setReadOnly(readOnly);
        rmSchedulerText.setReadOnly(readOnly);
        jobHistoryText.setReadOnly(readOnly);
        stagingDirectoryText.setReadOnly(readOnly);
        useDNHostBtn.setEnabled(!readOnly);
        useSparkPropertiesBtn.setEnabled(!readOnly);
        sparkPropertiesDialog.propertyButton.setEnabled(!readOnly && useSparkPropertiesBtn.getSelection());
        useCustomConfBtn.setEnabled(!readOnly);
        hadoopConfsButton.setEnabled(!readOnly && useCustomConfBtn.getSelection() && !setHadoopConfBtn.getSelection());
        if (useClouderaNaviBtn != null) {
            useClouderaNaviBtn.setEnabled(!readOnly);
            clouderaNaviButton.setEnabled(!readOnly && useClouderaNaviBtn.getSelection());
        }
        kerberosBtn.setEnabled(!readOnly);
        namenodePrincipalText.setReadOnly(readOnly);
        jtOrRmPrincipalText.setReadOnly(readOnly);
        jobHistoryPrincipalText.setReadOnly(readOnly);
        userNameText.setReadOnly(readOnly);
        groupText.setReadOnly(readOnly);
        maprTBtn.setEnabled(!readOnly);
        maprTPasswordText.setReadOnly(readOnly);
        maprTClusterText.setReadOnly(readOnly);
        maprTDurationText.setReadOnly(readOnly);
        setMaprTHomeDirBtn.setEnabled(!readOnly);
        setHadoopLoginBtn.setEnabled(!readOnly);
        preloadAuthentificationBtn.setEnabled(!readOnly);
        maprTHomeDirText.setReadOnly(readOnly);
        maprTHadoopLoginText.setReadOnly(readOnly);
        // setHadoopConfBtn.setEnabled(!readOnly);
        hadoopConfSpecificJarText.setEditable(!readOnly && setHadoopConfBtn.getSelection());
        browseHadoopConfBtn.setEnabled(!readOnly && setHadoopConfBtn.getSelection());

        useWebHDFSSSLEncryptionBtn.setEnabled(!readOnly);
        webHDFSSSLTrustStorePath.setReadOnly(readOnly);
        webHDFSSSLTrustStorePassword.setReadOnly(readOnly);
        if ("SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())) {
            useCustomConfBtn.setEnabled(false);
            useCustomConfBtn.setSelection(true);
            setHadoopConfBtn.setEnabled(false);
            setHadoopConfBtn.setSelection(true);
            hadoopConfSpecificJarText.setEditable(true);
            sparkModeCombo.setEnabled(!readOnly);
            runSubmitCombo.setEnabled(!readOnly);
            cloudProviderCombo.setEnabled(!readOnly);
            clusterRuntimeVersion.setEnabled(!readOnly);
            driverNodeType.setEnabled(!readOnly);
            nodeType.setEnabled(!readOnly);
            clusterType.setEnabled(!readOnly);
            endpointText.setEnabled(!readOnly);
            clusterIDText.setEnabled(!readOnly);
            tokenText.setEnabled(!readOnly);
            dbfsDepFolderText.setEnabled(!readOnly);
        }

    }

    @Override
    protected void adaptFormToEditable() {
        super.adaptFormToEditable();
        if (isContextMode()) {
            maprTPasswordText.getTextControl().setEchoChar('\0');
            webHDFSSSLTrustStorePassword.getTextControl().setEchoChar('\0');
        } else {
            maprTPasswordText.getTextControl().setEchoChar('*');
            webHDFSSSLTrustStorePassword.getTextControl().setEchoChar('*');
        }
    }

    @Override
    protected void updateEditableStatus(boolean isEditable) {
        authenticationCombo.setEnabled(isEditable);
        namenodeUriText.setEditable(isEditable);
        jobtrackerUriText.setEditable(isEditable);
        rmSchedulerText.setEditable(isEditable);
        jobHistoryText.setEditable(isEditable);
        stagingDirectoryText.setEditable(isEditable);
        useDNHostBtn.setEnabled(isEditable);
        kerberosBtn.setEnabled(isEditable && (isCurrentHadoopVersionSupportSecurity() || isCustomUnsupportHasSecurity()));
        boolean isKerberosEditable = kerberosBtn.isEnabled() && kerberosBtn.getSelection();
        namenodePrincipalText.setEditable(isKerberosEditable);
        jtOrRmPrincipalText.setEditable(isKerberosEditable);
        jobHistoryPrincipalText.setEditable(isEditable && isJobHistoryPrincipalEditable());
        userNameText.setEditable(isEditable && !kerberosBtn.getSelection());
        groupText.setEditable(isEditable && (isCurrentHadoopVersionSupportGroup() || isCustomUnsupportHasGroup()));
        keytabBtn.setEnabled(isEditable && kerberosBtn.getSelection());
        boolean isKeyTabEditable = keytabBtn.isEnabled() && keytabBtn.getSelection();
        keytabText.setEditable(isKeyTabEditable);
        keytabPrincipalText.setEditable(isKeyTabEditable);
        maprTBtn.setEnabled(isEditable && isCurrentHadoopVersionSupportMapRTicket());
        boolean isMaprTEditable = maprTBtn.isEnabled() && maprTBtn.getSelection();
        maprTPasswordText.setEditable(isMaprTEditable && !isKerberosEditable);
        maprTClusterText.setEditable(isMaprTEditable);
        maprTDurationText.setEditable(isMaprTEditable);
        setMaprTHomeDirBtn.setEnabled(isEditable && maprTBtn.getSelection());
        setHadoopLoginBtn.setEnabled(isEditable && maprTBtn.getSelection());
        preloadAuthentificationBtn.setEnabled(isEditable && maprTBtn.getSelection());
        maprTHomeDirText.setEditable(isMaprTEditable);
        maprTHadoopLoginText.setEditable(isMaprTEditable);
        useWebHDFSSSLEncryptionBtn.setEnabled(isEditable && isCurrentHadoopVersionSupportWebHDFS());
        boolean isUseWebHDFSSSLEncryptionBtnEditable = useWebHDFSSSLEncryptionBtn.isEnabled()
                && useWebHDFSSSLEncryptionBtn.getSelection();
        webHDFSSSLTrustStorePath.setEditable(isUseWebHDFSSSLEncryptionBtnEditable);
        webHDFSSSLTrustStorePassword.setEditable(isUseWebHDFSSSLEncryptionBtnEditable);

        propertiesDialog.updateStatusLabel(getHadoopProperties());
        useSparkPropertiesBtn.setEnabled(isEditable);
        sparkPropertiesDialog.updateStatusLabel(getSparkProperties());
        ((HadoopClusterForm) this.getParent()).updateEditableStatus(isEditable);

        // setHadoopConfBtn.setEnabled(isEditable);
        hadoopConfSpecificJarText.setEditable(isEditable && setHadoopConfBtn.getSelection());
        browseHadoopConfBtn.setEnabled(isEditable && setHadoopConfBtn.getSelection());

        if(sparkModeCombo != null) {
            sparkModeCombo.setEnabled(isEditable);
        }
        runSubmitCombo.setEnabled(isEditable);
        cloudProviderCombo.setEnabled(isEditable);
        clusterRuntimeVersion.setEnabled(isEditable);
        driverNodeType.setEnabled(isEditable);
        nodeType.setEnabled(isEditable);
        clusterType.setEnabled(isEditable);
        endpointText.setEnabled(isEditable);
        clusterIDText.setEnabled(isEditable);
        tokenText.setEnabled(isEditable);
        dbfsDepFolderText.setEnabled(isEditable);

        //Dataproc
        projectIdNameText.setEditable(isEditable);
        clusterIdNameText.setEditable(isEditable);
        regionNameText.setEditable(isEditable);
        jarsBucketNameText.setEditable(isEditable);
        pathToCredentials.setEditable(isEditable);
        oauthTokenText.setEditable(isEditable);

        ((LabelledText) standaloneMaster).setEditable(isEditable);
        ((LabelledText) standaloneExecCore).setEditable(isEditable);
        ((LabelledText) standaloneExecMemory).setEditable(isEditable);

        ((LabelledText) sparkSubmitScriptHome).setEditable(isEditable);
        
        useKnoxButton.setEnabled(isEditable);
    }

    @Override
    protected void addFields() {
        if ("SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())) { //$NON-NLS-1$
            Group configGroup = Form.createGroup(this, 2, Messages.getString("HadoopClusterForm.sparkConfig"), 120); //$NON-NLS-1$
            configGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            sparkModeCombo = new LabelledCombo(configGroup, Messages.getString("HadoopClusterForm.sparkMode"), //$NON-NLS-1$
                    Messages.getString("HadoopClusterForm.sparkMode.tooltip"), // $NON-NLS-2$
                    getSparkModes());
            String sparkModeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE);
            if (sparkModeValue != null) {
                sparkModeCombo.setText(getSparkModeByValue(sparkModeValue).getLabel());
            } else {
                sparkModeCombo.setText(ESparkMode.KUBERNETES.getLabel());
            }
            getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE,
                    getSparkModeByName(sparkModeCombo.getText()).getValue());
        }

        Composite parent = new Composite(this, SWT.NONE);
        parent.setLayout(new FillLayout());
        GridData parentGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        parent.setLayoutData(parentGridData);

        sash = new SashForm(parent, SWT.VERTICAL | SWT.SMOOTH);
        sash.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        GridLayout layout = new GridLayout();
        sash.setLayout(layout);
        upsash = new Composite(sash, SWT.NONE);
        GridLayout upsashLayout = new GridLayout(1, false);
        upsash.setLayout(upsashLayout);

        downsash = new Composite(sash, SWT.NONE);
        GridLayout downsashLayout = new GridLayout(1, false);
        downsash.setLayout(downsashLayout);
        sash.setWeights(new int[] { 21, 17 });

        scrolledComposite = new ScrolledComposite(upsash, SWT.V_SCROLL | SWT.H_SCROLL);
        scrolledComposite.setExpandHorizontal(true);
        scrolledComposite.setExpandVertical(true);
        scrolledComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

        bigComposite = Form.startNewGridLayout(scrolledComposite, 1);
        scrolledComposite.setContent(bigComposite);

        addCustomFields();
        addConnectionFields(bigComposite);
        addWebHDFSEncryptionFields(bigComposite);
        addAuthenticationFields(bigComposite);

        propertiesScroll = new ScrolledComposite(downsash, SWT.V_SCROLL | SWT.H_SCROLL);
        propertiesScroll.setExpandHorizontal(true);
        propertiesScroll.setExpandVertical(true);
        propertiesScroll.setLayoutData(new GridData(GridData.FILL_BOTH));

        propertiesComposite = Form.startNewGridLayout(propertiesScroll, 1);
        propertiesScroll.setContent(propertiesComposite);
        GridLayout propertiesLayout = new GridLayout(2, false);
        propertiesLayout.marginWidth = 0;
        propertiesLayout.marginHeight = 0;
        propertiesComposite.setLayout(propertiesLayout);
        propertiesComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        addHadoopPropertiesFields();
        addSparkPropertiesFields();
        addNavigatorFields();
        addHadoopConfsFields();

        addCheckFields();

        addKubernetesFields();
        addDatabricksFields();
        addDataprocField();
        addCdeFields();
        addStandaloneFields();
        addSynapseFields();
        addHDIFields();
        addSparkSubmitScriptFields();

        hideFieldsOnSparkMode();

        scrolledComposite.addControlListener(new ControlAdapter() {

            @Override
            public void controlResized(ControlEvent e) {
                Rectangle r = scrolledComposite.getClientArea();
                // scrolledComposite.setMinSize(bigComposite.computeSize(r.width-100, 550));
                if (Platform.getOS().equals(Platform.OS_LINUX)) {
                    scrolledComposite.setMinSize(bigComposite.computeSize(SWT.DEFAULT, 900));
                } else {
                    scrolledComposite.setMinSize(bigComposite.computeSize(SWT.DEFAULT, 620));
                }
            }
        });
        propertiesScroll.addControlListener(new ControlAdapter() {

            @Override
            public void controlResized(ControlEvent e) {
                propertiesScroll.setMinSize(propertiesComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
            }
        });
    }

    private void addDatabricksFields() {
        dataBricksGroup = Form.createGroup(bigComposite, 2, Messages.getString("DataBricksInfoForm.text.configuration"), 110); //$NON-NLS-1$
        dataBricksGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        clusterType = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.clusterType"), "", //$NON-NLS-1$ $NON-NLS-2$
                getClusterTypes());
        String clusterTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE);
        if (clusterTypeValue != null && clusterTypeValue.startsWith("context.")) {
            clusterType.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE));
        }
        runSubmitCombo = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.runSubmitMode"), "", //$NON-NLS-1$ $NON-NLS-2$
                getRunSubmitModes());
        String runSubmitValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE);
        if (runSubmitValue!= null && runSubmitValue.startsWith("context.")) {
            runSubmitCombo.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE));
        }
        cloudProviderCombo = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.cloudProvider"), "", //$NON-NLS-1$ $NON-NLS-2$
                getProviders());
        String cloudProviderValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER);
        if (cloudProviderValue!= null && cloudProviderValue.startsWith("context.")) {
            cloudProviderCombo.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER));
        }
        endpointText = new LabelledText(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.endPoint"), 1); //$NON-NLS-1$
        clusterRuntimeVersion = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.runSubmitMode"), "", //$NON-NLS-1$ $NON-NLS-2$
                DatabricksRuntimeVersion.getAvailableRuntimeAndSparkVersion().stream()
                        .filter(x -> ((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDfVersion().equals(x.getSparkVersion()))
                        .map(x -> x.getRuntimeVersion())
                        .collect(Collectors.toList()));
        String custerRuntimeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION);
        if (custerRuntimeValue != null && custerRuntimeValue.startsWith("context.")) {
            clusterRuntimeVersion.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION));
        }
        driverNodeType = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.driverNodeType"), "", //$NON-NLS-1$ $NON-NLS-2$
                EDatabricksNodesType.getNodeTypeByProvider(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER)));
        String driverNodeTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE);
        if (driverNodeTypeValue != null && driverNodeTypeValue.startsWith("context.")) {
            driverNodeType.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE));
        }
        nodeType = new LabelledCombo(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.nodeType"), "", //$NON-NLS-1$ $NON-NLS-2$
                EDatabricksNodesType.getNodeTypeByProvider(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER)));
        String nodeTypeValue = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE);
        if (nodeTypeValue != null && nodeTypeValue.startsWith("context.")) {
            nodeType.add(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE));
        }
        clusterIDText = new LabelledText(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.clusterID"), 1); //$NON-NLS-1$
        tokenText = new LabelledText(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.token"), 1, //$NON-NLS-1$
                SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);
        dbfsDepFolderText = new LabelledText(dataBricksGroup, Messages.getString("DataBricksInfoForm.text.dbfsDepFolder"), 1); //$NON-NLS-1$

    }

    private void addKubernetesFields() {
        kubernetesGroup = Form.createGroup(bigComposite, 2, Messages.getString("KubernetesInfoForm.text.kubernetesGroup"), 110); //$NON-NLS-1$
        kubernetesGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        k8sSubmitMode = new LabelledCombo(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sSubmitMode"), "", //$NON-NLS-1$ $NON-NLS-2$
                getK8sSubmitModes());
        k8sMaster = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sMaster"), 1); //$NON-NLS-1$
        k8sInstances = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sInstances"), 1); //$NON-NLS-1$
        k8sUseRegistrySecret = new Button(kubernetesGroup, SWT.CHECK);
        k8sUseRegistrySecret.setText(Messages.getString("KubernetesInfoForm.text.k8sUseRegistrySecret")); //$NON-NLS-1$
        k8sUseRegistrySecret.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 4, 1));
        k8sRegistrySecret = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sRegistrySecret"), 1); //$NON-NLS-1$
        k8sImage = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sImage"), 1); //$NON-NLS-1$
        k8sNamespace = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sNamespace"), 1); //$NON-NLS-1$
        k8sServiceAccount = new LabelledText(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sServiceAccount"), 1); //$NON-NLS-1$
        k8sDistUpload = new LabelledCombo(kubernetesGroup, Messages.getString("KubernetesInfoForm.text.k8sDistUpload"), "", getK8sCloudProviders()); //$NON-NLS-1$

        kubernetesS3Group = Form.createGroup(bigComposite, 2, Messages.getString("KubernetesInfoForm.text.temporaryFS"), 110); //$NON-NLS-1$
        kubernetesS3Group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        k8sS3Bucket = new LabelledText(kubernetesS3Group, Messages.getString("KubernetesInfoForm.text.k8sS3Bucket"), 1); //$NON-NLS-1$
        k8sS3Folder = new LabelledText(kubernetesS3Group, Messages.getString("KubernetesInfoForm.text.k8sS3Folder"), 1); //$NON-NLS-1$
        k8sS3Credentials = new LabelledCombo(kubernetesS3Group, Messages.getString("KubernetesInfoForm.text.k8sS3Credentials"), "", getK8sS3Credentials()); //$NON-NLS-1$
        k8sS3AccessKey = new LabelledText(kubernetesS3Group, Messages.getString("KubernetesInfoForm.text.k8sS3AccessKey"), 1); //$NON-NLS-1$
        k8sS3SecretKey = new LabelledText(kubernetesS3Group, Messages.getString("KubernetesInfoForm.text.k8sS3SecretKey"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$

        kubernetesBlobGroup = Form.createGroup(bigComposite, 2, Messages.getString("KubernetesInfoForm.text.temporaryFS"), 110); //$NON-NLS-1$
        kubernetesBlobGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        k8sBlobAccount = new LabelledText(kubernetesBlobGroup, Messages.getString("KubernetesInfoForm.text.k8sBlobAccount"), 1); //$NON-NLS-1$
        k8sBlobContainer = new LabelledText(kubernetesBlobGroup, Messages.getString("KubernetesInfoForm.text.k8sBlobContainer"), 1); //$NON-NLS-1$
        k8sBlobSecretKey = new LabelledText(kubernetesBlobGroup, Messages.getString("KubernetesInfoForm.text.k8sBlobSecretKey"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$

        kubernetesAzureGroup = Form.createGroup(bigComposite, 2, Messages.getString("KubernetesInfoForm.text.temporaryFS"), 110); //$NON-NLS-1$
        kubernetesAzureGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        k8sAzureAccount = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureAccount"), 1); //$NON-NLS-1$
        k8sAzureContainer = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureContainer"), 1); //$NON-NLS-1$
        k8sAzureCredentials = new LabelledCombo(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureCredentials"), "", getK8sAzureCredentials()); //$NON-NLS-1$
        k8sAzureSecretKey = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureSecretKey"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$
        k8sAzureAADKey = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureAADKey"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$
        k8sAzureAADClientID = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureAADClientID"), 1); //$NON-NLS-1$
        k8sAzureAADDirectoryID = new LabelledText(kubernetesAzureGroup, Messages.getString("KubernetesInfoForm.text.k8sAzureAADDirectoryID"), 1); //$NON-NLS-1$
    }

    private void addDataprocField() {
        dataProcGroup = Form.createGroup(bigComposite, 2, Messages.getString("GoogleDataprocInfoForm.text.configuration"), 110); //$NON-NLS-1$
        dataProcGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        projectIdNameText = new LabelledText(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.configuration.projectId"), 1); //$NON-NLS-1$

        clusterIdNameText = new LabelledText(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.configuration.clusterId"), 1); //$NON-NLS-1$

        regionNameText = new LabelledText(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.configuration.region"), 1); //$NON-NLS-1$

        jarsBucketNameText = new LabelledText(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.configuration.jarsBucket"), 1); //$NON-NLS-1$

        credentialsBtn = new Button(dataProcGroup, SWT.CHECK);
        credentialsBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1));
        credentialsBtn.setText(Messages.getString("GoogleDataprocInfoForm.button.authentication.credentials")); //$NON-NLS-1$

        credentialTypeCombo = new LabelledCombo(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.authentication"), "", //$NON-NLS-1$ $NON-NLS-2$
                EDataprocAuthType.getAllDataprocAuthTypes());

        oauthTokenText = new LabelledText(dataProcGroup, Messages.getString("GoogleDataprocInfoForm.text.token"), 1, //$NON-NLS-1$
                SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);
        String[] extensions = { "*.*" }; //$NON-NLS-1$
        pathToCredentials = new LabelledFileField(dataProcGroup,
                Messages.getString("GoogleDataprocInfoForm.text.authentication.credentials"), extensions); //$NON-NLS-1$

    }

    private void addCdeFields() {
        cdeGroup = Form.createGroup(bigComposite, 2, Messages.getString("CdeInfoForm.text.configuration"), 110); //$NON-NLS-1$
        cdeGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        cdeApiEndPoint = new LabelledText(cdeGroup,  Messages.getString("CdeInfoForm.text.cdeApiEndPoint"));  //$NON-NLS-1$
        cdeAutoGenerateToken = new LabelledCheckbox(cdeGroup, Messages.getString("CdeInfoForm.checkbox.cdeAutoGenerateToken")); //$NON-NLS-1$
        cdeToken = new LabelledText(cdeGroup,  Messages.getString("CdeInfoForm.text.cdeToken"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);  //$NON-NLS-1$
        cdeTokenEndpoint = new LabelledText(cdeGroup,  Messages.getString("CdeInfoForm.text.cdeTokenEndpoint"));  //$NON-NLS-1$
        cdeWorkloadUser = new LabelledText(cdeGroup,  Messages.getString("CdeInfoForm.text.cdeWorkloadUser"));  //$NON-NLS-1$
        cdeWorkloadPassword = new LabelledText(cdeGroup,  Messages.getString("CdeInfoForm.text.cdeWorkloadPassword"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);  //$NON-NLS-1$

        fieldByParamKey = new HashMap<String, LabelledWidget>();
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_API_ENDPOINT, cdeApiEndPoint);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN, cdeToken);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_AUTO_GENERATE_TOKEN, cdeAutoGenerateToken);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN_ENDPOINT, cdeTokenEndpoint);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_USER, cdeWorkloadUser);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_PASSWORD, cdeWorkloadPassword);
    }

    private void addStandaloneFields() {
        standaloneGroup = Form.createGroup(bigComposite, 2, Messages.getString("StandaloneInfoForm.text.configuration"), 110); //$NON-NLS-1$
        standaloneGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        standaloneMaster = new LabelledText(standaloneGroup,  Messages.getString("StandaloneInfoForm.text.master"));  //$NON-NLS-1$
        standaloneConfigureExec = new LabelledCheckbox(standaloneGroup, Messages.getString("StandaloneInfoForm.checkbox.configureExecutors")); //$NON-NLS-1$
        standaloneExecCore = new LabelledText(standaloneGroup,  Messages.getString("StandaloneInfoForm.text.executorCores"));  //$NON-NLS-1$
        standaloneExecMemory = new LabelledText(standaloneGroup,  Messages.getString("StandaloneInfoForm.text.executorMemory"));  //$NON-NLS-1$

        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_MASTER, standaloneMaster);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_CONFIGURE_EXEC, standaloneConfigureExec);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_MEMORY, standaloneExecMemory);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_CORE, standaloneExecCore);
    }
    
    private void addSparkSubmitScriptFields() {
    	sparkSubmitScriptGroup = Form.createGroup(bigComposite, 2, Messages.getString("SparkSubmitScriptInfoForm.text.configuration"), 110); //$NON-NLS-1$
    	sparkSubmitScriptGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        sparkSubmitScriptHome = new LabelledText(sparkSubmitScriptGroup,  Messages.getString("SparkSubmitScriptInfoForm.text.master"));  //$NON-NLS-1$

        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_UNIV_SPARK_SUBMIT_SCRIPT_HOME, sparkSubmitScriptHome);
    }
    
    private void addSynapseFields() {
        synapseGroup = Form.createGroup(bigComposite, 2, Messages.getString("SynapseInfoForm.text.synapseSettings"), 110);
        synapseGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        synapseHostname = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.synapse.hostname"));
        synapseSparkPools = new LabelledText(synapseGroup, Messages.getString("SynapseInfoForm.text.synapse.sparkPools"));
        synapseToken = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.synapse.token"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);
        azureHostname = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.hostname"));
        storageAuthType = new LabelledCombo(synapseGroup, Messages.getString("SynapseInfoForm.text.authentication"), "", ESynapseAuthType.getAllSynapseAuthTypes());
        azureContainer = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.container"));
        azureDeployBlob = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.deployBlob"));
        driverMemory = new LabelledText(synapseGroup, Messages.getString("SynapseInfoForm.text.synapse.driverMemory"));
        driverCores = new LabelledText(synapseGroup, Messages.getString("SynapseInfoForm.text.synapse.driverCores"));
        executorMemory = new LabelledText(synapseGroup, Messages.getString("SynapseInfoForm.text.synapse.executorMemory"));
        executorCores = new LabelledText(synapseGroup, Messages.getString("SynapseInfoForm.text.synapse.executorCores"));
        azureUsername = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.username"));
        azurePassword = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.password"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);
        azureDirectoryId = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.directoryId"));
        azureClientId = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.clientId"));
        useSynapseCertificate = new LabelledCheckbox(synapseGroup, Messages.getString("SynapseInfoForm.text.useSynapseCertButton"));
        azureClientKey = new LabelledText(synapseGroup,  Messages.getString("SynapseInfoForm.text.azure.clientKey"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);
        String[] extensions = { "*.*" };
        azureClientCertificate = new LabelledFileField(synapseGroup, Messages.getString("SynapseInfoForm.text.azure.clientCertificate"), extensions);

        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_HOST, synapseHostname);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_SPARK_POOLS, synapseSparkPools);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_TOKEN, synapseToken);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_HOSTNAME, azureHostname);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_CONTAINER, azureContainer);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DEPLOY_BLOB, azureDeployBlob);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_DRIVER_MEMORY, driverMemory);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_DRIVER_CORES, driverCores);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_MEMORY, executorMemory);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_CORES, executorCores);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_USERNAME, azureUsername);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_PASSWORD, azurePassword);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DIRECTORY_ID, azureDirectoryId);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_APPLICATION_ID, azureClientId);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_USE_SYNAPSE_CLIENT_CERTIFICATE, useSynapseCertificate);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_KEY, azureClientKey);
        azureClientCertificate.setText(StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_CERTIFICATE)));

        String authModeValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_MODE));
        ESynapseAuthType authType = ESynapseAuthType.getSynapseAuthTypeByName(authModeValue, false);
        if ((authModeValue != null)  && (authType != null)) {
            storageAuthType.setText(authType.getDisplayName());
        } else {
            storageAuthType.select(0);
        }

        updateSynapseFieldsVisibility();
    }

    private void addHDIFields() {
        //HDI group
        hdiGroup = Form.createGroup(bigComposite, 2, Messages.getString("HadoopClusterForm.hdiSettings"), 110);
        hdiGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        hdiUsername = new LabelledText(hdiGroup,  Messages.getString("HadoopClusterForm.text.hdi.username"));
        hdiPassword = new LabelledText(hdiGroup,  Messages.getString("HadoopClusterForm.text.hdi.password"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);

        //Livy group
        livyGroup = Form.createGroup(bigComposite, 2, Messages.getString("HadoopClusterForm.LivySettings"), 110);
        livyGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        livyHostname = new LabelledText(livyGroup,  Messages.getString("HadoopClusterForm.text.Livy.hostname"));
        livyPort = new LabelledText(livyGroup,  Messages.getString("HadoopClusterForm.text.Livy.port"));
        livyUsername = new LabelledText(livyGroup,  Messages.getString("HadoopClusterForm.text.Livy.username"));

        //FS group
        fsGroup = Form.createGroup(bigComposite, 4, Messages.getString("HadoopClusterForm.azureSettings"), 110);
        fsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fsHostname = new LabelledText(fsGroup, Messages.getString("HadoopClusterForm.text.azure.hostname"), 1);
        fsContainer = new LabelledText(fsGroup, Messages.getString("HadoopClusterForm.text.azure.container"), 1);
        hdiStorageType = new LabelledCombo(fsGroup, Messages.getString("HadoopClusterForm.text.azure.storage"), "", EHdinsightStorage.getAllHdinsightStorageDisplayNames());
        fsDeployBlob = new LabelledText(fsGroup, Messages.getString("HadoopClusterForm.text.azure.deployBlob"), 1);
        fsUsername = new LabelledText(fsGroup, Messages.getString("HadoopClusterForm.text.azure.username"), 1);
        fsPassword = new LabelledText(fsGroup, Messages.getString("HadoopClusterForm.text.azure.password"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE);

        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_HDI_USERNAME, hdiUsername);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_HDI_PASSWORD, hdiPassword);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_HOSTNAME, livyHostname);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_PORT, livyPort);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_USERNAME, livyUsername);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_AZURE_HOSTNAME, fsHostname);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_AZURE_CONTAINER, fsContainer);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_AZURE_USERNAME, fsUsername);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_AZURE_PASSWORD, fsPassword);
        fieldByParamKey.put(ConnParameterKeys.CONN_PARA_KEY_AZURE_DEPLOY_BLOB, fsDeployBlob);

        String storageValue = StringUtils.trimToEmpty(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_AZURE_HDINSIGHT_STORAGE));
        EHdinsightStorage storageType = EHdinsightStorage.getHdinsightStorageByName(storageValue, false);
        if ((storageValue != null)  && (storageType != null)) {
            hdiStorageType.setText(storageType.getDisplayName());
        } else {
            hdiStorageType.select(0);
        }

        updateHDIFieldsVisibility();
    }



    private List<String> getRunSubmitModes() {
        List<String> runSubmitLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EDatabricksSubmitMode> runSubmitModes = sparkDistribution.getRunSubmitMode();
            if (runSubmitModes != null) {
                runSubmitLabelNames = runSubmitModes.stream().map(mode -> {
                    return mode.getRunModeLabel();
                }).collect(Collectors.toList());
            }
        }
        return runSubmitLabelNames;
    }

    private List<String> getProviders() {
        List<String> providerLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EDatabricksCloudProvider> supportCloudProviders = sparkDistribution.getSupportCloudProviders();
            if (supportCloudProviders != null) {
                providerLabelNames = supportCloudProviders.stream().map(provider -> {
                    return provider.getProviderLableName();
                }).collect(Collectors.toList());
            }
        }
        return providerLabelNames;
    }

    private List<String> getClusterTypes() {
        List<String> providerLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EDatabricksClusterType > supportedClusterTypes = sparkDistribution.getClusterTypes();
            if (supportedClusterTypes != null) {
                providerLabelNames = supportedClusterTypes.stream().map(provider -> {
                    return provider.getLabelName();
                }).collect(Collectors.toList());
            }
        }
        return providerLabelNames;
    }

    private List<String> getK8sCloudProviders() {
        List<String> bucketCloudLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EKubernetesBucketCloudProvider> runSubmitModes = sparkDistribution.getK8sCloudProviders();
            if (runSubmitModes != null) {
                bucketCloudLabelNames = runSubmitModes.stream().map(mode -> {
                    return mode.getLabel();
                }).collect(Collectors.toList());
            }
        }
        return bucketCloudLabelNames;
    }

    private List<String> getK8sSubmitModes() {
        List<String> providerLableNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EKubernetesSubmitMode> supportCloudProviders = sparkDistribution.getK8sRunSubmitModes();
            if (supportCloudProviders != null) {
                providerLableNames = supportCloudProviders.stream().map(provider -> {
                    return provider.getLabel();
                }).collect(Collectors.toList());
            }
        }
        return providerLableNames;
    }

    private List<String> getK8sS3Credentials() {
        List<String> bucketCloudLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EKubernetesS3Credentials> runSubmitModes = sparkDistribution.getK8sS3Credentials();
            if (runSubmitModes != null) {
                bucketCloudLabelNames = runSubmitModes.stream().map(mode -> {
                    return mode.getLabel();
                }).collect(Collectors.toList());
            }
        }
        return bucketCloudLabelNames;
    }

    private List<String> getK8sAzureCredentials() {
        List<String> bucketCloudLabelNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<EKubernetesAzureCredentials> runSubmitModes = sparkDistribution.getK8sAzureCredentials();
            if (runSubmitModes != null) {
                bucketCloudLabelNames = runSubmitModes.stream().map(mode -> {
                    return mode.getLabel();
                }).collect(Collectors.toList());
            }
        }
        return bucketCloudLabelNames;
    }

    private void addCustomFields() {
        customGroup = Form.createGroup(this, 4, Messages.getString("HadoopClusterForm.customSettings")); //$NON-NLS-1$
        customGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        authenticationCombo = new LabelledCombo(customGroup,
                Messages.getString("HadoopClusterForm.authentication"), //$NON-NLS-1$
                Messages.getString("HadoopClusterForm.authentication.tooltip"), EAuthenticationMode.getAllAuthenticationDisplayNames() //$NON-NLS-1$
                .toArray(new String[0]), 1, false);
    }

    private void addConnectionFields(Composite scrolledComposite) {
        connectionGroup = Form.createGroup(scrolledComposite, 1, Messages.getString("HadoopClusterForm.connectionSettings"), //$NON-NLS-1$
                110);
        connectionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite uriPartComposite = new Composite(connectionGroup, SWT.NULL);
        GridLayout uriPartLayout = new GridLayout(2, false);
        uriPartLayout.marginWidth = 0;
        uriPartLayout.marginHeight = 0;
        uriPartComposite.setLayout(uriPartLayout);
        uriPartComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        useKnoxButton = new Button(uriPartComposite, SWT.CHECK);
        useKnoxButton.setText(Messages.getString("KnoxInfoForm.useKnox")); //$NON-NLS-1$
        useKnoxButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));

        namenodeUriText = new LabelledText(uriPartComposite, Messages.getString("HadoopClusterForm.text.namenodeURI"), 1); //$NON-NLS-1$
        jobtrackerUriText = new LabelledText(uriPartComposite, Messages.getString("HadoopClusterForm.text.jobtrackerURI"), 1); //$NON-NLS-1$
        rmSchedulerText = new LabelledText(uriPartComposite, Messages.getString("HadoopClusterForm.text.rmScheduler"), 1); //$NON-NLS-1$
        jobHistoryText = new LabelledText(uriPartComposite, Messages.getString("HadoopClusterForm.text.jobHistory"), 1); //$NON-NLS-1$
        stagingDirectoryText = new LabelledText(uriPartComposite,
                Messages.getString("HadoopClusterForm.text.stagingDirectory"), 1); //$NON-NLS-1$
        useDNHostBtn = new Button(uriPartComposite, SWT.CHECK);
        useDNHostBtn.setText(Messages.getString("HadoopClusterForm.button.useDNHost")); //$NON-NLS-1$
        useDNHostBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1));
    }

    private void addWebHDFSEncryptionFields(Composite downsash) {
        webHDFSSSLEncryptionGrp = Form.createGroup(downsash, 1, Messages.getString("HadoopClusterForm.webHDFS.encryption"), 110); //$NON-NLS-1$
        webHDFSSSLEncryptionGrp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        useWebHDFSSSLEncryptionBtn = new Button(webHDFSSSLEncryptionGrp, SWT.CHECK);
        useWebHDFSSSLEncryptionBtn.setText(Messages.getString("HadoopClusterForm.webHDFS.encryption.useSSLEncryption")); //$NON-NLS-1$
        useWebHDFSSSLEncryptionBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1));

        webHDFSSSLEncryptionDetailComposite = new Composite(webHDFSSSLEncryptionGrp, SWT.NULL);
        GridLayout webHDFSSSLEncryptionDetailCompLayout = new GridLayout(5, false);
        webHDFSSSLEncryptionDetailCompLayout.marginWidth = 0;
        webHDFSSSLEncryptionDetailCompLayout.marginHeight = 0;
        webHDFSSSLEncryptionDetailComposite.setLayout(webHDFSSSLEncryptionDetailCompLayout);
        webHDFSSSLEncryptionDetailComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        String[] extensions = { "*.*" }; //$NON-NLS-1$
        webHDFSSSLTrustStorePath = new LabelledFileField(webHDFSSSLEncryptionDetailComposite,
                Messages.getString("HadoopClusterForm.webHDFS.encryption.useSSLEncryption.trustStorePath"), extensions); //$NON-NLS-1$
        webHDFSSSLTrustStorePassword = new LabelledText(webHDFSSSLEncryptionDetailComposite,
                Messages.getString("HadoopClusterForm.webHDFS.encryption.useSSLEncryption.trustStorePassword"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$
        webHDFSSSLTrustStorePassword.getTextControl().setEchoChar('*');
    }

    private void addAuthenticationFields(Composite downsash) {
        authGroup = Form.createGroup(downsash, 1, Messages.getString("HadoopClusterForm.authenticationSettings"), 110); //$NON-NLS-1$
        authGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        authPartComposite = new Composite(authGroup, SWT.NULL);
        GridLayout authPartLayout = new GridLayout(1, false);
        authPartLayout.marginWidth = 0;
        authPartLayout.marginHeight = 0;
        authPartComposite.setLayout(authPartLayout);
        authPartComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        authCommonComposite = new Composite(authPartComposite, SWT.NULL);
        GridLayout authCommonCompLayout = new GridLayout(1, false);
        authCommonCompLayout.marginWidth = 0;
        authCommonCompLayout.marginHeight = 0;
        authCommonComposite.setLayout(authCommonCompLayout);
        authCommonComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        kerberosBtn = new Button(authCommonComposite, SWT.CHECK);
        kerberosBtn.setText(Messages.getString("HadoopClusterForm.button.kerberos")); //$NON-NLS-1$
        kerberosBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 4, 1));

        authNodejtOrRmHistoryComposite = new Composite(authCommonComposite, SWT.NULL);
        GridLayout authNodejtOrRmHistoryCompLayout = new GridLayout(4, false);
        authNodejtOrRmHistoryCompLayout.marginWidth = 0;
        authNodejtOrRmHistoryCompLayout.marginHeight = 0;
        authNodejtOrRmHistoryComposite.setLayout(authNodejtOrRmHistoryCompLayout);
        authNodejtOrRmHistoryComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        namenodePrincipalText = new LabelledText(authNodejtOrRmHistoryComposite,
                Messages.getString("HadoopClusterForm.text.namenodePrincipal"), 1); //$NON-NLS-1$
        jtOrRmPrincipalText = new LabelledText(authNodejtOrRmHistoryComposite,
                Messages.getString("HadoopClusterForm.text.rmPrincipal"), 1); //$NON-NLS-1$
        jobHistoryPrincipalText = new LabelledText(authNodejtOrRmHistoryComposite,
                Messages.getString("HadoopClusterForm.text.jobHistoryPrincipal"), 1); //$NON-NLS-1$

        // placeHolder is only used to make userNameText and groupText to new line
        Composite placeHolder = new Composite(authCommonComposite, SWT.NULL);
        GridLayout placeHolderLayout = new GridLayout(4, false);
        placeHolderLayout.marginWidth = 0;
        placeHolderLayout.marginHeight = 0;
        placeHolder.setLayout(placeHolderLayout);
        placeHolder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        userNameText = new LabelledText(placeHolder, Messages.getString("HadoopClusterForm.text.userName"), 1); //$NON-NLS-1$
        groupText = new LabelledText(placeHolder, Messages.getString("HadoopClusterForm.text.group"), 1); //$NON-NLS-1$

        authKeytabComposite = new Composite(authPartComposite, SWT.NULL);
        GridLayout authKeytabCompLayout = new GridLayout(5, false);
        authKeytabCompLayout.marginWidth = 0;
        authKeytabCompLayout.marginHeight = 0;
        authKeytabComposite.setLayout(authKeytabCompLayout);
        authKeytabComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        keytabBtn = new Button(authKeytabComposite, SWT.CHECK);
        keytabBtn.setText(Messages.getString("HadoopClusterForm.button.keytab")); //$NON-NLS-1$
        keytabBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 5, 1));
        keytabPrincipalText = new LabelledText(authKeytabComposite,
                Messages.getString("HadoopClusterForm.text.keytabPrincipal"), 1); //$NON-NLS-1$
        String[] extensions = { "*.*" }; //$NON-NLS-1$
        keytabText = new LabelledFileField(authKeytabComposite, Messages.getString("HadoopClusterForm.text.keytab"), extensions); //$NON-NLS-1$

        // Mapr Ticket Authentication
        authMaprTComposite = new Composite(authPartComposite, SWT.NULL);
        GridLayout authMaprTicketCompLayout = new GridLayout(1, false);
        authMaprTicketCompLayout.marginWidth = 0;
        authMaprTicketCompLayout.marginHeight = 0;
        authMaprTComposite.setLayout(authMaprTicketCompLayout);
        authMaprTComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        maprTBtn = new Button(authMaprTComposite, SWT.CHECK);
        maprTBtn.setText(Messages.getString("HadoopClusterForm.button.maprTicket")); //$NON-NLS-1$
        maprTBtn.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));

        maprTPCDCompposite = new Composite(authMaprTComposite, SWT.NULL);
        GridLayout maprTPCDCompositeLayout = new GridLayout(1, false);
        maprTPCDCompositeLayout.marginWidth = 0;
        maprTPCDCompositeLayout.marginHeight = 0;
        maprTPCDCompposite.setLayout(maprTPCDCompositeLayout);
        maprTPCDCompposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        maprTPasswordCompposite = new Composite(maprTPCDCompposite, SWT.NULL);
        GridLayout maprTPasswordComppositeLayout = new GridLayout(2, false);
        maprTPasswordComppositeLayout.marginWidth = 0;
        maprTPasswordComppositeLayout.marginHeight = 0;
        maprTPasswordCompposite.setLayout(maprTPasswordComppositeLayout);
        maprTPasswordCompposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        maprTPasswordText = new LabelledText(maprTPasswordCompposite,
                Messages.getString("HadoopClusterForm.text.maprTPassword"), 1, SWT.PASSWORD | SWT.BORDER | SWT.SINGLE); //$NON-NLS-1$
        maprTPasswordText.getTextControl().setEchoChar('*');

        Composite maprTCDCompposite = new Composite(maprTPCDCompposite, SWT.NULL);
        GridLayout maprTCDComppositeLayout = new GridLayout(2, false);
        maprTCDComppositeLayout.marginWidth = 0;
        maprTCDComppositeLayout.marginHeight = 0;
        maprTCDCompposite.setLayout(maprTCDComppositeLayout);
        maprTCDCompposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        maprTClusterText = new LabelledText(maprTCDCompposite, Messages.getString("HadoopClusterForm.text.maprTCluster"), 1); //$NON-NLS-1$
        maprTDurationText = new LabelledText(maprTCDCompposite, Messages.getString("HadoopClusterForm.text.maprTDuration"), 1); //$NON-NLS-1$

        maprTSetComposite = new Composite(authMaprTComposite, SWT.NULL);
        GridLayout maprTicketSetCompLayout = new GridLayout(3, false);
        maprTicketSetCompLayout.marginWidth = 0;
        maprTicketSetCompLayout.marginHeight = 0;
        maprTSetComposite.setLayout(maprTicketSetCompLayout);
        maprTSetComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        setMaprTHomeDirBtn = new Button(maprTSetComposite, SWT.CHECK);
        setMaprTHomeDirBtn.setText(Messages.getString("HadoopClusterForm.button.setMaprTHomeDir")); //$NON-NLS-1$
        maprTHomeDirText = new LabelledText(maprTSetComposite, "", 1); //$NON-NLS-1$

        setHadoopLoginBtn = new Button(maprTSetComposite, SWT.CHECK);
        setHadoopLoginBtn.setText(Messages.getString("HadoopClusterForm.button.setHadoopLogin")); //$NON-NLS-1$
        maprTHadoopLoginText = new LabelledText(maprTSetComposite, "", 1); //$NON-NLS-1$

        preloadAuthentificationBtn = new Button(maprTSetComposite, SWT.CHECK);
        preloadAuthentificationBtn.setText(Messages.getString("HadoopClusterForm.button.preloadAuthentification.label")); //$NON-NLS-1$
    }

    private void addHadoopPropertiesFields() {
        hadoopPropertiesComposite = new Composite(propertiesComposite, SWT.NONE);
        GridLayout hadoopPropertiesLayout = new GridLayout(1, false);
        hadoopPropertiesLayout.marginWidth = 0;
        hadoopPropertiesLayout.marginHeight = 0;
        hadoopPropertiesComposite.setLayout(hadoopPropertiesLayout);
        hadoopPropertiesComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        propertiesDialog = new HadoopPropertiesDialog(getShell(), getHadoopProperties()) {

            @Override
            protected boolean isReadOnly() {
                return !isEditable();
            }

            @Override
            protected List<Map<String, Object>> getLatestInitProperties() {
                return getHadoopProperties();
            }

            @Override
            public void applyProperties(List<Map<String, Object>> properties) {
                getConnection().setHadoopProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(properties));
            }

        };
        propertiesDialog.createPropertiesFields(hadoopPropertiesComposite);
    }

    private List<Map<String, Object>> getHadoopProperties() {
        String hadoopProperties = getConnection().getHadoopProperties();
        List<Map<String, Object>> hadoopPropertiesList = HadoopRepositoryUtil.getHadoopPropertiesList(hadoopProperties);
        return hadoopPropertiesList;
    }

    protected void addSparkPropertiesFields() {
        sparkPropertiesComposite = new Composite(propertiesComposite, SWT.NONE);
        GridLayout sparkPropertiesLayout = new GridLayout(3, false);
        sparkPropertiesLayout.marginWidth = 5;
        sparkPropertiesLayout.marginHeight = 5;
        sparkPropertiesComposite.setLayout(sparkPropertiesLayout);
        sparkPropertiesComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        useSparkPropertiesBtn = new Button(sparkPropertiesComposite, SWT.CHECK);
        useSparkPropertiesBtn.setText(Messages.getString("HadoopClusterForm.button.useSparkProperties")); //$NON-NLS-1$
        useSparkPropertiesBtn.setLayoutData(new GridData());

        sparkPropertiesDialog = new SparkPropertiesDialog(getShell(), getSparkProperties()) {

            @Override
            protected boolean isReadOnly() {
                return !(useSparkPropertiesBtn.getSelection() && isEditable());
            }

            @Override
            protected List<Map<String, Object>> getLatestInitProperties() {
                return getSparkProperties();
            }

            @Override
            public void applyProperties(List<Map<String, Object>> properties) {
                getConnection().setSparkProperties(HadoopRepositoryUtil.getHadoopPropertiesJsonStr(properties));
            }

        };
        sparkPropertiesDialog.createPropertiesFields(sparkPropertiesComposite);
    }

    private List<Map<String, Object>> getSparkProperties() {
        String sparkProperties = getConnection().getSparkProperties();
        List<Map<String, Object>> sparkPropertiesList = HadoopRepositoryUtil.getHadoopPropertiesList(sparkProperties);
        return sparkPropertiesList;
    }

    private void addNavigatorFields() {
        DistributionBean distriBean = getDistribution();
        MRComponent currentDistribution;
        boolean isShow = false;
        try {
            currentDistribution = (MRComponent) DistributionFactory.buildDistribution(distriBean.getName(),
                    hadoopVersison.getVersion());
            isShow = !getDistribution().useCustom() && currentDistribution.doSupportClouderaNavigator();
        } catch (Exception e) {
            ExceptionHandler.process(e);
        }
        if (!isShow) {
            return;
        }

        Composite clouderaNaviComposite = new Composite(propertiesComposite, SWT.NONE);
        GridLayout hadoopConfsCompLayout = new GridLayout(3, false);
        hadoopConfsCompLayout.marginWidth = 5;
        hadoopConfsCompLayout.marginHeight = 5;
        clouderaNaviComposite.setLayout(hadoopConfsCompLayout);
        clouderaNaviComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        useClouderaNaviBtn = new Button(clouderaNaviComposite, SWT.CHECK);
        useClouderaNaviBtn.setText(Messages.getString("HadoopClusterForm.button.use_cloudera_navigator")); //$NON-NLS-1$
        useClouderaNaviBtn.setLayoutData(new GridData());

        clouderaNaviButton = new Button(clouderaNaviComposite, SWT.NONE);
        clouderaNaviButton.setImage(ImageProvider.getImage(EImage.THREE_DOTS_ICON));
        clouderaNaviButton.setLayoutData(new GridData(30, 25));
        clouderaNaviButton.setEnabled(false);

        Label displayLabel = new Label(clouderaNaviComposite, SWT.NONE);
        displayLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

    }

    private void addHadoopConfsFields() {
        Composite hadoopConfsComposite = new Composite(propertiesComposite, SWT.NONE);
        GridLayout hadoopConfsCompLayout = new GridLayout(1, false);
        hadoopConfsCompLayout.marginWidth = 5;
        hadoopConfsCompLayout.marginHeight = 5;
        hadoopConfsComposite.setLayout(hadoopConfsCompLayout);
        GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = 2;
        hadoopConfsComposite.setLayoutData(gridData);

        useCustomConfBtn = new Button(hadoopConfsComposite, SWT.CHECK);
        useCustomConfBtn.setText(Messages.getString("HadoopClusterForm.button.useCustomConf.label")); //$NON-NLS-1$
        useCustomConfBtn.setLayoutData(new GridData());

        hadoopConfsGroup = new Group(hadoopConfsComposite, SWT.NONE);
        hadoopConfsGroup.setText(Messages.getString("HadoopClusterForm.group.customConf")); //$NON-NLS-1$
        FormLayout hadoopConfsGroupLayout = new FormLayout();
        hadoopConfsGroupLayout.marginHeight = 5;
        hadoopConfsGroupLayout.marginWidth = 5;
        hadoopConfsGroup.setLayout(hadoopConfsGroupLayout);
        GridData fieldsGridData = new GridData(GridData.FILL_HORIZONTAL);
        fieldsGridData.horizontalSpan = 2;
        hadoopConfsGroup.setLayoutData(fieldsGridData);

        hadoopConfsButton = new Button(hadoopConfsGroup, SWT.NONE);
        hadoopConfsButton.setText(Messages.getString("HadoopClusterForm.button.config")); //$NON-NLS-1$
        hadoopConfsButton.setEnabled(false);
        FormData formData = new FormData();
        formData.left = new FormAttachment(0);
        formData.top = new FormAttachment(0);
        hadoopConfsButton.setLayoutData(formData);

        setHadoopConfBtn = new Button(hadoopConfsGroup, SWT.CHECK);
        setHadoopConfBtn.setText(Messages.getString("HadoopClusterForm.button.overrideCustomConf")); //$NON-NLS-1$
        formData = new FormData();
        formData.left = new FormAttachment(hadoopConfsButton, 0, SWT.LEFT);
        formData.top = new FormAttachment(hadoopConfsButton, 5, SWT.BOTTOM);
        setHadoopConfBtn.setLayoutData(formData);

        browseHadoopConfBtn = new Button(hadoopConfsGroup, SWT.NONE);
        browseHadoopConfBtn.setText("...");
        browseHadoopConfBtn.setToolTipText(Messages.getString("HadoopClusterForm.button.overrideCustomConfPath.browse")); //$NON-NLS-1$
        formData = new FormData();
        formData.top = new FormAttachment(setHadoopConfBtn, 0, SWT.CENTER);
        formData.right = new FormAttachment(100);
        browseHadoopConfBtn.setLayoutData(formData);

        hadoopConfSpecificJarText = new Text(hadoopConfsGroup, SWT.BORDER);
        formData = new FormData();
        formData.left = new FormAttachment(setHadoopConfBtn, 5, SWT.RIGHT);
        formData.top = new FormAttachment(setHadoopConfBtn, 0, SWT.CENTER);
        formData.right = new FormAttachment(browseHadoopConfBtn, -5, SWT.LEFT);
        hadoopConfSpecificJarText.setLayoutData(formData);
    }

    private void addCheckFields() {
        Composite checkGroup = new Composite(this, SWT.NONE);
        GridLayout checkGridLayout = new GridLayout(1, false);
        checkGroup.setLayout(checkGridLayout);
        GridData checkGridData = new GridData(GridData.FILL_HORIZONTAL);
        checkGridData.minimumHeight = 5;
        checkGroup.setLayoutData(checkGridData);
        Composite checkButtonComposite = Form.startNewGridLayout(checkGroup, 1, false, SWT.CENTER, SWT.BOTTOM);
        GridLayout checkButtonLayout = (GridLayout) checkButtonComposite.getLayout();
        checkButtonLayout.marginHeight = 0;
        checkButtonLayout.marginWidth = 0;
        checkServicesBtn = new UtilsButton(checkButtonComposite, Messages.getString("HadoopClusterForm.button.check"), true); //$NON-NLS-1$
        checkServicesBtn.setEnabled(false);
    }

    @Override
    protected void addFieldsListeners() {
        authenticationCombo.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                String newAuthDisplayName = authenticationCombo.getText();
                EAuthenticationMode newAuthMode = EAuthenticationMode.getAuthenticationByDisplayName(newAuthDisplayName);
                String originalAuthName = getConnection().getAuthMode();
                EAuthenticationMode originalAuthMode = EAuthenticationMode.getAuthenticationByName(originalAuthName, false);
                if (newAuthMode != null && newAuthMode != originalAuthMode) {
                    if (EAuthenticationMode.UGI.equals(newAuthMode)) {
                        maprTBtn.setEnabled(true);
                        hideControl(maprTBtn, false);
                        if (maprTBtn.getSelection()) {
                            hideControl(maprTPCDCompposite, false);
                            hideControl(maprTSetComposite, false);
                        }
                        authMaprTComposite.layout();
                        authMaprTComposite.getParent().layout();
                    }
                    getConnection().setAuthMode(newAuthMode.getName());
                    updateForm();
                    checkFieldsValue();
                }
            }
        });

        namenodeUriText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setNameNodeURI(namenodeUriText.getText());
                checkFieldsValue();
            }
        });

        jobtrackerUriText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setJobTrackerURI(jobtrackerUriText.getText());
                checkFieldsValue();
            }
        });

        rmSchedulerText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setRmScheduler(rmSchedulerText.getText());
                checkFieldsValue();
            }
        });

        jobHistoryText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setJobHistory(jobHistoryText.getText());
                checkFieldsValue();
            }
        });

        stagingDirectoryText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setStagingDirectory(stagingDirectoryText.getText());
                checkFieldsValue();
            }
        });

        useDNHostBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setUseDNHost(useDNHostBtn.getSelection());
                checkFieldsValue();
            }
        });

        useSparkPropertiesBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                sparkPropertiesDialog.propertyButton.setEnabled(useSparkPropertiesBtn.getSelection());
                getConnection().setUseSparkProperties(useSparkPropertiesBtn.getSelection());
                checkFieldsValue();
            }
        });

        useCustomConfBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                onUseCustomConfBtnSelected(e);
            }

        });

        hadoopConfsButton.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                AbstractHadoopForm form = null;
                if (parentForm instanceof AbstractHadoopForm) {
                    form = (AbstractHadoopForm) parentForm;
                }
                new HadoopContextConfConfigDialog(getShell(), form, (HadoopClusterConnectionItem) connectionItem).open();
            }
        });
        if (useClouderaNaviBtn != null) {
            useClouderaNaviBtn.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    clouderaNaviButton.setEnabled(useClouderaNaviBtn.getSelection());
                    getConnection().setUseClouderaNavi(useClouderaNaviBtn.getSelection());
                    checkFieldsValue();
                }
            });
            clouderaNaviButton.addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    AbstractHadoopForm form = null;
                    if (parentForm instanceof AbstractHadoopForm) {
                        form = (AbstractHadoopForm) parentForm;
                    }
                    HadoopConfsUtils.openClouderaNaviWizard(form, (HadoopClusterConnectionItem) connectionItem, creation);
                }
            });
        }

        rmSchedulerText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setRmScheduler(rmSchedulerText.getText());
                checkFieldsValue();
            }
        });

        jobHistoryText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setJobHistory(jobHistoryText.getText());
                checkFieldsValue();
            }
        });

        stagingDirectoryText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setStagingDirectory(stagingDirectoryText.getText());
                checkFieldsValue();
            }
        });

        useDNHostBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setUseDNHost(useDNHostBtn.getSelection());
                checkFieldsValue();
            }
        });

        namenodePrincipalText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setPrincipal(namenodePrincipalText.getText());
                checkFieldsValue();
            }
        });

        jtOrRmPrincipalText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setJtOrRmPrincipal(jtOrRmPrincipalText.getText());
                checkFieldsValue();
            }
        });

        jobHistoryPrincipalText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                getConnection().setJobHistoryPrincipal(jobHistoryPrincipalText.getText());
                checkFieldsValue();
            }
        });

        userNameText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setUserName(userNameText.getText());
                checkFieldsValue();
            }
        });

        groupText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setGroup(groupText.getText());
                checkFieldsValue();
            }
        });

        kerberosBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                hideControl(authNodejtOrRmHistoryComposite, !kerberosBtn.getSelection());
                hideControl(authKeytabComposite, !kerberosBtn.getSelection());
                hideControl(maprTPasswordCompposite, kerberosBtn.getSelection() && maprTBtn.getSelection());
                getConnection().setEnableKerberos(kerberosBtn.getSelection());
                updateForm();
                authGroup.layout();
                authGroup.getParent().layout();
                checkFieldsValue();
            }
        });

        keytabBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setUseKeytab(keytabBtn.getSelection());
                updateForm();
                checkFieldsValue();
            }
        });

        keytabPrincipalText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setKeytabPrincipal(keytabPrincipalText.getText());
                checkFieldsValue();
            }
        });

        keytabText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setKeytab(keytabText.getText());
                checkFieldsValue();
            }
        });

        maprTBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                hideControl(maprTPCDCompposite, !maprTBtn.getSelection());
                hideControl(maprTSetComposite, !maprTBtn.getSelection());
                hideControl(maprTPasswordCompposite, kerberosBtn.getSelection() && maprTBtn.getSelection());
                getConnection().setEnableMaprT(maprTBtn.getSelection());
                updateForm();
                authGroup.layout();
                authGroup.getParent().layout();
                checkFieldsValue();
            }
        });
        maprTPasswordText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setMaprTPassword(maprTPasswordText.getText());
                checkFieldsValue();
            }
        });
        maprTClusterText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setMaprTCluster(maprTClusterText.getText());
                checkFieldsValue();
            }
        });
        maprTDurationText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setMaprTDuration(maprTDurationText.getText());
                checkFieldsValue();
            }
        });
        setMaprTHomeDirBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setSetMaprTHomeDir(setMaprTHomeDirBtn.getSelection());
                maprTHomeDirText.setText(getConnection().getMaprTHomeDir());
                updateForm();
                checkFieldsValue();
            }
        });
        maprTHomeDirText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setMaprTHomeDir(maprTHomeDirText.getText());
                checkFieldsValue();
            }
        });
        setHadoopLoginBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setSetHadoopLogin(setHadoopLoginBtn.getSelection());
                maprTHadoopLoginText.setText(getConnection().getMaprTHadoopLogin());
                updateForm();
                checkFieldsValue();
            }
        });
        maprTHadoopLoginText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().setMaprTHadoopLogin(maprTHadoopLoginText.getText());
                checkFieldsValue();
            }
        });
        preloadAuthentificationBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().setPreloadAuthentification(preloadAuthentificationBtn.getSelection());
                updateForm();
                checkFieldsValue();
            }
        });
        setHadoopConfBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                onOverrideHadoopConfBtnSelected(e);
            }
        });
        hadoopConfSpecificJarText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                onHadoopConfPathTextModified(e);
            }
        });
        browseHadoopConfBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                onBrowseHadoopConfBtnSelected(e);
            }
        });
        useWebHDFSSSLEncryptionBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                hideControl(webHDFSSSLEncryptionDetailComposite, !useWebHDFSSSLEncryptionBtn.getSelection());
                getConnection().setUseWebHDFSSSL(useWebHDFSSSLEncryptionBtn.getSelection());
                updateForm();
                checkFieldsValue();
            }

        });
        webHDFSSSLTrustStorePath.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                getConnection().setWebHDFSSSLTrustStorePath(webHDFSSSLTrustStorePath.getText());
                checkFieldsValue();
            }
        });
        webHDFSSSLTrustStorePassword.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                getConnection().setWebHDFSSSLTrustStorePassword(webHDFSSSLTrustStorePassword.getText());
                checkFieldsValue();
            }
        });
        useKnoxButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {

                String selection = String.valueOf(useKnoxButton.getSelection());
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_USE_KNOX, selection);
                reloadForm();
            }
        });
        if (sparkModeCombo != null) {
            sparkModeCombo.getCombo().addSelectionListener(new SelectionAdapter() {

                @Override
                public void widgetSelected(SelectionEvent e) {
                    hideFieldsOnSparkMode();
                    checkFieldsValue();
                }
            });
        }
        cloudProviderCombo.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String providerLableName = cloudProviderCombo.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER,
                        getDatabricksCloudProviderByName(providerLableName).getProviderValue());
                nodeType.getCombo().removeAll();
                driverNodeType.getCombo().removeAll();
                EDatabricksNodesType.getNodeTypeByProvider(getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLOUD_PROVIDER))
                        .forEach(nodeTypes -> {
                            nodeType.getCombo().add(nodeTypes);
                            driverNodeType.getCombo().add(nodeTypes);
                        });

                checkFieldsValue();
            }
        });
        clusterRuntimeVersion.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUNTIME_VERSION, clusterRuntimeVersion.getText());
                checkFieldsValue();
            }
        });
        clusterType.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_TYPE, getDatabricksClusterTypeValueByLabel(clusterType.getText()));
                updateDatabricksFields();
                checkFieldsValue();
            }
        });
        nodeType.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_NODE_TYPE, nodeType.getText());
                checkFieldsValue();
            }
        });
        driverNodeType.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DRIVER_NODE_TYPE, driverNodeType.getText());
                checkFieldsValue();
            }
        });
        runSubmitCombo.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String runModeLableName = runSubmitCombo.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_RUN_MODE,
                        getDatabricksRunModeByName(runModeLableName).getRunModeValue());
                checkFieldsValue();
            }
        });
        endpointText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_ENDPOINT, endpointText.getText());
                checkFieldsValue();
            }
        });

        clusterIDText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_CLUSTER_ID,
                        clusterIDText.getText());
                checkFieldsValue();
            }
        });

        tokenText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_TOKEN, EncryptionUtil.getValue(tokenText.getText(), true));
                checkFieldsValue();
            }
        });

        dbfsDepFolderText.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_DATABRICKS_DBFS_DEP_FOLDER,
                        dbfsDepFolderText.getText());
                checkFieldsValue();
            }
        });

        projectIdNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_PROJECT_ID,
                        projectIdNameText.getText());
                checkFieldsValue();
            }
        });

        clusterIdNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_CLUSTER_ID,
                        clusterIdNameText.getText());
                checkFieldsValue();
            }
        });

        regionNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_REGION,
                        regionNameText.getText());
                checkFieldsValue();
            }
        });

        jarsBucketNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_JARS_BUCKET,
                        jarsBucketNameText.getText());
                checkFieldsValue();
            }
        });

        projectIdNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_PROJECT_ID,
                        projectIdNameText.getText());
                checkFieldsValue();
            }
        });

        clusterIdNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_CLUSTER_ID,
                        clusterIdNameText.getText());
                checkFieldsValue();
            }
        });

        regionNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_REGION,
                        regionNameText.getText());
                checkFieldsValue();
            }
        });

        jarsBucketNameText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_GOOGLE_JARS_BUCKET,
                        jarsBucketNameText.getText());
                checkFieldsValue();
            }
        });

        credentialsBtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String selection = String.valueOf(credentialsBtn.getSelection());
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_PROVIDE_GOOGLE_CREDENTIALS, selection);

                credentialTypeCombo.setVisible(credentialsBtn.getSelection());
                String credentialName = credentialTypeCombo.getText();
                pathToCredentials.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.SERVICE_ACCOUNT.getDisplayName().equals(credentialName));
                oauthTokenText.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.OAUTH_API.getDisplayName().equals(credentialName));
                checkFieldsValue();
            }
        });

        credentialTypeCombo.getCombo().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String credentialName = credentialTypeCombo.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AUTH_MODE,
                        EDataprocAuthType.getDataprocAuthTypeByDisplayName(credentialName).getName());
                credentialTypeCombo.setVisible(credentialsBtn.getSelection());
                pathToCredentials.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.SERVICE_ACCOUNT.getDisplayName().equals(credentialName));
                oauthTokenText.setVisible(credentialsBtn.getSelection() && EDataprocAuthType.OAUTH_API.getDisplayName().equals(credentialName));
                checkFieldsValue();
            }
        });

        pathToCredentials.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                String credentialName = credentialTypeCombo.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_PATH_TO_GOOGLE_CREDENTIALS,
                        pathToCredentials.getText());
                checkFieldsValue();
            }
        });

        oauthTokenText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                String credentialName = credentialTypeCombo.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_OAUTH2_TOKEN_TO_GOOGLE_CREDENTIALS, EncryptionUtil.getValue(oauthTokenText.getText(), true));
                checkFieldsValue();
            }
        });

        k8sSubmitMode.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String runModeLableName = k8sSubmitMode.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_SUBMIT_MODE,
                        getK8sSubmitModeByName(runModeLableName).getValue());
                checkFieldsValue();
            }
        });

        k8sMaster.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_MASTER,
                        k8sMaster.getText());
                checkFieldsValue();
            }
        });

        k8sInstances.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_INSTANCES,
                        k8sInstances.getText());
                checkFieldsValue();
            }
        });

        k8sUseRegistrySecret.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                k8sRegistrySecret.setVisible(k8sUseRegistrySecret.getSelection());
                updateForm();
                checkFieldsValue();
            }
        });

        k8sRegistrySecret.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_REGISTRYSECRET,
                        k8sRegistrySecret.getText());
                checkFieldsValue();
            }
        });

        k8sImage.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_IMAGE,
                        k8sImage.getText());
                checkFieldsValue();
            }
        });

        k8sNamespace.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_NAMESPACE,
                        k8sNamespace.getText());
                checkFieldsValue();
            }
        });

        k8sServiceAccount.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_SERVICEACCOUNT,
                        k8sServiceAccount.getText());
                checkFieldsValue();
            }
        });

        k8sDistUpload.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String runModeLableName = k8sDistUpload.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_DISTUPLOAD,
                        getK8sDistUploadByName(runModeLableName).getValue());
                hideK8sFieldsOnDistUpload();
                checkFieldsValue();
            }
        });

        k8sS3Bucket.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3BUCKET,
                        k8sS3Bucket.getText());
                checkFieldsValue();
            }
        });

        k8sS3Folder.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3FOLDER,
                        k8sS3Folder.getText());
                checkFieldsValue();
            }
        });

        k8sS3Credentials.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String runModeLableName = k8sS3Credentials.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3CREDENTIALS,
                        getK8sS3CredentialsByName(runModeLableName).getValue());
                hideK8sS3Creds();
                checkFieldsValue();
            }
        });

        k8sS3AccessKey.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3ACCESSKEY,
                        k8sS3AccessKey.getText());
                checkFieldsValue();
            }
        });

        k8sS3SecretKey.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_S3SECRETKEY, EncryptionUtil.getValue(k8sS3SecretKey.getText(), true));
                checkFieldsValue();
            }
        });

        k8sBlobAccount.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBACCOUNT,
                        k8sBlobAccount.getText());
                checkFieldsValue();
            }
        });

        k8sBlobContainer.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBCONTAINER,
                        k8sBlobContainer.getText());
                checkFieldsValue();
            }
        });

        k8sBlobSecretKey.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_BLOBSECRETKEY, EncryptionUtil.getValue(k8sBlobSecretKey.getText(), true));
                checkFieldsValue();
            }
        });

        k8sAzureAccount.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREACCOUNT,
                        k8sAzureAccount.getText());
                checkFieldsValue();
            }
        });

        k8sAzureCredentials.getCombo().addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                String runModeLableName = k8sAzureCredentials.getText();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECREDENTIALS,
                        getK8sAzureCredentialsByName(runModeLableName).getValue());
                hideK8sAzureCreds();
                checkFieldsValue();
            }
        });

        k8sAzureContainer.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECONTAINER,
                        k8sAzureContainer.getText());
                checkFieldsValue();
            }
        });

        k8sAzureSecretKey.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURESECRETKEY, EncryptionUtil.getValue(k8sAzureSecretKey.getText(), true));
                checkFieldsValue();
            }
        });

        k8sAzureAADKey.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADKEY, EncryptionUtil.getValue(k8sAzureAADKey.getText(), true));
                checkFieldsValue();
            }
        });

        k8sAzureAADClientID.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADCLIENTID,
                        k8sAzureAADClientID.getText());
                checkFieldsValue();
            }
        });

        k8sAzureAADDirectoryID.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_K8S_AZUREAADDIRECTORYID,
                        k8sAzureAADDirectoryID.getText());
                checkFieldsValue();
            }
        });
        // CDE listeners (UI to Connection)
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_CDE_API_ENDPOINT);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN);
        ((LabelledCheckbox) cdeAutoGenerateToken).addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateCdeFieldsVisibility();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_CDE_AUTO_GENERATE_TOKEN, Boolean.valueOf(((LabelledCheckbox) cdeAutoGenerateToken).getSelection()).toString());
            }
        });
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_CDE_TOKEN_ENDPOINT);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_USER);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_CDE_WORKLOAD_PASSWORD);

        // Standalone Listeners
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_MASTER);
        ((LabelledCheckbox) standaloneConfigureExec).addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateStandaloneConfigureExecutors();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_CONFIGURE_EXEC, Boolean.valueOf(((LabelledCheckbox) standaloneConfigureExec).getSelection()).toString());
            }
        });
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_CORE);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_UNIV_STANDALONE_EXEC_MEMORY);

        //Synapse listeners
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_HOST);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_SPARK_POOLS);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_TOKEN);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_HOSTNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_CONTAINER);

        storageAuthType.getCombo().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateSynapseFieldsVisibility();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_AUTH_MODE, ESynapseAuthType.getSynapseAuthTypeByDisplayName(storageAuthType.getText()).getName());
            }
        });

        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_USERNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_FS_PASSWORD);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DIRECTORY_ID);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_APPLICATION_ID);
        ((LabelledCheckbox) useSynapseCertificate).addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateSynapseFieldsVisibility();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_USE_SYNAPSE_CLIENT_CERTIFICATE, Boolean.valueOf(((LabelledCheckbox) useSynapseCertificate).getSelection()).toString());
            }
        });

        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_KEY);
        azureClientCertificate.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                updateSynapseFieldsVisibility();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_CLIENT_CERTIFICATE, azureClientCertificate.getText());
            } });
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_SYNAPSE_DEPLOY_BLOB);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_DRIVER_MEMORY);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_DRIVER_CORES);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_MEMORY);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_EXECUTOR_CORES);

        //HDI listeners
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_HDI_USERNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_HDI_PASSWORD);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_HOSTNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_PORT);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_WEB_HCAT_USERNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_AZURE_HOSTNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_AZURE_CONTAINER);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_AZURE_USERNAME);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_AZURE_PASSWORD);
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_AZURE_DEPLOY_BLOB);

        hdiStorageType.getCombo().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                updateHDIFieldsVisibility();
                getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_AZURE_HDINSIGHT_STORAGE, EHdinsightStorage.getHdinsightStoragenByDisplayName(hdiStorageType.getText()).getName());
            }
        });
        
        addBasicListener(ConnParameterKeys.CONN_PARA_KEY_UNIV_SPARK_SUBMIT_SCRIPT_HOME);
    }

    private void reloadForm() {
        ((HadoopClusterForm) this.getParent()).switchToInfoForm();
    }

    private void updateKnoxPart() {
        hideControl(useKnoxButton, !HCVersionUtil.isExecutedThroughKnox(getConnection()));
    }

    /*
     * Show/hide required CDE fields according token generation mechanism
     */
    private void updateCdeFieldsVisibility() {
        boolean autoGenerateToken = ((LabelledCheckbox) cdeAutoGenerateToken).getSelection();
        cdeToken.setVisible(! autoGenerateToken, autoGenerateToken);
        cdeTokenEndpoint.setVisible(autoGenerateToken, ! autoGenerateToken);
        cdeWorkloadUser.setVisible(autoGenerateToken, ! autoGenerateToken);
        cdeWorkloadPassword.setVisible(autoGenerateToken, ! autoGenerateToken);
        cdeGroup.layout();
        cdeGroup.getParent().layout();
    }

    private void updateStandaloneConfigureExecutors() {
        boolean configureExecutors = ((LabelledCheckbox) standaloneConfigureExec).getSelection();
        standaloneExecCore.setVisible(configureExecutors, !configureExecutors);
        standaloneExecMemory.setVisible(configureExecutors, !configureExecutors);
        standaloneGroup.layout();
        standaloneGroup.getParent().layout();
    }

    private void updateDatabricksFields() {
        boolean isTransientMode = 0 == clusterType.getSelectionIndex();
        driverNodeType.setVisible(isTransientMode);
        nodeType.setVisible(isTransientMode);
        clusterRuntimeVersion.setVisible(isTransientMode);
        clusterIDText.setVisible(!isTransientMode, isTransientMode);
        if (!clusterType.isEnabled()) {
            driverNodeType.setVisible(true);
            nodeType.setVisible(true);
            clusterRuntimeVersion.setVisible(true);
            clusterIDText.setVisible(true, false);
        }
        dataBricksGroup.layout();
        dataBricksGroup.getParent().layout();
    }

    private void updateSynapseFieldsVisibility() {
        boolean isAAD = ESynapseAuthType.AAD.getDisplayName().equals(storageAuthType.getText());
        boolean useCertificate = ((LabelledCheckbox) useSynapseCertificate).getSelection() && isAAD;
        boolean useClientKey = !((LabelledCheckbox) useSynapseCertificate).getSelection() && isAAD;
        azureUsername.setVisible(!isAAD, isAAD);
        azurePassword.setVisible(!isAAD, isAAD);
        azureClientId.setVisible(isAAD, !isAAD);
        azureDirectoryId.setVisible(isAAD, !isAAD);
        azureClientKey.setVisible(useClientKey, !useClientKey);
        useSynapseCertificate.setVisible(isAAD, !isAAD);
        azureClientCertificate.setVisible(useCertificate);
        synapseGroup.layout();
        synapseGroup.getParent().layout();
    }

    private void updateHDIFieldsVisibility() {
        hdiGroup.layout();
        hdiGroup.getParent().layout();
        livyGroup.layout();
        livyGroup.getParent().layout();
        fsGroup.layout();
        fsGroup.getParent().layout();
    }

    /*
     * Add a listener to update paramKey connection parameter with value from associated widget
     */
    private void addBasicListener(String paramKey) {
        LabelledText targetComponent = (LabelledText) fieldByParamKey.get(paramKey);
        targetComponent.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(final ModifyEvent e) {
                getConnection().getParameters().put(paramKey, targetComponent.getText());
                checkFieldsValue();
            }
        });
    }

    /**
     * Hide widgets according to current Spark mode
     */
    private void hideFieldsOnSparkMode() {

        if (sparkModeCombo != null
                && "SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())) {
            String sparkModeLabelName = sparkModeCombo.getText();
            getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SPARK_MODE,
                    getSparkModeByName(sparkModeLabelName).getValue());

            // List of possible configuration groups
             List<Group> groups = Arrays.asList(connectionGroup, authGroup, webHDFSSSLEncryptionGrp, dataBricksGroup, cdeGroup, 
            		 dataProcGroup, kubernetesGroup, kubernetesS3Group, kubernetesAzureGroup, kubernetesBlobGroup, standaloneGroup,
            		 sparkSubmitScriptGroup, synapseGroup, livyGroup, hdiGroup, fsGroup);

            // Group visibility depends on Spark mode
            Map<ESparkMode, List<Group>> visibleGroupsBySparkMode = new HashMap<ESparkMode, List<Group>>();
            visibleGroupsBySparkMode.put(ESparkMode.YARN_CLUSTER, Arrays.asList(connectionGroup, authGroup, webHDFSSSLEncryptionGrp));
            visibleGroupsBySparkMode.put(ESparkMode.DATABRICKS, Arrays.asList(dataBricksGroup));
            visibleGroupsBySparkMode.put(ESparkMode.CDE, Arrays.asList(cdeGroup));
            visibleGroupsBySparkMode.put(ESparkMode.DATAPROC, Arrays.asList(dataProcGroup));
            visibleGroupsBySparkMode.put(ESparkMode.KUBERNETES, Arrays.asList(kubernetesGroup, kubernetesS3Group, kubernetesAzureGroup, kubernetesBlobGroup));
            visibleGroupsBySparkMode.put(ESparkMode.STANDALONE, Arrays.asList(standaloneGroup));
            visibleGroupsBySparkMode.put(ESparkMode.SPARK_SUBMIT, Arrays.asList(sparkSubmitScriptGroup));
            visibleGroupsBySparkMode.put(ESparkMode.SYNAPSE, Arrays.asList(synapseGroup));
            visibleGroupsBySparkMode.put(ESparkMode.HDI, Arrays.asList(hdiGroup, livyGroup, fsGroup));

            // Compute current visible groups
            ESparkMode currentSparkMode = ESparkMode.getByLabel(sparkModeLabelName);
            List<Group> currentVisibleGroups = visibleGroupsBySparkMode.get(currentSparkMode);
            // Hide required groups
            for (Group group : groups) {
                hideControl(group, currentVisibleGroups == null || !currentVisibleGroups.contains(group));
            }
            checkServicesBtn.setVisible("yarn cluster".contentEquals(sparkModeLabelName.toLowerCase()));
        } else {
            hideControl(dataBricksGroup, true);
            hideControl(cdeGroup, true);
            hideControl(dataProcGroup, true);
            hideControl(kubernetesGroup, true);
            hideControl(kubernetesS3Group, true);
            hideControl(kubernetesAzureGroup, true);
            hideControl(kubernetesBlobGroup, true);
            hideControl(standaloneGroup, true);
            hideControl(sparkSubmitScriptGroup, true);
            hideControl(synapseGroup, true);
            hideControl(hdiGroup, true);
            hideControl(livyGroup, true);
            hideControl(fsGroup, true);
        }

    }

    private void onUseCustomConfBtnSelected(SelectionEvent event) {
        hadoopConfsButton.setEnabled(useCustomConfBtn.getSelection() && !setHadoopConfBtn.getSelection());
        getConnection().setUseCustomConfs(useCustomConfBtn.getSelection());
        refreshHadoopConfGroup();
        checkFieldsValue();
    }

    private void refreshHadoopConfGroup() {
        hideControl(hadoopConfsGroup, !useCustomConfBtn.getSelection());
        propertiesComposite.layout();
        propertiesScroll.setMinSize(propertiesComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        propertiesScroll.layout();
    }

    private void onOverrideHadoopConfBtnSelected(SelectionEvent event) {
        Boolean override = setHadoopConfBtn.getSelection();
        boolean isContextMode = isContextMode();
        hadoopConfsButton.setEnabled(!override);
        hadoopConfSpecificJarText.setEditable(override && !isContextMode);
        browseHadoopConfBtn.setEnabled(override && !isContextMode);
        if (!isContextMode) {
            getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SET_HADOOP_CONF, override.toString());
        } else {
            getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_SET_HADOOP_CONF, override.toString());
        }
        checkFieldsValue();
    }

    private void onHadoopConfPathTextModified(ModifyEvent event) {
        getConnection().getParameters().put(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CONF_SPECIFIC_JAR,
                hadoopConfSpecificJarText.getText());
        checkFieldsValue();
    }

    private void onBrowseHadoopConfBtnSelected(SelectionEvent event) {
        FileDialog dilaog = new FileDialog(getShell());
        dilaog.setText(getShell().getText());
        dilaog.setFilterExtensions(new String[] { "*", "*.*" }); //$NON-NLS-1$ //$NON-NLS-2$
        String filePath = dilaog.open();
        if (filePath != null && !filePath.isEmpty()) {
            String confsPath = new Path(filePath).toPortableString();
            hadoopConfSpecificJarText.setText(confsPath);
            checkFieldsValue();
        }
    }

    @Override
    protected void addUtilsButtonListeners() {
        checkServicesBtn.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                checkServices();
            }
        });
    }

    private void checkServices() {
        Map<EHadoopServiceType, HadoopServiceProperties> serviceTypeToProperties = new HashMap<EHadoopServiceType, HadoopServiceProperties>();
        HadoopServiceProperties nnProperties = new HadoopServiceProperties();
        initCommonProperties(nnProperties);
        nnProperties.setNameNode(getConnection().getNameNodeURI());
        serviceTypeToProperties.put(EHadoopServiceType.NAMENODE, nnProperties);
        HadoopServiceProperties rmORjtProperties = new HadoopServiceProperties();
        initCommonProperties(rmORjtProperties);
        if (getConnection().isUseYarn()) {
            rmORjtProperties.setResourceManager(getConnection().getJobTrackerURI());
            serviceTypeToProperties.put(EHadoopServiceType.RESOURCE_MANAGER, rmORjtProperties);
        } else {
            rmORjtProperties.setJobTracker(getConnection().getJobTrackerURI());
            serviceTypeToProperties.put(EHadoopServiceType.JOBTRACKER, rmORjtProperties);
        }
        if (getConnection().isUseCustomVersion()) {
            nnProperties.setUid(connectionItem.getProperty().getId() + ":" + ECustomVersionGroup.COMMON.getName()); //$NON-NLS-1$
            nnProperties.setCustomJars(HCVersionUtil.getCustomVersionMap(getConnection()).get(
                    ECustomVersionGroup.COMMON.getName()));
            rmORjtProperties.setUid(connectionItem.getProperty().getId() + ":" + ECustomVersionGroup.MAP_REDUCE.getName()); //$NON-NLS-1$
            rmORjtProperties.setCustomJars(HCVersionUtil.getCustomVersionMap(getConnection()).get(
                    ECustomVersionGroup.MAP_REDUCE.getName()));
        }
        new CheckHadoopServicesDialog(getShell(), filterTypes(serviceTypeToProperties)).open();
    }

    private Map<EHadoopServiceType, HadoopServiceProperties> filterTypes(
            Map<EHadoopServiceType, HadoopServiceProperties> serviceTypeToProperties) {
        Map<EHadoopServiceType, HadoopServiceProperties> filteredTypes = serviceTypeToProperties;
        IDesignerCoreService designerCoreService = CoreRuntimePlugin.getInstance().getDesignerCoreService();
        INode node = designerCoreService.getRefrenceNode("tMRConfiguration", ComponentCategory.CATEGORY_4_MAPREDUCE.getName());//$NON-NLS-1$
        if (node == null) {
            filteredTypes.remove(EHadoopServiceType.JOBTRACKER);
            filteredTypes.remove(EHadoopServiceType.RESOURCE_MANAGER);
        }
        return filteredTypes;
    }

    private void initCommonProperties(HadoopServiceProperties properties) {
        properties.setItem(this.connectionItem);
        HadoopClusterConnection connection = getConnection();
        ContextType contextType = null;
        if (getConnection().isContextMode()) {
            contextType = ConnectionContextHelper.getContextTypeForContextMode(connection, true);
        }
        properties.setContextType(contextType);
        properties.setDistribution(connection.getDistribution());
        properties.setVersion(connection.getDfVersion());
        properties.setGroup(connection.getGroup());
        properties.setUseKrb(connection.isEnableKerberos());
        properties.setCustom(connection.isUseCustomVersion());
        properties.setUseCustomConfs(connection.isUseCustomConfs());
        properties.setPrincipal(connection.getPrincipal());
        properties.setJtOrRmPrincipal(connection.getJtOrRmPrincipal());
        properties.setJobHistoryPrincipal(connection.getJobHistoryPrincipal());
        properties.setUseKeytab(connection.isUseKeytab());
        properties.setKeytabPrincipal(connection.getKeytabPrincipal());
        properties.setKeytab(connection.getKeytab());
        properties.setHadoopProperties(HadoopRepositoryUtil.getHadoopPropertiesWithOriginalValue(
                connection.getHadoopProperties(), contextType, false));
        properties.setRelativeHadoopClusterId(connectionItem.getProperty().getId());
        properties.setRelativeHadoopClusterLabel(connectionItem.getProperty().getLabel());

        properties.setMaprT(connection.isEnableMaprT());
        properties.setUserName(connection.getUserName());
        properties.setMaprTPassword(connection.getMaprTPassword());
        properties.setMaprTCluster(connection.getMaprTCluster());
        properties.setMaprTDuration(connection.getMaprTDuration());
        properties.setSetMaprTHomeDir(connection.isSetMaprTHomeDir());
        properties.setSetHadoopLogin(connection.isSetHadoopLogin());
        properties.setPreloadAuthentification(connection.isPreloadAuthentification());
        properties.setMaprTHomeDir(connection.getMaprTHomeDir());
        properties.setMaprTHadoopLogin(connection.getMaprTHadoopLogin());
        properties.setSetHadoopConf(connection.isUseCustomConfs() && HCParameterUtil.isOverrideHadoopConfs(connection));
        properties.setHadoopConfSpecificJar(ContextParameterUtils.getOriginalValue(contextType,
                Optional.ofNullable(connection.getParameters().get(ConnParameterKeys.CONN_PARA_KEY_HADOOP_CONF_SPECIFIC_JAR))
                        .orElse("")));

        properties.setUseWebHDFSSSL(connection.isUseWebHDFSSSL());
        properties.setWebHDFSSSLTrustStorePath(connection.getWebHDFSSSLTrustStorePath());
        properties.setWebHDFSSSLTrustStorePassword(connection.getWebHDFSSSLTrustStorePassword());
    }

    @Override
    public void updateForm() {
        HadoopClusterConnection connection = getConnection();
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion.distribution.useCustom()) {
            hideControl(customGroup, false);
            String authModeName = connection.getAuthMode();
            if (authModeName != null) {
                EAuthenticationMode authMode = EAuthenticationMode.getAuthenticationByName(authModeName, false);
                switch (authMode) {
                    case KRB:
                        kerberosBtn.setEnabled(true);
                        namenodePrincipalText.setEditable(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
                        jtOrRmPrincipalText.setEditable(namenodePrincipalText.getEditable());
                        jobHistoryPrincipalText.setEditable(isJobHistoryPrincipalEditable());
                        keytabBtn.setEnabled(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
                        keytabPrincipalText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
                        keytabText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
                        keytabPrincipalText.setHideWidgets(!(kerberosBtn.isEnabled() && kerberosBtn.getSelection()
                                && keytabBtn.isEnabled() && keytabBtn.getSelection()));
                        keytabText.setVisible(kerberosBtn.isEnabled() && kerberosBtn.getSelection() && keytabBtn.isEnabled()
                                && keytabBtn.getSelection());
                        userNameText.setEditable(false);
                        groupText.setEditable(false);
                        // userNameText.setHideWidgets(true);
                        userNameText.setVisible(false);
                        groupText.setHideWidgets(true);
                        hideKerberosControl(!kerberosBtn.getSelection());
                        hideMaprTicketControl(true);
                        maprTPasswordText.setEditable(false);
                        break;
                    case UGI:
                        kerberosBtn.setEnabled(true);
                        namenodePrincipalText.setEditable(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
                        jtOrRmPrincipalText.setEditable(namenodePrincipalText.getEditable());
                        jobHistoryPrincipalText.setEditable(namenodePrincipalText.getEditable());
                        keytabBtn.setEnabled(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
                        keytabPrincipalText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
                        keytabText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
                        keytabPrincipalText.setHideWidgets(!(kerberosBtn.isEnabled() && kerberosBtn.getSelection()
                                && keytabBtn.isEnabled() && keytabBtn.getSelection()));
                        keytabText.setVisible(kerberosBtn.isEnabled() && kerberosBtn.getSelection() && keytabBtn.isEnabled()
                                && keytabBtn.getSelection());
                        userNameText.setEditable(!(kerberosBtn.isEnabled() && kerberosBtn.getSelection()));
                        groupText.setEditable(true);
                        userNameText.setHideWidgets(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
                        groupText.setHideWidgets(false);
                        hideKerberosControl(!kerberosBtn.getSelection());
                        // maprt
                        hideMaprTicketChildControl(!maprTBtn.getSelection());
                        maprTPasswordText.setEditable(maprTBtn.isEnabled()
                                && (maprTBtn.getSelection() && !(kerberosBtn.isEnabled() && kerberosBtn.getSelection())));
                        break;
                    default:
                        kerberosBtn.setEnabled(false);
                        namenodePrincipalText.setEditable(false);
                        jtOrRmPrincipalText.setEditable(false);
                        jobHistoryPrincipalText.setEditable(false);
                        keytabBtn.setEnabled(false);
                        keytabPrincipalText.setEditable(false);
                        keytabText.setEditable(false);
                        userNameText.setEditable(true);
                        groupText.setEditable(false);
                        userNameText.setHideWidgets(false);
                        groupText.setHideWidgets(true);
                        hideKerberosControl(true);
                        hideMaprTicketControl(true);
                        maprTPasswordText.setEditable(false);
                        break;
                }
            }
        } else {
            hideControl(customGroup, true);

            kerberosBtn.setEnabled(isCurrentHadoopVersionSupportSecurity());
            namenodePrincipalText.setEditable(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
            jtOrRmPrincipalText.setEditable(namenodePrincipalText.getEditable());
            jobHistoryPrincipalText.setEditable(isJobHistoryPrincipalEditable());
            keytabBtn.setEnabled(kerberosBtn.isEnabled() && kerberosBtn.getSelection());
            keytabPrincipalText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
            keytabText.setEditable(keytabBtn.isEnabled() && keytabBtn.getSelection());
            keytabPrincipalText
                    .setHideWidgets(!(kerberosBtn.isEnabled() && kerberosBtn.getSelection() && keytabBtn.isEnabled() && keytabBtn
                            .getSelection()));
            keytabText.setVisible(kerberosBtn.isEnabled() && kerberosBtn.getSelection() && keytabBtn.isEnabled()
                    && keytabBtn.getSelection());
            groupText.setEditable(isCurrentHadoopVersionSupportGroup());
            userNameText.setEditable(!kerberosBtn.getSelection());
            if (isCurrentHadoopVersionSupportGroup()) {
                userNameText.setHideWidgets(kerberosBtn.getSelection());
            } else {
                userNameText.setVisible(!kerberosBtn.getSelection());
            }
            groupText.setHideWidgets(!isCurrentHadoopVersionSupportGroup());
            hideKerberosControl(!kerberosBtn.getSelection());

            // maprt
            hideControl(maprTBtn, !isCurrentHadoopVersionSupportMapRTicket());
            maprTBtn.setEnabled(isCurrentHadoopVersionSupportMapRTicket());
            maprTPasswordText.setEditable(maprTBtn.isEnabled()
                    && (maprTBtn.getSelection() && !(kerberosBtn.isEnabled() && kerberosBtn.getSelection())));
            maprTClusterText.setEditable(maprTBtn.isEnabled() && maprTBtn.getSelection());
            maprTDurationText.setEditable(maprTBtn.isEnabled() && maprTBtn.getSelection());
            setMaprTHomeDirBtn.setEnabled(maprTBtn.isEnabled() && maprTBtn.getSelection());
            setHadoopLoginBtn.setEnabled(maprTBtn.isEnabled() && maprTBtn.getSelection());
            preloadAuthentificationBtn.setEnabled(maprTBtn.isEnabled() && maprTBtn.getSelection());
            hideMaprTicketChildControl(!maprTBtn.getSelection());
        }
        updateMRRelatedContent();
        updateConnectionContent();
        hideWebHDFSControl(!isCurrentHadoopVersionSupportWebHDFS());
        if (isContextMode()) {
            adaptFormToEditable();
        }
        hideK8sFieldsOnDistUpload();
        hideFieldsOnSparkMode();
        k8sRegistrySecret.setVisible(k8sUseRegistrySecret.getSelection());

    }

    private void hideK8sFieldsOnDistUpload() {
        boolean isK8sS3 = "S3".equals(k8sDistUpload.getText());
        boolean isK8sAzure = "Azure".equals(k8sDistUpload.getText());
        boolean isK8sBlob = "Blob".equals(k8sDistUpload.getText());
        k8sS3Bucket.setVisible(isK8sS3);
        k8sS3Folder.setVisible(isK8sS3);
        k8sS3Credentials.setVisible(isK8sS3);
        k8sS3AccessKey.setVisible(isK8sS3);
        k8sS3SecretKey.setVisible(isK8sS3);
        kubernetesS3Group.setVisible(isK8sS3);
        k8sBlobAccount.setVisible(isK8sBlob);
        k8sBlobContainer.setVisible(isK8sBlob);
        k8sBlobSecretKey.setVisible(isK8sBlob);
        kubernetesBlobGroup.setVisible(isK8sBlob);
        boolean isAccessKey = EKubernetesAzureCredentials.SECRET.getLabel().equals(k8sAzureCredentials.getText());
        kubernetesAzureGroup.setVisible(isK8sAzure);
        k8sAzureAccount.setVisible(isK8sAzure);
        k8sAzureCredentials.setVisible(isK8sAzure);
        k8sAzureContainer.setVisible(isK8sAzure);
        k8sAzureSecretKey.setVisible(isK8sAzure && isAccessKey);
        k8sAzureAADKey.setVisible(isK8sAzure && false);
        k8sAzureAADDirectoryID.setVisible(isK8sAzure && false);
        k8sAzureAADClientID.setVisible(isK8sAzure && false);
        List<Integer> yPositions = Arrays.asList(kubernetesAzureGroup.getLocation().y, kubernetesS3Group.getLocation().y, kubernetesBlobGroup.getLocation().y);
        Integer minY = Collections.min(yPositions);
        if (isK8sS3) {
            kubernetesS3Group.setLocation(kubernetesS3Group.getLocation().x, minY);
        } else if (isK8sAzure) {
            kubernetesAzureGroup.setLocation(kubernetesAzureGroup.getLocation().x, minY);
        } else if (isK8sBlob) {
            kubernetesBlobGroup.setLocation(kubernetesBlobGroup.getLocation().x, minY);
        }
    }

    private void hideK8sAzureCreds() {
        boolean isAccessKey = EKubernetesAzureCredentials.SECRET.getLabel().equals(k8sAzureCredentials.getText());
        k8sAzureSecretKey.setVisible(isAccessKey);
        k8sAzureAADKey.setVisible(false);
        k8sAzureAADDirectoryID.setVisible(false);
        k8sAzureAADClientID.setVisible(false);
    }

    private void hideK8sS3Creds() {
        boolean isAccessKey = EKubernetesS3Credentials.ACCESSANDSECRET.getLabel().equals(k8sS3Credentials.getText());
        k8sS3AccessKey.setVisible(isAccessKey);
        k8sS3SecretKey.setVisible(isAccessKey);
    }

    private void hideMaprTicketControl(boolean hide) {
        maprTClusterText.setEditable(!hide);
        maprTDurationText.setEditable(!hide);
        hideControl(maprTBtn, hide);
        hideControl(maprTPCDCompposite, hide);
        hideControl(maprTSetComposite, hide);
        authMaprTComposite.layout();
        authMaprTComposite.getParent().layout();
    }

    private void hideMaprTicketChildControl(boolean hide) {
        maprTClusterText.setEditable(maprTBtn.isEnabled() && maprTBtn.getSelection());
        maprTDurationText.setEditable(maprTBtn.isEnabled() && maprTBtn.getSelection());
        maprTHomeDirText.setEditable(!hide && setMaprTHomeDirBtn.isEnabled() && setMaprTHomeDirBtn.getSelection());
        maprTHadoopLoginText.setEditable(!hide && setHadoopLoginBtn.isEnabled() && setHadoopLoginBtn.getSelection());
        hideControl(maprTPasswordCompposite, kerberosBtn.getSelection() && maprTBtn.getSelection());
        hideControl(maprTPCDCompposite, hide);
        hideControl(maprTSetComposite, hide);
        authMaprTComposite.layout();
        authMaprTComposite.getParent().layout();
    }

    private void hideKerberosControl(boolean hide) {
        hideControl(authNodejtOrRmHistoryComposite, hide);
        hideControl(authKeytabComposite, hide);
        authCommonComposite.layout();
        authCommonComposite.getParent().layout();
    }

    private void hideWebHDFSControl(boolean hide) {
        hideControl(webHDFSSSLEncryptionGrp, hide);
        useWebHDFSSSLEncryptionBtn.setEnabled(!hide);
        webHDFSSSLTrustStorePath.setEditable(useWebHDFSSSLEncryptionBtn.isEnabled() && useWebHDFSSSLEncryptionBtn.getSelection());
        webHDFSSSLTrustStorePassword
                .setEditable(useWebHDFSSSLEncryptionBtn.isEnabled() && useWebHDFSSSLEncryptionBtn.getSelection());
        webHDFSSSLTrustStorePath.setVisible(useWebHDFSSSLEncryptionBtn.isEnabled() && useWebHDFSSSLEncryptionBtn.getSelection());
        webHDFSSSLTrustStorePassword
                .setHideWidgets(!(useWebHDFSSSLEncryptionBtn.isEnabled() && useWebHDFSSSLEncryptionBtn.getSelection()));
    }

    private boolean isJobHistoryPrincipalEditable() {
        return isCurrentHadoopVersionSupportJobHistoryPrincipal()
                && getConnection().isEnableKerberos()
                && (!hadoopDistribution.useCustom() || hadoopDistribution.useCustom() && isCustomUnsupportHasSecurity()
                && getConnection().isUseYarn());
    }

    private boolean isCurrentHadoopVersionSupportJobHistoryPrincipal() {
        return isCurrentHadoopVersionSupportSecurity() && (isCurrentHadoopVersionSupportYarn() || hadoopDistribution.useCustom());
    }

    private DistributionBean getDistribution() {
        return HadoopDistributionsHelper.HADOOP.getDistribution(getConnection().getDistribution(), false);
    }

    private DistributionVersion getDistributionVersion() {
        final DistributionBean distribution = getDistribution();
        if (distribution != null) {
            return distribution.getVersion(getConnection().getDfVersion(), false);
        }
        return null;
    }

    private boolean isCurrentHadoopVersionSupportGroup() {
        boolean supportGroup = false;
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion != null && distributionVersion.hadoopComponent != null) {
            supportGroup = distributionVersion.hadoopComponent.doSupportGroup();
        }
        return supportGroup;
    }

    private boolean isCustomUnsupportHasGroup() {
        EAuthenticationMode authMode = EAuthenticationMode.getAuthenticationByName(getConnection().getAuthMode(), false);
        return authMode.equals(EAuthenticationMode.UGI);
    }

    private boolean isCustomUnsupportHasSecurity() {
        EAuthenticationMode authMode = EAuthenticationMode.getAuthenticationByName(getConnection().getAuthMode(), false);
        return authMode.equals(EAuthenticationMode.KRB);
    }

    private boolean isCurrentHadoopVersionSupportSecurity() {
        boolean supportSecurity = false;
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion != null && distributionVersion.hadoopComponent != null) {
            supportSecurity = distributionVersion.hadoopComponent.doSupportKerberos();
        }
        return supportSecurity;
    }

    private boolean isCurrentHadoopVersionSupportMapRTicket() {
        boolean supportMapRTicket = false;
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion != null && distributionVersion.hadoopComponent != null) {
            supportMapRTicket = distributionVersion.hadoopComponent.doSupportMapRTicket();
        }
        return supportMapRTicket;
    }

    private boolean isCurrentHadoopVersionSupportYarn() {
        boolean supportYarn = false;
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion != null && distributionVersion.hadoopComponent != null) {
            supportYarn = distributionVersion.hadoopComponent.isHadoop2() || distributionVersion.hadoopComponent.isHadoop3();
        }
        return supportYarn;
    }

    private boolean isCurrentHadoopVersionSupportWebHDFS() {
        boolean supportWebHDFS = false;
        final DistributionVersion distributionVersion = getDistributionVersion();
        if (distributionVersion != null && distributionVersion.hadoopComponent != null) {
            supportWebHDFS = distributionVersion.hadoopComponent.doSupportWebHDFS();
        }
        return supportWebHDFS;
    }

    private void updateMRRelatedContent() {
        boolean useYarn = getConnection().isUseYarn();
        jobtrackerUriText
                .setLabelText(useYarn ? Messages.getString("HadoopClusterForm.text.resourceManager") : Messages.getString("HadoopClusterForm.text.jobtrackerURI")); //$NON-NLS-1$ //$NON-NLS-2$
        jobtrackerUriText.getTextControl().getParent().layout();
        jtOrRmPrincipalText
                .setLabelText(useYarn ? Messages.getString("HadoopClusterForm.text.rmPrincipal") : Messages.getString("HadoopClusterForm.text.jtPrincipal")); //$NON-NLS-1$ //$NON-NLS-2$
        jtOrRmPrincipalText.getTextControl().getParent().layout();
    }

    private void updateConnectionContent() {
        if (!kerberosBtn.isEnabled()) {
            kerberosBtn.setSelection(false);
            namenodePrincipalText.setText(EMPTY_STRING);
            jtOrRmPrincipalText.setText(EMPTY_STRING);
            jobHistoryPrincipalText.setText(EMPTY_STRING);
            getConnection().setEnableKerberos(false);
        }
        if (!maprTBtn.isEnabled()) {
            maprTBtn.setSelection(false);
            maprTPasswordText.setText(EMPTY_STRING);
            maprTClusterText.setText(EMPTY_STRING);
            maprTDurationText.setText(EMPTY_STRING);
            setMaprTHomeDirBtn.setSelection(false);
            setHadoopLoginBtn.setSelection(false);
            preloadAuthentificationBtn.setSelection(false);
            maprTHomeDirText.setText(EMPTY_STRING);
            maprTHadoopLoginText.setText(EMPTY_STRING);
            getConnection().setEnableMaprT(false);
        }
        if (!groupText.getEditable()) {
            groupText.setText(EMPTY_STRING);
        }
        if (!userNameText.getEditable()) {
            userNameText.setText(EMPTY_STRING);
        }
        if (!useWebHDFSSSLEncryptionBtn.isEnabled()) {
            useWebHDFSSSLEncryptionBtn.setSelection(false);
            webHDFSSSLTrustStorePath.setText(EMPTY_STRING);
            webHDFSSSLTrustStorePassword.setText(EMPTY_STRING);
            getConnection().setUseWebHDFSSSL(false);
        }
    }

    @Override
    protected void hideControl(Control control, boolean hide) {
        Object layoutData = control.getLayoutData();
        if (layoutData instanceof GridData) {
            GridData data = (GridData) layoutData;
            data.exclude = hide;
            control.setLayoutData(data);
            control.setVisible(!hide);
            if (control.getParent() != null) {
                control.getParent().layout();
            }
        }
    }

    private void fillDefaults() {
        HadoopClusterConnection connection = getConnection();
        if (creation && !connection.isUseCustomConfs()) {
            HCRepositoryUtil.fillDefaultValuesOfHadoopCluster(connection);
        }
    }

    @Override
    public boolean checkFieldsValue() {
        checkServicesBtn.setEnabled(false);
        updateStatus(IStatus.OK, null);

        if (!"SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())
                || (sparkModeCombo != null && ESparkMode.YARN_CLUSTER.getLabel().equals(sparkModeCombo.getText()))) {
            if (getConnection().isUseCustomVersion()) {
                if (authenticationCombo.getSelectionIndex() == -1) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.authentication")); //$NON-NLS-1$
                    return false;
                }
            }

            if (!validText(namenodeUriText.getText())) {
                updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.namenodeURI")); //$NON-NLS-1$
                return false;
            }

            if (!isContextMode() && !HadoopParameterValidator.isValidNamenodeURI(namenodeUriText.getText())) {
                updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.namenodeURI.invalid")); //$NON-NLS-1$
                return false;
            }

            if (!validText(jobtrackerUriText.getText())) {
                updateStatus(IStatus.ERROR,
                        Messages.getString("HadoopClusterForm.check.jobtrackerURI2", jobtrackerUriText.getLabelText())); //$NON-NLS-1$
                return false;
            }

            if (!isContextMode() && !HadoopParameterValidator.isValidJobtrackerURI(jobtrackerUriText.getText())) {
                updateStatus(IStatus.ERROR,
                        Messages.getString("HadoopClusterForm.check.jobtrackerURI.invalid2", jobtrackerUriText.getLabelText())); //$NON-NLS-1$
                return false;
            }

            if (namenodePrincipalText.getEditable()) {
                if (!validText(namenodePrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.namenodePrincipal")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidPrincipal(namenodePrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.namenodePrincipal.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (jtOrRmPrincipalText.getEditable()) {
                if (!validText(jtOrRmPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR,
                            Messages.getString("HadoopClusterForm.check.jtOrRmPrincipal", jtOrRmPrincipalText.getLabelText())); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidPrincipal(jtOrRmPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR,
                            Messages.getString("HadoopClusterForm.check.jtOrRmPrincipal.invalid", jtOrRmPrincipalText.getLabelText())); //$NON-NLS-1$
                    return false;
                }
            }

            if (jobHistoryPrincipalText.getEditable()) {
                if (!validText(jobHistoryPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.jobHistoryPrincipal")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidPrincipal(jobHistoryPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.jobHistoryPrincipal.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (userNameText != null && userNameText.getEditable()) {
                if (!validText(userNameText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.userName")); //$NON-NLS-1$
                    return false;
                }
            }

            if (groupText.getEditable()) {
                if (!validText(groupText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.group")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidGroup(groupText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.group.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (validText(userNameText.getText()) && !HadoopParameterValidator.isValidUserName(userNameText.getText())) {
                updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.userName.invalid")); //$NON-NLS-1$
                return false;
            }

            if (keytabPrincipalText.getEditable()) {
                if (!validText(keytabPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.keytabPrincipal")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidPrincipal(keytabPrincipalText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.keytabPrincipal.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (keytabText.getEditable()) {
                if (!validText(keytabText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.keytab")); //$NON-NLS-1$
                    return false;
                }
            }

            if (maprTPasswordText.getEditable()) {
                if (!validText(maprTPasswordText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTPassword")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidMaprTPassword(maprTPasswordText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTPassword.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (maprTClusterText.getEditable()) {
                if (!validText(maprTClusterText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTCluster")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidMaprTCluster(maprTClusterText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTCluster.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (maprTDurationText.getEditable()) {
                if (!validText(maprTDurationText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTDuration")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode() && !HadoopParameterValidator.isValidMaprTDuration(maprTDurationText.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.check.maprTDuration.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (webHDFSSSLTrustStorePassword.getEditable()) {
                if (!validText(webHDFSSSLTrustStorePassword.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.webHDFS.check.trustStorePassword")); //$NON-NLS-1$
                    return false;
                }
                if (!isContextMode()
                        && !HadoopParameterValidator.isValidWebHDFSSSLTrustStorePassword(webHDFSSSLTrustStorePassword.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.webHDFS.check.trustStorePassword.invalid")); //$NON-NLS-1$
                    return false;
                }
            }

            if (webHDFSSSLTrustStorePath.getEditable()) {
                if (!validText(webHDFSSSLTrustStorePath.getText())) {
                    updateStatus(IStatus.ERROR, Messages.getString("HadoopClusterForm.webHDFS.check.trustStorePath")); //$NON-NLS-1$
                    return false;
                }
            }
            checkServicesBtn.setEnabled(true);
        }
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.swt.widgets.Control#setVisible(boolean)
     */
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        updateForm();
        if (isContextMode()) {
            adaptFormToEditable();
        }
        if (isReadOnly() != readOnly) {
            adaptFormToReadOnly();
        }
        if (visible) {
            updateStatus(getStatusLevel(), getStatus());
        }
    }

    @Override
    protected void collectConParameters() {
        if (!"SPARK".equals(((HadoopClusterConnectionImpl) this.connectionItem.getConnection()).getDistribution())) {
            collectYarnConParameters();
        } else {
            String sparkModeLabelName = sparkModeCombo.getText();
            if (ESparkMode.YARN_CLUSTER.getLabel().equals(sparkModeLabelName)) {
                collectYarnConParameters();
            } else if (ESparkMode.DATABRICKS.getLabel().equals(sparkModeLabelName)) {
                collectDBRParameters();
            } else if (ESparkMode.CDE.getLabel().equals(sparkModeLabelName)) {
                collectCDEParameters();
            } else if (ESparkMode.DATAPROC.getLabel().equals(sparkModeLabelName)) {
                collectDataProcParameters();
            } else if (ESparkMode.KUBERNETES.getLabel().equals(sparkModeLabelName)) {
                collectK8SParameters();
            } else if (ESparkMode.STANDALONE.getLabel().equals(sparkModeLabelName)) {
            	collectStandaloneParameters();
            } else if (ESparkMode.SPARK_SUBMIT.getLabel().equals(sparkModeLabelName)) {
            	collectSparkSubmitScriptParameters();
            } else if (ESparkMode.SYNAPSE.getLabel().equals(sparkModeLabelName)) {
                collectSynapseParameters();
            }
        }
    }

    private void collectK8SParameters() {
        addContextParams(EHadoopParamName.k8sMaster, true);
        addContextParams(EHadoopParamName.k8sInstances, true);
        addContextParams(EHadoopParamName.k8sRegistrySecret, k8sUseRegistrySecret.getSelection());
        addContextParams(EHadoopParamName.k8sImage, true);
        addContextParams(EHadoopParamName.k8sNamespace, true);
        addContextParams(EHadoopParamName.k8sServiceAccount, true);

        String cloudProvider = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_DISTUPLOAD);
        if(EKubernetesBucketCloudProvider.S3.getValue().equals(cloudProvider)) {
            String s3Credentials = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_S3CREDENTIALS);
            if (EKubernetesS3Credentials.ACCESSANDSECRET.getValue().equals(s3Credentials)) {
                addContextParams(EHadoopParamName.k8sS3Bucket, true);
                addContextParams(EHadoopParamName.k8sS3Folder, true);
                addContextParams(EHadoopParamName.k8sS3AccessKey, true);
                addContextParams(EHadoopParamName.k8sS3SecretKey, true);
            }
        } else if (EKubernetesBucketCloudProvider.BLOB.getValue().equals(cloudProvider)) {
            addContextParams(EHadoopParamName.k8sBlobAccount, true);
            addContextParams(EHadoopParamName.k8sBlobContainer, true);
            addContextParams(EHadoopParamName.k8sBlobSecretKey, true);
        } else if (EKubernetesBucketCloudProvider.AZURE.getValue().equals(cloudProvider)) {
            String azureCredentials = getConnection().getParameters().get(ConnParameterKeys.CONN_PARA_KEY_K8S_AZURECREDENTIALS);
            if (EKubernetesAzureCredentials.SECRET.getValue().equals(azureCredentials)) {
                addContextParams(EHadoopParamName.k8sAzureCredentials, true);
                addContextParams(EHadoopParamName.k8sAzureContainer, true);
                addContextParams(EHadoopParamName.k8sAzureSecretKey, true);
            }
        }
    }


    private void collectCDEParameters() {
        addContextParams(EHadoopParamName.CdeApiEndPoint, true);
        addContextParams(EHadoopParamName.CdeToken, true);
        addContextParams(EHadoopParamName.CdeTokenEndpoint, true);
        addContextParams(EHadoopParamName.CdeWorkloadUser, true);
        addContextParams(EHadoopParamName.CdeWorkloadPassword, true);
    }

    private void collectStandaloneParameters() {
        addContextParams(EHadoopParamName.StandaloneMaster, true);
        addContextParams(EHadoopParamName.StandaloneExecutorCore, true);
        addContextParams(EHadoopParamName.StandaloneExecutorMemory, true);
    }
    
    private void collectSparkSubmitScriptParameters() {
    	addContextParams(EHadoopParamName.SparkSubmitScriptHome, true);
    }

    protected void collectDBRParameters() {
        collectConfigurationParameters(true);
    }

    protected void collectDataProcParameters() {
        addContextParams(EHadoopParamName.GoogleProjectId, true);
        addContextParams(EHadoopParamName.GoogleClusterId, true);
        addContextParams(EHadoopParamName.GoogleRegion, true);
        addContextParams(EHadoopParamName.GoogleJarsBucket, true);
        addContextParams(EHadoopParamName.PathToGoogleCredentials, true);
        addContextParams(EHadoopParamName.GoogleOauthToken, true);
    }

    private void collectSynapseParameters() {
        addContextParams(EHadoopParamName.SynapseHostName, true);
        addContextParams(EHadoopParamName.SynapseAuthToken, true);
        addContextParams(EHadoopParamName.SynapseSparkPools, true);
    }

    private void collectConfigurationParameters(boolean isUse) {
        addContextParams(EHadoopParamName.DataBricksEndpoint, isUse);
        addContextParams(EHadoopParamName.DataBricksClusterId, isUse);
        addContextParams(EHadoopParamName.DataBricksToken, isUse);
        addContextParams(EHadoopParamName.DataBricksDBFSDepFolder, isUse);
        addContextParams(EHadoopParamName.DataBricksRuntimeVersion, isUse);
        addContextParams(EHadoopParamName.DataBricksClusterType, isUse);
        addContextParams(EHadoopParamName.DataBricksNodeType, isUse);
        addContextParams(EHadoopParamName.DataBricksDriverNodeType, isUse);
        addContextParams(EHadoopParamName.DataBricksCloudProvider, isUse);
        addContextParams(EHadoopParamName.DatabricksRunMode, isUse);
    }

    protected void collectYarnConParameters() {
        collectConFieldContextParameters(
                isCurrentHadoopVersionSupportYarn() || getConnection().isUseYarn());
        collectWebHDFSSSLContextParameters(useWebHDFSSSLEncryptionBtn.getSelection());
        collectAuthFieldContextParameters(kerberosBtn.getSelection());
        collectKeyTabContextParameters(kerberosBtn.getSelection() && keytabBtn.getSelection());
        collectAuthMaprTFieldContextParameters(maprTBtn.getSelection());
        if (useClouderaNaviBtn != null) {
            collectClouderaNavigatorFieldContextParameters(useClouderaNaviBtn.getSelection());
        }
        collectOverrideHadoopConfsContextParameters();
    }

    private void collectOverrideHadoopConfsContextParameters() {
        // addContextParams(EHadoopParamName.setHadoopConf, true); // not support yet
        addContextParams(EHadoopParamName.hadoopConfSpecificJar, true);
    }

    private void collectClouderaNavigatorFieldContextParameters(boolean clouderaNav) {
        addContextParams(EHadoopParamName.ClouderaNavigatorUsername, clouderaNav);
        addContextParams(EHadoopParamName.ClouderaNavigatorPassword, clouderaNav);
        addContextParams(EHadoopParamName.ClouderaNavigatorUrl, clouderaNav);
        addContextParams(EHadoopParamName.ClouderaNavigatorMetadataUrl, clouderaNav);
        addContextParams(EHadoopParamName.ClouderaNavigatorClientUrl, clouderaNav);
    }

    private void collectConFieldContextParameters(boolean useYarn) {
        addContextParams(EHadoopParamName.NameNodeUri, true);
        addContextParams(EHadoopParamName.JobTrackerUri, !useYarn);
        addContextParams(EHadoopParamName.ResourceManager, useYarn);
        addContextParams(EHadoopParamName.ResourceManagerScheduler, true);
        addContextParams(EHadoopParamName.JobHistory, true);
        addContextParams(EHadoopParamName.StagingDirectory, true);
    }

    private void collectWebHDFSSSLContextParameters(boolean useWebHDFSSSL) {
        addContextParams(EHadoopParamName.WebHDFSSSLTrustStorePath, useWebHDFSSSL);
        addContextParams(EHadoopParamName.WebHDFSSSLTrustStorePassword, useWebHDFSSSL);
    }

    private void collectAuthFieldContextParameters(boolean useKerberos) {
        addContextParams(EHadoopParamName.NameNodePrin, useKerberos);
        addContextParams(EHadoopParamName.JTOrRMPrin, useKerberos);
        addContextParams(EHadoopParamName.JobHistroyPrin, useKerberos);
        addContextParams(EHadoopParamName.User, !useKerberos);
        addContextParams(EHadoopParamName.Group, !useKerberos
                && (isCurrentHadoopVersionSupportGroup() || isCustomUnsupportHasGroup()));
    }

    private void collectKeyTabContextParameters(boolean useKeyTab) {
        addContextParams(EHadoopParamName.Principal, useKeyTab);
        addContextParams(EHadoopParamName.KeyTab, useKeyTab);
    }

    private void collectAuthMaprTFieldContextParameters(boolean useMaprT) {
        addContextParams(EHadoopParamName.maprTPassword, useMaprT);
        addContextParams(EHadoopParamName.maprTCluster, useMaprT);
        addContextParams(EHadoopParamName.maprTDuration, useMaprT);
        addContextParams(EHadoopParamName.maprTHomeDir, useMaprT);
        addContextParams(EHadoopParamName.maprTHadoopLogin, useMaprT);
    }

    @Override
    protected void exportAsContext() {
        super.exportAsContext();
        HadoopConfsUtils.updateContextualHadoopConfs((HadoopClusterConnectionItem) this.connectionItem);
    }

    private List<String> getSparkModes() {
        List<String> sparkModeNames = new ArrayList<String>();
        if (sparkDistribution != null) {
            List<ESparkMode> sparkModes = sparkDistribution.getSparkModes();
            if (sparkModes != null) {
                sparkModeNames = sparkModes.stream().map(mode -> {
                    return mode.getLabel();
                }).collect(Collectors.toList());
            }
        }
        return sparkModeNames;
    }

    private ESparkMode getSparkModeByName(String sparkModeName) {
        if (sparkDistribution != null) {
            List<ESparkMode> supportRunModes = sparkDistribution.getSparkModes();
            for (ESparkMode provider : supportRunModes) {
                if (StringUtils.equals(provider.getLabel(), sparkModeName)) {
                    return provider;
                }
            }
        }
        return ESparkMode.YARN_CLUSTER;
    }

    private ESparkMode getSparkModeByValue(String sparkModeValue) {
        if (sparkDistribution != null) {
            List<ESparkMode> runModes = sparkDistribution.getSparkModes();
            for (ESparkMode runMode : runModes) {
                if (StringUtils.equals(runMode.getValue(), sparkModeValue)) {
                    return runMode;
                }
            }
        }
        return ESparkMode.YARN_CLUSTER;
    }

    private EDatabricksCloudProvider getDatabricksCloudProviderByValue(String providerValue) {
        if (sparkDistribution != null) {
            List<EDatabricksCloudProvider> supportCloudProviders = sparkDistribution.getSupportCloudProviders();
            for (EDatabricksCloudProvider provider : supportCloudProviders) {
                if (StringUtils.equals(provider.getProviderValue(), providerValue)) {
                    return provider;
                }
            }
        }
        return EDatabricksCloudProvider.EMPTY;
    }

    private EDatabricksSubmitMode getDatabricksRunModeByValue(String runModeValue) {
        if (sparkDistribution != null) {
            List<EDatabricksSubmitMode> runModes = sparkDistribution.getRunSubmitMode();
            for (EDatabricksSubmitMode runMode : runModes) {
                if (StringUtils.equals(runMode.getRunModeValue(), runModeValue)) {
                    return runMode;
                }
            }
        }
        return EDatabricksSubmitMode.CREATE_RUN_JOB;
    }

    private EKubernetesSubmitMode getK8sSubmitModeByValue(String runModeValue) {
        if (sparkDistribution != null) {
            List<EKubernetesSubmitMode> runModes = sparkDistribution.getK8sRunSubmitModes();
            for (EKubernetesSubmitMode runMode : runModes) {
                if (StringUtils.equals(runMode.getValue(), runModeValue)) {
                    return runMode;
                }
            }
        }
        return EKubernetesSubmitMode.SPARK_SUBMIT;
    }

    private EKubernetesSubmitMode getK8sSubmitModeByName(String runModeLableName) {
        if (sparkDistribution != null) {
            List<EKubernetesSubmitMode> supportRunModes = sparkDistribution.getK8sRunSubmitModes();
            for (EKubernetesSubmitMode provider : supportRunModes) {
                if (StringUtils.equals(provider.getLabel(), runModeLableName)) {
                    return provider;
                }
            }
        }
        return EKubernetesSubmitMode.SPARK_SUBMIT;
    }

    private EKubernetesBucketCloudProvider getK8sDistUploadByValue(String runModeValue) {
        if (sparkDistribution != null) {
            List<EKubernetesBucketCloudProvider> runModes = sparkDistribution.getK8sCloudProviders();
            for (EKubernetesBucketCloudProvider runMode : runModes) {
                if (StringUtils.equals(runMode.getValue(), runModeValue)) {
                    return runMode;
                }
            }
        }
        return EKubernetesBucketCloudProvider.S3;
    }

    private EKubernetesBucketCloudProvider getK8sDistUploadByName(String runModeLableName) {
        if (sparkDistribution != null) {
            List<EKubernetesBucketCloudProvider> supportRunModes = sparkDistribution.getK8sCloudProviders();
            for (EKubernetesBucketCloudProvider provider : supportRunModes) {
                if (StringUtils.equals(provider.getLabel(), runModeLableName)) {
                    return provider;
                }
            }
        }
        return EKubernetesBucketCloudProvider.S3;
    }

    private EKubernetesS3Credentials getK8sS3CredentialsByValue(String runModeValue) {
        if (sparkDistribution != null) {
            List<EKubernetesS3Credentials> runModes = sparkDistribution.getK8sS3Credentials();
            for (EKubernetesS3Credentials runMode : runModes) {
                if (StringUtils.equals(runMode.getValue(), runModeValue)) {
                    return runMode;
                }
            }
        }
        return EKubernetesS3Credentials.ACCESSANDSECRET;
    }

    private EKubernetesS3Credentials getK8sS3CredentialsByName(String runModeLableName) {
        if (sparkDistribution != null) {
            List<EKubernetesS3Credentials> supportRunModes = sparkDistribution.getK8sS3Credentials();
            for (EKubernetesS3Credentials provider : supportRunModes) {
                if (StringUtils.equals(provider.getLabel(), runModeLableName)) {
                    return provider;
                }
            }
        }
        return EKubernetesS3Credentials.ACCESSANDSECRET;
    }

    private EKubernetesAzureCredentials getK8sAzureCredentialsByValue(String runModeValue) {
        if (sparkDistribution != null) {
            List<EKubernetesAzureCredentials> runModes = sparkDistribution.getK8sAzureCredentials();
            for (EKubernetesAzureCredentials runMode : runModes) {
                if (StringUtils.equals(runMode.getValue(), runModeValue)) {
                    return runMode;
                }
            }
        }
        return EKubernetesAzureCredentials.SECRET;
    }

    private EKubernetesAzureCredentials getK8sAzureCredentialsByName(String runModeLableName) {
        if (sparkDistribution != null) {
            List<EKubernetesAzureCredentials> supportRunModes = sparkDistribution.getK8sAzureCredentials();
            for (EKubernetesAzureCredentials provider : supportRunModes) {
                if (StringUtils.equals(provider.getLabel(), runModeLableName)) {
                    return provider;
                }
            }
        }
        return EKubernetesAzureCredentials.SECRET;
    }

    private EDatabricksCloudProvider getDatabricksCloudProviderByName(String providerLableName) {
        if (sparkDistribution != null) {
            List<EDatabricksCloudProvider> supportCloudProviders = sparkDistribution.getSupportCloudProviders();
            for (EDatabricksCloudProvider provider : supportCloudProviders) {
                if (StringUtils.equals(provider.getProviderLableName(), providerLableName)) {
                    return provider;
                }
            }
        }
        return EDatabricksCloudProvider.EMPTY;
    }

    private String getDatabricksClusterTypeValueByLabel(String labelName) {
        if (EDatabricksClusterType.INTERACTIVE.getLabelName().equals(labelName)) {
            return EDatabricksClusterType.INTERACTIVE.getValue();
        } else if (EDatabricksClusterType.TRANSIENT.getLabelName().equals(labelName)) {
            return EDatabricksClusterType.TRANSIENT.getValue();
        } else {
            return labelName;
        }
    }

    private String getDatabricksClusterTypeLabelByValue(String value) {
        if (EDatabricksClusterType.INTERACTIVE.getValue().equals(value)) {
            return EDatabricksClusterType.INTERACTIVE.getLabelName();
        } else if (EDatabricksClusterType.TRANSIENT.getValue().equals(value)) {
            return EDatabricksClusterType.TRANSIENT.getLabelName();
        } else {
            return value;
        }
    }

    private EDatabricksSubmitMode getDatabricksRunModeByName(String runModeLableName) {
        if (sparkDistribution != null) {
            List<EDatabricksSubmitMode> supportRunModes = sparkDistribution.getRunSubmitMode();
            for (EDatabricksSubmitMode provider : supportRunModes) {
                if (StringUtils.equals(provider.getRunModeLabel(), runModeLableName)) {
                    return provider;
                }
            }
        }
        return EDatabricksSubmitMode.CREATE_RUN_JOB;
    }
}

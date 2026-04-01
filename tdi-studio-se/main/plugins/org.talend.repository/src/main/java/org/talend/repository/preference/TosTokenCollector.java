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
package org.talend.repository.preference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.runtime.model.repository.ERepositoryStatus;
import org.talend.core.model.components.ComponentUtilities;
import org.talend.core.model.general.Project;
import org.talend.core.model.metadata.builder.connection.DatabaseConnection;
import org.talend.core.model.process.IProcess2;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.FolderItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.properties.SQLPatternItem;
import org.talend.core.model.properties.impl.AdditionalInfoMapImpl;
import org.talend.core.model.relationship.Relation;
import org.talend.core.model.relationship.RelationshipItemBuilder;
import org.talend.core.model.repository.DynaEnum;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.core.runtime.maven.MavenArtifact;
import org.talend.core.runtime.maven.MavenUrlHelper;
import org.talend.core.ui.token.AbstractTokenCollector;
import org.talend.core.ui.token.TokenInforUtil;
import org.talend.core.ui.token.TokenKey;
import org.talend.designer.core.model.utils.emf.talendfile.ContextType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementParameterType;
import org.talend.designer.core.model.utils.emf.talendfile.ElementValueType;
import org.talend.designer.core.model.utils.emf.talendfile.NodeType;
import org.talend.designer.core.model.utils.emf.talendfile.ProcessType;
import org.talend.repository.ProjectManager;
import org.talend.repository.RepositoryPlugin;
import org.talend.repository.model.IProxyRepositoryFactory;

import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;

/**
 * ggu class global comment. Detailled comment
 */
public class TosTokenCollector extends AbstractTokenCollector {

    private static final String NB_ROUTE_MS = "nb.route.ms";

	private static final String NB_ROUTE_OSGI = "nb.route.osgi";

	private static final String NB_ROUTERESTDS_APIFILE_MS = "nb.routerestds.apifile.ms";

	private static final String NB_ROUTERESTDS_APIDESIGNER_MS = "nb.routerestds.apidesigner.ms";

	private static final String NB_ROUTERESTDS_APIFILE_OSGI = "nb.routerestds.apifile.osgi";

	private static final String NB_ROUTERESTDS_APIDESIGNER_OSGI = "nb.routerestds.apidesigner.osgi";

	private static final String NB_ROUTERESTDS_BUILTIN_MS = "nb.routerestds.builtin.ms";

	private static final String NB_ROUTERESTDS_BUILTIN_OSGI = "nb.routerestds.builtin.osgi";

	private static final String NB_ROUTESOAPDS_MS = "nb.routesoapds.ms";

	private static final String NB_ROUTESOAPDS_OSGI = "nb.routesoapds.osgi";

	private static final String ROUTE_MICROSERVICE = "ROUTE_MICROSERVICE";

	private static final String ROUTE = "ROUTE";

	private static final String REST_MS = "REST_MS";

	private static final String OSGI = "OSGI";

	private static final String NB_DSREST_APIFILE_MS = "nb.dsrest.apifile.ms";

	private static final String NB_DSREST_APIDESIGNER_MS = "nb.dsrest.apidesigner.ms";

	private static final String NB_DSREST_APIFILE_OSGI = "nb.dsrest.apifile.osgi";

	private static final String NB_DSREST_APIDESIGNER_OSGI = "nb.dsrest.apidesigner.osgi";

	private static final String NB_DSREST_BUILTIN_MS = "nb.dsrest.builtin.ms";

	private static final String NB_DSREST_BUILTIN_OSGI = "nb.dsrest.builtin.osgi";

    private static final String PREF_TOS_JOBS_RECORDS = "TOS_Jobs_Records"; //$NON-NLS-1$

    private static final TokenKey PROJECTS = new TokenKey("projects"); //$NON-NLS-1$

    private static final TokenKey TYPE = new TokenKey("type"); //$NON-NLS-1$

    private static final String TARGET_COMPONENT = "cMessagingEndpoint";

    private static final String NODE_CAMEL_COMPONENTS = "camel.components";

    private static final String NODE_CUSTOM_CAMEL_COMPONENTS = "custom.camel.components";
    
    //data service components used in DI jobs
    private static final List<String> dsComponentsInDIJobs = Arrays.asList("tESBProviderRequest","tRESTRequest");
    
    private static final List<String> tDBComponentNameList = Arrays.asList("tDB2Input", "tDB2Output", "tDB2Connection",
            "tMSSqlInput", "tMSSqlOutput", "tMSSqlConnection", "tMysqlInput", "tMysqlOutput", "tMysqlConnection",
            "tOracleInput", "tOracleOutput", "tOracleConnection", "tPostgresqlInput", "tPostgresqOutput",
            "tPostgresqConnection", "tAmazonAuroraInput", "tAmazonAuroraOutput", "tAmazonAuroraConnection",
            "cSQLConnection");

    private static final List<String> JDBCComponentNameList = Arrays.asList("tDeltaLakeInput","tDeltaLakeConnection","tDeltaLakeOutput",
            "tJDBCInput","tJDBCOutput","tJDBCConnection","tSingleStoreInput","tSingleStoreOutput","tSingleStoreConnection");
    /**
     * ggu JobTokenCollector constructor comment.
     */
    public TosTokenCollector() {
    }

    @Override
    public void priorCollect() throws Exception {
        // for all projects
        JSONObject allProjectRecords = null;

        IPreferenceStore preferenceStore = RepositoryPlugin.getDefault().getPreferenceStore();
        String records = preferenceStore.getString(PREF_TOS_JOBS_RECORDS);
        try {
            // reset
            allProjectRecords = new JSONObject(records);
        } catch (Exception e) {
            // the value is not set, or is empty
            allProjectRecords = new JSONObject();
        }

        JSONObject currentProjectObject = collectProjectDetails();

        Project currentProject = ProjectManager.getInstance().getCurrentProject();
        allProjectRecords.put(currentProject.getTechnicalLabel(), currentProjectObject);

        //
        preferenceStore.setValue(PREF_TOS_JOBS_RECORDS, allProjectRecords.toString());
    }

    private JSONObject collectProjectDetails() throws PersistenceException, JSONException {
        JSONObject jObject = new JSONObject();

        Project currentProject = ProjectManager.getInstance().getCurrentProject();
        final IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

        JSONObject repoStats = new JSONObject();
        // metadata
        Integer nbdssoap = 0;
        for (DynaEnum type : ERepositoryObjectType.values()) {
            if (type instanceof ERepositoryObjectType && ((ERepositoryObjectType) type).isResourceItem()) {
                try {
                    List<IRepositoryViewObject> all = factory.getAll(currentProject, (ERepositoryObjectType) type);

                    int nb = all.size();
                    if (ERepositoryObjectType.TDQ_INDICATOR_ELEMENT.equals(type)
                            || ERepositoryObjectType.TDQ_PATTERN_ELEMENT.equals(type)
                            || ERepositoryObjectType.TDQ_RULES.equals(type) || "TDQ_SOURCE_FILE_ELEMENT".equals(type.getType())) { //$NON-NLS-1$
                        continue;
                    }
                    if (ERepositoryObjectType.ROUTINES.equals(type)) {
                        nb = 0;
                        List<IRepositoryViewObject> newList = new ArrayList<IRepositoryViewObject>();
                        for (IRepositoryViewObject object : all) {
                            RoutineItem rItem = (RoutineItem) object.getProperty().getItem();
                            if (!rItem.isBuiltIn()) {
                                nb++;
                                newList.add(object);
                            }
                        }
                        all = newList;
                    }
                    if (ERepositoryObjectType.SQLPATTERNS.equals(type)) {
                        nb = 0;
                        for (IRepositoryViewObject object : all) {
                            SQLPatternItem spItem = (SQLPatternItem) object.getProperty().getItem();
                            if (!spItem.isSystem()) {
                                nb++;
                            }
                        }
                    }
                    if ("MDM.DataModel".equals(type.getType())) { //$NON-NLS-1$
                        nb = 0;
                        for (IRepositoryViewObject object : all) {
                            String path = object.getProperty().getItem().getState().getPath();
                            if (!"System".equals(path)) { //$NON-NLS-1$
                                nb++;
                            }
                        }
                    }
                    if (nb > 0) {
                        JSONObject typeStats = new JSONObject();
                        typeStats.put("nb", nb); //$NON-NLS-1$
                        if (ERepositoryObjectType.getAllTypesOfProcess().contains(type)) {
                            JSONObject jobDetails = new JSONObject();
                            collectJobDetails(all, jobDetails, type);
                            
                            if (ERepositoryObjectType.PROCESS.equals(type)) {
                                typeStats.put("nbwithoutds", jobDetails.get("nbwithoutds")); //$NON-NLS-1$
                                jobDetails.remove("nbwithoutds"); //$NON-NLS-1$
                                typeStats.put("nbds", jobDetails.get("nbds")); //$NON-NLS-1$                                
                                jobDetails.remove("nbds"); //$NON-NLS-1$
                                nbdssoap = (Integer)jobDetails.get("nbdssoap"); //$NON-NLS-1$
                                jobDetails.remove("nbdssoap"); //$NON-NLS-1$
                                
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_BUILTIN_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_BUILTIN_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_APIDESIGNER_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_APIFILE_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_APIDESIGNER_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_DSREST_APIFILE_MS);
                            }else if (ERepositoryObjectType.PROCESS_ROUTE.equals(type)) {
                            	removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTESOAPDS_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTESOAPDS_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_BUILTIN_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_BUILTIN_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_APIDESIGNER_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_APIFILE_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_APIDESIGNER_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTERESTDS_APIFILE_MS);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTE_OSGI);
                                removeUnwantedNodeFromjobDetails(typeStats, jobDetails, NB_ROUTE_MS);
                            }
                           
                            typeStats.put("details", jobDetails); //$NON-NLS-1$
                        }
                        
                        if (ERepositoryObjectType.ROUTINES.equals(type)
                                || ((ERepositoryObjectType) type).getFolder().startsWith("metadata/") //$NON-NLS-1$
                                || ERepositoryObjectType.CONTEXT.equals(type) || type.equals(ERepositoryObjectType.JOBLET)) {
                            int nbUsed = 0;
                            for (IRepositoryViewObject object : all) {
                                List<Relation> relations = RelationshipItemBuilder.getInstance().getItemsHaveRelationWith(
                                        object.getId());
                                relations.addAll(RelationshipItemBuilder.getInstance()
                                        .getItemsHaveRelationWith(object.getLabel()));
                                if (relations.size() > 0) {
                                    nbUsed++;
                                }
                            }
                            typeStats.put("nb.used", nbUsed); //$NON-NLS-1$
                        }
                        if (ERepositoryObjectType.METADATA_CONNECTIONS.equals(type)) {
                            JSONObject objects = new JSONObject();
                            for (IRepositoryViewObject object : all) {
                                DatabaseConnectionItem item = (DatabaseConnectionItem) object.getProperty().getItem();
                                String dbType = ((DatabaseConnection) item.getConnection()).getDatabaseType();
                                int nbDbTypes = 1;
                                if (objects.has(dbType)) {
                                    nbDbTypes = objects.getInt(dbType);
                                    nbDbTypes++;
                                }
                                objects.put(dbType, nbDbTypes);
                            }
                            typeStats.put("types", objects); //$NON-NLS-1$
                        }
                        repoStats.put(type.getType(), typeStats);
                    }
                } catch (Exception e) {
                    ExceptionHandler.process(e);
                }
            }
        }
        if(repoStats.has("SERVICES")) {
        	JSONObject serviceJson = (JSONObject)repoStats.get("SERVICES");
        	serviceJson.put("nbdssoap", nbdssoap);
        }
        jObject.put(PROJECTS.getKey(), repoStats); //$NON-NLS-1$
        jObject.put(TYPE.getKey(), ProjectManager.getInstance().getProjectType(currentProject));
        int nbRef = ProjectManager.getInstance().getAllReferencedProjects().size();
        if (nbRef > 0) {
            jObject.put("nb.refProjects", nbRef);
        }

        return jObject;
    }

    private void addCountInComponent(String key, JSONObject component_names) throws JSONException {
        if (component_names.has(key)) {
            component_names.put(key,
                    ((Integer) component_names.get(key)) + 1);
        } else {
            component_names.put(key, 1);
        }
    }
    
    private void removeUnwantedNodeFromjobDetails(JSONObject typeStats, JSONObject jobDetails, String key) throws JSONException {
		if(jobDetails.has(key)) {
			typeStats.put(key, jobDetails.get(key)); //$NON-NLS-1$
			jobDetails.remove(key); //$NON-NLS-1$
		}
	}
    
    @SuppressWarnings("unchecked")
    private void extractBuildTypeData(NodeType node, Item item, String itemID, String componentName, 
    		Set<String> checkedItemSet, Map<String, Integer> buildTypeDetails, Set<String> componentNamesList) {

    	List<AdditionalInfoMapImpl> properties = item.getProperty().getAdditionalProperties();
    	boolean isItemChecked = false;
    	boolean buildTypeIsPresent = false;
    	String buildType = null;

    	for (AdditionalInfoMapImpl property : properties) {

    		String buildTypeKey = property.getKey().toString();
    		String buildTypeValue = property.getValue().toString();

    		if("BUILD_TYPE".equals(buildTypeKey) && null != buildTypeValue) {
    			buildType = buildTypeValue;
    			buildTypeIsPresent = true;
    			break;
    		}
    	}

    	String nodeType = ComponentUtilities.getNodePropertyValue(node, "PROPERTY:PROPERTY_TYPE"); //$NON-NLS-1$
    	String apiID = ComponentUtilities.getNodePropertyValue(node, "API_ID"); //$NON-NLS-1$

    	// decide build type for Job/Route
    	// if build type is missing then it is treated as OSGI type i.e. for JOB buildType = OSGI and for Route buildType = ROUTE
    	// for Microservice if buildType is missing then it will treated as OSGI type always 
    	if(!buildTypeIsPresent || null==buildType) {
    		if (componentName.startsWith("t")) {
    			// if Build type is not present then treat this job as OSGI
    			buildType = OSGI;
    		}else if (componentName.startsWith("c")){
    			// if Build type is not present then treat this Route as OSGI
    			buildType = ROUTE;
    		}
    	}

    	if(null != buildType) {
    		if (componentNamesList.contains("tRESTRequest")) {
    			extractDataWhenItemHastRESTRequest(buildTypeDetails, buildType, nodeType, apiID);
    			isItemChecked =true;
    		} else if(componentNamesList.contains("cSOAP")) {
    			extractDataWhenItemHascSOAP(buildTypeDetails, buildType);
    			isItemChecked =true;
    		}else if(componentNamesList.contains("cREST")) {
    			extractDataWhenItemHascREST(buildTypeDetails, buildType, nodeType, apiID);
    			isItemChecked =true;
    		}else if(!componentNamesList.contains("cSOAP") && !componentNamesList.contains("cREST")  && !checkedItemSet.contains(itemID)) {
    			extractDataForRouteWithoutcRESTorcSOAP(buildTypeDetails, buildType);
    			isItemChecked =true;
    		}
    	}

    	if(isItemChecked) {
    		checkedItemSet.add(itemID);
    	}
    }

    private void extractDataForRouteWithoutcRESTorcSOAP(Map<String, Integer> buildTypeDetails, String buildType) {
    	// nb of jobs which doesn't contains cSOAP or cREST components
    	if(buildType.equals(ROUTE)) {
    		// nb routes without cSOAP or cREST as producer where build type = OSGI
    		String key = NB_ROUTE_OSGI;
    		buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    	}else if(buildType.equals(ROUTE_MICROSERVICE)) {
    		// nb routes without cSOAP or cREST as producer where build type = Microservice
    		String key = NB_ROUTE_MS;
    		buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    	}
    }

    private void extractDataWhenItemHascREST(Map<String, Integer> buildTypeDetails, String buildType, String nodeType, String apiID) {
    	if(null == nodeType || !nodeType.equals("REPOSITORY")) {
    		if(buildType.equals(ROUTE)) {
    			// nb routes with cREST as producer where build type = OSGI and API definition = Built-in
    			String key = NB_ROUTERESTDS_BUILTIN_OSGI;
    			buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		}else if(buildType.equals(ROUTE_MICROSERVICE)) {
    			// nb routes with cREST as producer where build build type = Microservice and API definition = Built-in
    			String key = NB_ROUTERESTDS_BUILTIN_MS;
    			buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		}
    	}else if(null != nodeType && nodeType.equals("REPOSITORY")){
    		// when API Definition = Repository
    		if(buildType.equals(ROUTE)) {
    			if(null!=apiID && !apiID.isEmpty()) {
    				// nb routes with cREST as producer where build type is = OSGI and API definition is = imported from API Designer
    				String key = NB_ROUTERESTDS_APIDESIGNER_OSGI;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}else {
    				// nb routes with cREST as producer where build type is = OSGI and API definition is = imported from local file
    				String key = NB_ROUTERESTDS_APIFILE_OSGI;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}
    		}else if(buildType.equals(ROUTE_MICROSERVICE)) {
    			if(null!=apiID && !apiID.isEmpty()) {
    				// nb routes with cREST as producer where build type is  = Microservice and API definition is = imported from API Designer
    				String key = NB_ROUTERESTDS_APIDESIGNER_MS;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}else {
    				// nb routes with cREST as producer where build type is = Microservice and API definition is = imported from local file
    				String key = NB_ROUTERESTDS_APIFILE_MS;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}
    		}
    	}
    }

    private void extractDataWhenItemHascSOAP(Map<String, Integer> buildTypeDetails, String buildType) {
    	if(buildType.equals(ROUTE)) {
    		// nb routes with cSOAP as producer where build type = OSGI
    		String key = NB_ROUTESOAPDS_OSGI;
    		buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		//break;
    	}else if(buildType.equals(ROUTE_MICROSERVICE)) {
    		// nb routes with cSOAP as producer where build type = Microservice
    		String key = NB_ROUTESOAPDS_MS;
    		buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		//break;
    	}
    }

    private void extractDataWhenItemHastRESTRequest(Map<String, Integer> buildTypeDetails, String buildType,
    		String nodeType, String apiID) {
    	if(null == nodeType || !nodeType.equals("REPOSITORY")) {
    		// when API Definition = built-in
    		if(buildType.equals(OSGI)) {
    			// nb jobs with tRESTRequest where build type is = OSGI and API definition is = Built-in
    			String key = NB_DSREST_BUILTIN_OSGI;
    			buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		}else if(buildType.equals(REST_MS)) {
    			//nb jobs with tRESTRequest where build type is = Microservice and API definition is = Built-in
    			String key = NB_DSREST_BUILTIN_MS;
    			buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    		}
    	}else if(null != nodeType && nodeType.equals("REPOSITORY")){
    		// when API Definition = Repository
    		if(buildType.equals(OSGI)) {
    			if(null!=apiID && !apiID.isEmpty()) {
    				// nb jobs with tRESTRequest where build type is = OSGI and API definition is = imported from API Designer
    				String key = NB_DSREST_APIDESIGNER_OSGI;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}else {
    				// nb jobs with tRESTRequest where build type is = OSGI and API definition is = imported from local file
    				String key = NB_DSREST_APIFILE_OSGI;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}
    		}else if(buildType.equals(REST_MS)) {
    			if(null!=apiID && !apiID.isEmpty()) {
    				//nb jobs with tRESTRequest where build type is = Microservice and API definition is = imported from API Designer
    				String key = NB_DSREST_APIDESIGNER_MS;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}else {
    				// nb jobs with tRESTRequest where build type is = Microservice and API definition is = imported from local file
    				String key = NB_DSREST_APIFILE_MS;
    				buildTypeDetails.put(key, null!=buildTypeDetails.get(key) ? buildTypeDetails.get(key)+1 : 1);
    			}
    		}
    	}
    }
    
    /**
     * DOC nrousseau Comment method "collectJobDetails".
     *
     * @param all
     * @param jobDetails
     * @param type
     * @throws JSONException
     */
    @SuppressWarnings("unchecked")
    private void collectJobDetails(List<IRepositoryViewObject> allRvo, JSONObject jobDetails, DynaEnum type)
            throws JSONException {
        IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();
        IWorkbenchWindow ww = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IEditorReference[] reference = new IEditorReference[0];
        if (ww != null) {
            IWorkbenchPage page = ww.getActivePage();
            reference = page.getEditorReferences();
        }
        List<IProcess2> processes = RepositoryPlugin.getDefault().getDesignerCoreService().getOpenedProcess(reference);
        Set<String> idsOpened = new HashSet<String>();
        for (IProcess2 process : processes) {
            idsOpened.add(process.getId());
        }

        JSONArray components = new JSONArray();

        int contextVarsNum = 0;
        int nbComponentsUsed = 0;
        int pureDIJobs = 0; // nb of PROCESS without (tESBProviderRequest, tRESTRequest)
        List<String> soapWsdlWithImpl = new ArrayList<String>();
        int restJobInDIJob = 0;
        Map<String, JSONObject> camelComponentMap = new HashMap<>();
        Map<String, JSONObject> customCamelComponentMap = new HashMap<>();
        Map<String,Integer> buildTypeDetails = new HashMap<String,Integer>();
        Set<String> checkedIteSetForBuildTypes = new HashSet<String>();
        for (IRepositoryViewObject rvo : allRvo) {
            Item item = rvo.getProperty().getItem();
            String itemID = ((ProcessItem) item).getProperty().getId();
            if (item instanceof ProcessItem) {
                boolean has_tRestRequest = false;
                boolean has_tESBProviderRequest = false;
                boolean has_tESBProviderRequest_Or_tRESTRequest = false;
                ProcessType processType = ((ProcessItem) item).getProcess();
                List<NodeType> nodeTypeList = (List<NodeType>) processType.getNode();
                Set<String> componentNamesList = new HashSet<String>();
                for (NodeType node : nodeTypeList) {
                	componentNamesList.add(node.getComponentName());
                }
                for (NodeType node : nodeTypeList) {
                    JSONObject component_names = null;
                    String componentName = node.getComponentName();
                    int nbComp = 0;
                    for(int i = 0;i<components.length();i++){
                        JSONObject temp = components.getJSONObject(i);
                        if(temp.get("component_name").equals(componentName)){//$NON-NLS-1$
                           nbComp = temp.getInt("count");//$NON-NLS-1$
                           component_names = temp;
                           break;
                        }
                    }
                     if(component_names == null){
                         component_names = new JSONObject();
                         components.put(component_names);
                    }
                    component_names.put("component_name", componentName);
                    component_names.put("count", nbComp + 1);

                    extractRuntimeFeature(node, component_names, componentName);
                    if(!checkedIteSetForBuildTypes.contains(itemID)) {
                    	extractBuildTypeData(node, item, itemID, componentName, checkedIteSetForBuildTypes, buildTypeDetails, componentNamesList);
                    }
                    
                    if (dsComponentsInDIJobs.contains(componentName)) {
                        has_tESBProviderRequest_Or_tRESTRequest = true;
                        if ("tRESTRequest".equals(componentName) && !has_tRestRequest) {
                            // More than one tRESTRequest will cause compile error, but save operation is allowed. So give a double check here.
                            has_tRestRequest = true;
                            
                            restJobInDIJob++;
                        } 
                        if ("tESBProviderRequest".equals(componentName) && !has_tESBProviderRequest) {
                           // More than one tESBProviderRequest will cause compile error, but save operation is allowed. So give a double check here.
                            has_tESBProviderRequest = true;
                            
                            EList elementParameter = node.getElementParameter();
                            for (Object obj : elementParameter) {
                                if (obj instanceof ElementParameterType) {
                                    ElementParameterType ep = (ElementParameterType) obj;
                                    if (ep.getName().equalsIgnoreCase("PROPERTY:REPOSITORY_PROPERTY_TYPE")) {
                                        String value = ep.getValue();
                                        // get serviceId from "serviceId - portId - operationId"
                                        String serviceId = value.substring(0, value.indexOf(" - "));
                                        if (!soapWsdlWithImpl.contains(serviceId)) {
                                            soapWsdlWithImpl.add(serviceId);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    
                    if (TARGET_COMPONENT.equals(componentName)
                            && (type == ERepositoryObjectType.PROCESS_ROUTE || type == ERepositoryObjectType.PROCESS_ROUTELET)) {

                        JSONArray camelComponentsArray = component_names.has(NODE_CAMEL_COMPONENTS)
                                ? component_names.getJSONArray(NODE_CAMEL_COMPONENTS)
                                : new JSONArray();
                        component_names.put(NODE_CAMEL_COMPONENTS, camelComponentsArray);
                        JSONArray customCamelComponentsArray = component_names.has(NODE_CUSTOM_CAMEL_COMPONENTS)
                                ? component_names.getJSONArray(NODE_CUSTOM_CAMEL_COMPONENTS)
                                : new JSONArray();
                        component_names.put(NODE_CUSTOM_CAMEL_COMPONENTS, customCamelComponentsArray);
                        
                        String library = "";
                        String useLibrary = "";
                        EList elementParameter = node.getElementParameter();
                        for (Object obj : elementParameter) {
                            if (obj instanceof ElementParameterType) {
                                ElementParameterType ep = (ElementParameterType) obj;
                                if (ep.getName().equalsIgnoreCase("HOTLIBS")) {
                                    EList elementValue = ep.getElementValue();
                                    for (Object ob : elementValue) {
                                        String value = ((ElementValueType) ob).getValue();
                                        record(camelComponentsArray, camelComponentMap, value.toLowerCase());
                                    }
                                } else if (ep.getName().equalsIgnoreCase("LIBRARY")) {
                                    library = ep.getValue();
                                } else if (ep.getName().equalsIgnoreCase("USE_CUSTOM_COMPONENT")) {
                                    useLibrary = ep.getValue();
                                }
                            }
                        }

                        if (Boolean.toString(true).equalsIgnoreCase(useLibrary) && !library.isEmpty()) {
                            library = uncloakQuotation(library);
                            MavenArtifact artifact = null;
                            try {
                                artifact = MavenUrlHelper.parseMvnUrl(library);
                            } catch (Exception e) {
                            }

                            if (artifact != null) {
                                String fileName = artifact.getFileName();
                                record(customCamelComponentsArray, customCamelComponentMap, fileName);
                            }
                        }
                    }
                    nbComponentsUsed++;
                }
                // context variable per job
                EList contexts = processType.getContext();
                if (contexts.size() > 0) {
                    ContextType contextType = (ContextType) contexts.get(0);
                    contextVarsNum += contextType.getContextParameter().size();
                }
                if (!has_tESBProviderRequest_Or_tRESTRequest) {
                    pureDIJobs++;
                }
            }
            

            if (factory.getStatus(item) != ERepositoryStatus.LOCK_BY_USER && !idsOpened.contains(item.getProperty().getId())) {
                // job is not locked and not opened by editor, so we can unload.
                if (item.getParent() instanceof FolderItem) {
                    ((FolderItem) item.getParent()).getChildren().remove(item);
                    item.setParent(null);
                }
                item.eResource().unload();
            }
        }
        camelComponentMap.clear();
        customCamelComponentMap.clear();

        jobDetails.put("components", components);
        jobDetails.put("nb.contextVars", contextVarsNum);
        jobDetails.put("nb.components", nbComponentsUsed);
        if (ERepositoryObjectType.PROCESS.equals(type)) {
            // will be moved to upper hierarchy：/projects.repository/PROCESS/nbwithoutds
            jobDetails.put("nbwithoutds", pureDIJobs);
            // nb of Data Services: 
            // (nb PROCESS with (tRESTRequest)) + (nb Services (SOAP WSDL) with at least one operation implemented as job with tESBProviderRequest)
            jobDetails.put("nbds", restJobInDIJob + soapWsdlWithImpl.size());
            // nb Services (SOAP WSDL) with at least one operation implemented as job with tESBProviderRequest
            jobDetails.put("nbdssoap", soapWsdlWithImpl.size());
        }
    // put build type data
        for(Map.Entry<String,Integer> entry : buildTypeDetails.entrySet()){
            jobDetails.put(entry.getKey(), entry.getValue());
        }
    }

    private void extractRuntimeFeature(NodeType node, JSONObject component_names, String componentName)
            throws JSONException {
        if (tDBComponentNameList.contains(componentName)) { 
            EList elementParameter = node.getElementParameter();
            for (Object obj : elementParameter) {
                if (obj instanceof ElementParameterType) {
                    ElementParameterType ep = (ElementParameterType) obj;
                    if ((ep.getName().equals("SPECIFY_DATASOURCE_ALIAS")
                            || (componentName.equals("cSQLConnection")
                                    && ep.getName().equals("USE_DATA_SOURCE_ALIAS"))) && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_datasource_alias", component_names);
                    }
                }
            }
        }
        
        if (JDBCComponentNameList.contains(componentName)) {
            EList elementParameter = node.getElementParameter();
            for (Object obj : elementParameter) {
                if (obj instanceof ElementParameterType) {
                    ElementParameterType ep = (ElementParameterType) obj;
                    if ((ep.getName().equals("PROPERTIES"))) {
                        JSONObject properties = new JSONObject(ep.getValue());
                        JSONObject useDs = (JSONObject) properties.get("useDataSource");
                        JSONObject storedValue = (JSONObject) useDs.get("storedValue");
                        Object value = storedValue.get("value");
                        if(value.equals(true)) {
                            addCountInComponent("count_use_datasource_alias", component_names);
                        }
                    }
                }
            }
        }
        // Runtime feature count
        if (Arrays.asList("cREST", "tRESTRequest", "tRESTClient", "cSOAP", "tESBConsumer").contains(componentName)) {
            EList elementParameter = node.getElementParameter();
            boolean useAuthentication = false;
            for (Object obj : elementParameter) {
                if (obj instanceof ElementParameterType) {
                    ElementParameterType ep = (ElementParameterType) obj;
                    if (!ep.isShow()) {
                        continue;
                    }
                    // check if service locator is used 
                    if ((ep.getName().equals("SERVICE_LOCATOR") || ep.getName().equals("ENABLE_SL")) && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_service_locator", component_names);
                    }
                    
                    // check if service registry is used
                    if ((ep.getName().equals("ENABLE_REGISTRY") || ep.getName().equals("USE_SR"))
                            && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_service_registry", component_names);
                    }
                    // check if service activity monitoring is used
                    if ((ep.getName().equals("SERVICE_ACTIVITY_MONITOR") || ep.getName().equals("ENABLE_SAM"))
                            && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_service_activity_monitoring", component_names);
                    }
                    // check if authentication is used.
                    if ((ep.getName().equals("ENABLE_SECURITY") || ep.getName().equals("NEED_AUTH"))
                            && ep.getValue().equals("true")) {
                        useAuthentication = true;
                    }
                    // get authentication type
                    if (useAuthentication
                            && (ep.getName().equals("SECURITY_TYPE") || ep.getName().equals("AUTH_TYPE"))) {
                        if (ep.getValue().equals("SAML")) {
                            addCountInComponent("count_use_authent_SAML_token", component_names);
                        }
                        
                        if (ep.getValue().equals("BASIC")) {
                            addCountInComponent("count_use_authent_http_basic", component_names);
                        }
                        // check if use authent Open ID connect is used
                        if (ep.getValue().equals("OIDC") || ep.getValue().equals("OIDC_PASSWORD_GRANT")) {
                            addCountInComponent("count_use_authent_Open_ID_connect", component_names);
                        }
                        
                        if(ep.getValue().equals("OAUTH2_BEARER")) {
                            addCountInComponent("count_use_OAuth2_Bearer", component_names);
                        }
                        
                        if(ep.getValue().equals("HTTP Digest") || ep.getValue().equals("DIGEST")) {
                            addCountInComponent("count_use_authent_http_digest", component_names);
                        }
                        
                        if (ep.getValue().equals("USER") || ep.getValue().equals("TOKEN")) {
                            addCountInComponent("count_use_authent_UsernameToken", component_names);
                        }
                    }
                    
                    if ((ep.getName().equals("USE_AUTHORIZATION") || ep.getName().equals("NEED_AUTHORIZATION"))
                            && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_authorization", component_names);
                    }
                    // check if use business correlation is checked
                    if ((ep.getName().equals("ENABLE_CORRELATION") || ep.getName().equals("USE_BUSINESS_CORRELATION"))
                            && ep.getValue().equals("true")) {
                        addCountInComponent("count_use_business_correlation", component_names);
                    }
                }
            }
        }
    }

    private void record(JSONArray componentsArray, Map<String, JSONObject> camelComponentMap, String component) {
        try {
            JSONObject json = camelComponentMap.containsKey(component) ? camelComponentMap.get(component)
                    : new JSONObject();
            for (int i = 0; i < componentsArray.length(); i++) {
                if (componentsArray.get(i) == json) {
                    componentsArray.remove(i);
                    break;
                }
            }

            int num = json.has(component) ? json.getInt(component) : 0;
            json.put(component, num + 1);
            camelComponentMap.put(component, json);
            componentsArray.put(json);

        } catch (JSONException e) {
            ExceptionHandler.process(e);
        }
    }

    private String uncloakQuotation(String mvnUrlWithQuotation) {
        int index = 0, lastIndex = mvnUrlWithQuotation.length() - 1;
        for (int i = 0; i < mvnUrlWithQuotation.length(); i++) {
            char charAt = mvnUrlWithQuotation.charAt(i);
            if (charAt != '\"' && charAt != '\'') {
                index = i;
                break;
            }
        }

        for (int i = mvnUrlWithQuotation.length() - 1; i >= 0; i--) {
            char charAt = mvnUrlWithQuotation.charAt(i);
            if (charAt != '\"' && charAt != '\'') {
                lastIndex = i;
                break;
            }
        }

        return mvnUrlWithQuotation.substring(index, lastIndex + 1);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.talend.core.ui.token.AbstractTokenCollector#collect()
     */
    @Override
    public JSONObject collect() throws Exception {
        JSONObject finalToken = new JSONObject();
        JSONObject mergedData = new JSONObject();

        IPreferenceStore preferenceStore = RepositoryPlugin.getDefault().getPreferenceStore();
        String records = preferenceStore.getString(PREF_TOS_JOBS_RECORDS);
        JSONObject allProjectRecords = null;
        try {
            // reset
            allProjectRecords = new JSONObject(records);
        } catch (Exception e) {
            // the value is not set, or is empty
            allProjectRecords = new JSONObject();
        }

        Iterator<String> keys = allProjectRecords.keys();
        JSONObject projectTypes = new JSONObject();
        while (keys.hasNext()) {
            String projectName = keys.next();
            JSONObject object = (JSONObject) allProjectRecords.get(projectName);
            if (object != null) {
                TokenInforUtil.mergeJSON(object, mergedData);
                if (object.has(TYPE.getKey())) {
                    String type = object.getString(TYPE.getKey());
                    // count the number of project for each type
                    if (!projectTypes.has(type)) {
                        projectTypes.put(type, 1);
                    } else {
                        int nb = projectTypes.getInt(type);
                        nb++;
                        projectTypes.put(type, nb);
                    }
                }
            }
        }
        if (mergedData.has(PROJECTS.getKey())) {
            finalToken.put(PROJECTS_REPOSITORY.getKey(), mergedData.get(PROJECTS.getKey()));
        }
        finalToken.put("projects.type", projectTypes);
        return finalToken;
    }
}

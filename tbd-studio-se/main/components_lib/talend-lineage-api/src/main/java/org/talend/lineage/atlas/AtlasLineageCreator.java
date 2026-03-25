package org.talend.lineage.atlas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;

import org.apache.atlas.AtlasServiceException;
import org.apache.atlas.model.instance.AtlasEntity.AtlasEntityWithExtInfo;
import org.apache.atlas.model.instance.AtlasObjectId;
import org.apache.atlas.model.typedef.AtlasTypesDef;
import org.apache.atlas.v1.typesystem.types.utils.TypesUtil;
import org.talend.lineage.common.AbstractLineageCreator;
import org.talend.lineage.common.ILineageCreator;

public class AtlasLineageCreator extends AbstractLineageCreator implements ILineageCreator {

    private static final org.apache.log4j.Logger LOG  = org.apache.log4j.Logger.getLogger(AtlasLineageCreator.class);

    @Nullable
    private AtlasEntityWithExtInfo jobEntity;

    private List<AtlasEntityWithExtInfo> entities = new ArrayList<>();

    // only for testing / debugging purposes
    // the get re-initialized on each invocation of sendToLineageProvider
    private Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedComponents;

    private Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedArtificialComponents;

    private Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedJobs;

    private final TalendAtlasClient client;

    /**
     *
     * @param url
     * @param login
     * @param password
     */
    public AtlasLineageCreator(final String url, String login, String password) {
        this.client = new TalendAtlasClient(url, login, password);
    }

    @Override
    public void addJobInfo(Map<String, Object> jobMetadata) {
        Map<String, Object> values = new HashMap<>();

        values.put("name", jobMetadata.containsKey("name") ? jobMetadata.get("name").toString() : "Talend Job");
        values.put("qualifiedName", jobMetadata.containsKey("name") ?
                jobMetadata.get("name").toString() + " [" + UUID.randomUUID().toString() + "]" :
                "Talend Job" + " [" + UUID.randomUUID().toString() + "]");

        values.put("description",
                jobMetadata.containsKey("description") ? jobMetadata.get("description").toString() : "Talend Job");
        values.put("purpose", jobMetadata.containsKey("purpose") ? jobMetadata.get("purpose").toString() : "Talend Job");
        values.put("author", jobMetadata.containsKey("author") ? jobMetadata.get("author").toString() : "Talend");
        values.put("version", jobMetadata.containsKey("version") ? jobMetadata.get("version").toString() : "");
        values.put("jobType", jobMetadata.containsKey("jobType") ? jobMetadata.get("jobType").toString() : "");
        values.put("framework", jobMetadata.containsKey("framework") ? jobMetadata.get("framework").toString() : "");
        values.put("status", jobMetadata.containsKey("status") ? jobMetadata.get("status").toString() : "FINISHED");

        long creationTime = 0;
        long lastModificationTime = 0;
        long startTime = 0;
        long endTime = 0;

        try {
            if (jobMetadata.containsKey("creationTime")) {
                creationTime = Long.parseLong(jobMetadata.get("creationTime").toString().trim());
            }
            if (jobMetadata.containsKey("lastModificationTime")) {
                lastModificationTime = Long.parseLong(jobMetadata.get("lastModificationTime").toString().trim());
            }
            if (jobMetadata.containsKey("startTime")) {
                startTime = Long.parseLong(jobMetadata.get("startTime").toString().trim());
            }
            if (jobMetadata.containsKey("endTime")) {
                endTime = Long.parseLong(jobMetadata.get("endTime").toString().trim());
            }
        } catch (NumberFormatException nfe) {
            // Nothing
        }

        values.put("creationTime", creationTime);
        values.put("lastModificationTime", lastModificationTime);
        values.put("startTime", startTime);
        values.put("endTime", endTime);

        // Notice that the job components are not put in creation, since we don't have
        // the ids of the components yet, it is sendToLineageProvider who does it
        this.jobEntity = TalendModelFactory.buildTalendJob(values);

    }

    @Override
    public void addNodeToLineage(final String name, final Map<String, String> schema, final List<String> inputNodes,
            final List<String> outputNodes, final Map<String, Object> metadata) {
        // Do not create lineage nodes for components with empty schemas (tConfiguration, ...)
        if (schema.size() > 0) {
            AtlasEntityWithExtInfo entity = TalendModelFactory.buildTalendComponent(name, schema, metadata, inputNodes, outputNodes);
            this.entities.add(entity);
        }
    }

    @Override
    public void sendToLineageProvider(final Boolean dieOnError) {
        try {
            // First we persist the instances
            Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedArtificialInstances = persistWithArtificialComponents(this.entities);
            // then with the ids we persist the job info
            if (jobEntity != null) {
                List<AtlasObjectId> instancesIds = new ArrayList<>();
                // Notice that we don't add the artificial instances to avoid
                // type + visualization problems
                for (TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId> pair : this.persistedComponents.values()) {
                    instancesIds.add(pair.right);
                }
                jobEntity.getEntity().setAttribute("components", instancesIds);

                AtlasObjectId jobEntityId = client.persistInstanceWithLog(jobEntity);
                String jobName = (String) jobEntity.getEntity().getAttribute("name");
                this.persistedJobs = new HashMap<>();
                this.persistedJobs.put(jobName, TypesUtil.Pair.of(jobEntity, jobEntityId));

                // we find the input components
                List<AtlasObjectId> inputInstanceIds = new ArrayList<>();
                for (TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId> pair : this.persistedComponents.values()) {
                    AtlasEntityWithExtInfo ref = pair.left;
                    List<String> inputs = (List<String>) ref.getEntity().getAttribute("inputs");
                    if (inputs == null || inputs.size() == 0) {
                        inputInstanceIds.add(pair.right);
                    }
                }
                // we create an artificial instance to link the job with the input components
                AtlasEntityWithExtInfo artificialRef = TalendModelFactory.buildTalendArtificialComponent(jobName, Arrays.asList(jobEntityId),
                        inputInstanceIds);
                AtlasObjectId idArtificialRef = client.persistInstanceWithLog(artificialRef);
            }
        } catch (Throwable e) {
            if (dieOnError) {
                throw new RuntimeException(e);
            } else {
                LOG.error(e);
            }
        }
    }

    /**
     * Persists the refs and with the obtained Ids it creates:
     * <ul>
     * <li>the corresponding types for the Talend Model (if they don't exist)</li>
     * <li>the artificial components to connect the refs (they are persisted too)</li>
     * </ul>
     *
     * @param entities
     * @return the instance corresponding to the artificial nodes
     */
    private Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistWithArtificialComponents(final List<AtlasEntityWithExtInfo> entities)
            throws Exception {
        findOrCreateTypes(TalendModelFactory.TALEND_CLASS_TYPES);

        Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedInstances = persist(entities);
        // Now we create the artificial components to connect the references (edges)
        List<AtlasEntityWithExtInfo> artificialRefs = TalendModelFactory.buildTalendArtificialComponents(persistedInstances);
        // We persist the artificial processes
        Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedArtificialInstances = persist(artificialRefs);
        // This is done for debugging/test purposes
        this.persistedComponents = persistedInstances;
        this.persistedArtificialComponents = persistedArtificialInstances;
        return persistedArtificialInstances;
    }

    /**
     * Persists the refs in Atlas, it assumes that the refs have different names (identity)
     * 
     * @param entities
     * @return
     */
    private Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persist(final List<AtlasEntityWithExtInfo> entities) throws Exception {
        Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedEntities = new HashMap<>();
        for (final AtlasEntityWithExtInfo entity : entities) {
            // We persisted with the modified Ref if it was modified
            AtlasObjectId entityId = client.persistInstanceWithLog(entity);
            String name = (String) entity.getEntity().getAttribute("name");
            persistedEntities.put(name, TypesUtil.Pair.of(entity, entityId));
        }
        return persistedEntities;
    }

    /**
     * Creates the type definitions or ensure that the default types exist
     * 
     * @param types
     */
    private void findOrCreateTypes(final Collection<String> types) throws AtlasServiceException {
        Collection<String> missingTypes = client.getMissingTypes(types);
        if (!missingTypes.isEmpty()) {
            // notice that we force the creation of the types if they don't exist
            AtlasTypesDef typesDef = TalendModelFactory.buildTypesDef(missingTypes);
            client.persistTypes(typesDef);
        }
    }

    // Methods below are only for debugging / unit testing purposes

    protected void logPersistedEntities() {
        logPersistedEntities("persistedJobs:", this.persistedJobs);
        logPersistedEntities("persistedEntities:", this.persistedComponents);
        logPersistedEntities("persistedArtificialEntities:", this.persistedArtificialComponents);
    }

    private void logPersistedEntities(final String msg, @Nullable
    final Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> entries) {
        LOG.debug(msg);
        if (entries != null) {
            for (Map.Entry<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> entry : entries.entrySet()) {
                AtlasEntityWithExtInfo ref = entry.getValue().left;
                AtlasObjectId id = entry.getValue().right;
                String name = (String) ref.getEntity().getAttribute("name");
                String typeName = ref.getEntity().getTypeName();
                LOG.debug(name + " [" + typeName + "] : " + id);
                if ("tArtificialComponent".equals(typeName)) {
                    List<String> inputs = (List<String>) ref.getEntity().getAttribute("inputs");
                    List<String> outputs = (List<String>) ref.getEntity().getAttribute("outputs");
                    LOG.debug(name + " inputs  : [" + inputs + "]");
                    LOG.debug(name + " outputs : [" + outputs + "]");
                }
            }
        }
    }

    protected List<AtlasEntityWithExtInfo> getRefs() {
        return entities;
    }

    @Nullable
    protected AtlasEntityWithExtInfo getJobEntity() {
        return jobEntity;
    }

    protected Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> getPersistedComponents() {
        return persistedComponents;
    }

    protected Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> getPersistedArtificialComponents() {
        return persistedArtificialComponents;
    }

    protected Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> getPersistedJobs() {
        return persistedJobs;
    }
}

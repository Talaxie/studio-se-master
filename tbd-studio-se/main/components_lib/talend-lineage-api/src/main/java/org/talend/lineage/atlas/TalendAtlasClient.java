package org.talend.lineage.atlas;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.atlas.AtlasClientV2;
import org.apache.atlas.AtlasServiceException;
import org.apache.atlas.model.SearchFilter;
import org.apache.atlas.model.instance.AtlasEntity.AtlasEntityWithExtInfo;
import org.apache.atlas.model.instance.AtlasObjectId;
import org.apache.atlas.model.instance.EntityMutationResponse;
import org.apache.atlas.model.typedef.AtlasTypeDefHeader;
import org.apache.atlas.model.typedef.AtlasTypesDef;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a client access class for all the communication with Atlas. It encapsulates the original AtlasClient and
 * provides some missing util methods. Some of these methods are replacements for existing methods in more recent
 * versions, or may end up going upstream (to the Apache Atlas project).
 *
 * It exists to offer a stable foundation in case API changes in Apache Atlas
 */
final class TalendAtlasClient {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(TalendAtlasClient.class);

    private final AtlasClientV2 client;

    TalendAtlasClient(final String url, final String login, final String password) {
        client = new AtlasClientV2(new String[] { url }, new String[] { login, password });
    }

    public AtlasObjectId persistInstance(final AtlasEntityWithExtInfo atlasEntityWithExtInfo) throws AtlasServiceException {
        EntityMutationResponse response = client.createEntity(atlasEntityWithExtInfo);
        return new AtlasObjectId(response.getGuidAssignments().get(atlasEntityWithExtInfo.getEntity().getGuid()), atlasEntityWithExtInfo.getEntity().getTypeName());
    }

    /**
     * This method is just a wrapper to log the invocation of AtlasUtil.createInstance It only exists for debugging
     * purposes and can be replaced with the direct call
     *
     * @param atlasEntityWithExtInfo
     * @return
     * @throws Exception
     */
    public AtlasObjectId persistInstanceWithLog(final AtlasEntityWithExtInfo atlasEntityWithExtInfo) throws Exception {
        AtlasObjectId id = persistInstance(atlasEntityWithExtInfo);
        LOG.debug("created instance for type " + id.getTypeName() + ", guid: " + id.getGuid());
        return id;
    }

    /**
     * @param typesDef object to persist
     * @return the Id corresponding to the created types
     */
    public void persistTypes(final AtlasTypesDef typesDef) throws AtlasServiceException {
        AtlasTypesDef atlasTypesDef = this.client.createAtlasTypeDefs(typesDef);
    }

    public void deleteTypes(final AtlasTypesDef typesDef) throws AtlasServiceException {
        this.client.deleteAtlasTypeDefs(typesDef);
    }

    /**
     * @param types collection of type names we want to check if they exist in Atlas
     * @return the collection of types that don't exist in Atlas
     */
    public Collection<String> getMissingTypes(final Collection<String> types) throws AtlasServiceException {
        ObjectMapper mapper = new ObjectMapper();
        List<AtlasTypeDefHeader> existingTypes = mapper.convertValue(this.client.getAllTypeDefHeaders(new SearchFilter()), new TypeReference<List<AtlasTypeDefHeader>>() {});
        List<String> existingTypesNames = existingTypes.stream().map(AtlasTypeDefHeader::getName).collect(Collectors.toList());
        return types.stream()
                .filter(t -> !existingTypesNames.contains(t))
                .collect(Collectors.toList());
    }
}
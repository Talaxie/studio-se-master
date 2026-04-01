package org.talend.lineage.atlas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.apache.atlas.model.instance.AtlasEntity;
import org.apache.atlas.model.instance.AtlasEntity.AtlasEntityWithExtInfo;
import org.apache.atlas.model.instance.AtlasObjectId;
import org.apache.atlas.model.instance.AtlasRelatedObjectId;
import org.apache.atlas.model.typedef.*;
import org.apache.atlas.type.AtlasTypeUtil;
import org.apache.atlas.v1.model.instance.Referenceable;
import org.apache.atlas.v1.model.typedef.HierarchicalTypeDefinition;
import org.apache.atlas.v1.typesystem.types.utils.TypesUtil;

import java.util.*;
import java.util.stream.Collectors;

import static org.apache.atlas.type.AtlasTypeUtil.toAtlasRelatedObjectIds;

final class TalendModelFactory {

    private static final String TALEND_JOB_TYPE = "tJob";
    private static final String TALEND_COMPONENT_TYPE = "tComponent";
    private static final String TALEND_ARTIFICIAL_COMPONENT_TYPE = "tArtificialComponent";
    // The generic Atlas Column is used to be sure that the web interface shows the schema
    private static final String COLUMN_TYPE = "Column";

    // The name of the traits must be different from the one of the classes
    // and they are used to tag the things we want to show in the Atlas GUI
    private static final String TALEND_TRAIT = "Talend"; // tag for all talend entities
    private static final String TALEND_JOB_TRAIT = "TalendJob";
    private static final String TALEND_COMPONENT_TRAIT = "TalendComponent";

    static final Collection<String> TALEND_CLASS_TYPES =
            ImmutableList.of(TALEND_JOB_TYPE, TALEND_COMPONENT_TYPE,
                    TALEND_ARTIFICIAL_COMPONENT_TYPE, COLUMN_TYPE);

    private TalendModelFactory() {

    }

    /**
     *
     * @param typeNames the list of names of types to create (class names)
     * @return the type definition object
     */
    static AtlasTypesDef buildTypesDef(final Collection<String> typeNames) {
        AtlasClassificationDef talendTraitDef =
                AtlasTypeUtil.createTraitTypeDef(TALEND_TRAIT, null, new AtlasStructDef.AtlasAttributeDef[0]);
        AtlasClassificationDef talendJobTraitDef =
                AtlasTypeUtil.createTraitTypeDef(TALEND_JOB_TRAIT, null, new AtlasStructDef.AtlasAttributeDef[0]);
        AtlasClassificationDef talendETLTraitDef =
                AtlasTypeUtil.createTraitTypeDef(TALEND_COMPONENT_TRAIT, null, new AtlasStructDef.AtlasAttributeDef[0]);

        // Default Atlas Entities
        Map<String, AtlasEntityDef> allClasses = new HashMap<>();

        AtlasEntityDef columnClassDef =
                AtlasTypeUtil.createClassTypeDef(COLUMN_TYPE, null,
                        AtlasTypeUtil.createOptionalAttrDef("name", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("dataType", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("comment", AtlasBaseTypeDef.ATLAS_TYPE_STRING)
                );

        // Talend Entities
        // TalendDataSet -> DataSet -> Table
        // TalendEntity -> LoadProcess -> Process
        // TalendEntityChild -> Column -> Ref
        AtlasEntityDef talendJobClassDef = AtlasTypeUtil
                .createClassTypeDef(TALEND_JOB_TYPE, Collections.singleton("DataSet"),
                        AtlasTypeUtil.createOptionalAttrDef("purpose", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("author", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("version", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("jobType", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("framework", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        // Note: Atlas only format date values if they end with the -Time suffix
                        AtlasTypeUtil.createOptionalAttrDef("creationTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("lastModificationTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("status", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("startTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("endTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        new AtlasStructDef.AtlasAttributeDef("components",
                                AtlasBaseTypeDef.getArrayTypeName(TALEND_COMPONENT_TYPE),
                                AtlasStructDef.AtlasAttributeDef.Cardinality.LIST, true, false)
                );

        AtlasEntityDef talendComponentClassDef = AtlasTypeUtil
                .createClassTypeDef(TALEND_COMPONENT_TYPE, null, ImmutableSet.of("DataSet"),
                        AtlasTypeUtil.createOptionalAttrDef("creationTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("lastModificationTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("startTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        AtlasTypeUtil.createOptionalAttrDef("endTime", AtlasBaseTypeDef.ATLAS_TYPE_LONG),
                        new AtlasStructDef.AtlasAttributeDef("columns", AtlasBaseTypeDef.getArrayTypeName(COLUMN_TYPE),
                                AtlasStructDef.AtlasAttributeDef.Cardinality.LIST, true, false),
                        AtlasTypeUtil.createOptionalAttrDef("script", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        // These two are optional for input/output components
                        AtlasTypeUtil.createOptionalAttrDef("path", AtlasBaseTypeDef.ATLAS_TYPE_STRING),
                        AtlasTypeUtil.createOptionalAttrDef("format", AtlasBaseTypeDef.ATLAS_TYPE_STRING)

                        // This would allow us to change the entity icon in the web UI
//                        TypesUtil.createOptionalAttrDef("icon_url", AtlasBaseTypeDef.ATLAS_TYPE_STRING);
                );
        // This is an artificial entity to model the edges in the graph given the constraints
        // to represent an entity as both DataSet and Process in Atlas 0.5
        AtlasEntityDef talendArtificialComponentClassDef = AtlasTypeUtil
                .createClassTypeDef(TALEND_ARTIFICIAL_COMPONENT_TYPE, null, ImmutableSet.of("Process"));

        allClasses.put(COLUMN_TYPE, columnClassDef);
        allClasses.put(TALEND_JOB_TYPE, talendJobClassDef);
        allClasses.put(TALEND_COMPONENT_TYPE, talendComponentClassDef);
        allClasses.put(TALEND_ARTIFICIAL_COMPONENT_TYPE, talendArtificialComponentClassDef);

        ImmutableList.Builder builder =
                ImmutableList.<HierarchicalTypeDefinition>builder();
        for (String typeName : typeNames) {
            AtlasEntityDef clazz = allClasses.get(typeName);
            if(clazz != null) {
                builder.add(clazz);
            }
        }
        ImmutableList<AtlasEntityDef> classes = builder.build();
        return new AtlasTypesDef(ImmutableList.<AtlasEnumDef>of(), ImmutableList.<AtlasStructDef>of(), ImmutableList.of(talendTraitDef, talendJobTraitDef, talendETLTraitDef), classes);
     }

    /**
     *
     * @param values
     * @return
     */
    static AtlasEntityWithExtInfo buildTalendJob(final Map<String, Object> values) {
        return new AtlasEntityWithExtInfo(buildEntity(TALEND_JOB_TYPE, values));
    }

    /**
     *
     * @param name
     * @param schema
     * @param metadata
     * @param inputs
     * @param outputs
     * @return
     */
    static AtlasEntityWithExtInfo buildTalendComponent(final String name, Map<String, String> schema,
                                              final Map<String, Object> metadata,
                                              final List<String> inputs,
                                              final List<String> outputs) {
        AtlasEntity entity = buildEntity(TALEND_COMPONENT_TYPE, metadata);
        entity.setAttribute("name", name);
        entity.setAttribute("qualifiedName", name + " [" + UUID.randomUUID().toString() + "]");
        entity.setRelationshipAttribute("columns", buildColumns(schema));
        entity.setAttribute("inputs", inputs);
        entity.setAttribute("outputs", outputs);
        return new AtlasEntityWithExtInfo(entity);
    }

    /**
     *
     * @param schema is a Map where each entry contains the name and the type each column
     * @return The column as a Referenceable
     */
    private static List<AtlasEntity> buildColumns(final Map<String, String> schema) {
        List<AtlasEntity> entities = new ArrayList<>();
        for(Map.Entry<String, String> entry : schema.entrySet()) {
            AtlasEntity entity = new AtlasEntity(COLUMN_TYPE);
            entity.setAttribute("name", entry.getKey());
            entity.setAttribute("dataType", entry.getValue());
            entity.setAttribute("comment", "");
            entities.add(entity);
        }
        return entities;
    }


    /**
     * This creates the artificial processes to connect the graph (edges)
     * @param persistedEntities
     */
    static List<AtlasEntityWithExtInfo> buildTalendArtificialComponents(
            final Map<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> persistedEntities) {
        Map<String, AtlasEntityWithExtInfo> artificialRefs = new LinkedHashMap<>();
        for (Map.Entry<String, TypesUtil.Pair<AtlasEntityWithExtInfo, AtlasObjectId>> entry : persistedEntities.entrySet()) {
            AtlasEntityWithExtInfo ref = entry.getValue().left;
            AtlasObjectId id = entry.getValue().right;

            List<String> outputs = (List) ref.getEntity().getAttribute("outputs");
            if (outputs != null && !outputs.isEmpty()) {
                for (String output : outputs) {
                    AtlasEntityWithExtInfo artificialRef = artificialRefs.get(output);
                    if (artificialRef == null) {
                        AtlasObjectId outputId = persistedEntities.get(output).right;
                        artificialRef = buildTalendArtificialComponent(output,
                                Arrays.asList(id), Arrays.asList(outputId));
                    } else {
                        List<AtlasObjectId> inputs = (List) artificialRef.getEntity().getAttribute("inputs");
                        if (inputs != null) {
                            List<AtlasObjectId> newInputs = new ArrayList<>(inputs);
                            newInputs.add(id);
                            artificialRef.getEntity().setAttribute("inputs", newInputs);
                        }
                    }
                    artificialRefs.put(output, artificialRef);
                }
            }
        }
        return new ArrayList<>(artificialRefs.values());
    }

    /**
     * @param name
     * @param inputs
     * @param outputs
     * @return
     */
    static AtlasEntityWithExtInfo buildTalendArtificialComponent(
            final String name, final List<AtlasObjectId> inputs, final List<AtlasObjectId> outputs) {
        AtlasEntity entity = new AtlasEntity(TALEND_ARTIFICIAL_COMPONENT_TYPE);
        // Note: This hides the name of the artificially created nodes
        entity.setAttribute("name", " ");
        entity.setAttribute("qualifiedName", name + " [" + UUID.randomUUID().toString() + "]");
        entity.setRelationshipAttribute("inputs", toAtlasRelatedObjectIds(inputs));
        entity.setRelationshipAttribute("outputs", toAtlasRelatedObjectIds(outputs));
        return new AtlasEntityWithExtInfo(entity);
    }

    private static List<AtlasRelatedObjectId> toAtlasRelatedObjectIds(List<AtlasObjectId> ids){
        return ids.stream().map(AtlasRelatedObjectId::new).collect(Collectors.toList());
    };


    /**
     * THis is a generic method to build a generic {@link AtlasEntity}
     * @param refType
     * @param metadata
     * @return
     */
    private static AtlasEntity buildEntity(final String refType,
                                           final Map<String, Object> metadata) {
        AtlasEntity entity = new AtlasEntity(refType, metadata);
        return entity;
    }
}

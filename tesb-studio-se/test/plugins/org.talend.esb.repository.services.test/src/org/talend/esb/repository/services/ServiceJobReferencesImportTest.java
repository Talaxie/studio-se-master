package org.talend.esb.repository.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.junit.Test;
import org.talend.core.IESBService;
import org.talend.core.model.metadata.builder.connection.ConnectionFactory;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.Property;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.repository.items.importexport.handlers.model.ImportItem;
import org.talend.repository.items.importexport.manager.ChangeIdManager;
import org.talend.repository.services.ESBService;
import org.talend.repository.services.model.services.ServiceConnection;
import org.talend.repository.services.model.services.ServiceItem;
import org.talend.repository.services.model.services.ServiceOperation;
import org.talend.repository.services.model.services.ServicePort;
import org.talend.repository.services.model.services.ServicesFactory;

/**
 * Regression coverage for importing SOAP services together with jobs whose IDs change.
 */
public class ServiceJobReferencesImportTest {

    private final ESBService service = new ESBService();

    private final TestChangeIdManager manager = new TestChangeIdManager();

    @Test
    public void discoversJobsOnEveryPortAndPreservesContextDependency() {
        ServiceItem item = createService("oldJob", "otherJob", "oldJob", null, "");
        item.getConnection().setContextId("oldContext");

        assertEquals(new HashSet<String>(Arrays.asList("oldJob", "otherJob", "oldContext")),
                manager.relatedIds(item));
    }

    @Test
    public void remapsAllMatchingOperationsAndContext() throws Exception {
        ServiceItem item = createService("oldJob", "otherJob", "oldJob");
        item.getConnection().setContextId("oldContext");
        Map<String, String> ids = mapping("oldJob", "existingJob");
        ids.put("oldContext", "existingContext");

        assertTrue(manager.remap(item, ids));
        assertEquals(Arrays.asList("existingJob", "otherJob", "existingJob"),
                service.getSerivceRelatedJobIds(item));
        assertEquals("existingContext", item.getConnection().getContextId());
    }

    @Test
    public void preservesAbsentEmptyAndUnchangedMappings() throws Exception {
        ServiceItem item = createService("unchanged", "notImported", "nullTarget", "emptyTarget", "blankTarget", null, "");
        Map<String, String> ids = mapping("unchanged", "unchanged");
        ids.put("nullTarget", null);
        ids.put("emptyTarget", "");
        ids.put("blankTarget", " ");
        ids.put(null, "mustNotAssignUnboundOperation");
        ids.put("", "mustNotAssignEmptyOperation");

        assertFalse(manager.remap(item, ids));
        assertEquals(Arrays.asList("unchanged", "notImported", "nullTarget", "emptyTarget", "blankTarget", ""),
                service.getSerivceRelatedJobIds(item));
    }

    @Test
    public void usesOriginalIdsWithoutCascadingReplacements() throws Exception {
        ServiceItem item = createService("first", "second");
        Map<String, String> ids = mapping("first", "second");
        ids.put("second", "third");

        assertTrue(manager.remap(item, ids));
        assertEquals(Arrays.asList("second", "third"), service.getSerivceRelatedJobIds(item));
    }

    @Test
    public void doesNotReplacePartialIdentifiers() throws Exception {
        ServiceItem item = createService("oldJob", "oldJobSuffix", "prefixOldJob");

        assertTrue(manager.remap(item, mapping("oldJob", "existingJob")));
        assertEquals(Arrays.asList("existingJob", "oldJobSuffix", "prefixOldJob"),
                service.getSerivceRelatedJobIds(item));
    }

    @Test
    public void emptyMappingDoesNotModifyService() throws Exception {
        ServiceItem item = createService("oldJob");

        assertFalse(manager.remap(item, new HashMap<String, String>()));
        assertEquals(Arrays.asList("oldJob"), service.getSerivceRelatedJobIds(item));
    }

    @Test
    public void keepsExistingConnectionContextRemappingWithoutESB() throws Exception {
        ConnectionItem item = PropertiesFactory.eINSTANCE.createDatabaseConnectionItem();
        item.setConnection(ConnectionFactory.eINSTANCE.createDatabaseConnection());
        item.getConnection().setContextId("oldContext");

        assertEquals(new HashSet<String>(Arrays.asList("oldContext")), manager.relatedIds(item));
        assertTrue(manager.remap(item, mapping("oldContext", "newContext")));
        assertEquals("newContext", item.getConnection().getContextId());
        assertFalse(service.updateServiceJobReferences(item, mapping("oldContext", "otherContext")));
    }

    @Test
    public void persistsRemappedReferencesInServiceResource() throws Exception {
        ServiceItem item = createService("oldJob", "otherJob");
        assertTrue(manager.remap(item, mapping("oldJob", "existingJob")));
        XMIResourceImpl resource = new XMIResourceImpl(URI.createURI("memory:/service.item"));
        resource.getContents().add(item.getConnection());
        for (ServicePort port : ((ServiceConnection) item.getConnection()).getServicePort()) {
            resource.getContents().add(port);
            resource.getContents().addAll(port.getServiceOperation());
        }
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        resource.save(output, null);

        XMIResourceImpl reloaded = new XMIResourceImpl(URI.createURI("memory:/reloaded.item"));
        reloaded.load(new ByteArrayInputStream(output.toByteArray()), null);
        ServiceItem reloadedItem = ServicesFactory.eINSTANCE.createServiceItem();
        reloadedItem.setConnection((ServiceConnection) reloaded.getContents().get(0));
        assertEquals(Arrays.asList("existingJob", "otherJob"), service.getSerivceRelatedJobIds(reloadedItem));
    }

    @Test
    public void importRemapsJobWhenServiceKeepsItsIdentifier() throws Exception {
        verifyImport("service", "service");
    }

    @Test
    public void importRemapsJobWhenServiceIdentifierAlsoChanges() throws Exception {
        verifyImport("service", "existingService");
    }

    @Test
    public void importRemapsJobWithoutExplicitMappingForServiceIdentifier() throws Exception {
        verifyImport("service", null);
    }

    private void verifyImport(String oldServiceId, String newServiceId) throws Exception {
        ServiceItem item = createService("generatedJob", "unrelatedJob");
        Property property = PropertiesFactory.eINSTANCE.createProperty();
        property.setId(oldServiceId);
        property.setVersion("0.1");
        property.setItem(item);
        ImportItem importedService = new ImportItem(new Path("service.properties")) {

            @Override
            public ERepositoryObjectType getRepositoryType() {
                // Le dépôt en mémoire ne dépend pas du registre d'extensions Eclipse.
                return null;
            }
        };
        importedService.setProperty(property);
        ImportChangeIdManager importManager = new ImportChangeIdManager();
        importManager.add(importedService);
        if (newServiceId != null) {
            importManager.mapOldId2NewId(oldServiceId, newServiceId);
            property.setId(newServiceId);
        }
        importManager.mapOldId2NewId("generatedJob", "existingJob");
        importManager.importedProperty = property;

        importManager.changeIds();

        assertEquals(Arrays.asList("existingJob", "unrelatedJob"), service.getSerivceRelatedJobIds(item));
        assertEquals(1, importManager.changedItems);
    }

    private ServiceItem createService(String... jobIds) {
        ServiceItem item = ServicesFactory.eINSTANCE.createServiceItem();
        ServiceConnection connection = ServicesFactory.eINSTANCE.createServiceConnection();
        item.setConnection(connection);
        for (String jobId : jobIds) {
            ServicePort port = ServicesFactory.eINSTANCE.createServicePort();
            connection.getServicePort().add(port);
            ServiceOperation operation = ServicesFactory.eINSTANCE.createServiceOperation();
            operation.setReferenceJobId(jobId);
            port.getServiceOperation().add(operation);
        }
        return item;
    }

    private Map<String, String> mapping(String oldId, String newId) {
        Map<String, String> ids = new HashMap<String, String>();
        ids.put(oldId, newId);
        return ids;
    }

    private class TestChangeIdManager extends ChangeIdManager {

        @Override
        protected IESBService getESBService(Item item) {
            return item instanceof ServiceItem ? service : null;
        }

        Collection<String> relatedIds(ConnectionItem item) {
            return getRelatedConnectionIds(item);
        }

        boolean remap(ConnectionItem item, Map<String, String> ids) throws Exception {
            return changeRelatedConnection(ids, item);
        }
    }

    private class ImportChangeIdManager extends TestChangeIdManager {

        private Property importedProperty;

        private int changedItems;

        @Override
        protected void prepareRelationshipItemBuilder(org.talend.core.model.properties.Project project) {
            // L'import doit fonctionner même sans index préalable des relations du service.
        }

        @Override
        protected org.talend.core.model.general.Project getCurrentProject() {
            return null;
        }

        @Override
        protected List<IRepositoryViewObject> getAllVersion(String id, ERepositoryObjectType type) {
            if (!importedProperty.getId().equals(id)) {
                return Collections.emptyList();
            }
            IRepositoryViewObject object = (IRepositoryViewObject) Proxy.newProxyInstance(
                    IRepositoryViewObject.class.getClassLoader(), new Class<?>[] { IRepositoryViewObject.class },
                    (proxy, method, args) -> {
                        if ("getProperty".equals(method.getName())) {
                            return importedProperty;
                        }
                        throw new UnsupportedOperationException(method.getName());
                    });
            return Collections.singletonList(object);
        }

        @Override
        protected void changeRelated(Map<String, String> ids, Property property,
                org.talend.core.model.general.Project project) throws Exception {
            if (changeRelatedConnection(ids, (ConnectionItem) property.getItem())) {
                changedItems++;
            }
        }
    }
}

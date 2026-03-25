/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.talend.designer.core.ui.editor.properties.controllers.dynamic;

import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.core.model.components.ComponentCategory;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.general.ModuleNeeded;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.model.metadata.MetadataTable;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.properties.Property;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.model.process.DataConnection;
import org.talend.designer.core.model.process.DataProcess;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.ui.editor.properties.controllers.AbstractGuessSchemaProcess;
import org.talend.designer.runprocess.IProcessor;
import org.talend.designer.runprocess.ProcessorUtilities;

public class DynamicGuessSchemaProcess {

    private Task guessSchemaTask;

    private ExecutorService executorService;

    public DynamicGuessSchemaProcess(INode node, IContext context, ExecutorService executorService) {
        this.executorService = executorService;
        this.guessSchemaTask = new Task(context, node, executorService);
    }

    public Future<String> run() {
        return executorService.submit(guessSchemaTask);
    }

    public void kill() {
        guessSchemaTask.kill();
    }

    public static class Task implements Callable<String> {

        private Process process;

        private IContext context;

        private INode node;

        private ExecutorService executorService;

        private java.lang.Process executeProcess;

        public Task(IContext context, INode node, ExecutorService executorService) {
            this.context = context;
            this.node = node;
            this.executorService = executorService;
        }

        @Override
        public String call() throws Exception {
            buildProcess();
            IProcessor processor = ProcessorUtilities.getProcessor(process, null);
            processor.setContext(context);
            executeProcess = processor.run(null, IProcessor.NO_STATISTICS, IProcessor.NO_TRACES);

            Future<String> guessResult = executorService.submit(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(executeProcess.getInputStream()))) {
                    return reader.lines().filter(l -> l.startsWith("[") || l.startsWith("{")).collect(joining("\n"));
                }
            });

            final Future<String> errorResult = executorService.submit(() -> {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(executeProcess.getErrorStream()))) {
                    return reader.lines().collect(joining("\n"));
                }
            });

            executeProcess.waitFor();
            String result = guessResult.get();
            String error = errorResult.get();
            if (StringUtils.isNotBlank(error)) {
                Exception e = new IllegalStateException(error);
                ExceptionHandler.process(e);
                throw e;
            }
            if (StringUtils.isBlank(result) && StringUtils.isBlank(error)) {
                throw new IllegalStateException(Messages.getString("guessSchema.error.empty"));
            }

            return result;
        }

        public synchronized void kill() {
            if (executeProcess != null && executeProcess.isAlive()) {
                java.lang.Process p = executeProcess.destroyForcibly();
                try {
                    p.waitFor(20, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private void buildProcess() {
            IProcess originalProcess;
            Property property = AbstractGuessSchemaProcess.getNewmockProperty();
            originalProcess = new Process(property);

            DataProcess dataProcess = new DataProcess(originalProcess);
            dataProcess.buildFromGraphicalProcess(Arrays.asList(node));
            process = Process.class.cast(dataProcess.getDuplicatedProcess());
            process.setGeneratingProcess(null);
            process.getContextManager().getListContext().addAll(originalProcess.getContextManager().getListContext());
            process.getContextManager().setDefaultContext(this.context);
            INode inputNode = process.getGraphicalNodes().stream().filter(n -> node.getUniqueName().equals(n.getUniqueName()))
                    .findFirst().orElse(null);
            IComponent guessComponent = ComponentsFactoryProvider.getInstance().getComponents().stream()
                    .filter(comp -> "tDynamicGuessSchema".equals(comp.getName())).findFirst().orElse(null);
            Node guessNode = new Node(guessComponent, process);
            process.addNodeContainer(new NodeContainer(guessNode));

            for (INode node : new ArrayList<>(process.getGraphicalNodes())) {
                for (ModuleNeeded module : node.getModulesNeeded()) {
                    if (module.isRequired(node.getElementParameters())) {
                        Node libNode = new Node(ComponentsFactoryProvider.getInstance().get("tLibraryLoad",
                                ComponentCategory.CATEGORY_4_DI.getName()), process);
                        libNode.setPropertyValue("LIBRARY", StringUtils.wrap(module.getMavenUri(), "\""));
                        NodeContainer nc = process.loadNodeContainer(libNode, false);
                        process.addNodeContainer(nc);
                    }
                }
            }

            List<IMetadataTable> tables = new ArrayList<>();
            inputNode.setMetadataList(tables);
            IMetadataTable table = new MetadataTable();
            table.setAttachedConnector(EConnectionType.FLOW_MAIN.getName());
            tables.add(table);
            List<IMetadataColumn> columns = new ArrayList<>();
            table.setListColumns(columns);
            IMetadataColumn column = new MetadataColumn();
            columns.add(column);
            column.setTalendType("id_Dynamic");
            column.setLabel("dynamic");
            column.setType("STRING");
            column.setPattern("dd-MM-yyyy");
            column.setLength(-1);
            column.setPrecision(-1);

            DataConnection connection = new DataConnection();
            connection.setActivate(true);
            connection.setLineStyle(EConnectionType.FLOW_MAIN);
            connection.setConnectorName(EConnectionType.FLOW_MAIN.getName());
            connection.setName("row1");
            connection.setSource(inputNode);
            connection.setTarget(guessNode);
            connection.setMetadataTable(table);
            List<IConnection> connections = new ArrayList<>();
            connections.add(connection);

            inputNode.setOutgoingConnections(connections);
            guessNode.setIncomingConnections(connections);
        }
    }

}

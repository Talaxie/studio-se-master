// ============================================================================
//
// Copyright (C) 2006-2026 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.process.EComponentCategory;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.EParameterFieldType;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IElementParameter;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.INodeConnector;
import org.talend.core.ui.ai.IAiJobService;
import org.talend.designer.core.assist.TalendEditorComponentCreationUtil;
import org.talend.designer.core.i18n.Messages;
import org.talend.designer.core.ui.AbstractMultiPageTalendEditor;
import org.talend.designer.core.ui.editor.AbstractTalendEditor;
import org.talend.designer.core.model.components.EParameterName;
import org.talend.designer.core.ui.editor.cmd.ChangeNoteTextCommand;
import org.talend.designer.core.ui.editor.cmd.ConnectionCreateCommand;
import org.talend.designer.core.ui.editor.cmd.ConnectionDeleteCommand;
import org.talend.designer.core.ui.editor.cmd.CreateNoteCommand;
import org.talend.designer.core.ui.editor.connections.Connection;
import org.talend.designer.core.ui.editor.connections.ConnectionLabel;
import org.talend.designer.core.ui.editor.cmd.CreateNodeContainerCommand;
import org.talend.designer.core.ui.editor.cmd.DeleteNodeContainerCommand;
import org.talend.designer.core.ui.editor.cmd.DeleteNoteCommand;
import org.talend.designer.core.ui.editor.cmd.MoveNoteCommand;
import org.talend.designer.core.ui.editor.cmd.PropertyChangeCommand;
import org.talend.designer.core.ui.editor.cmd.ResizeNoteCommand;
import org.talend.designer.core.ui.editor.nodecontainer.NodeContainer;
import org.talend.designer.core.ui.editor.nodes.Node;
import org.talend.designer.core.ui.editor.nodes.NodeLabel;
import org.talend.designer.core.ui.editor.notes.Note;
import org.talend.designer.core.ui.editor.process.Process;
import org.talend.designer.core.utils.ConnectionUtil;
import org.talend.utils.json.JSONArray;
import org.talend.utils.json.JSONObject;

/**
 * Gives the AI assistant access to the job opened in the active editor (see {@link IAiJobService}).
 * <p>
 * Supported actions (JSON array):
 * <ul>
 * <li>{"action": "add_component", "component": "tDie", "ref": "die", "after": "tLogRow_1", "params": {...}}</li>
 * <li>{"action": "set_params", "component": "tDie_1", "params": {"MESSAGE": "\"Done\"", "CODE": "21"}}</li>
 * <li>{"action": "connect", "from": "tLogRow_1", "to": "die", "type": "ON_SUBJOB_OK", "condition": "..."}</li>
 * <li>{"action": "delete_component", "component": "tDie_1"}</li>
 * <li>{"action": "delete_connection", "connection": "row1"} or {"action": "delete_connection", "from": "tLogRow_1",
 * "to": "tDie_1", "type": "ON_SUBJOB_OK"}</li>
 * <li>{"action": "add_note", "text": "...", "ref": "n", "near": "tLogRow_1", "color": "#FFFFCB"}</li>
 * <li>{"action": "update_note", "note": "note1", "text": "...", "x": 100, "y": 50, "width": 200, "height": 80,
 * "color": "#FFFFCB", "text_color": "#000000", "font_size": 12, "bold": true, "italic": false}</li>
 * <li>{"action": "delete_note", "note": "note1"}</li>
 * </ul>
 * The notes are not components (no tNote in the palette): they are referenced by their position in the job (note1,
 * note2...) or by the "ref" given when they are added.
 * The description of the job includes what is selected in the editor, for the requests like "delete the selected
 * component".
 * Components are referenced by their unique name, or by the "ref" given when they are added in the same actions. All
 * the actions are executed as one command of the editor, so they are undone together.
 */
public class AiJobService implements IAiJobService {

    private static final int MAX_VALUE_LENGTH = 150;

    private static final int MAX_PARAMETERS_PER_COMPONENT = 30;

    private static final int MAX_LIST_ITEMS = 15;

    /** Space between a component and the one added after it */
    private static final int X_SPACING = 192;

    /** Space between a note and the element under it */
    private static final int NOTE_SPACING = 96;

    private static final String NOTE_ID_PREFIX = "note"; //$NON-NLS-1$

    /** Parameters described to the model and which can be changed */
    private static final Set<EParameterFieldType> EDITABLE_TYPES = EnumSet.of(EParameterFieldType.TEXT,
            EParameterFieldType.MEMO, EParameterFieldType.MEMO_JAVA, EParameterFieldType.MEMO_SQL, EParameterFieldType.CHECK,
            EParameterFieldType.CLOSED_LIST, EParameterFieldType.OPENED_LIST, EParameterFieldType.RADIO,
            EParameterFieldType.FILE, EParameterFieldType.DIRECTORY);

    @Override
    public String getActiveJobDescription() {
        AbstractMultiPageTalendEditor multiPageEditor = getActiveJobEditor();
        if (multiPageEditor == null || !(multiPageEditor.getTalendEditor().getProcess() instanceof Process)) {
            return null;
        }
        Process process = (Process) multiPageEditor.getTalendEditor().getProcess();
        StringBuilder description = new StringBuilder();
        description.append("Job: ").append(process.getLabel()).append(' ').append(process.getVersion()) //$NON-NLS-1$
                .append(process.isReadOnly() ? " (read only)" : "").append('\n'); //$NON-NLS-1$ //$NON-NLS-2$
        description.append("Components:\n"); //$NON-NLS-1$
        for (INode node : process.getGraphicalNodes()) {
            description.append("- ").append(node.getUniqueName()).append(" (").append(node.getComponent().getName()) //$NON-NLS-1$ //$NON-NLS-2$
                    .append(')');
            if (node instanceof Node && ((Node) node).getLocation() != null) {
                Point location = ((Node) node).getLocation();
                description.append(" at ").append(location.x).append(',').append(location.y); //$NON-NLS-1$
            }
            if (!node.isActivate()) {
                description.append(" [deactivated]"); //$NON-NLS-1$
            }
            description.append('\n');
            int count = 0;
            for (IElementParameter parameter : getEditableParameters(node)) {
                if (count++ >= MAX_PARAMETERS_PER_COMPONENT) {
                    description.append("    ...\n"); //$NON-NLS-1$
                    break;
                }
                description.append("    ").append(parameter.getName()).append(" = ") //$NON-NLS-1$ //$NON-NLS-2$
                        .append(truncate(String.valueOf(parameter.getValue())));
                if (parameter.getFieldType() == EParameterFieldType.CLOSED_LIST) {
                    description.append(" (values: ").append(String.join(", ", getListItems(parameter))).append(')'); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                }
                description.append('\n');
            }
        }
        description.append("Connections:\n"); //$NON-NLS-1$
        for (INode node : process.getGraphicalNodes()) {
            for (IConnection connection : node.getOutgoingConnections()) {
                if (connection.getTarget() == null) {
                    continue;
                }
                description.append("- ").append(describeConnection(connection)).append('\n'); //$NON-NLS-1$
            }
        }
        // the notes are not components: they have no name, they are referenced by their position in this list
        description.append("Notes:\n"); //$NON-NLS-1$
        List<Note> notes = process.getNotes();
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            description.append("- ").append(getNoteId(i)); //$NON-NLS-1$
            if (note.getLocation() != null) {
                description.append(" at ").append(note.getLocation().x).append(',').append(note.getLocation().y); //$NON-NLS-1$
            }
            if (note.getSize() != null) {
                description.append(" size ").append(note.getSize().width).append('x').append(note.getSize().height); //$NON-NLS-1$
            }
            description.append(" color ").append(note.getPropertyValue(EParameterName.NOTE_COLOR.getName())) //$NON-NLS-1$
                    .append(", text: \"").append(truncate(String.valueOf(note.getText()))).append("\"\n"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        // what the user selected in the editor, for the requests like "delete the selected component"
        List<String> selection = new ArrayList<>();
        for (Object selected : getSelectedElements(multiPageEditor.getTalendEditor())) {
            if (selected instanceof INode) {
                selection.add("component " + ((INode) selected).getUniqueName()); //$NON-NLS-1$
            } else if (selected instanceof IConnection) {
                selection.add("connection " + describeConnection((IConnection) selected)); //$NON-NLS-1$
            } else if (selected instanceof Note && notes.contains(selected)) {
                selection.add("note " + getNoteId(notes.indexOf(selected))); //$NON-NLS-1$
            }
        }
        description.append("Selected in the editor: ") //$NON-NLS-1$
                .append(selection.isEmpty() ? "nothing" : String.join("; ", selection)).append('\n'); //$NON-NLS-1$ //$NON-NLS-2$
        return description.toString();
    }

    private static String describeConnection(IConnection connection) {
        return connection.getSource().getUniqueName() + " --" + connection.getLineStyle().name() + " (" //$NON-NLS-1$ //$NON-NLS-2$
                + connection.getName() + ")--> " + connection.getTarget().getUniqueName(); //$NON-NLS-1$
    }

    /** Id of a note given to the model: note1, note2... (position in the notes of the job) */
    private static String getNoteId(int index) {
        return NOTE_ID_PREFIX + (index + 1);
    }

    /**
     * The components and connections selected in the job editor (the selection is kept when the focus is in the
     * assistant view). A component can be selected by its icon, its label or its subjob container.
     */
    private static Set<Object> getSelectedElements(AbstractTalendEditor editor) {
        Set<Object> elements = new LinkedHashSet<>();
        if (editor.getViewer() == null) {
            return elements;
        }
        for (Object part : editor.getViewer().getSelectedEditParts()) {
            Object model = part instanceof EditPart ? ((EditPart) part).getModel() : null;
            if (model instanceof NodeContainer) {
                model = ((NodeContainer) model).getNode();
            } else if (model instanceof NodeLabel) {
                model = ((NodeLabel) model).getNode();
            } else if (model instanceof ConnectionLabel) {
                model = ((ConnectionLabel) model).getConnection();
            }
            if (model instanceof INode || model instanceof Note
                    || (model instanceof IConnection && ((IConnection) model).getTarget() != null)) {
                elements.add(model);
            }
        }
        return elements;
    }

    @Override
    public Modification applyActions(String actionsJson) {
        AbstractMultiPageTalendEditor multiPageEditor = getActiveJobEditor();
        if (multiPageEditor == null || !(multiPageEditor.getTalendEditor().getProcess() instanceof Process)) {
            return new JobModification(Messages.getString("AiJobService.noJob")); //$NON-NLS-1$
        }
        AbstractTalendEditor editor = multiPageEditor.getTalendEditor();
        Process process = (Process) editor.getProcess();
        if (process.isReadOnly()) {
            return new JobModification(Messages.getString("AiJobService.readOnly", process.getLabel())); //$NON-NLS-1$
        }
        JSONArray actions;
        try {
            actions = new JSONArray(actionsJson);
        } catch (Exception e) {
            return new JobModification(Messages.getString("AiJobService.invalidJson", e.getMessage())); //$NON-NLS-1$
        }
        String category = editor.getComponenentsHandler().extractComponentsCategory().getName();
        AiModificationsCommand command = new AiModificationsCommand(process,
                TalendEditorComponentCreationUtil.getComponentsInCategory(category), actions);
        // one command in the stack of the editor: one Ctrl+Z undoes all the actions, the job becomes dirty
        CommandStack commandStack = editor.getCommandStack();
        commandStack.execute(command);
        return new JobModification(multiPageEditor, commandStack, command);
    }

    /** Result of {@link #applyActions(String)} */
    private static class JobModification implements Modification {

        private final AbstractMultiPageTalendEditor editor;

        private final CommandStack commandStack;

        private final AiModificationsCommand command;

        private final String report;

        /** Nothing applied */
        JobModification(String report) {
            this.editor = null;
            this.commandStack = null;
            this.command = null;
            this.report = report;
        }

        JobModification(AbstractMultiPageTalendEditor editor, CommandStack commandStack, AiModificationsCommand command) {
            this.editor = editor;
            this.commandStack = commandStack;
            this.command = command;
            this.report = command.getReport();
        }

        @Override
        public String getReport() {
            return report;
        }

        @Override
        public boolean hasChanges() {
            return command != null && command.hasChanges();
        }

        @Override
        public String undo() {
            if (!hasChanges()) {
                return null;
            }
            if (command.isUndone()) {
                return Messages.getString("AiJobService.alreadyUndone"); //$NON-NLS-1$
            }
            // the job editor may have been closed since
            IWorkbenchPage page = editor.getSite() == null ? null : editor.getSite().getPage();
            if (page == null || page.findEditor(editor.getEditorInput()) != editor) {
                return Messages.getString("AiJobService.jobClosed"); //$NON-NLS-1$
            }
            if (commandStack.getUndoCommand() != command) {
                return Messages.getString("AiJobService.cannotUndo"); //$NON-NLS-1$
            }
            commandStack.undo();
            return null;
        }
    }

    /**
     * Executes the actions as one command: each action is executed by the commands of the editor (creation of a
     * component, change of a parameter...), which are kept to be undone and redone together.
     */
    private static class AiModificationsCommand extends Command {

        private final Process process;

        private final Map<String, IComponent> components;

        private final JSONArray actions;

        /** Components added by the actions, by "ref" */
        private final Map<String, Node> refs = new HashMap<>();

        /** Notes added by the actions, by "ref" */
        private final Map<String, Note> noteRefs = new HashMap<>();

        /** Notes of the job before the actions, in the order of the description (note1, note2...) */
        private final List<Note> initialNotes = new ArrayList<>();

        private final List<Command> executed = new ArrayList<>();

        private final List<String> report = new ArrayList<>();

        private int applied;

        private boolean undone;

        AiModificationsCommand(Process process, Map<String, IComponent> components, JSONArray actions) {
            super(Messages.getString("AiJobService.commandLabel")); //$NON-NLS-1$
            this.process = process;
            this.components = components;
            this.actions = actions;
        }

        String getReport() {
            return String.join("\n", report); //$NON-NLS-1$
        }

        boolean hasChanges() {
            return !executed.isEmpty();
        }

        boolean isUndone() {
            return undone;
        }

        @Override
        public boolean canExecute() {
            return true;
        }

        @Override
        public boolean canUndo() {
            return !executed.isEmpty();
        }

        @Override
        public void execute() {
            // the ids note1, note2... are those of the description sent to the model, even if notes are deleted before
            initialNotes.addAll(process.getNotes());
            report.add(Messages.getString("AiJobService.reportTitle", process.getLabel())); //$NON-NLS-1$
            for (int i = 0; i < actions.length(); i++) {
                JSONObject action = actions.optJSONObject(i);
                if (action == null) {
                    continue;
                }
                String type = action.optString("action", ""); //$NON-NLS-1$ //$NON-NLS-2$
                try {
                    switch (type) {
                    case "add_component": //$NON-NLS-1$
                        report.add(addComponent(action));
                        break;
                    case "set_params": //$NON-NLS-1$
                        Node node = resolveNode(action.optString("component", "")); //$NON-NLS-1$ //$NON-NLS-2$
                        report.add(Messages.getString("AiJobService.paramsSet", node.getUniqueName(), //$NON-NLS-1$
                                setParams(node, action.optJSONObject("params")))); //$NON-NLS-1$
                        break;
                    case "connect": //$NON-NLS-1$
                        report.add(connect(action));
                        break;
                    case "delete_component": //$NON-NLS-1$
                        report.add(deleteComponent(action));
                        break;
                    case "delete_connection": //$NON-NLS-1$
                        report.add(deleteConnection(action));
                        break;
                    case "add_note": //$NON-NLS-1$
                        report.add(addNote(action));
                        break;
                    case "update_note": //$NON-NLS-1$
                        report.add(updateNote(action));
                        break;
                    case "delete_note": //$NON-NLS-1$
                        report.add(deleteNote(action));
                        break;
                    default:
                        throw new Exception(Messages.getString("AiJobService.unknownAction", type)); //$NON-NLS-1$
                    }
                    applied++;
                } catch (Exception e) {
                    report.add(Messages.getString("AiJobService.error", i + 1, e.getMessage())); //$NON-NLS-1$
                }
            }
            report.add(Messages.getString("AiJobService.reportEnd", applied, actions.length())); //$NON-NLS-1$
        }

        @Override
        public void undo() {
            for (int i = executed.size() - 1; i >= 0; i--) {
                executed.get(i).undo();
            }
            undone = true;
        }

        @Override
        public void redo() {
            for (Command command : executed) {
                command.redo();
            }
            undone = false;
        }

        private void run(Command command, String errorMessage) throws Exception {
            if (!command.canExecute()) {
                throw new Exception(errorMessage);
            }
            command.execute();
            executed.add(command);
        }

        private String addComponent(JSONObject action) throws Exception {
            String componentName = action.optString("component", ""); //$NON-NLS-1$ //$NON-NLS-2$
            IComponent component = components.get(componentName);
            if (component == null) {
                for (Map.Entry<String, IComponent> entry : components.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(componentName)) {
                        component = entry.getValue();
                        break;
                    }
                }
            }
            if (component == null) {
                throw new Exception(Messages.getString("AiJobService.unknownComponent", componentName)); //$NON-NLS-1$
            }

            Node node = new Node(component, process);
            NodeContainer nodeContainer = process.loadNodeContainer(node, false);
            run(new CreateNodeContainerCommand(process, nodeContainer, getNewLocation(action)),
                    Messages.getString("AiJobService.cannotAdd", componentName)); //$NON-NLS-1$
            String ref = action.optString("ref", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!ref.isEmpty()) {
                refs.put(ref, node);
            }
            String result = Messages.getString("AiJobService.added", node.getUniqueName(), componentName); //$NON-NLS-1$
            JSONObject params = action.optJSONObject("params"); //$NON-NLS-1$
            if (params != null && params.length() > 0) {
                result += " " + setParams(node, params); //$NON-NLS-1$
            }
            return result;
        }

        /** At the given position, else after the given component, else after the rightmost component */
        private Point getNewLocation(JSONObject action) throws Exception {
            if (action.opt("x") != null && action.opt("y") != null) { //$NON-NLS-1$ //$NON-NLS-2$
                return new Point(action.optInt("x"), action.optInt("y")); //$NON-NLS-1$ //$NON-NLS-2$
            }
            String after = action.optString("after", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!after.isEmpty()) {
                Node previous = resolveNode(after);
                return new Point(previous.getLocation().x + X_SPACING, previous.getLocation().y);
            }
            Point rightmost = null;
            for (INode node : process.getGraphicalNodes()) {
                if (node instanceof Node && ((Node) node).getLocation() != null) {
                    Point location = ((Node) node).getLocation();
                    if (rightmost == null || location.x > rightmost.x) {
                        rightmost = location;
                    }
                }
            }
            return rightmost == null ? new Point(128, 128) : new Point(rightmost.x + X_SPACING, rightmost.y);
        }

        /** @return the summary of the changed parameters */
        private String setParams(Node node, JSONObject params) throws Exception {
            if (params == null || params.length() == 0) {
                return ""; //$NON-NLS-1$
            }
            List<String> changed = new ArrayList<>();
            Iterator<?> keys = params.keys();
            while (keys.hasNext()) {
                String key = String.valueOf(keys.next());
                IElementParameter parameter = findParameter(node, key);
                if (parameter == null) {
                    throw new Exception(Messages.getString("AiJobService.unknownParameter", key, node.getUniqueName(), //$NON-NLS-1$
                            String.join(", ", getParameterNames(node)))); //$NON-NLS-1$
                }
                Object requested = params.get(key);
                Object value = convertValue(parameter, requested);
                run(new PropertyChangeCommand(node, parameter.getName(), value),
                        Messages.getString("AiJobService.cannotSet", parameter.getName())); //$NON-NLS-1$
                // the requested value (e.g. INFO) is more readable than the internal value of a list (e.g. 3)
                changed.add(parameter.getName() + "=" + truncate(String.valueOf(requested))); //$NON-NLS-1$
            }
            return String.join(", ", changed); //$NON-NLS-1$
        }

        private String connect(JSONObject action) throws Exception {
            Node source = resolveNode(action.optString("from", "")); //$NON-NLS-1$ //$NON-NLS-2$
            Node target = resolveNode(action.optString("to", "")); //$NON-NLS-1$ //$NON-NLS-2$
            String typeName = action.optString("type", "ON_SUBJOB_OK"); //$NON-NLS-1$ //$NON-NLS-2$
            EConnectionType type = parseConnectionType(typeName);
            INodeConnector connector = source.getConnectorFromType(type);
            if (connector == null) {
                throw new Exception(Messages.getString("AiJobService.noConnector", source.getUniqueName(), typeName)); //$NON-NLS-1$
            }
            // the name of a data flow is generated by the command (row1...), the name of a trigger from its type
            String connectionName = type.hasConnectionCategory(IConnectionCategory.FLOW) ? null
                    : ConnectionUtil.generateUniqueConnectionName(type, process, connector);
            List<Object> args = new ArrayList<>();
            args.add(null);
            args.add(connectionName);
            args.add(null);
            ConnectionCreateCommand command = new ConnectionCreateCommand(source, connector.getName(), args);
            command.setTarget(target);
            run(command, Messages.getString("AiJobService.cannotConnect", source.getUniqueName(), target.getUniqueName(), //$NON-NLS-1$
                    typeName));

            String condition = action.optString("condition", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!condition.isEmpty()) {
                IConnection created = null;
                for (IConnection connection : source.getOutgoingConnections()) {
                    if (connection.getTarget() == target && connection.getLineStyle() == type) {
                        created = connection;
                    }
                }
                if (created != null && created.getElementParameter("CONDITION") != null) { //$NON-NLS-1$
                    run(new PropertyChangeCommand(created, "CONDITION", condition), //$NON-NLS-1$
                            Messages.getString("AiJobService.cannotSet", "CONDITION")); //$NON-NLS-1$ //$NON-NLS-2$
                }
            }
            return Messages.getString("AiJobService.connected", source.getUniqueName(), target.getUniqueName(), //$NON-NLS-1$
                    type.name());
        }

        private String deleteComponent(JSONObject action) throws Exception {
            Node node = resolveNode(action.optString("component", "")); //$NON-NLS-1$ //$NON-NLS-2$
            String uniqueName = node.getUniqueName();
            run(new DeleteNodeContainerCommand(process, Collections.singletonList((INode) node)),
                    Messages.getString("AiJobService.cannotDelete", uniqueName)); //$NON-NLS-1$
            return Messages.getString("AiJobService.deleted", uniqueName); //$NON-NLS-1$
        }

        /** The connection given by its name ("connection": "row1"), or by its components ("from", "to", "type") */
        private String deleteConnection(JSONObject action) throws Exception {
            String name = action.optString("connection", ""); //$NON-NLS-1$ //$NON-NLS-2$
            String from = action.optString("from", ""); //$NON-NLS-1$ //$NON-NLS-2$
            String to = action.optString("to", ""); //$NON-NLS-1$ //$NON-NLS-2$
            EConnectionType type = action.optString("type", "").isEmpty() ? null //$NON-NLS-1$ //$NON-NLS-2$
                    : parseConnectionType(action.optString("type", "")); //$NON-NLS-1$ //$NON-NLS-2$
            Node source = from.isEmpty() ? null : resolveNode(from);
            Node target = to.isEmpty() ? null : resolveNode(to);
            Connection found = null;
            for (INode node : process.getGraphicalNodes()) {
                for (IConnection connection : node.getOutgoingConnections()) {
                    boolean matches = name.isEmpty() ? (source == null || connection.getSource() == source)
                            && (target == null || connection.getTarget() == target)
                            && (type == null || connection.getLineStyle() == type)
                            : name.equalsIgnoreCase(connection.getName()) || name.equalsIgnoreCase(connection.getUniqueName());
                    if (matches && connection instanceof Connection && connection.getTarget() != null) {
                        found = (Connection) connection;
                    }
                }
            }
            String description = name.isEmpty() ? from + " -> " + to : name; //$NON-NLS-1$
            if (found == null || (name.isEmpty() && source == null && target == null)) {
                throw new Exception(Messages.getString("AiJobService.unknownConnection", description)); //$NON-NLS-1$
            }
            String deleted = describeConnection(found);
            run(new ConnectionDeleteCommand(Collections.singletonList(found)),
                    Messages.getString("AiJobService.cannotDeleteConnection", description)); //$NON-NLS-1$
            return Messages.getString("AiJobService.connectionDeleted", deleted); //$NON-NLS-1$
        }

        private String addNote(JSONObject action) throws Exception {
            Note note = new Note();
            note.setText(action.optString("text", "")); //$NON-NLS-1$ //$NON-NLS-2$
            run(new CreateNoteCommand(process, note, getNewNoteLocation(action)), Messages.getString("AiJobService.cannotAddNote")); //$NON-NLS-1$
            String ref = action.optString("ref", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!ref.isEmpty()) {
                noteRefs.put(ref, note);
            }
            List<String> changed = setNoteProperties(note, action, false);
            String id = getNoteId(process.getNotes().indexOf(note));
            return Messages.getString("AiJobService.noteAdded", id) //$NON-NLS-1$
                    + (changed.isEmpty() ? "" : " " + String.join(", ", changed)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }

        /** At the given position, else above the given component, else under all the elements of the job */
        private Point getNewNoteLocation(JSONObject action) throws Exception {
            if (action.opt("x") != null && action.opt("y") != null) { //$NON-NLS-1$ //$NON-NLS-2$
                return new Point(action.optInt("x"), action.optInt("y")); //$NON-NLS-1$ //$NON-NLS-2$
            }
            String near = action.optString("near", ""); //$NON-NLS-1$ //$NON-NLS-2$
            if (!near.isEmpty()) {
                Node node = resolveNode(near);
                return new Point(node.getLocation().x, Math.max(0, node.getLocation().y - NOTE_SPACING));
            }
            Integer minX = null;
            int maxY = -1;
            for (INode node : process.getGraphicalNodes()) {
                if (node instanceof Node && ((Node) node).getLocation() != null) {
                    Point location = ((Node) node).getLocation();
                    minX = minX == null ? location.x : Math.min(minX, location.x);
                    maxY = Math.max(maxY, location.y);
                }
            }
            for (Note note : process.getNotes()) {
                if (note.getLocation() != null) {
                    minX = minX == null ? note.getLocation().x : Math.min(minX, note.getLocation().x);
                    maxY = Math.max(maxY, note.getLocation().y + (note.getSize() == null ? 0 : note.getSize().height));
                }
            }
            return minX == null ? new Point(128, 64) : new Point(minX, maxY + NOTE_SPACING);
        }

        private String updateNote(JSONObject action) throws Exception {
            Note note = resolveNote(action.optString("note", "")); //$NON-NLS-1$ //$NON-NLS-2$
            List<String> changed = setNoteProperties(note, action, true);
            if (changed.isEmpty()) {
                throw new Exception(Messages.getString("AiJobService.nothingToChange")); //$NON-NLS-1$
            }
            return Messages.getString("AiJobService.noteChanged", action.optString("note", ""), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    String.join(", ", changed)); //$NON-NLS-1$
        }

        /**
         * Text, position, size, colors and font of a note
         *
         * @param withText false if the text was already set (new note)
         * @return the summary of the changes
         */
        private List<String> setNoteProperties(Note note, JSONObject action, boolean withText) throws Exception {
            List<String> changed = new ArrayList<>();
            if (withText && action.has("text")) { //$NON-NLS-1$
                run(new ChangeNoteTextCommand(note, action.optString("text", "")), //$NON-NLS-1$ //$NON-NLS-2$
                        Messages.getString("AiJobService.cannotSet", "text")); //$NON-NLS-1$ //$NON-NLS-2$
                changed.add("text=\"" + truncate(note.getText()) + "\""); //$NON-NLS-1$ //$NON-NLS-2$
            }
            if (withText && action.opt("x") != null && action.opt("y") != null) { //$NON-NLS-1$ //$NON-NLS-2$
                Point location = new Point(action.optInt("x"), action.optInt("y")); //$NON-NLS-1$ //$NON-NLS-2$
                run(new MoveNoteCommand(note, location), Messages.getString("AiJobService.cannotSet", "position")); //$NON-NLS-1$ //$NON-NLS-2$
                changed.add("position=" + location.x + "," + location.y); //$NON-NLS-1$ //$NON-NLS-2$
            }
            if (action.opt("width") != null || action.opt("height") != null) { //$NON-NLS-1$ //$NON-NLS-2$
                Dimension current = note.getSize();
                Dimension size = new Dimension(action.optInt("width", current.width), action.optInt("height", current.height)); //$NON-NLS-1$ //$NON-NLS-2$
                run(new ResizeNoteCommand(note, size), Messages.getString("AiJobService.cannotSet", "size")); //$NON-NLS-1$ //$NON-NLS-2$
                changed.add("size=" + size.width + "x" + size.height); //$NON-NLS-1$ //$NON-NLS-2$
            }
            setNoteParameter(note, action, "color", EParameterName.NOTE_COLOR, true, changed); //$NON-NLS-1$
            setNoteParameter(note, action, "text_color", EParameterName.NOTETXT_COLOR, true, changed); //$NON-NLS-1$
            setNoteParameter(note, action, "border_color", EParameterName.NOTE_LINECOLOR, true, changed); //$NON-NLS-1$
            setNoteParameter(note, action, "font_size", EParameterName.FONT_SIZE, false, changed); //$NON-NLS-1$
            setNoteParameter(note, action, "font", EParameterName.NOTE_FONT, false, changed); //$NON-NLS-1$
            if (action.has("bold")) { //$NON-NLS-1$
                run(new PropertyChangeCommand(note, EParameterName.FONT_BOLD.getName(), action.optBoolean("bold")), //$NON-NLS-1$
                        Messages.getString("AiJobService.cannotSet", "bold")); //$NON-NLS-1$ //$NON-NLS-2$
                changed.add("bold=" + action.optBoolean("bold")); //$NON-NLS-1$ //$NON-NLS-2$
            }
            if (action.has("italic")) { //$NON-NLS-1$
                run(new PropertyChangeCommand(note, EParameterName.FONT_ITALIC.getName(), action.optBoolean("italic")), //$NON-NLS-1$
                        Messages.getString("AiJobService.cannotSet", "italic")); //$NON-NLS-1$ //$NON-NLS-2$
                changed.add("italic=" + action.optBoolean("italic")); //$NON-NLS-1$ //$NON-NLS-2$
            }
            return changed;
        }

        private void setNoteParameter(Note note, JSONObject action, String key, EParameterName parameter, boolean color,
                List<String> changed) throws Exception {
            if (!action.has(key)) {
                return;
            }
            String value = action.optString(key, ""); //$NON-NLS-1$
            Object converted = color ? parseColor(value) : value;
            run(new PropertyChangeCommand(note, parameter.getName(), converted),
                    Messages.getString("AiJobService.cannotSet", key)); //$NON-NLS-1$
            changed.add(key + "=" + value); //$NON-NLS-1$
        }

        private String deleteNote(JSONObject action) throws Exception {
            String id = action.optString("note", ""); //$NON-NLS-1$ //$NON-NLS-2$
            Note note = resolveNote(id);
            run(new DeleteNoteCommand(process, Collections.singletonList(note)),
                    Messages.getString("AiJobService.cannotDeleteNote", id)); //$NON-NLS-1$
            return Messages.getString("AiJobService.noteDeleted", id, truncate(note.getText())); //$NON-NLS-1$
        }

        /** By "ref" of a note added by the actions, or by id of the description (note1, note2...) */
        private Note resolveNote(String id) throws Exception {
            if (noteRefs.containsKey(id)) {
                return noteRefs.get(id);
            }
            String normalized = id.trim().toLowerCase(Locale.ROOT);
            if (normalized.startsWith(NOTE_ID_PREFIX)) {
                try {
                    int index = Integer.parseInt(normalized.substring(NOTE_ID_PREFIX.length()).trim()) - 1;
                    if (index >= 0 && index < initialNotes.size() && process.getNotes().contains(initialNotes.get(index))) {
                        return initialNotes.get(index);
                    }
                } catch (NumberFormatException e) {
                    // not an id
                }
            }
            throw new Exception(Messages.getString("AiJobService.unknownNote", id)); //$NON-NLS-1$
        }

        /** By "ref" of a component added by the actions, unique name or label */
        private Node resolveNode(String name) throws Exception {
            if (refs.containsKey(name)) {
                return refs.get(name);
            }
            INode node = process.getNodeByUniqueName(name);
            if (node instanceof Node) {
                return (Node) node;
            }
            for (INode graphicalNode : process.getGraphicalNodes()) {
                if (graphicalNode instanceof Node && (name.equalsIgnoreCase(graphicalNode.getUniqueName())
                        || name.equalsIgnoreCase(graphicalNode.getLabel()))) {
                    return (Node) graphicalNode;
                }
            }
            throw new Exception(Messages.getString("AiJobService.unknownNode", name)); //$NON-NLS-1$
        }
    }

    /** By name (ON_SUBJOB_OK), by Talend name (SUBJOB_OK) or by menu name (OnSubjobOk), "main" for the main flow */
    private static EConnectionType parseConnectionType(String name) throws Exception {
        String normalized = normalize(name);
        if ("main".equals(normalized) || "flow".equals(normalized)) { //$NON-NLS-1$ //$NON-NLS-2$
            return EConnectionType.FLOW_MAIN;
        }
        for (EConnectionType type : EConnectionType.values()) {
            if (normalized.equals(normalize(type.name())) || normalized.equals(normalize(type.getName()))
                    || normalized.equals(normalize(type.getDefaultMenuName()))) {
                return type;
            }
        }
        throw new Exception(Messages.getString("AiJobService.unknownConnectionType", name)); //$NON-NLS-1$
    }

    /** "#RRGGBB", "R;G;B" or "R,G,B" to the format of the note colors "R;G;B" */
    private static String parseColor(String value) throws Exception {
        String text = value.trim();
        try {
            if (text.startsWith("#") && text.length() == 7) { //$NON-NLS-1$
                int rgb = Integer.parseInt(text.substring(1), 16);
                return ((rgb >> 16) & 0xFF) + ";" + ((rgb >> 8) & 0xFF) + ";" + (rgb & 0xFF); //$NON-NLS-1$ //$NON-NLS-2$
            }
            String[] parts = text.split("[;,]"); //$NON-NLS-1$
            if (parts.length == 3) {
                StringBuilder color = new StringBuilder();
                for (String part : parts) {
                    int component = Integer.parseInt(part.trim());
                    if (component < 0 || component > 255) {
                        throw new NumberFormatException();
                    }
                    color.append(color.length() == 0 ? "" : ";").append(component); //$NON-NLS-1$ //$NON-NLS-2$
                }
                return color.toString();
            }
        } catch (NumberFormatException e) {
            // invalid color
        }
        throw new Exception(Messages.getString("AiJobService.invalidColor", value)); //$NON-NLS-1$
    }

    private static String normalize(String value) {
        return value == null ? "" : value.replaceAll("[^A-Za-z0-9]", "").toLowerCase(Locale.ROOT); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }

    private static IElementParameter findParameter(Node node, String name) {
        IElementParameter parameter = node.getElementParameter(name);
        if (parameter != null && EDITABLE_TYPES.contains(parameter.getFieldType())) {
            return parameter;
        }
        for (IElementParameter candidate : getEditableParameters(node)) {
            if (candidate.getName().equalsIgnoreCase(name) || name.equalsIgnoreCase(candidate.getDisplayName())) {
                return candidate;
            }
        }
        return null;
    }

    /** CHECK: boolean, CLOSED_LIST: value of the item given by its value, code or label, else the text */
    private static Object convertValue(IElementParameter parameter, Object value) throws Exception {
        String text = String.valueOf(value);
        if (parameter.getFieldType() == EParameterFieldType.CHECK) {
            return Boolean.valueOf(text);
        }
        if (parameter.getFieldType() == EParameterFieldType.CLOSED_LIST) {
            Object[] values = parameter.getListItemsValue();
            String[] codes = parameter.getListItemsDisplayCodeName();
            String[] labels = parameter.getListItemsDisplayName();
            for (int i = 0; values != null && i < values.length; i++) {
                if (text.equalsIgnoreCase(String.valueOf(values[i])) || (codes != null && i < codes.length && text.equalsIgnoreCase(codes[i]))
                        || (labels != null && i < labels.length && text.equalsIgnoreCase(labels[i]))) {
                    return values[i];
                }
            }
            throw new Exception(Messages.getString("AiJobService.invalidListValue", text, parameter.getName(), //$NON-NLS-1$
                    String.join(", ", getListItems(parameter)))); //$NON-NLS-1$
        }
        return text;
    }

    /** Basic parameters shown in the component view, which can be described and changed (not the passwords) */
    private static List<IElementParameter> getEditableParameters(INode node) {
        List<IElementParameter> parameters = new ArrayList<>();
        List<? extends IElementParameter> all = node.getElementParameters();
        for (IElementParameter parameter : all) {
            if (parameter.getCategory() == EComponentCategory.BASIC && EDITABLE_TYPES.contains(parameter.getFieldType())
                    && parameter.isShow(all) && !parameter.isReadOnly()) {
                parameters.add(parameter);
            }
        }
        return parameters;
    }

    private static List<String> getParameterNames(INode node) {
        List<String> names = new ArrayList<>();
        for (IElementParameter parameter : getEditableParameters(node)) {
            names.add(parameter.getName());
        }
        return names;
    }

    private static List<String> getListItems(IElementParameter parameter) {
        List<String> items = new ArrayList<>();
        String[] codes = parameter.getListItemsDisplayCodeName();
        for (int i = 0; codes != null && i < codes.length && i < MAX_LIST_ITEMS; i++) {
            items.add(codes[i]);
        }
        return items;
    }

    private static String truncate(String value) {
        String oneLine = value.replace('\n', ' ').replace('\r', ' ');
        return oneLine.length() > MAX_VALUE_LENGTH ? oneLine.substring(0, MAX_VALUE_LENGTH) + "..." : oneLine; //$NON-NLS-1$
    }

    /** The job editor of the active page (the last active editor, even when the assistant view has the focus) */
    private static AbstractMultiPageTalendEditor getActiveJobEditor() {
        if (!PlatformUI.isWorkbenchRunning()) {
            return null;
        }
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window == null && PlatformUI.getWorkbench().getWorkbenchWindowCount() > 0) {
            window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
        }
        IWorkbenchPage page = window == null ? null : window.getActivePage();
        IEditorPart editor = page == null ? null : page.getActiveEditor();
        return editor instanceof AbstractMultiPageTalendEditor ? (AbstractMultiPageTalendEditor) editor : null;
    }
}

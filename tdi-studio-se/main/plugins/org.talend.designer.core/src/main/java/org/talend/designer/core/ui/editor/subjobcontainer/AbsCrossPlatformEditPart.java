// ============================================================================
//
// Copyright (C) 2006-2023 Talaxie Inc. - www.deilink.fr
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talaxie SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.editor.subjobcontainer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.talend.core.model.process.Element;
import org.talend.designer.core.ui.editor.ICrossPlatformPartFactory;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformEditPartViewer;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformEditPolicy;
import org.talend.designer.core.ui.editor.nodes.ICrossPlatformFigure;


/**
 * DOC cmeng  class global comment. Detailled comment
 */
public abstract class AbsCrossPlatformEditPart implements ICrossPlatformEditPart, PropertyChangeListener {

    /**
     * This flag is set during {@link #activate()}, and reset on
     * {@link #deactivate()}
     */
    protected static final int FLAG_ACTIVE = 1;

    /**
     * This flag indicates that the EditPart has focus.
     */
    protected static final int FLAG_FOCUS = 2;

    /**
     * The left-most bit that is reserved by this class for setting flags.
     * Subclasses may define additional flags starting at
     * <code>(MAX_FLAG << 1)</code>.
     */
    protected static final int MAX_FLAG = FLAG_FOCUS;

    private int flags;

    private Object model;

    private ICrossPlatformEditPart parentPart;

    private List<Object> children = new ArrayList<>();

    private ICrossPlatformEditPartViewer crossPlatformViewer;

    private ICrossPlatformFigure crossPlatformFigure;

    private Map<Object, ICrossPlatformEditPolicy> policyMap = new LinkedHashMap<>();

    private Map<Class, Collection<Object>> eventListenerMap = new HashMap<>();

    private ICrossPlatformEditPartListener editPartListener;

    private ICrossPlatformNodeListener nodeListener;

    private List sourceConnections = new LinkedList<>();

    private List targetConnections = new LinkedList<>();

//    private static ICrossPlatformPartFactory partFactory = new CrossPlatformPartFactory();

    public AbsCrossPlatformEditPart(Object model) {
        this.model = model;
        createEditPolicies();
    }

    protected ICrossPlatformEditPartListener createEditPartListener() {
        return null;
    }

    protected ICrossPlatformNodeListener createNodeListener() {
        return null;
    }

    protected void addEditPartListener(ICrossPlatformEditPartListener listener) {
        addEventListener(ICrossPlatformEditPartListener.class, listener);
    }

    protected void removeEditPartListener(ICrossPlatformEditPartListener listener) {
        removeEventListener(ICrossPlatformEditPartListener.class, listener);
    }

    protected void addEventListener(Class clazz, Object listener) {
        Collection<Object> listeners = eventListenerMap.get(clazz);
        if (listeners == null) {
            listeners = new LinkedHashSet<>();
            eventListenerMap.put(clazz, listeners);
        }
        listeners.add(listener);
    }

    protected void removeEventListener(Class clazz, Object listener) {
        Collection<Object> listeners = eventListenerMap.get(clazz);
        if (listeners != null) {
            listeners.remove(listener);
            if (listeners.isEmpty()) {
                eventListenerMap.remove(clazz);
            }
        }
    }

    protected <T> Collection<T> getEventListeners(Class<T> clazz) {
        return (Collection<T>) eventListenerMap.get(clazz);
    }

    protected void fireActivated() {
        Collection<ICrossPlatformEditPartListener> eventListeners = getEventListeners(ICrossPlatformEditPartListener.class);
        if (eventListeners == null) {
            return;
        }
        for (ICrossPlatformEditPartListener obj : eventListeners) {
            obj.partActivated(this);
        }
    }

    protected void fireDeactivated() {
        Collection<ICrossPlatformEditPartListener> eventListeners = getEventListeners(ICrossPlatformEditPartListener.class);
        if (eventListeners == null) {
            return;
        }
        for (ICrossPlatformEditPartListener obj : eventListeners) {
            obj.partDeactivated(this);
        }
    }

    protected void fireSelectionChanged() {
        Collection<ICrossPlatformEditPartListener> eventListeners = getEventListeners(ICrossPlatformEditPartListener.class);
        if (eventListeners == null) {
            return;
        }
        for (ICrossPlatformEditPartListener obj : eventListeners) {
            obj.selectedStateChanged(this);
        }
    }

    protected void fireChildAdded(ICrossPlatformEditPart child, int index) {
        Collection<ICrossPlatformEditPartListener> eventListeners = getEventListeners(ICrossPlatformEditPartListener.class);
        if (eventListeners == null) {
            return;
        }
        for (ICrossPlatformEditPartListener obj : eventListeners) {
            obj.childAdded(child, index);
        }
    }

    protected void fireRemovingChild(ICrossPlatformEditPart child, int index) {
        Collection<ICrossPlatformEditPartListener> eventListeners = getEventListeners(ICrossPlatformEditPartListener.class);
        if (eventListeners == null) {
            return;
        }
        for (ICrossPlatformEditPartListener obj : eventListeners) {
            obj.removingChild(child, index);
        }
    }

    protected void refreshCrossPlatformChildren() {
        int i;
        ICrossPlatformEditPart editPart;
        Object model;

        List children = getCrossPlatformChildren();
        int size = children.size();
        Map modelToEditPart = Collections.EMPTY_MAP;
        if (size > 0) {
            modelToEditPart = new HashMap(size);
            for (i = 0; i < size; i++) {
                editPart = (ICrossPlatformEditPart) children.get(i);
                modelToEditPart.put(editPart.getCrossPlatformModel(), editPart);
            }
        }

        List modelObjects = getCrossPlatformModelChildren();
        for (i = 0; i < modelObjects.size(); i++) {
            model = modelObjects.get(i);

            // Do a quick check to see if editPart[i] == model[i]
            if (i < children.size() && ((ICrossPlatformEditPart) children.get(i)).getCrossPlatformModel() == model) {
                continue;
            }

            // Look to see if the EditPart is already around but in the
            // wrong location
            editPart = (ICrossPlatformEditPart) modelToEditPart.get(model);

            if (editPart != null) {
                reorderChild(editPart, i);
            } else {
                // An EditPart for this model doesn't exist yet. Create and
                // insert one.
                editPart = createChild(model);
                addChild(editPart, i);
            }
        }

        // remove the remaining EditParts
        size = children.size();
        if (i < size) {
            List trash = new ArrayList(size - i);
            for (; i < size; i++) {
                trash.add(children.get(i));
            }
            for (i = 0; i < trash.size(); i++) {
                ICrossPlatformEditPart ep = (ICrossPlatformEditPart) trash.get(i);
                removeChild(ep);
            }
        }
    }

    @Override
    public void refreshCrossPlatformVisuals() {
    }

    @Override
    public void crossPlatformRefresh() {
        refreshCrossPlatformVisuals();
        refreshCrossPlatformChildren();
        refreshSourceConnections();
        refreshTargetConnections();
    }

    @Override
    public List getCrossPlatformSourceConnections() {
        return this.sourceConnections;
    }

    @Override
    public List getCrossPlatformTargetConnections() {
        return this.targetConnections;
    }

    protected void refreshSourceConnections() {
        int i;
        ICrossPlatformConnectionEditPart editPart;
        Object model;

        List sourceConnections = getSourceConnections();
        int size = sourceConnections.size();
        Map modelToEditPart = Collections.EMPTY_MAP;
        if (size > 0) {
            modelToEditPart = new HashMap(size);
            for (i = 0; i < size; i++) {
                editPart = (ICrossPlatformConnectionEditPart) sourceConnections.get(i);
                modelToEditPart.put(editPart.getCrossPlatformModel(), editPart);
            }
        }

        List modelObjects = getCrossPlatformModelSourceConnections();
        if (modelObjects == null) {
            modelObjects = Collections.EMPTY_LIST;
        }
        for (i = 0; i < modelObjects.size(); i++) {
            model = modelObjects.get(i);

            if (i < sourceConnections.size() && ((EditPart) sourceConnections.get(i)).getModel() == model)
                continue;

            editPart = (ICrossPlatformConnectionEditPart) modelToEditPart.get(model);
            if (editPart != null) {
                reorderSourceConnection(editPart, i);
            } else {
                editPart = createOrFindConnection(model);
                addSourceConnection(editPart, i);
            }
        }

        // Remove the remaining EditParts
        size = sourceConnections.size();
        if (i < size) {
            List trash = new ArrayList(size - i);
            for (; i < size; i++) {
                trash.add(sourceConnections.get(i));
            }
            for (i = 0; i < trash.size(); i++) {
                removeSourceConnection((ICrossPlatformConnectionEditPart) trash.get(i));
            }
        }
    }

    protected ICrossPlatformConnectionEditPart createOrFindConnection(Object model) {
        ICrossPlatformConnectionEditPart conx = (ICrossPlatformConnectionEditPart) getCrossPlatformRoot()
                .getCrossPlatformEditPartRegistry().get(model);
        if (conx != null) {
            return conx;
        }
        return createConnection(model);
    }

    protected ICrossPlatformConnectionEditPart createConnection(Object model) {
        return (ICrossPlatformConnectionEditPart) getCrossPlatformRoot().getCrossPlatformPartFactory().createEditPart(this,
                model);
    }

    protected void reorderSourceConnection(ICrossPlatformConnectionEditPart connection, int index) {
        primRemoveSourceConnection(connection);
        primAddSourceConnection(connection, index);
    }

    protected void primAddSourceConnection(ICrossPlatformConnectionEditPart connection, int index) {
        if (sourceConnections == null) {
            sourceConnections = new ArrayList();
        }
        sourceConnections.add(index, connection);
    }

    protected void addSourceConnection(ICrossPlatformConnectionEditPart connection, int index) {
        primAddSourceConnection(connection, index);

        ICrossPlatformEditPart source = (ICrossPlatformEditPart) connection.getCrossPlatformSource();
        if (source != null) {
            source.getCrossPlatformSourceConnections().remove(connection);
        }

        connection.setCrossPlatformSource(this);
        if (isCrossPlatformActive()) {
            connection.crossPlatformActivate();
        }
        fireSourceConnectionAdded(connection, index);
    }

    protected void fireSourceConnectionAdded(ICrossPlatformConnectionEditPart connection, int index) {
        Collection<ICrossPlatformNodeListener> listeners = getEventListeners(ICrossPlatformNodeListener.class);
        if (listeners == null) {
            return;
        }
        for (ICrossPlatformNodeListener listener : listeners) {
            listener.sourceConnectionAdded(connection, index);
        }
    }

    protected void removeSourceConnection(ICrossPlatformConnectionEditPart connection) {
        fireRemovingSourceConnection(connection, getSourceConnections().indexOf(connection));
        if (connection.getCrossPlatformSource() == this) {
            connection.crossPlatformDeactivate();
            connection.setCrossPlatformSource(null);
        }
        primRemoveSourceConnection(connection);
    }

    protected void fireRemovingSourceConnection(ICrossPlatformConnectionEditPart connection, int index) {
        Collection<ICrossPlatformNodeListener> listeners = getEventListeners(ICrossPlatformNodeListener.class);
        if (listeners == null) {
            return;
        }
        for (ICrossPlatformNodeListener listener : listeners) {
            listener.removingSourceConnection(connection, index);
        }
    }

    protected void primRemoveSourceConnection(ICrossPlatformConnectionEditPart connection) {
        sourceConnections.remove(connection);
    }

    protected void refreshTargetConnections() {
        int i;
        ICrossPlatformConnectionEditPart editPart;
        Object model;

        List targetConnections = getTargetConnections();
        int size = targetConnections.size();
        Map modelToEditPart = Collections.EMPTY_MAP;
        if (size > 0) {
            modelToEditPart = new HashMap(size);
            for (i = 0; i < size; i++) {
                editPart = (ICrossPlatformConnectionEditPart) targetConnections.get(i);
                modelToEditPart.put(editPart.getCrossPlatformModel(), editPart);
            }
        }

        List modelObjects = getCrossPlatformModelTargetConnections();
        if (modelObjects == null) {
            modelObjects = Collections.EMPTY_LIST;
        }
        for (i = 0; i < modelObjects.size(); i++) {
            model = modelObjects.get(i);

            if (i < targetConnections.size() && ((EditPart) targetConnections.get(i)).getModel() == model) {
                continue;
            }

            editPart = (ICrossPlatformConnectionEditPart) modelToEditPart.get(model);
            if (editPart != null) {
                reorderTargetConnection(editPart, i);
            } else {
                editPart = createOrFindConnection(model);
                addTargetConnection(editPart, i);
            }
        }

        // Remove the remaining EditParts
        size = targetConnections.size();
        if (i < size) {
            List trash = new ArrayList(size - i);
            for (; i < size; i++) {
                trash.add(targetConnections.get(i));
            }
            for (i = 0; i < trash.size(); i++) {
                removeTargetConnection((ICrossPlatformConnectionEditPart) trash.get(i));
            }
        }
    }

    protected void reorderTargetConnection(ICrossPlatformConnectionEditPart connection, int index) {
        primRemoveTargetConnection(connection);
        primAddTargetConnection(connection, index);
    }

    protected void removeTargetConnection(ICrossPlatformConnectionEditPart connection) {
        fireRemovingTargetConnection(connection, getTargetConnections().indexOf(connection));
        if (connection.getCrossPlatformTarget() == this) {
            connection.setCrossPlatformTarget(null);
        }
        primRemoveTargetConnection(connection);
    }

    protected void fireRemovingTargetConnection(ICrossPlatformConnectionEditPart connection, int index) {
        Collection<ICrossPlatformNodeListener> listeners = getEventListeners(ICrossPlatformNodeListener.class);
        if (listeners == null) {
            return;
        }
        for (ICrossPlatformNodeListener listener : listeners) {
            listener.removingTargetConnection(connection, index);
        }
    }

    protected void primRemoveTargetConnection(ICrossPlatformConnectionEditPart connection) {
        targetConnections.remove(connection);
    }

    protected void addTargetConnection(ICrossPlatformConnectionEditPart connection, int index) {
        primAddTargetConnection(connection, index);

        ICrossPlatformEditPart target = (ICrossPlatformEditPart) connection.getCrossPlatformTarget();
        if (target != null) {
            target.getCrossPlatformTargetConnections().remove(connection);
        }

        connection.setCrossPlatformTarget(this);
        fireTargetConnectionAdded(connection, index);
    }

    protected void primAddTargetConnection(ICrossPlatformConnectionEditPart connection, int index) {
        if (targetConnections == null) {
            targetConnections = new ArrayList();
        }
        targetConnections.add(index, connection);
    }

    protected void fireTargetConnectionAdded(ICrossPlatformConnectionEditPart connection, int index) {
        Collection<ICrossPlatformNodeListener> listeners = getEventListeners(ICrossPlatformNodeListener.class);
        if (listeners == null) {
            return;
        }
        for (ICrossPlatformNodeListener listener : listeners) {
            listener.targetConnectionAdded(connection, index);
        }
    }

    public List getSourceConnections() {
        if (sourceConnections == null) {
            return Collections.EMPTY_LIST;
        }
        return sourceConnections;
    }

    public List getTargetConnections() {
        if (targetConnections == null) {
            return Collections.EMPTY_LIST;
        }
        return targetConnections;
    }

    protected void register() {
        registerModel();
        registerVisuals();
    }

    protected void registerModel() {
        getCrossPlatformRoot().getCrossPlatformEditPartRegistry().put(getCrossPlatformModel(), this);
    }

    protected void registerVisuals() {
    }

    protected void unregister() {
        unregisterVisuals();
        unregisterModel();
    }

    protected void unregisterVisuals() {
    }

    protected void unregisterModel() {
        Map registry = getCrossPlatformRoot().getCrossPlatformEditPartRegistry();
        if (registry.get(getCrossPlatformModel()) == this) {
            registry.remove(getCrossPlatformModel());
        }
    }

    @Override
    public void addCrossPlatformNotify() {
        registerListeners();

        register();
        createEditPolicies();
        List children = getCrossPlatformChildren();
        for (int i = 0; i < children.size(); i++) {
            ((ICrossPlatformEditPart) children.get(i)).addCrossPlatformNotify();
        }
        crossPlatformRefresh();
    }

    protected void registerListeners() {
        this.editPartListener = createEditPartListener();
        if (this.editPartListener != null) {
            addEditPartListener(editPartListener);
        }
        nodeListener = createNodeListener();
        if (nodeListener != null) {
            addEventListener(ICrossPlatformNodeListener.class, nodeListener);
        }
    }

    @Override
    public void removeCrossPlatformNotify() {
        unregisterListeners();

        List children = getCrossPlatformChildren();
        for (int i = 0; i < children.size(); i++) {
            ((ICrossPlatformEditPart) children.get(i)).removeCrossPlatformNotify();
        }
        unregister();
    }

    protected void unregisterListeners() {
        if (this.editPartListener != null) {
            removeEditPartListener(editPartListener);
        }
        if (nodeListener != null) {
            removeEventListener(ICrossPlatformNodeListener.class, nodeListener);
        }
    }

    protected void removeChildVisual(ICrossPlatformEditPart child) {
    }

    protected void addChildVisual(ICrossPlatformEditPart child, int index) {
    }

    protected void reorderChild(ICrossPlatformEditPart editpart, int index) {
        removeChildVisual(editpart);
        List children = getCrossPlatformChildren();
        children.remove(editpart);
        children.add(index, editpart);
        addChildVisual(editpart, index);
    }

    protected ICrossPlatformPartFactory getPartFactory() {
        ICrossPlatformRootEditPart root = getCrossPlatformRoot();
        if (root != null) {
            return root.getCrossPlatformPartFactory();
        }
        return null;
    }

    protected ICrossPlatformEditPart createChild(Object model) {
        return getPartFactory().createEditPart(this, model);
    }

    protected void addChild(ICrossPlatformEditPart child, int index) {
        if (index == -1) {
            index = getCrossPlatformChildren().size();
        }
        if (children == null) {
            children = new ArrayList(2);
        }

        children.add(index, child);
        child.setCrossPlatformParentPart(this);
        addChildVisual(child, index);
        child.addCrossPlatformNotify();
        if (isCrossPlatformActive()) {
            child.crossPlatformActivate();
        }
        fireChildAdded(child, index);
    }

    protected void removeChild(ICrossPlatformEditPart child) {
        int index = getCrossPlatformChildren().indexOf(child);
        if (index < 0) {
            return;
        }
        fireRemovingChild(child, index);
        if (isCrossPlatformActive()) {
            child.crossPlatformDeactivate();
        }
        child.removeCrossPlatformNotify();
        removeChildVisual(child);
        child.setCrossPlatformParentPart(null);
        getCrossPlatformChildren().remove(child);
    }

    @Override
    public Object getCrossPlatformModel() {
        return model;
    }

    @Override
    public void setCrossPlatformModel(Object model) {
        this.model = model;
    }

    @Override
    public ICrossPlatformEditPart getCrossPlatformParentPart() {
        return parentPart;
    }

    @Override
    public void setCrossPlatformParentPart(ICrossPlatformEditPart parentPart) {
        this.parentPart = parentPart;
    }

    public void createEditPolicies() {

    }

    public void installEditPolicy(Object role, ICrossPlatformEditPolicy editPolicy) {
        if (editPolicy != null) {
            editPolicy.setHost(this);
        }
        policyMap.put(role, editPolicy);
    }

    @Override
    public Command getCommand(ICrossPlatformRequest request) {
        Command command = null;
        for (ICrossPlatformEditPolicy policy : policyMap.values()) {
            if (command != null) {
                command = command.chain(policy.getCommand(request));
            } else {
                command = policy.getCommand(request);
            }
        }
        return command;
    }

    @Override
    public ICrossPlatformEditPartViewer getCrossPlatformViewer() {
        return crossPlatformViewer;
    }

    public void setCrossPlatformViewer(ICrossPlatformEditPartViewer viewer) {
        this.crossPlatformViewer = viewer;
    }

    @Override
    public ICrossPlatformFigure getCrossPlatformFigure() {
        return crossPlatformFigure;
    }

    public void setCrossPlatformFigure(ICrossPlatformFigure figure) {
        this.crossPlatformFigure = figure;
    }

    @Override
    public List getCrossPlatformChildren() {
        return children;
    }

    @Override
    public boolean isCrossPlatformActive() {
        return getFlag(FLAG_ACTIVE);
    }

    @Override
    public void crossPlatformActivate() {
        setFlag(FLAG_ACTIVE, true);

        activateEditPolicies();

        List c = getCrossPlatformChildren();
        for (int i = 0; i < c.size(); i++) {
            ((ICrossPlatformEditPart) c.get(i)).crossPlatformActivate();
        }

        fireActivated();
    }

    @Override
    public void crossPlatformDeactivate() {
        List c = getCrossPlatformChildren();
        for (int i = 0; i < c.size(); i++) {
            ((ICrossPlatformEditPart) c.get(i)).crossPlatformDeactivate();
        }

        deactivateEditPolicies();

        setFlag(FLAG_ACTIVE, false);
        fireDeactivated();
    }

    protected void activateEditPolicies() {
        policyMap.values().forEach(ep -> {
            ep.cpActivate();
        });
    }

    protected void deactivateEditPolicies() {
        policyMap.values().forEach(ep -> {
            ep.cpDeactivate();
        });
    }

    @Override
    public ICrossPlatformRootEditPart getCrossPlatformRoot() {
        if (getCrossPlatformParentPart() == null) {
            return null;
        }
        return getCrossPlatformParentPart().getCrossPlatformRoot();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // nothing to do
    }

    @Override
    public void crossPlatformDispose() {
        ICrossPlatformEditPart.super.crossPlatformDispose();
        Object model = getCrossPlatformModel();
        if (model instanceof Element) {
            ((Element) model).removePropertyChangeListener(this);
        }
        List children = getCrossPlatformChildren();
        if (children != null) {
            for (Object obj : children) {
                if (obj instanceof ICrossPlatformEditPart) {
                    ((ICrossPlatformEditPart) obj).crossPlatformDispose();
                }
            }
        }
        List conns = new LinkedList<>();
        List sources = getCrossPlatformSourceConnections();
        conns.addAll(sources);
        List targets = getCrossPlatformTargetConnections();
        conns.addAll(targets);
        for (Object obj : conns) {
            if (obj instanceof ICrossPlatformEditPart) {
                ((ICrossPlatformEditPart) obj).crossPlatformDispose();
            }
        }
    }

    protected final boolean getFlag(int flag) {
        return (flags & flag) != 0;
    }

    protected final void setFlag(int flag, boolean value) {
        if (value) {
            flags |= flag;
        } else {
            flags &= ~flag;
        }
    }

}

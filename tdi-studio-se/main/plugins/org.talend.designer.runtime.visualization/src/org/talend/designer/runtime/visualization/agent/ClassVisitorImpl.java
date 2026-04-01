/*******************************************************************************
 * Copyright (c) 2010 JVM Monitor project. All rights reserved.
 * 
 * This code is distributed under the terms of the Eclipse Public License v1.0 which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.talend.designer.runtime.visualization.agent;

import org.talend.designer.runtime.visualization.agent.asm.ClassAdapter;
import org.talend.designer.runtime.visualization.agent.asm.ClassWriter;
import org.talend.designer.runtime.visualization.agent.asm.MethodVisitor;

/**
 * The class visitor.
 */
@SuppressWarnings("nls")
public class ClassVisitorImpl extends ClassAdapter {

    /** the class name */
    private String className;

    /**
     * The constructor.
     * 
     * @param writer the class visitor
     * @param className the class name
     */
    protected ClassVisitorImpl(ClassWriter writer, String className) {
        super(writer);
        this.className = className;
    }

    /*
     * @see ClassAdapter#visitMethod(int, String, String, String, String[])
     */
    @Override
    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

        MethodVisitor methodVisitor = super.visitMethod(access, name, desc, signature, exceptions);

        // attach the parameter descriptor (e.g. (JI)V) to method name
        String qualifiedName = name + ((desc != null) ? desc : "");

        return new MethodVisitorImpl(methodVisitor, className, qualifiedName);
    }
}

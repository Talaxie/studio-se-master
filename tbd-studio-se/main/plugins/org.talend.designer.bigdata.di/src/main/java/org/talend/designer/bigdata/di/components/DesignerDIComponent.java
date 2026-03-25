package org.talend.designer.bigdata.di.components;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.jetbrains.annotations.NotNull;
import org.talend.core.model.process.EConnectionType;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public interface DesignerDIComponent {

    String name();

    interface BigDataDIComponent extends DesignerDIComponent {

        CodeGeneratorArgument codeGeneratorArgument();

        @NotNull
        static <T> T getParameter(final INode node, final String code, @NotNull T defaultValue) throws ClassCastException {
            return Optional.ofNullable(ElementParameterParser.getObjectValue(node, code))
                    .map(parameter -> (T) parameter)
                    .orElse(defaultValue);
        }

        @NotNull
        default <T> T getParameter(final String code, @NotNull T defaultValue) throws ClassCastException {
            return getParameter(((INode) codeGeneratorArgument().getArgument()), code, defaultValue);
        }

        default String getEncryptedParameter(final String code, String defaultValue) {
            if (ElementParameterParser.canEncrypt((INode) codeGeneratorArgument().getArgument(), code)) {
                return String.format("routines.system.PasswordEncryptUtil.decryptPassword(%1$s)", ElementParameterParser.getEncryptedValue((INode) codeGeneratorArgument().getArgument(), code));
            }
            return getParameter(code, defaultValue);
        }

        default boolean getBooleanParameter(String code, boolean defaultValue) {
            return Optional.ofNullable(ElementParameterParser.getBooleanValue((INode) codeGeneratorArgument().getArgument(), code)).orElse(defaultValue);
        }

        @NotNull
        static List<Map<String, String>> tableParameter(final INode node, final String code, @NotNull
        List<Map<String, String>> defaultValue) throws ClassCastException {
            return Optional.ofNullable(ElementParameterParser.getTableValue(node, code)).orElse(defaultValue);
        }

        static String getParameter(final IProcess process, final String uniqueName, final String code) throws ClassCastException {
            return Optional.ofNullable(ElementParameterParser.getValue(process, uniqueName, code))
                    .orElse("");
        }

        static INode getLinkedParameter(final INode node, final String code, final INode defaultValue){
            return Optional.ofNullable(ElementParameterParser.getLinkedNodeValue(node, code)).orElse(defaultValue);
        }

        @Override
        default String name() {
            return ((INode) codeGeneratorArgument().getArgument()).getUniqueName() + "Component";
        }

        default String getCid() {
            return ((INode) codeGeneratorArgument().getArgument()).getUniqueName();
        }

        default String getComponentVariable() {
            return ((INode) codeGeneratorArgument().getArgument()).getComponent().getName();
        }

        default boolean isLog4jEnabled(){
            INode iNode = ((INode) codeGeneratorArgument().getArgument());
            return getParameter(iNode.getProcess(), iNode.getUniqueName(), "__LOG4J_ACTIVATE__").equals("true");
        }
    }

    interface WithDieOnErrorOption extends BigDataDIComponent {

        default boolean dieOnError() {
            return this.getParameter("__DIE_ON_ERROR__", false);
        }
    }

    interface WithConnection extends BigDataDIComponent {

        default String getConnectionComponentName() {
            return getParameter("__CONNECTION__", "");
        }
    }

    interface WithOneInput extends BigDataDIComponent {

        default String getInputVariable() {
            INode node = (INode) codeGeneratorArgument().getArgument();
            return node.getIncomingConnections(EConnectionType.FLOW_MAIN).stream().findFirst().map(IConnection::getUniqueName).get();
        }
    }

    interface WithOneOutput extends BigDataDIComponent {

        default String getOutputVariable() {
            INode node = (INode) codeGeneratorArgument().getArgument();
            return node.getOutgoingConnections(EConnectionType.FLOW_MAIN).stream().findFirst().map(IConnection::getUniqueName).get();
        }
    }

    interface WithSchema extends BigDataDIComponent {

        default List<Schema.Field> getFields() {
            INode node = (INode) codeGeneratorArgument().getArgument();
            return node.getMetadataList().stream().findFirst().get().getListColumns().stream().map(c -> new Schema.Field(c.getLabel(), Schema.StudioToJavaType(c.getTalendType())))
                    .collect(Collectors.toList());
        }
    }
}

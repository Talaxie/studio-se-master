package org.talend.designer.mapper.utils.problems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.talend.designer.mapper.external.data.ExternalMapperData;
import org.talend.designer.mapper.external.data.ExternalMapperTable;
import org.talend.designer.mapper.external.data.ExternalMapperTableEntry;

public class DynamicMappingValidatorTest {

    private static ExternalMapperTableEntry entry(String name, String type, String expression) {
        ExternalMapperTableEntry entry = new ExternalMapperTableEntry(name, expression);
        entry.setType(type);
        return entry;
    }

    private static ExternalMapperTable table(String name, ExternalMapperTableEntry... entries) {
        ExternalMapperTable table = new ExternalMapperTable();
        table.setName(name);
        table.setMetadataTableEntries(Arrays.asList(entries));
        return table;
    }

    private static ExternalMapperData mixed() {
        ExternalMapperData data = new ExternalMapperData();
        data.getInputTables().add(table("row2", entry("AGENCE", "id_String", null), entry("SQL", "id_Dynamic", null)));
        data.getOutputTables().add(table("out", entry("AGENCE", "id_String", "row2.AGENCE.trim()"),
                entry("SQL", "id_Dynamic", "row2.SQL ")));
        ExternalMapperTable vars = new ExternalMapperTable();
        vars.setName("Var");
        data.getVarsTables().add(vars);
        return data;
    }

    @Test
    public void mixedMappingAllowsStaticExpressionsAndEmptyVariables() {
        ExternalMapperData data = mixed();
        data.getOutputTables().get(0).setExpressionFilter("row2.AGENCE != null");
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicTransformationAndRenameAreRejected() {
        for (String expression : Arrays.asList("row2.SQL.copy()", "null", "row2.AGENCE")) {
            ExternalMapperData data = mixed();
            data.getOutputTables().get(0).getMetadataTableEntries().get(1).setExpression(expression);
            assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        }
        ExternalMapperData data = mixed();
        data.getOutputTables().get(0).getMetadataTableEntries().get(1).setName("RENAMED");
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicReferenceInStaticExpressionOrFilterIsRejected() {
        ExternalMapperData data = mixed();
        data.getOutputTables().get(0).getMetadataTableEntries().get(0).setExpression("row2 . SQL.toString()");
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        data = mixed();
        data.getOutputTables().get(0).setExpressionFilter("row2.SQL != null");
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void literalTextIsNotAReferenceToTheContainer() {
        ExternalMapperData data = mixed();
        data.getOutputTables().get(0).getMetadataTableEntries().get(0).setExpression("\"row2.SQL\"");
        assertTrue(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicMustBeLastAndCannotAppearInAVariable() {
        ExternalMapperData data = mixed();
        data.getOutputTables().set(0, table("out", entry("SQL", "id_Dynamic", "row2.SQL"),
                entry("AGENCE", "id_String", "row2.AGENCE")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        data = mixed();
        data.getVarsTables().set(0, table("Var", entry("copy", "id_Dynamic", "row2.SQL")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void staticMappingDoesNotBecomeRestricted() {
        ExternalMapperData data = new ExternalMapperData();
        data.getInputTables().add(table("row", entry("ID", "id_Integer", null)));
        data.getOutputTables().add(table("out", entry("ID", "id_Integer", "row.ID + 1")));
        assertTrue(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void rejectInputCanMoveDiagnosticsBeforeTheUnchangedDynamicContainer() {
        ExternalMapperData data = new ExternalMapperData();
        data.getInputTables().add(table("reject", entry("SQL", "id_Dynamic", null),
                entry("errorCode", "id_String", null), entry("errorMessage", "id_String", null)));
        data.getOutputTables().add(table("out", entry("errorCode", "id_String", "reject.errorCode"),
                entry("errorMessage", "id_String", "reject.errorMessage"), entry("SQL", "id_Dynamic", "reject.SQL")));
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
        data.getOutputTables().set(0, table("out", entry("SQL", "id_Dynamic", "reject.SQL"),
                entry("errorCode", "id_String", "reject.errorCode"), entry("errorMessage", "id_String", "reject.errorMessage")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void multipleOutputsCanMapTheSameContainerAndUseIndependentStaticFilters() {
        ExternalMapperData data = mixed();
        ExternalMapperTable second = table("second", entry("SQL", "id_Dynamic", "row2 . SQL"));
        second.setExpressionFilter("row2.AGENCE.equals(\"0007\")");
        data.getOutputTables().add(second);
        data.getOutputTables().add(table("staticOnly", entry("AGENCE", "id_String", "row2.AGENCE")));
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicLookupCanBeMappedAndJoinedOnItsStaticKey() {
        ExternalMapperData data = mixed();
        ExternalMapperTable lookup = table("lookup", entry("ID", "id_String", "row2.AGENCE"),
                entry("SQL", "id_Dynamic", null));
        data.getInputTables().add(lookup);
        data.getOutputTables().get(0).getMetadataTableEntries().get(1).setExpression("lookup.SQL");
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
        lookup.getMetadataTableEntries().get(1).setExpression("row2.SQL");
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicLookupDoesNotRequireADynamicMainInput() {
        ExternalMapperData data = mixed();
        data.getInputTables().get(0).getMetadataTableEntries().get(1).setType("id_String");
        data.getInputTables().add(table("lookup", entry("SQL", "id_Dynamic", null)));
        data.getOutputTables().get(0).getMetadataTableEntries().get(1).setExpression("lookup.SQL");
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void eachOutputIsValidatedIndependently() {
        ExternalMapperData data = mixed();
        data.getOutputTables().add(table("bad", entry("renamed", "id_Dynamic", "row2.SQL")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        data.getOutputTables().set(1, table("bad", entry("SQL", "id_Dynamic", "row2.SQL.copy()")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void lookupFiltersAndVariablesCannotReadDynamicValues() {
        ExternalMapperData data = mixed();
        ExternalMapperTable lookup = table("lookup", entry("SQL", "id_Dynamic", null));
        data.getInputTables().add(lookup);
        lookup.setExpressionFilter("lookup.SQL != null");
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        lookup.setExpressionFilter(null);
        data.getVarsTables().get(0).setMetadataTableEntries(Arrays.asList(entry("x", "id_String", "lookup.SQL.toString()")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

    @Test
    public void dynamicVariablesAndOutputsAreInvalidEvenWithoutADynamicInput() {
        ExternalMapperData data = new ExternalMapperData();
        data.getInputTables().add(table("row", entry("ID", "id_String", null)));
        data.getVarsTables().add(table("Var", entry("x", "id_Dynamic", null)));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
        data.getVarsTables().clear();
        data.getOutputTables().add(table("out", entry("SQL", "id_Dynamic", "row.ID")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }
    @Test
    public void filterRejectDiagnosticMayFollowDynamicOnInputAndBeReorderedOnOutput() {
        ExternalMapperData data = mixed();
        data.getInputTables().get(0).setMetadataTableEntries(Arrays.asList(entry("AGENCE", "id_String", null), entry("SQL", "id_Dynamic", null), entry("errorMessage", "id_String", null)));
        assertTrue(DynamicMappingValidator.validate(data).toString(), DynamicMappingValidator.validate(data).isEmpty());
        data.getOutputTables().get(0).setMetadataTableEntries(Arrays.asList(entry("SQL", "id_Dynamic", "row2.SQL"), entry("errorMessage", "id_String", "row2.errorMessage")));
        assertFalse(DynamicMappingValidator.validate(data).isEmpty());
    }

}

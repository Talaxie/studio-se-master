package routines.system;

import static org.junit.Assert.*;
import java.io.*;
import java.math.BigDecimal;
import org.junit.Test;

public class DynamicLogRowTest {
    private Dynamic dynamic() {
        Dynamic d = new Dynamic();
        for (String name : new String[] { "Montant €", "Vide" }) {
            DynamicMetadata m = new DynamicMetadata(); m.setName(name); d.metadatas.add(m);
        }
        d.addColumnValue(new BigDecimal("1234567890123456789012345678.1234567890"));
        d.addColumnValue(null);
        return d;
    }

    @Test public void basicExpandsNamesAndValuesWithoutTrailingPhantomField() {
        ByteArrayOutputStream b = new ByteArrayOutputStream(); PrintStream out = new PrintStream(b);
        DynamicLogRow log = new DynamicLogRow("log", "title", "BASIC", ";", true, true, true, new int[0]);
        log.accept(new String[] {"ID"}, new String[] {"0007"}, dynamic(), out);
        log.accept(new String[] {"ID"}, new String[] {"0008"}, new Dynamic(), out);
        String text = b.toString();
        assertTrue(text, text.contains("ID\tMontant €\tVide"));
        assertTrue(text, text.contains("[log] ID: 0007;Montant €: 1234567890123456789012345678.1234567890;Vide: "));
        assertTrue(text, text.endsWith("[log] ID: 0008" + System.lineSeparator()));
    }

    @Test public void tableSnapshotsReusedInputAndFlushesOnSchemaChange() {
        ByteArrayOutputStream b = new ByteArrayOutputStream(); PrintStream out = new PrintStream(b);
        DynamicLogRow log = new DynamicLogRow("log", "title", "TABLE", "|", false, false, false, new int[0]);
        Dynamic d = dynamic(); log.accept(new String[0], new String[0], d, out);
        d.setColumnValue(0, BigDecimal.ZERO); log.accept(new String[0], new String[0], d, out);
        log.accept(new String[]{"Other"}, new String[]{"Été"}, null, out); log.finish(out);
        String text = b.toString();
        assertTrue(text, text.contains("1234567890123456789012345678.1234567890"));
        assertTrue(text, text.contains("Montant €")); assertTrue(text, text.contains("Other")); assertTrue(text, text.contains("Été"));
    }

    @Test public void verticalPrintsPhysicalNamesAndNull() {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DynamicLogRow log = new DynamicLogRow("log", "title", "VERTICAL", "|", false, false, false, new int[0]);
        log.accept(new String[0], new String[0], dynamic(), new PrintStream(b));
        String text = b.toString(); assertTrue(text, text.contains("#1. title"));
        assertTrue(text, text.contains("Montant €")); assertTrue(text, text.contains("null"));
    }

    @Test public void fixedWidthAndEmptyDynamicAreValid() {
        ByteArrayOutputStream b = new ByteArrayOutputStream(); PrintStream out = new PrintStream(b);
        DynamicLogRow log = new DynamicLogRow("log", "title", "BASIC", "|", false, false, false, new int[]{5});
        log.accept(new String[]{"ID"}, new String[]{"7"}, new Dynamic(), out);
        assertEquals("    7" + System.lineSeparator(), b.toString());
        assertEquals("ABC", DynamicLogRow.value(new byte[]{65,66,67}));
    }
    @Test public void rejectDiagnosticsFollowExpandedColumnsEvenForAnEmptyOrNullContainer() {
        ByteArrayOutputStream b = new ByteArrayOutputStream(); PrintStream out = new PrintStream(b);
        DynamicLogRow log = new DynamicLogRow("log", "title", "BASIC", ";", false, true, false, new int[0]);
        String[] names = {"errorMessage"}, values = {"condition failed"};
        log.accept(new String[]{"ID"}, new String[]{"7"}, dynamic(), names, values, out);
        log.accept(new String[]{"ID"}, new String[]{"8"}, null, names, values, out);
        log.accept(new String[]{"ID"}, new String[]{"9"}, new Dynamic(), names, values, out);
        String text=b.toString();
        assertTrue(text, text.contains("Vide: ;errorMessage: condition failed"));
        assertTrue(text, text.contains("ID: 8;errorMessage: condition failed"));
        assertTrue(text, text.contains("ID: 9;errorMessage: condition failed"));
    }

}

package org.talend.core.ui.metadata.dialog;

import static org.junit.Assert.*;

import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreator;
import org.talend.commons.ui.swt.tableviewer.TableViewerCreatorColumn;
import org.talend.commons.utils.data.bean.IBeanPropertyAccessors;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.MetadataColumn;
import org.talend.core.ui.i18n.Messages;
import org.talend.core.ui.metadata.editor.AbstractMetadataTableEditorView;
import org.talend.core.ui.metadata.editor.MetadataTableEditorView;

/** Tests the actual schema label provider and cell modifier, including static warning regressions. */
public class CustomTableManagerDynamicTest {
    private static Display display;
    private static boolean ownsDisplay;
    private Shell shell;
    private TableViewerCreator<IMetadataColumn> creator;
    private MetadataTableEditorView view;

    @BeforeClass
    public static void display() throws Exception {
        display = Display.getCurrent();
        ownsDisplay = display == null;
        if (ownsDisplay) display = new Display();
        for (String[] mapping : new String[][] { { "id_MSSQL", "MSSQL" }, { "oracle_id", "Oracle" },
                { "mysql_id", "Mysql" }, { "postgres_id", "Postgres" } }) {
            if (org.talend.core.model.metadata.MetadataTalendType.getMappingTypeRetriever(mapping[0]) == null) {
                java.net.URL url = org.eclipse.core.runtime.Platform.getBundle("org.talend.core.runtime")
                        .getEntry("mappings/mapping_" + mapping[1] + ".xml");
                new org.talend.core.model.metadata.MappingFileLoader().load(
                        new java.io.File(org.eclipse.core.runtime.FileLocator.toFileURL(url).toURI()));
            }
        }
    }

    @AfterClass
    public static void disposeDisplay() {
        if (ownsDisplay) display.dispose();
    }

    @Before
    public void editor() {
        shell = new Shell(display);
        creator = new TableViewerCreator<>(shell);
        TableViewerCreatorColumn<IMetadataColumn, String> dbType = new TableViewerCreatorColumn<>(creator);
        dbType.setId(AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE);
        dbType.setModifiable(true);
        dbType.setBeanPropertyAccessors(new IBeanPropertyAccessors<IMetadataColumn, String>() {
            public String get(IMetadataColumn bean) { return bean.getType(); }
            public void set(IMetadataColumn bean, String value) { bean.setType(value); }
        });
        TableViewerCreatorColumn<IMetadataColumn, String> name = new TableViewerCreatorColumn<>(creator);
        name.setId(AbstractMetadataTableEditorView.ID_COLUMN_NAME);
        name.setModifiable(true);
        name.setBeanPropertyAccessors(new IBeanPropertyAccessors<IMetadataColumn, String>() {
            public String get(IMetadataColumn bean) { return bean.getLabel(); }
            public void set(IMetadataColumn bean, String value) { bean.setLabel(value); }
        });
        creator.init(java.util.Collections.emptyList());
        view = new MetadataTableEditorView() {
            @Override
            public TableViewerCreator<IMetadataColumn> getTableViewerCreator() { return creator; }
        };
        view.setShowDbTypeColumn(true, false, true);
        view.setCurrentDbms("id_MSSQL");
        CustomTableManager.addCustomManagementToTable(view, false);
    }

    @After
    public void disposeShell() { shell.dispose(); }

    private MetadataColumn column(String type, String dbType) {
        MetadataColumn column = new MetadataColumn();
        column.setLabel("SQL");
        column.setTalendType(type);
        column.setType(dbType);
        return column;
    }

    @Test
    public void dynamicDbTypeIsLocalizedReadonlyAndDoesNotChangeStoredMetadata() {
        MetadataColumn dynamic = column("id_Dynamic", "VARCHAR");
        assertEquals(Messages.getString("CustomTableManager.DynamicDbType"),
                ((ITableLabelProvider) creator.getLabelProvider()).getColumnText(dynamic, 0));
        assertFalse(creator.getCellModifier().canModify(dynamic, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE));
        assertTrue(creator.getCellModifier().canModify(dynamic, AbstractMetadataTableEditorView.ID_COLUMN_NAME));
        assertEquals("SQL", ((ITableLabelProvider) creator.getLabelProvider()).getColumnText(dynamic, 1));
        assertEquals("VARCHAR", dynamic.getType());
        assertEquals("id_Dynamic", dynamic.getTalendType());
    }

    @Test
    public void dynamicPlaceholderNeverGetsTheStaticTypeMismatchWarning() {
        for (String dbms : new String[] { "id_MSSQL", "oracle_id", "mysql_id", "postgres_id" }) {
            view.setCurrentDbms(dbms);
            for (String placeholder : new String[] { "VARCHAR", "", "NOT_A_REAL_DB_TYPE" }) {
                MetadataColumn dynamic = column("id_Dynamic", placeholder);
                assertEquals(AbstractMetadataTableEditorView.READONLY_CELL_BG_COLOR,
                        ((ITableColorProvider) creator.getLabelProvider()).getBackground(dynamic, 0));
                assertFalse(creator.getCellModifier().canModify(dynamic, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE));
            }
        }
    }

    @Test
    public void staticDbTypesKeepTheirValueEditingAndOrangeMismatchWarning() {
        for (String[] database : new String[][] { { "id_MSSQL", "VARCHAR" }, { "oracle_id", "VARCHAR2" },
                { "mysql_id", "VARCHAR" }, { "postgres_id", "VARCHAR" } }) {
            view.setCurrentDbms(database[0]);
            MetadataColumn valid = column("id_String", database[1]);
            MetadataColumn invalid = column("id_Integer", "NOT_A_REAL_DB_TYPE");
            assertEquals(database[1], ((ITableLabelProvider) creator.getLabelProvider()).getColumnText(valid, 0));
            assertTrue(creator.getCellModifier().canModify(valid, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE));
            assertNotEquals(CustomTableManager.CELL_WRONG_DB_TYPE_COLOR,
                    ((ITableColorProvider) creator.getLabelProvider()).getBackground(valid, 0));
            assertEquals(CustomTableManager.CELL_WRONG_DB_TYPE_COLOR,
                    ((ITableColorProvider) creator.getLabelProvider()).getBackground(invalid, 0));
        }
    }

    @Test
    public void switchingBetweenDynamicAndStaticRestoresTheNativeCellBehavior() {
        MetadataColumn column = column("id_Dynamic", "VARCHAR");
        assertFalse(creator.getCellModifier().canModify(column, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE));
        column.setTalendType("id_String");
        assertTrue(creator.getCellModifier().canModify(column, AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE));
        assertEquals("VARCHAR", ((ITableLabelProvider) creator.getLabelProvider()).getColumnText(column, 0));
        column.setTalendType("id_Dynamic");
        assertEquals(Messages.getString("CustomTableManager.DynamicDbType"),
                ((ITableLabelProvider) creator.getLabelProvider()).getColumnText(column, 0));
        assertEquals("VARCHAR", column.getType());
    }
    @Test
    public void runtimeTypeTranslationsAreAvailableInEnglishAndFrench() {
        ClassLoader loader = CustomTableManager.class.getClassLoader();
        assertEquals("Determined at runtime", java.util.ResourceBundle.getBundle("messages", java.util.Locale.ROOT, loader)
                .getString("CustomTableManager.DynamicDbType"));
        assertEquals("D\u00e9termin\u00e9 \u00e0 l'ex\u00e9cution", java.util.ResourceBundle.getBundle("messages", java.util.Locale.FRANCE, loader)
                .getString("CustomTableManager.DynamicDbType"));
    }

    @Test
    public void existingDynamicSchemasUseOneThirdOfTheRuntimeLabelWidth() {
        MetadataColumn dynamic = column("id_Dynamic", "VARCHAR");
        creator.init(java.util.Collections.singletonList(dynamic));
        CustomTableManager.addCustomManagementToTable(view, false);
        org.eclipse.swt.graphics.GC graphics = new org.eclipse.swt.graphics.GC(creator.getTable());
        try {
            graphics.setFont(creator.getTable().getFont());
            while (creator.getTable().getDisplay().readAndDispatch()) {
                // Apply the width after the initial table layout.
            }
            int textWidth = graphics.textExtent(Messages.getString("CustomTableManager.DynamicDbType")).x;
            assertEquals((textWidth + 16) / 3,
                    creator.getColumn(AbstractMetadataTableEditorView.ID_COLUMN_DBTYPE).getTableColumn().getWidth());
        } finally {
            graphics.dispose();
        }
    }

}

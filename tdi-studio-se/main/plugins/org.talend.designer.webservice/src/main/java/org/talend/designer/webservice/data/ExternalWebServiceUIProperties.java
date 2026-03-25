package org.talend.designer.webservice.data;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;

public class ExternalWebServiceUIProperties {

    public static final String NUMBER_PATTERN = "[0-9]*"; //$NON-NLS-1$

    public static final String[] FILE_EXTENSIONS = new String[] { "*.wsdl", "*.*" }; //$NON-NLS-1$  //$NON-NLS-2$

    private static int[] ALL_SASHFORM_WEIGHTS = new int[] { 2, 1 };

    private static int[] HEADER_SASHFORM_WEIGHTS = new int[] { 3, 1 };

    public static final int SASHFORM_WIDTH = 3;

    public static final String FILE_LABEL = "WSDL";

    public static final String INPUT_LABEL = " Input mapping ";

    public static final String OUTPUT_LABEL = " Output mapping ";

    public static final String WSDL_LABEL = "  WSDL  ";

    public static final String PREVIEW_STRING = WSDL_LABEL + "..."; //$NON-NLS-1$

    public static final String[] SCHEMAS_TREE_COLUMN_PROPERTY = new String[] { "KEY", "RECORD" }; //$NON-NLS-1$

    public static final int DIALOG_STYLE = SWT.APPLICATION_MODAL | SWT.BORDER | SWT.RESIZE | SWT.CLOSE | SWT.MIN | SWT.MAX
            | SWT.TITLE;

    public static final String DEFAULT_COLUMN_NAME = "Column"; //$NON-NLS-1$

    private static Rectangle boundsMapper = new Rectangle(50, 50, 700, 750);

    private static boolean shellMaximized = false;

    private static boolean schemaDetailsModel = false;

    public static Rectangle getBoundsMapper() {
        return boundsMapper;
    }

    public static void setBoundsMapper(Rectangle boundsMapper) {
        ExternalWebServiceUIProperties.boundsMapper = boundsMapper;
    }

    public static boolean isShellMaximized() {
        return shellMaximized;
    }

    public static void setShellMaximized(boolean shellMaximized) {
        ExternalWebServiceUIProperties.shellMaximized = shellMaximized;
    }

    public static int[] getAllSashformWeights() {
        return ALL_SASHFORM_WEIGHTS;
    }

    public static void setAllSashformWeights(int[] allSashformWeights) {
        ALL_SASHFORM_WEIGHTS = allSashformWeights;
    }

    public static int[] getHeaderSashformWeights() {
        return HEADER_SASHFORM_WEIGHTS;
    }

    public static void setHeaderSashformWeights(int[] headerSashformWeights) {
        HEADER_SASHFORM_WEIGHTS = headerSashformWeights;
    }

    public static boolean isSchemaDetailsModel() {
        return schemaDetailsModel;
    }

    public static void setSchemaDetailsModel(boolean schemaDetailsModel) {
        ExternalWebServiceUIProperties.schemaDetailsModel = schemaDetailsModel;
    }

}

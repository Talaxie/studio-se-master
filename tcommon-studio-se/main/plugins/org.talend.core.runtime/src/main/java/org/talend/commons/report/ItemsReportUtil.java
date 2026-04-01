// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.commons.report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.Path;
import org.talend.core.utils.TalendQuoteUtils;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class ItemsReportUtil {
    

    public static boolean generateReportFile(File reportFile, String header, List<String> records) throws Exception {
        boolean generateDone = false;
        BufferedWriter printWriter = null;
        try {
            File parentFolder = new Path(reportFile.getAbsolutePath()).removeLastSegments(1).toFile();
            // File parentFolder = new File(parentPath);
            if (!parentFolder.exists()) {
                parentFolder.mkdirs();
            }
            if (!reportFile.exists()) {
                reportFile.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(reportFile);
            fos.write(new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF });
            OutputStreamWriter outputWriter = new OutputStreamWriter(fos, "UTF-8");
            printWriter = new BufferedWriter(outputWriter);
            printWriter.write(header);
            printWriter.newLine();
            for (String recordStr : records) {
                printWriter.write(recordStr);
                printWriter.newLine();
            }
            printWriter.flush();
            generateDone = true;
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
        return generateDone;
    }

    public static String handleColumnQuotes(String text) {
        String quoteMark = TalendQuoteUtils.QUOTATION_MARK;
        text = StringUtils.isBlank(text) ? "" : text;
        if (text.contains(quoteMark)) {
            // replace to double quote surround
            text = text.replace(quoteMark, quoteMark + quoteMark);
        }
        return quoteMark + text + quoteMark;
    }

    public static String getCurrentTimeString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String time = dateFormat.format(new Date());
        return time;
    }

}

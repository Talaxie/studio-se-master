package org.talend.syslog;

public class SyslogMessageUtil {

    private java.util.List<SyslogMessage> logs = null;

    private String sFileFullPath = null;

    private String locale = null;

    private int index = 0;

    private java.io.FileWriter fw = null;

    private java.io.BufferedWriter bw = null;

    public SyslogMessageUtil() {

    }

    public void setFilePath(String filePath) {
        this.sFileFullPath = filePath;
    }

    public void setLocale(String locale) {
        if (locale != null && !("".equals(locale))) {
            this.locale = locale;
        }
    }

    public java.util.List<SyslogMessage> getLogRows() {
        return this.logs;
    }

    public void read() {
        java.io.FileReader fr = null;
        java.io.BufferedReader br = null;
        int lineIndex = 1;

        try {

            if (sFileFullPath == null || "".equals(sFileFullPath)) {
                throw new IllegalArgumentException("syslog file is not specified.");
            }
            java.io.File file = new java.io.File(sFileFullPath);

            if (!file.exists()) {
                throw new java.io.FileNotFoundException("file not found");
            }
            logs = new java.util.ArrayList<SyslogMessage>();
            fr = new java.io.FileReader(sFileFullPath);
            br = new java.io.BufferedReader(fr);
            String line = null;

            while ((line = br.readLine()) != null) {
                try {
                    deserialize(line);
                } catch (Exception e) {
                    System.err.println("Line: " + lineIndex + " --> " + e.getMessage());
                }
                lineIndex++;
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (java.io.IOException ioe) {
                ioe.printStackTrace();
            }
        }

    }

    private void deserialize(final String strLine) throws Exception, RuntimeException {

        java.util.StringTokenizer tok = new java.util.StringTokenizer(strLine);
        int count = tok.countTokens();

        if (count < 5) {
            throw new java.lang.IllegalArgumentException("the format of input line is incorrect");
        }
        String[] elements = new String[count];
        SyslogMessage line = new SyslogMessage();
        int i = 0;

        while (tok.hasMoreTokens()) {
            elements[i] = tok.nextToken();
            i++;
        }

        int j = 0;
        String element = null;

        // time stamp (mandatory)
        StringBuffer sbDate = new StringBuffer();
        StringBuffer sb = new StringBuffer();

        for (j = 0; j < 3; j++) {
            element = elements[j];
            /*
             * if (j == 1 && element.length() == 1) { sb.append("0").append(element).append(" ");
             * sbDate.append(" ").append(element).append(" "); } else { sb.append(element).append(" ");
             * sbDate.append(element).append(" "); }
             */
            /* date sampler: Jan 03 16:15:04 | log sampler: Jan x3 16:15:04 */
            if (j == 1) {
                if (element.length() == 1) {
                    sbDate.append("0").append(element).append(" ");
                    sb.append(" ").append(element).append(" ");
                } else if (element.length() > 1) {
                    if (element.startsWith("0")) {
                        // sb.append(element.replaceFirst("0", " ")).append(element).append(" ");
                        /* if date element like "Jan 03 16:15:04" in syslog file, it consider as incorrect */
                        throw new java.lang.IllegalArgumentException("time stamp is incorrect");
                    } else {
                        sbDate.append(element).append(" ");
                        sb.append(element).append(" ");
                    }
                }
            } else {
                sbDate.append(element).append(" ");
                sb.append(element).append(" ");
            }

        }

        if (isDate(sbDate.toString())) {
            line.setTimeStamp(sb.deleteCharAt(sb.length() - 1).toString());
        }

        // host (mandatory)
        line.setHost(elements[3]);

        // program && [process id [optional]] -- tag of message [optional]
        if (count > 5) {
            element = elements[4];

            int start = element.indexOf("[");
            int end = element.indexOf("]");
            StringBuffer sbContent = new StringBuffer();

            if (start > 0 && (end - start) > 0) {
                line.setProgram(element.substring(0, start));
                line.setPid(element.substring(start + 1, end));
                j = j + 2;
            } else {
                sbContent.append(element).append(" ");
            }

            for (; j < count; j++) {
                sbContent.append(elements[j]).append(" ");
            }

            sbContent.deleteCharAt(sbContent.length() - 1);
            line.setText(sbContent.toString());

        } else if (count == 5) { // content of message (mandatory)
            line.setText(elements[4]);
        }
        logs.add(line);
    }

    public void write(SyslogMessage sm) {
        try {

            if (bw == null) {
                throw new java.lang.RuntimeException("writer has not been initialized.");
            }
            String line = serialize(sm);

            if (line != null) {
                bw.write(line);
                bw.newLine();
                // bw.flush();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void initWrite() {
        try {
            if (sFileFullPath == null || "".equals(sFileFullPath)) {
                throw new IllegalArgumentException("syslog file is not specified.");
            }

            fw = new java.io.FileWriter(sFileFullPath);
            bw = new java.io.BufferedWriter(fw);
        } catch (Exception e) {
            e.printStackTrace();
            this.endWrite();
        }
    }

    public void endWrite() {
        try {
            if (bw != null) {
                bw.close();
            }
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String serialize(SyslogMessage sm) throws Exception, RuntimeException {

        if (sm == null) {
            throw new java.lang.IllegalArgumentException("syslog message has not been initialized");
        }
        String time = sm.getTimeStamp();

        if (time == null || "".equals(time)) {
            throw new java.lang.RuntimeException("time stamp of message is empty");
        }

        if (sm.getHost() == null || "".equals(sm.getHost())) {
            throw new java.lang.RuntimeException("host of message is empty");
        }

        if (sm.getText() == null || "".equals(sm.getText())) {
            throw new java.lang.RuntimeException("content of message is empty");
        }
        // time stamp
        java.util.StringTokenizer timeStoken = new java.util.StringTokenizer(time);

        if (timeStoken.countTokens() != 3) {
            throw new java.text.ParseException("time stamp is incorrect", 0);
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer sbDate = new StringBuffer();
        int j = 0;

        while (timeStoken.hasMoreTokens()) {
            String element = timeStoken.nextToken();

            /* date sampler: Jan 03 16:15:04 | log sampler: Jan x3 16:15:04 */
            /* if input date like "Jan 03 16:15:04" to syslog file, it consider as correct, use space instead of 0 */

            if (j == 1) {
                if (element.length() == 1) {
                    sbDate.append("0").append(element).append(" ");
                    sb.append(" ").append(element).append(" ");
                } else if (element.length() > 1) {
                    sbDate.append(element).append(" ");
                    if (element.startsWith("0")) {
                        sb.append(element.replaceFirst("0", " ")).append(" ");
                    } else {
                        sb.append(element).append(" ");
                    }
                }
            } else {
                sbDate.append(element).append(" ");
                sb.append(element).append(" ");
            }
            j++;
        }

        if (!isDate(sbDate.toString())) {
            return null;
        }

        // host (mandatory)
        sb.append(sm.getHost()).append(" ");

        // program && [process id [optional]] -- tag of message [optional]
        if (sm.getProgram() != null) {
            sb.append(sm.getProgram());
        }

        if (sm.getPid() != null) {
            sb.append("[").append(sm.getPid()).append("]:").append(" ");
        } else if (sm.getProgram() != null) {
            sb.append(" ");
        }

        // content of message (mandatory)
        sb.append(sm.getText());
        return sb.toString();
    }

    // 
    private boolean isDate(String sDate) throws java.text.ParseException, java.lang.IllegalArgumentException {
        if (sDate == null || "".equals(sDate)) {
            throw new java.lang.IllegalArgumentException("time stamp is empty");
        }
        final String PATTERN = "MMM dd HH:mm:ss ";
        java.text.DateFormat df = null;

        if (locale != null) {
            df = new java.text.SimpleDateFormat(PATTERN, new java.util.Locale(locale));
        } else {
            df = new java.text.SimpleDateFormat(PATTERN);
        }
        df.setLenient(false);

        try {
            return sDate.equalsIgnoreCase(df.format(df.parse(sDate)));
        } catch (java.text.ParseException e) {
            throw e;
        }
    }

    public String formatDate(Object date) {
        if (date instanceof java.util.Date) {
            String PATTERN = "MMM dd HH:mm:ss";
            java.text.DateFormat df = null;

            if (locale != null) {
                df = new java.text.SimpleDateFormat(PATTERN, new java.util.Locale(locale));
            } else {
                df = new java.text.SimpleDateFormat(PATTERN);
            }
            df.setLenient(false);

            return df.format(date);
        } else {
            return date.toString();
        }
    }

    /**
     * DOC tychu Comment method "main".
     * 
     * @param args
     */
    public static void main(String[] args) {

        String sPath = "d:/mail.err";

        SyslogMessageUtil sm = new SyslogMessageUtil();
        sm.setFilePath(sPath);
        sm.setLocale("en");
        sm.read();
        java.util.List<SyslogMessage> logs_ = sm.getLogRows();
        sm.setFilePath("d:/mail222.err");
        sm.initWrite();

        for (SyslogMessage kk : logs_) {
            if (kk != null) {
                System.out.println(kk.getPid());
                sm.write(kk);
            }
        }
        sm.endWrite();
    }
}

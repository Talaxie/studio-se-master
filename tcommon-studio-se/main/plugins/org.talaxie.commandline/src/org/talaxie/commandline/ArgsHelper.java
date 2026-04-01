package org.talaxie.commandline;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;

public class ArgsHelper {

    public static Map<String, String> getParsedArgs() {
        String[] args = Platform.getApplicationArgs();
        Map<String, String> paramMap = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) {
                String key = args[i].substring(1);
                String value = null;

                if (key.contains("=")) {
                    String[] split = key.split("=", 2);
                    paramMap.put(split[0], split[1]);
                } else if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                    value = args[i + 1];
                    paramMap.put(key, value);
                    i++;
                } else {
                    paramMap.put(key, null);
                }
            }
        }

        return paramMap;
    }
}
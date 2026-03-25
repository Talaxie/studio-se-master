package org.talend.sdk.component.studio.util;

import java.io.StringReader;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class TcompV0ConfigToFlatMapDeserializer {

    public static Map<String, String> configToMap(String jsonConfig) {
        JsonReader reader = Json.createReader(new StringReader(jsonConfig));
        JsonObject configAsJsonObject = reader.readObject();

        Map<String, String> result = new LinkedHashMap<>();

        configAsJsonObject.keySet().stream()
                .filter(key -> configAsJsonObject.get(key) instanceof JsonObject)
                .forEach(key -> {
                    JsonObject value = (JsonObject) configAsJsonObject.get(key);
                    findStoredValueInJson(key, result, value);
                });
        return result;
    }

    private static void findStoredValueInJson(String initKey, Map<String, String> result, JsonObject value) {
        JsonValue storedValue = value.get("storedValue");

        if (storedValue != null) {
            if (isSerializedEnum(value)) {
                JsonObject storedValueJson = storedValue.asJsonObject();
                String enumStringValue = String.valueOf(storedValueJson.getString("name"));
                result.put(initKey, enumStringValue);
            } else if (isPrimitiveTypeObjectStoredValue("boolean", storedValue)) {
                result.put(initKey, String.valueOf(storedValue.asJsonObject().getBoolean("value")));
            } else if (isPrimitiveTypeObjectStoredValue("double", storedValue)) {
                result.put(initKey, String.valueOf(storedValue.asJsonObject().getJsonNumber("value").doubleValue()));
            } else if (isPrimitiveTypeObjectStoredValue("int", storedValue)) {
                result.put(initKey, String.valueOf(storedValue.asJsonObject().getJsonNumber("value").intValue()));
            } else if (JsonValue.ValueType.STRING.equals(storedValue.getValueType())) {
                result.put(initKey, value.getString("storedValue"));
            }
        } else {
            value.keySet().stream()
                    .filter(key -> value.get(key) instanceof JsonObject)
                    .forEach(key -> {
                        String resultKey = initKey + "." + key;
                        JsonObject child = (JsonObject) value.get(key);
                        findStoredValueInJson(resultKey, result, child);
                    });
        }
    }

    private static boolean isPrimitiveTypeObjectStoredValue(String type, JsonValue storedValue) {
        return JsonValue.ValueType.OBJECT.equals(storedValue.getValueType()) &&
                type.equals(storedValue.asJsonObject().getString("@type"));
    }

    private static boolean isSerializedEnum(JsonObject value) {
        return value.containsKey("@type") &&
                "org.talend.daikon.properties.property.EnumProperty"
                        .equals(String.valueOf(value.getString("@type")));
    }

}

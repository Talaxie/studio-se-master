package org.talend.designer.bigdata.di.components;

public class Schema {

    public static String StudioToJavaType(String studioType) {
        // Remove id_
        return studioType.substring(3);
    }

    public static class Field {

        private String name;

        private String type;

        public Field(String l, String t) {
            this.name = l;
            this.type = t;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }

}

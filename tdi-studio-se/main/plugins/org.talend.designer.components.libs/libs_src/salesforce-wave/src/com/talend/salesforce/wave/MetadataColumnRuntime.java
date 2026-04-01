/*
 * @author wluo@talend.com
 */
package com.talend.salesforce.wave;

public class MetadataColumnRuntime{

    private final String label;
    private final String talendType;
    private final String pattern;
    private final int length;
    private final int precision;
    private final String defaultValue;
    private final String comment;
    private final boolean isPrimaryKey;

    public boolean isPrimaryKey(){
        return this.isPrimaryKey;
    }

    public String getLabel(){
        return this.label;
    }
    public String getTalendType(){
        return this.talendType;
    }
    public String getPattern(){
        return this.pattern;
    }
    public int getLength(){
        return this.length;
    }
    public int getPrecision(){
        return this.precision;
    }
    public String getDefault(){
        return this.defaultValue;
    }
    public String getComment(){
        return this.comment;
    }

    public static class Builder{
	        private String label;
	        private String talendType;
	        private String pattern;
	        private int length;
	        private int precision;
	        private String defaultValue;
	        private String comment;
          private boolean isPrimaryKey;

           public Builder(){}

           public Builder isPrimaryKey(boolean val){
                  isPrimaryKey = val; return this;
           }

           public Builder label(String val){
                  label = val; return this;
           }

           public Builder talendType(String val){
                  talendType = val; return this;
           }

           public Builder pattern(String val){
                  pattern = val; return this;
           }

           public Builder length(int val){
                  length = val; return this;
           }

           public Builder precision(int val){
                  precision = val; return this;
           }

           public Builder defaultValue(String val){
                  defaultValue = val; return this;
           }

           public Builder comment(String val){
                  comment = val; return this;
           }

           public MetadataColumnRuntime build(){
                  return new MetadataColumnRuntime(this);
           }
    }

    private MetadataColumnRuntime(Builder builder){
          label   = builder.label;
          talendType   = builder.talendType;
          pattern   = builder.pattern;
          length   = builder.length;
          precision   = builder.precision;
          defaultValue   = builder.defaultValue;
          comment   = builder.comment;
          isPrimaryKey = builder.isPrimaryKey;
    }

    public String toString(){
           StringBuilder strBuilder = new StringBuilder("{");
           strBuilder.append("\"label\":");
           strBuilder.append("\"");
           strBuilder.append(this.getLabel());
           strBuilder.append("\",");

           strBuilder.append("\"talendType\":");
           strBuilder.append("\"");
           strBuilder.append(this.getTalendType());
           strBuilder.append("\",");

           strBuilder.append("\"pattern\":");
           strBuilder.append("\"");
           strBuilder.append(this.getPattern());
           strBuilder.append("\",");

           strBuilder.append("\"length\":");
           strBuilder.append(this.getLength());
           strBuilder.append(",");

           strBuilder.append("\"precision\":");
           strBuilder.append(this.getPrecision());
           strBuilder.append(",");

           strBuilder.append("\"defaultValue\":");
           strBuilder.append("\"");
           strBuilder.append(this.getDefault());
           strBuilder.append("\",");

           strBuilder.append("\"comment\":");
           strBuilder.append("\"");
           strBuilder.append(this.getComment());
           strBuilder.append("\",");

           strBuilder.append("\"isPrimaryKey\":");
           strBuilder.append(this.getPrecision());

           strBuilder.append("}");

           return strBuilder.toString();
    }

/*
    public boolean equals(Object obj){
           if(this == obj){
              return true;
           }

           if(obj instanceof MetadataColumnRuntime){
                MetadataColumnRuntime metadataColumnRuntime = (MetadataColumnRuntime)obj;
                if(metadataColumnRuntime.toString().equals(this.toString())){
                    return true;
                }else{
                    return false;
                }
           }

           return false;
    }
*/
}

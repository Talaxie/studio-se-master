/*
 * @author wluo@talend.com
 */
package com.talend.salesforce.wave;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SalesforceWaveHelper{
    public static String generateJsonMetadata(java.io.File jsonFile,List<MetadataColumnRuntime> imatadataColumnList,java.util.Map<String,Object> customedConfig){
        boolean containsDynamicColumn = SalesforceWaveHelper.containsDynamicColumn(imatadataColumnList);
        List<MetadataColumnRuntime> normalMetadataColumnList = imatadataColumnList;
        if(containsDynamicColumn){
            String[] columnsFromHeader = SalesforceWaveHelper.extractHeaderFromCSVFile(new File((String)customedConfig.get("csvPath")),customedConfig);
            normalMetadataColumnList = SalesforceWaveHelper.buildMetadataColumnRuntime(columnsFromHeader, imatadataColumnList);
        }

        String jsonMetadataStr = null;
        StringBuilder strBuilder = new StringBuilder("{");//The left brace
            strBuilder.append("\"fileFormat\":{");
            strBuilder.append("\"charsetName\":");                       strBuilder.append("\"").append(customedConfig.get("charsetName")).append("\"");
            strBuilder.append(",\"fieldsDelimitedBy\":");                strBuilder.append("\"").append(customedConfig.get("fieldsDelimitedBy")).append("\"");
            strBuilder.append(",\"fieldsEnclosedBy\":");                 strBuilder.append("\"").append(customedConfig.get("fieldsEnclosedBy")).append("\"");
            strBuilder.append(",\"linesTerminatedBy\":");                strBuilder.append("\"").append(customedConfig.get("linesTerminatedBy")).append("\"");
            strBuilder.append(",\"numberOfLinesToIgnore\":");            strBuilder.append(customedConfig.get("numberOfLinesToIgnore"));
            strBuilder.append("},");//File Format Section done.

            strBuilder.append("\"objects\":[{");
            strBuilder.append("\"name\":");                               strBuilder.append("\"").append(customedConfig.get("UniqueApiName")).append("\"");
            strBuilder.append(",\"fullyQualifiedName\":");                strBuilder.append("\"").append(customedConfig.get("fullyQualifiedName")).append("\"");
            strBuilder.append(",\"connector\":");                         strBuilder.append("\"").append("Talend_tSalesforceWaveBulkExec").append("\"");
            strBuilder.append(",\"description\":");                       strBuilder.append("\"").append("").append("\"");
            strBuilder.append(",\"label\":");                             strBuilder.append("\"").append(customedConfig.get("label")).append("\"");
            //Objects Section done
            /*
            ** The Mapping between Talend Schema and Salesforce Wave JSON Schema Fields Section
            */
            strBuilder.append(",\"fields\":[");
            int counter = 0;
            for(MetadataColumnRuntime imetadataColumn : normalMetadataColumnList){
               String defaultValue = imetadataColumn.getDefault();
               if(counter != 0){
                 strBuilder.append(",");
               }
                strBuilder.append("{");
                strBuilder.append("\"name\":");                           strBuilder.append("\"").append(imetadataColumn.getLabel()).append("\"");
                strBuilder.append(",\"fullyQualifiedName\":");            strBuilder.append("\"").append(customedConfig.get("UniqueApiName"));
                                                                          strBuilder.append(".");
                                                                          strBuilder.append(imetadataColumn.getLabel()).append("\"");
                String description = imetadataColumn.getComment();
                if(description != null && !"".equals(description)){
                strBuilder.append(",\"description\":");                   strBuilder.append("\"").append(description).append("\"");
                }
                strBuilder.append(",\"label\":");                         strBuilder.append("\"").append(imetadataColumn.getLabel()).append("\"");
                strBuilder.append(",\"isUniqueId\":");                    strBuilder.append(imetadataColumn.isPrimaryKey());

                String salesforceWaveType = SalesforceWaveHelper.convertTalendType2SalesforceWaveType(imetadataColumn);
                strBuilder.append(",\"type\":");                          strBuilder.append("\"").append(salesforceWaveType).append("\"");
            if("Numeric".equalsIgnoreCase(salesforceWaveType)){
                strBuilder.append(",\"precision\":");                     strBuilder.append(imetadataColumn.getLength());
                strBuilder.append(",\"scale\":");                         strBuilder.append(imetadataColumn.getPrecision());
                    if(defaultValue != null && !"".equals(defaultValue)){
                strBuilder.append(",\"defaultValue\":");                  strBuilder.append(defaultValue);
                    }else{
                strBuilder.append(",\"defaultValue\":");                  strBuilder.append(0);
                    }
              }

            if("Date".equalsIgnoreCase(salesforceWaveType)){
               strBuilder.append(",\"format\":");                         strBuilder.append("\"").append(imetadataColumn.getPattern()).append("\"");
            }

            if("Numeric".equalsIgnoreCase(salesforceWaveType)){
                strBuilder.append(",\"format\":");                        strBuilder.append("\"").append(customedConfig.get("numericFormat")).append("\"");
            }

            //Use the "default" column as fiscalMonthOffset
            if("Date".equalsIgnoreCase(salesforceWaveType)){
                strBuilder.append(",\"fiscalMonthOffset\":");            strBuilder.append(0);
            }

             strBuilder.append("}");
             counter ++;
          }

             strBuilder.append("]");//match with "fields" : [
             strBuilder.append("}]");//math with "objects" : [{
             strBuilder.append("}");//The right brace

             jsonMetadataStr = strBuilder.toString();
             if(jsonFile != null){
                 java.io.BufferedWriter buffWriter = null;
                 try{
                    buffWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(jsonFile),(String)customedConfig.get("encoding")));
                    buffWriter.write(jsonMetadataStr);
                 }catch(java.io.FileNotFoundException e){
                    e.printStackTrace();
                 }catch(java.io.IOException e){
                    e.printStackTrace();
                 }catch(java.lang.Exception e){
                    e.printStackTrace();
                 }finally{
                    if(buffWriter != null){
                        try{
                            buffWriter.close();
                        }catch(java.io.IOException e){
                            e.printStackTrace();
                        }
                    }
                 }
             }
             return jsonMetadataStr;
        }

        public static String convertTalendType2SalesforceWaveType(MetadataColumnRuntime imetadataColumn){
            String talendType = imetadataColumn.getTalendType();
            java.util.List<String> numericList = java.util.Arrays.asList("id_Byte","id_Short","id_Integer","id_Long","id_Double","id_Float","id_BigDecimal");

            if("id_Date".equals(talendType)){
                return "Date";
            }else if(numericList.contains(talendType)){
                return "Numeric";
            }else{
                return "Text";
            }
        }

        public static boolean isValidUniqueApiName(String uniqueApiName){
            boolean valid = true;
            valid = uniqueApiName.matches("^[A-Za-z][A-Za-z0-9_]*$");
            valid = valid && !uniqueApiName.endsWith("_");
            valid = valid && !uniqueApiName.contains("__");
            return valid;
        }

        public static boolean isValidValue(String value){
               return value.matches("^[A-Za-z0-9_]+$");
        }

        public static boolean containsDynamicColumn(List<MetadataColumnRuntime> imatadataColumnList){
               int dynamicColumnCounter = 0;
               for(MetadataColumnRuntime column: imatadataColumnList){
                    if("id_Dynamic".equals(column.getTalendType())){
                        dynamicColumnCounter ++;
                    }
               }

               if(dynamicColumnCounter == 0){
                    return false;
               }else if(dynamicColumnCounter == 1){
                    return true;
               }else{
                    throw new RuntimeException("Only one dynamic column allowed.");
               }
        }

        //assume there is a header in the csv file
        public static String[] extractHeaderFromCSVFile(File csvFile, java.util.Map<String,Object> customedConfig){
               BufferedReader buffReader = null;
               String header = null;
               try{
                   buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile),(String)customedConfig.get("encoding")));
                   boolean flag = true;
                   while(flag){
                        header = buffReader.readLine();
                        if(!"".equals(header)){
                            flag = false;
                        }
                   }
               }catch(java.io.FileNotFoundException e){
                    e.printStackTrace();
               }catch(java.io.IOException e){
                  e.printStackTrace();
               }catch(java.lang.Exception e){
                  e.printStackTrace();
               }finally{
                  if(buffReader != null){
                      try{
                          buffReader.close();
                      }catch(java.io.IOException e){
                          e.printStackTrace();
                      }
                  }
               }

               String[] headerArr = header.split((String)customedConfig.get("fieldsDelimitedBy"));
               int lgth = headerArr.length;
               String[] removedDoubleQuote = new String[lgth];
               for(int i = 0; i < lgth; i++){
                  if(headerArr[i].startsWith("\"") && headerArr[i].endsWith("\"")){
                     removedDoubleQuote[i] = headerArr[i].substring(1,headerArr[i].length()-1);
                  }else{
                    removedDoubleQuote[i] = headerArr[i];
                  }
               }
               return removedDoubleQuote;
        }

      public static List<MetadataColumnRuntime> buildMetadataColumnRuntime(String[] entireColumns, List<MetadataColumnRuntime> containsDynamicColumnList){
           List<MetadataColumnRuntime> normalMetadataColumnList = new ArrayList<MetadataColumnRuntime>();
           int lgth = containsDynamicColumnList.size();
           int lgthx = entireColumns.length;
           int dynamicIndex = 0;

           if(lgthx < lgth){
        	   throw new RuntimeException("The length of the entireColumns must greater then the length of containsDynamicColumnList.");
           }
           if(lgth <= 0 || lgthx <= 0){
        	   throw new IllegalArgumentException("The length of the array must greater than 0.");
           }

           for(MetadataColumnRuntime metadataColumn : containsDynamicColumnList){
              if("id_Dynamic".equals(metadataColumn.getTalendType())){
                 break;
              }
              dynamicIndex ++;
           }

           MetadataColumnRuntime metadataColumn = containsDynamicColumnList.get(dynamicIndex);
           for(int i = 0; i < dynamicIndex; i++){
                normalMetadataColumnList.add(containsDynamicColumnList.get(i));
           }

           for(int j = dynamicIndex; j < (lgthx - lgth + dynamicIndex + 1); j++){
                normalMetadataColumnList.add(
                        new MetadataColumnRuntime.Builder()
                        .label(entireColumns[j])
                        .talendType("id_String")
                        .pattern(metadataColumn.getPattern())
                        .length(metadataColumn.getLength())
                        .precision(metadataColumn.getPrecision())
                        .defaultValue(metadataColumn.getDefault())
                        .comment(metadataColumn.getComment())
                        .isPrimaryKey(metadataColumn.isPrimaryKey())
                        .build()
                    );
           }

           for(int k = dynamicIndex + 1; k < lgth; k++){
                normalMetadataColumnList.add(containsDynamicColumnList.get(k));
           }
           return normalMetadataColumnList;
       }
}

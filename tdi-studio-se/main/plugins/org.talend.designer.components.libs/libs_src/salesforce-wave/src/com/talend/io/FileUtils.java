package com.talend.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtils{
    public static List<File> splitFileByLines(File srcFile,String srcFileEncoding,File destDirectory,String destFileEncoding,long linesPerFile){
        if(linesPerFile <= 0){
            throw new IllegalArgumentException("Number of lines per file must greater than 0.");
        }
        if(!destDirectory.isDirectory()){
            throw new IllegalArgumentException("destDirectory must be a directory.");
        }

        List<File> splitFileList = new ArrayList<File>();

        BufferedReader buffReader = null;
        try {
            buffReader = new BufferedReader(new InputStreamReader(new FileInputStream(srcFile),srcFileEncoding));
        } catch(UnsupportedEncodingException e) {
             throw new RuntimeException(e);
        } catch(FileNotFoundException e){
             throw new RuntimeException(e);
        }catch(Exception e){
             e.printStackTrace();
        }

        long lineCounter = 0;
        int filePartNumber = 0;
        String currentLineStr = null;
        String baseFilePath = null;
        BufferedWriter buffWriter = null;
           try{
                baseFilePath = destDirectory.getCanonicalPath() + File.separator + srcFile.getName();
                File splitFile = null;
                while((currentLineStr = buffReader.readLine()) != null){
                    if(lineCounter == 0){
                        splitFile = new File(baseFilePath + "_part_" + filePartNumber);
                        splitFileList.add(splitFile);
                        if(buffWriter != null){
                            buffWriter.close();
                        }
                        buffWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(splitFile),destFileEncoding));
                    }
                    buffWriter.write(currentLineStr);
                    buffWriter.write("\n");
                    lineCounter ++;

                    if(lineCounter >= linesPerFile){
                        lineCounter = 0;
                        filePartNumber ++;
                    }
                }
           }catch(FileNotFoundException e){
                throw new RuntimeException(e);
           }catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
           }catch(IOException e){
               throw new RuntimeException(e);
           }catch(Exception e){
               e.printStackTrace();
           }finally{
                try{
                    buffWriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

                try{
                    buffReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
           }
        return splitFileList;
    }

    public static List<File> splitFileByBytes(File srcFile,File destDirectory,long bytesPerFile){
        if(bytesPerFile <= 0){
            throw new RuntimeException("Bytes per file must greater than 0.");
        }

        List<File> splitFileList = new ArrayList<File>();

        int filePartNumber = 0;
        String baseFilePath = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream(srcFile);
            baseFilePath = destDirectory.getCanonicalPath() + File.separator + srcFile.getName();

            int n = 0;
            long byteCounter = 0;
            File splitFile = null;
            fileOutputStream = null;

            while((n = fileInputStream.read()) != -1){
                if(byteCounter == 0){
                    splitFile = new File(baseFilePath + "_part_" + filePartNumber);
                    splitFileList.add(splitFile);
                    if(fileOutputStream != null){
                        fileOutputStream.close();
                    }
                    fileOutputStream = new FileOutputStream(splitFile);
                }
                fileOutputStream.write(n);
                byteCounter ++;

                if(byteCounter >= bytesPerFile){
                    byteCounter = 0;
                    filePartNumber ++;
                }
            }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
             try{
                 fileOutputStream.close();
             }catch(IOException e){
                 e.printStackTrace();
             }

             try{
                 fileInputStream.close();
             }catch(IOException e){
                 e.printStackTrace();
             }
        }
        return splitFileList;
    }

    public static List<File> splitFilePer8Mb(File srcFile,File destDirectory){
        List<File> splitFileList = new ArrayList<File>();

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        final int DEFAULT_BUFFER_SIZE = 8 * 1024 *1024;
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
        Arrays.fill(buffer, (byte)0);

        int filePartNumber = 0;
        int readBytes = 0;

        try{
             String baseFilePath = destDirectory.getCanonicalPath() + File.separator + srcFile.getName();
             inputStream = new FileInputStream(srcFile);
             while((readBytes = inputStream.read(buffer)) != -1){
                 File tmpFile = new File(baseFilePath + "_part_" + filePartNumber);
                 splitFileList.add(tmpFile);
                 if(tmpFile != null && tmpFile.exists()){
                     tmpFile.delete();
                 }
                 fileOutputStream = new FileOutputStream(tmpFile);
                 fileOutputStream.write(buffer, 0, readBytes);
                 Arrays.fill(buffer, (byte)0);
                 fileOutputStream.close();
                 fileOutputStream = null;
                 filePartNumber ++;
             }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

            if(inputStream != null){
                try{
                    inputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return splitFileList;
    }

    public static byte[] readFilePer8Mb(File srcFile,int index) throws java.io.IOException{
        if(index < 0){
            throw new IllegalArgumentException("Index must be nonnegative integer.");
        }

        byte[] readBytsArr = null;
        InputStream inputStream = null;
        final int DEFAULT_BUFFER_SIZE = 8 * 1024 *1024;
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
        Arrays.fill(buffer, (byte)0);

        int readBytes = 0;
        int counter = 0;

        try{
             inputStream = new FileInputStream(srcFile);
             while((readBytes = inputStream.read(buffer)) != -1){
                 counter ++;//read times
                 if(counter == (index + 1)){
                     readBytsArr = java.util.Arrays.copyOf(buffer,readBytes);
                     break;
                 }
                 Arrays.fill(buffer, (byte)0);
             }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(inputStream != null){
                try{
                    inputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        if((index + 1) > counter){
            throw new java.io.IOException("NO more bytes to read.");
        }
        return readBytsArr;
    }
}

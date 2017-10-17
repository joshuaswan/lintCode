package com.joshua.lintCode.workFileProcess;

import org.junit.Test;

import java.io.*;

/**
 * Created by joshua on 2017/10/17.
 */
public class WorkFileProcess {
//    @Test
    public void process() {
        System.out.println("process file!");

        String dirPath = "C:\\Users\\joshua\\Desktop\\4A_db_opt";
        File dir = new File(dirPath);
        File[] file = dir.listFiles();
        String[] filePath = new String[file.length];
        for (int i = 0; i < file.length; i++) {
            filePath[i] = dirPath + "\\" + file[i].getName();
            processFile(dirPath, file[i].getName(), "1_");
        }

    }

    public void processFile(String filePath, String fileName, String start) {

        File file = new File(filePath + "\\" + fileName);
        System.out.println(file.getName());
        String newFilePath = filePath + "\\" + start + fileName;
        System.out.println(newFilePath);
        File newFile = new File(newFilePath);
        FileOutputStream fileOutputStream = null;
        if (!newFile.exists()){
            try {
                newFile.createNewFile();
                fileOutputStream = new FileOutputStream(newFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
//            int line = 1;
            while ((tempString = reader.readLine()) != null){
//                System.out.println("line: " + line + ": " + tempString);
//                System.out.println(tempString.replace("///",""));
                String context = tempString.replace("///","") + "\n";
                fileOutputStream.write(context.getBytes("GBK"));
//                line++;
            }
            fileOutputStream.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

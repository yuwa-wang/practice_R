package com.yuwa.classes;
import java.io.*;
import java.util.HashMap;

public class HandleFiles {
    public void readFromFile(String key, String fn){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String fileName = "C:/source/JavaPractice/src/com/yuwa/files/" + fn;
        String[] splittedStr = null;
        HashMap<String, String> map = new HashMap<>();
        try {
            fis = new FileInputStream(fileName);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
                if(line.charAt(0) != '#') {
                    splittedStr = line.split("=");

                    map.put(splittedStr[0], splittedStr[1].split("#")[0]);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                System.out.println(map);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        findValueForThekey(map, key);

    }

     void findValueForThekey(HashMap<String, String> map, String key){
        while(!map.isEmpty()){
            if(map.containsKey(key)){
                System.out.println(map.get(key));
                break;
            }
        }
    }
    void readFile_TryResource(String key, String fn){
        String line = null;
        String fileName = "C:/source/JavaPractice/src/com/yuwa/files/" + fn;
        try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))){
            while ((line = in.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void writeFile_traditional(String fn){
        FileOutputStream fos = null;
        OutputStream osw = null;
        BufferedReader bw = null;
        String fileName = "C:/source/JavaPractice/src/com/yuwa/files/" + fn;
        try{
            fos = new FileOutputStream(fileName);
            //osw = new OutputStreamWriter(fos);
            //bw = new BufferedWriter(osw);
            //bw.write("This is the first line.");
            //bw.newLine();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package utils;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class FileString {
    private final String filePath;


    public FileString(String filePath) {
        this.filePath = filePath;
    }
    public void write(String line) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created !");
            } else {
                System.out.println("File already exist !");
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void writeAll(String list) {
        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created !");
            } else {
                System.out.println("File already exist !");
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(list);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public ArrayList<String> readAll() {
        ArrayList<String> result = new ArrayList<>() ;
        File file = new File(filePath);
        if (file.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine()) != null) {
                    result.add(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist !");
        }
        return result;
    }
}

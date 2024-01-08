package utils;

import com.google.gson.Gson;
import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class FileIo<T> implements IFileIo<T> {
    private final String filePath;


    public FileIo(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void replaceAll(ArrayList<T> list) {
        File file = new File(filePath);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (T t : list) {
            write(t);
        }
    }
    @Override
    public void write(T t) {
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
        Gson gson = new Gson();
        System.out.println(t);
        String line = gson.toJson(t);
        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(line);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public ArrayList<T> readAll(Class<T> clazz) {
        ArrayList<T> result = new ArrayList<>() ;
        File file = new File(filePath);
        Gson gson = new Gson();
        if (file.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) != null) {
                    T obj = gson.fromJson(line,clazz);
                    result.add(obj);
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

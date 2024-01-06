package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class FileIo<T> {
    private final String filePath;

    public FileIo(String filePath) {
        this.filePath = filePath;
    }

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
    public ArrayList<T> readAll() {
        ArrayList<T> result = new ArrayList<>() ;
        File file = new File(filePath);
        Gson gson = new Gson();
        if (file.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String line = "";
                while ((line = br.readLine()) != null) {
                    TypeToken<T> typeToken = new TypeToken<T>(){};
                    T obj = gson.fromJson(line,typeToken.getType());
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

package utils;

import java.util.ArrayList;

public interface IFileString {
    void write(String line);

    void writeAll(String list);

    ArrayList<String> readAll();
}

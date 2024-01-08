package utils;

import java.util.ArrayList;

public interface IFileIo<T> {
    void write(T t);
    void replaceAll(ArrayList<T> list);
    ArrayList<T> readAll(Class<T> clazz);

}

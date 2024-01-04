package utils;

import java.util.ArrayList;

public interface IFile<T> {
    public ArrayList<T> readAll();
    public T read(String id);
    public void write(T t);

}

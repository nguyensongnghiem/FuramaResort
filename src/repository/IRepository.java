package repository;

import java.io.IOException;
import java.util.ArrayList;

public interface IRepository<T> {
    public ArrayList<T> getAll();
    public void add(T t) throws IOException;
    public void delete(T t);
    public void update(T t);
    public T get(String id);

}

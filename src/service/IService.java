package service;

import java.util.ArrayList;

public interface IService<T> {
    public ArrayList<T> getAll();
    public void add(T t);
    public void delete(String id);
    public void update(T t);
    public T get(String id);



}

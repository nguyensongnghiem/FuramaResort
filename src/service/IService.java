package service;

import java.util.ArrayList;

public interface IService<T> {
    public ArrayList<T> getAll();
    public String add(T t);
    public String delete(String id);
    public String update(T t);
    public T get(String id);


}

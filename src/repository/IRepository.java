package repository;

import model.Person;

import java.util.ArrayList;

public interface IRepository<T> {
    public T get(String id);
    public ArrayList<T> getAll();
    public void add(T t);
    public void delete(String id);
    public void update(T t);
    public ArrayList<String> listToCsv (ArrayList<T> list);


}

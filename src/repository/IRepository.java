package repository;

import java.util.ArrayList;

public interface IRepository<T> {
    public ArrayList<T> getAll();
    public  void replaceAll(ArrayList<T> list);
    public String add(T t);
    public String delete(String id);
    public String update(T t);
    public T get(String id);
    public boolean isExist(String id);

}

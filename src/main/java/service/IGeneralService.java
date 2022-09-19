package service;

import java.util.List;

public interface IGeneralService<T> {

    List<T> findAll();

    T findById(String id);

    void save(T t);

    void remove(String id);
}

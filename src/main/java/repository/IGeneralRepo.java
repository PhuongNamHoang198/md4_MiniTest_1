package repository;

import java.util.List;

public interface IGeneralRepo<T> {

    List<T> findAll();

    T findById(String id);

    void save(T t);

    void remove(String id);
}

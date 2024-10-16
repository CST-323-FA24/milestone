package org.gcu.milestone.data;

import java.util.List;

public interface DataAccessInterface<T>
{
    List<T> findAll();

    T findById(Long id);

    boolean create(T t);

    boolean update(T t);

    boolean delete(T t);
}

package org.gcu.milestone.data;

import java.util.List;
import org.gcu.milestone.data.entity.Entity;

public interface DataAccessInterface<T>
{
    List<T> findAll();

    T findById(Long id);

    boolean create(T t);

    boolean update(T t);

    boolean delete(T t);
}

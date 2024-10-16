package org.gcu.milestone.data.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.data.DataAccessInterface;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
public abstract class DataService<T> implements DataAccessInterface<T>
{
    private CrudRepository<T, Long> repository;

    @Override
    public List<T> findAll()
    {
        var resultSet = new ArrayList<T>();

        try
        {
            var resultIterable = repository.findAll();
            resultIterable.forEach(resultSet::add);
        }
        catch (Exception e)
        {
            log.error("{} (Returning empty list)", e.getMessage());
        }

        return resultSet;
    }

    @Override
    public T findById(Long id)
    {
        return null;
    }

    @Override
    public boolean create(T t)
    {
        return false;
    }

    @Override
    public boolean update(T t)
    {
        return false;
    }

    @Override
    public boolean delete(T t)
    {
        return false;
    }
}

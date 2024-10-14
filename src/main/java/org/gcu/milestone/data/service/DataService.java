package org.gcu.milestone.data.service;

import org.gcu.milestone.data.DataAccessInterface;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class DataService<T, ID> implements DataAccessInterface<T>
{
    final CrudRepository<T, ID> repository;

    public DataService(CrudRepository<T, ID> repository)
    {
        this.repository = repository;
    }

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
            e.printStackTrace();
        }

        return resultSet;
    }

    @Override
    public T findById(Long id)
    {
        return null;
    }

    @Override
    public boolean create(T productEntity)
    {
        return false;
    }

    @Override
    public boolean update(T productEntity)
    {
        return false;
    }

    @Override
    public boolean delete(T productEntity)
    {
        return false;
    }
}

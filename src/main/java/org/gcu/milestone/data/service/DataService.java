package org.gcu.milestone.data.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.data.DataAccessInterface;
import org.gcu.milestone.data.entity.Entity;
import org.gcu.milestone.data.repository.Repository;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@AllArgsConstructor
public class DataService<T extends Entity> implements DataAccessInterface<T>
{
    Repository<T> repository;

    @Override
    public List<T> findAll()
    {
        var resultSet = new ArrayList<T>();

        try
        {
            repository.findAll().forEach(resultSet::add);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }

        return resultSet;
    }

    @Override
    public T findById(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    @Override
    public boolean create(T entity)
    {
        entity.setId(null);

        try
        {
            repository.save(entity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean update(T entity)
    {
        try
        {
            repository.save(entity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public boolean delete(T entity)
    {
        try
        {
            repository.delete(entity);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return false;
        }

        return true;
    }
}

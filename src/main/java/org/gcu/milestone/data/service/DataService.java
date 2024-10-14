package org.gcu.milestone.data.service;

import org.gcu.milestone.data.DataAccessInterface;
import org.gcu.milestone.data.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class DataService<ID> implements DataAccessInterface<ID>
{
    final CrudRepository<DataEntity<ID>, ID> repository;

    public DataService(CrudRepository<DataEntity<ID>, ID> repository)
    {
        this.repository = repository;
    }

    @Override
    public List<DataEntity<ID>> findAll()
    {
        var resultSet = new ArrayList<DataEntity<ID>>();

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
    public DataEntity<ID> findById(ID id)
    {
        return null;
    }

    @Override
    public boolean create(DataEntity<ID> entity)
    {
        return false;
    }

    @Override
    public boolean update(DataEntity<ID> productEntity)
    {
        return false;
    }

    @Override
    public boolean delete(DataEntity<ID> productEntity)
    {
        return false;
    }
}

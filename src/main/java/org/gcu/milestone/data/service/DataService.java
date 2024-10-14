package org.gcu.milestone.data.service;

import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.data.DataAccessInterface;
import org.gcu.milestone.data.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Data service class
 * @param <ID> ID type for target entities
 */
@Slf4j
public abstract class DataService<ID> implements DataAccessInterface<ID>
{
    final CrudRepository<DataEntity<ID>, ID> repository;

    public DataService(CrudRepository<DataEntity<ID>, ID> repository)
    {
        this.repository = repository;
    }

    /**
     * Find all rows of a table
     * @return Table rows as a list
     */
    @Override
    public List<DataEntity<ID>> findAll()
    {
        var resultSet = new ArrayList<DataEntity<ID>>();

        // Attempt to read from table
        try
        {
            var resultIterable = repository.findAll();
            resultIterable.forEach(resultSet::add);
        }
        catch (Exception e) // Log failure
        {
            log.error("{} (Returning empty list)", e.getMessage());
        }

        return resultSet;
    }

    /**
     * Find a row by its ID
     * @param id the ID of the row
     * @return Entity representing row, or null if it does not exist
     */
    @Override
    public DataEntity<ID> findById(ID id)
    {
        return repository.findById(id).orElse(null);
    }

    /**
     * Create a new row
     * @param entity Entity to use for row creation
     * @return Boolean representing success/failure
     */
    @Override
    public boolean create(DataEntity<ID> entity)
    {
        // Set entity ID to null to force insert
        entity.setId(null);

        // Attempt to save
        try
        {
            repository.save(entity);
            return true;
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }

        return false;
    }

    /**
     * Update row
     * @param entity Entity representing row to be updated
     * @return Boolean representing success/failure
     */
    @Override
    public boolean update(DataEntity<ID> entity)
    {
        if (repository.findById(entity.getId()).isPresent())
        {
            try
            {
                repository.save(entity);
                return true;
            }
            catch (Exception e)
            {
                log.error(e.getMessage());
            }
        }
        return false;
    }

    /**
     * Delete row
     * @param entity entity representing row
     * @return Boolean representing success/failure
     */
    @Override
    public boolean delete(DataEntity<ID> entity)
    {
        try
        {
            repository.delete(entity);
            return true;
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
        }
        return false;
    }
}

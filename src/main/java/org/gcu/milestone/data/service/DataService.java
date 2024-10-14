package org.gcu.milestone.data.service;

import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.data.DataAccessInterface;
import org.gcu.milestone.data.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Data service class
 */
@Slf4j
public abstract class DataService implements DataAccessInterface
{
    protected final CrudRepository<DataEntity, Long> repository;

    public DataService(CrudRepository<DataEntity, Long> repository)
    {
        this.repository = repository;
    }

    /**
     * Find all rows of a table
     * @return Table rows as a list
     */
    @Override
    public List<DataEntity> findAll()
    {
        var resultSet = new ArrayList<DataEntity>();

        // Attempt to read from table
        try
        {
            var resultIterable = repository.findAll();
            resultIterable.forEach(resultSet::add);
        }
        catch (Exception e) // Log failure
        {
            e.printStackTrace();
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
    public DataEntity findById(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    /**
     * Create a new row
     * @param entity Entity to use for row creation
     * @return Boolean representing success/failure
     */
    @Override
    public boolean create(DataEntity entity)
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
    public boolean update(DataEntity entity)
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
    public boolean delete(DataEntity entity)
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

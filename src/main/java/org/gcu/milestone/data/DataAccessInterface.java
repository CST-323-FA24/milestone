package org.gcu.milestone.data;

import org.gcu.milestone.data.entity.DataEntity;

import java.util.List;

public interface DataAccessInterface
{
    List<DataEntity> findAll();

    DataEntity findById(Long id);

    boolean create(DataEntity t);

    boolean update(DataEntity t);

    boolean delete(DataEntity t);
}

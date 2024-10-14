package org.gcu.milestone.data;

import org.gcu.milestone.data.entity.DataEntity;

import java.util.List;

public interface DataAccessInterface<ID>
{
    List<DataEntity<ID>> findAll();

    DataEntity<ID> findById(ID id);

    boolean create(DataEntity<ID> t);

    boolean update(DataEntity<ID> t);

    boolean delete(DataEntity<ID> t);
}

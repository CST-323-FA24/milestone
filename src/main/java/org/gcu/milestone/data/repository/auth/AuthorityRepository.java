package org.gcu.milestone.data.repository.auth;

import org.gcu.milestone.data.entity.DataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends CrudRepository<DataEntity<Long>, Long>
{
}

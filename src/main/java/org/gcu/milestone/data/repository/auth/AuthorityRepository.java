package org.gcu.milestone.data.repository.auth;

import org.gcu.milestone.data.entity.auth.AuthorityEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<AuthorityEntity, Long>
{
}

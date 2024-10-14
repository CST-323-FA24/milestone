package org.gcu.milestone.data.repository.auth;

import org.gcu.milestone.data.entity.auth.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String>
{
}

package org.gcu.milestone.data.repository.auth;

import org.gcu.milestone.data.entity.auth.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String>
{
}

package org.gcu.milestone.data.repository.auth;

import org.gcu.milestone.data.entity.auth.UserEntity;
import org.gcu.milestone.data.repository.Repository;

public interface UserRepository extends Repository<UserEntity>
{
    public UserEntity findByUsername(String username);
}

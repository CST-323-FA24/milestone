package org.gcu.milestone.data.service.auth;

import org.gcu.milestone.data.entity.auth.UserEntity;
import org.gcu.milestone.data.repository.auth.UserRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class UserDataService extends DataService<UserEntity>
{
    private final UserRepository userRepository;

    public UserDataService(UserRepository userRepository)
    {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public UserEntity findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }
}

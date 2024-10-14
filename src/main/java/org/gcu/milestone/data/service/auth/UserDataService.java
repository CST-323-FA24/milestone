package org.gcu.milestone.data.service.auth;

import org.gcu.milestone.data.repository.auth.UserRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;


@Service
public class UserDataService extends DataService<String>
{
    public UserDataService(UserRepository repository)
    {
        super(repository);
    }
}

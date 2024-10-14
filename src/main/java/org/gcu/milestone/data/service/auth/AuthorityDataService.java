package org.gcu.milestone.data.service.auth;

import org.gcu.milestone.data.entity.auth.AuthorityEntity;
import org.gcu.milestone.data.repository.auth.AuthorityRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

@Service
public class AuthorityDataService extends DataService<Long>
{
    public AuthorityDataService(AuthorityRepository repository)
    {
        super(repository);
    }
}

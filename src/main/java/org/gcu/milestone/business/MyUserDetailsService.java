package org.gcu.milestone.business;

import org.gcu.milestone.data.entity.auth.AuthorityEntity;
import org.gcu.milestone.data.entity.auth.UserEntity;
import org.gcu.milestone.data.repository.auth.AuthorityRepository;
import org.gcu.milestone.data.repository.auth.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService
{
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;

    public MyUserDetailsService(UserRepository userRepository, AuthorityRepository authorityRepository)
    {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        UserEntity user = userRepository.findByUsername(username);
        if (user == null)
        {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'", username));
        }

        var authorities = new ArrayList<GrantedAuthority>();
        for (AuthorityEntity authorityEntity : user.getAuthorities())
        {
            authorities.add(new SimpleGrantedAuthority(authorityEntity.getAuthority()));
        }

        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}

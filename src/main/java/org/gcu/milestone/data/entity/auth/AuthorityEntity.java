package org.gcu.milestone.data.entity.auth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class AuthorityEntity extends org.gcu.milestone.data.entity.Entity
{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false, referencedColumnName = "username")
    private UserEntity username;

    @Column(name = "authority", nullable = false, length = 50)
    private String authority;

}
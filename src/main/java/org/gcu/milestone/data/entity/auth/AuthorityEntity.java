package org.gcu.milestone.data.entity.auth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.gcu.milestone.data.entity.DataEntity;

@Getter
@Setter
@Entity
@Table(name = "authorities")
public class AuthorityEntity implements DataEntity<Long>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "username", nullable = false)
    private UserEntity username;

    @Column(name = "authority", nullable = false, length = 50)
    private String authority;
}
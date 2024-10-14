package org.gcu.milestone.data.entity.auth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.gcu.milestone.data.entity.DataEntity;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity implements DataEntity<String>
{
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 500)
    private String password;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "email", length = 200)
    private String email;

    @Override
    public String getId()
    {
        return username;
    }
}
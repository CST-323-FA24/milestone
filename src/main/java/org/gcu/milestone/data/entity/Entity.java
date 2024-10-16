package org.gcu.milestone.data.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
public abstract class Entity
{
    @Id
    private Long id;
}

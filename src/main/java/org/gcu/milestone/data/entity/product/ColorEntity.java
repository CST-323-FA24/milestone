package org.gcu.milestone.data.entity.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "colors")
public class ColorEntity extends org.gcu.milestone.data.entity.Entity
{
    @Column(name = "name", nullable = false, length = 100)
    private String name;
}
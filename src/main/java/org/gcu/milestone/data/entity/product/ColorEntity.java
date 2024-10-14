package org.gcu.milestone.data.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.gcu.milestone.data.entity.DataEntity;

@Getter
@Setter
@Entity
@Table(name = "colors")
public class ColorEntity extends DataEntity<Long>
{
    @Column(name = "name", nullable = false, length = 100)
    private String name;
}
package org.gcu.milestone.data.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.gcu.milestone.data.entity.DataEntity;

@Getter
@Setter
@Entity
@Table(name = "sizes")
public class SizeEntity extends DataEntity
{
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "value")
    private Integer value;
}
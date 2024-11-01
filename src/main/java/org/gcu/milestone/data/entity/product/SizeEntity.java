package org.gcu.milestone.data.entity.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sizes")
public class SizeEntity extends org.gcu.milestone.data.entity.Entity
{
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "value")
    private Integer value;

}
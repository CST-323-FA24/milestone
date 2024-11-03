package org.gcu.milestone.data.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductEntity extends org.gcu.milestone.data.entity.Entity
{
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false, precision = 15, scale = 2)
    private BigDecimal price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "brands_id", nullable = false)
    private BrandEntity brands;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "categories_id", nullable = false)
    private CategoryEntity categories;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "sizes_id", nullable = false)
    private SizeEntity sizes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "colors_id", nullable = false)
    private ColorEntity colors;

}
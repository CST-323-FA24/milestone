package org.gcu.milestone.data.entity.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity
{
    // Class level properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "brands_id")
    private BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "sizes_id")
    private SizeEntity size;

    @ManyToOne
    @JoinColumn(name = "colors_id")
    private ColorEntity color;
}

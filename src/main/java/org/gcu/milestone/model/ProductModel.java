package org.gcu.milestone.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Product model class
 */
@Getter
@Setter
@AllArgsConstructor
public class ProductModel
{
    // Class-level properties
    private long id;
    private String name;
    private String description;
    private float price;
    private int quantity;
    private String brand;
    private String size;
    private String color;
    private String category;
}

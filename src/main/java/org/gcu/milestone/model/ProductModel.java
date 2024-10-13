package org.gcu.milestone.model;

/**
 * Product model class
 */
public class ProductModel
{
    // Class-level properties
    private long id;
    private String name;
    private String description;
    private float price;
    private int quantity;

    /**
     * Parameterized constructor
     * @param id Product ID
     * @param name Product name
     * @param description Product description
     * @param price Product price
     * @param quantity Product quantity
     */
    public ProductModel(long id, String name, String description, float price, int quantity)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // --------------------------------------------
    // Getters and Setters
    // --------------------------------------------
    
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}

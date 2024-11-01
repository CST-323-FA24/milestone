package org.gcu.milestone.business;

import org.gcu.milestone.data.entity.product.ProductEntity;
import org.gcu.milestone.data.service.product.*;
import org.gcu.milestone.model.product.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsBusinessService
{
    @Autowired
    private final ProductDataService productDataService;

    public ProductsBusinessService(ProductDataService productDataService)
    {
        this.productDataService = productDataService;
    }

    public ProductModel getProductById(Long productId)
    {
        var resultEntity = productDataService.findById(productId);

        return new ProductModel(
                resultEntity.getId(),
                resultEntity.getName(),
                resultEntity.getDescription(),
                resultEntity.getPrice(),
                resultEntity.getQuantity(),
                resultEntity.getBrands().getName(),
                resultEntity.getSizes().getName(),
                resultEntity.getColors().getName(),
                resultEntity.getCategories().getName()
        );
    }

    public List<ProductModel> getProducts()
    {
        var resultSet = new ArrayList<ProductModel>();
        var entitySet = productDataService.findAll();

        for (ProductEntity productEntity : entitySet)
        {
            resultSet.add(new ProductModel(
                    productEntity.getId(),
                    productEntity.getName(),
                    productEntity.getDescription(),
                    productEntity.getPrice(),
                    productEntity.getQuantity(),
                    productEntity.getBrands().getName(),
                    productEntity.getSizes().getName(),
                    productEntity.getColors().getName(),
                    productEntity.getCategories().getName()
            ));
        }

        return resultSet;
    }
}

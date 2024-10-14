package org.gcu.milestone.business;

import org.gcu.milestone.data.entity.product.ProductEntity;
import org.gcu.milestone.data.repository.product.*;
import org.gcu.milestone.data.service.product.*;
import org.gcu.milestone.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsBusinessService
{
    @Autowired
    private final ProductDataService productDataService;

    @Autowired
    private final BrandDataService brandDataService;

    @Autowired
    private final CategoryDataService categoryDataService;

    @Autowired
    private final ColorDataService colorDataService;

    @Autowired
    private final SizeDataService sizeDataService;

    public ProductsBusinessService(ProductDataService productDataService, BrandDataService brandDataService, CategoryDataService categoryDataService, ColorDataService colorDataService, SizeDataService sizeDataService)
    {
        this.productDataService = productDataService;
        this.brandDataService = brandDataService;
        this.categoryDataService = categoryDataService;
        this.colorDataService = colorDataService;
        this.sizeDataService = sizeDataService;
    }

    public List<ProductModel> getAllProducts()
    {
        var products = productDataService.findAll();

        for(ProductEntity product : products)
        {

        }
    }
}

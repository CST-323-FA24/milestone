package org.gcu.milestone.business;

import org.gcu.milestone.data.entity.product.ProductEntity;
import org.gcu.milestone.data.repository.product.*;
import org.gcu.milestone.data.service.product.*;
import org.gcu.milestone.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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
}
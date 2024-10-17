package org.gcu.milestone.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.business.ProductsBusinessService;
import org.gcu.milestone.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class UsersRestController
{
    @Autowired
    ProductsBusinessService productsBusinessService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getProducts()
    {
        try
        {
            List<ProductModel> products = productsBusinessService.getProducts();
            if (products.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            else
                return new ResponseEntity<>(products, HttpStatus.OK);
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

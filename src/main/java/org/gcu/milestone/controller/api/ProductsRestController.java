package org.gcu.milestone.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.business.ProductsBusinessService;
import org.gcu.milestone.model.product.ProductModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductsRestController
{
    final ProductsBusinessService productsBusinessService;

    public ProductsRestController(ProductsBusinessService productsBusinessService)
    {
        this.productsBusinessService = productsBusinessService;
    }

    @ResponseBody
    @GetMapping("/get")
    public ResponseEntity<?> getProduct(@RequestParam(name = "id") Long id)
    {
        var product = productsBusinessService.getProductById(id);

        try
        {
            if (product == null)
            {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            else
            {
                return new ResponseEntity<>(product, HttpStatus.OK);
            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @ResponseBody
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
        } catch (Exception e)
        {
            log.error(e.getMessage());
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

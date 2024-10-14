package org.gcu.milestone.data.service.product;

import lombok.extern.slf4j.Slf4j;
import org.gcu.milestone.data.entity.DataEntity;
import org.gcu.milestone.data.entity.product.ProductEntity;
import org.gcu.milestone.data.repository.product.ProductRepository;
import org.gcu.milestone.data.service.DataService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProductDataService extends DataService
{
    public ProductDataService(ProductRepository repository)
    {
        super(repository);
    }

    /**
     * Find all rows of a table
     * @return Table rows as a list
     */
    public List<ProductEntity> findAllProducts()
    {
        var resultSet = new ArrayList<ProductEntity>();

        // Attempt to read from table
        try
        {
            var resultIterable = repository.findAll();
            for (var result : resultIterable)
            {
                resultSet.add((ProductEntity) result);
            }
        }
        catch (Exception e) // Log failure
        {
            e.printStackTrace();
            log.error("{} (Returning empty list)", e.getMessage());
        }

        return resultSet;
    }
}
